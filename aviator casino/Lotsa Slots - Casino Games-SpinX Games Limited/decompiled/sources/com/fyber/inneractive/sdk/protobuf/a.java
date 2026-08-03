package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class a extends java.io.FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f4175a;

    public a(java.io.InputStream inputStream, int i) {
        super(inputStream);
        this.f4175a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return java.lang.Math.min(super.available(), this.f4175a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f4175a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f4175a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(java.lang.Math.min(j, this.f4175a));
        if (skip >= 0) {
            this.f4175a = (int) (this.f4175a - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f4175a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, java.lang.Math.min(i2, i3));
        if (read >= 0) {
            this.f4175a -= read;
        }
        return read;
    }
}
