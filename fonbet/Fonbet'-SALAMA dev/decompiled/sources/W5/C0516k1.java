package W5;

import C0.RunnableC0085d;
import U5.AbstractC0457y;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: W5.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0516k1 extends U5.L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7264a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7265b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final Object f7266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U5.N f7267d;

    public C0516k1(C0522m1 c0522m1, C0522m1 c0522m12) {
        this.f7267d = c0522m1;
        p3.f.k(c0522m12, "pickFirstLeafLoadBalancer");
        this.f7266c = c0522m12;
    }

    @Override // U5.L
    public final U5.J a(C0539s1 c0539s1) {
        switch (this.f7264a) {
            case 0:
                if (this.f7265b.compareAndSet(false, true)) {
                    U5.p0 j = ((C0522m1) this.f7267d).f7282f.j();
                    C0522m1 c0522m1 = (C0522m1) this.f7266c;
                    Objects.requireNonNull(c0522m1);
                    j.execute(new A1.K0(c0522m1, 17));
                }
                break;
            default:
                if (this.f7265b.compareAndSet(false, true)) {
                    ((C0534q1) this.f7267d).f7315f.j().execute(new RunnableC0085d(this, 21));
                }
                break;
        }
        return U5.J.f6425e;
    }

    public C0516k1(C0534q1 c0534q1, AbstractC0457y abstractC0457y) {
        this.f7267d = c0534q1;
        p3.f.k(abstractC0457y, "subchannel");
        this.f7266c = abstractC0457y;
    }
}
