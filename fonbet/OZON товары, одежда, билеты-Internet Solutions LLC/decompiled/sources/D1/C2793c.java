package D1;

import B1.InterfaceC2552v;
import D1.C2797e;
import D1.x0;
import J0.C3349u1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.InterfaceC6985e;
import i1.InterfaceC6990j;
import i1.InterfaceC6991k;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;
import x1.EnumC10640o;

/* renamed from: D1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2793c extends e.c implements E, InterfaceC2819t, E0, C0, C1.i, C1.l, A0, B, InterfaceC2821v, j1.e, j1.o, j1.t, y0, InterfaceC6985e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private e.b f5422a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5423b;

    /* renamed from: c, reason: collision with root package name */
    private C1.a f5424c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private HashSet<C1.c<?>> f5425d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2810k0 f5426e;

    /* renamed from: D1.c$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C2793c.this.P1();
            return Unit.f71690a;
        }
    }

    /* renamed from: D1.c$b */
    /* loaded from: classes8.dex */
    public static final class b implements x0.a {
        b() {
        }

        @Override // D1.x0.a
        public final void i() {
            C2793c c2793c = C2793c.this;
            if (c2793c.f5426e == null) {
                c2793c.y(C2809k.d(c2793c, UserVerificationMethods.USER_VERIFY_PATTERN));
            }
        }
    }

    /* renamed from: D1.c$c, reason: collision with other inner class name */
    static final class C0126c extends AbstractC7737t implements Function0<Unit> {
        C0126c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C2793c c2793c = C2793c.this;
            e.b J12 = c2793c.J1();
            Intrinsics.g(J12, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((C1.d) J12).w1(c2793c);
            return Unit.f71690a;
        }
    }

    public C2793c(@NotNull e.b bVar) {
        setKindSet$ui_release(p0.e(bVar));
        this.f5422a = bVar;
        this.f5423b = true;
        this.f5425d = new HashSet<>();
    }

    private final void L1(boolean z11) {
        if (!isAttached()) {
            A1.a.b("initializeModifier called on unattached node");
            throw null;
        }
        e.b bVar = this.f5422a;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (bVar instanceof C1.d) {
                sideEffect(new a());
            }
            if (bVar instanceof C1.j) {
                C1.j<?> jVar = (C1.j) bVar;
                C1.a aVar = this.f5424c;
                if (aVar == null || !aVar.a(jVar.getKey())) {
                    this.f5424c = new C1.a(jVar);
                    if (C2797e.d(this)) {
                        ((AndroidComposeView) C2809k.g(this)).getF40512H0().a(this, jVar.getKey());
                    }
                } else {
                    aVar.c(jVar);
                    ((AndroidComposeView) C2809k.g(this)).getF40512H0().f(this, jVar.getKey());
                }
            }
        }
        if ((getKindSet$ui_release() & 4) != 0) {
            if (bVar instanceof InterfaceC6990j) {
                this.f5423b = true;
            }
            if (!z11) {
                C2809k.d(this, 2).m2();
            }
        }
        if ((getKindSet$ui_release() & 2) != 0) {
            if (C2797e.d(this)) {
                AbstractC2810k0 coordinator$ui_release = getCoordinator$ui_release();
                Intrinsics.f(coordinator$ui_release);
                ((F) coordinator$ui_release).T2(this);
                coordinator$ui_release.q2();
            }
            if (!z11) {
                C2809k.d(this, 2).m2();
                C2809k.f(this).u0();
            }
        }
        if (bVar instanceof B1.p0) {
            ((B1.p0) bVar).b0(C2809k.f(this));
        }
        if ((getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            if ((bVar instanceof B1.h0) && C2797e.d(this)) {
                C2809k.f(this).u0();
            }
            if (bVar instanceof B1.g0) {
                this.f5426e = null;
                if (C2797e.d(this)) {
                    ((AndroidComposeView) C2809k.g(this)).K0(new b());
                }
            }
        }
        if ((getKindSet$ui_release() & 256) != 0 && (bVar instanceof B1.f0) && C2797e.d(this)) {
            C2809k.f(this).u0();
        }
        if (bVar instanceof j1.s) {
            ((j1.s) bVar).W().f().b(this);
        }
        if ((getKindSet$ui_release() & 16) != 0 && (bVar instanceof x1.D)) {
            ((x1.D) bVar).q1().c(getCoordinator$ui_release());
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            ((AndroidComposeView) C2809k.g(this)).G0();
        }
    }

    private final void O1() {
        C2797e.a aVar;
        if (!isAttached()) {
            A1.a.b("unInitializeModifier called on unattached node");
            throw null;
        }
        e.b bVar = this.f5422a;
        if ((getKindSet$ui_release() & 32) != 0) {
            if (bVar instanceof C1.j) {
                ((AndroidComposeView) C2809k.g(this)).getF40512H0().d(this, ((C1.j) bVar).getKey());
            }
            if (bVar instanceof C1.d) {
                aVar = C2797e.f5431a;
                ((C1.d) bVar).w1(aVar);
            }
        }
        if ((getKindSet$ui_release() & 8) != 0) {
            ((AndroidComposeView) C2809k.g(this)).G0();
        }
        if (bVar instanceof j1.s) {
            ((j1.s) bVar).W().f().s(this);
        }
    }

    @Override // D1.E
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B1.J) bVar).A(v11, interfaceC2552v, i11);
    }

    @Override // D1.C0
    public final boolean C1() {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((x1.D) bVar).q1().b();
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B1.J) bVar).D(y11, u11, j11);
    }

    @Override // D1.B
    public final void E(long j11) {
        e.b bVar = this.f5422a;
        if (bVar instanceof B1.h0) {
            ((B1.h0) bVar).E(j11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // C1.i, C1.l
    public final Object G(@NotNull C1.m mVar) {
        C2804h0 c02;
        this.f5425d.add(mVar);
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = getNode().getParent$ui_release();
        H f7 = C2809k.f(this);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 32) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 32) != 0) {
                        AbstractC2813m abstractC2813m = parent$ui_release;
                        ?? r42 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof C1.i) {
                                C1.i iVar = (C1.i) abstractC2813m;
                                if (iVar.getProvidedValues().a(mVar)) {
                                    return iVar.getProvidedValues().b(mVar);
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 32) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r42 = r42;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 32) != 0) {
                                        i11++;
                                        r42 = r42;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r42.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r42.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r42 = r42;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r42);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
        return mVar.a().invoke();
    }

    @Override // D1.E
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B1.J) bVar).I(v11, interfaceC2552v, i11);
    }

    @NotNull
    public final e.b J1() {
        return this.f5422a;
    }

    @Override // D1.E
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B1.J) bVar).K(v11, interfaceC2552v, i11);
    }

    @NotNull
    public final HashSet<C1.c<?>> K1() {
        return this.f5425d;
    }

    @Override // j1.e
    public final void L(@NotNull j1.w wVar) {
        e.b bVar = this.f5422a;
        if (bVar instanceof j1.d) {
            ((j1.d) bVar).L(wVar);
        } else {
            A1.a.b("onFocusEvent called on wrong node");
            throw null;
        }
    }

    @Override // D1.A0
    public final Object M(@NotNull Z1.d dVar, Object obj) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((B1.j0) bVar).M(dVar, obj);
    }

    public final void M1() {
        this.f5423b = true;
        C2820u.a(this);
    }

    public final void N1(@NotNull e.b bVar) {
        if (isAttached()) {
            O1();
        }
        this.f5422a = bVar;
        setKindSet$ui_release(p0.e(bVar));
        if (isAttached()) {
            L1(false);
        }
    }

    public final void P1() {
        Function1 function1;
        if (isAttached()) {
            this.f5425d.clear();
            z0 f40501c = ((AndroidComposeView) C2809k.g(this)).getF40501C();
            function1 = C2797e.f5433c;
            f40501c.f(this, function1, new C0126c());
        }
    }

    @Override // D1.C0
    public final void Y() {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((x1.D) bVar).q1().getClass();
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        I1.l F12 = ((I1.n) bVar).F1();
        Intrinsics.g(d11, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((I1.l) d11).c(F12);
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        Function1 function1;
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        InterfaceC6991k interfaceC6991k = (InterfaceC6991k) bVar;
        if (this.f5423b && (bVar instanceof InterfaceC6990j)) {
            e.b bVar2 = this.f5422a;
            if (bVar2 instanceof InterfaceC6990j) {
                z0 f40501c = ((AndroidComposeView) C2809k.g(this)).getF40501C();
                function1 = C2797e.f5432b;
                f40501c.f(this, function1, new C2795d(bVar2, this));
            }
            this.f5423b = false;
        }
        interfaceC6991k.draw(interfaceC8410c);
    }

    @Override // i1.InterfaceC6985e
    @NotNull
    public final Z1.d g() {
        return C2809k.f(this).E();
    }

    @Override // i1.InterfaceC6985e
    @NotNull
    public final Z1.s getLayoutDirection() {
        return C2809k.f(this).O();
    }

    @Override // C1.i
    @NotNull
    public final C1.h getProvidedValues() {
        C1.a aVar = this.f5424c;
        return aVar != null ? aVar : C1.b.f4298a;
    }

    @Override // i1.InterfaceC6985e
    public final long i() {
        return Z1.r.b(C2809k.d(this, UserVerificationMethods.USER_VERIFY_PATTERN).a());
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        L1(true);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        O1();
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((x1.D) bVar).q1().g(c10638m, enumC10640o);
    }

    @Override // D1.C0
    public final void r0() {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((x1.D) bVar).q1().f();
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((B1.f0) bVar).s(abstractC2810k0);
    }

    @NotNull
    public final String toString() {
        return this.f5422a.toString();
    }

    @Override // D1.E
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        e.b bVar = this.f5422a;
        Intrinsics.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((B1.J) bVar).u(v11, interfaceC2552v, i11);
    }

    @Override // D1.InterfaceC2819t
    public final void u0() {
        this.f5423b = true;
        C2820u.a(this);
    }

    @Override // D1.B
    public final void y(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f5426e = abstractC2810k0;
        e.b bVar = this.f5422a;
        if (bVar instanceof B1.g0) {
            ((B1.g0) bVar).y(abstractC2810k0);
        }
    }

    @Override // j1.o
    public final void y0(@NotNull j1.m mVar) {
        e.b bVar = this.f5422a;
        if (bVar instanceof j1.j) {
            ((j1.j) bVar).G1();
        } else {
            A1.a.b("applyFocusProperties called on wrong node");
            throw null;
        }
    }
}
