package K1;

import G0.m;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f939a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f940b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f941c = new AtomicBoolean(false);

    public h(ExecutorService executorService) {
        this.f939a = executorService;
    }

    @Override // K1.e
    public final void a(c cVar) {
        this.f940b.add(cVar);
        this.f939a.execute(new m(1, this));
    }
}
