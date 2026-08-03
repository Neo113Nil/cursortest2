package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzemd implements com.google.android.gms.internal.ads.zzels {
    private final com.google.android.gms.internal.ads.zzcuz zza;
    private final com.google.android.gms.internal.ads.zzdwi zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final com.google.android.gms.internal.ads.zzbpt zzf;
    private final boolean zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkn)).booleanValue();
    private final com.google.android.gms.internal.ads.zzekr zzh;
    private final com.google.android.gms.internal.ads.zzdzg zzi;
    private final com.google.android.gms.internal.ads.zzdzl zzj;

    public zzemd(com.google.android.gms.internal.ads.zzcuz zzcuzVar, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzcuzVar;
        this.zzd = executor;
        this.zzb = zzdwiVar;
        this.zzc = zzfkyVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbptVar;
        this.zzh = zzekrVar;
        this.zzi = zzdzgVar;
        this.zzj = zzdzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        return (zzfkkVar == null || zzfkkVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        final com.google.android.gms.internal.ads.zzdwm zzdwmVar = new com.google.android.gms.internal.ads.zzdwm();
        com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzemd.this.zzc(zzfkfVar, zzfkqVar, zzdwmVar, obj);
            }
        };
        java.util.concurrent.Executor executor = this.zzd;
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zza, zzhbeVar, executor);
        zzj.addListener(new java.lang.Runnable(zzdwmVar) { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzdwm zzdwmVar, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzemd zzemdVar;
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcQ;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzi.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdwi zzdwiVar = this.zzb;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzc;
        final com.google.android.gms.internal.ads.zzcku zza = zzdwiVar.zza(zzfkyVar.zzf, zzfkfVar, zzfkqVar.zzb.zzb);
        zza.zzaw(zzfkfVar.zzW);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzi.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.internal.ads.zzcuz zzcuzVar = this.zza;
        com.google.android.gms.internal.ads.zzcyj zzcyjVar = new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null);
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zzf;
        final com.google.android.gms.internal.ads.zzcuw zzf = zzcuzVar.zzf(zzcyjVar, new com.google.android.gms.internal.ads.zzdmd(new com.google.android.gms.internal.ads.zzemf(versionInfoParcel, zzcfwVar, zzfkfVar, zza, zzfkyVar, z, zzbptVar, this.zzh, this.zzj), zza), new com.google.android.gms.internal.ads.zzcux(zzfkfVar.zzaa));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            zzemdVar = this;
            zzemdVar.zzi.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } else {
            zzemdVar = this;
        }
        com.google.android.gms.internal.ads.zzdwh zzi = zzf.zzi();
        com.google.android.gms.internal.ads.zzbpt zzbptVar2 = true != z ? null : zzbptVar;
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = zzemdVar.zzi;
        zzi.zzi(zza, false, zzbptVar2, zzdzgVar);
        zzcfwVar.zzc(zzf);
        zzf.zzd().zzq(new com.google.android.gms.internal.ads.zzddl() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzddl
            public final /* synthetic */ void zzdr() {
                com.google.android.gms.internal.ads.zzcku zzckuVar = com.google.android.gms.internal.ads.zzcku.this;
                if (zzckuVar.zzP() != null) {
                    zzckuVar.zzP().zzq();
                }
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        java.lang.String str = zzfkkVar.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && zzf.zzk().zza(true)) {
            str = com.google.android.gms.internal.ads.zzcml.zza(str, com.google.android.gms.internal.ads.zzcml.zzb(zzfkfVar));
        }
        zzf.zzi();
        return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzdwh.zzj(zza, zzfkkVar.zzb, str, zzdzgVar, zzcuzVar.zzd()), new com.google.android.gms.internal.ads.zzgta(zzemdVar) { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = zza;
                if (zzfkfVar.zzM) {
                    zzckuVar.zzav();
                }
                com.google.android.gms.internal.ads.zzcuw zzcuwVar = zzf;
                zzckuVar.zzJ();
                zzckuVar.onPause();
                return zzcuwVar.zzh();
            }
        }, zzemdVar.zzd);
    }
}
