package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzin implements Runnable {
    private final /* synthetic */ zzeb zzapd;
    private final /* synthetic */ zzik zzaqv;
    private final /* synthetic */ AtomicReference zzaqw;

    zzin(zzik zzikVar, AtomicReference atomicReference, zzeb zzebVar) {
        this.zzaqv = zzikVar;
        this.zzaqw = atomicReference;
        this.zzapd = zzebVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzfa zzfaVar;
        synchronized (this.zzaqw) {
            try {
                try {
                    zzfaVar = this.zzaqv.zzaqp;
                } catch (RemoteException e) {
                    this.zzaqv.zzgi().zziv().zzg("Failed to get app instance id", e);
                    atomicReference = this.zzaqw;
                }
                if (zzfaVar == null) {
                    this.zzaqv.zzgi().zziv().log("Failed to get app instance id");
                    return;
                }
                this.zzaqw.set(zzfaVar.zzc(this.zzapd));
                String str = (String) this.zzaqw.get();
                if (str != null) {
                    this.zzaqv.zzfy().zzbu(str);
                    this.zzaqv.zzgj().zzama.zzbv(str);
                }
                this.zzaqv.zzcu();
                atomicReference = this.zzaqw;
                atomicReference.notify();
            } finally {
                this.zzaqw.notify();
            }
        }
    }
}
