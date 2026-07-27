package s0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1413a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f11749a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11750b;

    public ThreadFactoryC1413a(boolean z) {
        this.f11750b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (this.f11750b ? "WM.task-" : "androidx.work-") + this.f11749a.incrementAndGet());
    }
}
