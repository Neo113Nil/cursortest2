package W5;

import C0.RunnableC0085d;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import java.util.concurrent.ScheduledExecutorService;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class I0 extends AbstractC0438e {

    /* renamed from: d, reason: collision with root package name */
    public w1.F0 f6822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q0 f6823e;

    public I0(Q0 q02) {
        this.f6823e = q02;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0457y g(C1726n0 c1726n0) {
        Q0 q02 = this.f6823e;
        q02.f6972p.f();
        p3.f.q("Channel is being terminated", !q02.f6941L);
        return new P0(q02, c1726n0);
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
        Q0 q02 = this.f6823e;
        q02.f6972p.f();
        q02.f6972p.execute(new RunnableC0085d(this, 18));
    }

    @Override // U5.AbstractC0438e
    public final void r(EnumC0446m enumC0446m, U5.L l7) {
        Q0 q02 = this.f6823e;
        q02.f6972p.f();
        p3.f.k(enumC0446m, "newState");
        p3.f.k(l7, "newPicker");
        q02.f6972p.execute(new H2.q(10, this, l7, enumC0446m, false));
    }
}
