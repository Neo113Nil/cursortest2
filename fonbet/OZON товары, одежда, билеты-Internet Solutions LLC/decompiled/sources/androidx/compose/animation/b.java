package androidx.compose.animation;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.ui.e;
import bc.C5637m;
import e1.InterfaceC6250b;
import e1.d;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.J;
import l0.O;
import l0.a0;
import l0.d0;
import l0.g0;
import l0.k0;
import l0.n0;
import l1.N0;
import m0.C8004n;
import m0.C8010q;
import m0.C8011q0;
import m0.D0;
import m0.H;
import m0.H0;
import m0.T0;
import m0.U0;
import m0.W0;
import m0.l1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final U0<N0, C8010q> f38764a = W0.a(a.f38769b, C0721b.f38770b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8011q0<Float> f38765b = C8004n.c(400.0f, null, 5);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C8011q0<Z1.m> f38766c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C8011q0<Z1.q> f38767d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f38768e = 0;

    static final class a extends AbstractC7737t implements Function1<N0, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f38769b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(N0 n02) {
            long g10 = n02.g();
            return new C8010q(N0.d(g10), N0.e(g10));
        }
    }

    /* renamed from: androidx.compose.animation.b$b, reason: collision with other inner class name */
    static final class C0721b extends AbstractC7737t implements Function1<C8010q, N0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0721b f38770b = new C0721b(1);

        @Override // kotlin.jvm.functions.Function1
        public final N0 invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return N0.b(C5637m.a(c8010q2.f(), c8010q2.g()));
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<Z1.q, Z1.m> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f38771b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f38771b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Z1.m invoke(Z1.q qVar) {
            return Z1.m.a(Z1.n.a(0, this.f38771b.invoke(Integer.valueOf((int) (qVar.e() & 4294967295L))).intValue()));
        }
    }

    static {
        int i11 = l1.f73821b;
        f38766c = C8004n.c(400.0f, Z1.m.a(Z1.n.a(1, 1)), 1);
        f38767d = C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final androidx.compose.ui.e d(@NotNull final D0 d02, @NotNull q qVar, @NotNull s sVar, InterfaceC3967k interfaceC3967k, int i11) {
        D0.a aVar;
        D0.a aVar2;
        D0.a aVar3;
        D0.a aVar4;
        D0.a aVar5;
        D0.a aVar6;
        D0 d03;
        D0.a aVar7;
        InterfaceC3967k interfaceC3967k2;
        Object obj;
        InterfaceC3967k interfaceC3967k3;
        final q qVar2;
        final s sVar2;
        s sVar3;
        q qVar3;
        androidx.compose.animation.c cVar = androidx.compose.animation.c.f38772b;
        int i12 = i11 & 14;
        boolean z11 = ((i12 ^ 6) > 4 && interfaceC3967k.n(d02)) || (i11 & 6) == 4;
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(qVar, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        if (d02.h() == d02.n() && d02.h() == O.Visible) {
            if (d02.p()) {
                interfaceC3978p0.setValue(qVar);
            } else {
                qVar3 = q.f38814a;
                interfaceC3978p0.setValue(qVar3);
            }
        } else if (d02.n() == O.Visible) {
            interfaceC3978p0.setValue(((q) interfaceC3978p0.getValue()).c(qVar));
        }
        q qVar4 = (q) interfaceC3978p0.getValue();
        int i13 = i11 >> 3;
        int i14 = (i13 & 112) | i12;
        boolean z12 = (((i14 & 14) ^ 6) > 4 && interfaceC3967k.n(d02)) || (i14 & 6) == 4;
        Object C12 = interfaceC3967k.C();
        if (z12 || C12 == InterfaceC3967k.a.a()) {
            C12 = n1.f(sVar, D1.f25195a);
            interfaceC3967k.x(C12);
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C12;
        if (d02.h() == d02.n() && d02.h() == O.Visible) {
            if (d02.p()) {
                interfaceC3978p02.setValue(sVar);
            } else {
                sVar3 = s.f38816a;
                interfaceC3978p02.setValue(sVar3);
            }
        } else if (d02.n() != O.Visible) {
            interfaceC3978p02.setValue(((s) interfaceC3978p02.getValue()).c(sVar));
        }
        s sVar4 = (s) interfaceC3978p02.getValue();
        boolean z13 = (qVar4.b().f() == null && sVar4.b().f() == null) ? false : true;
        boolean z14 = (qVar4.b().a() == null && sVar4.b().a() == null) ? false : true;
        D0.a aVar8 = null;
        if (z13) {
            interfaceC3967k.o(-821375963);
            U0 i15 = W0.i();
            Object C13 = interfaceC3967k.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = "Built-in slide";
                interfaceC3967k.x("Built-in slide");
            }
            D0.a c11 = H0.c(d02, i15, (String) C13, interfaceC3967k, i12 | 384, 0);
            interfaceC3967k.k();
            aVar = c11;
        } else {
            interfaceC3967k.o(-821278096);
            interfaceC3967k.k();
            aVar = null;
        }
        if (z14) {
            interfaceC3967k.o(-821202177);
            U0 j11 = W0.j();
            Object C14 = interfaceC3967k.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = "Built-in shrink/expand";
                interfaceC3967k.x("Built-in shrink/expand");
            }
            D0.a c12 = H0.c(d02, j11, (String) C14, interfaceC3967k, i12 | 384, 0);
            interfaceC3967k.k();
            aVar2 = c12;
        } else {
            interfaceC3967k.o(-821099041);
            interfaceC3967k.k();
            aVar2 = null;
        }
        if (z14) {
            interfaceC3967k.o(-821034002);
            U0 i16 = W0.i();
            Object C15 = interfaceC3967k.C();
            if (C15 == InterfaceC3967k.a.a()) {
                C15 = "Built-in InterruptionHandlingOffset";
                interfaceC3967k.x("Built-in InterruptionHandlingOffset");
            }
            D0.a c13 = H0.c(d02, i16, (String) C15, interfaceC3967k, i12 | 384, 0);
            interfaceC3967k.k();
            aVar3 = c13;
        } else {
            interfaceC3967k.o(-820883777);
            interfaceC3967k.k();
            aVar3 = null;
        }
        qVar4.b().getClass();
        sVar4.b().getClass();
        boolean z15 = !z14;
        int i17 = i12 | (i13 & 7168);
        boolean z16 = (qVar4.b().c() == null && sVar4.b().c() == null) ? false : true;
        boolean z17 = (qVar4.b().e() == null && sVar4.b().e() == null) ? false : true;
        if (z16) {
            interfaceC3967k.o(-675389204);
            U0 b11 = W0.b();
            Object C16 = interfaceC3967k.C();
            if (C16 == InterfaceC3967k.a.a()) {
                C16 = "Built-in alpha";
                interfaceC3967k.x("Built-in alpha");
            }
            aVar4 = H0.c(d02, b11, (String) C16, interfaceC3967k, (i17 & 14) | 384, 0);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-675252433);
            interfaceC3967k.k();
            aVar4 = null;
        }
        if (z17) {
            interfaceC3967k.o(-675193780);
            D0.a aVar9 = aVar4;
            U0 b12 = W0.b();
            Object C17 = interfaceC3967k.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = "Built-in scale";
                interfaceC3967k.x("Built-in scale");
            }
            aVar5 = aVar9;
            D0.a c14 = H0.c(d02, b12, (String) C17, interfaceC3967k, (i17 & 14) | 384, 0);
            interfaceC3967k.k();
            aVar6 = c14;
        } else {
            aVar5 = aVar4;
            interfaceC3967k.o(-675057009);
            interfaceC3967k.k();
            aVar6 = null;
        }
        if (z17) {
            interfaceC3967k.o(-674987940);
            d03 = d02;
            aVar7 = aVar6;
            aVar8 = H0.c(d03, f38764a, "TransformOriginInterruptionHandling", interfaceC3967k, (i17 & 14) | 384, 0);
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.k();
        } else {
            d03 = d02;
            aVar7 = aVar6;
            interfaceC3967k2 = interfaceC3967k;
            interfaceC3967k2.o(-674835793);
            interfaceC3967k2.k();
        }
        final D0.a aVar10 = aVar8;
        boolean F11 = interfaceC3967k2.F(aVar5) | interfaceC3967k2.n(qVar4) | interfaceC3967k2.n(sVar4) | interfaceC3967k2.F(aVar7) | ((((i17 & 14) ^ 6) > 4 && interfaceC3967k2.n(d03)) || (i17 & 6) == 4) | interfaceC3967k2.F(aVar10);
        Object C18 = interfaceC3967k2.C();
        if (F11 || C18 == InterfaceC3967k.a.a()) {
            interfaceC3967k3 = interfaceC3967k2;
            final D0.a aVar11 = aVar5;
            qVar2 = qVar4;
            final D0.a aVar12 = aVar7;
            sVar2 = sVar4;
            obj = new d0() { // from class: l0.P
                @Override // l0.d0
                public final Function1 init() {
                    N0 b13;
                    androidx.compose.animation.q qVar5 = qVar2;
                    D0.a aVar13 = D0.a.this;
                    androidx.compose.animation.s sVar5 = sVar2;
                    D0.a.C1247a a11 = aVar13 != null ? aVar13.a(new Q(qVar5, sVar5), new S(qVar5, sVar5)) : null;
                    D0.a aVar14 = aVar12;
                    D0.a.C1247a a12 = aVar14 != null ? aVar14.a(new U(qVar5, sVar5), new V(qVar5, sVar5)) : null;
                    if (d02.h() == O.PreEnter) {
                        g0 e11 = qVar5.b().e();
                        if (e11 != null || (e11 = sVar5.b().e()) != null) {
                            b13 = N0.b(e11.c());
                        }
                        b13 = null;
                    } else {
                        g0 e12 = sVar5.b().e();
                        if (e12 != null || (e12 = qVar5.b().e()) != null) {
                            b13 = N0.b(e12.c());
                        }
                        b13 = null;
                    }
                    D0.a aVar15 = aVar10;
                    return new T(a11, a12, aVar15 != null ? aVar15.a(W.f72052b, new X(b13, qVar5, sVar5)) : null);
                }
            };
            interfaceC3967k3.x(obj);
        } else {
            interfaceC3967k3 = interfaceC3967k2;
            obj = C18;
            qVar2 = qVar4;
            sVar2 = sVar4;
        }
        d0 d0Var = (d0) obj;
        e.a aVar13 = androidx.compose.ui.e.f40358c0;
        boolean p11 = interfaceC3967k3.p(z15) | ((((i11 & 7168) ^ 3072) > 2048 && interfaceC3967k3.n(cVar)) || (i11 & 3072) == 2048);
        Object C19 = interfaceC3967k3.C();
        if (p11 || C19 == InterfaceC3967k.a.a()) {
            C19 = new d(z15, cVar);
            interfaceC3967k3.x(C19);
        }
        return androidx.compose.ui.graphics.a.a(aVar13, (Function1) C19).l0(new EnterExitTransitionElement(d02, aVar2, aVar3, aVar, qVar2, sVar2, cVar, d0Var));
    }

    public static q e() {
        int i11 = l1.f73821b;
        return f(t(InterfaceC6250b.a.j()), new f(e.f38775b), C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1));
    }

    @NotNull
    public static final q f(@NotNull e1.d dVar, @NotNull Function1 function1, @NotNull C8011q0 c8011q0) {
        return new r(new n0((a0) null, (k0) null, new J(dVar, function1, c8011q0), (g0) null, (LinkedHashMap) null, 59));
    }

    public static q g(d.b bVar, int i11) {
        int i12 = l1.f73821b;
        C8011q0 c11 = C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1);
        if ((i11 & 2) != 0) {
            bVar = InterfaceC6250b.a.a();
        }
        return f(s(bVar), new h(g.f38777b), c11);
    }

    public static q h(T0 t02, int i11) {
        H h11 = t02;
        if ((i11 & 1) != 0) {
            h11 = C8004n.c(400.0f, null, 5);
        }
        return new r(new n0(new a0(h11), (k0) null, (J) null, (g0) null, (LinkedHashMap) null, 62));
    }

    public static s i(T0 t02, int i11) {
        H h11 = t02;
        if ((i11 & 1) != 0) {
            h11 = C8004n.c(400.0f, null, 5);
        }
        return new t(new n0(new a0(h11), (k0) null, (J) null, (g0) null, (LinkedHashMap) null, 62));
    }

    public static q j(T0 t02, float f7) {
        long j11;
        j11 = N0.f72232b;
        return new r(new n0((a0) null, (k0) null, (J) null, new g0(f7, j11, t02), (LinkedHashMap) null, 55));
    }

    public static s k(T0 t02) {
        long j11;
        j11 = N0.f72232b;
        return new t(new n0((a0) null, (k0) null, (J) null, new g0(0.5f, j11, t02), (LinkedHashMap) null, 55));
    }

    public static s l() {
        int i11 = l1.f73821b;
        return m(t(InterfaceC6250b.a.j()), new j(i.f38779b), C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1));
    }

    @NotNull
    public static final s m(@NotNull e1.d dVar, @NotNull Function1 function1, @NotNull C8011q0 c8011q0) {
        return new t(new n0((a0) null, (k0) null, new J(dVar, function1, c8011q0), (g0) null, (LinkedHashMap) null, 59));
    }

    public static s n(d.b bVar, int i11) {
        int i12 = l1.f73821b;
        C8011q0 c11 = C8004n.c(400.0f, Z1.q.a(Z1.r.a(1, 1)), 1);
        if ((i11 & 2) != 0) {
            bVar = InterfaceC6250b.a.a();
        }
        return m(s(bVar), new l(k.f38781b), c11);
    }

    public static q o(Function1 function1) {
        int i11 = l1.f73821b;
        return new r(new n0((a0) null, new k0(new m(function1), C8004n.c(400.0f, Z1.m.a(Z1.n.a(1, 1)), 1)), (J) null, (g0) null, (LinkedHashMap) null, 61));
    }

    public static q p(Function1 function1) {
        int i11 = l1.f73821b;
        return new r(new n0((a0) null, new k0(new n(function1), C8004n.c(400.0f, Z1.m.a(Z1.n.a(1, 1)), 1)), (J) null, (g0) null, (LinkedHashMap) null, 61));
    }

    public static s q(Function1 function1) {
        int i11 = l1.f73821b;
        return new t(new n0((a0) null, new k0(new o(function1), C8004n.c(400.0f, Z1.m.a(Z1.n.a(1, 1)), 1)), (J) null, (g0) null, (LinkedHashMap) null, 61));
    }

    @NotNull
    public static final s r(@NotNull Function1 function1, @NotNull H h11) {
        return new t(new n0((a0) null, new k0(new c(function1), h11), (J) null, (g0) null, (LinkedHashMap) null, 61));
    }

    private static final e1.d s(InterfaceC6250b.c cVar) {
        return Intrinsics.d(cVar, InterfaceC6250b.a.l()) ? InterfaceC6250b.a.m() : Intrinsics.d(cVar, InterfaceC6250b.a.a()) ? InterfaceC6250b.a.b() : InterfaceC6250b.a.e();
    }

    private static final e1.d t(d.a aVar) {
        return aVar.equals(InterfaceC6250b.a.k()) ? InterfaceC6250b.a.h() : aVar.equals(InterfaceC6250b.a.j()) ? InterfaceC6250b.a.f() : InterfaceC6250b.a.e();
    }
}
