package d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import U5.L;
import U5.p0;
import a.AbstractC0603a;
import java.util.concurrent.ScheduledExecutorService;
import w1.C1726n0;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0967a extends AbstractC0438e {
    @Override // U5.AbstractC0438e
    public AbstractC0457y g(C1726n0 c1726n0) {
        return s().g(c1726n0);
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
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(s(), "delegate");
        return u02.toString();
    }
}
