package J2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3800a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3801b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3802c;

    public a(String str) {
        this.f3800a = 0;
        this.f3802c = str;
        this.f3801b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3800a) {
            case 0:
                return new Thread(runnable, "AdWorker(" + this.f3802c + ") #" + this.f3801b.getAndIncrement());
            default:
                Thread thread = new Thread(runnable, this.f3802c + this.f3801b.incrementAndGet());
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                thread.setPriority(10);
                return thread;
        }
    }

    public a() {
        this.f3800a = 1;
        this.f3801b = new AtomicInteger(0);
        this.f3802c = "Flurry #";
    }
}
