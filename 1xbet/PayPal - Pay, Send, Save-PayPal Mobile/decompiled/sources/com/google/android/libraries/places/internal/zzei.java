package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzei implements com.google.android.libraries.places.internal.zzef {
    @Override // com.google.android.libraries.places.internal.zzef
    public final java.time.Instant zza() {
        return java.time.Instant.now();
    }

    @Override // com.google.android.libraries.places.internal.zzef
    public final long zzb() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
