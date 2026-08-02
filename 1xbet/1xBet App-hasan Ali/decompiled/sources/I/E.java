package I;

import L.C0213a;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import java.util.ArrayList;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import s4.C2378o;
import s4.InterfaceC2369f;
import u.C2451c;
import y.C2648d;
import y.C2649e;
import y.C2655k;
import y.InterfaceC2653i;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class E implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2394k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2396m;

    public /* synthetic */ E(int i, Object obj, Object obj2) {
        this.f2394k = i;
        this.f2396m = obj;
        this.f2395l = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Type inference failed for: r13v15, types: [c4.i, i4.e] */
    @Override // s4.InterfaceC2369f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, a4.c cVar) {
        C2378o c2378o;
        Object obj2;
        int i;
        E e3;
        switch (this.f2394k) {
            case 0:
                long j5 = ((C1988b) obj).f17191a;
                C2451c c2451c = (C2451c) this.f2396m;
                boolean C5 = G4.d.C(((C1988b) c2451c.d()).f17191a);
                W3.o oVar = W3.o.f6046a;
                if (C5 && G4.d.C(j5) && C1988b.e(((C1988b) c2451c.d()).f17191a) != C1988b.e(j5)) {
                    AbstractC2282w.p((InterfaceC2280u) this.f2395l, null, new D(c2451c, j5, null), 3);
                    return oVar;
                }
                Object e5 = c2451c.e(cVar, new C1988b(j5));
                return e5 == EnumC0510a.f7289k ? e5 : oVar;
            case 1:
                InterfaceC2653i interfaceC2653i = (InterfaceC2653i) obj;
                boolean z3 = interfaceC2653i instanceof y.l;
                C0213a c0213a = (C0213a) this.f2396m;
                if (z3) {
                    y.l lVar = (y.l) interfaceC2653i;
                    L.r rVar = c0213a.f2916r;
                    if (rVar == null) {
                        rVar = L.A.a(c0213a.f2915q);
                        c0213a.f2916r = rVar;
                        kotlin.jvm.internal.l.c(rVar);
                    }
                    L.t a5 = rVar.a(c0213a);
                    a5.b(lVar, c0213a.f2911m, c0213a.f2919u, c0213a.f2920v, ((i0.p) c0213a.f2913o.getValue()).f17295a, ((L.h) c0213a.f2914p.getValue()).f2939d, c0213a.f2921w);
                    c0213a.f2917s.setValue(a5);
                } else if (interfaceC2653i instanceof y.m) {
                    y.l lVar2 = ((y.m) interfaceC2653i).f21126a;
                    L.t tVar = (L.t) c0213a.f2917s.getValue();
                    if (tVar != null) {
                        tVar.d();
                    }
                } else if (interfaceC2653i instanceof C2655k) {
                    y.l lVar3 = ((C2655k) interfaceC2653i).f21124a;
                    L.t tVar2 = (L.t) c0213a.f2917s.getValue();
                    if (tVar2 != null) {
                        tVar2.d();
                    }
                } else {
                    c0213a.f2910l.f(interfaceC2653i, (InterfaceC2280u) this.f2395l);
                }
                return W3.o.f6046a;
            case 2:
                InterfaceC2653i interfaceC2653i2 = (InterfaceC2653i) obj;
                boolean z5 = interfaceC2653i2 instanceof y.n;
                L.w wVar = (L.w) this.f2396m;
                if (!z5) {
                    A.v vVar = wVar.f2985D;
                    if (vVar == null) {
                        vVar = new A.v(wVar.f2984C, wVar.f2991z);
                        AbstractC2749f.m(wVar);
                        wVar.f2985D = vVar;
                    }
                    vVar.f(interfaceC2653i2, (InterfaceC2280u) this.f2395l);
                } else if (wVar.f2988G) {
                    wVar.A0((y.n) interfaceC2653i2);
                } else {
                    wVar.f2989H.a(interfaceC2653i2);
                }
                return W3.o.f6046a;
            case 3:
                if (cVar instanceof C2378o) {
                    c2378o = (C2378o) cVar;
                    int i5 = c2378o.f19292m;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c2378o.f19292m = i5 - Integer.MIN_VALUE;
                        obj2 = c2378o.f19291l;
                        EnumC0510a enumC0510a = EnumC0510a.f7289k;
                        i = c2378o.f19292m;
                        if (i != 0) {
                            G4.l.N(obj2);
                            c2378o.f19290k = this;
                            c2378o.f19294o = obj;
                            c2378o.f19292m = 1;
                            obj2 = ((AbstractC0548i) this.f2396m).invoke(obj, c2378o);
                            if (obj2 == enumC0510a) {
                                return enumC0510a;
                            }
                            e3 = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c2378o.f19294o;
                            e3 = c2378o.f19290k;
                            G4.l.N(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return W3.o.f6046a;
                        }
                        ((kotlin.jvm.internal.w) e3.f2395l).f17624k = obj;
                        throw new t4.a(e3);
                    }
                }
                c2378o = new C2378o(this, cVar);
                obj2 = c2378o.f19291l;
                EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
                i = c2378o.f19292m;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                InterfaceC2653i interfaceC2653i3 = (InterfaceC2653i) obj;
                boolean z6 = interfaceC2653i3 instanceof C2648d;
                ArrayList arrayList = (ArrayList) this.f2396m;
                if (z6) {
                    arrayList.add(interfaceC2653i3);
                } else if (interfaceC2653i3 instanceof C2649e) {
                    arrayList.remove(((C2649e) interfaceC2653i3).f21118a);
                }
                ((InterfaceC0289e0) this.f2395l).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return W3.o.f6046a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(i4.e eVar, kotlin.jvm.internal.w wVar) {
        this.f2394k = 3;
        this.f2396m = (AbstractC0548i) eVar;
        this.f2395l = wVar;
    }
}
