package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
final class zzat implements Runnable {
    private final /* synthetic */ zzal zzdu;

    zzat(zzal zzalVar) {
        this.zzdu = zzalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzah;
        zzal.zza(this.zzdu, (ScheduledFuture) null);
        zzah = this.zzdu.zzah();
        if (zzah) {
            this.zzdu.interrupt("connection_idle");
        } else {
            this.zzdu.zzag();
        }
    }
}
