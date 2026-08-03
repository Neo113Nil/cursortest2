package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzasu implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzate zza;
    private final com.google.android.gms.internal.ads.zzatk zzb;
    private final java.lang.Runnable zzc;

    public zzasu(com.google.android.gms.internal.ads.zzate zzateVar, com.google.android.gms.internal.ads.zzatk zzatkVar, java.lang.Runnable runnable) {
        this.zza = zzateVar;
        this.zzb = zzatkVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzate zzateVar = this.zza;
        zzateVar.zzl();
        com.google.android.gms.internal.ads.zzatk zzatkVar = this.zzb;
        if (zzatkVar.zzc()) {
            zzateVar.zzs(zzatkVar.zza);
        } else {
            zzateVar.zzt(zzatkVar.zzc);
        }
        if (zzatkVar.zzd) {
            zzateVar.zzc("intermediate-response");
        } else {
            zzateVar.zzd("done");
        }
        java.lang.Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
