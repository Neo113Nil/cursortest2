package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
class zzcaw implements com.google.android.libraries.places.internal.zzccy {
    private final com.google.android.libraries.places.internal.zzccy zza;

    public zzcaw(com.google.android.libraries.places.internal.zzccy zzccyVar) {
        this.zza = (com.google.android.libraries.places.internal.zzccy) com.google.common.base.Preconditions.checkNotNull(zzccyVar, "delegate");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public void zza(com.google.android.libraries.places.internal.zzcdk zzcdkVar) throws java.io.IOException {
        this.zza.zza(zzcdkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public void zzb(int i, com.google.android.libraries.places.internal.zzccv zzccvVar) throws java.io.IOException {
        this.zza.zzb(i, zzccvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public void zzc(boolean z, int i, int i2) throws java.io.IOException {
        this.zza.zzc(z, i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zze() throws java.io.IOException {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzf(boolean z, boolean z2, int i, int i2, java.util.List list) throws java.io.IOException {
        this.zza.zzf(false, false, i, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzh(boolean z, int i, com.google.android.libraries.places.internal.zzcff zzcffVar, int i2) throws java.io.IOException {
        this.zza.zzh(z, i, zzcffVar, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzi(com.google.android.libraries.places.internal.zzcdk zzcdkVar) throws java.io.IOException {
        this.zza.zzi(zzcdkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzj(int i, com.google.android.libraries.places.internal.zzccv zzccvVar, byte[] bArr) throws java.io.IOException {
        this.zza.zzj(0, zzccvVar, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzccy
    public final void zzk(int i, long j) throws java.io.IOException {
        this.zza.zzk(i, j);
    }
}
