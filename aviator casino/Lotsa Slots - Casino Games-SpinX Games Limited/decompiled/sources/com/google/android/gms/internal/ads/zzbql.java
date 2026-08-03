package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbql implements com.google.android.gms.internal.ads.zzbpq {
    private final com.google.android.gms.internal.ads.zzecr zza;

    public zzbql(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzecrVar, "The Inspector Manager must not be null");
        this.zza = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = java.lang.Long.parseLong((java.lang.String) map.get("expires"));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.zza.zzi((java.lang.String) map.get("extras"), j);
    }
}
