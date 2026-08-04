package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
abstract class zzgbk extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgbi(null);
    private static final Runnable zzb = new zzgbi(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgbh zzgbhVar = null;
        boolean z4 = false;
        int i7 = 0;
        while (true) {
            if (!(runnable instanceof zzgbh)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgbhVar = (zzgbh) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z4 = Thread.interrupted() || z4;
                    LockSupport.park(zzgbhVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z4) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzg = zzg();
            if (!zZzg) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzgbv.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzc(threadCurrentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzc(threadCurrentThread);
            }
            if (zZzg) {
                return;
            }
            zze(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strH;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strH = "running=[DONE]";
        } else if (runnable instanceof zzgbh) {
            strH = "running=[INTERRUPTED]";
        } else {
            strH = runnable instanceof Thread ? AbstractC0486a1.h("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return k.f(strH, ", ", zzb());
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgbh zzgbhVar = new zzgbh(this, null);
            zzgbhVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgbhVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                    }
                } finally {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }
}
