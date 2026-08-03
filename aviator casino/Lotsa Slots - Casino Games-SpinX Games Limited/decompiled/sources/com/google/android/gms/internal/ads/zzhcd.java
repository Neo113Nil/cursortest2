package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhcd extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    private static final java.lang.Runnable zza = new com.google.android.gms.internal.ads.zzhcc(null);
    private static final java.lang.Runnable zzb = new com.google.android.gms.internal.ads.zzhcc(null);

    zzhcd() {
    }

    private final void zzb(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.ads.zzhcb zzhcbVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof com.google.android.gms.internal.ads.zzhcb)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzhcbVar = (com.google.android.gms.internal.ads.zzhcb) runnable;
            }
            i++;
            if (i > 1000) {
                java.lang.Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = java.lang.Thread.interrupted() || z;
                    java.util.concurrent.locks.LockSupport.park(zzhcbVar);
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
            boolean z = !zzd();
            if (z) {
                try {
                    obj = zza();
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.ads.zzhco.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzg(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzb(currentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzb(currentThread);
            }
            if (z) {
                zzf(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.ads.zzhcb) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            java.lang.String name = ((java.lang.Thread) runnable).getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append(com.ironsource.X3.j.e);
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        java.lang.String zzc = zzc();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 2 + java.lang.String.valueOf(zzc).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzc);
        return sb2.toString();
    }

    abstract java.lang.Object zza() throws java.lang.Exception;

    abstract java.lang.String zzc();

    abstract boolean zzd();

    abstract void zzf(java.lang.Object obj);

    abstract void zzg(java.lang.Throwable th);

    final void zzh() {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.android.gms.internal.ads.zzhcb zzhcbVar = new com.google.android.gms.internal.ads.zzhcb(this, null);
            zzhcbVar.zza(java.lang.Thread.currentThread());
            if (compareAndSet(runnable, zzhcbVar)) {
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
}
