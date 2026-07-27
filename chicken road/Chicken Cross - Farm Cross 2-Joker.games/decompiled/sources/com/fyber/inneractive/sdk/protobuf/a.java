package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f5832a;

    public a(InputStream inputStream, int i) {
        super(inputStream);
        this.f5832a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f5832a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f5832a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f5832a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(Math.min(j, this.f5832a));
        if (skip >= 0) {
            this.f5832a = (int) (this.f5832a - skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f5832a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f5832a -= read;
        }
        return read;
    }
}
