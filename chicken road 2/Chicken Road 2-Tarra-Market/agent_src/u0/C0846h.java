package u0;

import androidx.lifecycle.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0846h implements InterfaceC0843e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f6717a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f6718b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f6719c = new AtomicBoolean(false);

    public C0846h(ExecutorService executorService) {
        this.f6717a = executorService;
    }

    @Override // u0.InterfaceC0843e
    public final void a(RunnableC0841c runnableC0841c) {
        this.f6718b.add(runnableC0841c);
        this.f6717a.execute(new o(10, this));
    }
}
