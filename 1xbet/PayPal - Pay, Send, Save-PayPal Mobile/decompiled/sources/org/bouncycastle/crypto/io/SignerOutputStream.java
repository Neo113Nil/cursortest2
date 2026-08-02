package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class SignerOutputStream extends java.io.OutputStream {
    protected org.bouncycastle.crypto.Signer signer;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.signer.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.signer.update((byte) i);
    }

    public org.bouncycastle.crypto.Signer getSigner() {
        return this.signer;
    }

    public SignerOutputStream(org.bouncycastle.crypto.Signer signer) {
        this.signer = signer;
    }
}
