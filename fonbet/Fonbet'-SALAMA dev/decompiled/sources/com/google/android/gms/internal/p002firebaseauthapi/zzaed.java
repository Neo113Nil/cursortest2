package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzaed implements Runnable {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzaea zzb;

    public zzaed(zzaea zzaeaVar, zzaeg zzaegVar) {
        this.zza = zzaegVar;
        this.zzb = zzaeaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            try {
                if (!this.zzb.zza.zzh.isEmpty()) {
                    this.zza.zza(this.zzb.zza.zzh.get(0), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
