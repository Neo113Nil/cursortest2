package A0;

import E.InterfaceC0104i0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import h0.C1988b;
import p4.AbstractC2282w;
import r3.AbstractC2349a;
import t.C2384F;
import t3.AbstractC2425d;
import u.C2438I;
import x.C2585i0;
import x.C2589k0;
import z.AbstractC2710l;

/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009a extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f433m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0009a(int i, int i5, Object obj) {
        super(2);
        this.f432l = i5;
        this.f433m = obj;
    }

    /* JADX WARN: Type inference failed for: r8v41, types: [i4.f, java.lang.Object, kotlin.jvm.internal.m] */
    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f432l) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0315s.P(intValue & 1, (intValue & 3) != 2)) {
                    ((AbstractC0012b) this.f433m).a(0, c0315s);
                } else {
                    c0315s.S();
                }
                return W3.o.f6046a;
            case 1:
                ((Number) obj2).intValue();
                ((H0) this.f433m).a(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 2:
                ((Number) obj2).intValue();
                AbstractC2425d.c((X.d) this.f433m, (C0315s) obj, AbstractC0329z.B(7));
                return W3.o.f6046a;
            case 3:
                ((Number) obj2).intValue();
                E.W.e((I.O) this.f433m, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 4:
                ((InterfaceC0104i0) this.f433m).e(((C1988b) obj2).f17191a);
                return W3.o.f6046a;
            case 5:
                ((Number) obj2).intValue();
                N4.b.a((H1.o) this.f433m, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 6:
                C0315s c0315s2 = (C0315s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0315s2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object M5 = c0315s2.M();
                    if (M5 == C0302l.f4480a) {
                        M5 = a1.c.f6381m;
                        c0315s2.i0(M5);
                    }
                    AbstractC2349a.h(new AppendedSemanticsElement((i4.c) M5, false), (i4.e) ((InterfaceC0289e0) this.f433m).getValue(), c0315s2, 0);
                } else {
                    c0315s2.S();
                }
                return W3.o.f6046a;
            case 7:
                ((Number) obj2).intValue();
                ((a1.s) this.f433m).a(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 8:
                ((Number) obj2).intValue();
                ((a1.w) this.f433m).a(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 9:
                b0.p pVar = (b0.p) obj;
                b0.p pVar2 = (b0.n) obj2;
                if (pVar2 instanceof b0.k) {
                    ?? r8 = ((b0.k) pVar2).f7159l;
                    kotlin.jvm.internal.z.b(3, r8);
                    b0.m mVar = b0.m.f7161k;
                    C0315s c0315s3 = (C0315s) this.f433m;
                    pVar2 = b0.a.b(c0315s3, (b0.p) r8.b(mVar, c0315s3, 0));
                }
                return pVar.c(pVar2);
            case 10:
                t.v vVar = (t.v) obj;
                t.v vVar2 = (t.v) obj2;
                t.v vVar3 = t.v.f19417m;
                return Boolean.valueOf(vVar == vVar3 && vVar2 == vVar3 && !((C2384F) this.f433m).f19343a.f19354b);
            case 11:
                ((Number) obj2).intValue();
                ((C2438I) this.f433m).a(AbstractC0329z.B(1), (C0315s) obj);
                return W3.o.f6046a;
            case 12:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                C2589k0 c2589k0 = (C2589k0) this.f433m;
                AbstractC2282w.p(c2589k0.k0(), null, new C2585i0(c2589k0, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
            case 13:
                ((Number) obj2).intValue();
                AbstractC2710l.a((b0.p) this.f433m, (C0315s) obj, AbstractC0329z.B(1));
                return W3.o.f6046a;
            case 14:
                return new W0.j(G4.l.a(0, ((b0.g) this.f433m).a(0, (int) (4294967295L & ((W0.l) obj).f6015a))));
            default:
                return new W0.j(((b0.h) this.f433m).a(0L, ((W0.l) obj).f6015a, (W0.m) obj2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0009a(int i, Object obj) {
        super(2);
        this.f432l = i;
        this.f433m = obj;
    }
}
