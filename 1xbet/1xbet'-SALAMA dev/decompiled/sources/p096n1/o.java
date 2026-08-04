package p096n1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15344b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f15343a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f15344b);
                this.f15344b = this.f15344b + 1;
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("flutter-worker-");
                int i7 = this.f15344b;
                this.f15344b = i7 + 1;
                sb.append(i7);
                thread.setName(sb.toString());
                return thread;
        }
    }
}
