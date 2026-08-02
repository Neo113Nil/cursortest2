package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzo extends com.google.android.libraries.places.internal.zzbzn {
    private final java.util.concurrent.atomic.AtomicIntegerFieldUpdater zza;

    @Override // com.google.android.libraries.places.internal.zzbzn
    public final boolean zza(com.google.android.libraries.places.internal.zzbzq zzbzqVar, int i, int i2) {
        return this.zza.compareAndSet(zzbzqVar, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.zzbzn
    public final void zzb(com.google.android.libraries.places.internal.zzbzq zzbzqVar, int i) {
        this.zza.set(zzbzqVar, 0);
    }

    /* synthetic */ zzbzo(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte[] bArr) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }
}
