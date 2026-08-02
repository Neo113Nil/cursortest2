package E;

import Q2.C0375o;
import a.AbstractC0444a;
import java.util.LinkedHashMap;
import java.util.List;
import n.AbstractC2107A;
import r3.AbstractC2349a;
import x0.AbstractC2617c;
import x0.InterfaceC2632s;

/* renamed from: E.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112q implements x0.O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f1258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f1259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0.w f1260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P0.q f1261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0.c f1262e;
    public final /* synthetic */ int f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0112q(Z z3, i4.c cVar, P0.w wVar, P0.q qVar, W0.c cVar2, int i) {
        this.f1258a = z3;
        this.f1259b = (kotlin.jvm.internal.m) cVar;
        this.f1260c = wVar;
        this.f1261d = qVar;
        this.f1262e = cVar2;
        this.f = i;
    }

    @Override // x0.O
    public final /* synthetic */ int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.h(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.k(this, interfaceC2632s, list, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Type inference failed for: r4v19, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // x0.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x0.P c(x0.Q q5, List list, long j5) {
        K0.L l5;
        Z z3;
        F0 f02;
        K0.L l6;
        C0112q c0112q;
        Z z5;
        Z z6 = this.f1258a;
        Z.f d5 = Z.q.d();
        i4.c e3 = d5 != null ? d5.e() : null;
        Z.f g5 = Z.q.g(d5);
        try {
            F0 d6 = z6.d();
            K0.L l7 = d6 != null ? d6.f1029a : null;
            C0102h0 c0102h0 = z6.f1088a;
            W0.m layoutDirection = q5.getLayoutDirection();
            int i = c0102h0.f;
            boolean z7 = c0102h0.f1197e;
            int i5 = c0102h0.f1195c;
            if (l7 != null) {
                K0.r rVar = l7.f2793b;
                if (!rVar.f2853a.c()) {
                    K0.K k5 = l7.f2792a;
                    if (kotlin.jvm.internal.l.a(k5.f2784a, c0102h0.f1193a) && k5.f2785b.c(c0102h0.f1194b) && kotlin.jvm.internal.l.a(k5.f2786c, c0102h0.i) && k5.f2787d == i5 && k5.f2788e == z7 && k5.f == i && kotlin.jvm.internal.l.a(k5.f2789g, c0102h0.f1198g) && k5.f2790h == layoutDirection && kotlin.jvm.internal.l.a(k5.i, c0102h0.f1199h)) {
                        int j6 = W0.a.j(j5);
                        long j7 = k5.f2791j;
                        if (j6 == W0.a.j(j7) && ((!z7 && i != 2) || (W0.a.h(j5) == W0.a.h(j7) && W0.a.g(j5) == W0.a.g(j7)))) {
                            l6 = new K0.L(new K0.K(k5.f2784a, c0102h0.f1194b, k5.f2786c, k5.f2787d, k5.f2788e, k5.f, k5.f2789g, k5.f2790h, k5.i, j5), rVar, W0.b.d(j5, AbstractC0444a.b(W.k(rVar.f2856d), W.k(rVar.f2857e))));
                            z3 = z6;
                            f02 = d6;
                            l5 = l7;
                            long j8 = l6.f2794c;
                            Integer valueOf = Integer.valueOf((int) (j8 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j8 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (kotlin.jvm.internal.l.a(l5, l6)) {
                                z5 = z3;
                                z5.i.setValue(new F0(l6, f02 != null ? f02.f1031c : null));
                                z5.f1101p = false;
                                c0112q = this;
                                c0112q.f1259b.c(l6);
                                W.q(z5, c0112q.f1260c, c0112q.f1261d);
                            } else {
                                c0112q = this;
                                z5 = z3;
                            }
                            z5.f1093g.setValue(new W0.f(c0112q.f1262e.h0(c0112q.f != 1 ? W.k(l6.f2793b.b(0)) : 0)));
                            W3.h[] hVarArr = {new W3.h(AbstractC2617c.f20985a, Integer.valueOf(Math.round(l6.f2795d))), new W3.h(AbstractC2617c.f20986b, Integer.valueOf(Math.round(l6.f2796e)))};
                            LinkedHashMap linkedHashMap = new LinkedHashMap(X3.z.R(2));
                            X3.z.S(linkedHashMap, hVarArr);
                            return q5.i(intValue, intValue2, linkedHashMap, C0099g.f1145n);
                        }
                    }
                }
            }
            K0.L l8 = l7;
            c0102h0.a(layoutDirection);
            int j9 = W0.a.j(j5);
            int h3 = ((z7 || i == 2) && W0.a.d(j5)) ? W0.a.h(j5) : Integer.MAX_VALUE;
            int i6 = (z7 || i != 2) ? i5 : 1;
            if (j9 != h3) {
                C0375o c0375o = c0102h0.f1200j;
                if (c0375o == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                h3 = AbstractC0444a.t(W.k(c0375o.e()), j9, h3);
            }
            C0375o c0375o2 = c0102h0.f1200j;
            if (c0375o2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            K0.r rVar2 = new K0.r(c0375o2, AbstractC2349a.u(0, h3, 0, W0.a.g(j5)), i6, i == 2);
            l5 = l8;
            z3 = z6;
            f02 = d6;
            l6 = new K0.L(new K0.K(c0102h0.f1193a, c0102h0.f1194b, c0102h0.i, c0102h0.f1195c, c0102h0.f1197e, c0102h0.f, c0102h0.f1198g, layoutDirection, c0102h0.f1199h, j5), rVar2, W0.b.d(j5, AbstractC0444a.b(W.k(rVar2.f2856d), W.k(rVar2.f2857e))));
            long j82 = l6.f2794c;
            Integer valueOf3 = Integer.valueOf((int) (j82 >> 32));
            Integer valueOf22 = Integer.valueOf((int) (j82 & 4294967295L));
            int intValue3 = valueOf3.intValue();
            int intValue22 = valueOf22.intValue();
            if (kotlin.jvm.internal.l.a(l5, l6)) {
            }
            z5.f1093g.setValue(new W0.f(c0112q.f1262e.h0(c0112q.f != 1 ? W.k(l6.f2793b.b(0)) : 0)));
            W3.h[] hVarArr2 = {new W3.h(AbstractC2617c.f20985a, Integer.valueOf(Math.round(l6.f2795d))), new W3.h(AbstractC2617c.f20986b, Integer.valueOf(Math.round(l6.f2796e)))};
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(X3.z.R(2));
            X3.z.S(linkedHashMap2, hVarArr2);
            return q5.i(intValue3, intValue22, linkedHashMap2, C0099g.f1145n);
        } finally {
            Z.q.k(d5, g5, e3);
        }
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        Z z3 = this.f1258a;
        z3.f1088a.a(interfaceC2632s.getLayoutDirection());
        C0375o c0375o = z3.f1088a.f1200j;
        if (c0375o != null) {
            return W.k(c0375o.e());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
