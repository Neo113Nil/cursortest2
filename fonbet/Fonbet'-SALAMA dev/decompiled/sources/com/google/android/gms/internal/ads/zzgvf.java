package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzgvf extends FilterInputStream {
    private int zza;

    public zzgvf(InputStream inputStream, int i7) {
        super(inputStream);
        this.zza = i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int skip = (int) super.skip(Math.min(j, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.zza;
        if (i9 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i7, Math.min(i8, i9));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
