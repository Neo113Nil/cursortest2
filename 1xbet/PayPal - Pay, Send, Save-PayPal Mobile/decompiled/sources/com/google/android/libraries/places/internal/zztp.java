package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zztp {
    private final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();

    protected zztp() {
    }

    protected abstract java.lang.Object zza();

    public final java.lang.Object zzb(com.google.android.libraries.places.internal.zztn zztnVar, com.google.android.libraries.places.internal.zzut zzutVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zza;
        java.lang.Object obj = concurrentHashMap.get(zztnVar);
        if (obj != null) {
            return obj;
        }
        java.lang.Object zza = zza();
        java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(zztnVar, zza);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int zza2 = zzutVar.zza();
        com.google.android.libraries.places.internal.zzto zztoVar = null;
        for (int i = 0; i < zza2; i++) {
            if (com.google.android.libraries.places.internal.zzth.zzf.equals(zzutVar.zzb(i))) {
                java.lang.Object zzc = zzutVar.zzc(i);
                if (zzc instanceof com.google.android.libraries.places.internal.zztt) {
                    if (zztoVar == null) {
                        zztoVar = new com.google.android.libraries.places.internal.zzto(this, zztnVar);
                    }
                    ((com.google.android.libraries.places.internal.zztt) zzc).zza();
                }
            }
        }
        return zza;
    }

    final /* synthetic */ java.util.concurrent.ConcurrentHashMap zzc() {
        return this.zza;
    }
}
