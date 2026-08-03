package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcgw implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzchb zza;

    zzcgw(com.google.android.gms.internal.ads.zzchb zzchbVar) {
        java.util.Objects.requireNonNull(zzchbVar);
        this.zza = zzchbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new java.lang.String[0]);
    }
}
