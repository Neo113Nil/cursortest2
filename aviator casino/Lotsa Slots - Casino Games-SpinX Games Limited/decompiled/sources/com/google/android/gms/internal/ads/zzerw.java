package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzerw {
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.Map zzb = new java.util.HashMap();
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private final java.util.Map zze = new java.util.HashMap();
    private final java.util.concurrent.Executor zzf;
    private org.json.JSONObject zzg;

    zzerw(java.util.concurrent.Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        org.json.JSONObject zzg;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcw)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                try {
                    org.json.JSONArray jSONArray = zzg.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        android.os.Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                        java.lang.String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!android.text.TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new com.google.android.gms.internal.ads.zzesa(optString, optBoolean2, optBoolean, true, zzp));
                        }
                    }
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzk() {
        org.json.JSONObject zzg;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zzb.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcx)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                try {
                    org.json.JSONArray jSONArray = zzg.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                        java.lang.String optString = jSONObject.optString("adapter_class_name");
                        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!android.text.TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                java.lang.String optString2 = jSONObject2.optString(com.ironsource.M6.H);
                                com.google.android.gms.internal.ads.zzesa zzesaVar = new com.google.android.gms.internal.ads.zzesa(optString, optBoolean2, optBoolean, optBoolean3, new android.os.Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzesaVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzesaVar);
                                }
                            }
                        }
                    }
                } catch (org.json.JSONException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzl() {
        org.json.JSONArray optJSONArray;
        org.json.JSONObject zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg();
        if (zzg != null) {
            try {
                org.json.JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                this.zzg = zzg.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        org.json.JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        java.lang.String lowerCase = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmp)).booleanValue() ? jSONObject.optString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, "").toLowerCase(java.util.Locale.ROOT) : jSONObject.optString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, "");
                        java.lang.String optString = jSONObject.optString("format", "");
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.addAll(zzm(optJSONArray.getJSONObject(i2), optString));
                            }
                        }
                        zzn(optString, lowerCase, arrayList);
                    }
                }
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e);
            }
        }
    }

    private final synchronized java.util.List zzm(org.json.JSONObject jSONObject, java.lang.String str) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        if (jSONObject != null) {
            android.os.Bundle zzp = zzp(jSONObject.optJSONObject("data"));
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
            if (optJSONArray != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    java.lang.String optString = optJSONArray.optString(i, "");
                    if (!android.text.TextUtils.isEmpty(optString)) {
                        arrayList2.add(optString);
                    }
                }
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    java.lang.String str2 = (java.lang.String) arrayList2.get(i2);
                    zze(str2);
                    if (((com.google.android.gms.internal.ads.zzery) this.zza.get(str2)) != null) {
                        arrayList.add(new com.google.android.gms.internal.ads.zzery(str2, str, zzp));
                    }
                }
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(java.lang.String str, java.lang.String str2, java.util.List list) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        java.util.Map map = this.zzc;
        java.util.Map map2 = (java.util.Map) map.get(str);
        if (map2 == null) {
            map2 = new java.util.HashMap();
        }
        map.put(str, map2);
        java.util.List list2 = (java.util.List) map2.get(str2);
        if (list2 == null) {
            list2 = new java.util.ArrayList();
        }
        list2.addAll(list);
        map2.put(str2, list2);
    }

    private final synchronized com.google.android.gms.internal.ads.zzgwp zzo(java.lang.String str) {
        java.util.HashMap hashMap;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
            boolean matches = java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzef), str);
            boolean matches2 = java.util.regex.Pattern.matches((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeg), str);
            if (matches) {
                hashMap = new java.util.HashMap(this.zze);
            } else if (matches2) {
                hashMap = new java.util.HashMap(this.zzd);
            }
            return com.google.android.gms.internal.ads.zzgwp.zzc(hashMap);
        }
        return com.google.android.gms.internal.ads.zzgwp.zza();
    }

    private static final android.os.Bundle zzp(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzerv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzerw.this.zzf();
            }
        });
        this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzert
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzerw.this.zzg();
            }
        });
    }

    public final synchronized java.util.Map zzb() {
        if (android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
            return com.google.android.gms.internal.ads.zzgwp.zza();
        }
        return com.google.android.gms.internal.ads.zzgwp.zzc(this.zzb);
    }

    public final synchronized java.util.Map zzc(java.lang.String str, java.lang.String str2) {
        java.util.Map map;
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()) && (map = (java.util.Map) this.zzc.get(str)) != null) {
            java.util.List<com.google.android.gms.internal.ads.zzery> list = (java.util.List) map.get(str2);
            if (list == null) {
                java.lang.String zza = com.google.android.gms.internal.ads.zzdxj.zza(this.zzg, str2, str);
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmp)).booleanValue()) {
                    zza = zza.toLowerCase(java.util.Locale.ROOT);
                }
                list = (java.util.List) map.get(zza);
            }
            if (list != null) {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (com.google.android.gms.internal.ads.zzery zzeryVar : list) {
                    java.lang.String str3 = zzeryVar.zza;
                    if (!hashMap.containsKey(str3)) {
                        hashMap.put(str3, new java.util.ArrayList());
                    }
                    ((java.util.List) hashMap.get(str3)).add(zzeryVar.zzb);
                }
                return com.google.android.gms.internal.ads.zzgwp.zzc(hashMap);
            }
        }
        return com.google.android.gms.internal.ads.zzgwp.zza();
    }

    public final synchronized java.util.Map zzd(java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap;
        java.util.Map zzc = zzc(str, str2);
        com.google.android.gms.internal.ads.zzgwp zzo = zzo(str2);
        hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : zzc.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            if (zzo.containsKey(str3)) {
                com.google.android.gms.internal.ads.zzesa zzesaVar = (com.google.android.gms.internal.ads.zzesa) zzo.get(str3);
                java.util.List list = (java.util.List) entry.getValue();
                hashMap.put(str3, new com.google.android.gms.internal.ads.zzesa(str3, zzesaVar.zzb, zzesaVar.zzc, zzesaVar.zzd, (list == null || list.isEmpty()) ? new android.os.Bundle() : (android.os.Bundle) list.get(0)));
            }
        }
        com.google.android.gms.internal.ads.zzgza it = zzo.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            java.lang.String str4 = (java.lang.String) entry2.getKey();
            if (!hashMap.containsKey(str4) && ((com.google.android.gms.internal.ads.zzesa) entry2.getValue()).zzd) {
                hashMap.put(str4, (com.google.android.gms.internal.ads.zzesa) entry2.getValue());
            }
        }
        return hashMap;
    }

    public final synchronized void zze(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new com.google.android.gms.internal.ads.zzery(str, "", new android.os.Bundle()));
            }
        }
    }

    final /* synthetic */ void zzf() {
        this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeru
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzerw.this.zzh();
            }
        });
    }
}
