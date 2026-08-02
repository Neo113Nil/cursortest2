package p2;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class p implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f18730a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("WorkManager-WorkTimer-thread-" + this.f18730a);
        this.f18730a = this.f18730a + 1;
        return newThread;
    }
}
