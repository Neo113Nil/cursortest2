package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
final class zzapv extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzapv(InputStream inputStream, long j) {
        super(inputStream);
        this.zza = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = super.read(bArr, i7, i8);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
