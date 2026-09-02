package b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class I extends L {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f629f = AtomicIntegerFieldUpdater.newUpdater(I.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final U0.l f630e;

    public I(U0.l lVar) {
        this.f630e = lVar;
    }

    @Override // U0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return K0.i.f206a;
    }

    @Override // b1.N
    public final void k(Throwable th) {
        if (f629f.compareAndSet(this, 0, 1)) {
            this.f630e.invoke(th);
        }
    }
}
