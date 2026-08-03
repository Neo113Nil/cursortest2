package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznt {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.measurement.zznt zzb = new com.google.android.gms.internal.measurement.zznt();
    private final java.util.concurrent.ConcurrentMap zzd = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.measurement.zznx zzc = new com.google.android.gms.internal.measurement.zznc();

    private zznt() {
    }

    public static com.google.android.gms.internal.measurement.zznt zza() {
        return zzb;
    }

    public final com.google.android.gms.internal.measurement.zznw zzb(java.lang.Class cls) {
        com.google.android.gms.internal.measurement.zzmo.zza(cls, "messageType");
        java.util.concurrent.ConcurrentMap concurrentMap = this.zzd;
        com.google.android.gms.internal.measurement.zznw zznwVar = (com.google.android.gms.internal.measurement.zznw) concurrentMap.get(cls);
        if (zznwVar == null) {
            zznwVar = this.zzc.zza(cls);
            com.google.android.gms.internal.measurement.zzmo.zza(cls, "messageType");
            com.google.android.gms.internal.measurement.zznw zznwVar2 = (com.google.android.gms.internal.measurement.zznw) concurrentMap.putIfAbsent(cls, zznwVar);
            if (zznwVar2 != null) {
                return zznwVar2;
            }
        }
        return zznwVar;
    }
}
