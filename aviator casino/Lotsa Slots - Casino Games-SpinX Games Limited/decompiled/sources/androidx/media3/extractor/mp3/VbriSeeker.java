package androidx.media3.extractor.mp3;

/* loaded from: classes2.dex */
final class VbriSeeker implements androidx.media3.extractor.mp3.Seeker {
    private static final java.lang.String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public static androidx.media3.extractor.mp3.VbriSeeker create(long j, long j2, androidx.media3.extractor.MpegAudioUtil.Header header, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i = header.sampleRate;
        long scaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(readInt, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j3 = j2 + header.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i2 = 0;
        long j4 = j2;
        while (i2 < readUnsignedShort) {
            int i3 = readUnsignedShort2;
            long j5 = j3;
            jArr[i2] = (i2 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i2] = java.lang.Math.max(j4, j5);
            if (readUnsignedShort3 == 1) {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            } else if (readUnsignedShort3 == 2) {
                readUnsignedByte = parsableByteArray.readUnsignedShort();
            } else if (readUnsignedShort3 == 3) {
                readUnsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (readUnsignedShort3 != 4) {
                    return null;
                }
                readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j4 += readUnsignedByte * i3;
            i2++;
            readUnsignedShort = readUnsignedShort;
            readUnsignedShort2 = i3;
            j3 = j5;
        }
        if (j != -1 && j != j4) {
            androidx.media3.common.util.Log.w(TAG, "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new androidx.media3.extractor.mp3.VbriSeeker(jArr, jArr2, scaleLargeTimestamp, j4, header.bitrate);
    }

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataEndPosition = j2;
        this.bitrate = i;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs >= j || binarySearchFloor == this.timesUs.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs[i], this.positions[i]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[androidx.media3.common.util.Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }
}
