package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfh {
    private static final com.google.android.libraries.places.internal.zzbfh zza = new com.google.android.libraries.places.internal.zzbfh();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.libraries.places.internal.zzbfm zzb = new com.google.android.libraries.places.internal.zzbep();

    private zzbfh() {
    }

    final com.google.android.libraries.places.internal.zzbfl zzb(java.lang.Class cls) {
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzc;
        com.google.android.libraries.places.internal.zzbfl zzbflVar = (com.google.android.libraries.places.internal.zzbfl) concurrentMap.get(cls);
        if (zzbflVar == null) {
            zzbflVar = this.zzb.zza(cls);
            com.google.android.libraries.places.internal.zzbfl zzbflVar2 = (com.google.android.libraries.places.internal.zzbfl) concurrentMap.putIfAbsent(cls, zzbflVar);
            if (zzbflVar2 != null) {
                return zzbflVar2;
            }
        }
        return zzbflVar;
    }

    static com.google.android.libraries.places.internal.zzbfh zza() {
        return zza;
    }
}
