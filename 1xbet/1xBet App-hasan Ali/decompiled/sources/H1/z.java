package H1;

import G1.C0140k;
import G1.E;
import P.C0305m0;
import P.d1;
import c4.AbstractC0548i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4.InterfaceC2280u;
import u.t0;

/* loaded from: classes.dex */
public final class z extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0 f2272k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f2273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f2274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d1 f2275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f2276o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t0 t0Var, E e3, Map map, d1 d1Var, i iVar, a4.c cVar) {
        super(2, cVar);
        this.f2272k = t0Var;
        this.f2273l = e3;
        this.f2274m = map;
        this.f2275n = d1Var;
        this.f2276o = iVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new z(this.f2272k, this.f2273l, this.f2274m, this.f2275n, this.f2276o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        zVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        t0 t0Var = this.f2272k;
        Object e3 = t0Var.f19937a.e();
        C0305m0 c0305m0 = t0Var.f19940d;
        if (kotlin.jvm.internal.l.a(e3, c0305m0.getValue())) {
            E e5 = this.f2273l;
            if (((C0140k) e5.f1832g.h()) == null || kotlin.jvm.internal.l.a(c0305m0.getValue(), (C0140k) e5.f1832g.h())) {
                Iterator it = ((List) this.f2275n.getValue()).iterator();
                while (it.hasNext()) {
                    this.f2276o.b().b((C0140k) it.next());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map map = this.f2274m;
                for (Map.Entry entry : map.entrySet()) {
                    if (!kotlin.jvm.internal.l.a(entry.getKey(), ((C0140k) c0305m0.getValue()).f1903p)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map.remove(((Map.Entry) it2.next()).getKey());
                }
            }
        }
        return W3.o.f6046a;
    }
}
