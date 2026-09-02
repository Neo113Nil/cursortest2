package g;

import a.AbstractC0018a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: g.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034d extends AbstractC0018a {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f515f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f516g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f517h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f518i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f519j;

    public C0034d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f515f = atomicReferenceFieldUpdater;
        this.f516g = atomicReferenceFieldUpdater2;
        this.f517h = atomicReferenceFieldUpdater3;
        this.f518i = atomicReferenceFieldUpdater4;
        this.f519j = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0018a
    public final boolean d(AbstractFutureC0037g abstractFutureC0037g, C0033c c0033c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f518i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0037g, c0033c, C0033c.f513b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0037g) == c0033c);
        return false;
    }

    @Override // a.AbstractC0018a
    public final boolean e(AbstractFutureC0037g abstractFutureC0037g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f519j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0037g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0037g) == obj);
        return false;
    }

    @Override // a.AbstractC0018a
    public final boolean f(AbstractFutureC0037g abstractFutureC0037g, C0036f c0036f, C0036f c0036f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f517h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0037g, c0036f, c0036f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0037g) == c0036f);
        return false;
    }

    @Override // a.AbstractC0018a
    public final void u(C0036f c0036f, C0036f c0036f2) {
        this.f516g.lazySet(c0036f, c0036f2);
    }

    @Override // a.AbstractC0018a
    public final void v(C0036f c0036f, Thread thread) {
        this.f515f.lazySet(c0036f, thread);
    }
}
