package com.google.android.gms.internal.ads;

import H2.j;
import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
final class zzeap extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ j zzc;

    public zzeap(zzeaq zzeaqVar, AlertDialog alertDialog, Timer timer, j jVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = jVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        j jVar = this.zzc;
        if (jVar != null) {
            jVar.zzb();
        }
    }
}
