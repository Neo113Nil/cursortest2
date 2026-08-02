package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcav implements com.google.android.libraries.places.internal.zzccy {
    private static final java.util.logging.Logger zza = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcbp.class.getName());
    private final com.google.android.libraries.places.internal.zzcau zzb;
    private final com.google.android.libraries.places.internal.zzccy zzc;
    private final com.google.android.libraries.places.internal.zzcbs zzd = new com.google.android.libraries.places.internal.zzcbs(java.util.logging.Level.FINE, com.google.android.libraries.places.internal.zzcbp.class);

    zzcav(com.google.android.libraries.places.internal.zzcau zzcauVar, com.google.android.libraries.places.internal.zzccy zzccyVar) {
        this.zzb = (com.google.android.libraries.places.internal.zzcau) com.google.common.base.Preconditions.checkNotNull(zzcauVar, "transportExceptionHandler");
        this.zzc = (com.google.android.libraries.places.internal.zzccy) com.google.common.base.Preconditions.checkNotNull(zzccyVar, "frameWriter");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (java.io.IOException e) {
            zza.logp(e.getClass().equals(java.io.IOException.class) ? java.util.logging.Level.FINE : java.util.logging.Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (java.lang.Throwable) e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zza(com.google.android.libraries.places.internal.zzcdk zzcdkVar) {
        this.zzd.zzd(2);
        try {
            this.zzc.zza(zzcdkVar);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzb(int i, com.google.android.libraries.places.internal.zzccv zzccvVar) {
        this.zzd.zzc(2, i, zzccvVar);
        try {
            this.zzc.zzb(i, zzccvVar);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzc(boolean z, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (z) {
            this.zzd.zzg(2, j);
        } else {
            this.zzd.zzf(2, j);
        }
        try {
            this.zzc.zzc(z, i, i2);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzd() {
        try {
            this.zzc.zzd();
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zze() {
        try {
            this.zzc.zze();
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzf(boolean z, boolean z2, int i, int i2, java.util.List list) {
        try {
            this.zzc.zzf(false, false, i, 0, list);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final int zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzh(boolean z, int i, com.google.android.libraries.places.internal.zzcff zzcffVar, int i2) {
        this.zzd.zza(2, i, zzcffVar, i2, z);
        try {
            this.zzc.zzh(z, i, zzcffVar, i2);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzi(com.google.android.libraries.places.internal.zzcdk zzcdkVar) {
        this.zzd.zze(2, zzcdkVar);
        try {
            this.zzc.zzi(zzcdkVar);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzj(int i, com.google.android.libraries.places.internal.zzccv zzccvVar, byte[] bArr) {
        this.zzd.zzi(2, 0, zzccvVar, com.google.android.libraries.places.internal.zzcfi.zzb(bArr));
        try {
            com.google.android.libraries.places.internal.zzccy zzccyVar = this.zzc;
            zzccyVar.zzj(0, zzccvVar, bArr);
            zzccyVar.zze();
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzk(int i, long j) {
        this.zzd.zzj(2, i, j);
        try {
            this.zzc.zzk(i, j);
        } catch (java.io.IOException e) {
            this.zzb.zzg(e);
        }
    }
}
