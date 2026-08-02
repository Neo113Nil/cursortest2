package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtg implements com.google.android.libraries.places.internal.zzcag {
    @Override // com.google.android.libraries.places.internal.zzcag
    public final long zza() {
        return com.google.common.math.LongMath.saturatedAdd(java.util.concurrent.TimeUnit.SECONDS.toNanos(java.time.Instant.now().getEpochSecond()), r0.getNano());
    }

    zzbtg() {
    }
}
