package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbjq {
    static final com.google.android.libraries.places.internal.zzbjr zza;

    static {
        com.google.android.libraries.places.internal.zzbjr zzbnyVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        try {
            zzbnyVar = (com.google.android.libraries.places.internal.zzbjr) java.lang.Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(com.google.android.libraries.places.internal.zzbjr.class).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException e) {
            atomicReference.set(e);
            zzbnyVar = new com.google.android.libraries.places.internal.zzbny();
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Storage override failed to initialize", e2);
        }
        zza = zzbnyVar;
        java.lang.Throwable th = (java.lang.Throwable) atomicReference.get();
        if (th != null) {
            com.google.android.libraries.places.internal.zzbjs.zza.logp(java.util.logging.Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
