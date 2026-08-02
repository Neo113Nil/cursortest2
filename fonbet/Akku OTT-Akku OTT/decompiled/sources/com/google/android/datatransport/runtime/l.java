package com.google.android.datatransport.runtime;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l implements Executor {
    public final Executor a;

    public static class a implements Runnable {
        public final Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.run();
            } catch (Exception unused) {
                Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("Executor"), 6);
            }
        }
    }

    public l(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
