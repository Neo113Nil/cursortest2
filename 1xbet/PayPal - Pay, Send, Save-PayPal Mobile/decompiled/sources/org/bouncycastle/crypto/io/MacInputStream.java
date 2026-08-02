package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class MacInputStream extends java.io.FilterInputStream {
    protected org.bouncycastle.crypto.Mac mac;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            this.mac.update(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = this.in.read();
        if (read >= 0) {
            this.mac.update((byte) read);
        }
        return read;
    }

    public org.bouncycastle.crypto.Mac getMac() {
        return this.mac;
    }

    public MacInputStream(java.io.InputStream inputStream, org.bouncycastle.crypto.Mac mac) {
        super(inputStream);
        this.mac = mac;
    }
}
