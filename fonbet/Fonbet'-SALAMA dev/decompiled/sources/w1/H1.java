package w1;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class H1 extends AbstractC1765z1 implements C1 {

    /* renamed from: A, reason: collision with root package name */
    public volatile int f17392A;

    /* renamed from: B, reason: collision with root package name */
    public final ConcurrentLinkedQueue f17393B;

    /* renamed from: C, reason: collision with root package name */
    public C1761y0 f17394C;

    /* renamed from: z, reason: collision with root package name */
    public final H1 f17395z;

    public H1(H1 h12) {
        super(AbstractC1753v1.a(EnumC1747t1.f17863a), false);
        this.f17392A = 1;
        this.f17395z = h12;
        this.f17393B = new ConcurrentLinkedQueue();
        this.f17392A = 2;
    }

    public int a(W1 w12) {
        H1 h12 = this.f17395z;
        if (h12 != null) {
            return h12.a(w12);
        }
        return 2;
    }

    public final void h(C1761y0 c1761y0) {
        this.f17392A = 3;
        this.f17394C = c1761y0;
        j();
        H1 h12 = this.f17395z;
        if (h12 != null) {
            h12.h(new C1761y0(this, 24));
            return;
        }
        if (c1761y0 != null) {
            ((H1) c1761y0.f17932b).d(new C1717l(c1761y0, 8));
        }
        this.f17392A = 4;
    }

    public abstract void i(C2 c22);

    public final int k(C2 c22) {
        int i7 = F1.f17377a[this.f17392A - 1];
        if (i7 == 3 || i7 == 4) {
            this.f17393B.add(c22);
            c22.b();
            return 3;
        }
        if (i7 != 5) {
            return 2;
        }
        i(c22);
        return 1;
    }

    public final void l(C2 c22) {
        H1 h12 = this.f17395z;
        if (h12 != null) {
            int k7 = h12.k(c22);
            Objects.toString(h12);
            if (k7 != 1 && k7 != 2 && k7 != 3) {
                throw null;
            }
        }
    }

    public void j() {
    }
}
