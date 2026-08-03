package R0;

/* loaded from: classes.dex */
public final class h implements R0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f1675b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f1676c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public h(java.util.concurrent.ExecutorService executorService) {
        this.f1674a = executorService;
    }

    @Override // R0.e
    public final void a(R0.c cVar) {
        this.f1675b.add(cVar);
        this.f1674a.execute(new F0.a(2, this));
    }
}
