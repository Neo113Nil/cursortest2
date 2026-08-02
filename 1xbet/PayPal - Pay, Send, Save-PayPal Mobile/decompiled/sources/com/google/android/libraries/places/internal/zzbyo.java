package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyo {
    private final java.util.concurrent.atomic.AtomicLong zza = new java.util.concurrent.atomic.AtomicLong();

    zzbyo() {
    }

    final long zza(long j) {
        return this.zza.addAndGet(j);
    }
}
