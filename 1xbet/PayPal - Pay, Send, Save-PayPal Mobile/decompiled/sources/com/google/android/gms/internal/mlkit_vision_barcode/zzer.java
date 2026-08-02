package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
abstract class zzer extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable zza = new com.google.android.gms.internal.mlkit_vision_barcode.zzeq(null);
    private static final java.lang.Runnable zzb = new com.google.android.gms.internal.mlkit_vision_barcode.zzeq(null);

    zzer() {
    }

    private final void zzg(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.mlkit_vision_barcode.zzeo zzeoVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzeo)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzeoVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzeo) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(zzeoVar);
                }
            } else {
                java.lang.Thread.yield();
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zzf = zzf();
            if (!zzf) {
                try {
                    obj = zza();
                } catch (java.lang.Throwable th) {
                    try {
                        if (th instanceof java.lang.InterruptedException) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzc(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzd(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (zzf) {
                return;
            }
            zzd(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzeo) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + zzb();
    }

    abstract java.lang.Object zza() throws java.lang.Exception;

    abstract java.lang.String zzb();

    abstract void zzc(java.lang.Throwable th);

    abstract void zzd(java.lang.Object obj);

    final void zze() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.android.gms.internal.mlkit_vision_barcode.zzeo zzeoVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzeo(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, zzeoVar)) {
                try {
                    java.lang.Thread thread = (java.lang.Thread) runnable;
                    thread.interrupt();
                    if (((java.lang.Runnable) getAndSet(zza)) == zzb) {
                        java.util.concurrent.locks.LockSupport.unpark(thread);
                    }
                } catch (java.lang.Throwable th) {
                    if (((java.lang.Runnable) getAndSet(zza)) == zzb) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    abstract boolean zzf();
}
