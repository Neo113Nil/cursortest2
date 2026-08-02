package T0;

import Pk0.h;
import Pk0.i;
import S0.AbstractC3984t;
import S0.C3945c;
import S0.C3947c1;
import S0.C3953e1;
import S0.C3966j0;
import S0.C3968k0;
import S0.C3988v;
import S0.InterfaceC3951e;
import S0.InterfaceC3963i;
import S0.U0;
import S0.V0;
import T0.d;
import T0.f;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f26359c = new f();

    public final void A(@NotNull Function0<Unit> function0) {
        d.y yVar = d.y.f26407c;
        f fVar = this.f26359c;
        fVar.s(yVar);
        f.b.b(fVar, 0, function0);
        if (fVar.f26417i == f.a(fVar, yVar.b()) && fVar.f26418j == f.a(fVar, yVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = yVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(yVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = yVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(yVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(yVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void B() {
        this.f26359c.r(d.z.f26408c);
    }

    public final void C(int i11) {
        d.A a11 = d.A.f26376c;
        f fVar = this.f26359c;
        fVar.s(a11);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, a11.b()) && fVar.f26418j == f.a(fVar, a11.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = a11.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b11; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a11.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = a11.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e11.append(", ");
                }
                e11.append(a11.e(i15));
                i14++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(a11);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void D(Object obj, @NotNull C3945c c3945c, int i11) {
        d.B b11 = d.B.f26377c;
        f fVar = this.f26359c;
        fVar.s(b11);
        f.b.b(fVar, 0, obj);
        f.b.b(fVar, 1, c3945c);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, b11.b()) && fVar.f26418j == f.a(fVar, b11.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b12 = b11.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b12; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(b11.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = b11.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e11.append(", ");
                }
                e11.append(b11.e(i15));
                i14++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(b11);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void E(Object obj) {
        d.C c11 = d.C.f26378c;
        f fVar = this.f26359c;
        fVar.s(c11);
        f.b.b(fVar, 0, obj);
        if (fVar.f26417i == f.a(fVar, c11.b()) && fVar.f26418j == f.a(fVar, c11.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c11.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c11.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c12 = c11.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c12; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(c11.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c11);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final <T, V> void F(V v11, @NotNull Function2<? super T, ? super V, Unit> function2) {
        d.D d11 = d.D.f26379c;
        f fVar = this.f26359c;
        fVar.s(d11);
        f.b.b(fVar, 0, v11);
        Intrinsics.g(function2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        U.g(2, function2);
        f.b.b(fVar, 1, function2);
        if (fVar.f26417i == f.a(fVar, d11.b()) && fVar.f26418j == f.a(fVar, d11.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = d11.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(d11.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = d11.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(d11.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(d11);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void G(int i11, Object obj) {
        d.E e11 = d.E.f26380c;
        f fVar = this.f26359c;
        fVar.s(e11);
        f.b.b(fVar, 0, obj);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, e11.b()) && fVar.f26418j == f.a(fVar, e11.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = e11.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b11; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(e11.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e12 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = e11.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e12.append(", ");
                }
                e12.append(e11.e(i15));
                i14++;
            }
        }
        String sb4 = e12.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(e11);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void H(int i11) {
        d.F f7 = d.F.f26381c;
        f fVar = this.f26359c;
        fVar.s(f7);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, f7.b()) && fVar.f26418j == f.a(fVar, f7.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = f7.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b11; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(f7.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = f7.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e11.append(", ");
                }
                e11.append(f7.e(i15));
                i14++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(f7);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void I(InterfaceC3963i interfaceC3963i) {
        if (interfaceC3963i != null) {
            this.f26359c.r(d.G.f26382c);
        }
    }

    public final void a() {
        this.f26359c.m();
    }

    public final void b(@NotNull InterfaceC3951e<?> interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
        this.f26359c.n(interfaceC3951e, c3953e1, u02);
    }

    public final boolean c() {
        return this.f26359c.o();
    }

    public final boolean d() {
        return this.f26359c.p();
    }

    public final void e(int i11) {
        d.C4013a c4013a = d.C4013a.f26383c;
        f fVar = this.f26359c;
        fVar.s(c4013a);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, c4013a.b()) && fVar.f26418j == f.a(fVar, c4013a.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c4013a.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b11; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c4013a.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = c4013a.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e11.append(", ");
                }
                e11.append(c4013a.e(i15));
                i14++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c4013a);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void f(@NotNull C3945c c3945c, Object obj) {
        d.C4014b c4014b = d.C4014b.f26384c;
        f fVar = this.f26359c;
        fVar.s(c4014b);
        f.b.b(fVar, 0, c3945c);
        f.b.b(fVar, 1, obj);
        if (fVar.f26417i == f.a(fVar, c4014b.b()) && fVar.f26418j == f.a(fVar, c4014b.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c4014b.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c4014b.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = c4014b.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(c4014b.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c4014b);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void g(@NotNull ArrayList arrayList, @NotNull a1.d dVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        d.C0530d c0530d = d.C0530d.f26386c;
        f fVar = this.f26359c;
        fVar.s(c0530d);
        f.b.b(fVar, 1, arrayList);
        f.b.b(fVar, 0, dVar);
        if (fVar.f26417i == f.a(fVar, c0530d.b()) && fVar.f26418j == f.a(fVar, c0530d.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c0530d.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c0530d.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = c0530d.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(c0530d.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c0530d);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void h(C3966j0 c3966j0, @NotNull AbstractC3984t abstractC3984t, @NotNull C3968k0 c3968k0, @NotNull C3968k0 c3968k02) {
        d.C4016e c4016e = d.C4016e.f26387c;
        f fVar = this.f26359c;
        fVar.s(c4016e);
        f.b.b(fVar, 0, c3966j0);
        f.b.b(fVar, 1, abstractC3984t);
        f.b.b(fVar, 3, c3968k02);
        f.b.b(fVar, 2, c3968k0);
        if (fVar.f26417i == f.a(fVar, c4016e.b()) && fVar.f26418j == f.a(fVar, c4016e.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c4016e.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c4016e.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = c4016e.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(c4016e.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c4016e);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void i() {
        this.f26359c.r(d.C4017f.f26388c);
    }

    public final void j(@NotNull a1.d dVar, @NotNull C3945c c3945c) {
        d.C4018g c4018g = d.C4018g.f26389c;
        f fVar = this.f26359c;
        fVar.s(c4018g);
        f.b.b(fVar, 0, dVar);
        f.b.b(fVar, 1, c3945c);
        if (fVar.f26417i == f.a(fVar, c4018g.b()) && fVar.f26418j == f.a(fVar, c4018g.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = c4018g.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c4018g.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = c4018g.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(c4018g.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c4018g);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void k(@NotNull Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        d.h hVar = d.h.f26390c;
        f fVar = this.f26359c;
        fVar.s(hVar);
        f.b.b(fVar, 0, objArr);
        if (fVar.f26417i == f.a(fVar, hVar.b()) && fVar.f26418j == f.a(fVar, hVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = hVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(hVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = hVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(hVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(hVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void l(@NotNull Function1 function1, @NotNull C3988v c3988v) {
        d.i iVar = d.i.f26391c;
        f fVar = this.f26359c;
        fVar.s(iVar);
        f.b.b(fVar, 0, function1);
        f.b.b(fVar, 1, c3988v);
        if (fVar.f26417i == f.a(fVar, iVar.b()) && fVar.f26418j == f.a(fVar, iVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = iVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(iVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = iVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(iVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(iVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void m() {
        this.f26359c.r(d.j.f26392c);
    }

    public final void n() {
        this.f26359c.r(d.k.f26393c);
    }

    public final void o(@NotNull C3945c c3945c) {
        d.l lVar = d.l.f26394c;
        f fVar = this.f26359c;
        fVar.s(lVar);
        f.b.b(fVar, 0, c3945c);
        if (fVar.f26417i == f.a(fVar, lVar.b()) && fVar.f26418j == f.a(fVar, lVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = lVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(lVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = lVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(lVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(lVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void p() {
        this.f26359c.r(d.m.f26395c);
    }

    public final void q(@NotNull a aVar, a1.d dVar) {
        if (aVar.f26359c.p()) {
            d.C4015c c4015c = d.C4015c.f26385c;
            f fVar = this.f26359c;
            fVar.s(c4015c);
            f.b.b(fVar, 0, aVar);
            f.b.b(fVar, 1, dVar);
            if (fVar.f26417i == f.a(fVar, c4015c.b()) && fVar.f26418j == f.a(fVar, c4015c.c())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int b11 = c4015c.b();
            int i11 = 0;
            for (int i12 = 0; i12 < b11; i12++) {
                if (((1 << i12) & fVar.f26417i) != 0) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c4015c.d(i12));
                    i11++;
                }
            }
            String sb3 = sb2.toString();
            StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            int c11 = c4015c.c();
            int i13 = 0;
            for (int i14 = 0; i14 < c11; i14++) {
                if (((1 << i14) & fVar.f26418j) != 0) {
                    if (i11 > 0) {
                        e11.append(", ");
                    }
                    e11.append(c4015c.e(i14));
                    i13++;
                }
            }
            String sb4 = e11.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder("Error while pushing ");
            sb5.append(c4015c);
            sb5.append(". Not all arguments were provided. Missing ");
            i.c(i11, " int arguments (", sb3, ") and ", sb5);
            G.g.e(i13, " object arguments (", sb4, ").", sb5);
            throw null;
        }
    }

    public final void r(@NotNull C3945c c3945c, @NotNull C3947c1 c3947c1) {
        d.o oVar = d.o.f26397c;
        f fVar = this.f26359c;
        fVar.s(oVar);
        f.b.b(fVar, 0, c3945c);
        f.b.b(fVar, 1, c3947c1);
        if (fVar.f26417i == f.a(fVar, oVar.b()) && fVar.f26418j == f.a(fVar, oVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = oVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(oVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = oVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(oVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(oVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void s(@NotNull C3945c c3945c, @NotNull C3947c1 c3947c1, @NotNull c cVar) {
        d.p pVar = d.p.f26398c;
        f fVar = this.f26359c;
        fVar.s(pVar);
        f.b.b(fVar, 0, c3945c);
        f.b.b(fVar, 1, c3947c1);
        f.b.b(fVar, 2, cVar);
        if (fVar.f26417i == f.a(fVar, pVar.b()) && fVar.f26418j == f.a(fVar, pVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = pVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(pVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = pVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(pVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(pVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void t(int i11) {
        d.q qVar = d.q.f26399c;
        f fVar = this.f26359c;
        fVar.s(qVar);
        f.b.a(fVar, 0, i11);
        if (fVar.f26417i == f.a(fVar, qVar.b()) && fVar.f26418j == f.a(fVar, qVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = qVar.b();
        int i12 = 0;
        for (int i13 = 0; i13 < b11; i13++) {
            if (((1 << i13) & fVar.f26417i) != 0) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(qVar.d(i13));
                i12++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = qVar.c();
        int i14 = 0;
        for (int i15 = 0; i15 < c11; i15++) {
            if (((1 << i15) & fVar.f26418j) != 0) {
                if (i12 > 0) {
                    e11.append(", ");
                }
                e11.append(qVar.e(i15));
                i14++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(qVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i12, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i14, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void u(int i11, int i12, int i13) {
        d.r rVar = d.r.f26400c;
        f fVar = this.f26359c;
        fVar.s(rVar);
        f.b.a(fVar, 1, i11);
        f.b.a(fVar, 0, i12);
        f.b.a(fVar, 2, i13);
        if (fVar.f26417i == f.a(fVar, rVar.b()) && fVar.f26418j == f.a(fVar, rVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = rVar.b();
        int i14 = 0;
        for (int i15 = 0; i15 < b11; i15++) {
            if (((1 << i15) & fVar.f26417i) != 0) {
                if (i14 > 0) {
                    sb2.append(", ");
                }
                sb2.append(rVar.d(i15));
                i14++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = rVar.c();
        int i16 = 0;
        for (int i17 = 0; i17 < c11; i17++) {
            if (((1 << i17) & fVar.f26418j) != 0) {
                if (i14 > 0) {
                    e11.append(", ");
                }
                e11.append(rVar.e(i17));
                i16++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(rVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i14, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i16, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void v(@NotNull C3988v c3988v, @NotNull AbstractC3984t abstractC3984t, @NotNull C3968k0 c3968k0) {
        d.t tVar = d.t.f26402c;
        f fVar = this.f26359c;
        fVar.s(tVar);
        f.b.b(fVar, 0, c3988v);
        f.b.b(fVar, 1, abstractC3984t);
        f.b.b(fVar, 2, c3968k0);
        if (fVar.f26417i == f.a(fVar, tVar.b()) && fVar.f26418j == f.a(fVar, tVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = tVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(tVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = tVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(tVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(tVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void w(@NotNull V0 v02) {
        d.u uVar = d.u.f26403c;
        f fVar = this.f26359c;
        fVar.s(uVar);
        f.b.b(fVar, 0, v02);
        if (fVar.f26417i == f.a(fVar, uVar.b()) && fVar.f26418j == f.a(fVar, uVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = uVar.b();
        int i11 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            if (((1 << i12) & fVar.f26417i) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(uVar.d(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = uVar.c();
        int i13 = 0;
        for (int i14 = 0; i14 < c11; i14++) {
            if (((1 << i14) & fVar.f26418j) != 0) {
                if (i11 > 0) {
                    e11.append(", ");
                }
                e11.append(uVar.e(i14));
                i13++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(uVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i11, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i13, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void x() {
        this.f26359c.r(d.v.f26404c);
    }

    public final void y(int i11, int i12) {
        d.w wVar = d.w.f26405c;
        f fVar = this.f26359c;
        fVar.s(wVar);
        f.b.a(fVar, 0, i11);
        f.b.a(fVar, 1, i12);
        if (fVar.f26417i == f.a(fVar, wVar.b()) && fVar.f26418j == f.a(fVar, wVar.c())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int b11 = wVar.b();
        int i13 = 0;
        for (int i14 = 0; i14 < b11; i14++) {
            if (((1 << i14) & fVar.f26417i) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(wVar.d(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        int c11 = wVar.c();
        int i15 = 0;
        for (int i16 = 0; i16 < c11; i16++) {
            if (((1 << i16) & fVar.f26418j) != 0) {
                if (i13 > 0) {
                    e11.append(", ");
                }
                e11.append(wVar.e(i16));
                i15++;
            }
        }
        String sb4 = e11.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(wVar);
        sb5.append(". Not all arguments were provided. Missing ");
        i.c(i13, " int arguments (", sb3, ") and ", sb5);
        G.g.e(i15, " object arguments (", sb4, ").", sb5);
        throw null;
    }

    public final void z() {
        this.f26359c.r(d.x.f26406c);
    }
}
