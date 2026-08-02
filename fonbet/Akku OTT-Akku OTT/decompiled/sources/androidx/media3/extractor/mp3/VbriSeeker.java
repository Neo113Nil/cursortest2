package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.compose.runtime.snapshots.m;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes3.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataStartPosition = j2;
        this.dataEndPosition = j3;
        this.bitrate = i;
    }

    @Nullable
    public static VbriSeeker create(long j, long j2, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(6);
        long j3 = j2 + header.frameSize;
        long readInt = parsableByteArray.readInt() + j3;
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 <= 0) {
            return null;
        }
        long sampleCountToDurationUs = Util.sampleCountToDurationUs((readInt2 * header.samplesPerFrame) - 1, header.sampleRate);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int i = readUnsignedShort2;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i2 = 0;
        long j4 = j2 + header.frameSize;
        while (i2 < readUnsignedShort) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i2] = (i2 * sampleCountToDurationUs) / readUnsignedShort;
            jArr3[i2] = j4;
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
            int i3 = i2;
            int i4 = i;
            j4 += readUnsignedByte * i4;
            i = i4;
            i2 = i3 + 1;
            readUnsignedShort = readUnsignedShort;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j != -1 && j != readInt) {
            StringBuilder b = m.b(j, "VBRI data size mismatch: ", ", ");
            b.append(readInt);
            Log.w(TAG, b.toString());
        }
        if (readInt != j4) {
            StringBuilder b2 = m.b(readInt, "VBRI bytes and ToC mismatch (using max): ", ", ");
            b2.append(j4);
            b2.append("\nSeeking will be inaccurate.");
            Log.w(TAG, b2.toString());
            readInt = Math.max(readInt, j4);
        }
        return new VbriSeeker(jArr6, jArr5, sampleCountToDurationUs, j3, readInt, header.bitrate);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs >= j || binarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i], this.positions[i]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
