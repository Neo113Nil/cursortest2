package androidx.work;

import Ij.C3261b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f45258a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f45259b;

    b(boolean z11) {
        this.f45259b = z11;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder e11 = C3261b.e(this.f45259b ? "WM.task-" : "androidx.work-");
        e11.append(this.f45258a.incrementAndGet());
        return new Thread(runnable, e11.toString());
    }
}
