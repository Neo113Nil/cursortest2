package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
public final class MacOutputStream extends java.io.OutputStream {
    private javax.crypto.Mac getHighSpeedVideoSizes;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoSizes.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.getHighSpeedVideoSizes.update((byte) i);
    }

    public final byte[] getMac() {
        return this.getHighSpeedVideoSizes.doFinal();
    }

    public MacOutputStream(javax.crypto.Mac mac) {
        this.getHighSpeedVideoSizes = mac;
    }
}
