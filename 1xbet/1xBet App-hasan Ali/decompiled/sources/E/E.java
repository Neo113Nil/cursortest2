package E;

import G.C0129f;
import i4.InterfaceC2015a;
import u.C2434E;
import u.C2435F;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1021n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1022o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1023p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.f1019l = i;
        this.f1020m = obj;
        this.f1021n = obj2;
        this.f1022o = obj3;
        this.f1023p = obj4;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        s4.u i;
        switch (this.f1019l) {
            case 0:
                if (!((Z) this.f1020m).b()) {
                    g0.o oVar = (g0.o) this.f1021n;
                    oVar.getClass();
                    oVar.a(new g0.l(1, 3));
                }
                int i5 = ((P0.k) this.f1022o).f4661d;
                if (i5 != 7 && i5 != 8 && (i = ((C0129f) this.f1023p).i()) != null) {
                    ((s4.B) i).q(W3.o.f6046a);
                }
                break;
            case 1:
                ((a1.u) this.f1020m).h((InterfaceC2015a) this.f1021n, (a1.t) this.f1022o, (W0.m) this.f1023p);
                break;
            default:
                C2435F c2435f = (C2435F) this.f1021n;
                Number number = c2435f.f19661k;
                Number number2 = (Number) this.f1020m;
                boolean equals = number2.equals(number);
                Number number3 = (Number) this.f1022o;
                if (!equals || !number3.equals(c2435f.f19662l)) {
                    c2435f.f19661k = number2;
                    c2435f.f19662l = number3;
                    c2435f.f19665o = new u.m0((C2434E) this.f1023p, c2435f.f19663m, number2, number3, null);
                    c2435f.f19669s.f19680b.setValue(Boolean.TRUE);
                    c2435f.f19666p = false;
                    c2435f.f19667q = true;
                }
                break;
        }
        return W3.o.f6046a;
    }
}
