package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzep extends com.google.android.gms.internal.fido.zzev {
    private static final com.google.android.gms.internal.fido.zzep zza = new com.google.android.gms.internal.fido.zzep(com.google.android.gms.internal.fido.zzev.zze());
    private final java.util.concurrent.atomic.AtomicReference zzb;

    zzep(com.google.android.gms.internal.fido.zzev zzevVar) {
        this.zzb = new java.util.concurrent.atomic.AtomicReference(zzevVar);
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final com.google.android.gms.internal.fido.zzdr zza() {
        return ((com.google.android.gms.internal.fido.zzev) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final com.google.android.gms.internal.fido.zzfi zzc() {
        return ((com.google.android.gms.internal.fido.zzev) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.fido.zzev
    public final boolean zzd(java.lang.String str, java.util.logging.Level level, boolean z) {
        ((com.google.android.gms.internal.fido.zzev) this.zzb.get()).zzd(str, level, z);
        return false;
    }

    public static final com.google.android.gms.internal.fido.zzep zzb() {
        return zza;
    }
}
