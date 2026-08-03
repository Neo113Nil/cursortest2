package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzekj extends java.util.TimerTask {
    final /* synthetic */ android.app.AlertDialog zza;
    final /* synthetic */ java.util.Timer zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zzc;

    zzekj(com.google.android.gms.internal.ads.zzekr zzekrVar, android.app.AlertDialog alertDialog, java.util.Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzmVar;
        java.util.Objects.requireNonNull(zzekrVar);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
