package p028d6;

import D3.j;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import java.util.List;
import p003a.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AbstractC0457y {
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
        j jVarU0 = a.u0(this);
        jVarU0.a(q(), "delegate");
        return jVarU0.toString();
    }
}
