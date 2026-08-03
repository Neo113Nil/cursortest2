package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbpy implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzeao zza;

    public zzbpy(com.google.android.gms.internal.ads.zzeao zzeaoVar) {
        this.zza = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("id") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("id")) || !map.containsKey("event_type") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(java.lang.Long.parseLong((java.lang.String) map.get("id")), java.lang.Integer.parseInt((java.lang.String) map.get("event_type")), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (java.lang.NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
