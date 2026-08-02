package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC0683a implements ThreadFactory {

    /* renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    public class RunnableC0054a implements Runnable {
        public final /* synthetic */ Runnable a;

        public RunnableC0054a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new RunnableC0054a(runnable), "glide-active-resources");
    }
}
