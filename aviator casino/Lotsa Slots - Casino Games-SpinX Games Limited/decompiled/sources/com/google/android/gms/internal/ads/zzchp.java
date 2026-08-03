package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzchp implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzchb zza;
    private boolean zzb = false;

    zzchp(com.google.android.gms.internal.ads.zzchb zzchbVar) {
        this.zza = zzchbVar;
    }

    private final void zzc() {
        com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzgamVar.removeCallbacks(this);
        zzgamVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
