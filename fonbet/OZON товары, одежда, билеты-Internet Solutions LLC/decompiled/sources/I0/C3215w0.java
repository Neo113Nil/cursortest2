package I0;

import B0.EnumC2526y0;
import I0.C3220z;
import K1.C3422b;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.collection.AbstractC5149s;
import androidx.collection.C5150t;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.platform.C5236c1;
import androidx.compose.ui.platform.S1;
import androidx.compose.ui.platform.U1;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import k1.C7459e;
import k1.C7460f;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import n0.C8371L;
import org.jetbrains.annotations.NotNull;
import t1.InterfaceC9723a;
import v1.C10177b;

/* renamed from: I0.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3215w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M0 f11621a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11622b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11623c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f11624d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9723a f11625e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.compose.ui.platform.I0 f11626f;

    /* renamed from: g, reason: collision with root package name */
    private S1 f11627g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private j1.r f11628h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11629i;

    /* renamed from: j, reason: collision with root package name */
    private C7459e f11630j;

    /* renamed from: k, reason: collision with root package name */
    private B1.B f11631k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11632l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11633m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11634n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11635o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11636p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C3991w0 f11637q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC3198n0 f11638r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11639s;

    /* renamed from: I0.w0$a */
    static final class a extends AbstractC7737t implements Function1<Long, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l11) {
            long longValue = l11.longValue();
            C3215w0 c3215w0 = C3215w0.this;
            if (c3215w0.f11621a.f().a(longValue)) {
                c3215w0.P();
                c3215w0.R();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$b */
    static final class b extends AbstractC7737t implements InterfaceC6512o<Boolean, B1.B, C7459e, F, Unit> {
        b() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public final Unit invoke(Boolean bool, B1.B b11, C7459e c7459e, F f7) {
            boolean booleanValue = bool.booleanValue();
            B1.B b12 = b11;
            long n11 = c7459e.n();
            F f11 = f7;
            long a11 = b12.a();
            C7460f c7460f = new C7460f(0.0f, 0.0f, (int) (a11 >> 32), (int) (a11 & 4294967295L));
            if (!B0.c(n11, c7460f)) {
                n11 = E0.a1.a(n11, c7460f);
            }
            C3215w0 c3215w0 = C3215w0.this;
            long a12 = C3215w0.a(c3215w0, b12, n11);
            if (P9.a.d(a12)) {
                c3215w0.K(booleanValue);
                C3215w0.i(c3215w0, a12, f11);
                c3215w0.t().d();
                c3215w0.N(false);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$c */
    static final class c extends AbstractC7737t implements Function2<Boolean, Long, Unit> {
        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Long l11) {
            boolean booleanValue = bool.booleanValue();
            long longValue = l11.longValue();
            C3215w0 c3215w0 = C3215w0.this;
            Pair<C3220z, AbstractC5149s<C3220z>> F11 = c3215w0.F(longValue, c3215w0.x());
            C3220z a11 = F11.a();
            AbstractC5149s<C3220z> b11 = F11.b();
            if (!Intrinsics.d(a11, c3215w0.x())) {
                c3215w0.f11621a.u(b11);
                c3215w0.w().invoke(a11);
            }
            c3215w0.K(booleanValue);
            c3215w0.t().d();
            c3215w0.N(false);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$d */
    static final class d extends AbstractC7737t implements fd.q<Boolean, B1.B, C7459e, C7459e, Boolean, F, Boolean> {
        d() {
            super(6);
        }

        @Override // fd.q
        public final Boolean invoke(Boolean bool, B1.B b11, C7459e c7459e, C7459e c7459e2, Boolean bool2, F f7) {
            boolean booleanValue = bool.booleanValue();
            B1.B b12 = b11;
            long n11 = c7459e.n();
            long n12 = c7459e2.n();
            C3215w0 c3215w0 = C3215w0.this;
            long a11 = C3215w0.a(c3215w0, b12, n11);
            long a12 = C3215w0.a(c3215w0, b12, n12);
            c3215w0.K(booleanValue);
            C7459e a13 = C7459e.a(a11);
            c3215w0.getClass();
            return Boolean.valueOf(c3215w0.Q(a13.n(), a12, bool2.booleanValue(), f7));
        }
    }

    /* renamed from: I0.w0$e */
    static final class e extends AbstractC7737t implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C3215w0 c3215w0 = C3215w0.this;
            c3215w0.N(true);
            C3215w0.f(c3215w0, null);
            C3215w0.c(c3215w0, null);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$f */
    static final class f extends AbstractC7737t implements Function1<Long, Unit> {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l11) {
            long longValue = l11.longValue();
            C3215w0 c3215w0 = C3215w0.this;
            if (c3215w0.f11621a.f().a(longValue)) {
                c3215w0.C();
                c3215w0.M(null);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$g */
    static final class g extends AbstractC7737t implements Function1<Long, Unit> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l11) {
            C3220z.a b11;
            C3220z.a d11;
            long longValue = l11.longValue();
            C3215w0 c3215w0 = C3215w0.this;
            C3220z x11 = c3215w0.x();
            if (x11 != null && (d11 = x11.d()) != null && longValue == d11.d()) {
                C3215w0.h(c3215w0);
            }
            C3220z x12 = c3215w0.x();
            if (x12 != null && (b11 = x12.b()) != null && longValue == b11.d()) {
                C3215w0.g(c3215w0);
            }
            if (c3215w0.f11621a.f().a(longValue)) {
                c3215w0.R();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$h */
    static final class h extends AbstractC7737t implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C3215w0.this.C();
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$i */
    static final class i extends AbstractC7737t implements Function1<B1.B, Unit> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(B1.B b11) {
            C3215w0.this.H(b11);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$j */
    static final class j extends AbstractC7737t implements Function1<j1.v, Unit> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j1.v vVar) {
            j1.v vVar2 = vVar;
            boolean a11 = vVar2.a();
            C3215w0 c3215w0 = C3215w0.this;
            if (!a11 && c3215w0.u()) {
                c3215w0.C();
            }
            c3215w0.J(vVar2.a());
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$k */
    static final class k extends AbstractC7737t implements Function1<Boolean, Unit> {
        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            C3215w0.this.K(bool.booleanValue());
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$l */
    static final class l extends AbstractC7737t implements Function1<C10177b, Boolean> {
        l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C10177b c10177b) {
            boolean z11;
            if (B0.J0.a().a(c10177b.b()) == B0.F0.COPY) {
                C3215w0.this.l();
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: I0.w0$m */
    static final class m extends AbstractC7737t implements Function1<C3220z, Unit> {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3220z c3220z) {
            C3215w0.this.M(c3220z);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$n */
    static final class n extends AbstractC7737t implements Function1<C3220z, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C3220z, Unit> f11654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(Function1<? super C3220z, Unit> function1) {
            super(1);
            this.f11654c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C3220z c3220z) {
            C3220z c3220z2 = c3220z;
            C3215w0.this.M(c3220z2);
            this.f11654c.invoke(c3220z2);
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$o */
    /* synthetic */ class o extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C3215w0 c3215w0 = (C3215w0) this.receiver;
            c3215w0.l();
            c3215w0.C();
            return Unit.f71690a;
        }
    }

    /* renamed from: I0.w0$p */
    /* synthetic */ class p extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((C3215w0) this.receiver).E();
            return Unit.f71690a;
        }
    }

    public C3215w0(@NotNull M0 m02) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        C3991w0 f17;
        C3991w0 f18;
        this.f11621a = m02;
        f7 = n1.f(null, D1.f25195a);
        this.f11622b = f7;
        f11 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f11623c = f11;
        this.f11624d = new m();
        this.f11628h = new j1.r();
        f12 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f11629i = f12;
        f13 = n1.f(C7459e.a(0L), D1.f25195a);
        this.f11632l = f13;
        f14 = n1.f(C7459e.a(0L), D1.f25195a);
        this.f11633m = f14;
        f15 = n1.f(null, D1.f25195a);
        this.f11634n = f15;
        f16 = n1.f(null, D1.f25195a);
        this.f11635o = f16;
        f17 = n1.f(null, D1.f25195a);
        this.f11636p = f17;
        f18 = n1.f(null, D1.f25195a);
        this.f11637q = f18;
        m02.o(new a());
        m02.t(new b());
        m02.s(new c());
        m02.q(new d());
        m02.r(new e());
        m02.p(new f());
        m02.n(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (I0.B0.c(r10, r9) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        C7459e c7459e;
        C3220z.a b11;
        C3220z.a d11;
        C3220z x11 = x();
        B1.B b12 = this.f11631k;
        C7459e c7459e2 = null;
        InterfaceC3216x m11 = (x11 == null || (d11 = x11.d()) == null) ? null : m(d11);
        InterfaceC3216x m12 = (x11 == null || (b11 = x11.b()) == null) ? null : m(b11);
        B1.B v11 = m11 != null ? m11.v() : null;
        B1.B v12 = m12 != null ? m12.v() : null;
        C3991w0 c3991w0 = this.f11635o;
        C3991w0 c3991w02 = this.f11634n;
        if (x11 == null || b12 == null || !b12.I() || (v11 == null && v12 == null)) {
            c3991w02.setValue(null);
            c3991w0.setValue(null);
            return;
        }
        C7460f f7 = B0.f(b12);
        if (v11 != null) {
            long c11 = m11.c(x11, true);
            if (!P9.a.e(c11)) {
                c7459e = C7459e.a(b12.W(v11, c11));
                long n11 = c7459e.n();
                if (r() != EnumC2526y0.SelectionStart) {
                }
                c3991w02.setValue(c7459e);
                if (v12 != null) {
                    long c12 = m12.c(x11, false);
                    if (!P9.a.e(c12)) {
                        C7459e a11 = C7459e.a(b12.W(v12, c12));
                        long n12 = a11.n();
                        if (r() == EnumC2526y0.SelectionEnd || B0.c(n12, f7)) {
                            c7459e2 = a11;
                        }
                    }
                }
                c3991w0.setValue(c7459e2);
            }
        }
        c7459e = null;
        c3991w02.setValue(c7459e);
        if (v12 != null) {
        }
        c3991w0.setValue(c7459e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        S1 s12;
        B1.B b11;
        C7460f c7460f;
        C7460f g10;
        if (!u() || (s12 = this.f11627g) == null) {
            return;
        }
        if (!this.f11639s || !A()) {
            if (s12.getStatus() == U1.Shown) {
                s12.hide();
                return;
            }
            return;
        }
        if (x() != null && (b11 = this.f11631k) != null && b11.I()) {
            B1.B D11 = D();
            M0 m02 = this.f11621a;
            ArrayList v11 = m02.v(D11);
            ArrayList arrayList = new ArrayList(v11.size());
            int size = v11.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC3216x interfaceC3216x = (InterfaceC3216x) v11.get(i11);
                C3220z c11 = m02.f().c(interfaceC3216x.h());
                Pair pair = c11 != null ? new Pair(interfaceC3216x, c11) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            int size2 = arrayList.size();
            ArrayList arrayList2 = arrayList;
            if (size2 != 0) {
                arrayList2 = arrayList;
                if (size2 != 1) {
                    arrayList2 = C7714v.b0(C7714v.K(arrayList), C7714v.X(arrayList));
                }
            }
            if (!arrayList2.isEmpty()) {
                C7460f e11 = B0.e(arrayList2, b11);
                c7460f = B0.f11298a;
                if (!e11.equals(c7460f)) {
                    C7460f w11 = B0.f(b11).w(e11);
                    if (w11.u() >= 0.0f && w11.m() >= 0.0f) {
                        C7460f A11 = w11.A(b11.y(0L));
                        g10 = C7460f.g(A11, 0.0f, 0.0f, (C3196m0.b() * 4) + A11.h(), 7);
                        if (g10 != null) {
                            return;
                        }
                        s12.a(g10, B() ? new o(0, this, C3215w0.class, "toolbarCopy", "toolbarCopy()V", 0) : null, null, null, z() ? null : new p(0, this, C3215w0.class, "selectAll", "selectAll$foundation_release()V", 0));
                        return;
                    }
                }
            }
        }
        g10 = null;
        if (g10 != null) {
        }
    }

    public static final long a(C3215w0 c3215w0, B1.B b11, long j11) {
        B1.B b12 = c3215w0.f11631k;
        if (b12 == null || !b12.I()) {
            return 9205357640488583168L;
        }
        return c3215w0.D().W(b11, j11);
    }

    public static final void c(C3215w0 c3215w0, C7459e c7459e) {
        c3215w0.f11637q.setValue(c7459e);
    }

    public static final void d(C3215w0 c3215w0, long j11) {
        c3215w0.f11632l.setValue(C7459e.a(j11));
    }

    public static final void e(C3215w0 c3215w0, long j11) {
        c3215w0.f11633m.setValue(C7459e.a(j11));
    }

    public static final void f(C3215w0 c3215w0, EnumC2526y0 enumC2526y0) {
        c3215w0.f11636p.setValue(enumC2526y0);
    }

    public static final void g(C3215w0 c3215w0) {
        c3215w0.f11635o.setValue(null);
    }

    public static final void h(C3215w0 c3215w0) {
        c3215w0.f11634n.setValue(null);
    }

    public static final void i(C3215w0 c3215w0, long j11, F f7) {
        c3215w0.f11638r = null;
        c3215w0.Q(j11, 9205357640488583168L, false, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f11623c.getValue()).booleanValue();
    }

    public final boolean B() {
        C3220z x11 = x();
        if (x11 != null && !Intrinsics.d(x11.d(), x11.b())) {
            if (x11.d().d() == x11.b().d()) {
                return true;
            }
            B1.B D11 = D();
            M0 m02 = this.f11621a;
            ArrayList v11 = m02.v(D11);
            int size = v11.size();
            for (int i11 = 0; i11 < size; i11++) {
                C3220z c11 = m02.f().c(((InterfaceC3216x) v11.get(i11)).h());
                if (c11 != null && c11.d().c() != c11.b().c()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void C() {
        InterfaceC9723a interfaceC9723a;
        this.f11621a.u(C5150t.a());
        N(false);
        if (x() != null) {
            this.f11624d.invoke(null);
            if (!A() || (interfaceC9723a = this.f11625e) == null) {
                return;
            }
            interfaceC9723a.a(9);
        }
    }

    @NotNull
    public final B1.B D() {
        B1.B b11 = this.f11631k;
        if (b11 == null) {
            throw new IllegalArgumentException("null coordinates");
        }
        if (b11.I()) {
            return b11;
        }
        throw new IllegalArgumentException("unattached coordinates");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void E() {
        B1.B D11 = D();
        M0 m02 = this.f11621a;
        ArrayList v11 = m02.v(D11);
        if (v11.isEmpty()) {
            return;
        }
        int i11 = C5150t.f38742b;
        androidx.collection.F f7 = new androidx.collection.F((Object) null);
        int size = v11.size();
        C3220z c3220z = null;
        C3220z c3220z2 = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3216x interfaceC3216x = (InterfaceC3216x) v11.get(i12);
            C3220z i13 = interfaceC3216x.i();
            if (i13 != null) {
                if (c3220z == null) {
                    c3220z = i13;
                }
                f7.h(interfaceC3216x.h(), i13);
                c3220z2 = i13;
            }
        }
        if (f7.f38740e == 0) {
            return;
        }
        if (c3220z != c3220z2) {
            Intrinsics.f(c3220z);
            C3220z.a d11 = c3220z.d();
            Intrinsics.f(c3220z2);
            c3220z = new C3220z(d11, c3220z2.b(), false);
        }
        m02.u(f7);
        this.f11624d.invoke(c3220z);
        this.f11638r = null;
    }

    @NotNull
    public final Pair<C3220z, AbstractC5149s<C3220z>> F(long j11, C3220z c3220z) {
        InterfaceC9723a interfaceC9723a;
        int i11 = C5150t.f38742b;
        androidx.collection.F f7 = new androidx.collection.F((Object) null);
        ArrayList v11 = this.f11621a.v(D());
        int size = v11.size();
        C3220z c3220z2 = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3216x interfaceC3216x = (InterfaceC3216x) v11.get(i12);
            C3220z i13 = interfaceC3216x.h() == j11 ? interfaceC3216x.i() : null;
            if (i13 != null) {
                f7.j(interfaceC3216x.h(), i13);
            }
            c3220z2 = c3220z2 != null ? c3220z2.e(i13) : i13;
        }
        if (A() && !Intrinsics.d(c3220z2, c3220z) && (interfaceC9723a = this.f11625e) != null) {
            interfaceC9723a.a(9);
        }
        return new Pair<>(c3220z2, f7);
    }

    public final void G(androidx.compose.ui.platform.I0 i02) {
        this.f11626f = i02;
    }

    public final void H(B1.B b11) {
        this.f11631k = b11;
        if (!u() || x() == null) {
            return;
        }
        C7459e a11 = b11 != null ? C7459e.a(b11.u(0L)) : null;
        if (Intrinsics.d(this.f11630j, a11)) {
            return;
        }
        this.f11630j = a11;
        P();
        R();
    }

    public final void I(InterfaceC9723a interfaceC9723a) {
        this.f11625e = interfaceC9723a;
    }

    public final void J(boolean z11) {
        this.f11629i.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(boolean z11) {
        C3991w0 c3991w0 = this.f11623c;
        if (((Boolean) c3991w0.getValue()).booleanValue() != z11) {
            c3991w0.setValue(Boolean.valueOf(z11));
            R();
        }
    }

    public final void L(@NotNull Function1<? super C3220z, Unit> function1) {
        this.f11624d = new n(function1);
    }

    public final void M(C3220z c3220z) {
        this.f11622b.setValue(c3220z);
        if (c3220z != null) {
            P();
        }
    }

    public final void N(boolean z11) {
        this.f11639s = z11;
        R();
    }

    public final void O(S1 s12) {
        this.f11627g = s12;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final boolean Q(long j11, long j12, boolean z11, @NotNull F f7) {
        this.f11636p.setValue(z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd);
        this.f11637q.setValue(C7459e.a(j11));
        B1.B D11 = D();
        M0 m02 = this.f11621a;
        ArrayList v11 = m02.v(D11);
        int i11 = androidx.collection.r.f38735a;
        androidx.collection.E e11 = new androidx.collection.E(6);
        int size = v11.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            e11.d(i13, ((InterfaceC3216x) v11.get(i13)).h());
        }
        C3200o0 c3200o0 = new C3200o0(j11, j12, D11, z11, P9.a.e(j12) ? null : x(), new C3219y0(e11));
        int size2 = v11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((InterfaceC3216x) v11.get(i14)).a(c3200o0);
        }
        InterfaceC3198n0 b11 = c3200o0.b();
        if (!b11.d(this.f11638r)) {
            return false;
        }
        C3220z a11 = f7.a(b11);
        if (!Intrinsics.d(a11, x())) {
            if (A()) {
                ArrayList m11 = m02.m();
                int size3 = m11.size();
                while (true) {
                    if (i12 >= size3) {
                        break;
                    }
                    if (((InterfaceC3216x) m11.get(i12)).getText().length() > 0) {
                        InterfaceC9723a interfaceC9723a = this.f11625e;
                        if (interfaceC9723a != null) {
                            interfaceC9723a.a(9);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            m02.u(b11.i(a11));
            this.f11624d.invoke(a11);
        }
        this.f11638r = b11;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        C3422b c3422b;
        androidx.compose.ui.platform.I0 i02;
        if (x() != null) {
            M0 m02 = this.f11621a;
            if (m02.f().f38740e != 0) {
                C3422b.a aVar = new C3422b.a();
                ArrayList v11 = m02.v(D());
                int size = v11.size();
                for (int i11 = 0; i11 < size; i11++) {
                    InterfaceC3216x interfaceC3216x = (InterfaceC3216x) v11.get(i11);
                    C3220z c11 = m02.f().c(interfaceC3216x.h());
                    if (c11 != null) {
                        C3422b text = interfaceC3216x.getText();
                        aVar.d(c11.c() ? text.subSequence(c11.b().c(), c11.d().c()) : text.subSequence(c11.d().c(), c11.b().c()));
                    }
                }
                c3422b = aVar.i();
                if (c3422b == null) {
                    C3422b c3422b2 = c3422b.length() > 0 ? c3422b : null;
                    if (c3422b2 == null || (i02 = this.f11626f) == null) {
                        return;
                    }
                    i02.c(c3422b2);
                    return;
                }
                return;
            }
        }
        c3422b = null;
        if (c3422b == null) {
        }
    }

    public final InterfaceC3216x m(@NotNull C3220z.a aVar) {
        return (InterfaceC3216x) this.f11621a.l().c(aVar.d());
    }

    public final B1.B n() {
        return this.f11631k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7459e o() {
        return (C7459e) this.f11637q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p() {
        return ((C7459e) this.f11632l.getValue()).n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((C7459e) this.f11633m.getValue()).n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC2526y0 r() {
        return (EnumC2526y0) this.f11636p.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7459e s() {
        return (C7459e) this.f11635o.getValue();
    }

    @NotNull
    public final j1.r t() {
        return this.f11628h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.f11629i.getValue()).booleanValue();
    }

    @NotNull
    public final androidx.compose.ui.e v() {
        androidx.compose.ui.e eVar = androidx.compose.ui.e.f40358c0;
        androidx.compose.ui.e a11 = androidx.compose.ui.input.key.a.a(C3176c0.l(FocusableKt.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.i.a(androidx.compose.ui.layout.c.a(u() ? x1.L.b(eVar, Unit.f71690a, new A0(this, new h(), null)) : eVar, new i()), this.f11628h), new j()), true, null), new k()), new l());
        if (r() != null && A()) {
            C3220z x11 = x();
            if (!(x11 != null ? Intrinsics.d(x11.d(), x11.b()) : true) && C8371L.b()) {
                eVar = androidx.compose.ui.c.b(eVar, C5236c1.a(), new J0(this));
            }
        }
        return a11.l0(eVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<I0.z, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<C3220z, Unit> w() {
        return this.f11624d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3220z x() {
        return (C3220z) this.f11622b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C7459e y() {
        return (C7459e) this.f11634n.getValue();
    }

    public final boolean z() {
        C3220z c11;
        B1.B D11 = D();
        M0 m02 = this.f11621a;
        ArrayList v11 = m02.v(D11);
        if (v11.isEmpty()) {
            return true;
        }
        int size = v11.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC3216x interfaceC3216x = (InterfaceC3216x) v11.get(i11);
            C3422b text = interfaceC3216x.getText();
            if (text.length() != 0 && ((c11 = m02.f().c(interfaceC3216x.h())) == null || Math.abs(c11.d().c() - c11.b().c()) != text.length())) {
                return false;
            }
        }
        return true;
    }
}
