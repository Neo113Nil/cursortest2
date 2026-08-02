package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class KeyParameter implements org.bouncycastle.crypto.CipherParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    public byte[] getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public KeyParameter(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
