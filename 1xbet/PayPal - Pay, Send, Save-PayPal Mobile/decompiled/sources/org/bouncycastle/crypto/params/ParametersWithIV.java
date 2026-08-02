package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ParametersWithIV implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.CipherParameters getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public org.bouncycastle.crypto.CipherParameters getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getIV() {
        return this.getHighSpeedVideoSizes;
    }

    public ParametersWithIV(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighSpeedVideoSizes = bArr2;
        this.getHighSpeedVideoFpsRangesFor = cipherParameters;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public ParametersWithIV(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }
}
