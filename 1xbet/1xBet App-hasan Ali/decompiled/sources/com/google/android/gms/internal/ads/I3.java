package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class I3 extends FilterInputStream {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9521k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f9522l;

    /* renamed from: m, reason: collision with root package name */
    public long f9523m;

    public I3(BufferedInputStream bufferedInputStream, long j5) {
        super(bufferedInputStream);
        this.f9522l = j5;
    }

    private final synchronized void b(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9523m = this.f9522l;
    }

    private final synchronized void d() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f9523m == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f9522l = this.f9523m;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f9521k) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f9522l);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f9521k) {
            case 1:
                b(i);
                break;
            default:
                super.mark(i);
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f9521k) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f9523m++;
                }
                return read;
            default:
                if (this.f9522l == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f9522l--;
                }
                return read2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.f9521k) {
            case 1:
                d();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) {
        switch (this.f9521k) {
            case 1:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j5, this.f9522l));
                this.f9522l -= skip;
                return skip;
            default:
                return super.skip(j5);
        }
    }

    public I3(InputStream inputStream, long j5) {
        super(inputStream);
        this.f9523m = -1L;
        inputStream.getClass();
        AbstractC1400ot.Y("limit must be non-negative", j5 >= 0);
        this.f9522l = j5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i5) {
        switch (this.f9521k) {
            case 0:
                int read = super.read(bArr, i, i5);
                if (read != -1) {
                    this.f9523m += read;
                }
                return read;
            default:
                long j5 = this.f9522l;
                if (j5 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i5, j5));
                if (read2 != -1) {
                    this.f9522l -= read2;
                }
                return read2;
        }
    }
}
