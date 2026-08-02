package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzx implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.zzw zza;
    final /* synthetic */ java.util.concurrent.Callable zzb;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zza(this.zzb.call());
        } catch (java.lang.Exception e) {
            this.zza.zzc(e);
        } catch (java.lang.Throwable th) {
            this.zza.zzc(new java.lang.RuntimeException(th));
        }
    }

    zzx(com.google.android.gms.tasks.zzw zzwVar, java.util.concurrent.Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }
}
