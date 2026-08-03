package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbpc implements com.google.android.gms.internal.ads.zzbpq {
    zzbpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        java.lang.String str = (java.lang.String) map.get("action");
        if ("pause".equals(str)) {
            zzckuVar.zzdk();
        } else if ("resume".equals(str)) {
            zzckuVar.zzdl();
        }
    }
}
