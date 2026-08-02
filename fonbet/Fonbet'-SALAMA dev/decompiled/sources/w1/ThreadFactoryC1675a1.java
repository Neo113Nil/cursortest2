package w1;

import java.util.concurrent.ThreadFactory;

/* renamed from: w1.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1675a1 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f17637a = new ThreadGroup("HttpRequestManager");

    /* renamed from: b, reason: collision with root package name */
    public final int f17638b = 1;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f17637a;
        Thread thread = new Thread(threadGroup, runnable);
        thread.setName(threadGroup.getName() + ":" + thread.getId());
        thread.setPriority(this.f17638b);
        return thread;
    }
}
