package H1;

import G1.C0140k;
import G1.C0143n;
import G1.H;
import G1.N;
import G1.O;
import P.AbstractC0329z;
import P.C0305m0;
import X3.C;
import androidx.lifecycle.EnumC0487p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s4.M;

@N("composable")
/* loaded from: classes.dex */
public final class i extends O {

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f2216c = AbstractC0329z.t(Boolean.FALSE);

    @Override // G1.O
    public final G1.y a() {
        return new h(this, c.f2212a);
    }

    @Override // G1.O
    public final void d(List list, H h3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0140k c0140k = (C0140k) it.next();
            C0143n b3 = b();
            kotlin.jvm.internal.l.f("backStackEntry", c0140k);
            M m5 = b3.f1918c;
            Iterable iterable = (Iterable) m5.getValue();
            boolean z3 = iterable instanceof Collection;
            s4.x xVar = b3.f1920e;
            if (!z3 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C0140k) it2.next()) == c0140k) {
                        Iterable iterable2 = (Iterable) ((M) xVar.f19316k).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C0140k) it3.next()) == c0140k) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C0140k c0140k2 = (C0140k) X3.m.f0((List) ((M) xVar.f19316k).getValue());
            if (c0140k2 != null) {
                m5.j(null, C.P((Set) m5.getValue(), c0140k2));
            }
            m5.j(null, C.P((Set) m5.getValue(), c0140k));
            b3.f(c0140k);
        }
        this.f2216c.setValue(Boolean.FALSE);
    }

    @Override // G1.O
    public final void e(C0140k c0140k, boolean z3) {
        b().e(c0140k, z3);
        this.f2216c.setValue(Boolean.TRUE);
    }

    public final void g(C0140k c0140k) {
        C0143n b3 = b();
        kotlin.jvm.internal.l.f("entry", c0140k);
        M m5 = b3.f1918c;
        m5.j(null, C.P((Set) m5.getValue(), c0140k));
        if (!b3.f1922h.f1832g.contains(c0140k)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c0140k.h(EnumC0487p.f7061n);
    }
}
