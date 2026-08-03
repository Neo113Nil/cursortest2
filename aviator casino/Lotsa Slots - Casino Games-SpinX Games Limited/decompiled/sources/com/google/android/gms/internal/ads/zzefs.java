package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzefs {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\?");
    private final com.google.android.gms.internal.ads.zzcnj zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfky zze;
    private final java.util.concurrent.Executor zzf;
    private final java.util.concurrent.ScheduledExecutorService zzg;
    private final java.lang.String zzh;
    private final com.google.android.gms.internal.ads.zzfqg zzi;
    private final com.google.android.gms.internal.ads.zzdzg zzj;
    private final com.google.android.gms.internal.ads.zzfsc zzk;
    private final com.google.android.gms.internal.ads.zzdfv zzl;
    private final java.lang.Object zzm = new java.lang.Object();
    private java.lang.String zzn;
    private java.util.List zzo;
    private android.os.Bundle zzp;
    private final com.google.android.gms.internal.ads.zzcbl zzq;

    zzefs(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.util.concurrent.Executor executor, java.lang.String str, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzcbl zzcblVar, com.google.android.gms.internal.ads.zzein zzeinVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzdfv zzdfvVar) {
        this.zzb = zzcnjVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfkyVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfqgVar;
        zzcnjVar.zzB();
        this.zzj = zzdzgVar;
        this.zzq = zzcblVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfscVar;
        this.zzl = zzdfvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.google.common.util.concurrent.ListenableFuture zzg(java.lang.String str, final java.lang.String str2) {
        com.google.common.util.concurrent.ListenableFuture zza2;
        java.lang.String str3;
        java.lang.String str4 = "";
        if (android.text.TextUtils.isEmpty(str)) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(15, "Invalid ad string."));
        }
        android.content.Context context = this.zzc;
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 11);
        zzn.zza();
        com.google.android.gms.internal.ads.zzbui zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        com.google.android.gms.internal.ads.zzbuc zzbucVar = com.google.android.gms.internal.ads.zzbuf.zza;
        final com.google.android.gms.internal.ads.zzbty zza3 = zzb.zza("google.afma.response.normalize", zzbucVar, zzbucVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzic)).booleanValue()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                this.zzn = jSONObject.optString("fetch_url", "");
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new org.json.JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
            } catch (org.json.JSONException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                str3 = this.zzn;
                final java.util.List list = this.zzo;
                if (android.text.TextUtils.isEmpty(str3)) {
                }
                com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe(this) { // from class: com.google.android.gms.internal.ads.zzefr
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        java.lang.String str5 = (java.lang.String) obj;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        java.lang.String str6 = str2;
                        try {
                            jSONObject4.put("headers", new org.json.JSONObject());
                            jSONObject4.put("body", str5);
                            jSONObject3.put("base_url", "");
                            jSONObject3.put("signals", new org.json.JSONObject(str6));
                            jSONObject2.put("request", jSONObject3);
                            jSONObject2.put(com.ironsource.Ve.n, jSONObject4);
                            jSONObject2.put("flags", new org.json.JSONObject());
                            return com.google.android.gms.internal.ads.zzhbw.zza(jSONObject2);
                        } catch (org.json.JSONException e) {
                            java.lang.String valueOf = java.lang.String.valueOf(e.getCause());
                            java.lang.String.valueOf(valueOf);
                            throw new org.json.JSONException("Preloaded loader: ".concat(java.lang.String.valueOf(valueOf)));
                        }
                    }
                };
                java.util.concurrent.Executor executor = this.zzf;
                com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(zza2, zzhbeVar, executor), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefn
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzefs.this.zzb(zza3, (org.json.JSONObject) obj);
                    }
                }, executor), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefo
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzefs.this.zzc((org.json.JSONObject) obj);
                    }
                }, executor);
                com.google.android.gms.internal.ads.zzfqf.zzd(zzj, this.zzi, zzn);
                com.google.android.gms.internal.ads.zzhbw.zzr(zzj, new com.google.android.gms.internal.ads.zzefm(this), com.google.android.gms.internal.ads.zzcfr.zzh);
                return zzj;
            }
            str3 = this.zzn;
            final java.util.List list2 = this.zzo;
            if (android.text.TextUtils.isEmpty(str3)) {
                this.zzj.zzd("sst", "2");
                java.lang.String str5 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzie);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzid)).booleanValue()) {
                    java.util.List zze = com.google.android.gms.internal.ads.zzgty.zzb(zza).zze(str3);
                    if (zze.size() < 2) {
                        zza2 = com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(1, "Invalid fetch URL."));
                    } else {
                        str4 = (java.lang.String) zze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str3 = android.net.Uri.parse(str3).buildUpon().query(null).build().toString();
                    }
                }
                final com.google.android.gms.internal.ads.zzeik zzeikVar = new com.google.android.gms.internal.ads.zzeik(str3, 60000, new java.util.HashMap(), str4.getBytes(java.nio.charset.StandardCharsets.UTF_8), str5, false);
                zza2 = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzcfr.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzefp
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ java.lang.Object call() {
                        return com.google.android.gms.internal.ads.zzefs.this.zzd(zzeikVar);
                    }
                })), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzif)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzg), java.lang.Exception.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefq
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzefs.this.zze(list2, (java.lang.Exception) obj);
                    }
                }, this.zzf);
            } else {
                zza2 = com.google.android.gms.internal.ads.zzhbw.zza(str);
                this.zzj.zzd("sst", "1");
            }
        } else {
            zza2 = com.google.android.gms.internal.ads.zzhbw.zza(str);
            this.zzj.zzd("sst", "1");
        }
        com.google.android.gms.internal.ads.zzhbe zzhbeVar2 = new com.google.android.gms.internal.ads.zzhbe(this) { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.lang.String str52 = (java.lang.String) obj;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                java.lang.String str6 = str2;
                try {
                    jSONObject4.put("headers", new org.json.JSONObject());
                    jSONObject4.put("body", str52);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new org.json.JSONObject(str6));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put(com.ironsource.Ve.n, jSONObject4);
                    jSONObject2.put("flags", new org.json.JSONObject());
                    return com.google.android.gms.internal.ads.zzhbw.zza(jSONObject2);
                } catch (org.json.JSONException e) {
                    java.lang.String valueOf = java.lang.String.valueOf(e.getCause());
                    java.lang.String.valueOf(valueOf);
                    throw new org.json.JSONException("Preloaded loader: ".concat(java.lang.String.valueOf(valueOf)));
                }
            }
        };
        java.util.concurrent.Executor executor2 = this.zzf;
        com.google.common.util.concurrent.ListenableFuture zzj2 = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzj(zza2, zzhbeVar2, executor2), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzefs.this.zzb(zza3, (org.json.JSONObject) obj);
            }
        }, executor2), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzefs.this.zzc((org.json.JSONObject) obj);
            }
        }, executor2);
        com.google.android.gms.internal.ads.zzfqf.zzd(zzj2, this.zzi, zzn);
        com.google.android.gms.internal.ads.zzhbw.zzr(zzj2, new com.google.android.gms.internal.ads.zzefm(this), com.google.android.gms.internal.ads.zzcfr.zzh);
        return zzj2;
    }

    private final void zzh(com.google.android.gms.internal.ads.zzdyu zzdyuVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzih)).booleanValue()) {
            this.zzj.zzf(zzdyuVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final java.lang.String zzi(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new org.json.JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            java.lang.String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return str;
        }
    }

    private static final java.lang.String zzj(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).optString("request_id", "");
        } catch (org.json.JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x022d, code lost:
    
        if (r5.zze(r1, r2, r4) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021a A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229 A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5 A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:22:0x007c, B:24:0x009a, B:27:0x00a2, B:29:0x00af, B:31:0x00c9, B:32:0x00f6, B:34:0x0101, B:36:0x0109, B:37:0x010f, B:41:0x0118, B:44:0x014e, B:47:0x012c, B:50:0x0139, B:52:0x0154, B:55:0x00e0, B:57:0x0168, B:60:0x0185, B:64:0x018d, B:66:0x01b2, B:68:0x01c7, B:70:0x01eb, B:71:0x0200, B:74:0x0214, B:76:0x021a, B:77:0x0227, B:79:0x0229, B:81:0x0232, B:86:0x022f, B:87:0x01f5, B:88:0x01da, B:91:0x019b, B:94:0x0175, B:95:0x017a), top: B:21:0x007c, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        java.lang.String str;
        int i;
        java.lang.String str2;
        java.lang.String string;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zzf(com.google.android.gms.internal.ads.zzdyu.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        java.lang.String str3 = this.zze.zzd.zzx;
        if (!android.text.TextUtils.isEmpty(str3)) {
            java.lang.String zzj = zzj(str3);
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzhY;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && zzj.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzj = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : "";
            }
            if (android.text.TextUtils.isEmpty(zzj)) {
                return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzt = this.zzb.zzt();
                com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zzj;
                java.lang.String zzb = zzt.zzb(zzj, zzdzgVar);
                java.lang.String str4 = null;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && !android.text.TextUtils.isEmpty(zzb)) {
                    try {
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(zzb).optJSONObject("extras");
                        if (optJSONObject != null) {
                            if ((((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzia)).booleanValue() ? java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzib)).split(",")) : java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhZ)).split(","))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(optJSONObject.optString("query_info_type", "")))) {
                                int lastIndexOf2 = str3.lastIndexOf(com.ironsource.X3.j.c);
                                java.lang.String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                if (!android.text.TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = android.util.Base64.decode(substring, 11);
                                        byte[] bytes = zzj.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                                        if (!android.text.TextUtils.isEmpty(zzb)) {
                                            try {
                                                string = new org.json.JSONObject(zzb).getString("arek");
                                            } catch (org.json.JSONException e) {
                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                            }
                                            str3 = com.google.android.gms.internal.ads.zzflo.zzb(decode, bytes, string, zzdzgVar);
                                        }
                                        string = null;
                                        str3 = com.google.android.gms.internal.ads.zzflo.zzb(decode, bytes, string, zzdzgVar);
                                    } catch (java.lang.IllegalArgumentException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                if (android.text.TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    try {
                        str = new org.json.JSONObject(str3).optString("render_id", "");
                    } catch (org.json.JSONException unused2) {
                        str = "";
                    }
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.lang.String str5 = "";
                    try {
                        str5 = new java.lang.String(android.util.Base64.decode(str, 0), java.nio.charset.StandardCharsets.UTF_8);
                    } catch (java.lang.IllegalArgumentException e3) {
                        java.lang.String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(java.lang.String.valueOf(str)));
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "PreloadedLoader.decodeRenderId");
                    }
                    java.util.List zze = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)).zze(str5);
                    if (zze.size() == 2) {
                        str4 = (java.lang.String) zze.get(0);
                        i = java.lang.Integer.parseInt((java.lang.String) zze.get(1));
                        android.util.Pair pair = str4 == null ? new android.util.Pair(str4, java.lang.Integer.valueOf(i)) : new android.util.Pair("", 0);
                        str2 = (java.lang.String) pair.first;
                        int intValue = ((java.lang.Integer) pair.second).intValue();
                        if (!android.text.TextUtils.isEmpty(str2) && intValue > 0) {
                            if (!zzt.zzd(zzj, str2)) {
                                return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(10, "The ad has already been shown."));
                            }
                        }
                        zzt.zzc(zzj);
                        if (!android.text.TextUtils.isEmpty(zzb)) {
                            return zzg(str3, zzi(zzb));
                        }
                    } else {
                        java.lang.String.valueOf(str);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(java.lang.String.valueOf(str)));
                    }
                }
                i = 0;
                if (str4 == null) {
                }
                str2 = (java.lang.String) pair.first;
                int intValue2 = ((java.lang.Integer) pair.second).intValue();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    if (!zzt.zzd(zzj, str2)) {
                    }
                }
                zzt.zzc(zzj);
                if (!android.text.TextUtils.isEmpty(zzb)) {
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhQ)).booleanValue()) {
                java.lang.String str6 = zzcVar.zza;
                java.lang.String str7 = zzcVar.zzb;
                java.lang.String zzj2 = zzj(str6);
                java.lang.String zzj3 = zzj(str7);
                if (android.text.TextUtils.isEmpty(zzj3) || !zzj2.equals(zzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzt().zzc(zzj2);
                    this.zzj.zzc().put("request_id", zzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(14, "Mismatch request IDs."));
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbty zzbtyVar, org.json.JSONObject jSONObject) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            this.zzj.zzf(com.google.android.gms.internal.ads.zzdyu.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbtyVar.zzb(jSONObject);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzfkn zzfknVar = new com.google.android.gms.internal.ads.zzfkn(this.zze);
        java.lang.String jSONObject2 = jSONObject.toString();
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfkq(zzfknVar, com.google.android.gms.internal.ads.zzfkp.zza(new java.io.StringReader(jSONObject2), this.zzp)));
    }

    final /* synthetic */ java.lang.String zzd(com.google.android.gms.internal.ads.zzeik zzeikVar) {
        zzh(com.google.android.gms.internal.ads.zzdyu.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzig)).intValue()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new com.google.android.gms.internal.ads.zzeph(1, sb.toString());
                }
                com.google.android.gms.internal.ads.zzeik zzeikVar2 = zzeikVar;
                com.google.android.gms.internal.ads.zzeil zza2 = new com.google.android.gms.internal.ads.zzeim(this.zzc, this.zzd.afmaVersion, this.zzq, android.os.Binder.getCallingUid(), null).zza(zzeikVar);
                com.google.android.gms.internal.ads.zzeil zzeilVar = zza2;
                int i3 = zza2.zza;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzih)).booleanValue()) {
                    this.zzj.zzd("fr", java.lang.String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(com.google.android.gms.internal.ads.zzdyu.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i++;
                i2 = i3;
            } catch (java.lang.Exception e) {
                throw new com.google.android.gms.internal.ads.zzeph(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(java.util.List list, java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzeph zzephVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof java.util.concurrent.TimeoutException) {
            zzephVar = new com.google.android.gms.internal.ads.zzeph(1, "Timed out waiting for ad response.");
        } else if (exc instanceof com.google.android.gms.internal.ads.zzeph) {
            zzephVar = (com.google.android.gms.internal.ads.zzeph) exc;
        } else {
            zzephVar = new com.google.android.gms.internal.ads.zzeph(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        java.lang.String message = zzephVar.getMessage() == null ? "" : zzephVar.getMessage();
        if (list != null && !list.isEmpty()) {
            java.lang.String str = "0.6.0.0";
            if (!android.text.TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    java.util.List zze = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)).zze(message);
                    if (zze.size() == 2) {
                        message = (java.lang.String) zze.get(1);
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.google.android.gms.internal.ads.zzfry.zzd(com.google.android.gms.internal.ads.zzfry.zzd((java.lang.String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzc(zzephVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfv zzf() {
        return this.zzl;
    }
}
