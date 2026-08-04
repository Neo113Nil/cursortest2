package W5;

import C0.RunnableC0085d;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import java.util.concurrent.ScheduledExecutorService;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractC0438e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p155w1.F0 f6822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q0 f6823e;

    public I0(Q0 q1) {
        this.f6823e = q1;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0457y g(C1017n0 c1017n0) {
        Q0 q1 = this.f6823e;
        q1.f6972p.f();
        p113p3.f.q("Channel is being terminated", !q1.f6941L);
        return new P0(q1, c1017n0);
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0438e h() {
        return this.f6823e.f6947R;
    }

    @Override // U5.AbstractC0438e
    public final ScheduledExecutorService i() {
        return this.f6823e.j;
    }

    @Override // U5.AbstractC0438e
    public final U5.p0 j() {
        return this.f6823e.f6972p;
    }

    @Override // U5.AbstractC0438e
    public final void q() {
        Q0 q1 = this.f6823e;
        q1.f6972p.f();
        q1.f6972p.execute(new RunnableC0085d(this, 18));
    }

    @Override // U5.AbstractC0438e
    public final void r(EnumC0446m enumC0446m, U5.L l7) {
        Q0 q1 = this.f6823e;
        q1.f6972p.f();
        p113p3.f.k(enumC0446m, "newState");
        p113p3.f.k(l7, "newPicker");
        q1.f6972p.execute(new H2.q(10, this, l7, enumC0446m, false));
    }
}
