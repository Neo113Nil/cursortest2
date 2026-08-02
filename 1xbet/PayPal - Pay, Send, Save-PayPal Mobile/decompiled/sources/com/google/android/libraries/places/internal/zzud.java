package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzud extends com.google.android.libraries.places.internal.zzua {
    private static final com.google.android.libraries.places.internal.zztp zzb = new com.google.android.libraries.places.internal.zzub();
    private static final java.lang.ThreadLocal zze = new com.google.android.libraries.places.internal.zzuc();
    final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger();

    zzud() {
    }

    static com.google.android.libraries.places.internal.zzua zza(com.google.android.libraries.places.internal.zzut zzutVar, com.google.android.libraries.places.internal.zztn zztnVar) {
        java.lang.Integer num = (java.lang.Integer) zzutVar.zzd(com.google.android.libraries.places.internal.zzth.zzc);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        com.google.android.libraries.places.internal.zzud zzudVar = (com.google.android.libraries.places.internal.zzud) zzb.zzb(zztnVar, zzutVar);
        return (((java.util.Random) zze.get()).nextInt(num.intValue()) == 0 ? zzudVar.zza.incrementAndGet() : zzudVar.zza.get()) > 0 ? zzudVar : zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzua
    public final void zzb() {
        this.zza.decrementAndGet();
    }
}
