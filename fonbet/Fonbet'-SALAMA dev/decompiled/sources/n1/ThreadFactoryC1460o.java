package n1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: n1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1460o implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15337a;

    /* renamed from: b, reason: collision with root package name */
    public int f15338b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15337a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("WorkManager-WorkTimer-thread-" + this.f15338b);
                this.f15338b = this.f15338b + 1;
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("flutter-worker-");
                int i7 = this.f15338b;
                this.f15338b = i7 + 1;
                sb.append(i7);
                thread.setName(sb.toString());
                return thread;
        }
    }
}
