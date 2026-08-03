package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbbp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbs zza;

    zzbbp(com.google.android.gms.internal.ads.zzbbs zzbbsVar) {
        java.util.Objects.requireNonNull(zzbbsVar);
        this.zza = zzbbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
