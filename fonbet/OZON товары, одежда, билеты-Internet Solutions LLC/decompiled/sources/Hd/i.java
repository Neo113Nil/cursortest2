package Hd;

import java.util.ArrayList;
import java.util.List;
import je.A0;
import je.B0;
import je.C7363H;
import je.G0;
import je.L0;
import je.N;
import je.Q;
import je.S;
import je.Y;
import je.o0;
import je.s0;
import je.x0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import le.l;
import org.jetbrains.annotations.NotNull;
import qd.m;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes10.dex */
public final class i extends B0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final a f10852d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f10853e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f10854b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0 f10855c;

    static {
        G0 g02 = G0.COMMON;
        f10852d = b.d(g02, false, null, 5).j(c.FLEXIBLE_LOWER_BOUND);
        f10853e = b.d(g02, false, null, 5).j(c.FLEXIBLE_UPPER_BOUND);
    }

    public i() {
        g gVar = new g();
        this.f10854b = gVar;
        this.f10855c = new x0(gVar);
    }

    private final Pair<Y, Boolean> h(Y y11, InterfaceC9839e interfaceC9839e, a aVar) {
        if (y11.H0().getParameters().isEmpty()) {
            return new Pair<>(y11, Boolean.FALSE);
        }
        if (m.S(y11)) {
            y0 y0Var = y11.F0().get(0);
            L0 b11 = y0Var.b();
            N type = y0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return new Pair<>(Q.f(C7714v.a0(new A0(i(type, aVar), b11)), y11.G0(), y11.H0(), null, y11.I0()), Boolean.FALSE);
        }
        if (S.a(y11)) {
            return new Pair<>(l.c(le.k.ERROR_RAW_TYPE, y11.H0().toString()), Boolean.FALSE);
        }
        ce.l i02 = interfaceC9839e.i0(this);
        Intrinsics.checkNotNullExpressionValue(i02, "getMemberScope(...)");
        o0 G02 = y11.G0();
        s0 k11 = interfaceC9839e.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
        List<i0> parameters = interfaceC9839e.k().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<i0> list = parameters;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (i0 i0Var : list) {
            Intrinsics.f(i0Var);
            x0 x0Var = this.f10855c;
            arrayList.add(this.f10854b.a(i0Var, aVar, x0Var, x0Var.c(i0Var, aVar)));
        }
        return new Pair<>(Q.h(G02, k11, arrayList, y11.I0(), i02, new h(interfaceC9839e, this, y11, aVar)), Boolean.TRUE);
    }

    private final N i(N n11, a aVar) {
        InterfaceC9842h p11 = n11.H0().p();
        if (p11 instanceof i0) {
            return i(this.f10855c.c((i0) p11, aVar.h(true)), aVar);
        }
        if (!(p11 instanceof InterfaceC9839e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + p11).toString());
        }
        InterfaceC9842h p12 = C7363H.c(n11).H0().p();
        if (p12 instanceof InterfaceC9839e) {
            Pair<Y, Boolean> h11 = h(C7363H.b(n11), (InterfaceC9839e) p11, f10852d);
            Y a11 = h11.a();
            boolean booleanValue = h11.b().booleanValue();
            Pair<Y, Boolean> h12 = h(C7363H.c(n11), (InterfaceC9839e) p12, f10853e);
            Y a12 = h12.a();
            return (booleanValue || h12.b().booleanValue()) ? new k(a11, a12) : Q.c(a11, a12);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + p12 + "\" while for lower it's \"" + p11 + '\"').toString());
    }

    @Override // je.B0
    public final y0 e(N key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new A0(i(key, new a(G0.COMMON, false, false, null, 62)));
    }
}
