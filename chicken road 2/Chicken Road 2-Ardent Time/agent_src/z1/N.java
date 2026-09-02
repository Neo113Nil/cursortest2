package z1;

/* loaded from: classes.dex */
public final class N extends z1.S {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8535f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final s1.l f8536e;

    public N(s1.l lVar) {
        this.f8536e = lVar;
    }

    @Override // s1.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        k((java.lang.Throwable) obj);
        return h1.C0177i.f3302a;
    }

    @Override // z1.U
    public final void k(java.lang.Throwable th) {
        if (f8535f.compareAndSet(this, 0, 1)) {
            this.f8536e.invoke(th);
        }
    }
}
