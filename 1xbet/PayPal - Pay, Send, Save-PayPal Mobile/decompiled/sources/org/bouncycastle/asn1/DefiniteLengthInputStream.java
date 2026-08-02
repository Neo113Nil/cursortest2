package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class DefiniteLengthInputStream extends org.bouncycastle.asn1.LimitedInputStream {
    private static final byte[] getHighSpeedVideoSizes = new byte[0];
    private final int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    final void Camera2StreamConfigurationMap(byte[] bArr) throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != bArr.length) {
            throw new java.lang.IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i3 >= i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupted stream - out of bounds length found: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" >= ");
            sb.append(i2);
            throw new java.io.IOException(sb.toString());
        }
        int readFully = i3 - org.bouncycastle.util.io.Streams.readFully(this.Camera2StreamConfigurationMap, bArr, 0, bArr.length);
        this.getHighSpeedVideoFpsRanges = readFully;
        if (readFully == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DEF length ");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(" object truncated by ");
        sb2.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.EOFException(sb2.toString());
    }

    final byte[] getHighSpeedVideoFpsRanges() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            return getHighSpeedVideoSizes;
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 >= i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("corrupted stream - out of bounds length found: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" >= ");
            sb.append(i);
            throw new java.io.IOException(sb.toString());
        }
        byte[] bArr = new byte[i2];
        int readFully = i2 - org.bouncycastle.util.io.Streams.readFully(this.Camera2StreamConfigurationMap, bArr, 0, i2);
        this.getHighSpeedVideoFpsRanges = readFully;
        if (readFully == 0) {
            getHighResolutionOutputSizeshNQ4ISI();
            return bArr;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DEF length ");
        sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb2.append(" object truncated by ");
        sb2.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.EOFException(sb2.toString());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.getHighSpeedVideoFpsRanges;
        if (i3 == 0) {
            return -1;
        }
        int read = this.Camera2StreamConfigurationMap.read(bArr, i, java.lang.Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.getHighSpeedVideoFpsRanges - read;
            this.getHighSpeedVideoFpsRanges = i4;
            if (i4 == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return read;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DEF length ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" object truncated by ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.EOFException(sb.toString());
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges == 0) {
            return -1;
        }
        int read = this.Camera2StreamConfigurationMap.read();
        if (read >= 0) {
            int i = this.getHighSpeedVideoFpsRanges - 1;
            this.getHighSpeedVideoFpsRanges = i;
            if (i == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return read;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DEF length ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" object truncated by ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        throw new java.io.EOFException(sb.toString());
    }

    DefiniteLengthInputStream(java.io.InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("negative lengths not allowed");
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
