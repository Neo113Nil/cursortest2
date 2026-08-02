package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
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
    public final int read() {
        if (this.zza == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zza--;
        }
        return read;
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
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.zza));
        this.zza -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        long j = this.zza;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j));
        if (read != -1) {
            this.zza -= read;
        }
        return read;
    }
}
