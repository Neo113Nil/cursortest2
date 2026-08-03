package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhbu implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.ads.zzhbt zzb;

    zzhbu(java.util.concurrent.Future future, com.google.android.gms.internal.ads.zzhbt zzhbtVar) {
        this.zza = future;
        this.zzb = zzhbtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable zza;
        java.util.concurrent.Future future = this.zza;
        if ((future instanceof com.google.android.gms.internal.ads.zzhcy) && (zza = com.google.android.gms.internal.ads.zzhcz.zza((com.google.android.gms.internal.ads.zzhcy) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(com.google.android.gms.internal.ads.zzhbw.zzs(future));
        } catch (java.util.concurrent.ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (java.lang.Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final java.lang.String toString() {
        com.google.android.gms.internal.ads.zzgtf zzb = com.google.android.gms.internal.ads.zzgtg.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}
