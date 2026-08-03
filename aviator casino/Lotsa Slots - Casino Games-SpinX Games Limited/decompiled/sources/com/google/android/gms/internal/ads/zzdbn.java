package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdbn {
    private final java.util.concurrent.atomic.AtomicLong zza;

    zzdbn(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfkqVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j) {
        this.zza.set(j);
    }
}
