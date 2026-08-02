package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzsu extends com.google.android.libraries.places.internal.zzua {
    private static final com.google.android.libraries.places.internal.zztp zza = new com.google.android.libraries.places.internal.zzst();
    private final java.util.concurrent.atomic.AtomicLong zzb = new java.util.concurrent.atomic.AtomicLong(androidx.collection.SieveCacheKt.NodeLinkMask);

    zzsu() {
    }

    static com.google.android.libraries.places.internal.zzua zza(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zztn zztnVar) {
        java.lang.Integer num = (java.lang.Integer) zzutVar.zzd(com.google.android.libraries.places.internal.zzth.zzb);
        if (num == null) {
            return null;
        }
        com.google.android.libraries.places.internal.zzsu zzsuVar = (com.google.android.libraries.places.internal.zzsu) zza.zzb(zztnVar, zzutVar);
        return zzsuVar.zzb.incrementAndGet() >= ((long) num.intValue()) ? zzsuVar : zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzua
    public final void zzb() {
        this.zzb.set(0L);
    }
}
