package sg.bigo.ads.q0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.bigo.ads.q0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5447k extends ThreadPoolExecutor {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13258a;

    public C5447k(int i, int i2, String str) {
        super(i2, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5440d(str, false));
        this.f13258a = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        this.f13258a.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13258a.incrementAndGet();
        super.execute(runnable);
    }

    public C5447k(String str, int i, boolean z) {
        super(0, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5440d(str, z));
        this.f13258a = new AtomicInteger(0);
    }
}
