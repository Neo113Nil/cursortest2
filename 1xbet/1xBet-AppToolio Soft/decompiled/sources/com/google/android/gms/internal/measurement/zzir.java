package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzir implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzik zzaqv;

    zzir(zzik zzikVar, zzeb zzebVar) {
        this.zzaqv = zzikVar;
        this.zzapd = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfa zzfaVar;
        zzfaVar = this.zzaqv.zzaqp;
        if (zzfaVar == null) {
            this.zzaqv.zzgi().zziv().log("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzfaVar.zzb(this.zzapd);
            this.zzaqv.zzcu();
        } catch (RemoteException e) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send measurementEnabled to the service", e);
        }
    }
}
