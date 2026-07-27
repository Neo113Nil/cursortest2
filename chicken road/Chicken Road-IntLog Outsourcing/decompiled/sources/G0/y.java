package G0;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f909a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f910b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f911c;

    public y() {
        this.f909a = 0;
        this.f910b = Executors.defaultThreadFactory();
        this.f911c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f909a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f911c;
                Thread newThread = this.f910b.newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = this.f910b.newThread(new O1.j(runnable, 2));
                newThread2.setName((String) this.f911c);
                return newThread2;
        }
    }

    public y(String str) {
        this.f909a = 1;
        this.f910b = Executors.defaultThreadFactory();
        this.f911c = str;
    }
}
