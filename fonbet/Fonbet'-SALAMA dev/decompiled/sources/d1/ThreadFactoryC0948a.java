package d1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0948a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f12332a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12333b;

    public ThreadFactoryC0948a(boolean z4) {
        this.f12333b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder c3 = t.e.c(this.f12333b ? "WM.task-" : "androidx.work-");
        c3.append(this.f12332a.incrementAndGet());
        return new Thread(runnable, c3.toString());
    }
}
