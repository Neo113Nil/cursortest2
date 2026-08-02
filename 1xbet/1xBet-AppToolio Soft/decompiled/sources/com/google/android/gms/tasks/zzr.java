package com.google.android.gms.tasks;

import android.support.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class zzr<TResult> {
    private final Object mLock = new Object();

    @GuardedBy("mLock")
    private Queue<zzq<TResult>> zzaga;

    @GuardedBy("mLock")
    private boolean zzagb;

    zzr() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void zza(@NonNull Task<TResult> task) {
        zzq<TResult> poll;
        synchronized (this.mLock) {
            if (this.zzaga != null && !this.zzagb) {
                this.zzagb = true;
                while (true) {
                    synchronized (this.mLock) {
                        poll = this.zzaga.poll();
                        if (poll == null) {
                            this.zzagb = false;
                            return;
                        }
                    }
                    poll.onComplete(task);
                }
            }
        }
    }

    public final void zza(@NonNull zzq<TResult> zzqVar) {
        synchronized (this.mLock) {
            if (this.zzaga == null) {
                this.zzaga = new ArrayDeque();
            }
            this.zzaga.add(zzqVar);
        }
    }
}
