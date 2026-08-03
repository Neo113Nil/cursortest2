package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzems implements com.google.android.gms.internal.ads.zzels {
    private final com.google.android.gms.internal.ads.zzcwq zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzdwi zzc;
    private final com.google.android.gms.internal.ads.zzfky zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.internal.ads.zzgta zzf;
    private final com.google.android.gms.internal.ads.zzdzg zzg;

    public zzems(com.google.android.gms.internal.ads.zzcwq zzcwqVar, android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzgta zzgtaVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        this.zzb = context;
        this.zza = zzcwqVar;
        this.zze = executor;
        this.zzc = zzdwiVar;
        this.zzd = zzfkyVar;
        this.zzf = zzgtaVar;
        this.zzg = zzdzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        return (zzfkkVar == null || zzfkkVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzems.this.zzc(zzfkqVar, zzfkfVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcQ;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzg.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        android.content.Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = com.google.android.gms.internal.ads.zzfle.zza(context, zzfkfVar.zzu);
        final com.google.android.gms.internal.ads.zzcku zza2 = this.zzc.zza(zza, zzfkfVar, zzfkqVar.zzb.zzb);
        zza2.zzaw(zzfkfVar.zzW);
        android.view.View zza3 = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) ? com.google.android.gms.internal.ads.zzcxf.zza(context, zza2.zzE(), zzfkfVar) : new com.google.android.gms.internal.ads.zzdwl(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfkfVar));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzg.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcwq zzcwqVar = this.zza;
        com.google.android.gms.internal.ads.zzcyj zzcyjVar = new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null);
        java.util.Objects.requireNonNull(zza2);
        final com.google.android.gms.internal.ads.zzcvm zzf = zzcwqVar.zzf(zzcyjVar, new com.google.android.gms.internal.ads.zzcvs(zza3, zza2, new com.google.android.gms.internal.ads.zzcxr() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzcxr
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return com.google.android.gms.internal.ads.zzcku.this.zzh();
            }
        }, com.google.android.gms.internal.ads.zzfle.zzb(zza)));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzg.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdwh zzj = zzf.zzj();
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zzg;
        zzj.zzi(zza2, false, null, zzdzgVar);
        com.google.android.gms.internal.ads.zzddj zzd = zzf.zzd();
        com.google.android.gms.internal.ads.zzddl zzddlVar = new com.google.android.gms.internal.ads.zzddl() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzddl
            public final /* synthetic */ void zzdr() {
                com.google.android.gms.internal.ads.zzcku zzckuVar = com.google.android.gms.internal.ads.zzcku.this;
                if (zzckuVar.zzP() != null) {
                    zzckuVar.zzP().zzq();
                }
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzh;
        zzd.zzq(zzddlVar, zzhcgVar);
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        java.lang.String str = zzfkkVar.zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && zzf.zzm().zza(true)) {
            str = com.google.android.gms.internal.ads.zzcml.zza(str, com.google.android.gms.internal.ads.zzcml.zzb(zzfkfVar));
        }
        zzf.zzj();
        com.google.common.util.concurrent.ListenableFuture zzj2 = com.google.android.gms.internal.ads.zzdwh.zzj(zza2, zzfkkVar.zzb, str, zzdzgVar, zzcwqVar.zze());
        if (zzfkfVar.zzM) {
            java.util.Objects.requireNonNull(zza2);
            zzj2.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzemm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcku.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzems.this.zzd(zza2);
            }
        }, this.zze);
        return com.google.android.gms.internal.ads.zzhbw.zzk(zzj2, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                return com.google.android.gms.internal.ads.zzcvm.this.zzi();
            }
        }, zzhcgVar);
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        zzckuVar.zzJ();
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzd;
        com.google.android.gms.internal.ads.zzcma zzh = zzckuVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzfkyVar.zza;
        if (zzfwVar != null && zzh != null) {
            zzh.zzc(zzfwVar);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbU)).booleanValue() || zzckuVar.isAttachedToWindow()) {
            return;
        }
        zzckuVar.onPause();
        zzckuVar.zzaG(true);
    }
}
