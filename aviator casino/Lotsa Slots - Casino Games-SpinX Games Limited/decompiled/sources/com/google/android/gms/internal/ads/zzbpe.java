package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbpe implements com.google.android.gms.internal.ads.zzbpq {
    zzbpe() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        if (map.containsKey("start")) {
            zzckuVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzckuVar.zzas(false);
        }
    }
}
