package p155w1;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class H1 extends AbstractC1056z1 implements C1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile int f17398A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ConcurrentLinkedQueue f17399B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1052y0 f17400C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final H1 f17401z;

    public H1(H1 h6) {
        super(AbstractC1044v1.a(EnumC1038t1.f17869a), false);
        this.f17398A = 1;
        this.f17401z = h6;
        this.f17399B = new ConcurrentLinkedQueue();
        this.f17398A = 2;
    }

    public int a(W1 w7) {
        H1 h6 = this.f17401z;
        if (h6 != null) {
            return h6.a(w7);
        }
        return 2;
    }

    public final void h(C1052y0 c1052y0) {
        this.f17398A = 3;
        this.f17400C = c1052y0;
        j();
        H1 h6 = this.f17401z;
        if (h6 != null) {
            h6.h(new C1052y0(this, 24));
            return;
        }
        if (c1052y0 != null) {
            ((H1) c1052y0.f17938b).d(new C1008l(c1052y0, 8));
        }
        this.f17398A = 4;
    }

    public abstract void i(C2 c3);

    public final int k(C2 c3) {
        int i7 = F1.f17383a[this.f17398A - 1];
        if (i7 == 3 || i7 == 4) {
            this.f17399B.add(c3);
            c3.b();
            return 3;
        }
        if (i7 != 5) {
            return 2;
        }
        i(c3);
        return 1;
    }

    public final void l(C2 c3) {
        H1 h6 = this.f17401z;
        if (h6 != null) {
            int iK = h6.k(c3);
            Objects.toString(h6);
            if (iK != 1 && iK != 2 && iK != 3) {
                throw null;
            }
        }
    }

    public void j() {
    }
}
