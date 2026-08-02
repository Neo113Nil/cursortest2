package B0;

import Bl0.C2652m;
import Bl0.C2656q;
import K1.AbstractC3429i;
import K1.C3422b;
import K1.InterfaceC3430j;
import S0.C3969l;
import S0.C3991w0;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i1.C6988h;
import java.util.Arrays;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7786D;
import org.jetbrains.annotations.NotNull;
import x1.t;

/* loaded from: classes8.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f1537a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f1538b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C3422b f1539c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1.u<Function1<C2465d1, Unit>> f1540d;

    static final class a extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1541b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            int i11 = I1.z.f11793b;
            I1.C l11 = I1.u.l();
            Unit unit = Unit.f71690a;
            d11.b(l11, unit);
            return unit;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3422b.C0288b<AbstractC3429i> f1543c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.V1 f1544d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3422b.C0288b<AbstractC3429i> c0288b, androidx.compose.ui.platform.V1 v12) {
            super(0);
            this.f1543c = c0288b;
            this.f1544d = v12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Unit unit;
            AbstractC3429i f7 = this.f1543c.f();
            androidx.compose.ui.platform.V1 v12 = this.f1544d;
            U1.this.getClass();
            if (f7 instanceof AbstractC3429i.b) {
                InterfaceC3430j a11 = f7.a();
                if (a11 != null) {
                    a11.a(f7);
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    try {
                        v12.openUri(((AbstractC3429i.b) f7).c());
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (f7 instanceof AbstractC3429i.a) {
                ((AbstractC3429i.a) f7).getClass();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {181}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Q0 f1546e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ t0.q f1547f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Q0 q02, t0.q qVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f1546e = q02;
            this.f1547f = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f1546e, this.f1547f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1545d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f1545d = 1;
                Q0 q02 = this.f1546e;
                q02.getClass();
                Object collect = this.f1547f.getInteractions().collect(new P0(new androidx.collection.J((Object) null), q02), this);
                if (collect != obj2) {
                    collect = Unit.f71690a;
                }
                if (collect == obj2) {
                    return obj2;
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

    static final class d extends AbstractC7737t implements Function1<C2465d1, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3422b.C0288b<AbstractC3429i> f1549c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Q0 f1550d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3422b.C0288b<AbstractC3429i> c0288b, Q0 q02) {
            super(1);
            this.f1549c = c0288b;
            this.f1550d = q02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C2465d1 c2465d1) {
            K1.L b11;
            K1.L b12;
            K1.L b13;
            C2465d1 c2465d12 = c2465d1;
            C3422b.C0288b<AbstractC3429i> c0288b = this.f1549c;
            K1.L b14 = c0288b.f().b();
            K1.D d11 = null;
            K1.D d12 = b14 != null ? b14.d() : null;
            Q0 q02 = this.f1550d;
            K1.D a11 = (!q02.b() || (b13 = c0288b.f().b()) == null) ? null : b13.a();
            U1.this.getClass();
            if (d12 != null) {
                a11 = d12.x(a11);
            }
            K1.D b15 = (!q02.c() || (b12 = c0288b.f().b()) == null) ? null : b12.b();
            if (a11 != null) {
                b15 = a11.x(b15);
            }
            if (q02.d() && (b11 = c0288b.f().b()) != null) {
                d11 = b11.c();
            }
            if (b15 != null) {
                d11 = b15.x(d11);
            }
            if (d11 != null) {
                c2465d12.a(d11, c0288b.g(), c0288b.e());
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        e(int i11) {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            U1.this.a(interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class f extends AbstractC7737t implements Function1<S0.N, S0.M> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C2465d1, Unit> f1553c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super C2465d1, Unit> function1) {
            super(1);
            this.f1553c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final S0.M invoke(S0.N n11) {
            U1 u12 = U1.this;
            c1.u uVar = u12.f1540d;
            Function1<C2465d1, Unit> function1 = this.f1553c;
            uVar.add(function1);
            return new V1(u12, function1);
        }
    }

    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object[] f1555c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C2465d1, Unit> f1556d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1557e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Object[] objArr, Function1<? super C2465d1, Unit> function1, int i11) {
            super(2);
            this.f1555c = objArr;
            this.f1556d = function1;
            this.f1557e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            Object[] objArr = this.f1555c;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            int e11 = C2652m.e(this.f1557e | 1);
            U1.this.b(copyOf, this.f1556d, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public U1(@NotNull C3422b c3422b) {
        C3991w0 f7;
        K1.D d11;
        this.f1537a = c3422b;
        f7 = S0.n1.f(null, S0.D1.f25195a);
        this.f1538b = f7;
        C3422b.a aVar = new C3422b.a(c3422b);
        List b11 = c3422b.b(c3422b.length());
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3422b.C0288b c0288b = (C3422b.C0288b) b11.get(i11);
            K1.L b12 = ((AbstractC3429i) c0288b.f()).b();
            if (b12 != null && (d11 = b12.d()) != null) {
                aVar.b(d11, c0288b.g(), c0288b.e());
            }
        }
        this.f1539c = aVar.i();
        this.f1540d = new c1.u<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object[] objArr, Function1<? super C2465d1, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-2083052099);
        int i12 = (i11 & 48) == 0 ? (u11.F(function1) ? 32 : 16) | i11 : i11;
        if ((i11 & 384) == 0) {
            i12 |= u11.F(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        u11.G(-416686647, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i12 |= u11.F(obj) ? 4 : 0;
        }
        u11.J();
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            kotlin.jvm.internal.S s11 = new kotlin.jvm.internal.S(2);
            s11.a(function1);
            s11.b(objArr);
            Object[] d11 = s11.d(new Object[s11.c()]);
            boolean F11 = u11.F(this) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new f(function1);
                u11.x(C11);
            }
            S0.Q.d(d11, (Function1) C11, u11);
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(objArr, function1, i11));
        }
    }

    public final void a(InterfaceC3967k interfaceC3967k, int i11) {
        K1.K g10;
        C7786D y11;
        androidx.compose.ui.e eVar;
        K1.D d11;
        C3969l u11 = interfaceC3967k.u(1154651354);
        int i12 = (u11.F(this) ? 4 : 2) | i11;
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.platform.V1 v12 = (androidx.compose.ui.platform.V1) u11.m(androidx.compose.ui.platform.K0.q());
            C3422b c3422b = this.f1539c;
            List b11 = c3422b.b(c3422b.length());
            int size = b11.size();
            for (int i13 = 0; i13 < size; i13++) {
                C3422b.C0288b c0288b = (C3422b.C0288b) b11.get(i13);
                if (c0288b.g() != c0288b.e()) {
                    u11.o(1383677450);
                    if (((Boolean) new X1(this).invoke()).booleanValue() && (g10 = g()) != null) {
                        y11 = g10.y(c0288b.g(), c0288b.e());
                        C7460f d12 = g10.d(c0288b.g());
                        y11.i(P9.a.a(g10.p(c0288b.g()) == g10.p(c0288b.e()) ? Math.min(g10.d(c0288b.e() - 1).n(), d12.n()) : 0.0f, d12.q()) ^ (-9223372034707292160L));
                    } else {
                        y11 = null;
                    }
                    W1 w12 = y11 != null ? new W1(y11) : null;
                    if (w12 == null || (eVar = C6988h.a(androidx.compose.ui.e.f40358c0, w12)) == null) {
                        eVar = androidx.compose.ui.e.f40358c0;
                    }
                    Object C11 = u11.C();
                    if (C11 == InterfaceC3967k.a.a()) {
                        C11 = t0.p.a();
                        u11.x(C11);
                    }
                    t0.q qVar = (t0.q) C11;
                    androidx.compose.ui.e a11 = androidx.compose.foundation.p.a(eVar.l0(new e2(new T1(this, c0288b.g(), c0288b.e()))), qVar);
                    x1.t.f104904a.getClass();
                    androidx.compose.ui.e c11 = I1.o.c(C2656q.d(a11, t.a.b()), false, a.f1541b);
                    boolean F11 = u11.F(this) | u11.n(c0288b) | u11.F(v12);
                    Object C12 = u11.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new b(c0288b, v12);
                        u11.x(C12);
                    }
                    C5185h.a(androidx.compose.foundation.i.d(c11, qVar, false, null, (Function0) C12, 252), u11, 0);
                    K1.L b12 = ((AbstractC3429i) c0288b.f()).b();
                    if (b12 == null || (b12.d() == null && b12.a() == null && b12.b() == null && b12.c() == null)) {
                        u11.o(1386435086);
                        u11.k();
                    } else {
                        u11.o(1384566902);
                        Object C13 = u11.C();
                        if (C13 == InterfaceC3967k.a.a()) {
                            C13 = new Q0();
                            u11.x(C13);
                        }
                        Q0 q02 = (Q0) C13;
                        Object C14 = u11.C();
                        if (C14 == InterfaceC3967k.a.a()) {
                            d11 = null;
                            C14 = new c(q02, qVar, null);
                            u11.x(C14);
                        } else {
                            d11 = null;
                        }
                        S0.Q.e(u11, qVar, (Function2) C14);
                        Boolean valueOf = Boolean.valueOf(q02.c());
                        Boolean valueOf2 = Boolean.valueOf(q02.b());
                        Boolean valueOf3 = Boolean.valueOf(q02.d());
                        K1.L b13 = ((AbstractC3429i) c0288b.f()).b();
                        K1.D d13 = b13 != null ? b13.d() : d11;
                        K1.L b14 = ((AbstractC3429i) c0288b.f()).b();
                        K1.D a12 = b14 != null ? b14.a() : d11;
                        K1.L b15 = ((AbstractC3429i) c0288b.f()).b();
                        K1.D b16 = b15 != null ? b15.b() : d11;
                        K1.L b17 = ((AbstractC3429i) c0288b.f()).b();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, d13, a12, b16, b17 != null ? b17.c() : d11};
                        boolean F12 = u11.F(this) | u11.n(c0288b);
                        Object C15 = u11.C();
                        if (F12 || C15 == InterfaceC3967k.a.a()) {
                            C15 = new d(c0288b, q02);
                            u11.x(C15);
                        }
                        b(objArr, (Function1) C15, u11, (i12 << 6) & 896);
                        u11.k();
                    }
                    u11.k();
                } else {
                    u11.o(1386448974);
                    u11.k();
                }
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new e(i11));
        }
    }

    @NotNull
    public final C3422b e() {
        C3422b i11;
        c1.u<Function1<C2465d1, Unit>> uVar = this.f1540d;
        if (uVar.isEmpty()) {
            i11 = this.f1539c;
        } else {
            C3422b.a aVar = new C3422b.a();
            aVar.d(this.f1537a);
            C2465d1 c2465d1 = new C2465d1(aVar);
            int size = uVar.size();
            for (int i12 = 0; i12 < size; i12++) {
                uVar.get(i12).invoke(c2465d1);
            }
            i11 = aVar.i();
        }
        this.f1539c = i11;
        return i11;
    }

    @NotNull
    public final C3422b f() {
        return this.f1539c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final K1.K g() {
        return (K1.K) this.f1538b.getValue();
    }

    public final void h(K1.K k11) {
        this.f1538b.setValue(k11);
    }
}
