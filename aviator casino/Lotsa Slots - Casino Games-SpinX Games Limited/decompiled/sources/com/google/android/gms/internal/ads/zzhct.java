package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhct extends com.google.android.gms.internal.ads.zzhcd {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhcv zza;
    private final com.google.android.gms.internal.ads.zzhbd zzb;

    zzhct(com.google.android.gms.internal.ads.zzhcv zzhcvVar, com.google.android.gms.internal.ads.zzhbd zzhbdVar) {
        java.util.Objects.requireNonNull(zzhcvVar);
        this.zza = zzhcvVar;
        this.zzb = zzhbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final /* bridge */ /* synthetic */ java.lang.Object zza() throws java.lang.Exception {
        com.google.android.gms.internal.ads.zzhbd zzhbdVar = this.zzb;
        com.google.common.util.concurrent.ListenableFuture zza = zzhbdVar.zza();
        com.google.android.gms.internal.ads.zzgtj.zzl(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbdVar);
        return zza;
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
    final /* synthetic */ void zzf(java.lang.Object obj) {
        this.zza.zzk((com.google.common.util.concurrent.ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(java.lang.Throwable th) {
        this.zza.zzb(th);
    }
}
