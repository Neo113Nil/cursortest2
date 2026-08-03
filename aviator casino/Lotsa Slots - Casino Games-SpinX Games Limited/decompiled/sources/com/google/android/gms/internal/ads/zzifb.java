package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzifb {
    zzifb() {
    }

    public static final java.util.List zza(java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zzieq zzieqVar = (com.google.android.gms.internal.ads.zzieq) com.google.android.gms.internal.ads.zziha.zzm(obj, j);
        if (zzieqVar.zza()) {
            return zzieqVar;
        }
        int size = zzieqVar.size();
        com.google.android.gms.internal.ads.zzieq zzh = zzieqVar.zzh(size == 0 ? 10 : size + size);
        com.google.android.gms.internal.ads.zziha.zzn(obj, j, zzh);
        return zzh;
    }
}
