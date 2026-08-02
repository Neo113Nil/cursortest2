package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbv extends com.google.android.libraries.places.internal.zzboh {
    private final com.google.android.libraries.places.internal.zzcff zza;

    @Override // com.google.android.libraries.places.internal.zzboh, com.google.android.libraries.places.internal.zzbxo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.google.android.libraries.places.internal.zzcff zzcffVar = this.zza;
        zzcffVar.zzt(zzcffVar.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzg() {
        try {
            return this.zza.zzj() & 255;
        } catch (java.io.EOFException e) {
            throw new java.lang.IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzi(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int zzs = this.zza.zzs(bArr, i, i2);
            if (zzs == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 25);
                sb.append("EOF trying to read ");
                sb.append(i2);
                sb.append(" bytes");
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            i2 -= zzs;
            i += zzs;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzj(java.nio.ByteBuffer byteBuffer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzk(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        this.zza.zzh(outputStream, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final com.google.android.libraries.places.internal.zzbxo zzl(int i) {
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        zzcffVar.zzc(this.zza, i);
        return new com.google.android.libraries.places.internal.zzcbv(zzcffVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final void zzh(int i) {
        try {
            this.zza.zzt(i);
        } catch (java.io.EOFException e) {
            throw new java.lang.IndexOutOfBoundsException(e.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbxo
    public final int zzf() {
        return (int) this.zza.zzb();
    }

    zzcbv(com.google.android.libraries.places.internal.zzcff zzcffVar) {
        this.zza = zzcffVar;
    }
}
