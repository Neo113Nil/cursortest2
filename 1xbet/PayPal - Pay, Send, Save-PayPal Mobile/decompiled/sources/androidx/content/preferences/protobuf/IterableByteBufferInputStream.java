package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
class IterableByteBufferInputStream extends java.io.InputStream {
    private long Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.nio.ByteBuffer getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats = 0;
    private boolean getInputSizeshNQ4ISI;
    private java.util.Iterator<java.nio.ByteBuffer> getOutputFormats;

    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> iterable) {
        this.getOutputFormats = iterable.iterator();
        for (java.nio.ByteBuffer byteBuffer : iterable) {
            this.getInputFormats++;
        }
        this.getHighSpeedVideoSizesFor = -1;
        if (getHighSpeedVideoFpsRangesFor()) {
            return;
        }
        this.getHighSpeedVideoSizes = androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        this.Camera2StreamConfigurationMap = 0L;
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoSizesFor++;
        if (!this.getOutputFormats.hasNext()) {
            return false;
        }
        java.nio.ByteBuffer next = this.getOutputFormats.next();
        this.getHighSpeedVideoSizes = next;
        this.getHighSpeedVideoFpsRanges = next.position();
        if (this.getHighSpeedVideoSizes.hasArray()) {
            this.getInputSizeshNQ4ISI = true;
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.array();
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.arrayOffset();
        } else {
            this.getInputSizeshNQ4ISI = false;
            this.Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.getHighSpeedVideoSizesFor == this.getInputFormats) {
            return -1;
        }
        if (this.getInputSizeshNQ4ISI) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoFpsRanges;
            byte b = bArr[this.getHighSpeedVideoFpsRangesFor + i];
            int i2 = i + 1;
            this.getHighSpeedVideoFpsRanges = i2;
            if (i2 == this.getHighSpeedVideoSizes.limit()) {
                getHighSpeedVideoFpsRangesFor();
            }
            return b & 255;
        }
        byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges + this.Camera2StreamConfigurationMap);
        int i3 = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i3;
        if (i3 == this.getHighSpeedVideoSizes.limit()) {
            getHighSpeedVideoFpsRangesFor();
        }
        return highSpeedVideoFpsRangesFor & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.getHighSpeedVideoSizesFor == this.getInputFormats) {
            return -1;
        }
        int limit = this.getHighSpeedVideoSizes.limit();
        int i3 = this.getHighSpeedVideoFpsRanges;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.getInputSizeshNQ4ISI) {
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i3 + this.getHighSpeedVideoFpsRangesFor, bArr, i, i2);
            int i5 = this.getHighSpeedVideoFpsRanges + i2;
            this.getHighSpeedVideoFpsRanges = i5;
            if (i5 == this.getHighSpeedVideoSizes.limit()) {
                getHighSpeedVideoFpsRangesFor();
            }
            return i2;
        }
        int position = this.getHighSpeedVideoSizes.position();
        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes.get(bArr, i, i2);
        androidx.content.preferences.protobuf.Java8Compatibility.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, position);
        int i6 = this.getHighSpeedVideoFpsRanges + i2;
        this.getHighSpeedVideoFpsRanges = i6;
        if (i6 == this.getHighSpeedVideoSizes.limit()) {
            getHighSpeedVideoFpsRangesFor();
        }
        return i2;
    }
}
