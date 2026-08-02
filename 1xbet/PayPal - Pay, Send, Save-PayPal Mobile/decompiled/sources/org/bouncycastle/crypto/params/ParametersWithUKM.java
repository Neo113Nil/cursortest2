package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ParametersWithUKM implements org.bouncycastle.crypto.CipherParameters {
    private org.bouncycastle.crypto.CipherParameters getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;

    public byte[] getUKM() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.CipherParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ParametersWithUKM(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighSpeedVideoFpsRanges = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = cipherParameters;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public ParametersWithUKM(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }
}
