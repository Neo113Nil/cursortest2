package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class DigestInputStream extends java.io.FilterInputStream {
    protected org.bouncycastle.crypto.Digest digest;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            this.digest.update(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.digest.update((byte) read);
        }
        return read;
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.digest;
    }

    public DigestInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.Digest digest) {
        super(inputStream);
        this.digest = digest;
    }
}
