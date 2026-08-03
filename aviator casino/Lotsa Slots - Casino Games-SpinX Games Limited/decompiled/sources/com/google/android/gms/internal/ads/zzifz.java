package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzifz {
    private static final com.google.android.gms.internal.ads.zzifz zza = new com.google.android.gms.internal.ads.zzifz();
    private final java.util.concurrent.ConcurrentHashMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.ads.zzifg zzb = new com.google.android.gms.internal.ads.zzifg();

    private zzifz() {
    }

    static com.google.android.gms.internal.ads.zzifz zza() {
        return zza;
    }

    private <T> com.google.android.gms.internal.ads.zzigh<T> zzc(java.lang.Class<T> cls) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzc;
        com.google.android.gms.internal.ads.zzigh<T> zza2 = this.zzb.zza(cls);
        com.google.android.gms.internal.ads.zzigh<T> zzighVar = (com.google.android.gms.internal.ads.zzigh) concurrentHashMap.putIfAbsent(cls, zza2);
        return zzighVar != null ? zzighVar : zza2;
    }

    final com.google.android.gms.internal.ads.zzigh zzb(java.lang.Class cls) {
        java.lang.Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (com.google.android.gms.internal.ads.zzigh) obj;
    }
}
