package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdtu {
    private final com.google.android.gms.internal.ads.zzfky zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdwi zzc;
    private final com.google.android.gms.internal.ads.zzdvd zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzdzl zzf;
    private final com.google.android.gms.internal.ads.zzfsc zzg;
    private final com.google.android.gms.internal.ads.zzekg zzh;
    private final com.google.android.gms.internal.ads.zzdzg zzi;
    private final com.google.android.gms.internal.ads.zzeao zzj;

    public zzdtu(com.google.android.gms.internal.ads.zzfky zzfkyVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdwi zzdwiVar, android.content.Context context, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzdvd zzdvdVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzeao zzeaoVar) {
        this.zza = zzfkyVar;
        this.zzb = executor;
        this.zzc = zzdwiVar;
        this.zze = context;
        this.zzf = zzdzlVar;
        this.zzg = zzfscVar;
        this.zzh = zzekgVar;
        this.zzd = zzdvdVar;
        this.zzi = zzdzgVar;
        this.zzj = zzeaoVar;
    }

    private final void zzh(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzcfv zzcfvVar) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
        if (zzfwVar != null && zzckuVar.zzh() != null) {
            zzckuVar.zzh().zzc(zzfwVar);
        }
        zzcfvVar.zzb();
    }

    private final void zzi(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        com.google.android.gms.internal.ads.zzeao zzeaoVar;
        zzj(zzckuVar);
        zzckuVar.zzab("/video", com.google.android.gms.internal.ads.zzbpp.zzl);
        zzckuVar.zzab("/videoMeta", com.google.android.gms.internal.ads.zzbpp.zzm);
        zzckuVar.zzab("/precache", new com.google.android.gms.internal.ads.zzcjb());
        zzckuVar.zzab("/delayPageLoaded", com.google.android.gms.internal.ads.zzbpp.zzp);
        zzckuVar.zzab("/instrument", com.google.android.gms.internal.ads.zzbpp.zzn);
        zzckuVar.zzab("/log", com.google.android.gms.internal.ads.zzbpp.zzg);
        zzckuVar.zzab("/click", com.google.android.gms.internal.ads.zzbpp.zzb(null, null));
        if (this.zza.zzb != null) {
            zzckuVar.zzP().zzT(true);
            zzckuVar.zzab("/open", new com.google.android.gms.internal.ads.zzbqd(true != ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpg)).booleanValue() ? null : zzbVar, null, null, null, null, null));
        } else {
            zzckuVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckuVar.getContext())) {
            java.util.Map hashMap = new java.util.HashMap();
            if (zzckuVar.zzC() != null) {
                hashMap = zzckuVar.zzC().zzaw;
            }
            zzckuVar.zzab("/logScionEvent", new com.google.android.gms.internal.ads.zzbpw(zzckuVar.getContext(), hashMap));
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpg)).booleanValue()) {
            zzckuVar.zzP().zzi(zzbVar);
            zzckuVar.zzP().zzj(zzcdnVar);
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziK)).booleanValue() || (zzeaoVar = this.zzj) == null) {
            return;
        }
        zzckuVar.zzab("/onDeviceStorageEvent", new com.google.android.gms.internal.ads.zzbpy(zzeaoVar));
    }

    private static final void zzj(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        zzckuVar.zzab("/videoClicked", com.google.android.gms.internal.ads.zzbpp.zzh);
        zzckuVar.zzP().zzR(true);
        zzckuVar.zzab("/getNativeAdViewSignals", com.google.android.gms.internal.ads.zzbpp.zzs);
        zzckuVar.zzab("/getNativeClickMeta", com.google.android.gms.internal.ads.zzbpp.zzt);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final org.json.JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzi.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdtp
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtu.this.zze(zzbVar, zzcdnVar, obj);
            }
        };
        java.util.concurrent.Executor executor = this.zzb;
        return com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(zza, zzhbeVar, executor), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtu.this.zzc(jSONObject, (com.google.android.gms.internal.ads.zzcku) obj);
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(final java.lang.String str, final java.lang.String str2, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzfki zzfkiVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzi.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdto
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtu.this.zzd(zzrVar, zzfkfVar, zzfkiVar, zzbVar, zzcdnVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(org.json.JSONObject jSONObject, final com.google.android.gms.internal.ads.zzcku zzckuVar) {
        com.google.android.gms.internal.ads.zzbsb zzbsbVar = this.zza.zzb;
        final com.google.android.gms.internal.ads.zzcfv zza = com.google.android.gms.internal.ads.zzcfv.zza(zzckuVar);
        if (zzbsbVar != null) {
            zzckuVar.zzaf(com.google.android.gms.internal.ads.zzcne.zze());
        } else {
            zzckuVar.zzaf(com.google.android.gms.internal.ads.zzcne.zzd());
        }
        zzckuVar.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str, java.lang.String str2) {
                com.google.android.gms.internal.ads.zzdtu.this.zzg(zzckuVar, zza, z, i, str, str2);
            }
        });
        zzckuVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        final com.google.android.gms.internal.ads.zzcku zza = this.zzc.zza(zzrVar, zzfkfVar, zzfkiVar);
        final com.google.android.gms.internal.ads.zzcfv zza2 = com.google.android.gms.internal.ads.zzcfv.zza(zza);
        if (this.zza.zzb != null) {
            zzi(zza, zzbVar, zzcdnVar);
            zza.zzaf(com.google.android.gms.internal.ads.zzcne.zze());
        } else {
            com.google.android.gms.internal.ads.zzdva zza3 = this.zzd.zza();
            com.google.android.gms.internal.ads.zzcms zzP = zza.zzP();
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzpg;
            zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() ? null : zzcdnVar, this.zzh, this.zzg, this.zzf, null, zza3, null, null, null, null, this.zzj, null, null);
            zzj(zza);
        }
        zza.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdtr
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.zzdtu.this.zzf(zza, zza2, z, i, str3, str4);
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcku zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final com.google.android.gms.internal.ads.zzcfv zza2 = com.google.android.gms.internal.ads.zzcfv.zza(zza);
        zzi(zza, zzbVar, zzcdnVar);
        zza.zzP().zzH(new com.google.android.gms.internal.ads.zzcmr() { // from class: com.google.android.gms.internal.ads.zzdtq
            @Override // com.google.android.gms.internal.ads.zzcmr
            public final /* synthetic */ void zza() {
                com.google.android.gms.internal.ads.zzcfv.this.zzb();
            }
        });
        zza.loadUrl((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeG));
        return zza2;
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzcfv zzcfvVar, boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.zza.zza;
            if (zzfwVar != null && zzckuVar.zzh() != null) {
                zzckuVar.zzh().zzc(zzfwVar);
            }
            zzcfvVar.zzb();
            return;
        }
        int length = java.lang.String.valueOf(i).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 63 + java.lang.String.valueOf(str).length() + 15 + java.lang.String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcfvVar.zzd(new com.google.android.gms.internal.ads.zzeph(1, sb.toString()));
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzcfv zzcfvVar, boolean z, int i, java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeO)).booleanValue()) {
            zzh(zzckuVar, zzcfvVar);
            return;
        }
        if (z) {
            zzh(zzckuVar, zzcfvVar);
            return;
        }
        int length = java.lang.String.valueOf(i).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 64 + java.lang.String.valueOf(str).length() + 15 + java.lang.String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcfvVar.zzd(new com.google.android.gms.internal.ads.zzeph(1, sb.toString()));
    }
}
