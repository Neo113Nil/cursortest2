package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeoe implements com.google.android.gms.internal.ads.zzeny {
    private final com.google.android.gms.internal.ads.zzdoc zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzdsn zzc;
    private final com.google.android.gms.internal.ads.zzflx zzd;
    private final com.google.android.gms.internal.ads.zzdvd zze;
    private final com.google.android.gms.internal.ads.zzdzg zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final android.content.Context zzh;
    private final com.google.android.gms.internal.ads.zzcdj zzi;

    public zzeoe(com.google.android.gms.internal.ads.zzdoc zzdocVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzdsn zzdsnVar, com.google.android.gms.internal.ads.zzflx zzflxVar, com.google.android.gms.internal.ads.zzdvd zzdvdVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.Context context, com.google.android.gms.internal.ads.zzcdj zzcdjVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzcdjVar;
        this.zza = zzdocVar;
        this.zzb = zzhcgVar;
        this.zzc = zzdsnVar;
        this.zzd = zzflxVar;
        this.zze = zzdvdVar;
        this.zzf = zzdzgVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final org.json.JSONObject jSONObject) {
        final com.google.android.gms.internal.ads.zzcdn zzcdnVar;
        final com.google.android.gms.ads.internal.zzb zzbVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcQ)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final com.google.common.util.concurrent.ListenableFuture zzb = this.zzd.zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpg)).booleanValue()) {
            android.content.Context context = this.zzh;
            com.google.android.gms.internal.ads.zzcdn zza = com.google.android.gms.internal.ads.zzdcm.zza(context, this.zzg, zzfkfVar, this.zzi);
            zzcdnVar = zza;
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zza, null);
        } else {
            zzcdnVar = null;
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
        }
        final com.google.common.util.concurrent.ListenableFuture zza2 = this.zzc.zza(zzfkqVar, zzfkfVar, jSONObject, zzbVar, zzcdnVar);
        return com.google.android.gms.internal.ads.zzhbw.zzo(zzb, zza2).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeoc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzeoe.this.zzf(zza2, zzb, zzfkqVar, zzfkfVar, jSONObject, zzbVar, zzcdnVar);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        return (zzfkkVar == null || zzfkkVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.ListenableFuture zzb = this.zzd.zzb();
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzeod
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeoe.this.zzc(zzfkfVar, (com.google.android.gms.internal.ads.zzdux) obj);
            }
        };
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zzb;
        return com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(zzb, zzhbeVar, zzhcgVar), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeoe.this.zzd(zzfkqVar, zzfkfVar, (org.json.JSONArray) obj);
            }
        }, zzhcgVar);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzdux zzduxVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isNonagon", true);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjV)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.ironsource.Ve.n, zzfkfVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return com.google.android.gms.internal.ads.zzhbw.zzj(zzduxVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzeoa
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeoe.this.zze(zzduxVar, (org.json.JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, org.json.JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeed(3));
        }
        int i = zzfkqVar.zza.zza.zzl;
        if (i <= 1) {
            return com.google.android.gms.internal.ads.zzhbw.zzk(zzg(zzfkqVar, zzfkfVar, jSONArray.getJSONObject(0)), com.google.android.gms.internal.ads.zzeob.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcR)).booleanValue()) {
            this.zzf.zzd("nsl", java.lang.String.valueOf(length));
        }
        this.zzd.zza(java.lang.Math.min(length, i));
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfkqVar, zzfkfVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeed(3)));
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(arrayList);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzdux zzduxVar, org.json.JSONObject jSONObject) {
        this.zzd.zzc(com.google.android.gms.internal.ads.zzhbw.zza(zzduxVar));
        if (!jSONObject.optBoolean("success")) {
            throw new com.google.android.gms.internal.ads.zzbtx("process json failed");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpo zzf(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.common.util.concurrent.ListenableFuture listenableFuture2, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, org.json.JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = (com.google.android.gms.internal.ads.zzdpt) listenableFuture.get();
        com.google.android.gms.internal.ads.zzdux zzduxVar = (com.google.android.gms.internal.ads.zzdux) listenableFuture2.get();
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzcQ;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzdpu zzd = this.zza.zzd(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null), new com.google.android.gms.internal.ads.zzdqe(zzdptVar), new com.google.android.gms.internal.ads.zzdop(jSONObject, zzduxVar, zzbVar, zzcdnVar));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zzf;
            zzdzgVar.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            zzdzgVar.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzi().zzb();
        zzd.zzj().zza(zzduxVar);
        zzd.zzk().zza(zzdptVar.zzT());
        zzd.zzl().zza(this.zze, zzdptVar.zzU());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            this.zzf.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_CONFIGURE_WEBVIEW_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzd.zzh();
    }
}
