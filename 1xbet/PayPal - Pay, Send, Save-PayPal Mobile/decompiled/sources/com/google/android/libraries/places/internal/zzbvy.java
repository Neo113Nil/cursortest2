package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvy extends com.google.android.libraries.places.internal.zzbso {
    private static final java.lang.ref.ReferenceQueue zza = new java.lang.ref.ReferenceQueue();
    private static final java.util.concurrent.ConcurrentMap zzb = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.logging.Logger zzc = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbvy.class.getName());
    private final com.google.android.libraries.places.internal.zzbvx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbvy(com.google.android.libraries.places.internal.zzblw zzblwVar) {
        super(zzblwVar);
        java.lang.ref.ReferenceQueue referenceQueue = zza;
        java.util.concurrent.ConcurrentMap concurrentMap = zzb;
        this.zzd = new com.google.android.libraries.places.internal.zzbvx(this, zzblwVar, referenceQueue, concurrentMap);
    }

    @Override // com.google.android.libraries.places.internal.zzbso, com.google.android.libraries.places.internal.zzblw
    public final com.google.android.libraries.places.internal.zzblw zzd() {
        this.zzd.zzb();
        return super.zzd();
    }
}
