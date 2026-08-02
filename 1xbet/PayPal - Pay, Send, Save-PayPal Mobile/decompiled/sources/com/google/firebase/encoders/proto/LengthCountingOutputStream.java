package com.google.firebase.encoders.proto;

/* loaded from: classes4.dex */
final class LengthCountingOutputStream extends java.io.OutputStream {
    private long length = 0;

    LengthCountingOutputStream() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.length += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.length += i2;
    }

    final long getLength() {
        return this.length;
    }
}
