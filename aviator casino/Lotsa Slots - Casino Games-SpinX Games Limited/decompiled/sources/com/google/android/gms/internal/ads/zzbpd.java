package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbpd implements com.google.android.gms.internal.ads.zzbpq {
    zzbpd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        if (map.containsKey("start")) {
            zzckuVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzckuVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzckuVar.zzP().zzt();
        }
    }
}
