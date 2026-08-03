package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbov implements com.google.android.gms.internal.ads.zzbpq {
    zzbov() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) map.get("args"));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(zzckuVar.getContext()).edit();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj2 = jSONObject.get(next);
                if (obj2 instanceof java.lang.Integer) {
                    edit.putInt(next, ((java.lang.Integer) obj2).intValue());
                } else if (obj2 instanceof java.lang.Long) {
                    edit.putLong(next, ((java.lang.Long) obj2).longValue());
                } else if (obj2 instanceof java.lang.Double) {
                    edit.putFloat(next, ((java.lang.Double) obj2).floatValue());
                } else if (obj2 instanceof java.lang.Float) {
                    edit.putFloat(next, ((java.lang.Float) obj2).floatValue());
                } else if (obj2 instanceof java.lang.Boolean) {
                    edit.putBoolean(next, ((java.lang.Boolean) obj2).booleanValue());
                } else if (obj2 instanceof java.lang.String) {
                    edit.putString(next, (java.lang.String) obj2);
                }
            }
            edit.apply();
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "GMSG write local storage KV pairs handler");
        }
    }
}
