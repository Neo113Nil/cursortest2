package E;

import b4.EnumC0510a;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import s4.InterfaceC2369f;
import y.C2648d;
import y.C2649e;
import y.C2651g;
import y.C2652h;
import y.C2655k;
import y.InterfaceC2653i;
import z0.AbstractC2749f;

/* renamed from: E.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108m implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1229k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1230l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1231m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1232n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1233o;

    public /* synthetic */ C0108m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1229k = i;
        this.f1230l = obj;
        this.f1231m = obj2;
        this.f1232n = obj3;
        this.f1233o = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    @Override // s4.InterfaceC2369f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, a4.c cVar) {
        t4.l lVar;
        int i;
        C0108m c0108m;
        switch (this.f1229k) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Z z3 = (Z) this.f1230l;
                if (booleanValue && z3.b()) {
                    I.O o5 = (I.O) this.f1232n;
                    W.j((P0.x) this.f1231m, z3, o5.j(), (P0.k) this.f1233o, o5.f2424b);
                } else {
                    W.g(z3);
                }
                return W3.o.f6046a;
            case 1:
                if (cVar instanceof t4.l) {
                    lVar = (t4.l) cVar;
                    int i5 = lVar.f19619o;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar.f19619o = i5 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f19617m;
                        EnumC0510a enumC0510a = EnumC0510a.f7289k;
                        i = lVar.f19619o;
                        if (i != 0) {
                            G4.l.N(obj2);
                            p4.U u5 = (p4.U) ((kotlin.jvm.internal.w) this.f1230l).f17624k;
                            if (u5 != null) {
                                u5.d(new t4.o("Child of the scoped flow was cancelled", 0));
                                lVar.f19615k = this;
                                lVar.f19616l = obj;
                                lVar.f19619o = 1;
                                if (u5.h(lVar) == enumC0510a) {
                                    return enumC0510a;
                                }
                            }
                            c0108m = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f19616l;
                            c0108m = lVar.f19615k;
                            G4.l.N(obj2);
                        }
                        ((kotlin.jvm.internal.w) c0108m.f1230l).f17624k = AbstractC2282w.p((InterfaceC2280u) c0108m.f1231m, null, new t4.k((t4.n) c0108m.f1232n, (InterfaceC2369f) c0108m.f1233o, obj, null), 1);
                        return W3.o.f6046a;
                    }
                }
                lVar = new t4.l(this, cVar);
                Object obj22 = lVar.f19617m;
                EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
                i = lVar.f19619o;
                if (i != 0) {
                }
                ((kotlin.jvm.internal.w) c0108m.f1230l).f17624k = AbstractC2282w.p((InterfaceC2280u) c0108m.f1231m, null, new t4.k((t4.n) c0108m.f1232n, (InterfaceC2369f) c0108m.f1233o, obj, null), 1);
                return W3.o.f6046a;
            default:
                InterfaceC2653i interfaceC2653i = (InterfaceC2653i) obj;
                boolean z5 = interfaceC2653i instanceof y.l;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f1232n;
                kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) this.f1231m;
                kotlin.jvm.internal.u uVar3 = (kotlin.jvm.internal.u) this.f1230l;
                boolean z6 = true;
                if (z5) {
                    uVar3.f17622k++;
                } else if (interfaceC2653i instanceof y.m) {
                    uVar3.f17622k--;
                } else if (interfaceC2653i instanceof C2655k) {
                    uVar3.f17622k--;
                } else if (interfaceC2653i instanceof C2651g) {
                    uVar2.f17622k++;
                } else if (interfaceC2653i instanceof C2652h) {
                    uVar2.f17622k--;
                } else if (interfaceC2653i instanceof C2648d) {
                    uVar.f17622k++;
                } else if (interfaceC2653i instanceof C2649e) {
                    uVar.f17622k--;
                }
                boolean z7 = false;
                boolean z8 = uVar3.f17622k > 0;
                boolean z9 = uVar2.f17622k > 0;
                boolean z10 = uVar.f17622k > 0;
                v.F f = (v.F) this.f1233o;
                if (f.f20147z != z8) {
                    f.f20147z = z8;
                    z7 = true;
                }
                if (f.f20144A != z9) {
                    f.f20144A = z9;
                    z7 = true;
                }
                if (f.f20145B != z10) {
                    f.f20145B = z10;
                } else {
                    z6 = z7;
                }
                if (z6) {
                    AbstractC2749f.m(f);
                }
                return W3.o.f6046a;
        }
    }
}
