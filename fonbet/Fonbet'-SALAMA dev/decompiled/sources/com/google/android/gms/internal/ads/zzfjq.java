package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class zzfjq extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfjs zzb;
    final /* synthetic */ zzces zzc;

    public zzfjq(zzfjs zzfjsVar, zzces zzcesVar, Timer timer) {
        this.zzc = zzcesVar;
        this.zza = timer;
        this.zzb = zzfjsVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzb.zzh();
        zzcet.zzaI(this.zzc.zza, true);
        this.zza.cancel();
    }
}
