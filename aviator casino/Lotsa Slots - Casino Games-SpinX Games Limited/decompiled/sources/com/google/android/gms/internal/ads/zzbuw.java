package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbuw {
    public final java.util.List zza;

    public zzbuw(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            java.lang.String jSONObject2 = jSONObject.toString(2);
            java.lang.String.valueOf(jSONObject2);
            com.google.android.gms.ads.internal.util.zze.zza("Mediation Response JSON: ".concat(java.lang.String.valueOf(jSONObject2)));
        }
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                com.google.android.gms.internal.ads.zzbuv zzbuvVar = new com.google.android.gms.internal.ads.zzbuv(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbuvVar.zzc);
                arrayList.add(zzbuvVar);
                if (i < 0) {
                    java.util.Iterator it = zzbuvVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((java.lang.String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        jSONArray.length();
        this.zza = java.util.Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzt.zzx();
            com.google.android.gms.internal.ads.zzbux.zza(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            com.google.android.gms.internal.ads.zzccb.zza(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
