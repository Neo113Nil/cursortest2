package E;

import A0.C0016c0;
import A0.q1;
import G.C0129f;
import G1.C0140k;
import a1.C0453A;
import android.graphics.Paint;
import android.os.Bundle;
import h0.C1989c;
import h0.C1991e;
import i0.C2006k;
import i0.InterfaceC2009n;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.List;
import k0.C2022b;
import z0.AbstractC2749f;
import z0.C2733I;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1217l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1218m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1219n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1220o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1221p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1222q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(P0.w wVar, C0129f c0129f, P0.k kVar, A.s sVar, C0116v c0116v) {
        super(1);
        this.f1217l = 1;
        this.f1218m = wVar;
        this.f1219n = c0129f;
        this.f1220o = kVar;
        this.f1221p = sVar;
        this.f1222q = c0116v;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        List list;
        W3.o oVar = W3.o.f6046a;
        Object obj2 = this.f1218m;
        Object obj3 = this.f1220o;
        Object obj4 = this.f1222q;
        Object obj5 = this.f1221p;
        Object obj6 = this.f1219n;
        switch (this.f1217l) {
            case 0:
                C2733I c2733i = (C2733I) obj;
                c2733i.a();
                float h3 = ((G.o) obj6).f1742b.h();
                if (h3 != 0.0f) {
                    int i = K0.N.f2802c;
                    int b3 = ((P0.q) obj3).b((int) (((P0.w) obj2).f4680b >> 32));
                    F0 d5 = ((Z) obj5).d();
                    C1989c c5 = d5 != null ? d5.f1029a.c(b3) : new C1989c(0.0f, 0.0f, 0.0f, 0.0f);
                    float y5 = c2733i.y(m0.f1234a);
                    float f = y5 / 2;
                    float f5 = c5.f17193a + f;
                    C2022b c2022b = c2733i.f21647k;
                    float d6 = C1991e.d(c2022b.f17540l.A()) - f;
                    if (f5 > d6) {
                        f5 = d6;
                    }
                    if (f5 >= f) {
                        f = f5;
                    }
                    long d7 = G4.d.d(f, c5.f17194b);
                    long d8 = G4.d.d(f, c5.f17196d);
                    i0.M m5 = (i0.M) obj4;
                    InterfaceC2009n interfaceC2009n = c2022b.f17539k.f17537c;
                    J2.b bVar = c2022b.f17542n;
                    if (bVar == null) {
                        bVar = i0.F.g();
                        bVar.l(1);
                        c2022b.f17542n = bVar;
                    }
                    m5.h(h3, c2022b.f17540l.A(), bVar);
                    if (!kotlin.jvm.internal.l.a((C2006k) bVar.f2698e, null)) {
                        bVar.f(null);
                    }
                    if (bVar.f2695b != 3) {
                        bVar.d(3);
                    }
                    Paint paint = (Paint) bVar.f2696c;
                    if (paint.getStrokeWidth() != y5) {
                        bVar.k(y5);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        ((Paint) bVar.f2696c).setStrokeMiter(4.0f);
                    }
                    if (bVar.a() != 0) {
                        bVar.i(0);
                    }
                    if (bVar.b() != 0) {
                        bVar.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        bVar.g(1);
                    }
                    interfaceC2009n.e(d7, d8, bVar);
                }
                return oVar;
            case 1:
                G.B b5 = (G.B) obj;
                G.x xVar = ((C0129f) obj6).f1728a;
                b5.f1694h = (P0.w) obj2;
                b5.i = (P0.k) obj3;
                b5.f1690c = (A.s) obj5;
                b5.f1691d = (C0116v) obj4;
                b5.f1692e = xVar != null ? xVar.f1757z : null;
                b5.f = xVar != null ? xVar.f1754A : null;
                b5.f1693g = xVar != null ? (q1) AbstractC2749f.i(xVar, A0.I0.f297s) : null;
                return oVar;
            case 2:
                C0140k c0140k = (C0140k) obj;
                kotlin.jvm.internal.l.f("entry", c0140k);
                ((kotlin.jvm.internal.s) obj6).f17620k = true;
                ArrayList arrayList = (ArrayList) obj3;
                int indexOf = arrayList.indexOf(c0140k);
                if (indexOf != -1) {
                    kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj2;
                    int i5 = indexOf + 1;
                    list = arrayList.subList(uVar.f17622k, i5);
                    uVar.f17622k = i5;
                } else {
                    list = X3.v.f6090k;
                }
                ((G1.E) obj5).a(c0140k.f1899l, (Bundle) obj4, c0140k, list);
                return oVar;
            default:
                a1.w wVar = (a1.w) obj6;
                wVar.f6462x.addView(wVar, wVar.f6463y);
                wVar.j((InterfaceC2015a) obj3, (C0453A) obj2, (String) obj5, (W0.m) obj4);
                return new C0016c0(7, wVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.f1217l = i;
        this.f1219n = obj;
        this.f1220o = obj2;
        this.f1218m = obj3;
        this.f1221p = obj4;
        this.f1222q = obj5;
    }
}
