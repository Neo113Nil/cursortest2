package com.google.android.gms.internal.measurement;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class zzgm extends Thread {
    private final /* synthetic */ zzgi zzanx;
    private final Object zzaoa;
    private final BlockingQueue<zzgl<?>> zzaob;

    public zzgm(zzgi zzgiVar, String str, BlockingQueue<zzgl<?>> blockingQueue) {
        this.zzanx = zzgiVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzaoa = new Object();
        this.zzaob = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzanx.zzgi().zziy().zzg(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzgm zzgmVar;
        zzgm zzgmVar2;
        Object obj3;
        Object obj4;
        Semaphore semaphore2;
        Object obj5;
        zzgm zzgmVar3;
        zzgm zzgmVar4;
        boolean z;
        Semaphore semaphore3;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore3 = this.zzanx.zzant;
                semaphore3.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzgl<?> poll = this.zzaob.poll();
                if (poll == null) {
                    synchronized (this.zzaoa) {
                        if (this.zzaob.peek() == null) {
                            z = this.zzanx.zzanu;
                            if (!z) {
                                try {
                                    this.zzaoa.wait(30000L);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj3 = this.zzanx.zzans;
                    synchronized (obj3) {
                        if (this.zzaob.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(poll.zzanz ? threadPriority : 10);
                    poll.run();
                }
            }
            obj4 = this.zzanx.zzans;
            synchronized (obj4) {
                semaphore2 = this.zzanx.zzant;
                semaphore2.release();
                obj5 = this.zzanx.zzans;
                obj5.notifyAll();
                zzgmVar3 = this.zzanx.zzanm;
                if (this == zzgmVar3) {
                    zzgi.zza(this.zzanx, null);
                } else {
                    zzgmVar4 = this.zzanx.zzann;
                    if (this == zzgmVar4) {
                        zzgi.zzb(this.zzanx, null);
                    } else {
                        this.zzanx.zzgi().zziv().log("Current scheduler thread is neither worker nor network");
                    }
                }
            }
        } catch (Throwable th) {
            obj = this.zzanx.zzans;
            synchronized (obj) {
                semaphore = this.zzanx.zzant;
                semaphore.release();
                obj2 = this.zzanx.zzans;
                obj2.notifyAll();
                zzgmVar = this.zzanx.zzanm;
                if (this != zzgmVar) {
                    zzgmVar2 = this.zzanx.zzann;
                    if (this == zzgmVar2) {
                        zzgi.zzb(this.zzanx, null);
                    } else {
                        this.zzanx.zzgi().zziv().log("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    zzgi.zza(this.zzanx, null);
                }
                throw th;
            }
        }
    }

    public final void zzjx() {
        synchronized (this.zzaoa) {
            this.zzaoa.notifyAll();
        }
    }
}
