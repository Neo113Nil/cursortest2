package H1;

import G1.C0140k;
import P.InterfaceC0289e0;
import P.d1;
import java.util.List;
import java.util.Map;
import t.C2383E;
import t.C2384F;
import t.C2393e;
import t.C2400l;
import t.L;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f2256l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f2257m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.c f2258n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.c f2259o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i4.c f2260p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d1 f2261q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f2262r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Map map, i iVar, i4.c cVar, i4.c cVar2, i4.c cVar3, d1 d1Var, InterfaceC0289e0 interfaceC0289e0) {
        super(1);
        this.f2256l = map;
        this.f2257m = iVar;
        this.f2258n = cVar;
        this.f2259o = cVar2;
        this.f2260p = cVar3;
        this.f2261q = d1Var;
        this.f2262r = interfaceC0289e0;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C2400l c2400l = (C2400l) obj;
        float f = 0.0f;
        if (!((List) this.f2261q.getValue()).contains(c2400l.b())) {
            return new t.u(C2383E.f19339b, C2384F.f19341b, 0.0f, new L(C2393e.f19372l));
        }
        String str = ((C0140k) c2400l.b()).f1903p;
        Map map = this.f2256l;
        Float f5 = (Float) map.get(str);
        if (f5 != null) {
            f = f5.floatValue();
        } else {
            map.put(((C0140k) c2400l.b()).f1903p, Float.valueOf(0.0f));
        }
        if (!kotlin.jvm.internal.l.a(((C0140k) c2400l.c()).f1903p, ((C0140k) c2400l.b()).f1903p)) {
            f = (((Boolean) this.f2257m.f2216c.getValue()).booleanValue() || ((Boolean) this.f2262r.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
        }
        map.put(((C0140k) c2400l.c()).f1903p, Float.valueOf(f));
        return new t.u((C2383E) this.f2258n.c(c2400l), (C2384F) this.f2259o.c(c2400l), f, (L) this.f2260p.c(c2400l));
    }
}
