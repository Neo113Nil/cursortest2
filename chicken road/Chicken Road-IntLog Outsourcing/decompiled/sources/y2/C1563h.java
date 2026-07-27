package y2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: y2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563h implements InterfaceC1560e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f12366a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f12367b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f12368c = new AtomicBoolean(false);

    public C1563h(ExecutorService executorService) {
        this.f12366a = executorService;
    }

    @Override // y2.InterfaceC1560e
    public final void a(RunnableC1558c runnableC1558c) {
        this.f12367b.add(runnableC1558c);
        this.f12366a.execute(new B2.b(23, this));
    }
}
