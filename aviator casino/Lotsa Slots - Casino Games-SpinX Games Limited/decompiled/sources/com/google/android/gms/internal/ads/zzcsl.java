package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcsl implements com.google.android.gms.internal.ads.zzcrt {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcsl(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        int intValue;
        java.lang.String str = (java.lang.String) map.get("default_queue_capacity");
        if (str == null || (intValue = java.lang.Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzU(intValue);
    }
}
