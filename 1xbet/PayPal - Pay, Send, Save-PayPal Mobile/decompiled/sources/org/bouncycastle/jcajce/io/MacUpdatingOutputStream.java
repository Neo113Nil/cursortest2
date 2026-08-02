package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
class MacUpdatingOutputStream extends java.io.OutputStream {
    private javax.crypto.Mac Camera2StreamConfigurationMap;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.Camera2StreamConfigurationMap.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.Camera2StreamConfigurationMap.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.Camera2StreamConfigurationMap.update((byte) i);
    }

    MacUpdatingOutputStream(javax.crypto.Mac mac) {
        this.Camera2StreamConfigurationMap = mac;
    }
}
