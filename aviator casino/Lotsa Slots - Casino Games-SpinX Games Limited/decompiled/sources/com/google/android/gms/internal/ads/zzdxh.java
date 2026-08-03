package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdxh {
    private org.json.JSONObject zzb;
    private final java.util.concurrent.Executor zzc;
    private boolean zzd;
    private org.json.JSONObject zze;
    private final java.util.Map zza = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzdxh(java.util.concurrent.Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdxh.this.zze();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        org.json.JSONObject zzg;
        java.util.Map map;
        this.zzd = true;
        com.google.android.gms.internal.ads.zzcey zzi = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi();
        if (zzi != null && (zzg = zzi.zzg()) != null) {
            this.zzb = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeX)).booleanValue() ? zzg.optJSONObject("common_settings") : null;
            this.zze = zzg.optJSONObject("ad_unit_patterns");
            org.json.JSONArray optJSONArray = zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID);
                        java.lang.String optString2 = optJSONObject.optString("format");
                        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                        if (optString != null && optJSONObject2 != null && optString2 != null) {
                            java.util.Map map2 = this.zza;
                            if (map2.containsKey(optString2)) {
                                map = (java.util.Map) map2.get(optString2);
                            } else {
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                                map2.put(optString2, concurrentHashMap);
                                map = concurrentHashMap;
                            }
                            map.put(optString, optJSONObject2);
                        }
                    }
                }
            }
        }
    }

    public final void zza() {
        zzg();
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdxh.this.zzd();
            }
        });
    }

    @javax.annotation.CheckForNull
    public final org.json.JSONObject zzb(java.lang.String str, java.lang.String str2) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeV)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeW)).booleanValue()) {
                zzg();
            }
        }
        java.util.Map map = (java.util.Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        java.lang.String zza = com.google.android.gms.internal.ads.zzdxj.zza(this.zze, str, str2);
        if (zza != null) {
            return (org.json.JSONObject) map.get(zza);
        }
        return null;
    }

    @javax.annotation.CheckForNull
    public final org.json.JSONObject zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeX)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    final /* synthetic */ void zze() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdxh.this.zzf();
            }
        });
    }
}
