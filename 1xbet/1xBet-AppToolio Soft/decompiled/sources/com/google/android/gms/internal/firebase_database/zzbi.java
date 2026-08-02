package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
final class zzbi implements Runnable {
    private final /* synthetic */ zzbh zzfh;

    zzbi(zzbh zzbhVar) {
        this.zzfh = zzbhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        zzhz zzhzVar;
        zzhz zzhzVar2;
        scheduledFuture = this.zzfh.zzff.zzfd;
        scheduledFuture.cancel(false);
        zzbc.zza(this.zzfh.zzff, true);
        zzhzVar = this.zzfh.zzff.zzbs;
        if (zzhzVar.zzfa()) {
            zzhzVar2 = this.zzfh.zzff.zzbs;
            zzhzVar2.zza("websocket opened", null, new Object[0]);
        }
        this.zzfh.zzff.zzas();
    }
}
