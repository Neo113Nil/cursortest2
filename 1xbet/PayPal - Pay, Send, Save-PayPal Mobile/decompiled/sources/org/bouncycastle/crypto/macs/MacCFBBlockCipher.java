package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
class MacCFBBlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    org.bouncycastle.crypto.BlockCipher getHighResolutionOutputSizeshNQ4ISI;
    byte[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;

    public final int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.processBlock(this.getHighSpeedVideoSizes, 0, this.Camera2StreamConfigurationMap, 0);
        int i3 = 0;
        while (true) {
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            if (i3 >= i4) {
                byte[] bArr3 = this.getHighSpeedVideoSizes;
                java.lang.System.arraycopy(bArr3, i4, bArr3, 0, bArr3.length - i4);
                byte[] bArr4 = this.getHighSpeedVideoSizes;
                int length = bArr4.length;
                int i5 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.System.arraycopy(bArr2, 0, bArr4, length - i5, i5);
                return this.getHighSpeedVideoFpsRangesFor;
            }
            bArr2[i3] = (byte) (this.Camera2StreamConfigurationMap[i3] ^ bArr[i + i3]);
            i3++;
        }
    }

    public MacCFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = blockCipher;
        this.getHighSpeedVideoFpsRangesFor = i / 8;
        this.getHighSpeedVideoFpsRanges = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoSizes = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
    }
}
