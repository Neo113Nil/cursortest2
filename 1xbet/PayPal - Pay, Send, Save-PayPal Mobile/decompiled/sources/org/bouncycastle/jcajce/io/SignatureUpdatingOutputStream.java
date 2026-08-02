package org.bouncycastle.jcajce.io;

/* loaded from: classes17.dex */
class SignatureUpdatingOutputStream extends java.io.OutputStream {
    private java.security.Signature getHighSpeedVideoSizes;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            this.getHighSpeedVideoSizes.update(bArr, i, i2);
        } catch (java.security.SignatureException e) {
            throw new java.io.IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        try {
            this.getHighSpeedVideoSizes.update(bArr);
        } catch (java.security.SignatureException e) {
            throw new java.io.IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        try {
            this.getHighSpeedVideoSizes.update((byte) i);
        } catch (java.security.SignatureException e) {
            throw new java.io.IOException(e.getMessage());
        }
    }

    SignatureUpdatingOutputStream(java.security.Signature signature) {
        this.getHighSpeedVideoSizes = signature;
    }
}
