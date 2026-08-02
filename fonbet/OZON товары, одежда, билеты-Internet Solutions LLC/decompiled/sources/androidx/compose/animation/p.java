package androidx.compose.animation;

import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.J;
import l0.O;
import l0.d0;
import l0.e0;
import l0.k0;
import l1.InterfaceC7825i0;
import m0.C8010q;
import m0.C8011q0;
import m0.D0;
import m0.H;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class p extends e0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private D0<O> f38786a;

    /* renamed from: b, reason: collision with root package name */
    private D0<O>.a<Z1.q, C8010q> f38787b;

    /* renamed from: c, reason: collision with root package name */
    private D0<O>.a<Z1.m, C8010q> f38788c;

    /* renamed from: d, reason: collision with root package name */
    private D0<O>.a<Z1.m, C8010q> f38789d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private q f38790e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private s f38791f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f38792g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private d0 f38793h;

    /* renamed from: i, reason: collision with root package name */
    private long f38794i = androidx.compose.animation.a.b();

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6250b f38795j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function1<D0.b<O>, H<Z1.q>> f38796k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function1<D0.b<O>, H<Z1.m>> f38797l;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38798a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38798a = iArr;
        }
    }

    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f38799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var) {
            super(1);
            this.f38799b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f38799b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f38800b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38801c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f38802d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC7825i0, Unit> f38803e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(m0 m0Var, long j11, long j12, Function1<? super InterfaceC7825i0, Unit> function1) {
            super(1);
            this.f38800b = m0Var;
            this.f38801c = j11;
            this.f38802d = j12;
            this.f38803e = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            long j11 = this.f38801c;
            long j12 = this.f38802d;
            aVar.n(this.f38800b, ((int) (j11 >> 32)) + ((int) (j12 >> 32)), ((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)), 0.0f, this.f38803e);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f38804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m0 m0Var) {
            super(1);
            this.f38804b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.d(this.f38804b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<O, Z1.q> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11) {
            super(1);
            this.f38806c = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Z1.q invoke(O o11) {
            return Z1.q.a(p.this.T1(o11, this.f38806c));
        }
    }

    static final class f extends AbstractC7737t implements Function1<D0.b<O>, H<Z1.m>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f38807b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final H<Z1.m> invoke(D0.b<O> bVar) {
            C8011q0 c8011q0;
            c8011q0 = androidx.compose.animation.b.f38766c;
            return c8011q0;
        }
    }

    static final class g extends AbstractC7737t implements Function1<O, Z1.m> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j11) {
            super(1);
            this.f38809c = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Z1.m invoke(O o11) {
            return Z1.m.a(p.this.V1(o11, this.f38809c));
        }
    }

    static final class h extends AbstractC7737t implements Function1<O, Z1.m> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j11) {
            super(1);
            this.f38811c = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Z1.m invoke(O o11) {
            return Z1.m.a(p.this.U1(o11, this.f38811c));
        }
    }

    static final class i extends AbstractC7737t implements Function1<D0.b<O>, H<Z1.q>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final H<Z1.q> invoke(D0.b<O> bVar) {
            C8011q0 c8011q0;
            D0.b<O> bVar2 = bVar;
            O o11 = O.PreEnter;
            O o12 = O.Visible;
            boolean a11 = bVar2.a(o11, o12);
            H<Z1.q> h11 = null;
            p pVar = p.this;
            if (a11) {
                J a12 = pVar.J1().b().a();
                if (a12 != null) {
                    h11 = a12.b();
                }
            } else if (bVar2.a(o12, O.PostExit)) {
                J a13 = pVar.K1().b().a();
                if (a13 != null) {
                    h11 = a13.b();
                }
            } else {
                h11 = androidx.compose.animation.b.f38767d;
            }
            if (h11 != null) {
                return h11;
            }
            c8011q0 = androidx.compose.animation.b.f38767d;
            return c8011q0;
        }
    }

    static final class j extends AbstractC7737t implements Function1<D0.b<O>, H<Z1.m>> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final H<Z1.m> invoke(D0.b<O> bVar) {
            C8011q0 c8011q0;
            C8011q0 c8011q02;
            H<Z1.m> a11;
            C8011q0 c8011q03;
            H<Z1.m> a12;
            D0.b<O> bVar2 = bVar;
            O o11 = O.PreEnter;
            O o12 = O.Visible;
            boolean a13 = bVar2.a(o11, o12);
            p pVar = p.this;
            if (a13) {
                k0 f7 = pVar.J1().b().f();
                if (f7 != null && (a12 = f7.a()) != null) {
                    return a12;
                }
                c8011q03 = androidx.compose.animation.b.f38766c;
                return c8011q03;
            }
            if (!bVar2.a(o12, O.PostExit)) {
                c8011q0 = androidx.compose.animation.b.f38766c;
                return c8011q0;
            }
            k0 f11 = pVar.K1().b().f();
            if (f11 != null && (a11 = f11.a()) != null) {
                return a11;
            }
            c8011q02 = androidx.compose.animation.b.f38766c;
            return c8011q02;
        }
    }

    public p(@NotNull D0<O> d02, D0<O>.a<Z1.q, C8010q> aVar, D0<O>.a<Z1.m, C8010q> aVar2, D0<O>.a<Z1.m, C8010q> aVar3, @NotNull q qVar, @NotNull s sVar, @NotNull Function0<Boolean> function0, @NotNull d0 d0Var) {
        this.f38786a = d02;
        this.f38787b = aVar;
        this.f38788c = aVar2;
        this.f38789d = aVar3;
        this.f38790e = qVar;
        this.f38791f = sVar;
        this.f38792g = function0;
        this.f38793h = d0Var;
        Z1.c.b(0, 0, 15);
        this.f38796k = new i();
        this.f38797l = new j();
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        long j12;
        W z03;
        W z04;
        if (this.f38786a.h() == this.f38786a.n()) {
            this.f38795j = null;
        } else if (this.f38795j == null) {
            InterfaceC6250b I12 = I1();
            if (I12 == null) {
                I12 = InterfaceC6250b.a.o();
            }
            this.f38795j = I12;
        }
        if (y11.R0()) {
            m0 a02 = u11.a0(j11);
            long a11 = Z1.r.a(a02.u0(), a02.l0());
            this.f38794i = a11;
            z04 = y11.z0((int) (a11 >> 32), (int) (a11 & 4294967295L), kotlin.collections.U.c(), new b(a02));
            return z04;
        }
        if (!this.f38792g.invoke().booleanValue()) {
            m0 a03 = u11.a0(j11);
            z02 = y11.z0(a03.u0(), a03.l0(), kotlin.collections.U.c(), new d(a03));
            return z02;
        }
        Function1<InterfaceC7825i0, Unit> init = this.f38793h.init();
        m0 a04 = u11.a0(j11);
        long a12 = Z1.r.a(a04.u0(), a04.l0());
        long j13 = androidx.compose.animation.a.c(this.f38794i) ? this.f38794i : a12;
        D0<O>.a<Z1.q, C8010q> aVar = this.f38787b;
        D0.a.C1247a a13 = aVar != null ? aVar.a(this.f38796k, new e(j13)) : null;
        if (a13 != null) {
            a12 = ((Z1.q) a13.getValue()).e();
        }
        long e11 = Z1.c.e(j11, a12);
        D0<O>.a<Z1.m, C8010q> aVar2 = this.f38788c;
        long j14 = 0;
        long g10 = aVar2 != null ? ((Z1.m) aVar2.a(f.f38807b, new g(j13)).getValue()).g() : 0L;
        D0<O>.a<Z1.m, C8010q> aVar3 = this.f38789d;
        long g11 = aVar3 != null ? ((Z1.m) aVar3.a(this.f38797l, new h(j13)).getValue()).g() : 0L;
        InterfaceC6250b interfaceC6250b = this.f38795j;
        if (interfaceC6250b != null) {
            long j15 = j13;
            j12 = g11;
            j14 = interfaceC6250b.a(j15, e11, Z1.s.Ltr);
        } else {
            j12 = g11;
        }
        z03 = y11.z0((int) (e11 >> 32), (int) (e11 & 4294967295L), kotlin.collections.U.c(), new c(a04, Z1.m.e(j14, j12), g10, init));
        return z03;
    }

    public final InterfaceC6250b I1() {
        if (this.f38786a.m().a(O.PreEnter, O.Visible)) {
            J a11 = this.f38790e.b().a();
            if (a11 != null) {
                return a11.a();
            }
            J a12 = this.f38791f.b().a();
            if (a12 != null) {
                return a12.a();
            }
            return null;
        }
        J a13 = this.f38791f.b().a();
        if (a13 != null) {
            return a13.a();
        }
        J a14 = this.f38790e.b().a();
        if (a14 != null) {
            return a14.a();
        }
        return null;
    }

    @NotNull
    public final q J1() {
        return this.f38790e;
    }

    @NotNull
    public final s K1() {
        return this.f38791f;
    }

    public final void L1(@NotNull Function0<Boolean> function0) {
        this.f38792g = function0;
    }

    public final void M1(@NotNull q qVar) {
        this.f38790e = qVar;
    }

    public final void N1(@NotNull s sVar) {
        this.f38791f = sVar;
    }

    public final void O1(@NotNull d0 d0Var) {
        this.f38793h = d0Var;
    }

    public final void P1(D0<O>.a<Z1.m, C8010q> aVar) {
        this.f38788c = aVar;
    }

    public final void Q1(D0<O>.a<Z1.q, C8010q> aVar) {
        this.f38787b = aVar;
    }

    public final void R1(D0<O>.a<Z1.m, C8010q> aVar) {
        this.f38789d = aVar;
    }

    public final void S1(@NotNull D0<O> d02) {
        this.f38786a = d02;
    }

    public final long T1(@NotNull O o11, long j11) {
        Function1<Z1.q, Z1.q> c11;
        Function1<Z1.q, Z1.q> c12;
        int i11 = a.f38798a[o11.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                J a11 = this.f38790e.b().a();
                if (a11 != null && (c11 = a11.c()) != null) {
                    return c11.invoke(Z1.q.a(j11)).e();
                }
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                J a12 = this.f38791f.b().a();
                if (a12 != null && (c12 = a12.c()) != null) {
                    return c12.invoke(Z1.q.a(j11)).e();
                }
            }
        }
        return j11;
    }

    public final long U1(@NotNull O o11, long j11) {
        k0 f7 = this.f38790e.b().f();
        long g10 = f7 != null ? f7.b().invoke(Z1.q.a(j11)).g() : 0L;
        k0 f11 = this.f38791f.b().f();
        long g11 = f11 != null ? f11.b().invoke(Z1.q.a(j11)).g() : 0L;
        int i11 = a.f38798a[o11.ordinal()];
        if (i11 == 1) {
            return 0L;
        }
        if (i11 == 2) {
            return g10;
        }
        if (i11 == 3) {
            return g11;
        }
        throw new Sc.o();
    }

    public final long V1(@NotNull O o11, long j11) {
        int i11;
        if (this.f38795j == null || I1() == null || Intrinsics.d(this.f38795j, I1()) || (i11 = a.f38798a[o11.ordinal()]) == 1 || i11 == 2) {
            return 0L;
        }
        if (i11 != 3) {
            throw new Sc.o();
        }
        J a11 = this.f38791f.b().a();
        if (a11 == null) {
            return 0L;
        }
        long e11 = a11.c().invoke(Z1.q.a(j11)).e();
        InterfaceC6250b I12 = I1();
        Intrinsics.f(I12);
        Z1.s sVar = Z1.s.Ltr;
        long a12 = ((e1.d) I12).a(j11, e11, sVar);
        InterfaceC6250b interfaceC6250b = this.f38795j;
        Intrinsics.f(interfaceC6250b);
        return Z1.m.d(a12, interfaceC6250b.a(j11, e11, sVar));
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        super.onAttach();
        this.f38794i = androidx.compose.animation.a.b();
    }
}
