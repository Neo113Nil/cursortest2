package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbop implements com.google.android.libraries.places.internal.zzbug {
    private final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong();

    zzbop() {
    }

    @Override // com.google.android.libraries.places.internal.zzbug
    public final void zza(long j) {
        this.zza.getAndAdd(1L);
    }
}
