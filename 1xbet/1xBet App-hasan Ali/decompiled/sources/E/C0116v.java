package E;

import A0.InterfaceC0044l1;
import A0.L0;
import K0.C0203h;
import P.C0326x0;
import P.C0327y;
import P0.C0331a;
import P0.C0334d;
import g0.C1965j;
import g0.InterfaceC1964i;
import java.util.List;
import x0.InterfaceC2637x;

/* renamed from: E.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116v extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f1350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0116v(Z z3, int i) {
        super(1);
        this.f1349l = i;
        this.f1350m = z3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        InterfaceC0044l1 interfaceC0044l1;
        boolean z3 = false;
        W3.o oVar = null;
        W3.o oVar2 = W3.o.f6046a;
        Z z5 = this.f1350m;
        switch (this.f1349l) {
            case 0:
                InterfaceC2637x interfaceC2637x = (InterfaceC2637x) obj;
                F0 d5 = z5.d();
                if (d5 != null) {
                    d5.f1031c = interfaceC2637x;
                }
                return oVar2;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                z5.f1102q.setValue(bool);
                return oVar2;
            case 2:
                List list = (List) obj;
                if (z5.d() != null) {
                    F0 d6 = z5.d();
                    kotlin.jvm.internal.l.c(d6);
                    list.add(d6.f1029a);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                C0203h c0203h = (C0203h) obj;
                P0.C c5 = z5.f1092e;
                C0116v c0116v = z5.f1105t;
                if (c5 != null) {
                    P0.w t5 = z5.f1091d.t(X3.n.O(new C0334d(), new C0331a(c0203h, 1)));
                    c5.a(null, t5);
                    c0116v.c(t5);
                    oVar = oVar2;
                }
                if (oVar == null) {
                    String str = c0203h.f2829l;
                    int length = str.length();
                    c0116v.c(new P0.w(4, K0.F.b(length, length), str));
                }
                return Boolean.TRUE;
            case 4:
                int i = ((P0.j) obj).f4656a;
                v3.e eVar = z5.f1103r;
                eVar.getClass();
                if (i == 7) {
                    eVar.z();
                } else if (i == 2) {
                    eVar.z();
                } else if (i == 6) {
                    eVar.z();
                } else if (i == 5) {
                    eVar.z();
                } else if (i == 3) {
                    eVar.z();
                } else if (i == 4) {
                    eVar.z();
                } else if (i != 1 && i != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i == 6) {
                    InterfaceC1964i interfaceC1964i = (InterfaceC1964i) eVar.f20434n;
                    if (interfaceC1964i == null) {
                        kotlin.jvm.internal.l.k("focusManager");
                        throw null;
                    }
                    ((C1965j) interfaceC1964i).f(1);
                } else if (i == 5) {
                    InterfaceC1964i interfaceC1964i2 = (InterfaceC1964i) eVar.f20434n;
                    if (interfaceC1964i2 == null) {
                        kotlin.jvm.internal.l.k("focusManager");
                        throw null;
                    }
                    ((C1965j) interfaceC1964i2).f(2);
                } else if (i == 7 && (interfaceC0044l1 = (InterfaceC0044l1) eVar.f20432l) != null) {
                    ((L0) interfaceC0044l1).a();
                }
                return oVar2;
            default:
                P0.w wVar = (P0.w) obj;
                String str2 = wVar.f4679a.f2829l;
                C0203h c0203h2 = z5.f1095j;
                if (!kotlin.jvm.internal.l.a(str2, c0203h2 != null ? c0203h2.f2829l : null)) {
                    z5.f1096k.setValue(O.f1064k);
                }
                long j5 = K0.N.f2801b;
                z5.f(j5);
                z5.e(j5);
                z5.f1104s.c(wVar);
                C0326x0 c0326x0 = z5.f1089b;
                C0327y c0327y = c0326x0.f4575a;
                if (c0327y != null) {
                    c0327y.r(c0326x0, null);
                }
                return oVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116v(Z z3, H0.j jVar) {
        super(1);
        this.f1349l = 3;
        this.f1350m = z3;
    }
}
