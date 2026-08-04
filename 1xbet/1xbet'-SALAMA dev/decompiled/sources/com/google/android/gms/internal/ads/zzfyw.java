package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class zzfyw extends FilterInputStream {
    private long zza;
    private long zzb;

    public zzfyw(InputStream inputStream, long j) {
        super(inputStream);
        this.zzb = -1L;
        inputStream.getClass();
        zzfth.zzf(j >= 0, "limit must be non-negative");
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
        ((FilterInputStream) this).in.mark(i7);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.zza--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.zzb == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.zza = this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.zza));
        this.zza -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) throws IOException {
        long j = this.zza;
        if (j == 0) {
            return -1;
        }
        int i9 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j));
        if (i9 != -1) {
            this.zza -= (long) i9;
        }
        return i9;
    }
}
