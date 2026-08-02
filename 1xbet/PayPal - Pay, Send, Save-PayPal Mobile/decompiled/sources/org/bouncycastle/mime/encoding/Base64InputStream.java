package org.bouncycastle.mime.encoding;

/* loaded from: classes17.dex */
public class Base64InputStream extends java.io.InputStream {
    private static final byte[] getHighSpeedVideoFpsRangesFor = new byte[128];
    java.io.InputStream Camera2StreamConfigurationMap;
    int[] getHighSpeedVideoSizes = new int[3];
    int getHighResolutionOutputSizeshNQ4ISI = 3;

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        int read;
        int read2;
        int read3;
        int read4;
        int i = 2;
        if (this.getHighResolutionOutputSizeshNQ4ISI > 2) {
            while (true) {
                read = this.Camera2StreamConfigurationMap.read();
                if (read != 9 && read != 10 && read != 13 && read != 32) {
                    break;
                }
            }
            if (read < 0) {
                return -1;
            }
            while (true) {
                read2 = this.Camera2StreamConfigurationMap.read();
                if (read2 != 9 && read2 != 32) {
                    break;
                }
            }
            while (true) {
                read3 = this.Camera2StreamConfigurationMap.read();
                if (read3 != 9 && read3 != 32) {
                    break;
                }
            }
            while (true) {
                read4 = this.Camera2StreamConfigurationMap.read();
                if (read4 != 9 && read4 != 32) {
                    break;
                }
            }
            int[] iArr = this.getHighSpeedVideoSizes;
            if (read4 < 0) {
                throw new java.io.EOFException("unexpected end of file in armored stream.");
            }
            if (read3 == 61) {
                byte[] bArr = getHighSpeedVideoFpsRangesFor;
                iArr[2] = (((bArr[read] & 255) << 2) | ((bArr[read2] & 255) >> 4)) & 255;
            } else if (read4 == 61) {
                byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
                byte b = bArr2[read];
                byte b2 = bArr2[read2];
                byte b3 = bArr2[read3];
                iArr[1] = ((b << 2) | (b2 >> 4)) & 255;
                iArr[2] = ((b2 << 4) | (b3 >> 2)) & 255;
                i = 1;
            } else {
                byte[] bArr3 = getHighSpeedVideoFpsRangesFor;
                byte b4 = bArr3[read];
                byte b5 = bArr3[read2];
                byte b6 = bArr3[read3];
                byte b7 = bArr3[read4];
                iArr[0] = ((b4 << 2) | (b5 >> 4)) & 255;
                iArr[1] = ((b5 << 4) | (b6 >> 2)) & 255;
                iArr[2] = ((b6 << 6) | b7) & 255;
                i = 0;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        int[] iArr2 = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        return iArr2[i2];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.Camera2StreamConfigurationMap.close();
    }

    public Base64InputStream(java.io.InputStream inputStream) {
        this.Camera2StreamConfigurationMap = inputStream;
    }

    static {
        for (int i = 65; i <= 90; i++) {
            getHighSpeedVideoFpsRangesFor[i] = (byte) (i - 65);
        }
        for (int i2 = 97; i2 <= 122; i2++) {
            getHighSpeedVideoFpsRangesFor[i2] = (byte) (i2 - 71);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            getHighSpeedVideoFpsRangesFor[i3] = (byte) (i3 + 4);
        }
        byte[] bArr = getHighSpeedVideoFpsRangesFor;
        bArr[43] = 62;
        bArr[47] = 63;
    }
}
