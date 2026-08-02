package com.google.android.gms.internal.firebase_database;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class zzki extends ScheduledThreadPoolExecutor {
    private final /* synthetic */ zzkh zzuj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzki(zzkh zzkhVar, int i, ThreadFactory threadFactory) {
        super(1, threadFactory);
        this.zzuj = zzkhVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException unused2) {
            } catch (ExecutionException e) {
                th = e.getCause();
            }
        }
        if (th != null) {
            this.zzuj.zza(th);
        }
    }
}
