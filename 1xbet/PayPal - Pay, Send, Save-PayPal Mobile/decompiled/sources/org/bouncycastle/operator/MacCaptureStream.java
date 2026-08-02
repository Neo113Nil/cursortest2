package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public class MacCaptureStream extends java.io.OutputStream {
    int Camera2StreamConfigurationMap = 0;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.io.OutputStream getHighSpeedVideoFpsRangesFor;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 < bArr2.length) {
            for (int i3 = 0; i3 != i2; i3++) {
                write(bArr[i + i3]);
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor.write(bArr2, 0, this.Camera2StreamConfigurationMap);
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = bArr3.length;
            java.lang.System.arraycopy(bArr, (i + i2) - bArr3.length, bArr3, 0, bArr3.length);
            this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2 - this.getHighResolutionOutputSizeshNQ4ISI.length);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        int i2 = this.Camera2StreamConfigurationMap;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != bArr.length) {
            this.Camera2StreamConfigurationMap = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        byte b = bArr[0];
        java.lang.System.arraycopy(bArr, 1, bArr, 0, bArr.length - 1);
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        bArr2[bArr2.length - 1] = (byte) i;
        this.getHighSpeedVideoFpsRangesFor.write(b);
    }

    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public MacCaptureStream(java.io.OutputStream outputStream, int i) {
        this.getHighSpeedVideoFpsRangesFor = outputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[i];
    }
}
