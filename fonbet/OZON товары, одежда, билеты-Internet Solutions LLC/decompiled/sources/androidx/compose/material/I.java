package androidx.compose.material;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.C3322n1;
import J0.C3326o1;
import J0.C3339s;
import J0.C3343t;
import J0.EnumC3337r1;
import J0.K2;
import J0.R2;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import b1.C5503f;
import b1.C5516s;
import b1.C5517t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7990g;
import m0.T0;
import n0.C8392m;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.C9135o;
import r0.EnumC9142v;
import ru.ozon.android.messenger.framework.presentation.ai.R0;
import w1.InterfaceC10406a;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final float f39904a = 56;

    /* renamed from: b, reason: collision with root package name */
    private static final float f39905b = 125;

    /* renamed from: c, reason: collision with root package name */
    private static final float f39906c = 640;

    static final class a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39907b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A1<Float> f39908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, A1<Float> a12) {
            super(1);
            this.f39907b = j11;
            this.f39908c = a12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC8412e.Q(interfaceC8412e, this.f39907b, 0L, 0L, this.f39908c.getValue().floatValue(), null, 118);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f39909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f39910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39911d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39912e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, Function0<Unit> function0, boolean z11, int i11) {
            super(2);
            this.f39909b = j11;
            this.f39910c = function0;
            this.f39911d = z11;
            this.f39912e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f39912e | 1);
            boolean z11 = this.f39911d;
            I.b(this.f39909b, this.f39910c, z11, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {506}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39913d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f39914e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f39915f;

        static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f39916b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f39916b = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C7459e c7459e) {
                c7459e.n();
                this.f39916b.invoke();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f39915f = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f39915f, dVar);
            cVar.f39914e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f7;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39913d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f11 = (x1.F) this.f39914e;
                a aVar2 = new a(this.f39915f);
                this.f39913d = 1;
                f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : null, (r12 & 8) != 0 ? null : aVar2, f11);
                if (f7 == aVar) {
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

    static final class d extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f39918c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Function0<Unit> function0) {
            super(1);
            this.f39917b = str;
            this.f39918c = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            I1.D d12 = d11;
            I1.z.i(d12, this.f39917b);
            I1.z.e(d12, new J(this.f39918c));
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull C4912a c4912a, androidx.compose.ui.e eVar, C3326o1 c3326o1, boolean z11, A0.a aVar, float f7, long j11, long j12, long j13, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        float f11;
        long b11;
        long j14;
        boolean z12;
        int i14;
        androidx.compose.ui.e eVar2;
        androidx.compose.ui.e eVar3;
        androidx.compose.ui.e eVar4;
        C3969l c3969l;
        long j15;
        long j16;
        float f12;
        C4912a c4912a2 = R0.f89339a;
        C3969l u11 = interfaceC3967k.u(-92970288);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(c4912a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i15 = i12 | 48;
        if ((i11 & 384) == 0) {
            i15 |= u11.F(c3326o1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i15 | 3072;
        if ((i11 & 24576) == 0) {
            i16 |= u11.n(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i16 |= 65536;
        }
        if ((i11 & 1572864) == 0) {
            i16 |= 524288;
        }
        if ((12582912 & i11) == 0) {
            i16 |= 4194304;
        }
        if ((100663296 & i11) == 0) {
            i16 |= u11.s(j13) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i16 |= u11.F(c4912a2) ? 536870912 : 268435456;
        }
        if ((306783379 & i16) == 306783378 && u11.b()) {
            u11.j();
            eVar4 = eVar;
            f12 = f7;
            j16 = j12;
            c3969l = u11;
            j15 = j11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                float b12 = C3322n1.b();
                i13 = 1572864;
                long l11 = ((C3339s) u11.m(C3343t.d())).l();
                f11 = b12;
                b11 = C3343t.b(l11, u11);
                j14 = l11;
                z12 = true;
                i14 = i16 & (-33488897);
                eVar2 = aVar2;
            } else {
                u11.j();
                f11 = f7;
                j14 = j11;
                b11 = j12;
                i14 = i16 & (-33488897);
                i13 = 1572864;
                eVar2 = eVar;
                z12 = z11;
            }
            u11.j0();
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a11 = ((S0.D) C11).a();
            EnumC9142v enumC9142v = EnumC9142v.Vertical;
            B1.V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, eVar2);
            androidx.compose.ui.e eVar5 = eVar2;
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f15 = T7.E.f(u11, f13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            androidx.compose.ui.e eVar6 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e d12 = androidx.compose.foundation.layout.a0.d(eVar6);
            B1.V f16 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f17 = androidx.compose.ui.c.f(u11, d12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f18 = T7.E.f(u11, f16, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f18);
            }
            F1.b(u11, f17, InterfaceC2801g.a.f());
            c4912a2.invoke(u11, Integer.valueOf((i14 >> 27) & 14));
            boolean F11 = u11.F(c3326o1) | u11.F(a11);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C5226y(c3326o1, a11);
                u11.x(C12);
            }
            Function0 function0 = (Function0) C12;
            EnumC3337r1 t2 = c3326o1.c().t();
            EnumC3337r1 enumC3337r1 = EnumC3337r1.Hidden;
            z11 = z12;
            b(j13, function0, t2 != enumC3337r1, u11, (i14 >> 24) & 14);
            u11.f();
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(androidx.compose.foundation.layout.a0.t(c5187j.a(eVar6, InterfaceC6250b.a.m()), 0.0f, f39906c, 1), 1.0f);
            if (z11) {
                u11.o(-893004563);
                boolean n11 = u11.n(c3326o1.c());
                Object C13 = u11.C();
                if (n11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C5224w(c3326o1.c(), enumC9142v);
                    u11.x(C13);
                }
                eVar3 = androidx.compose.ui.input.nestedscroll.a.a(eVar6, (InterfaceC10406a) C13, null);
                u11.k();
            } else {
                u11.o(-167338882);
                u11.k();
                eVar3 = eVar6;
            }
            androidx.compose.ui.e l02 = e11.l0(eVar3).l0(new DraggableAnchorsElement(c3326o1.c(), new K(c3326o1), enumC9142v));
            C5210h<EnumC3337r1> c11 = c3326o1.c();
            androidx.compose.ui.e c12 = C9135o.c(l02, c11.q(), enumC9142v, z11 && c3326o1.c().p() != enumC3337r1, null, c11.u(), new C5203a(c11, null), false, 32);
            if (z11) {
                u11.o(-892034697);
                boolean F12 = u11.F(c3326o1) | u11.F(a11);
                Object C14 = u11.C();
                if (F12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new F(c3326o1, a11);
                    u11.x(C14);
                }
                eVar6 = I1.o.c(eVar6, false, (Function1) C14);
                u11.k();
            } else {
                u11.o(-167264258);
                u11.k();
            }
            R2.a(c12.l0(eVar6), aVar, j14, b11, f11, a1.c.c(17396558, new G(c4912a), u11), u11, ((i14 >> 9) & 112) | i13, 16);
            u11.f();
            eVar4 = eVar5;
            c3969l = u11;
            j15 = j14;
            j16 = b11;
            f12 = f11;
        }
        boolean z13 = z11;
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new H(c4912a, eVar4, c3326o1, z13, aVar, f12, j15, j16, j13, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(long j11, Function0<Unit> function0, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e eVar;
        C3969l u11 = interfaceC3967k.u(-526532668);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else if (j11 != 16) {
            u11.o(477285297);
            A1 b11 = C7990g.b(z11 ? 1.0f : 0.0f, new T0(0, (m0.E) null, 7), null, u11, 48, 28);
            String a11 = K2.a(u11, 2);
            if (z11) {
                u11.o(477511845);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                int i13 = i12 & 112;
                boolean z12 = i13 == 32;
                Object C11 = u11.C();
                if (z12 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new c(function0, null);
                    u11.x(C11);
                }
                androidx.compose.ui.e b12 = x1.L.b(aVar, function0, (Function2) C11);
                boolean n11 = (i13 == 32) | u11.n(a11);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new d(a11, function0);
                    u11.x(C12);
                }
                eVar = I1.o.c(b12, true, (Function1) C12);
                u11.k();
            } else {
                u11.o(477792674);
                u11.k();
                eVar = androidx.compose.ui.e.f40358c0;
            }
            androidx.compose.ui.e l02 = androidx.compose.foundation.layout.a0.d(androidx.compose.ui.e.f40358c0).l0(eVar);
            boolean n12 = u11.n(b11) | ((i12 & 14) == 4);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new a(j11, b11);
                u11.x(C13);
            }
            C8392m.a(l02, (Function1) C13, u11, 0);
            u11.k();
        } else {
            u11.o(478008930);
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(j11, function0, z11, i11));
        }
    }

    @NotNull
    public static final C3326o1 f(@NotNull EnumC3337r1 enumC3337r1, InterfaceC3967k interfaceC3967k) {
        T0 a11 = C3322n1.a();
        M m11 = M.f39924b;
        Z1.d dVar = (Z1.d) interfaceC3967k.m(K0.e());
        interfaceC3967k.G(976450751, enumC3337r1);
        Object[] objArr = {enumC3337r1, a11, false, m11, dVar};
        C5517t a12 = C5516s.a(O.f39930b, new P(dVar, m11, a11));
        boolean p11 = interfaceC3967k.p(false) | interfaceC3967k.n(dVar) | interfaceC3967k.n(m11) | interfaceC3967k.F(a11);
        Object C11 = interfaceC3967k.C();
        if (p11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new N(enumC3337r1, dVar, m11, a11);
            interfaceC3967k.x(C11);
        }
        C3326o1 c3326o1 = (C3326o1) C5503f.c(objArr, a12, (Function0) C11, interfaceC3967k, 0, 4);
        interfaceC3967k.J();
        return c3326o1;
    }
}
