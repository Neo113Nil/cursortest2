package T0;

import Pk0.h;
import Pk0.i;
import S0.C3945c;
import S0.C3953e1;
import S0.InterfaceC3951e;
import S0.U0;
import S0.r;
import T0.d;
import T0.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f26372c = new f();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f26373d = new f();

    public final void a() {
        this.f26373d.m();
        this.f26372c.m();
    }

    public final void b(@NotNull Function0<? extends Object> function0, int i11, @NotNull C3945c c3945c) {
        f fVar;
        int i12;
        d.n nVar = d.n.f26396c;
        f fVar2 = this.f26372c;
        fVar2.s(nVar);
        f.b.b(fVar2, 0, function0);
        f.b.a(fVar2, 0, i11);
        f.b.b(fVar2, 1, c3945c);
        if (!(fVar2.f26417i == f.a(fVar2, nVar.b()) && fVar2.f26418j == f.a(fVar2, nVar.c()))) {
            StringBuilder sb2 = new StringBuilder();
            int b11 = nVar.b();
            int i13 = 0;
            for (int i14 = 0; i14 < b11; i14++) {
                if (((1 << i14) & fVar2.f26417i) != 0) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(nVar.d(i14));
                    i13++;
                }
            }
            String sb3 = sb2.toString();
            StringBuilder e11 = h.e(sb3, "StringBuilder().apply(builderAction).toString()");
            int c11 = nVar.c();
            int i15 = 0;
            int i16 = 0;
            while (i16 < c11) {
                if (((1 << i16) & fVar2.f26418j) != 0) {
                    if (i13 > 0) {
                        e11.append(", ");
                    }
                    i12 = c11;
                    e11.append(nVar.e(i16));
                    i15++;
                } else {
                    i12 = c11;
                }
                i16++;
                c11 = i12;
            }
            String sb4 = e11.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder("Error while pushing ");
            sb5.append(nVar);
            sb5.append(". Not all arguments were provided. Missing ");
            i.c(i13, " int arguments (", sb3, ") and ", sb5);
            G.g.e(i15, " object arguments (", sb4, ").", sb5);
            throw null;
        }
        d.s sVar = d.s.f26401c;
        f fVar3 = this.f26373d;
        fVar3.s(sVar);
        f.b.a(fVar3, 0, i11);
        f.b.b(fVar3, 0, c3945c);
        if (fVar3.f26417i == f.a(fVar3, sVar.b()) && fVar3.f26418j == f.a(fVar3, sVar.c())) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        int b12 = sVar.b();
        int i17 = 0;
        for (int i18 = 0; i18 < b12; i18++) {
            if (((1 << i18) & fVar3.f26417i) != 0) {
                if (i17 > 0) {
                    sb6.append(", ");
                }
                sb6.append(sVar.d(i18));
                i17++;
            }
        }
        String sb7 = sb6.toString();
        StringBuilder e12 = h.e(sb7, "StringBuilder().apply(builderAction).toString()");
        int c12 = sVar.c();
        int i19 = 0;
        int i21 = 0;
        while (i21 < c12) {
            if (((1 << i21) & fVar3.f26418j) != 0) {
                if (i17 > 0) {
                    e12.append(", ");
                }
                fVar = fVar3;
                e12.append(sVar.e(i21));
                i19++;
            } else {
                fVar = fVar3;
            }
            i21++;
            fVar3 = fVar;
        }
        String sb8 = e12.toString();
        Intrinsics.checkNotNullExpressionValue(sb8, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb9 = new StringBuilder("Error while pushing ");
        sb9.append(sVar);
        sb9.append(". Not all arguments were provided. Missing ");
        i.c(i17, " int arguments (", sb7, ") and ", sb9);
        G.g.e(i19, " object arguments (", sb8, ").", sb9);
        throw null;
    }

    public final void c() {
        f fVar = this.f26373d;
        if (fVar.p()) {
            fVar.q(this.f26372c);
        } else {
            r.j("Cannot end node insertion, there are no pending operations that can be realized.");
            throw null;
        }
    }

    public final void d(@NotNull InterfaceC3951e<?> interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
        if (this.f26373d.o()) {
            this.f26372c.n(interfaceC3951e, c3953e1, u02);
        } else {
            r.j("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw null;
        }
    }

    public final boolean e() {
        return this.f26372c.o();
    }

    public final <V, T> void f(V v11, @NotNull Function2<? super T, ? super V, Unit> function2) {
        d.D d11 = d.D.f26379c;
        f fVar = this.f26372c;
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
}
