package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdtc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdsi zzb;
    private final com.google.android.gms.internal.ads.zzbap zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final com.google.android.gms.internal.ads.zzbhp zzf;
    private final java.util.concurrent.Executor zzg;
    private final com.google.android.gms.internal.ads.zzblt zzh;
    private final com.google.android.gms.internal.ads.zzdtu zzi;
    private final com.google.android.gms.internal.ads.zzdwi zzj;
    private final java.util.concurrent.ScheduledExecutorService zzk;
    private final com.google.android.gms.internal.ads.zzdvd zzl;
    private final com.google.android.gms.internal.ads.zzdzl zzm;
    private final com.google.android.gms.internal.ads.zzfsc zzn;
    private final com.google.android.gms.internal.ads.zzekg zzo;
    private final com.google.android.gms.internal.ads.zzekr zzp;
    private final com.google.android.gms.internal.ads.zzflc zzq;
    private final com.google.android.gms.internal.ads.zzdzg zzr;
    private final com.google.android.gms.internal.ads.zzeao zzs;

    public zzdtc(android.content.Context context, com.google.android.gms.internal.ads.zzdsi zzdsiVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzdtu zzdtuVar, com.google.android.gms.internal.ads.zzdwi zzdwiVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzdvd zzdvdVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzflc zzflcVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzeao zzeaoVar) {
        this.zza = context;
        this.zzb = zzdsiVar;
        this.zzc = zzbapVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhpVar;
        this.zzg = executor;
        this.zzh = zzfkyVar.zzj;
        this.zzi = zzdtuVar;
        this.zzj = zzdwiVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdzlVar;
        this.zzn = zzfscVar;
        this.zzo = zzekgVar;
        this.zzl = zzdvdVar;
        this.zzp = zzekrVar;
        this.zzq = zzflcVar;
        this.zzr = zzdzgVar;
        this.zzs = zzeaoVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzk(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(optJSONObject);
    }

    public static final java.util.List zzl(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzew zzs = zzs(optJSONArray.optJSONObject(i));
            if (zzs != null) {
                arrayList.add(zzs);
            }
        }
        return com.google.android.gms.internal.ads.zzgwm.zzq(arrayList);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzm(org.json.JSONArray jSONArray, boolean z, boolean z2, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzhbw.zza(java.util.Collections.emptyList());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyuVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbw.zzm(arrayList), com.google.android.gms.internal.ads.zzdtb.zza, this.zzg);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzn(org.json.JSONObject jSONObject, boolean z, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        java.util.HashMap hashMap;
        final java.lang.String optString;
        final double optDouble;
        final int optInt;
        final int optInt2;
        if (jSONObject == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeP)).booleanValue()) {
            if (jSONObject.has((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeQ))) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (java.lang.String str : ((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeR)).split(",")) {
                    try {
                        hashMap2.put(str, jSONObject.getString(str));
                    } catch (org.json.JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject.optString("url");
                if (!android.text.TextUtils.isEmpty(optString) && hashMap == null) {
                    return com.google.android.gms.internal.ads.zzhbw.zza(null);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue() && zzdyuVar != null) {
                    this.zzr.zzf(zzdyuVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                }
                optDouble = jSONObject.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
                optInt = jSONObject.optInt("width", -1);
                optInt2 = jSONObject.optInt("height", -1);
                if (!z || hashMap != null) {
                    return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzblp(null, android.net.Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
                }
                return zzq("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), com.google.android.gms.internal.ads.zzhbw.zzk(this.zzb.zza(optString, optDouble, optBoolean), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzdsr
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                        return new com.google.android.gms.internal.ads.zzblp(new android.graphics.drawable.BitmapDrawable(android.content.res.Resources.getSystem(), (android.graphics.Bitmap) obj), android.net.Uri.parse(optString), optDouble, optInt, optInt2, null);
                    }
                }, this.zzg), null);
            }
        }
        hashMap = null;
        optString = jSONObject.optString("url");
        if (!android.text.TextUtils.isEmpty(optString)) {
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzr.zzf(zzdyuVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject.optBoolean("is_transparent", true);
        optInt = jSONObject.optInt("width", -1);
        optInt2 = jSONObject.optInt("height", -1);
        if (!z) {
        }
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzblp(null, android.net.Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
    }

    private static java.lang.Integer zzo(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return java.lang.Integer.valueOf(android.graphics.Color.rgb(jSONObject2.getInt(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private final com.google.common.util.concurrent.ListenableFuture zzp(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        final com.google.common.util.concurrent.ListenableFuture zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfkfVar, zzfkiVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcdnVar);
        return com.google.android.gms.internal.ads.zzhbw.zzj(zzb, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdsw
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
                if (zzckuVar == null || zzckuVar.zzh() == null) {
                    throw new com.google.android.gms.internal.ads.zzeph(1, "Retrieve video view in html5 ad response failed.");
                }
                return com.google.common.util.concurrent.ListenableFuture.this;
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    private final com.google.common.util.concurrent.ListenableFuture zzq(java.lang.String str, boolean z, final com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcV)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfu.zza(listenableFuture, str, this.zzg);
        }
        if (z) {
            return com.google.android.gms.internal.ads.zzhbw.zzj(listenableFuture, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdsy
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                    return obj2 != null ? com.google.common.util.concurrent.ListenableFuture.this : com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(1, "Retrieve required value in native ad response failed."));
                }
            }, com.google.android.gms.internal.ads.zzcfr.zzh);
        }
        final java.lang.Object obj2 = null;
        return com.google.android.gms.internal.ads.zzhbw.zzh(listenableFuture, java.lang.Exception.class, new com.google.android.gms.internal.ads.zzhbe(obj2) { // from class: com.google.android.gms.internal.ads.zzdsx
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (java.lang.Exception) obj3);
                return com.google.android.gms.internal.ads.zzhbw.zza(null);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzs(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.lang.String optString = jSONObject.optString("reason");
        java.lang.String optString2 = jSONObject.optString("ping_url");
        if (android.text.TextUtils.isEmpty(optString) || android.text.TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(optString, optString2);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdyuVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        com.google.android.gms.internal.ads.zzblt zzbltVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbltVar.zzb, zzbltVar.zzd, zzdyuVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(org.json.JSONObject jSONObject, java.lang.String str, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzfki zzfkiVar, final com.google.android.gms.ads.internal.zzb zzbVar, final com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlv)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeP)).booleanValue()) {
            if (optJSONObject.has((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeQ))) {
                return com.google.android.gms.internal.ads.zzhbw.zza(null);
            }
        }
        final java.lang.String optString = optJSONObject.optString("base_url");
        final java.lang.String optString2 = optJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzr = zzr(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (android.text.TextUtils.isEmpty(optString2)) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzr.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdss
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtc.this.zzh(zzr, zzfkfVar, zzfkiVar, zzbVar, zzcdnVar, optString, optString2, obj);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzf);
        com.google.common.util.concurrent.ListenableFuture zzj2 = com.google.android.gms.internal.ads.zzhbw.zzj(zzj, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdst
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                if (((com.google.android.gms.internal.ads.zzcku) obj) != null) {
                    return com.google.common.util.concurrent.ListenableFuture.this;
                }
                throw new com.google.android.gms.internal.ads.zzeph(1, "Retrieve Web View from image ad response failed.");
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcV)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfu.zza(zzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return zzj2;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(org.json.JSONObject jSONObject, java.lang.String str, com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        final org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.ironsource.Y3.c);
        if (optJSONObject == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new org.json.JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), com.google.android.gms.internal.ads.zzhbw.zzk(zzm(optJSONArray, false, true, zzdyuVar), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzdsu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtc.this.zzi(optJSONObject, (java.util.List) obj);
            }
        }, this.zzg), null);
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(org.json.JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        final java.lang.String optString = optJSONObject.optString("omid_html");
        if (android.text.TextUtils.isEmpty(optString)) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzr.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzdsv
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdtc.this.zzj(optString, zzcdnVar, zzbVar, obj);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzf);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcV)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfu.zza(zzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return zzj;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcU)).booleanValue()) {
            this.zzr.zzf(com.google.android.gms.internal.ads.zzdyu.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzdsq(this, zzcfwVar), com.google.android.gms.internal.ads.zzcfr.zzf);
        return zzcfwVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzg(org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        org.json.JSONObject zzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (zzi != null) {
            return zzp(zzi, zzfkfVar, zzfkiVar, zzbVar, zzcdnVar);
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        java.lang.String optString = optJSONObject.optString("vast_xml");
        boolean z = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlu)).booleanValue() && optJSONObject.has("html");
        if (!android.text.TextUtils.isEmpty(optString) || z) {
            return zzq(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, com.google.android.gms.internal.ads.zzhbw.zzi(z ? zzp(optJSONObject, zzfkfVar, zzfkiVar, zzbVar, zzcdnVar) : this.zzi.zza(optJSONObject, zzbVar, zzcdnVar), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeH)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zzk), null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
        return com.google.android.gms.internal.ads.zzhbw.zza(null);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzeao zzeaoVar;
        com.google.android.gms.internal.ads.zzcku zza = this.zzj.zza(zzrVar, zzfkfVar, zzfkiVar);
        final com.google.android.gms.internal.ads.zzcfv zza2 = com.google.android.gms.internal.ads.zzcfv.zza(zza);
        com.google.android.gms.internal.ads.zzdva zza3 = this.zzl.zza();
        com.google.android.gms.internal.ads.zzcms zzP = zza.zzP();
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzpg;
        zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() ? null : zzcdnVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null, null);
        zza.zzab("/getNativeAdViewSignals", com.google.android.gms.internal.ads.zzbpp.zzs);
        zza.zzab("/getNativeClickMeta", com.google.android.gms.internal.ads.zzbpp.zzt);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziK)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziM)).booleanValue() && (zzeaoVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new com.google.android.gms.internal.ads.zzbpy(zzeaoVar));
            }
        }
        zza.zzP().zzS(true);
        zza.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdta
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str3, java.lang.String str4) {
                com.google.android.gms.internal.ads.zzcfv zzcfvVar = com.google.android.gms.internal.ads.zzcfv.this;
                if (z) {
                    zzcfvVar.zzb();
                    return;
                }
                int length = java.lang.String.valueOf(i).length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 58 + java.lang.String.valueOf(str3).length() + 15 + java.lang.String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcfvVar.zzd(new com.google.android.gms.internal.ads.zzeph(1, sb.toString()));
            }
        });
        zza.zzau(str, str2, null);
        return zza2;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzblm zzi(org.json.JSONObject jSONObject, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.lang.String optString = jSONObject.optString("text");
        java.lang.Integer zzo = zzo(jSONObject, "bg_color");
        java.lang.Integer zzo2 = zzo(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new com.google.android.gms.internal.ads.zzblm(optString, list, zzo, zzo2, optInt > 0 ? java.lang.Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE) + optInt2, this.zzh.zze, optBoolean);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(java.lang.String str, com.google.android.gms.internal.ads.zzcdn zzcdnVar, com.google.android.gms.ads.internal.zzb zzbVar, java.lang.Object obj) {
        com.google.android.gms.ads.internal.zzt.zzd();
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzekr zzekrVar = this.zzp;
        com.google.android.gms.internal.ads.zzcku zza = com.google.android.gms.internal.ads.zzclk.zza(context, com.google.android.gms.internal.ads.zzcne.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzekrVar, this.zzq, this.zzm);
        final com.google.android.gms.internal.ads.zzcfv zza2 = com.google.android.gms.internal.ads.zzcfv.zza(zza);
        zza.zzP().zzG(new com.google.android.gms.internal.ads.zzcmq() { // from class: com.google.android.gms.internal.ads.zzdsz
            @Override // com.google.android.gms.internal.ads.zzcmq
            public final /* synthetic */ void zza(boolean z, int i, java.lang.String str2, java.lang.String str3) {
                com.google.android.gms.internal.ads.zzcfv.this.zzb();
            }
        });
        zza.loadData(android.util.Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpg)).booleanValue()) {
            if (zzcdnVar != null) {
                zza.zzP().zzj(zzcdnVar);
            }
            zza.zzP().zzi(zzbVar);
        }
        return zza2;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzr(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new com.google.android.gms.ads.AdSize(i, i2));
    }
}
