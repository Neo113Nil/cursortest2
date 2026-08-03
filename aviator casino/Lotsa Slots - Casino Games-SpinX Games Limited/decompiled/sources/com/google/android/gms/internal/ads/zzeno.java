package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeno implements com.google.android.gms.internal.ads.zzels {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdwi zzb;
    private final com.google.android.gms.internal.ads.zzdng zzc;
    private final com.google.android.gms.internal.ads.zzfky zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzf;
    private final com.google.android.gms.internal.ads.zzbpt zzg;
    private final boolean zzh = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkn)).booleanValue();
    private final com.google.android.gms.internal.ads.zzekr zzi;
    private final com.google.android.gms.internal.ads.zzdzg zzj;
    private final com.google.android.gms.internal.ads.zzdzl zzk;

    public zzeno(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdng zzdngVar, com.google.android.gms.internal.ads.zzdwi zzdwiVar, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = context;
        this.zzd = zzfkyVar;
        this.zzc = zzdngVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdwiVar;
        this.zzg = zzbptVar;
        this.zzi = zzekrVar;
        this.zzj = zzdzgVar;
        this.zzk = zzdzlVar;
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
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeno.this.zzc(zzfkfVar, zzfkqVar, zzdwmVar, obj);
            }
        };
        java.util.concurrent.Executor executor = this.zze;
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zza, zzhbeVar, executor);
        zzj.addListener(new java.lang.Runnable(zzdwmVar) { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(final com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzdwm zzdwmVar, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzeno zzenoVar;
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcQ;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzj.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdwi zzdwiVar = this.zzb;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzd;
        final com.google.android.gms.internal.ads.zzcku zza = zzdwiVar.zza(zzfkyVar.zzf, zzfkfVar, zzfkqVar.zzb.zzb);
        zza.zzaw(zzfkfVar.zzW);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzj.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.internal.ads.zzdng zzdngVar = this.zzc;
        com.google.android.gms.internal.ads.zzcyj zzcyjVar = new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null);
        android.content.Context context = this.zza;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzf;
        boolean z = this.zzh;
        com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zzg;
        final com.google.android.gms.internal.ads.zzdma zzd = zzdngVar.zzd(zzcyjVar, new com.google.android.gms.internal.ads.zzdmd(new com.google.android.gms.internal.ads.zzenm(context, versionInfoParcel, zzcfwVar, zzfkfVar, zza, zzfkyVar, z, zzbptVar, this.zzi, this.zzk), zza));
        zzcfwVar.zzc(zzd);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            zzenoVar = this;
            zzenoVar.zzj.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } else {
            zzenoVar = this;
        }
        zzd.zzd().zzq(new com.google.android.gms.internal.ads.zzddl() { // from class: com.google.android.gms.internal.ads.zzenj
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
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgn)).booleanValue() && zzd.zzl().zza(true)) {
            str = com.google.android.gms.internal.ads.zzcml.zza(str, com.google.android.gms.internal.ads.zzcml.zzb(zzfkfVar));
        }
        com.google.android.gms.internal.ads.zzdwh zzk = zzd.zzk();
        com.google.android.gms.internal.ads.zzbpt zzbptVar2 = true != z ? null : zzbptVar;
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = zzenoVar.zzj;
        zzk.zzi(zza, true, zzbptVar2, zzdzgVar);
        zzd.zzk();
        return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzdwh.zzj(zza, zzfkkVar.zzb, str, zzdzgVar, zzdngVar.zzc()), new com.google.android.gms.internal.ads.zzgta(zzenoVar) { // from class: com.google.android.gms.internal.ads.zzenk
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = zza;
                if (zzfkfVar.zzM) {
                    zzckuVar.zzav();
                }
                com.google.android.gms.internal.ads.zzdma zzdmaVar = zzd;
                zzckuVar.zzJ();
                zzckuVar.onPause();
                return zzdmaVar.zzh();
            }
        }, zzenoVar.zze);
    }
}
