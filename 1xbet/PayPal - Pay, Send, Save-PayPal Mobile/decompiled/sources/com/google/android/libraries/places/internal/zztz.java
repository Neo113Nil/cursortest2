package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zztz {
    private static final com.google.android.libraries.places.internal.zztp zza = new com.google.android.libraries.places.internal.zzty();
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicInteger zzc = new java.util.concurrent.atomic.AtomicInteger();

    private zztz() {
    }

    static int zza(com.google.android.libraries.places.internal.zzua zzuaVar, com.google.android.libraries.places.internal.zztn zztnVar, com.google.android.libraries.places.internal.zzut zzutVar) {
        com.google.android.libraries.places.internal.zztz zztzVar = (com.google.android.libraries.places.internal.zztz) zza.zzb(zztnVar, zzutVar);
        int incrementAndGet = zztzVar.zzc.incrementAndGet();
        if (zzuaVar == com.google.android.libraries.places.internal.zzua.zzc || !zztzVar.zzb.compareAndSet(false, true)) {
            return -1;
        }
        try {
            zzuaVar.zzb();
            zztzVar.zzb.set(false);
            zztzVar.zzc.addAndGet(-incrementAndGet);
            return incrementAndGet - 1;
        } catch (java.lang.Throwable th) {
            zztzVar.zzb.set(false);
            throw th;
        }
    }

    /* synthetic */ zztz(byte[] bArr) {
    }
}
