package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbny extends com.google.android.libraries.places.internal.zzbjr {
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbny.class.getName());
    static final java.lang.ThreadLocal zza = new java.lang.ThreadLocal();

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final com.google.android.libraries.places.internal.zzbjs zza(com.google.android.libraries.places.internal.zzbjs zzbjsVar) {
        com.google.android.libraries.places.internal.zzbjs zzc = zzc();
        zza.set(zzbjsVar);
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final void zzb(com.google.android.libraries.places.internal.zzbjs zzbjsVar, com.google.android.libraries.places.internal.zzbjs zzbjsVar2) {
        if (zzc() != zzbjsVar) {
            zzb.logp(java.util.logging.Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new java.lang.Throwable().fillInStackTrace());
        }
        if (zzbjsVar2 != com.google.android.libraries.places.internal.zzbjs.zzb) {
            zza.set(zzbjsVar2);
        } else {
            zza.set(null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final com.google.android.libraries.places.internal.zzbjs zzc() {
        com.google.android.libraries.places.internal.zzbjs zzbjsVar = (com.google.android.libraries.places.internal.zzbjs) zza.get();
        return zzbjsVar == null ? com.google.android.libraries.places.internal.zzbjs.zzb : zzbjsVar;
    }

    zzbny() {
    }
}
