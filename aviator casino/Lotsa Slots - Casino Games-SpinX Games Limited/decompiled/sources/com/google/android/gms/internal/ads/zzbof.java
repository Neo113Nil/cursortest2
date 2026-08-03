package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbof implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzbog zza;

    public zzbof(com.google.android.gms.internal.ads.zzbog zzbogVar) {
        this.zza = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (this.zza == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("name");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        android.os.Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbp.zzl(new org.json.JSONObject((java.lang.String) map.get("info")));
            } catch (org.json.JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle != null) {
            this.zza.zza(str, bundle);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }
}
