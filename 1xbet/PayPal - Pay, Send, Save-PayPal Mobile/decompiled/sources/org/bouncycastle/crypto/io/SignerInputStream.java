package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class SignerInputStream extends java.io.FilterInputStream {
    protected org.bouncycastle.crypto.Signer signer;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            this.signer.update(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.signer.update((byte) read);
        }
        return read;
    }

    public org.bouncycastle.crypto.Signer getSigner() {
        return this.signer;
    }

    public SignerInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.Signer signer) {
        super(inputStream);
        this.signer = signer;
    }
}
