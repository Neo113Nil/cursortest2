package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zziz implements Runnable {
    private final /* synthetic */ zzfa zzard;
    private final /* synthetic */ zziy zzare;

    zziz(zziy zziyVar, zzfa zzfaVar) {
        this.zzare = zziyVar;
        this.zzard = zzfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzare) {
            zziy.zza(this.zzare, false);
            if (!this.zzare.zzaqv.isConnected()) {
                this.zzare.zzaqv.zzgi().zzjc().log("Connected to service");
                this.zzare.zzaqv.zza(this.zzard);
            }
        }
    }
}
