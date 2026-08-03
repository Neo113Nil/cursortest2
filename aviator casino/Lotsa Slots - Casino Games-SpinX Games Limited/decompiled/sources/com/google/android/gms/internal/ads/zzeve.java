package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeve {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.android.gms.internal.ads.zzevd zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(com.google.android.gms.internal.ads.zzevd zzevdVar) {
        this.zzb = zzevdVar;
    }

    final com.google.android.gms.internal.ads.zzevd zzd() {
        return this.zzb;
    }
}
