package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbwg extends java.io.FilterInputStream {
    private final int zza;
    private final com.google.android.libraries.places.internal.zzcaa zzb;
    private long zzc;
    private long zzd;
    private long zze;

    zzbwg(java.io.InputStream inputStream, int i, com.google.android.libraries.places.internal.zzcaa zzcaaVar) {
        super(inputStream);
        this.zze = -1L;
        this.zza = i;
        this.zzb = zzcaaVar;
    }

    private final void zza() {
        long j = this.zzd;
        long j2 = this.zzc;
        if (j > j2) {
            this.zzb.zzl(j - j2);
            this.zzc = this.zzd;
        }
    }

    private final void zzb() {
        long j = this.zzd;
        int i = this.zza;
        if (j <= i) {
            return;
        }
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = com.google.android.libraries.places.internal.zzbnp.zzf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 47);
        sb.append("Decompressed gRPC message exceeds maximum size ");
        sb.append(i);
        throw new com.google.android.libraries.places.internal.zzbns(zzbnpVar.zze(sb.toString()), null);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
            this.in.mark(i);
            this.zze = this.zzd;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int read = this.in.read();
        if (read != -1) {
            this.zzd++;
        }
        zzb();
        zza();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        synchronized (this) {
            if (!this.in.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            }
            if (this.zze == -1) {
                throw new java.io.IOException("Mark not set");
            }
            this.in.reset();
            this.zzd = this.zze;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long skip = this.in.skip(j);
        this.zzd += skip;
        zzb();
        zza();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.zzd += read;
        }
        zzb();
        zza();
        return read;
    }
}
