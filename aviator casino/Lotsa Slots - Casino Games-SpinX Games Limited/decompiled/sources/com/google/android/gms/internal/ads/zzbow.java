package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbow implements com.google.android.gms.internal.ads.zzbpq {
    zzbow() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) map.get("args"));
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(zzckuVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "GMSG clear local storage keys handler");
        }
    }
}
