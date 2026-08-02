package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ParametersWithSalt implements org.bouncycastle.crypto.CipherParameters {
    private byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.CipherParameters getHighResolutionOutputSizeshNQ4ISI;

    public byte[] getSalt() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.crypto.CipherParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ParametersWithSalt(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.Camera2StreamConfigurationMap = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = cipherParameters;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public ParametersWithSalt(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }
}
