package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxp extends java.io.InputStream implements com.google.android.libraries.places.internal.zzbla {
    private final com.google.android.libraries.places.internal.zzbxo zza;

    public zzbxp(com.google.android.libraries.places.internal.zzbxo zzbxoVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbxo) com.google.common.base.Preconditions.checkNotNull(zzbxoVar, "buffer");
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zza();
    }

    @Override // java.io.InputStream
    public final int read() {
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = this.zza;
        if (zzbxoVar.zzf() == 0) {
            return -1;
        }
        return zzbxoVar.zzg();
    }

    @Override // java.io.InputStream
    public final void reset() throws java.io.IOException {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = this.zza;
        int min = (int) java.lang.Math.min(zzbxoVar.zzf(), j);
        zzbxoVar.zzh(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.libraries.places.internal.zzbxo zzbxoVar = this.zza;
        if (zzbxoVar.zzf() == 0) {
            return -1;
        }
        int min = java.lang.Math.min(zzbxoVar.zzf(), i2);
        zzbxoVar.zzi(bArr, i, min);
        return min;
    }
}
