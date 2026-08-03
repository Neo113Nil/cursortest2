package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqj implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzbqi zza;

    public zzbqj(com.google.android.gms.internal.ads.zzbqi zzbqiVar) {
        this.zza = zzbqiVar;
    }

    public static void zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbqi zzbqiVar) {
        zzckuVar.zzab("/reward", new com.google.android.gms.internal.ads.zzbqj(zzbqiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.ads.zzccb zzccbVar = null;
        try {
            int parseInt = java.lang.Integer.parseInt((java.lang.String) map.get(com.ironsource.C3300u.l));
            java.lang.String str2 = (java.lang.String) map.get("type");
            if (!android.text.TextUtils.isEmpty(str2)) {
                zzccbVar = new com.google.android.gms.internal.ads.zzccb(str2, parseInt);
            }
        } catch (java.lang.NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e);
        }
        this.zza.zzb(zzccbVar);
    }
}
