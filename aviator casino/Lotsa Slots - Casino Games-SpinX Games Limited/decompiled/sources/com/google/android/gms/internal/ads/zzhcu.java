package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcu extends com.google.android.gms.internal.ads.zzhcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhcv zza;
    private final java.util.concurrent.Callable zzb;

    zzhcu(com.google.android.gms.internal.ads.zzhcv zzhcvVar, java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(zzhcvVar);
        this.zza = zzhcvVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final java.lang.Object zza() throws java.lang.Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final java.lang.String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzf(java.lang.Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(java.lang.Throwable th) {
        this.zza.zzb(th);
    }
}
