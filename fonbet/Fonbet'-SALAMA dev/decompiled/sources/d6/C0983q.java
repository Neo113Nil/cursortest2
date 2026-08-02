package d6;

import U5.AbstractC0442i;
import U5.l0;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d6.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0983q extends AbstractC0442i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0984r f12463b;

    public C0983q(C0984r c0984r) {
        this.f12463b = c0984r;
    }

    @Override // U5.AbstractC0442i
    public final void m(l0 l0Var) {
        C0978l c0978l = this.f12463b.f12464a;
        boolean e7 = l0Var.e();
        C0981o c0981o = c0978l.f12443a;
        if (c0981o.f12458e == null && c0981o.f12459f == null) {
            return;
        }
        if (e7) {
            ((AtomicLong) c0978l.f12444b.f12441b).getAndIncrement();
        } else {
            ((AtomicLong) c0978l.f12444b.f12442c).getAndIncrement();
        }
    }
}
