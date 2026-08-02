package E;

import A0.InterfaceC0044l1;
import A0.L0;
import G1.C0140k;
import h0.C1988b;

/* renamed from: E.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120z extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1386l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1388n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1389o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1390p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1391q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120z(Z z3, g0.o oVar, boolean z5, I.O o5, P0.q qVar) {
        super(1);
        this.f1388n = z3;
        this.f1389o = oVar;
        this.f1387m = z5;
        this.f1390p = o5;
        this.f1391q = qVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1386l) {
            case 0:
                long j5 = ((C1988b) obj).f17191a;
                Z z3 = (Z) this.f1388n;
                if (z3.b()) {
                    InterfaceC0044l1 interfaceC0044l1 = z3.f1090c;
                    if (interfaceC0044l1 != null) {
                        ((L0) interfaceC0044l1).b();
                    }
                } else {
                    g0.o oVar = (g0.o) this.f1389o;
                    oVar.getClass();
                    oVar.a(new g0.l(1, 3));
                }
                if (z3.b() && this.f1387m) {
                    if (z3.a() != O.f1065l) {
                        F0 d5 = z3.d();
                        if (d5 != null) {
                            int a5 = ((P0.q) this.f1391q).a(d5.b(j5, true));
                            z3.f1105t.c(P0.w.a((P0.w) z3.f1091d.f20439l, null, K0.F.b(a5, a5), 5));
                            if (z3.f1088a.f1193a.f2829l.length() > 0) {
                                z3.f1096k.setValue(O.f1066m);
                            }
                        }
                    } else {
                        ((I.O) this.f1390p).e(new C1988b(j5));
                    }
                }
                break;
            default:
                C0140k c0140k = (C0140k) obj;
                kotlin.jvm.internal.l.f("entry", c0140k);
                ((kotlin.jvm.internal.s) this.f1388n).f17620k = true;
                ((kotlin.jvm.internal.s) this.f1389o).f17620k = true;
                ((G1.E) this.f1390p).o(c0140k, this.f1387m, (X3.k) this.f1391q);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120z(kotlin.jvm.internal.s sVar, kotlin.jvm.internal.s sVar2, G1.E e3, boolean z3, X3.k kVar) {
        super(1);
        this.f1388n = sVar;
        this.f1389o = sVar2;
        this.f1390p = e3;
        this.f1387m = z3;
        this.f1391q = kVar;
    }
}
