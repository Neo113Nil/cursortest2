package B;

import A0.C0028g0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.e1;
import i4.InterfaceC2015a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements Y.f, Y.c {

    /* renamed from: k, reason: collision with root package name */
    public final Y.g f633k;

    /* renamed from: l, reason: collision with root package name */
    public final C0305m0 f634l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f635m;

    public J(Y.f fVar, Map map) {
        G g5 = new G(fVar, 0);
        e1 e1Var = Y.h.f6114a;
        this.f633k = new Y.g(map, g5);
        this.f634l = AbstractC0329z.t(null);
        this.f635m = new LinkedHashSet();
    }

    @Override // Y.c
    public final void a(Object obj) {
        Y.c cVar = (Y.c) this.f634l.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.a(obj);
    }

    @Override // Y.c
    public final void b(Object obj, X.d dVar, C0315s c0315s, int i) {
        int i5;
        c0315s.Z(-697180401);
        if ((i & 6) == 0) {
            i5 = (c0315s.h(obj) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= c0315s.h(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= c0315s.h(this) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && c0315s.B()) {
            c0315s.S();
        } else {
            Y.c cVar = (Y.c) this.f634l.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.b(obj, dVar, c0315s, i5 & 126);
            boolean h3 = c0315s.h(this) | c0315s.h(obj);
            Object M5 = c0315s.M();
            if (h3 || M5 == C0302l.f4480a) {
                M5 = new C0028g0(8, this, obj);
                c0315s.i0(M5);
            }
            AbstractC0329z.c(obj, (i4.c) M5, c0315s);
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new I(this, obj, dVar, i, 0);
        }
    }

    @Override // Y.f
    public final boolean c(Object obj) {
        return this.f633k.c(obj);
    }

    @Override // Y.f
    public final Map d() {
        Y.c cVar = (Y.c) this.f634l.getValue();
        if (cVar != null) {
            Iterator it = this.f635m.iterator();
            while (it.hasNext()) {
                cVar.a(it.next());
            }
        }
        return this.f633k.d();
    }

    @Override // Y.f
    public final Y.e e(String str, InterfaceC2015a interfaceC2015a) {
        return this.f633k.e(str, interfaceC2015a);
    }

    @Override // Y.f
    public final Object f(String str) {
        return this.f633k.f(str);
    }
}
