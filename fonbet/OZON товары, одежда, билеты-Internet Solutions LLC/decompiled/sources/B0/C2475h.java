package B0;

import Bl0.C2652m;
import Bl0.C2656q;
import D1.InterfaceC2801g;
import E0.C2950u0;
import F0.C2983d;
import F0.C2990k;
import I0.C3181f;
import I0.InterfaceC3214w;
import Q1.X;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import t1.InterfaceC9723a;

/* renamed from: B0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2475h {

    /* renamed from: a, reason: collision with root package name */
    private static final long f1741a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1742b = 0;

    /* renamed from: B0.h$a */
    static final class a extends AbstractC7737t implements Function1<K1.K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1743b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(K1.K k11) {
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$b */
    static final class b extends AbstractC7737t implements Function1<Q1.K, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1.K f1744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Q1.K, Unit> f1745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function1 function1, Q1.K k11) {
            super(1);
            this.f1744b = k11;
            this.f1745c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Q1.K k11) {
            Q1.K k12 = k11;
            if (!Intrinsics.d(this.f1744b, k12)) {
                this.f1745c.invoke(k12);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$c */
    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q1.K f1746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Q1.K, Unit> f1747c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f1748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f1749e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f1750f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ K1.T f1751g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ N0 f1752h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ M0 f1753i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f1754j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f1755k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f1756l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Q1.X f1757m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1<K1.K, Unit> f1758n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ t0.q f1759o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractC7799Q f1760p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> f1761q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f1762r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f1763s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f1764t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Q1.K k11, Function1<? super Q1.K, Unit> function1, androidx.compose.ui.e eVar, boolean z11, boolean z12, K1.T t2, N0 n02, M0 m02, boolean z13, int i11, int i12, Q1.X x11, Function1<? super K1.K, Unit> function12, t0.q qVar, AbstractC7799Q abstractC7799Q, InterfaceC6511n<? super Function2<? super InterfaceC3967k, ? super Integer, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, int i13, int i14, int i15) {
            super(2);
            this.f1746b = k11;
            this.f1747c = function1;
            this.f1748d = eVar;
            this.f1749e = z11;
            this.f1750f = z12;
            this.f1751g = t2;
            this.f1752h = n02;
            this.f1753i = m02;
            this.f1754j = z13;
            this.f1755k = i11;
            this.f1756l = i12;
            this.f1757m = x11;
            this.f1758n = function12;
            this.f1759o = qVar;
            this.f1760p = abstractC7799Q;
            this.f1761q = interfaceC6511n;
            this.f1762r = i13;
            this.f1763s = i14;
            this.f1764t = i15;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f1762r | 1);
            int e12 = C2652m.e(this.f1763s);
            AbstractC7799Q abstractC7799Q = this.f1760p;
            t0.q qVar = this.f1759o;
            int i11 = this.f1764t;
            C2475h.c(this.f1746b, this.f1747c, this.f1748d, this.f1749e, this.f1750f, this.f1751g, this.f1752h, this.f1753i, this.f1754j, this.f1755k, this.f1756l, this.f1757m, this.f1758n, qVar, abstractC7799Q, this.f1761q, interfaceC3967k, e11, e12, i11);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$d */
    static final class d implements D0.b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1765a = new d();

        /* renamed from: B0.h$d$a */
        /* loaded from: classes8.dex */
        static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4912a f1767c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4912a c4912a, int i11) {
                super(2);
                this.f1767c = c4912a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                num.intValue();
                int e11 = C2652m.e(7);
                C4912a c4912a = this.f1767c;
                d.this.Decoration(c4912a, interfaceC3967k, e11);
                return Unit.f71690a;
            }
        }

        @Override // D0.b
        public final void Decoration(@NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC3967k interfaceC3967k, int i11) {
            C3969l u11 = interfaceC3967k.u(-1669748801);
            if ((((u11.n(this) ? 32 : 16) | i11) & 19) == 18 && u11.b()) {
                u11.j();
            } else {
                ((C4912a) function2).invoke(u11, 6);
            }
            S0.J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new a((C4912a) function2, i11));
            }
        }
    }

    /* renamed from: B0.h$e */
    /* loaded from: classes8.dex */
    static final class e implements InterfaceC3214w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2990k f1768a;

        e(C2990k c2990k) {
            this.f1768a = c2990k;
        }

        @Override // I0.InterfaceC3214w
        public final long a() {
            return this.f1768a.K(true).d();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1", f = "BasicTextField.kt", l = {430}, m = "invokeSuspend")
    /* renamed from: B0.h$f */
    /* loaded from: classes8.dex */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1769d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1770e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2990k f1771f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2990k c2990k, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f1771f = c2990k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f1771f, dVar);
            fVar.f1770e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1769d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f1770e;
                this.f1769d = 1;
                if (this.f1771f.C(f7, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$g */
    /* loaded from: classes8.dex */
    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2990k f1772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2990k c2990k, int i11) {
            super(2);
            this.f1772b = c2990k;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C2475h.e(this.f1772b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$h, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0045h extends AbstractC7737t implements Function0<C2983d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2990k f1773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0045h(C2990k c2990k) {
            super(0);
            this.f1773b = c2990k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C2983d invoke() {
            return this.f1773b.K(false);
        }
    }

    /* renamed from: B0.h$i */
    /* loaded from: classes8.dex */
    static final class i implements InterfaceC3214w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2990k f1774a;

        i(C2990k c2990k) {
            this.f1774a = c2990k;
        }

        @Override // I0.InterfaceC3214w
        public final long a() {
            return this.f1774a.Q(true, true).d();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1", f = "BasicTextField.kt", l = {458}, m = "invokeSuspend")
    /* renamed from: B0.h$j */
    /* loaded from: classes8.dex */
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1775d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1776e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2990k f1777f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C2990k c2990k, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f1777f = c2990k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f1777f, dVar);
            jVar.f1776e = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1775d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f1776e;
                this.f1775d = 1;
                if (this.f1777f.Y(f7, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$k */
    /* loaded from: classes8.dex */
    static final class k implements InterfaceC3214w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2990k f1778a;

        k(C2990k c2990k) {
            this.f1778a = c2990k;
        }

        @Override // I0.InterfaceC3214w
        public final long a() {
            return this.f1778a.Q(false, true).d();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1", f = "BasicTextField.kt", l = {481}, m = "invokeSuspend")
    /* renamed from: B0.h$l */
    /* loaded from: classes8.dex */
    static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1779d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1780e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2990k f1781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C2990k c2990k, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f1781f = c2990k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f1781f, dVar);
            lVar.f1780e = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1779d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f1780e;
                this.f1779d = 1;
                if (this.f1781f.Y(f7, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$m */
    /* loaded from: classes8.dex */
    static final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2990k f1782b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C2990k c2990k, int i11) {
            super(2);
            this.f1782b = c2990k;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C2475h.f(this.f1782b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.h$n */
    /* loaded from: classes8.dex */
    static final class n extends AbstractC7737t implements Function0<C2983d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2990k f1783b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C2990k c2990k) {
            super(0);
            this.f1783b = c2990k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C2983d invoke() {
            return this.f1783b.Q(false, false);
        }
    }

    /* renamed from: B0.h$o */
    /* loaded from: classes8.dex */
    static final class o extends AbstractC7737t implements Function0<C2983d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2990k f1784b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C2990k c2990k) {
            super(0);
            this.f1784b = c2990k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C2983d invoke() {
            return this.f1784b.Q(true, false);
        }
    }

    static {
        float f7 = 40;
        f1741a = Ra.h.d(f7, f7);
    }

    public static final void a(@NotNull D0.e eVar, androidx.compose.ui.e eVar2, boolean z11, K1.T t2, N0 n02, D0.c cVar, Function2 function2, l1.K0 k02, D0.b bVar, n0.d0 d0Var, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        N0 n03;
        N0 n04;
        C3969l c3969l;
        N0 n05;
        C3969l u11 = interfaceC3967k.u(469439921);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12 | 27648;
        if ((196608 & i11) == 0) {
            i13 |= u11.n(t2) ? 131072 : 65536;
        }
        int i14 = i13 | 14155776;
        if ((100663296 & i11) == 0) {
            i14 |= u11.n(cVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i14 |= u11.F(function2) ? 536870912 : 268435456;
        }
        int i15 = (u11.n(k02) ? 32 : 16) | 390 | (u11.n(bVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.n(d0Var) ? 16384 : 8192);
        if ((306783379 & i14) == 306783378 && (i15 & 9363) == 9362 && u11.b()) {
            u11.j();
            n05 = n02;
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                n03 = N0.f1448g;
                n04 = n03;
            } else {
                u11.j();
                n04 = n02;
            }
            u11.j0();
            int i16 = i14 & 2147483646;
            int i17 = i15 & 112;
            int i18 = i15 << 3;
            c3969l = u11;
            b(eVar, eVar2, z11, t2, n04, cVar, function2, k02, bVar, d0Var, c3969l, i16, i17 | 3462 | (57344 & i18) | (i18 & 458752));
            n05 = n04;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C2478i(eVar, eVar2, z11, t2, n05, cVar, function2, k02, bVar, d0Var, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull D0.e eVar, androidx.compose.ui.e eVar2, boolean z11, K1.T t2, N0 n02, D0.c cVar, Function2 function2, l1.K0 k02, D0.b bVar, n0.d0 d0Var, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        int i14;
        E0.c1 c1Var;
        Object c2990k;
        Z1.s sVar;
        int i15;
        int i16;
        boolean z12;
        Z1.d dVar;
        EnumC9142v enumC9142v;
        boolean z13;
        Object c2481j;
        E0.c1 c1Var2;
        n0.d0 d0Var2;
        t0.q qVar;
        EnumC9142v enumC9142v2;
        boolean z14;
        C3969l c3969l;
        boolean z15 = z11;
        C3969l u11 = interfaceC3967k.u(965149429);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.p(z15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i11 & 3072;
        int i18 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i17 == 0) {
            i13 |= u11.p(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= u11.n(null) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= u11.n(t2) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= u11.n(n02) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= u11.n(null) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.n(cVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.F(function2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.n(null) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= u11.n(k02) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= u11.n(null) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            if (u11.n(null)) {
                i18 = 2048;
            }
            i14 |= i18;
        }
        if ((i12 & 24576) == 0) {
            i14 |= (32768 & i12) == 0 ? u11.n(bVar) : u11.F(bVar) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i14 |= u11.n(d0Var) ? 131072 : 65536;
        }
        int i19 = i14 | 1572864;
        int i21 = i13;
        if ((i13 & 306783379) == 306783378 && (599187 & i19) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            Z1.d dVar2 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
            Z1.s sVar2 = (Z1.s) u11.m(androidx.compose.ui.platform.K0.k());
            androidx.compose.ui.platform.i2 i2Var = (androidx.compose.ui.platform.i2) u11.m(androidx.compose.ui.platform.K0.s());
            boolean d11 = Intrinsics.d(cVar, D0.d.f5191a);
            u11.o(96938805);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                u11.x(C11);
            }
            t0.q qVar2 = (t0.q) C11;
            u11.k();
            EnumC9142v enumC9142v3 = d11 ? EnumC9142v.Horizontal : EnumC9142v.Vertical;
            boolean booleanValue = ((Boolean) t0.i.a(qVar2, u11, 0).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) t0.m.a(qVar2, u11).getValue()).booleanValue();
            boolean a11 = i2Var.a();
            boolean z16 = ((i21 & 14) == 4) | ((i19 & 896) == 256) | ((i19 & 7168) == 2048);
            Object C12 = u11.C();
            if (z16 || C12 == InterfaceC3967k.a.a()) {
                C2950u0 c2950u0 = C2950u0.f7308a;
                if (!d11) {
                    c2950u0 = null;
                }
                C12 = new E0.c1(eVar, c2950u0);
                u11.x(C12);
            }
            E0.c1 c1Var3 = (E0.c1) C12;
            boolean n11 = u11.n(c1Var3);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new E0.Z0();
                u11.x(C13);
            }
            boolean n12 = u11.n(c1Var3);
            E0.Z0 z02 = (E0.Z0) C13;
            Object C14 = u11.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                c1Var = c1Var3;
                if (booleanValue && a11) {
                    sVar = sVar2;
                    i15 = i21;
                    i16 = i19;
                    z12 = true;
                } else {
                    sVar = sVar2;
                    i15 = i21;
                    i16 = i19;
                    z12 = false;
                }
                dVar = dVar2;
                enumC9142v = enumC9142v3;
                z13 = false;
                c2990k = new C2990k(c1Var, z02, dVar, z15, z12);
                z02 = z02;
                u11.x(c2990k);
            } else {
                sVar = sVar2;
                dVar = dVar2;
                enumC9142v = enumC9142v3;
                z13 = false;
                c1Var = c1Var3;
                c2990k = C14;
                i15 = i21;
                i16 = i19;
            }
            C2990k c2990k2 = (C2990k) c2990k;
            InterfaceC9723a interfaceC9723a = (InterfaceC9723a) u11.m(androidx.compose.ui.platform.K0.i());
            androidx.compose.ui.platform.I0 i02 = (androidx.compose.ui.platform.I0) u11.m(androidx.compose.ui.platform.K0.d());
            androidx.compose.ui.platform.S1 s12 = (androidx.compose.ui.platform.S1) u11.m(androidx.compose.ui.platform.K0.p());
            E0.c1 c1Var4 = c1Var;
            boolean n13 = ((i15 & 896) == 256 ? true : z13) | u11.n(c1Var) | ((i15 & 57344) == 16384 ? true : z13) | u11.F(c2990k2) | u11.F(interfaceC9723a) | u11.F(i02) | u11.F(s12) | u11.n(dVar) | ((i15 & 7168) == 2048 ? true : z13) | ((i16 & 3670016) == 1048576 ? true : z13);
            Object C15 = u11.C();
            if (n13 || C15 == InterfaceC3967k.a.a()) {
                c1Var2 = c1Var4;
                c2481j = new C2481j(c1Var2, c2990k2, interfaceC9723a, i02, s12, dVar, z11);
                u11.x(c2481j);
            } else {
                c2481j = C15;
                c1Var2 = c1Var4;
            }
            u11.g((Function0) c2481j);
            boolean F11 = u11.F(c2990k2);
            Object C16 = u11.C();
            if (F11 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C2487l(c2990k2);
                u11.x(C16);
            }
            S0.Q.c(c2990k2, (Function1) C16, u11);
            E0.Z0 z03 = z02;
            androidx.compose.ui.e a12 = FocusableKt.a(eVar2.l0(new TextFieldDecoratorModifier(c1Var2, z03, c2990k2, z11, n02, d11, qVar2)), z11, qVar2);
            boolean z17 = (z11 && c2990k2.M() == C2990k.a.None) ? true : z13;
            if (sVar != Z1.s.Rtl || enumC9142v == EnumC9142v.Vertical) {
                d0Var2 = d0Var;
                qVar = qVar2;
                enumC9142v2 = enumC9142v;
                z14 = true;
            } else {
                d0Var2 = d0Var;
                qVar = qVar2;
                enumC9142v2 = enumC9142v;
                z14 = z13;
            }
            EnumC9142v enumC9142v4 = enumC9142v2;
            androidx.compose.ui.e d12 = C2656q.d(androidx.compose.foundation.gestures.J.g(a12, d0Var2, enumC9142v2, z17, z14, qVar), b2.a());
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = u11.I();
            S0.A0 d13 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, d12);
            int i22 = i15;
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            c3969l = u11;
            z15 = z11;
            L.a(c2990k2, z15, a1.c.c(-673241599, new C2493n(bVar, cVar, z03, t2, booleanValue, a11, booleanValue2, c1Var2, c2990k2, k02, z11, d0Var, enumC9142v4, d11, function2), c3969l), c3969l, ((i22 >> 3) & 112) | 384);
            c3969l.f();
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C2496o(eVar, eVar2, z15, t2, n02, cVar, function2, k02, bVar, d0Var, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(@NotNull Q1.K k11, @NotNull Function1<? super Q1.K, Unit> function1, androidx.compose.ui.e eVar, boolean z11, boolean z12, K1.T t2, N0 n02, M0 m02, boolean z13, int i11, int i12, Q1.X x11, Function1<? super K1.K, Unit> function12, t0.q qVar, AbstractC7799Q abstractC7799Q, InterfaceC6511n<? super Function2<? super InterfaceC3967k, ? super Integer, Unit>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        int i18;
        N0 n03;
        int i19;
        M0 m03;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        Function1<? super K1.K, Unit> function13;
        t0.q qVar2;
        M0 m04;
        int i35;
        N0 n04;
        int i36;
        Q1.X x12;
        boolean z16;
        boolean z17;
        int i37;
        boolean z18;
        N0 n05;
        boolean z19;
        Object C11;
        C3969l c3969l;
        M0 m05;
        boolean z21;
        int i38;
        int i39;
        N0 n06;
        Q1.X x13;
        boolean z22;
        Function1<? super K1.K, Unit> function14;
        boolean z23;
        t0.q qVar3;
        S0.J0 m06;
        int i41;
        C3969l u11 = interfaceC3967k.u(1804514146);
        if ((i13 & 6) == 0) {
            i16 = (u11.n(k11) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.F(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i42 = i15 & 8;
        int i43 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i42 != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            z14 = z11;
            i16 |= u11.p(z14) ? 2048 : 1024;
            i17 = i15 & 16;
            if (i17 == 0) {
                i16 |= 24576;
            } else if ((i13 & 24576) == 0) {
                z15 = z12;
                i16 |= u11.p(z15) ? 16384 : 8192;
                if ((i13 & 196608) == 0) {
                    i16 |= u11.n(t2) ? 131072 : 65536;
                }
                i18 = i15 & 64;
                if (i18 != 0) {
                    i16 |= 1572864;
                    n03 = n02;
                } else {
                    n03 = n02;
                    if ((i13 & 1572864) == 0) {
                        i16 |= u11.n(n03) ? 1048576 : 524288;
                    }
                }
                i19 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i19 != 0) {
                    i16 |= 12582912;
                    m03 = m02;
                } else {
                    m03 = m02;
                    if ((i13 & 12582912) == 0) {
                        i16 |= u11.n(m03) ? 8388608 : 4194304;
                    }
                }
                i21 = i15 & 256;
                if (i21 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    i16 |= u11.p(z13) ? 67108864 : 33554432;
                }
                if ((i13 & 805306368) == 0) {
                    if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && u11.r(i11)) {
                        i41 = 536870912;
                        i16 |= i41;
                    }
                    i41 = 268435456;
                    i16 |= i41;
                }
                i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 != 0) {
                    i24 = i14 | 6;
                    i23 = i22;
                } else if ((i14 & 6) == 0) {
                    i23 = i22;
                    i24 = i14 | (u11.r(i12) ? 4 : 2);
                } else {
                    i23 = i22;
                    i24 = i14;
                }
                i25 = i15 & 2048;
                if (i25 != 0) {
                    i24 |= 48;
                    i26 = i25;
                } else if ((i14 & 48) == 0) {
                    i26 = i25;
                    i24 |= u11.n(x11) ? 32 : 16;
                } else {
                    i26 = i25;
                }
                int i44 = i24;
                i27 = i16;
                i28 = i15 & 4096;
                if (i28 != 0) {
                    i29 = i44 | 384;
                } else {
                    int i45 = i44;
                    if ((i14 & 384) == 0) {
                        i45 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                    }
                    i29 = i45;
                }
                i31 = i15 & 8192;
                if (i31 != 0) {
                    i32 = i29 | 3072;
                } else {
                    int i46 = i29;
                    if ((i14 & 3072) == 0) {
                        if (u11.n(qVar)) {
                            i43 = 2048;
                        }
                        i32 = i46 | i43;
                    } else {
                        i32 = i46;
                    }
                }
                if ((i14 & 24576) == 0) {
                    i32 |= u11.n(abstractC7799Q) ? 16384 : 8192;
                }
                if ((i14 & 196608) == 0) {
                    i32 |= u11.F(interfaceC6511n) ? 131072 : 65536;
                }
                if ((i27 & 306783379) != 306783378 && (i32 & 74899) == 74898 && u11.b()) {
                    u11.j();
                    z21 = z13;
                    x13 = x11;
                    qVar3 = qVar;
                    c3969l = u11;
                    z22 = z14;
                    z23 = z15;
                    m05 = m03;
                    n06 = n03;
                    i38 = i11;
                    i39 = i12;
                    function14 = function12;
                } else {
                    u11.Q0();
                    if ((i13 & 1) != 0 || u11.w0()) {
                        if (i42 != 0) {
                            z14 = true;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        }
                        if (i18 != 0) {
                            n05 = N0.f1448g;
                            n03 = n05;
                        }
                        M0 m07 = i19 != 0 ? M0.f1437b : m03;
                        boolean z24 = i21 != 0 ? false : z13;
                        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            i33 = z24 ? 1 : Integer.MAX_VALUE;
                            i34 = i27 & (-1879048193);
                        } else {
                            i33 = i11;
                            i34 = i27;
                        }
                        int i47 = i23 != 0 ? 1 : i12;
                        Q1.X a11 = i26 != 0 ? X.a.a() : x11;
                        function13 = i28 != 0 ? a.f1743b : function12;
                        qVar2 = i31 != 0 ? null : qVar;
                        m04 = m07;
                        i35 = i33;
                        n04 = n03;
                        i36 = i47;
                        x12 = a11;
                        z16 = z14;
                        z17 = z15;
                        i37 = i34;
                        z18 = z24;
                    } else {
                        u11.j();
                        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            z18 = z13;
                            i35 = i11;
                            i36 = i12;
                            x12 = x11;
                            function13 = function12;
                            z17 = z15;
                            m04 = m03;
                            n04 = n03;
                            z16 = z14;
                            i37 = i27 & (-1879048193);
                            qVar2 = qVar;
                        } else {
                            z18 = z13;
                            i35 = i11;
                            i36 = i12;
                            x12 = x11;
                            function13 = function12;
                            qVar2 = qVar;
                            z17 = z15;
                            m04 = m03;
                            n04 = n03;
                            z16 = z14;
                            i37 = i27;
                        }
                    }
                    u11.j0();
                    Q1.r h11 = n04.h(z18);
                    boolean z25 = !z18;
                    int i48 = z18 ? 1 : i36;
                    int i49 = z18 ? 1 : i35;
                    N0 n07 = n04;
                    z19 = ((i37 & 14) == 4) | ((i37 & 112) == 32);
                    C11 = u11.C();
                    if (!z19 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new b(function1, k11);
                        u11.x(C11);
                    }
                    int i51 = i32 << 9;
                    int i52 = (i37 & 7168) | ((i37 >> 15) & 896) | (i37 & 57344) | (i32 & 458752);
                    c3969l = u11;
                    Function1<? super K1.K, Unit> function15 = function13;
                    C2514u0.a(k11, (Function1) C11, eVar, t2, x12, function15, qVar2, abstractC7799Q, z25, i49, i48, h11, m04, z16, z17, interfaceC6511n, c3969l, ((i37 >> 6) & 7168) | (i37 & 910) | (i51 & 57344) | (i51 & 458752) | (i51 & 3670016) | (i51 & 29360128), i52);
                    m05 = m04;
                    z21 = z18;
                    i38 = i35;
                    i39 = i36;
                    n06 = n07;
                    x13 = x12;
                    z22 = z16;
                    function14 = function15;
                    z23 = z17;
                    qVar3 = qVar2;
                }
                m06 = c3969l.m0();
                if (m06 != null) {
                    m06.G(new c(k11, function1, eVar, z22, z23, t2, n06, m05, z21, i38, i39, x13, function14, qVar3, abstractC7799Q, interfaceC6511n, i13, i14, i15));
                    return;
                }
                return;
            }
            z15 = z12;
            if ((i13 & 196608) == 0) {
            }
            i18 = i15 & 64;
            if (i18 != 0) {
            }
            i19 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i19 != 0) {
            }
            i21 = i15 & 256;
            if (i21 != 0) {
            }
            if ((i13 & 805306368) == 0) {
            }
            i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 != 0) {
            }
            i25 = i15 & 2048;
            if (i25 != 0) {
            }
            int i442 = i24;
            i27 = i16;
            i28 = i15 & 4096;
            if (i28 != 0) {
            }
            i31 = i15 & 8192;
            if (i31 != 0) {
            }
            if ((i14 & 24576) == 0) {
            }
            if ((i14 & 196608) == 0) {
            }
            if ((i27 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i13 & 1) != 0) {
            }
            if (i42 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if (i23 != 0) {
            }
            if (i26 != 0) {
            }
            if (i28 != 0) {
            }
            if (i31 != 0) {
            }
            m04 = m07;
            i35 = i33;
            n04 = n03;
            i36 = i47;
            x12 = a11;
            z16 = z14;
            z17 = z15;
            i37 = i34;
            z18 = z24;
            u11.j0();
            Q1.r h112 = n04.h(z18);
            boolean z252 = !z18;
            if (z18) {
            }
            if (z18) {
            }
            N0 n072 = n04;
            z19 = ((i37 & 14) == 4) | ((i37 & 112) == 32);
            C11 = u11.C();
            if (!z19) {
            }
            C11 = new b(function1, k11);
            u11.x(C11);
            int i512 = i32 << 9;
            int i522 = (i37 & 7168) | ((i37 >> 15) & 896) | (i37 & 57344) | (i32 & 458752);
            c3969l = u11;
            Function1<? super K1.K, Unit> function152 = function13;
            C2514u0.a(k11, (Function1) C11, eVar, t2, x12, function152, qVar2, abstractC7799Q, z252, i49, i48, h112, m04, z16, z17, interfaceC6511n, c3969l, ((i37 >> 6) & 7168) | (i37 & 910) | (i512 & 57344) | (i512 & 458752) | (i512 & 3670016) | (i512 & 29360128), i522);
            m05 = m04;
            z21 = z18;
            i38 = i35;
            i39 = i36;
            n06 = n072;
            x13 = x12;
            z22 = z16;
            function14 = function152;
            z23 = z17;
            qVar3 = qVar2;
            m06 = c3969l.m0();
            if (m06 != null) {
            }
        }
        z14 = z11;
        i17 = i15 & 16;
        if (i17 == 0) {
        }
        z15 = z12;
        if ((i13 & 196608) == 0) {
        }
        i18 = i15 & 64;
        if (i18 != 0) {
        }
        i19 = i15 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i19 != 0) {
        }
        i21 = i15 & 256;
        if (i21 != 0) {
        }
        if ((i13 & 805306368) == 0) {
        }
        i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 != 0) {
        }
        i25 = i15 & 2048;
        if (i25 != 0) {
        }
        int i4422 = i24;
        i27 = i16;
        i28 = i15 & 4096;
        if (i28 != 0) {
        }
        i31 = i15 & 8192;
        if (i31 != 0) {
        }
        if ((i14 & 24576) == 0) {
        }
        if ((i14 & 196608) == 0) {
        }
        if ((i27 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        if (i42 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if (i23 != 0) {
        }
        if (i26 != 0) {
        }
        if (i28 != 0) {
        }
        if (i31 != 0) {
        }
        m04 = m07;
        i35 = i33;
        n04 = n03;
        i36 = i47;
        x12 = a11;
        z16 = z14;
        z17 = z15;
        i37 = i34;
        z18 = z24;
        u11.j0();
        Q1.r h1122 = n04.h(z18);
        boolean z2522 = !z18;
        if (z18) {
        }
        if (z18) {
        }
        N0 n0722 = n04;
        z19 = ((i37 & 14) == 4) | ((i37 & 112) == 32);
        C11 = u11.C();
        if (!z19) {
        }
        C11 = new b(function1, k11);
        u11.x(C11);
        int i5122 = i32 << 9;
        int i5222 = (i37 & 7168) | ((i37 >> 15) & 896) | (i37 & 57344) | (i32 & 458752);
        c3969l = u11;
        Function1<? super K1.K, Unit> function1522 = function13;
        C2514u0.a(k11, (Function1) C11, eVar, t2, x12, function1522, qVar2, abstractC7799Q, z2522, i49, i48, h1122, m04, z16, z17, interfaceC6511n, c3969l, ((i37 >> 6) & 7168) | (i37 & 910) | (i5122 & 57344) | (i5122 & 458752) | (i5122 & 3670016) | (i5122 & 29360128), i5222);
        m05 = m04;
        z21 = z18;
        i38 = i35;
        i39 = i36;
        n06 = n0722;
        x13 = x12;
        z22 = z16;
        function14 = function1522;
        z23 = z17;
        qVar3 = qVar2;
        m06 = c3969l.m0();
        if (m06 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(@NotNull String str, @NotNull Function1 function1, androidx.compose.ui.e eVar, boolean z11, boolean z12, K1.T t2, N0 n02, M0 m02, boolean z13, int i11, int i12, Q1.X x11, Function1 function12, t0.q qVar, l1.K0 k02, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        int i16;
        androidx.compose.ui.e eVar2;
        boolean z14;
        int i17;
        boolean z15;
        int i18;
        K1.T t11;
        int i19;
        int i21;
        M0 m03;
        int i22;
        int i23;
        int i24;
        int i25;
        l1.K0 k03;
        N0 n03;
        int i26;
        int i27;
        Function1 function13;
        t0.q qVar2;
        M0 m04;
        boolean z16;
        boolean z17;
        int i28;
        Q1.X x12;
        Object C11;
        int i29;
        boolean n11;
        Object C12;
        boolean z18;
        Object C13;
        boolean n12;
        Object C14;
        C3969l c3969l;
        int i31;
        int i32;
        Q1.X x13;
        Function1 function14;
        t0.q qVar3;
        M0 m05;
        boolean z19;
        boolean z21;
        S0.J0 m06;
        int i33;
        C3969l u11 = interfaceC3967k.u(945255183);
        if ((i13 & 6) == 0) {
            i16 = (u11.n(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= u11.F(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            eVar2 = eVar;
            i16 |= u11.n(eVar2) ? 256 : 128;
        } else {
            eVar2 = eVar;
        }
        int i34 = i15 & 8;
        if (i34 != 0) {
            i16 |= 3072;
        } else if ((i13 & 3072) == 0) {
            z14 = z11;
            i16 |= u11.p(z14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i17 = i15 & 16;
            if (i17 == 0) {
                i16 |= 24576;
            } else if ((i13 & 24576) == 0) {
                z15 = z12;
                i16 |= u11.p(z15) ? 16384 : 8192;
                if ((i13 & 196608) == 0) {
                    i18 = 6;
                    t11 = t2;
                    i16 |= u11.n(t11) ? 131072 : 65536;
                } else {
                    i18 = 6;
                    t11 = t2;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    i16 |= u11.n(n02) ? 1048576 : 524288;
                }
                i21 = 128 & i15;
                if (i21 != 0) {
                    i16 |= 12582912;
                    m03 = m02;
                } else {
                    m03 = m02;
                    if ((i13 & 12582912) == 0) {
                        i16 |= u11.n(m03) ? 8388608 : 4194304;
                    }
                }
                if ((i13 & 100663296) == 0) {
                    i16 |= u11.p(z13) ? 67108864 : 33554432;
                }
                if ((i13 & 805306368) == 0) {
                    if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && u11.r(i11)) {
                        i33 = 536870912;
                        i16 |= i33;
                    }
                    i33 = 268435456;
                    i16 |= i33;
                }
                i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 != 0) {
                    i23 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i23 = i14 | (u11.r(i12) ? 4 : 2);
                } else {
                    i23 = i14;
                }
                i24 = i15 & 2048;
                if (i24 != 0) {
                    i23 |= 48;
                } else if ((i14 & 48) == 0) {
                    i23 |= u11.n(x11) ? 32 : 16;
                }
                int i35 = i23;
                int i36 = i35 | 384;
                i25 = i15 & 8192;
                if (i25 != 0) {
                    i36 = i35 | 3456;
                } else if ((i14 & 3072) == 0) {
                    i36 |= u11.n(qVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i14 & 24576) != 0) {
                        k03 = k02;
                        i36 |= u11.n(k03) ? 16384 : 8192;
                    } else {
                        k03 = k02;
                    }
                    if ((i14 & 196608) == 0) {
                        i36 |= u11.F(c4912a) ? 131072 : 65536;
                    }
                    if ((i16 & 306783379) != 306783378 && (i36 & 74899) == 74898 && u11.b()) {
                        u11.j();
                        i31 = i12;
                        x13 = x11;
                        qVar3 = qVar;
                        m05 = m03;
                        z19 = z14;
                        c3969l = u11;
                        z21 = z15;
                        i32 = i11;
                        function14 = function12;
                    } else {
                        u11.Q0();
                        if ((i13 & 1) != 0 || u11.w0()) {
                            if (i34 != 0) {
                                z14 = true;
                            }
                            if (i17 != 0) {
                                z15 = false;
                            }
                            n03 = i19 == 0 ? N0.f1448g : n02;
                            if (i21 != 0) {
                                m03 = M0.f1437b;
                            }
                            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                                i26 = z13 ? 1 : Integer.MAX_VALUE;
                                i16 &= -1879048193;
                            } else {
                                i26 = i11;
                            }
                            i27 = i22 == 0 ? 1 : i12;
                            Q1.X a11 = i24 == 0 ? X.a.a() : x11;
                            function13 = C2499p.f1893b;
                            qVar2 = i25 == 0 ? null : qVar;
                            m04 = m03;
                            z16 = z14;
                            z17 = z15;
                            i28 = i36;
                            x12 = a11;
                        } else {
                            u11.j();
                            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                i16 &= -1879048193;
                            }
                            n03 = n02;
                            i26 = i11;
                            i27 = i12;
                            function13 = function12;
                            qVar2 = qVar;
                            m04 = m03;
                            z16 = z14;
                            z17 = z15;
                            i28 = i36;
                            x12 = x11;
                        }
                        u11.j0();
                        C11 = u11.C();
                        int i37 = i27;
                        if (C11 != InterfaceC3967k.a.a()) {
                            i29 = i18;
                            C11 = S0.n1.f(new Q1.K(i29, 0L, str), S0.D1.f25195a);
                            u11.x(C11);
                        } else {
                            i29 = i18;
                        }
                        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                        Q1.K b11 = Q1.K.b((Q1.K) interfaceC3978p0.getValue(), str, 0L, i29);
                        n11 = u11.n(b11);
                        C12 = u11.C();
                        if (!n11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new C2502q(b11, interfaceC3978p0);
                            u11.x(C12);
                        }
                        int i38 = S0.Q.f25307b;
                        u11.g((Function0) C12);
                        z18 = (i16 & 14) != 4;
                        C13 = u11.C();
                        if (!z18 || C13 == InterfaceC3967k.a.a()) {
                            C13 = S0.n1.f(str, S0.D1.f25195a);
                            u11.x(C13);
                        }
                        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C13;
                        Q1.r h11 = n03.h(z13);
                        boolean z22 = !z13;
                        int i39 = !z13 ? 1 : i37;
                        int i41 = !z13 ? 1 : i26;
                        n02 = n03;
                        n12 = u11.n(interfaceC3978p02) | ((i16 & 112) == 32);
                        C14 = u11.C();
                        if (!n12 || C14 == InterfaceC3967k.a.a()) {
                            C14 = new r(function1, interfaceC3978p0, interfaceC3978p02);
                            u11.x(C14);
                        }
                        int i42 = i28 << 9;
                        c3969l = u11;
                        C2514u0.a(b11, (Function1) C14, eVar2, t11, x12, function13, qVar2, k03, z22, i41, i39, h11, m04, z16, z17, c4912a, c3969l, (i16 & 896) | ((i16 >> 6) & 7168) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (i42 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i28 & 458752));
                        i31 = i37;
                        i32 = i26;
                        x13 = x12;
                        function14 = function13;
                        qVar3 = qVar2;
                        m05 = m04;
                        z19 = z16;
                        z21 = z17;
                    }
                    N0 n04 = n02;
                    m06 = c3969l.m0();
                    if (m06 == null) {
                        m06.G(new C2507s(str, function1, eVar, z19, z21, t2, n04, m05, z13, i32, i31, x13, function14, qVar3, k02, c4912a, i13, i14, i15));
                        return;
                    }
                    return;
                }
                if ((i14 & 24576) != 0) {
                }
                if ((i14 & 196608) == 0) {
                }
                if ((i16 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i13 & 1) != 0) {
                }
                if (i34 != 0) {
                }
                if (i17 != 0) {
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                function13 = C2499p.f1893b;
                qVar2 = i25 == 0 ? null : qVar;
                m04 = m03;
                z16 = z14;
                z17 = z15;
                i28 = i36;
                x12 = a11;
                u11.j0();
                C11 = u11.C();
                int i372 = i27;
                if (C11 != InterfaceC3967k.a.a()) {
                }
                InterfaceC3978p0 interfaceC3978p03 = (InterfaceC3978p0) C11;
                Q1.K b112 = Q1.K.b((Q1.K) interfaceC3978p03.getValue(), str, 0L, i29);
                n11 = u11.n(b112);
                C12 = u11.C();
                if (!n11) {
                }
                C12 = new C2502q(b112, interfaceC3978p03);
                u11.x(C12);
                int i382 = S0.Q.f25307b;
                u11.g((Function0) C12);
                if ((i16 & 14) != 4) {
                }
                C13 = u11.C();
                if (!z18) {
                }
                C13 = S0.n1.f(str, S0.D1.f25195a);
                u11.x(C13);
                InterfaceC3978p0 interfaceC3978p022 = (InterfaceC3978p0) C13;
                Q1.r h112 = n03.h(z13);
                boolean z222 = !z13;
                if (!z13) {
                }
                if (!z13) {
                }
                n02 = n03;
                n12 = u11.n(interfaceC3978p022) | ((i16 & 112) == 32);
                C14 = u11.C();
                if (!n12) {
                }
                C14 = new r(function1, interfaceC3978p03, interfaceC3978p022);
                u11.x(C14);
                int i422 = i28 << 9;
                c3969l = u11;
                C2514u0.a(b112, (Function1) C14, eVar2, t11, x12, function13, qVar2, k03, z222, i41, i39, h112, m04, z16, z17, c4912a, c3969l, (i16 & 896) | ((i16 >> 6) & 7168) | (i422 & 57344) | (i422 & 458752) | (i422 & 3670016) | (i422 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i28 & 458752));
                i31 = i372;
                i32 = i26;
                x13 = x12;
                function14 = function13;
                qVar3 = qVar2;
                m05 = m04;
                z19 = z16;
                z21 = z17;
                N0 n042 = n02;
                m06 = c3969l.m0();
                if (m06 == null) {
                }
            }
            z15 = z12;
            if ((i13 & 196608) == 0) {
            }
            i19 = i15 & 64;
            if (i19 != 0) {
            }
            i21 = 128 & i15;
            if (i21 != 0) {
            }
            if ((i13 & 100663296) == 0) {
            }
            if ((i13 & 805306368) == 0) {
            }
            i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 != 0) {
            }
            i24 = i15 & 2048;
            if (i24 != 0) {
            }
            int i352 = i23;
            int i362 = i352 | 384;
            i25 = i15 & 8192;
            if (i25 != 0) {
            }
            if ((i14 & 24576) != 0) {
            }
            if ((i14 & 196608) == 0) {
            }
            if ((i16 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i13 & 1) != 0) {
            }
            if (i34 != 0) {
            }
            if (i17 != 0) {
            }
            if (i19 == 0) {
            }
            if (i21 != 0) {
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            function13 = C2499p.f1893b;
            qVar2 = i25 == 0 ? null : qVar;
            m04 = m03;
            z16 = z14;
            z17 = z15;
            i28 = i362;
            x12 = a11;
            u11.j0();
            C11 = u11.C();
            int i3722 = i27;
            if (C11 != InterfaceC3967k.a.a()) {
            }
            InterfaceC3978p0 interfaceC3978p032 = (InterfaceC3978p0) C11;
            Q1.K b1122 = Q1.K.b((Q1.K) interfaceC3978p032.getValue(), str, 0L, i29);
            n11 = u11.n(b1122);
            C12 = u11.C();
            if (!n11) {
            }
            C12 = new C2502q(b1122, interfaceC3978p032);
            u11.x(C12);
            int i3822 = S0.Q.f25307b;
            u11.g((Function0) C12);
            if ((i16 & 14) != 4) {
            }
            C13 = u11.C();
            if (!z18) {
            }
            C13 = S0.n1.f(str, S0.D1.f25195a);
            u11.x(C13);
            InterfaceC3978p0 interfaceC3978p0222 = (InterfaceC3978p0) C13;
            Q1.r h1122 = n03.h(z13);
            boolean z2222 = !z13;
            if (!z13) {
            }
            if (!z13) {
            }
            n02 = n03;
            n12 = u11.n(interfaceC3978p0222) | ((i16 & 112) == 32);
            C14 = u11.C();
            if (!n12) {
            }
            C14 = new r(function1, interfaceC3978p032, interfaceC3978p0222);
            u11.x(C14);
            int i4222 = i28 << 9;
            c3969l = u11;
            C2514u0.a(b1122, (Function1) C14, eVar2, t11, x12, function13, qVar2, k03, z2222, i41, i39, h1122, m04, z16, z17, c4912a, c3969l, (i16 & 896) | ((i16 >> 6) & 7168) | (i4222 & 57344) | (i4222 & 458752) | (i4222 & 3670016) | (i4222 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i28 & 458752));
            i31 = i3722;
            i32 = i26;
            x13 = x12;
            function14 = function13;
            qVar3 = qVar2;
            m05 = m04;
            z19 = z16;
            z21 = z17;
            N0 n0422 = n02;
            m06 = c3969l.m0();
            if (m06 == null) {
            }
        }
        z14 = z11;
        i17 = i15 & 16;
        if (i17 == 0) {
        }
        z15 = z12;
        if ((i13 & 196608) == 0) {
        }
        i19 = i15 & 64;
        if (i19 != 0) {
        }
        i21 = 128 & i15;
        if (i21 != 0) {
        }
        if ((i13 & 100663296) == 0) {
        }
        if ((i13 & 805306368) == 0) {
        }
        i22 = i15 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 != 0) {
        }
        i24 = i15 & 2048;
        if (i24 != 0) {
        }
        int i3522 = i23;
        int i3622 = i3522 | 384;
        i25 = i15 & 8192;
        if (i25 != 0) {
        }
        if ((i14 & 24576) != 0) {
        }
        if ((i14 & 196608) == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i13 & 1) != 0) {
        }
        if (i34 != 0) {
        }
        if (i17 != 0) {
        }
        if (i19 == 0) {
        }
        if (i21 != 0) {
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        function13 = C2499p.f1893b;
        qVar2 = i25 == 0 ? null : qVar;
        m04 = m03;
        z16 = z14;
        z17 = z15;
        i28 = i3622;
        x12 = a11;
        u11.j0();
        C11 = u11.C();
        int i37222 = i27;
        if (C11 != InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p0322 = (InterfaceC3978p0) C11;
        Q1.K b11222 = Q1.K.b((Q1.K) interfaceC3978p0322.getValue(), str, 0L, i29);
        n11 = u11.n(b11222);
        C12 = u11.C();
        if (!n11) {
        }
        C12 = new C2502q(b11222, interfaceC3978p0322);
        u11.x(C12);
        int i38222 = S0.Q.f25307b;
        u11.g((Function0) C12);
        if ((i16 & 14) != 4) {
        }
        C13 = u11.C();
        if (!z18) {
        }
        C13 = S0.n1.f(str, S0.D1.f25195a);
        u11.x(C13);
        InterfaceC3978p0 interfaceC3978p02222 = (InterfaceC3978p0) C13;
        Q1.r h11222 = n03.h(z13);
        boolean z22222 = !z13;
        if (!z13) {
        }
        if (!z13) {
        }
        n02 = n03;
        n12 = u11.n(interfaceC3978p02222) | ((i16 & 112) == 32);
        C14 = u11.C();
        if (!n12) {
        }
        C14 = new r(function1, interfaceC3978p0322, interfaceC3978p02222);
        u11.x(C14);
        int i42222 = i28 << 9;
        c3969l = u11;
        C2514u0.a(b11222, (Function1) C14, eVar2, t11, x12, function13, qVar2, k03, z22222, i41, i39, h11222, m04, z16, z17, c4912a, c3969l, (i16 & 896) | ((i16 >> 6) & 7168) | (i42222 & 57344) | (i42222 & 458752) | (i42222 & 3670016) | (i42222 & 29360128), ((i16 >> 15) & 896) | (i16 & 7168) | (i16 & 57344) | (i28 & 458752));
        i31 = i37222;
        i32 = i26;
        x13 = x12;
        function14 = function13;
        qVar3 = qVar2;
        m05 = m04;
        z19 = z16;
        z21 = z17;
        N0 n04222 = n02;
        m06 = c3969l.m0();
        if (m06 == null) {
        }
    }

    public static final void e(@NotNull C2990k c2990k, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1991581797);
        if ((((u11.F(c2990k) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            boolean n11 = u11.n(c2990k);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = S0.n1.e(new C0045h(c2990k));
                u11.x(C11);
            }
            if (((C2983d) ((S0.A1) C11).getValue()).e()) {
                u11.o(-317096444);
                boolean F11 = u11.F(c2990k);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new e(c2990k);
                    u11.x(C12);
                }
                InterfaceC3214w interfaceC3214w = (InterfaceC3214w) C12;
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean F12 = u11.F(c2990k);
                Object C13 = u11.C();
                if (F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new f(c2990k, null);
                    u11.x(C13);
                }
                C2457b.a(interfaceC3214w, x1.L.b(aVar, c2990k, (Function2) C13), f1741a, u11, 384, 0);
                u11.k();
            } else {
                u11.o(-316671682);
                u11.k();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(c2990k, i11));
        }
    }

    public static final void f(@NotNull C2990k c2990k, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(2025287684);
        if ((((u11.F(c2990k) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = S0.n1.e(new o(c2990k));
                u11.x(C11);
            }
            S0.A1 a12 = (S0.A1) C11;
            if (((C2983d) a12.getValue()).e()) {
                u11.o(-1353974139);
                boolean F11 = u11.F(c2990k);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new i(c2990k);
                    u11.x(C12);
                }
                InterfaceC3214w interfaceC3214w = (InterfaceC3214w) C12;
                V1.g b11 = ((C2983d) a12.getValue()).b();
                boolean c11 = ((C2983d) a12.getValue()).c();
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean F12 = u11.F(c2990k);
                Object C13 = u11.C();
                if (F12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new j(c2990k, null);
                    u11.x(C13);
                }
                C3181f.b(interfaceC3214w, true, b11, c11, f1741a, x1.L.b(aVar, c2990k, (Function2) C13), u11, 24624, 0);
                u11.k();
            } else {
                u11.o(-1353397539);
                u11.k();
            }
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = S0.n1.e(new n(c2990k));
                u11.x(C14);
            }
            S0.A1 a13 = (S0.A1) C14;
            if (((C2983d) a13.getValue()).e()) {
                u11.o(-1353104186);
                boolean F13 = u11.F(c2990k);
                Object C15 = u11.C();
                if (F13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new k(c2990k);
                    u11.x(C15);
                }
                InterfaceC3214w interfaceC3214w2 = (InterfaceC3214w) C15;
                V1.g b12 = ((C2983d) a13.getValue()).b();
                boolean c12 = ((C2983d) a13.getValue()).c();
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                boolean F14 = u11.F(c2990k);
                Object C16 = u11.C();
                if (F14 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new l(c2990k, null);
                    u11.x(C16);
                }
                C3181f.b(interfaceC3214w2, false, b12, c12, f1741a, x1.L.b(aVar2, c2990k, (Function2) C16), u11, 24624, 0);
                u11.k();
            } else {
                u11.o(-1352528547);
                u11.k();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new m(c2990k, i11));
        }
    }
}
