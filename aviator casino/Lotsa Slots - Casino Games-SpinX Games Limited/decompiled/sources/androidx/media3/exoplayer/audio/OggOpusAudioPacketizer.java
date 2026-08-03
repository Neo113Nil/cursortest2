package androidx.media3.exoplayer.audio;

/* loaded from: classes2.dex */
public final class OggOpusAudioPacketizer {
    private static final int CHECKSUM_INDEX = 22;
    private static final int FIRST_AUDIO_SAMPLE_PAGE_SEQUENCE_NUMBER = 2;
    private static final int OGG_PACKET_HEADER_LENGTH = 28;
    private static final int SERIAL_NUMBER = 0;
    private static final byte[] OGG_DEFAULT_ID_HEADER_PAGE = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.google.common.base.Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] OGG_DEFAULT_COMMENT_HEADER_PAGE = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, com.google.common.base.Ascii.VT, -103, 87, 83, 1, com.google.common.base.Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private java.nio.ByteBuffer outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
    private int granulePosition = 0;
    private int pageSequenceNumber = 2;

    public void packetize(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, java.util.List<byte[]> list) {
        androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data);
        if (decoderInputBuffer.data.limit() - decoderInputBuffer.data.position() == 0) {
            return;
        }
        this.outputBuffer = packetizeInternal(decoderInputBuffer.data, (this.pageSequenceNumber == 2 && (list.size() == 1 || list.size() == 3)) ? list.get(0) : null);
        decoderInputBuffer.clear();
        decoderInputBuffer.ensureSpaceForWrite(this.outputBuffer.remaining());
        decoderInputBuffer.data.put(this.outputBuffer);
        decoderInputBuffer.flip();
    }

    public void reset() {
        this.outputBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
        this.granulePosition = 0;
        this.pageSequenceNumber = 2;
    }

    private java.nio.ByteBuffer packetizeInternal(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        int i;
        int length;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = (i2 + 255) / 255;
        int i4 = i3 + 27 + i2;
        if (this.pageSequenceNumber == 2) {
            if (bArr != null) {
                length = bArr.length + 28;
            } else {
                length = OGG_DEFAULT_ID_HEADER_PAGE.length;
            }
            i4 += OGG_DEFAULT_COMMENT_HEADER_PAGE.length + length;
            i = length;
        } else {
            i = 0;
        }
        java.nio.ByteBuffer replaceOutputBuffer = replaceOutputBuffer(i4);
        if (this.pageSequenceNumber == 2) {
            if (bArr != null) {
                writeOggIdHeaderPage(replaceOutputBuffer, bArr);
            } else {
                replaceOutputBuffer.put(OGG_DEFAULT_ID_HEADER_PAGE);
            }
            replaceOutputBuffer.put(OGG_DEFAULT_COMMENT_HEADER_PAGE);
        }
        int parsePacketAudioSampleCount = this.granulePosition + androidx.media3.extractor.OpusUtil.parsePacketAudioSampleCount(byteBuffer);
        this.granulePosition = parsePacketAudioSampleCount;
        writeOggPacketHeader(replaceOutputBuffer, parsePacketAudioSampleCount, this.pageSequenceNumber, i3, false);
        for (int i5 = 0; i5 < i3; i5++) {
            if (i2 >= 255) {
                replaceOutputBuffer.put((byte) -1);
                i2 -= 255;
            } else {
                replaceOutputBuffer.put((byte) i2);
                i2 = 0;
            }
        }
        while (position < limit) {
            replaceOutputBuffer.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
        if (this.pageSequenceNumber == 2) {
            byte[] array = replaceOutputBuffer.array();
            int arrayOffset = replaceOutputBuffer.arrayOffset() + i;
            byte[] bArr2 = OGG_DEFAULT_COMMENT_HEADER_PAGE;
            replaceOutputBuffer.putInt(i + bArr2.length + 22, androidx.media3.common.util.Util.crc32(array, arrayOffset + bArr2.length, replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        } else {
            replaceOutputBuffer.putInt(22, androidx.media3.common.util.Util.crc32(replaceOutputBuffer.array(), replaceOutputBuffer.arrayOffset(), replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        }
        this.pageSequenceNumber++;
        return replaceOutputBuffer;
    }

    private void writeOggIdHeaderPage(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        writeOggPacketHeader(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(com.google.common.primitives.UnsignedBytes.checkedCast(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, androidx.media3.common.util.Util.crc32(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void writeOggPacketHeader(java.nio.ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.common.primitives.UnsignedBytes.checkedCast(i2));
    }

    private java.nio.ByteBuffer replaceOutputBuffer(int i) {
        if (this.outputBuffer.capacity() < i) {
            this.outputBuffer = java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        } else {
            this.outputBuffer.clear();
        }
        return this.outputBuffer;
    }
}
