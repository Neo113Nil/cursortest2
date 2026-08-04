package p155w1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: w1.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0966a1 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadGroup f17643a = new ThreadGroup("HttpRequestManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17644b = 1;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f17643a;
        Thread thread = new Thread(threadGroup, runnable);
        thread.setName(threadGroup.getName() + ":" + thread.getId());
        thread.setPriority(this.f17644b);
        return thread;
    }
}
