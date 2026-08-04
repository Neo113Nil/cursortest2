package p028d6;

import D3.j;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import U5.L;
import U5.p0;
import java.util.concurrent.ScheduledExecutorService;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AbstractC0438e {
    @Override // U5.AbstractC0438e
    public AbstractC0457y g(C1017n0 c1017n0) {
        return s().g(c1017n0);
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0438e h() {
        return s().h();
    }

    @Override // U5.AbstractC0438e
    public final ScheduledExecutorService i() {
        return s().i();
    }

    @Override // U5.AbstractC0438e
    public final p0 j() {
        return s().j();
    }

    @Override // U5.AbstractC0438e
    public final void q() {
        s().q();
    }

    @Override // U5.AbstractC0438e
    public void r(EnumC0446m enumC0446m, L l7) {
        s().r(enumC0446m, l7);
    }

    public abstract AbstractC0438e s();

    public final String toString() {
        j jVarU0 = p003a.a.u0(this);
        jVarU0.a(s(), "delegate");
        return jVarU0.toString();
    }
}
