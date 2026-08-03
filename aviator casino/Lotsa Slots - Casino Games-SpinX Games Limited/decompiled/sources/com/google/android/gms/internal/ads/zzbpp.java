package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbpp {
    public static final com.google.android.gms.internal.ads.zzbpq zza = com.google.android.gms.internal.ads.zzbpo.zza;
    public static final com.google.android.gms.internal.ads.zzbpq zzb = com.google.android.gms.internal.ads.zzbpf.zza;
    public static final com.google.android.gms.internal.ads.zzbpq zzc = com.google.android.gms.internal.ads.zzbpg.zza;
    public static final com.google.android.gms.internal.ads.zzbpq zzd = new com.google.android.gms.internal.ads.zzbox();
    public static final com.google.android.gms.internal.ads.zzbpq zze = new com.google.android.gms.internal.ads.zzboy();
    public static final com.google.android.gms.internal.ads.zzbpq zzf = com.google.android.gms.internal.ads.zzbpl.zza;
    public static final com.google.android.gms.internal.ads.zzbpq zzg = new com.google.android.gms.internal.ads.zzboz();
    public static final com.google.android.gms.internal.ads.zzbpq zzh = new com.google.android.gms.internal.ads.zzbpa();
    public static final com.google.android.gms.internal.ads.zzbpq zzi = com.google.android.gms.internal.ads.zzbpm.zza;
    public static final com.google.android.gms.internal.ads.zzbpq zzj = new com.google.android.gms.internal.ads.zzbpb();
    public static final com.google.android.gms.internal.ads.zzbpq zzk = new com.google.android.gms.internal.ads.zzbpc();
    public static final com.google.android.gms.internal.ads.zzbpq zzl = new com.google.android.gms.internal.ads.zzcio();
    public static final com.google.android.gms.internal.ads.zzbpq zzm = new com.google.android.gms.internal.ads.zzcip();
    public static final com.google.android.gms.internal.ads.zzbpq zzn = new com.google.android.gms.internal.ads.zzboj();
    public static final com.google.android.gms.internal.ads.zzbqh zzo = new com.google.android.gms.internal.ads.zzbqh();
    public static final com.google.android.gms.internal.ads.zzbpq zzp = new com.google.android.gms.internal.ads.zzbpd();
    public static final com.google.android.gms.internal.ads.zzbpq zzq = new com.google.android.gms.internal.ads.zzbpe();
    public static final com.google.android.gms.internal.ads.zzbpq zzr = new com.google.android.gms.internal.ads.zzbok();
    public static final com.google.android.gms.internal.ads.zzbpq zzs = new com.google.android.gms.internal.ads.zzbol();
    public static final com.google.android.gms.internal.ads.zzbpq zzt = new com.google.android.gms.internal.ads.zzbom();
    public static final com.google.android.gms.internal.ads.zzbpq zzu = new com.google.android.gms.internal.ads.zzbon();
    public static final com.google.android.gms.internal.ads.zzbpq zzv = new com.google.android.gms.internal.ads.zzboo();
    public static final com.google.android.gms.internal.ads.zzbpq zzw = new com.google.android.gms.internal.ads.zzbop();
    public static final com.google.android.gms.internal.ads.zzbpq zzx = new com.google.android.gms.internal.ads.zzboq();
    public static final com.google.android.gms.internal.ads.zzbpq zzy = new com.google.android.gms.internal.ads.zzbor();
    public static final com.google.android.gms.internal.ads.zzbpq zzz = new com.google.android.gms.internal.ads.zzbos();
    public static final com.google.android.gms.internal.ads.zzbpq zzA = new com.google.android.gms.internal.ads.zzbot();
    public static final com.google.android.gms.internal.ads.zzbpq zzB = new com.google.android.gms.internal.ads.zzbov();
    public static final com.google.android.gms.internal.ads.zzbpq zzC = new com.google.android.gms.internal.ads.zzbow();

    public static com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcku zzckuVar, java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            com.google.android.gms.internal.ads.zzbap zzS = zzckuVar.zzS();
            com.google.android.gms.internal.ads.zzflc zzT = zzckuVar.zzT();
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznw)).booleanValue() || zzT == null) {
                if (zzS != null && zzS.zza(parse)) {
                    parse = zzS.zzd(parse, zzckuVar.getContext(), zzckuVar.zzE(), zzckuVar.zzj());
                }
            } else if (zzS != null && zzS.zza(parse)) {
                parse = zzT.zza(parse, zzckuVar.getContext(), zzckuVar.zzE(), zzckuVar.zzj());
            }
        } catch (com.google.android.gms.internal.ads.zzbaq unused) {
            java.lang.String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        }
        java.util.Map hashMap = new java.util.HashMap();
        if (zzckuVar.zzC() != null) {
            hashMap = zzckuVar.zzC().zzaw;
        }
        final java.lang.String zzb2 = com.google.android.gms.internal.ads.zzceb.zzb(parse, zzckuVar.getContext(), hashMap);
        long longValue = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkp.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 261210000) {
            return com.google.android.gms.internal.ads.zzhbw.zza(zzb2);
        }
        com.google.android.gms.internal.ads.zzhbo zzw2 = com.google.android.gms.internal.ads.zzhbo.zzw(zzckuVar.zzaF());
        com.google.android.gms.internal.ads.zzbph zzbphVar = com.google.android.gms.internal.ads.zzbph.zza;
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzh;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(zzw2, java.lang.Throwable.class, zzbphVar, zzhcgVar), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzbpi
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                java.lang.String str2 = (java.lang.String) obj;
                com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
                java.lang.String str3 = zzb2;
                if (str2 != null) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzf.zze()).booleanValue()) {
                        java.lang.String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        java.lang.String host = android.net.Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    java.lang.String str4 = (java.lang.String) com.google.android.gms.internal.ads.zzbkp.zza.zze();
                    java.lang.String str5 = (java.lang.String) com.google.android.gms.internal.ads.zzbkp.zzb.zze();
                    if (!android.text.TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!android.text.TextUtils.isEmpty(str5)) {
                        android.net.Uri parse2 = android.net.Uri.parse(str3);
                        if (android.text.TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzhcgVar), java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzbpj
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                java.lang.Throwable th = (java.lang.Throwable) obj;
                com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkp.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzhcgVar);
    }

    public static com.google.android.gms.internal.ads.zzbpq zzb(final com.google.android.gms.internal.ads.zzdky zzdkyVar, final com.google.android.gms.internal.ads.zzctj zzctjVar) {
        return new com.google.android.gms.internal.ads.zzbpq() { // from class: com.google.android.gms.internal.ads.zzbpk
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
                com.google.android.gms.internal.ads.zzbpp.zzc(map, com.google.android.gms.internal.ads.zzdky.this);
                final java.lang.String str = (java.lang.String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final com.google.android.gms.internal.ads.zzctj zzctjVar2 = zzctjVar;
                com.google.android.gms.internal.ads.zzhbo zzw2 = com.google.android.gms.internal.ads.zzhbo.zzw(com.google.android.gms.internal.ads.zzbpp.zza(zzckuVar, str));
                com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzbpn
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                        com.google.android.gms.internal.ads.zzctj zzctjVar3;
                        java.lang.String str2 = (java.lang.String) obj2;
                        com.google.android.gms.internal.ads.zzbpq zzbpqVar = com.google.android.gms.internal.ads.zzbpp.zza;
                        return (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue() && (zzctjVar3 = com.google.android.gms.internal.ads.zzctj.this) != null && com.google.android.gms.internal.ads.zzctj.zzc(str)) ? zzctjVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zzh()) : com.google.android.gms.internal.ads.zzhbw.zza(str2);
                    }
                };
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
                com.google.android.gms.internal.ads.zzhbw.zzr((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(zzw2, zzhbeVar, zzhcgVar), new com.google.android.gms.internal.ads.zzbou(zzckuVar), zzhcgVar);
            }
        };
    }

    public static void zzc(java.util.Map map, com.google.android.gms.internal.ads.zzdky zzdkyVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmg)).booleanValue() && map.containsKey("sc") && ((java.lang.String) map.get("sc")).equals("1") && zzdkyVar != null) {
            zzdkyVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:9|10|11)|(12:49|50|14|(10:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(2:30|(1:32)))|33|34|35|(1:37)|38|39|41|42)|13|14|(0)|33|34|35|(0)|38|39|41|42|7) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r0 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcmg zzcmgVar, java.util.Map map) {
        java.lang.String optString;
        java.lang.String optString2;
        java.lang.String optString3;
        java.lang.String optString4;
        java.lang.String optString5;
        java.lang.String optString6;
        java.lang.String optString7;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.Intent parseUri;
        android.content.pm.PackageManager packageManager = zzcmgVar.getContext().getPackageManager();
        try {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject((java.lang.String) map.get("data")).getJSONArray("intents");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
                        optString4 = jSONObject2.optString(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE);
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (org.json.JSONException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the intent data.", e);
                    }
                    if (!android.text.TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = android.content.Intent.parseUri(optString7, 0);
                        } catch (java.net.URISyntaxException e2) {
                            java.lang.String.valueOf(optString7);
                            java.lang.String valueOf = java.lang.String.valueOf(optString7);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new android.content.Intent();
                            if (!android.text.TextUtils.isEmpty(optString2)) {
                                parseUri.setData(android.net.Uri.parse(optString2));
                            }
                            if (!android.text.TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!android.text.TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!android.text.TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!android.text.TextUtils.isEmpty(optString6)) {
                                java.lang.String[] split = optString6.split(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new android.content.ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        android.content.Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    android.content.Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((com.google.android.gms.internal.ads.zzbsm) zzcmgVar).zzd("openableIntents", jSONObject);
            } catch (org.json.JSONException unused) {
                ((com.google.android.gms.internal.ads.zzbsm) zzcmgVar).zzd("openableIntents", new org.json.JSONObject());
            }
        } catch (org.json.JSONException unused2) {
            ((com.google.android.gms.internal.ads.zzbsm) zzcmgVar).zzd("openableIntents", new org.json.JSONObject());
        }
    }
}
