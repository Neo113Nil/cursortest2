package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaor implements Runnable {
    private final zzapb zza;
    private final zzaph zzb;
    private final Runnable zzc;

    public zzaor(zzapb zzapbVar, zzaph zzaphVar, Runnable runnable) {
        this.zza = zzapbVar;
        this.zzb = zzaphVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzaph zzaphVar = this.zzb;
        if (zzaphVar.zzc()) {
            this.zza.zzo(zzaphVar.zza);
        } else {
            this.zza.zzn(zzaphVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
