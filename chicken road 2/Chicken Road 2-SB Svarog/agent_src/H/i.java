package H;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f242a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f243b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f244c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f242a = executorService;
    }

    @Override // H.e
    public final void a(c cVar) {
        this.f243b.add(cVar);
        this.f242a.execute(new h(0, this));
    }
}
