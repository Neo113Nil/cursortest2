package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ThreadFactory;

/* compiled from: PriorityThreadFactory.java */
/* loaded from: classes6.dex */
public class o implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final int f9008a;

    /* compiled from: PriorityThreadFactory.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f9009a;

        a(Runnable runnable) {
            this.f9009a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f9008a);
            } catch (Throwable th) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th.getMessage());
            }
            try {
                this.f9009a.run();
            } catch (Exception e) {
                q0.b("PriorityThreadFactory", "runnable error : " + e.getMessage());
            }
        }
    }

    o(int i) {
        this.f9008a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
