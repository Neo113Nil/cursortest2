package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public enum zzo implements com.google.android.play.core.splitinstall.zzg {
    INSTANCE;

    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(null);

    @Override // com.google.android.play.core.splitinstall.zzg
    public final com.google.android.play.core.splitinstall.zzh zza() {
        return (com.google.android.play.core.splitinstall.zzh) zzb.get();
    }

    public final void zzb(com.google.android.play.core.splitinstall.zzh zzhVar) {
        zzb.set(zzhVar);
    }
}
