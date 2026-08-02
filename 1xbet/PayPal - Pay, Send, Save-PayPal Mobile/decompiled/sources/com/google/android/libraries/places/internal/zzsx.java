package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzsx extends com.google.android.libraries.places.internal.zzua {
    private static final com.google.android.libraries.places.internal.zztp zza = new com.google.android.libraries.places.internal.zzsv();
    private final java.util.concurrent.atomic.AtomicLong zzb = new java.util.concurrent.atomic.AtomicLong(-1);

    zzsx() {
    }

    static com.google.android.libraries.places.internal.zzua zza(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zztn zztnVar, long j) {
        if (((com.google.android.libraries.places.internal.zzsw) zzutVar.zzd(com.google.android.libraries.places.internal.zzth.zzd)) == null) {
            return null;
        }
        com.google.android.libraries.places.internal.zzsx zzsxVar = (com.google.android.libraries.places.internal.zzsx) zza.zzb(zztnVar, zzutVar);
        com.google.android.libraries.places.internal.zzxb.zzb(j >= 0, "timestamp cannot be negative");
        java.util.concurrent.atomic.AtomicLong atomicLong = zzsxVar.zzb;
        long j2 = atomicLong.get();
        if (j2 >= 0) {
            throw null;
        }
        atomicLong.compareAndSet(j2, -j);
        return zzsxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzua
    public final void zzb() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzb;
        atomicLong.set(java.lang.Math.max(-atomicLong.get(), 0L));
    }
}
