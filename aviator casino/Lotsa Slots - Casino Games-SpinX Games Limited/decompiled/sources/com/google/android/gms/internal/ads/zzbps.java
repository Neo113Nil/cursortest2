package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbps implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzbpt zza;

    public zzbps(com.google.android.gms.internal.ads.zzbpt zzbptVar) {
        this.zza = zzbptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = java.lang.Float.parseFloat((java.lang.String) map.get("blurRadius"));
            }
        } catch (java.lang.NumberFormatException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e);
        }
        com.google.android.gms.internal.ads.zzbpt zzbptVar = this.zza;
        zzbptVar.zza(equals);
        zzbptVar.zzb(equals2, f);
        zzckuVar.zzaE(equals);
    }
}
