package f2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1943a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f16973a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16974b;

    public ThreadFactoryC1943a(boolean z3) {
        this.f16974b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f16974b ? "WM.task-" : "androidx.work-") + this.f16973a.incrementAndGet());
    }
}
