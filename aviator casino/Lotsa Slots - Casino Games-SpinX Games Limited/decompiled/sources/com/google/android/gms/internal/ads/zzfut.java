package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfut extends java.util.TimerTask {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfuv zza;
    final /* synthetic */ java.util.Timer zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfuw zzc;

    zzfut(com.google.android.gms.internal.ads.zzfuw zzfuwVar, com.google.android.gms.internal.ads.zzfuv zzfuvVar, java.util.Timer timer) {
        this.zza = zzfuvVar;
        this.zzb = timer;
        java.util.Objects.requireNonNull(zzfuwVar);
        this.zzc = zzfuwVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
