package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcfk implements com.google.android.libraries.places.internal.zzcfv {
    private final java.io.InputStream zza;
    private final com.google.android.libraries.places.internal.zzcfx zzb;

    @Override // com.google.android.libraries.places.internal.zzcfv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    public final java.lang.String toString() {
        java.io.InputStream inputStream = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(inputStream).length() + 8);
        sb.append("source(");
        sb.append(inputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcfv
    public final long zza(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        try {
            this.zzb.zzb();
            com.google.android.libraries.places.internal.zzcfq zzE = zzcffVar.zzE(1);
            int read = this.zza.read(zzE.zza, zzE.zzc, (int) java.lang.Math.min(j, 8192 - zzE.zzc));
            if (read != -1) {
                zzE.zzc += read;
                long j2 = read;
                zzcffVar.zzd(zzcffVar.zzb() + j2);
                return j2;
            }
            if (zzE.zzb != zzE.zzc) {
                return -1L;
            }
            zzcffVar.zza = zzE.zzb();
            com.google.android.libraries.places.internal.zzcfr.zzb(zzE);
            return -1L;
        } catch (java.lang.AssertionError e) {
            if (com.google.android.libraries.places.internal.zzcfm.zza(e)) {
                throw new java.io.IOException(e);
            }
            throw e;
        }
    }

    public zzcfk(java.io.InputStream inputStream, com.google.android.libraries.places.internal.zzcfx zzcfxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfxVar, "");
        this.zza = inputStream;
        this.zzb = zzcfxVar;
    }
}
