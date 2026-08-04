package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzaos {
    private final Executor zza;

    public zzaos(Handler handler) {
        this.zza = new zzaoq(this, handler);
    }

    public final void zza(zzapb zzapbVar, zzapk zzapkVar) {
        zzapbVar.zzm("post-error");
        ((zzaoq) this.zza).zza.post(new zzaor(zzapbVar, zzaph.zza(zzapkVar), null));
    }

    public final void zzb(zzapb zzapbVar, zzaph zzaphVar, Runnable runnable) {
        zzapbVar.zzq();
        zzapbVar.zzm("post-response");
        ((zzaoq) this.zza).zza.post(new zzaor(zzapbVar, zzaphVar, runnable));
    }
}
