package sg.bigo.ads.q0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.bigo.ads.q0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ThreadFactoryC5440d implements ThreadFactory {
    public static InterfaceC5437a e;

    /* renamed from: a, reason: collision with root package name */
    public final String f13251a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final ThreadFactory c = Executors.defaultThreadFactory();
    public final boolean d;

    public ThreadFactoryC5440d(String str, boolean z) {
        this.f13251a = "BGAd-" + str;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(runnable);
        newThread.setName(this.f13251a + "-" + this.b.getAndIncrement());
        if (this.d) {
            newThread.setPriority(10);
        }
        newThread.setUncaughtExceptionHandler(new C5439c());
        return newThread;
    }
}
