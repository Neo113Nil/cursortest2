package d6;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import a.AbstractC0603a;
import java.util.List;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0968b extends AbstractC0457y {
    @Override // U5.AbstractC0457y
    public final List b() {
        return q().b();
    }

    @Override // U5.AbstractC0457y
    public final AbstractC0438e d() {
        return q().d();
    }

    @Override // U5.AbstractC0457y
    public final Object e() {
        return q().e();
    }

    @Override // U5.AbstractC0457y
    public final void l() {
        q().l();
    }

    @Override // U5.AbstractC0457y
    public void m() {
        q().m();
    }

    @Override // U5.AbstractC0457y
    public void p(List list) {
        q().p(list);
    }

    public abstract AbstractC0457y q();

    public String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(q(), "delegate");
        return u02.toString();
    }
}
