package I3;

import java.util.Iterator;
import java.util.Map;
import r3.AbstractC2349a;

/* renamed from: I3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185o extends F3.y {

    /* renamed from: a, reason: collision with root package name */
    public final C0187q f2671a;

    public AbstractC0185o(C0187q c0187q) {
        this.f2671a = c0187q;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        if (aVar.K() == 9) {
            aVar.G();
            return null;
        }
        Object c5 = c();
        Map map = this.f2671a.f2674a;
        try {
            aVar.d();
            while (aVar.n()) {
                C0184n c0184n = (C0184n) map.get(aVar.E());
                if (c0184n == null) {
                    aVar.Q();
                } else {
                    e(c5, aVar, c0184n);
                }
            }
            aVar.k();
            return d(c5);
        } catch (IllegalAccessException e3) {
            AbstractC2349a abstractC2349a = K3.c.f2892a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalStateException e5) {
            throw new F3.p(e5);
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (obj == null) {
            bVar.n();
            return;
        }
        bVar.f();
        try {
            Iterator it = this.f2671a.f2675b.iterator();
            while (it.hasNext()) {
                ((C0184n) it.next()).a(bVar, obj);
            }
            bVar.k();
        } catch (IllegalAccessException e3) {
            AbstractC2349a abstractC2349a = K3.c.f2892a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, N3.a aVar, C0184n c0184n);
}
