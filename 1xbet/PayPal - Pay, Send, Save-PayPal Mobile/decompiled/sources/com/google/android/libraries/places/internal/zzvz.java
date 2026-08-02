package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzvz extends com.google.android.libraries.places.internal.zzwd {
    private static final com.google.android.libraries.places.internal.zzvz zza = new com.google.android.libraries.places.internal.zzvz(com.google.android.libraries.places.internal.zzwd.zze());
    private final java.util.concurrent.atomic.AtomicReference zzb;

    zzvz(com.google.android.libraries.places.internal.zzwd zzwdVar) {
        this.zzb = new java.util.concurrent.atomic.AtomicReference(zzwdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzwd
    public final boolean zzb(java.lang.String str, java.util.logging.Level level, boolean z) {
        ((com.google.android.libraries.places.internal.zzwd) this.zzb.get()).zzb(str, level, z);
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzwd
    public final com.google.android.libraries.places.internal.zzwo zzc() {
        return ((com.google.android.libraries.places.internal.zzwd) this.zzb.get()).zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzwd
    public final com.google.android.libraries.places.internal.zzut zzd() {
        return ((com.google.android.libraries.places.internal.zzwd) this.zzb.get()).zzd();
    }

    public static final com.google.android.libraries.places.internal.zzvz zza() {
        return zza;
    }
}
