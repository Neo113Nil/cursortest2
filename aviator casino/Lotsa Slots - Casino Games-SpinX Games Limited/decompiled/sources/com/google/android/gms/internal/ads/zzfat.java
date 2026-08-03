package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfat implements com.google.android.gms.internal.ads.zzfci {
    private final java.util.Map zza;

    public zzfat(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.Map map = this.zza;
        if (map.isEmpty()) {
            return;
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziN)).booleanValue()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    com.google.android.gms.internal.ads.zzear zzearVar = (com.google.android.gms.internal.ads.zzear) entry.getKey();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("id", zzearVar.zza());
                        jSONObject.put("event_type", zzearVar.zzb());
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        java.util.Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((java.lang.Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        java.util.Map map2 = this.zza;
        com.google.android.gms.internal.ads.zzhde zzb = com.google.android.gms.internal.ads.zzhdh.zzb();
        for (java.util.Map.Entry entry2 : map2.entrySet()) {
            java.util.ArrayDeque arrayDeque2 = (java.util.ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                com.google.android.gms.internal.ads.zzear zzearVar2 = (com.google.android.gms.internal.ads.zzear) entry2.getKey();
                int zza = com.google.android.gms.internal.ads.zzhdb.zza(zzearVar2.zzb());
                if (zza != 0) {
                    com.google.android.gms.internal.ads.zzhdc zza2 = com.google.android.gms.internal.ads.zzhdd.zza();
                    zza2.zza(zzearVar2.zza());
                    zza2.zzb(zza);
                    com.google.android.gms.internal.ads.zzhdd zzhddVar = (com.google.android.gms.internal.ads.zzhdd) zza2.zzbu();
                    com.google.android.gms.internal.ads.zzhdf zza3 = com.google.android.gms.internal.ads.zzhdg.zza();
                    zza3.zza(zzhddVar);
                    zza3.zzb(arrayDeque2);
                    zzb.zza(zza3);
                }
            }
        }
        com.google.android.gms.internal.ads.zzhdh zzhdhVar = (com.google.android.gms.internal.ads.zzhdh) zzb.zzbu();
        if (zzhdhVar.zza() > 0) {
            bundle.putString("ods", android.util.Base64.encodeToString(zzhdhVar.zzaN(), 11));
        }
    }
}
