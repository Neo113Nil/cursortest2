package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbs zza;

    zzbbr(com.google.android.gms.internal.ads.zzbbs zzbbsVar) {
        java.util.Objects.requireNonNull(zzbbsVar);
        this.zza = zzbbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzbiq.zza(this.zza.zza);
    }
}
