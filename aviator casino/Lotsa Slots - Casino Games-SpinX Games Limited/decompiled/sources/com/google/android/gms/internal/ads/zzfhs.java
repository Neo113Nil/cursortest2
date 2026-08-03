package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfhs {
    private final com.google.android.gms.internal.ads.zzfmn zza;
    private final com.google.android.gms.internal.ads.zzdbz zzb;
    private final java.util.concurrent.Executor zzc;
    private com.google.android.gms.internal.ads.zzfhq zzd;

    public zzfhs(com.google.android.gms.internal.ads.zzfmn zzfmnVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar, java.util.concurrent.Executor executor) {
        this.zza = zzfmnVar;
        this.zzb = zzdbzVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @java.lang.Deprecated
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfmx zzb() {
        com.google.android.gms.internal.ads.zzfky zzb = this.zzb.zzb();
        return this.zza.zzd(zzb.zzd, zzb.zzg, zzb.zzk);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        com.google.android.gms.internal.ads.zzfhq zzfhqVar = this.zzd;
        if (zzfhqVar != null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zzfhqVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkx.zza.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbo zzw = com.google.android.gms.internal.ads.zzhbo.zzw(this.zzb.zza().zze(this.zza.zze()));
            com.google.android.gms.internal.ads.zzfhp zzfhpVar = new com.google.android.gms.internal.ads.zzfhp(this);
            java.util.concurrent.Executor executor = this.zzc;
            listenableFuture = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(zzw, zzfhpVar, executor), com.google.android.gms.internal.ads.zzegr.class, new com.google.android.gms.internal.ads.zzfho(this), executor);
        } else {
            com.google.android.gms.internal.ads.zzfhq zzfhqVar2 = new com.google.android.gms.internal.ads.zzfhq(null, zzb(), null);
            this.zzd = zzfhqVar2;
            listenableFuture = com.google.android.gms.internal.ads.zzhbw.zza(zzfhqVar2);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzk(listenableFuture, com.google.android.gms.internal.ads.zzfhr.zza, this.zzc);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfhq zzc() {
        return this.zzd;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzfhq zzfhqVar) {
        this.zzd = zzfhqVar;
    }
}
