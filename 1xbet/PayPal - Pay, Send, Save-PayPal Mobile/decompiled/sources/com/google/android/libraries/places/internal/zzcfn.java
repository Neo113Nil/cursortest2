package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcfn implements com.google.android.libraries.places.internal.zzcft {
    private final java.io.OutputStream zza;
    private final com.google.android.libraries.places.internal.zzcfx zzb;

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzcft, java.io.Flushable
    public final void flush() {
        this.zza.flush();
    }

    public final java.lang.String toString() {
        java.io.OutputStream outputStream = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(outputStream).length() + 6);
        sb.append("sink(");
        sb.append(outputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcft
    public final void zzc(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        com.google.android.libraries.places.internal.zzcfb.zza(zzcffVar.zzb(), 0L, j);
        while (j > 0) {
            this.zzb.zzb();
            com.google.android.libraries.places.internal.zzcfq zzcfqVar = zzcffVar.zza;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            int min = (int) java.lang.Math.min(j, zzcfqVar.zzc - zzcfqVar.zzb);
            this.zza.write(zzcfqVar.zza, zzcfqVar.zzb, min);
            zzcfqVar.zzb += min;
            long j2 = min;
            zzcffVar.zzd(zzcffVar.zzb() - j2);
            j -= j2;
            if (zzcfqVar.zzb == zzcfqVar.zzc) {
                zzcffVar.zza = zzcfqVar.zzb();
                com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
            }
        }
    }

    public zzcfn(java.io.OutputStream outputStream, com.google.android.libraries.places.internal.zzcfx zzcfxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfxVar, "");
        this.zza = outputStream;
        this.zzb = zzcfxVar;
    }
}
