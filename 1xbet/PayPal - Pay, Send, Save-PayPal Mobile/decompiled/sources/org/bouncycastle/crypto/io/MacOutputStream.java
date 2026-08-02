package org.bouncycastle.crypto.io;

/* loaded from: classes17.dex */
public class MacOutputStream extends java.io.OutputStream {
    protected org.bouncycastle.crypto.Mac mac;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.mac.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.mac.update((byte) i);
    }

    public byte[] getMac() {
        byte[] bArr = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr, 0);
        return bArr;
    }

    public MacOutputStream(org.bouncycastle.crypto.Mac mac) {
        this.mac = mac;
    }
}
