package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhj implements com.google.android.gms.internal.ads.zzfhw {
    private final com.google.android.gms.internal.ads.zzfmn zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzhbt zzc = new com.google.android.gms.internal.ads.zzfhg(this);

    public zzfhj(com.google.android.gms.internal.ads.zzfmn zzfmnVar, java.util.concurrent.Executor executor) {
        this.zza = zzfmnVar;
        this.zzb = executor;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, final com.google.android.gms.internal.ads.zzdbz zzdbzVar) {
        com.google.android.gms.internal.ads.zzfmn zzfmnVar = this.zza;
        java.util.concurrent.Executor executor = this.zzb;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(new com.google.android.gms.internal.ads.zzfhs(zzfmnVar, zzdbzVar, executor).zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfhh
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzfhj.this.zzb(zzdbzVar, (com.google.android.gms.internal.ads.zzfhq) obj);
            }
        }, executor), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzfhf(this), executor);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzdbz zzdbzVar, com.google.android.gms.internal.ads.zzfhq zzfhqVar) {
        com.google.android.gms.internal.ads.zzfmn zzfmnVar = this.zza;
        com.google.android.gms.internal.ads.zzfmx zzfmxVar = zzfhqVar.zzb;
        com.google.android.gms.internal.ads.zzcbd zzcbdVar = zzfhqVar.zza;
        com.google.android.gms.internal.ads.zzfmw zza = zzfmnVar.zza(zzfmxVar);
        if (zza != null && zzcbdVar != null) {
            com.google.android.gms.internal.ads.zzhbw.zzr(zzdbzVar.zza().zzf(zzcbdVar), this.zzc, this.zzb);
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfhi(zzfmxVar, zzcbdVar, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, java.lang.Object obj) {
        return zza(zzfhxVar, zzfhvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ java.lang.Object zzd() {
        return null;
    }
}
