package U2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5857a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5858b;

    public b(String str) {
        this.f5858b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(" + this.f5858b + ") #" + this.f5857a.getAndIncrement());
    }
}
