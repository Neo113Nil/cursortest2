package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes4.dex */
final class zzj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.appset.zzl zza;

    /* synthetic */ zzj(com.google.android.gms.internal.appset.zzl zzlVar, com.google.android.gms.internal.appset.zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        long zza = this.zza.zza();
        if (zza == -1 || com.google.android.gms.common.util.DefaultClock.getInstance().currentTimeMillis() <= zza) {
            return;
        }
        context = this.zza.zzb;
        com.google.android.gms.internal.appset.zzl.zze(context);
    }
}
