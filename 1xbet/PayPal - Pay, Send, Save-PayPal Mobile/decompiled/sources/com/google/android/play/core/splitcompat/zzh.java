package com.google.android.play.core.splitcompat;

/* loaded from: classes9.dex */
final class zzh implements com.google.android.play.core.splitcompat.zzk {
    final /* synthetic */ com.google.android.play.core.splitcompat.zzt zza;
    final /* synthetic */ java.util.Set zzb;
    final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzc;
    final /* synthetic */ com.google.android.play.core.splitcompat.zzn zzd;

    @Override // com.google.android.play.core.splitcompat.zzk
    public final void zza(java.util.zip.ZipFile zipFile, java.util.Set set) throws java.io.IOException {
        this.zzd.zzf(this.zza, set, new com.google.android.play.core.splitcompat.zzg(this));
    }

    zzh(com.google.android.play.core.splitcompat.zzn zznVar, com.google.android.play.core.splitcompat.zzt zztVar, java.util.Set set, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.zzd = zznVar;
        this.zza = zztVar;
        this.zzb = set;
        this.zzc = atomicBoolean;
    }
}
