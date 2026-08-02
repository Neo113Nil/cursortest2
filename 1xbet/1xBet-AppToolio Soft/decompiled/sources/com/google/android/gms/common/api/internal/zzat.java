package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class zzat implements Runnable {
    private final /* synthetic */ zzaj zzhv;

    private zzat(zzaj zzajVar) {
        this.zzhv = zzajVar;
    }

    /* synthetic */ zzat(zzaj zzajVar, zzak zzakVar) {
        this(zzajVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        Lock lock;
        Lock lock2;
        zzbd zzbdVar;
        lock = this.zzhv.zzga;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zzaq();
                }
            } catch (RuntimeException e) {
                zzbdVar = this.zzhv.zzhf;
                zzbdVar.zzb(e);
            }
        } finally {
            lock2 = this.zzhv.zzga;
            lock2.unlock();
        }
    }

    @WorkerThread
    protected abstract void zzaq();
}
