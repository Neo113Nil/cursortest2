package B0;

import B0.O0;
import Bl0.C2652m;
import Bl0.C2656q;
import D1.InterfaceC2801g;
import E0.AbstractC2923g0;
import E0.C2910a;
import E0.C2925h0;
import I0.C3176c0;
import I0.C3194l0;
import I0.C3196m0;
import I0.EnumC3192k0;
import I0.InterfaceC3214w;
import K1.C3422b;
import P1.AbstractC3809p;
import Q1.C3843l;
import Q1.C3848q;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a1.C4912a;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5236c1;
import b1.C5503f;
import b1.C5517t;
import c1.AbstractC5715f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.EnumC9142v;
import t1.InterfaceC9723a;
import xe.C10727i;
import z0.InterfaceC10969b;

/* renamed from: B0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2514u0 {

    /* renamed from: B0.u0$a */
    /* loaded from: classes8.dex */
    static final class a implements InterfaceC3214w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f1972a;

        a(long j11) {
            this.f1972a = j11;
        }

        @Override // I0.InterfaceC3214w
        public final long a() {
            return this.f1972a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1", f = "CoreTextField.kt", l = {1198}, m = "invokeSuspend")
    /* renamed from: B0.u0$b */
    /* loaded from: classes8.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1973d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1974e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2477h1 f1975f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ I0.W0 f1976g;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B0.u0$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f1977d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x1.F f1978e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC2477h1 f1979f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ I0.W0 f1980g;

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1202}, m = "invokeSuspend")
            /* renamed from: B0.u0$b$a$a, reason: collision with other inner class name */
            static final class C0046a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f1981d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ x1.F f1982e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC2477h1 f1983f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0046a(x1.F f7, InterfaceC2477h1 interfaceC2477h1, kotlin.coroutines.d<? super C0046a> dVar) {
                    super(2, dVar);
                    this.f1982e = f7;
                    this.f1983f = interfaceC2477h1;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0046a(this.f1982e, this.f1983f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0046a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f1981d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        this.f1981d = 1;
                        if (Y0.a(this.f1982e, this.f1983f, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1205}, m = "invokeSuspend")
            /* renamed from: B0.u0$b$a$b, reason: collision with other inner class name */
            static final class C0047b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f1984d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ x1.F f1985e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ I0.W0 f1986f;

                /* renamed from: B0.u0$b$a$b$a, reason: collision with other inner class name */
                static final class C0048a extends AbstractC7737t implements Function1<C7459e, Unit> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ I0.W0 f1987b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0048a(I0.W0 w02) {
                        super(1);
                        this.f1987b = w02;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(C7459e c7459e) {
                        c7459e.n();
                        this.f1987b.c0();
                        return Unit.f71690a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0047b(x1.F f7, I0.W0 w02, kotlin.coroutines.d<? super C0047b> dVar) {
                    super(2, dVar);
                    this.f1985e = f7;
                    this.f1986f = w02;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0047b(this.f1985e, this.f1986f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0047b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object f7;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f1984d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        C0048a c0048a = new C0048a(this.f1986f);
                        this.f1984d = 1;
                        f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : null, (r12 & 8) != 0 ? null : c0048a, this.f1985e);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1.F f7, InterfaceC2477h1 interfaceC2477h1, I0.W0 w02, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f1978e = f7;
                this.f1979f = interfaceC2477h1;
                this.f1980g = w02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f1978e, this.f1979f, this.f1980g, dVar);
                aVar.f1977d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f1977d;
                xe.O o11 = xe.O.UNDISPATCHED;
                x1.F f7 = this.f1978e;
                C10727i.c(m11, null, o11, new C0046a(f7, this.f1979f, null), 1);
                C10727i.c(m11, null, o11, new C0047b(f7, this.f1980g, null), 1);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2477h1 interfaceC2477h1, I0.W0 w02, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f1975f = interfaceC2477h1;
            this.f1976g = w02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f1975f, this.f1976g, dVar);
            bVar.f1974e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1973d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a((x1.F) this.f1974e, this.f1975f, this.f1976g, null);
                this.f1973d = 1;
                if (xe.N.d(aVar2, this) == aVar) {
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

    /* renamed from: B0.u0$c */
    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<I1.D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f1988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11) {
            super(1);
            this.f1988b = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(I1.D d11) {
            d11.b(C3196m0.d(), new C3194l0(EnumC2526y0.Cursor, this.f1988b, EnumC3192k0.Middle, true));
            return Unit.f71690a;
        }
    }

    /* renamed from: B0.u0$d */
    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.W0 f1989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(I0.W0 w02, int i11) {
            super(2);
            this.f1989b = w02;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C2514u0.c(this.f1989b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x052d  */
    /* JADX WARN: Type inference failed for: r10v1, types: [S0.k, S0.l] */
    /* JADX WARN: Type inference failed for: r7v45, types: [androidx.compose.ui.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull Q1.K k11, @NotNull Function1 function1, androidx.compose.ui.e eVar, K1.T t2, Q1.X x11, Function1 function12, t0.q qVar, AbstractC7799Q abstractC7799Q, boolean z11, int i11, int i12, Q1.r rVar, M0 m02, boolean z12, boolean z13, InterfaceC6511n interfaceC6511n, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        int i15;
        int i16;
        C5517t c5517t;
        V1.i iVar;
        AbstractC3809p.a aVar;
        Z1.d dVar;
        Q1.M m11;
        boolean z14;
        boolean F11;
        Object C11;
        int i17;
        j1.r rVar2;
        int i18;
        boolean z15;
        j1.i iVar2;
        e.a aVar2;
        AbstractC2923g0 abstractC2923g0;
        androidx.compose.ui.platform.i2 i2Var;
        M1 m12;
        InterfaceC10969b interfaceC10969b;
        O0 o02;
        Q1.W w11;
        C3969l c3969l;
        Q1.M m13;
        Q1.D d11;
        I0.W0 w02;
        boolean z16;
        Q1.K k12;
        Q1.r rVar3;
        O0 o03;
        boolean z17;
        boolean z18;
        Object m14;
        j1.r rVar4;
        androidx.compose.ui.e eVar2;
        InterfaceC10969b interfaceC10969b2;
        O0 o04;
        t0.q qVar2;
        InterfaceC3978p0 interfaceC3978p0;
        boolean F12;
        Object C12;
        int i19;
        boolean F13;
        Object c2467e0;
        int i21;
        androidx.compose.ui.e eVar3;
        Q1.M m15;
        Q1.D d12;
        int i22;
        j1.r rVar5;
        androidx.compose.ui.e d13;
        int i23;
        boolean F14;
        Object C13;
        androidx.compose.ui.platform.i2 i2Var2;
        boolean F15;
        Object C14;
        int i24;
        int i25;
        androidx.compose.ui.platform.i2 i2Var3;
        boolean F16;
        Object c2503q0;
        boolean z19;
        int i26;
        androidx.compose.ui.e eVar4;
        Q1.r rVar6;
        Q1.K k13;
        O0 o05;
        boolean z21;
        e.a aVar3;
        boolean F17;
        Object C15;
        boolean F18;
        Object C16;
        O0 o06;
        androidx.compose.ui.e b11;
        boolean F19;
        Object C17;
        C3969l c3969l2;
        ?? b12;
        ?? u11 = interfaceC3967k.u(-958708118);
        if ((i13 & 6) == 0) {
            i15 = (u11.n(k11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= u11.F(function1) ? 32 : 16;
        }
        int i27 = i13 & 384;
        int i28 = UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i27 == 0) {
            i15 |= u11.n(eVar) ? 256 : 128;
        }
        int i29 = i13 & 3072;
        int i31 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i29 == 0) {
            i15 |= u11.n(t2) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= u11.n(x11) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= u11.F(function12) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= u11.n(qVar) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= u11.n(abstractC7799Q) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= u11.p(z11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= u11.r(i11) ? 536870912 : 268435456;
        }
        int i32 = i15;
        if ((i14 & 6) == 0) {
            i16 = i14 | (u11.r(i12) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= u11.n(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if (u11.n(m02)) {
                i28 = 256;
            }
            i16 |= i28;
        }
        if ((i14 & 3072) == 0) {
            if (u11.p(z12)) {
                i31 = 2048;
            }
            i16 |= i31;
        }
        if ((i14 & 24576) == 0) {
            i16 |= u11.p(z13) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= u11.F(interfaceC6511n) ? 131072 : 65536;
        }
        int i33 = i16;
        if ((i32 & 306783379) == 306783378 && (74899 & i33) == 74898 && u11.b()) {
            u11.j();
            c3969l2 = u11;
        } else {
            u11.Q0();
            if ((i13 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            Object C18 = u11.C();
            if (C18 == InterfaceC3967k.a.a()) {
                C18 = new j1.r();
                u11.x(C18);
            }
            j1.r rVar7 = (j1.r) C18;
            Object C19 = u11.C();
            if (C19 == InterfaceC3967k.a.a()) {
                int i34 = C2925h0.f7249b;
                C19 = new C2910a();
                u11.x(C19);
            }
            AbstractC2923g0 abstractC2923g02 = (AbstractC2923g0) C19;
            Object C21 = u11.C();
            if (C21 == InterfaceC3967k.a.a()) {
                C21 = new Q1.M(abstractC2923g02);
                u11.x(C21);
            }
            Q1.M m16 = (Q1.M) C21;
            Z1.d dVar2 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
            AbstractC3809p.a aVar4 = (AbstractC3809p.a) u11.m(androidx.compose.ui.platform.K0.g());
            long a11 = ((I0.j1) u11.m(I0.k1.b())).a();
            j1.i iVar3 = (j1.i) u11.m(androidx.compose.ui.platform.K0.f());
            androidx.compose.ui.platform.i2 i2Var4 = (androidx.compose.ui.platform.i2) u11.m(androidx.compose.ui.platform.K0.s());
            androidx.compose.ui.platform.P1 p12 = (androidx.compose.ui.platform.P1) u11.m(androidx.compose.ui.platform.K0.o());
            EnumC9142v enumC9142v = (i11 == 1 && !z11 && rVar.g()) ? EnumC9142v.Horizontal : EnumC9142v.Vertical;
            Object[] objArr = {enumC9142v};
            c5517t = M1.f1439f;
            boolean n11 = u11.n(enumC9142v);
            Object C22 = u11.C();
            if (n11 || C22 == InterfaceC3967k.a.a()) {
                C22 = new C2470f0(enumC9142v);
                u11.x(C22);
            }
            M1 m17 = (M1) C5503f.c(objArr, c5517t, (Function0) C22, u11, 0, 4);
            int i35 = i32 & 14;
            boolean z22 = ((i32 & 57344) == 16384) | (i35 == 4);
            Object C23 = u11.C();
            if (z22 || C23 == InterfaceC3967k.a.a()) {
                Q1.W c11 = h2.c(x11, k11.c());
                K1.Q d14 = k11.d();
                if (d14 != null) {
                    long k14 = d14.k();
                    Q1.D a12 = c11.a();
                    int i36 = K1.Q.f15010c;
                    int originalToTransformed = a12.originalToTransformed((int) (k14 >> 32));
                    int originalToTransformed2 = c11.a().originalToTransformed((int) (k14 & 4294967295L));
                    int min = Math.min(originalToTransformed, originalToTransformed2);
                    int max = Math.max(originalToTransformed, originalToTransformed2);
                    C3422b.a aVar5 = new C3422b.a(c11.b());
                    iVar = V1.i.f27916c;
                    aVar5.b(new K1.D(0L, 0L, (P1.F) null, (P1.A) null, (P1.B) null, (AbstractC3809p) null, (String) null, 0L, (V1.a) null, (V1.m) null, (R1.c) null, 0L, iVar, (l1.H0) null, 61439), min, max);
                    C23 = new Q1.W(aVar5.i(), c11.a());
                } else {
                    C23 = c11;
                }
                u11.x(C23);
            }
            Q1.W w12 = (Q1.W) C23;
            C3422b b13 = w12.b();
            Q1.D a13 = w12.a();
            S0.J0 z23 = u11.z();
            if (z23 == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            u11.E(z23);
            boolean n12 = u11.n(p12);
            Object C24 = u11.C();
            if (n12 || C24 == InterfaceC3967k.a.a()) {
                aVar = aVar4;
                dVar = dVar2;
                C24 = new O0(new C2471f1(b13, t2, z11, dVar, aVar, kotlin.collections.K.f71697a), z23, p12);
                u11.x(C24);
            } else {
                aVar = aVar4;
                dVar = dVar2;
            }
            O0 o07 = (O0) C24;
            AbstractC3809p.a aVar6 = aVar;
            Z1.d dVar3 = dVar;
            o07.M(k11.c(), b13, t2, z11, dVar3, aVar6, function1, m02, iVar3, a11);
            o07.n().b(k11, o07.g());
            Object C25 = u11.C();
            if (C25 == InterfaceC3967k.a.a()) {
                C25 = new f2(0);
                u11.x(C25);
            }
            f2 f2Var = (f2) C25;
            f2.d(f2Var, k11);
            Object C26 = u11.C();
            if (C26 == InterfaceC3967k.a.a()) {
                C26 = new I0.W0(f2Var);
                u11.x(C26);
            }
            I0.W0 w03 = (I0.W0) C26;
            w03.W(a13);
            w03.getClass();
            w03.X(o07.m());
            w03.Z(o07);
            w03.b0(k11);
            w03.P((androidx.compose.ui.platform.I0) u11.m(androidx.compose.ui.platform.K0.d()));
            w03.a0((androidx.compose.ui.platform.S1) u11.m(androidx.compose.ui.platform.K0.p()));
            w03.V((InterfaceC9723a) u11.m(androidx.compose.ui.platform.K0.i()));
            w03.T(rVar7);
            boolean z24 = !z13;
            w03.R(z24);
            w03.S(z12);
            Object C27 = u11.C();
            if (C27 == InterfaceC3967k.a.a()) {
                C27 = Pk0.f.b(S0.Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            xe.M a14 = ((S0.D) C27).a();
            Object C28 = u11.C();
            if (C28 == InterfaceC3967k.a.a()) {
                C28 = androidx.compose.foundation.relocation.c.a();
                u11.x(C28);
            }
            InterfaceC10969b interfaceC10969b3 = (InterfaceC10969b) C28;
            e.a aVar7 = androidx.compose.ui.e.f40358c0;
            int i37 = i33 & 7168;
            int i38 = i33 & 57344;
            boolean F21 = u11.F(o07) | (i37 == 2048) | (i38 == 16384) | u11.F(m16) | (i35 == 4);
            int i39 = (i33 & 112) ^ 48;
            if (i39 <= 32 || !u11.n(rVar)) {
                m11 = m16;
                if ((i33 & 48) != 32) {
                    z14 = false;
                    F11 = F21 | z14 | u11.F(a13) | u11.F(a14) | u11.F(interfaceC10969b3) | u11.F(w03);
                    C11 = u11.C();
                    if (!F11 || C11 == InterfaceC3967k.a.a()) {
                        i17 = i37;
                        rVar2 = rVar7;
                        i18 = i35;
                        z15 = z24;
                        iVar2 = iVar3;
                        aVar2 = aVar7;
                        Q1.M m18 = m11;
                        abstractC2923g0 = abstractC2923g02;
                        i2Var = i2Var4;
                        m12 = m17;
                        interfaceC10969b = interfaceC10969b3;
                        o02 = o07;
                        w11 = w12;
                        c3969l = u11;
                        C2458b0 c2458b0 = new C2458b0(o02, z12, z13, m18, k11, rVar, a13, w03, a14, interfaceC10969b);
                        m13 = m18;
                        d11 = a13;
                        w02 = w03;
                        z16 = z12;
                        k12 = k11;
                        rVar3 = rVar;
                        c3969l.x(c2458b0);
                        C11 = c2458b0;
                    } else {
                        i17 = i37;
                        rVar2 = rVar7;
                        d11 = a13;
                        w02 = w03;
                        i18 = i35;
                        z15 = z24;
                        iVar2 = iVar3;
                        aVar2 = aVar7;
                        m13 = m11;
                        abstractC2923g0 = abstractC2923g02;
                        i2Var = i2Var4;
                        m12 = m17;
                        z16 = z12;
                        interfaceC10969b = interfaceC10969b3;
                        o02 = o07;
                        w11 = w12;
                        c3969l = u11;
                        k12 = k11;
                        rVar3 = rVar;
                    }
                    androidx.compose.ui.e a15 = FocusableKt.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.i.a(aVar2, rVar2), (Function1) C11), z16, qVar);
                    InterfaceC3978p0 l11 = S0.n1.l(Boolean.valueOf((z16 || z13) ? false : true), c3969l);
                    Unit unit = Unit.f71690a;
                    boolean n13 = c3969l.n(l11) | c3969l.F(o02) | c3969l.F(m13) | c3969l.F(w02);
                    if (i39 > 32 || !c3969l.n(rVar3)) {
                        o03 = o02;
                        if ((i33 & 48) != 32) {
                            z17 = false;
                            z18 = n13 | z17;
                            Object C29 = c3969l.C();
                            if (!z18 || C29 == InterfaceC3967k.a.a()) {
                                rVar4 = rVar2;
                                eVar2 = a15;
                                interfaceC10969b2 = interfaceC10969b;
                                o04 = o03;
                                qVar2 = qVar;
                                m14 = new M(o04, l11, m13, w02, rVar3, null);
                                interfaceC3978p0 = l11;
                                c3969l.x(m14);
                            } else {
                                rVar4 = rVar2;
                                eVar2 = a15;
                                m14 = C29;
                                interfaceC10969b2 = interfaceC10969b;
                                o04 = o03;
                                qVar2 = qVar;
                                interfaceC3978p0 = l11;
                            }
                            S0.Q.e(c3969l, unit, (Function2) m14);
                            F12 = c3969l.F(o04);
                            C12 = c3969l.C();
                            if (!F12 || C12 == InterfaceC3967k.a.a()) {
                                C12 = new C2464d0(o04);
                                c3969l.x(C12);
                            }
                            androidx.compose.ui.e l12 = C3176c0.l(aVar2, (Function1) C12);
                            i19 = i17;
                            F13 = c3969l.F(o04) | (i38 == 16384) | (i19 == 2048) | c3969l.F(d11) | c3969l.F(w02);
                            Object C31 = c3969l.C();
                            if (!F13 || C31 == InterfaceC3967k.a.a()) {
                                androidx.compose.ui.e eVar5 = eVar2;
                                i21 = 2048;
                                j1.r rVar8 = rVar4;
                                eVar3 = eVar5;
                                m15 = m13;
                                d12 = d11;
                                i22 = i19;
                                I0.W0 w04 = w02;
                                c2467e0 = new C2467e0(o04, rVar8, z13, z12, w04, d12);
                                rVar5 = rVar8;
                                w02 = w04;
                                c3969l.x(c2467e0);
                            } else {
                                m15 = m13;
                                c2467e0 = C31;
                                d12 = d11;
                                rVar5 = rVar4;
                                i22 = i19;
                                eVar3 = eVar2;
                                i21 = 2048;
                            }
                            Function1 function13 = (Function1) c2467e0;
                            if (z12) {
                                l12 = androidx.compose.ui.c.b(l12, C5236c1.a(), new H1(function13, qVar2));
                            }
                            d13 = C2656q.d(C3176c0.j(l12, w02.E(), w02.I()), b2.a());
                            i23 = i18;
                            F14 = c3969l.F(o04) | (i23 == 4) | c3969l.F(d12);
                            C13 = c3969l.C();
                            if (!F14 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new Z(o04, k12, d12);
                                c3969l.x(C13);
                            }
                            androidx.compose.ui.e b14 = androidx.compose.ui.draw.c.b(aVar2, (Function1) C13);
                            i2Var2 = i2Var;
                            F15 = c3969l.F(o04) | (i22 == i21) | c3969l.n(i2Var2) | c3969l.F(w02) | (i23 == 4) | c3969l.F(d12);
                            C14 = c3969l.C();
                            if (!F15 || C14 == InterfaceC3967k.a.a()) {
                                i24 = i23;
                                Q1.K k15 = k12;
                                i25 = 4;
                                C2461c0 c2461c0 = new C2461c0(o04, z12, i2Var2, w02, k15, d12);
                                i2Var3 = i2Var2;
                                c3969l.x(c2461c0);
                                C14 = c2461c0;
                            } else {
                                i24 = i23;
                                i2Var3 = i2Var2;
                                i25 = 4;
                            }
                            androidx.compose.ui.e a16 = androidx.compose.ui.layout.c.a(aVar2, (Function1) C14);
                            Q1.W w13 = w11;
                            F16 = c3969l.F(w13) | (i24 == i25) | (i22 == 2048) | c3969l.p(false) | (i38 == 16384) | c3969l.F(o04) | c3969l.F(d12) | c3969l.F(w02) | ((i39 <= 32 && c3969l.n(rVar)) || (i33 & 48) == 32);
                            Object C32 = c3969l.C();
                            if (!F16 || C32 == InterfaceC3967k.a.a()) {
                                O0 o08 = o04;
                                z19 = false;
                                i26 = i25;
                                eVar4 = d13;
                                I0.W0 w05 = w02;
                                Q1.D d15 = d12;
                                c2503q0 = new C2503q0(w13, k11, z12, z13, rVar, o08, d15, w05, rVar5);
                                rVar6 = rVar;
                                w02 = w05;
                                k13 = k11;
                                o05 = o08;
                                d12 = d15;
                                c3969l.x(c2503q0);
                            } else {
                                o05 = o04;
                                z19 = false;
                                c2503q0 = C32;
                                i26 = i25;
                                eVar4 = d13;
                                rVar6 = rVar;
                                k13 = k11;
                            }
                            androidx.compose.ui.e c12 = I1.o.c(aVar2, true, (Function1) c2503q0);
                            z21 = (!z12 && !z13 && i2Var3.a() && K1.Q.e(o05.q()) && K1.Q.e(o05.c())) ? true : z19;
                            int i41 = C2489l1.f1841b;
                            if (z21) {
                                b12 = androidx.compose.ui.c.b(aVar2, C5236c1.a(), new C2486k1(abstractC7799Q, o05, k13, d12));
                                aVar3 = b12;
                            } else {
                                aVar3 = aVar2;
                            }
                            F17 = c3969l.F(w02);
                            C15 = c3969l.C();
                            if (!F17 || C15 == InterfaceC3967k.a.a()) {
                                C15 = new O(w02);
                                c3969l.x(C15);
                            }
                            S0.Q.c(w02, (Function1) C15, c3969l);
                            Q1.M m19 = m15;
                            F18 = c3969l.F(o05) | c3969l.F(m19) | (i24 == i26 ? true : z19) | (((i39 > 32 || !c3969l.n(rVar6)) && (i33 & 48) != 32) ? z19 : true);
                            C16 = c3969l.C();
                            if (!F18 || C16 == InterfaceC3967k.a.a()) {
                                C16 = new Q(o05, m19, k13, rVar6);
                                c3969l.x(C16);
                            }
                            S0.Q.c(rVar6, (Function1) C16, c3969l);
                            Function1<Q1.K, Unit> m21 = o05.m();
                            boolean z25 = i11 == 1 ? true : z19;
                            int e11 = rVar6.e();
                            j1.r rVar9 = rVar5;
                            Q1.r rVar10 = rVar6;
                            o06 = o05;
                            I0.W0 w06 = w02;
                            b11 = androidx.compose.ui.c.b(aVar2, C5236c1.a(), new C1(o06, w06, k13, z15, z25, d12, f2Var, m21, e11));
                            boolean booleanValue = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
                            AbstractC2923g0 abstractC2923g03 = abstractC2923g0;
                            F19 = c3969l.F(o06) | (((i39 > 32 || !c3969l.n(rVar10)) && (i33 & 48) != 32) ? z19 : true) | c3969l.F(abstractC2923g03);
                            C17 = c3969l.C();
                            if (!F19 || C17 == InterfaceC3967k.a.a()) {
                                C17 = new C2505r0(o06, rVar9, rVar10, abstractC2923g03);
                                c3969l.x(C17);
                            }
                            Q1.D d16 = d12;
                            M1 m110 = m12;
                            androidx.compose.ui.e a17 = androidx.compose.ui.layout.c.a(androidx.compose.ui.c.b(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(eVar, abstractC2923g03, o06, w06).l0(androidx.compose.foundation.text.handwriting.a.c(aVar2, booleanValue, (Function0) C17)).l0(eVar3), new C2504q1(iVar2, o06)), new C2517v0(o06, w06)).l0(b11), C5236c1.a(), new L1(m110, z12, qVar)).l0(eVar4).l0(c12), new Y(o06));
                            boolean z26 = (!z12 && o06.e() && o06.x() && i2Var3.a()) ? true : z19;
                            W w14 = new W(interfaceC6511n, o06, t2, i12, i11, m110, k11, x11, aVar3, b14, a16, z26 ? I0.c1.b(aVar2, w06) : aVar2, interfaceC10969b2, w06, z26, z13, function12, d16, dVar3);
                            c3969l2 = c3969l;
                            b(a17, w06, a1.c.c(-374338080, w14, c3969l2), c3969l2, 384);
                        }
                    } else {
                        o03 = o02;
                    }
                    z17 = true;
                    z18 = n13 | z17;
                    Object C292 = c3969l.C();
                    if (z18) {
                    }
                    rVar4 = rVar2;
                    eVar2 = a15;
                    interfaceC10969b2 = interfaceC10969b;
                    o04 = o03;
                    qVar2 = qVar;
                    m14 = new M(o04, l11, m13, w02, rVar3, null);
                    interfaceC3978p0 = l11;
                    c3969l.x(m14);
                    S0.Q.e(c3969l, unit, (Function2) m14);
                    F12 = c3969l.F(o04);
                    C12 = c3969l.C();
                    if (!F12) {
                    }
                    C12 = new C2464d0(o04);
                    c3969l.x(C12);
                    androidx.compose.ui.e l122 = C3176c0.l(aVar2, (Function1) C12);
                    i19 = i17;
                    F13 = c3969l.F(o04) | (i38 == 16384) | (i19 == 2048) | c3969l.F(d11) | c3969l.F(w02);
                    Object C312 = c3969l.C();
                    if (F13) {
                    }
                    androidx.compose.ui.e eVar52 = eVar2;
                    i21 = 2048;
                    j1.r rVar82 = rVar4;
                    eVar3 = eVar52;
                    m15 = m13;
                    d12 = d11;
                    i22 = i19;
                    I0.W0 w042 = w02;
                    c2467e0 = new C2467e0(o04, rVar82, z13, z12, w042, d12);
                    rVar5 = rVar82;
                    w02 = w042;
                    c3969l.x(c2467e0);
                    Function1 function132 = (Function1) c2467e0;
                    if (z12) {
                    }
                    d13 = C2656q.d(C3176c0.j(l122, w02.E(), w02.I()), b2.a());
                    i23 = i18;
                    F14 = c3969l.F(o04) | (i23 == 4) | c3969l.F(d12);
                    C13 = c3969l.C();
                    if (!F14) {
                    }
                    C13 = new Z(o04, k12, d12);
                    c3969l.x(C13);
                    androidx.compose.ui.e b142 = androidx.compose.ui.draw.c.b(aVar2, (Function1) C13);
                    i2Var2 = i2Var;
                    F15 = c3969l.F(o04) | (i22 == i21) | c3969l.n(i2Var2) | c3969l.F(w02) | (i23 == 4) | c3969l.F(d12);
                    C14 = c3969l.C();
                    if (F15) {
                    }
                    i24 = i23;
                    Q1.K k152 = k12;
                    i25 = 4;
                    C2461c0 c2461c02 = new C2461c0(o04, z12, i2Var2, w02, k152, d12);
                    i2Var3 = i2Var2;
                    c3969l.x(c2461c02);
                    C14 = c2461c02;
                    androidx.compose.ui.e a162 = androidx.compose.ui.layout.c.a(aVar2, (Function1) C14);
                    Q1.W w132 = w11;
                    F16 = c3969l.F(w132) | (i24 == i25) | (i22 == 2048) | c3969l.p(false) | (i38 == 16384) | c3969l.F(o04) | c3969l.F(d12) | c3969l.F(w02) | ((i39 <= 32 && c3969l.n(rVar)) || (i33 & 48) == 32);
                    Object C322 = c3969l.C();
                    if (F16) {
                    }
                    O0 o082 = o04;
                    z19 = false;
                    i26 = i25;
                    eVar4 = d13;
                    I0.W0 w052 = w02;
                    Q1.D d152 = d12;
                    c2503q0 = new C2503q0(w132, k11, z12, z13, rVar, o082, d152, w052, rVar5);
                    rVar6 = rVar;
                    w02 = w052;
                    k13 = k11;
                    o05 = o082;
                    d12 = d152;
                    c3969l.x(c2503q0);
                    androidx.compose.ui.e c122 = I1.o.c(aVar2, true, (Function1) c2503q0);
                    if (!z12) {
                    }
                    int i412 = C2489l1.f1841b;
                    if (z21) {
                    }
                    F17 = c3969l.F(w02);
                    C15 = c3969l.C();
                    if (!F17) {
                    }
                    C15 = new O(w02);
                    c3969l.x(C15);
                    S0.Q.c(w02, (Function1) C15, c3969l);
                    Q1.M m192 = m15;
                    F18 = c3969l.F(o05) | c3969l.F(m192) | (i24 == i26 ? true : z19) | (((i39 > 32 || !c3969l.n(rVar6)) && (i33 & 48) != 32) ? z19 : true);
                    C16 = c3969l.C();
                    if (!F18) {
                    }
                    C16 = new Q(o05, m192, k13, rVar6);
                    c3969l.x(C16);
                    S0.Q.c(rVar6, (Function1) C16, c3969l);
                    Function1<Q1.K, Unit> m212 = o05.m();
                    if (i11 == 1) {
                    }
                    int e112 = rVar6.e();
                    j1.r rVar92 = rVar5;
                    Q1.r rVar102 = rVar6;
                    o06 = o05;
                    I0.W0 w062 = w02;
                    b11 = androidx.compose.ui.c.b(aVar2, C5236c1.a(), new C1(o06, w062, k13, z15, z25, d12, f2Var, m212, e112));
                    boolean booleanValue2 = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
                    AbstractC2923g0 abstractC2923g032 = abstractC2923g0;
                    F19 = c3969l.F(o06) | (((i39 > 32 || !c3969l.n(rVar102)) && (i33 & 48) != 32) ? z19 : true) | c3969l.F(abstractC2923g032);
                    C17 = c3969l.C();
                    if (!F19) {
                    }
                    C17 = new C2505r0(o06, rVar92, rVar102, abstractC2923g032);
                    c3969l.x(C17);
                    Q1.D d162 = d12;
                    M1 m1102 = m12;
                    androidx.compose.ui.e a172 = androidx.compose.ui.layout.c.a(androidx.compose.ui.c.b(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(eVar, abstractC2923g032, o06, w062).l0(androidx.compose.foundation.text.handwriting.a.c(aVar2, booleanValue2, (Function0) C17)).l0(eVar3), new C2504q1(iVar2, o06)), new C2517v0(o06, w062)).l0(b11), C5236c1.a(), new L1(m1102, z12, qVar)).l0(eVar4).l0(c122), new Y(o06));
                    if (!z12) {
                    }
                    W w142 = new W(interfaceC6511n, o06, t2, i12, i11, m1102, k11, x11, aVar3, b142, a162, z26 ? I0.c1.b(aVar2, w062) : aVar2, interfaceC10969b2, w062, z26, z13, function12, d162, dVar3);
                    c3969l2 = c3969l;
                    b(a172, w062, a1.c.c(-374338080, w142, c3969l2), c3969l2, 384);
                }
            } else {
                m11 = m16;
            }
            z14 = true;
            F11 = F21 | z14 | u11.F(a13) | u11.F(a14) | u11.F(interfaceC10969b3) | u11.F(w03);
            C11 = u11.C();
            if (F11) {
            }
            i17 = i37;
            rVar2 = rVar7;
            i18 = i35;
            z15 = z24;
            iVar2 = iVar3;
            aVar2 = aVar7;
            Q1.M m182 = m11;
            abstractC2923g0 = abstractC2923g02;
            i2Var = i2Var4;
            m12 = m17;
            interfaceC10969b = interfaceC10969b3;
            o02 = o07;
            w11 = w12;
            c3969l = u11;
            C2458b0 c2458b02 = new C2458b0(o02, z12, z13, m182, k11, rVar, a13, w03, a14, interfaceC10969b);
            m13 = m182;
            d11 = a13;
            w02 = w03;
            z16 = z12;
            k12 = k11;
            rVar3 = rVar;
            c3969l.x(c2458b02);
            C11 = c2458b02;
            androidx.compose.ui.e a152 = FocusableKt.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.i.a(aVar2, rVar2), (Function1) C11), z16, qVar);
            InterfaceC3978p0 l112 = S0.n1.l(Boolean.valueOf((z16 || z13) ? false : true), c3969l);
            Unit unit2 = Unit.f71690a;
            boolean n132 = c3969l.n(l112) | c3969l.F(o02) | c3969l.F(m13) | c3969l.F(w02);
            if (i39 > 32) {
            }
            o03 = o02;
            if ((i33 & 48) != 32) {
            }
            z17 = true;
            z18 = n132 | z17;
            Object C2922 = c3969l.C();
            if (z18) {
            }
            rVar4 = rVar2;
            eVar2 = a152;
            interfaceC10969b2 = interfaceC10969b;
            o04 = o03;
            qVar2 = qVar;
            m14 = new M(o04, l112, m13, w02, rVar3, null);
            interfaceC3978p0 = l112;
            c3969l.x(m14);
            S0.Q.e(c3969l, unit2, (Function2) m14);
            F12 = c3969l.F(o04);
            C12 = c3969l.C();
            if (!F12) {
            }
            C12 = new C2464d0(o04);
            c3969l.x(C12);
            androidx.compose.ui.e l1222 = C3176c0.l(aVar2, (Function1) C12);
            i19 = i17;
            F13 = c3969l.F(o04) | (i38 == 16384) | (i19 == 2048) | c3969l.F(d11) | c3969l.F(w02);
            Object C3122 = c3969l.C();
            if (F13) {
            }
            androidx.compose.ui.e eVar522 = eVar2;
            i21 = 2048;
            j1.r rVar822 = rVar4;
            eVar3 = eVar522;
            m15 = m13;
            d12 = d11;
            i22 = i19;
            I0.W0 w0422 = w02;
            c2467e0 = new C2467e0(o04, rVar822, z13, z12, w0422, d12);
            rVar5 = rVar822;
            w02 = w0422;
            c3969l.x(c2467e0);
            Function1 function1322 = (Function1) c2467e0;
            if (z12) {
            }
            d13 = C2656q.d(C3176c0.j(l1222, w02.E(), w02.I()), b2.a());
            i23 = i18;
            F14 = c3969l.F(o04) | (i23 == 4) | c3969l.F(d12);
            C13 = c3969l.C();
            if (!F14) {
            }
            C13 = new Z(o04, k12, d12);
            c3969l.x(C13);
            androidx.compose.ui.e b1422 = androidx.compose.ui.draw.c.b(aVar2, (Function1) C13);
            i2Var2 = i2Var;
            F15 = c3969l.F(o04) | (i22 == i21) | c3969l.n(i2Var2) | c3969l.F(w02) | (i23 == 4) | c3969l.F(d12);
            C14 = c3969l.C();
            if (F15) {
            }
            i24 = i23;
            Q1.K k1522 = k12;
            i25 = 4;
            C2461c0 c2461c022 = new C2461c0(o04, z12, i2Var2, w02, k1522, d12);
            i2Var3 = i2Var2;
            c3969l.x(c2461c022);
            C14 = c2461c022;
            androidx.compose.ui.e a1622 = androidx.compose.ui.layout.c.a(aVar2, (Function1) C14);
            Q1.W w1322 = w11;
            F16 = c3969l.F(w1322) | (i24 == i25) | (i22 == 2048) | c3969l.p(false) | (i38 == 16384) | c3969l.F(o04) | c3969l.F(d12) | c3969l.F(w02) | ((i39 <= 32 && c3969l.n(rVar)) || (i33 & 48) == 32);
            Object C3222 = c3969l.C();
            if (F16) {
            }
            O0 o0822 = o04;
            z19 = false;
            i26 = i25;
            eVar4 = d13;
            I0.W0 w0522 = w02;
            Q1.D d1522 = d12;
            c2503q0 = new C2503q0(w1322, k11, z12, z13, rVar, o0822, d1522, w0522, rVar5);
            rVar6 = rVar;
            w02 = w0522;
            k13 = k11;
            o05 = o0822;
            d12 = d1522;
            c3969l.x(c2503q0);
            androidx.compose.ui.e c1222 = I1.o.c(aVar2, true, (Function1) c2503q0);
            if (!z12) {
            }
            int i4122 = C2489l1.f1841b;
            if (z21) {
            }
            F17 = c3969l.F(w02);
            C15 = c3969l.C();
            if (!F17) {
            }
            C15 = new O(w02);
            c3969l.x(C15);
            S0.Q.c(w02, (Function1) C15, c3969l);
            Q1.M m1922 = m15;
            F18 = c3969l.F(o05) | c3969l.F(m1922) | (i24 == i26 ? true : z19) | (((i39 > 32 || !c3969l.n(rVar6)) && (i33 & 48) != 32) ? z19 : true);
            C16 = c3969l.C();
            if (!F18) {
            }
            C16 = new Q(o05, m1922, k13, rVar6);
            c3969l.x(C16);
            S0.Q.c(rVar6, (Function1) C16, c3969l);
            Function1<Q1.K, Unit> m2122 = o05.m();
            if (i11 == 1) {
            }
            int e1122 = rVar6.e();
            j1.r rVar922 = rVar5;
            Q1.r rVar1022 = rVar6;
            o06 = o05;
            I0.W0 w0622 = w02;
            b11 = androidx.compose.ui.c.b(aVar2, C5236c1.a(), new C1(o06, w0622, k13, z15, z25, d12, f2Var, m2122, e1122));
            boolean booleanValue22 = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
            AbstractC2923g0 abstractC2923g0322 = abstractC2923g0;
            F19 = c3969l.F(o06) | (((i39 > 32 || !c3969l.n(rVar1022)) && (i33 & 48) != 32) ? z19 : true) | c3969l.F(abstractC2923g0322);
            C17 = c3969l.C();
            if (!F19) {
            }
            C17 = new C2505r0(o06, rVar922, rVar1022, abstractC2923g0322);
            c3969l.x(C17);
            Q1.D d1622 = d12;
            M1 m11022 = m12;
            androidx.compose.ui.e a1722 = androidx.compose.ui.layout.c.a(androidx.compose.ui.c.b(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(eVar, abstractC2923g0322, o06, w0622).l0(androidx.compose.foundation.text.handwriting.a.c(aVar2, booleanValue22, (Function0) C17)).l0(eVar3), new C2504q1(iVar2, o06)), new C2517v0(o06, w0622)).l0(b11), C5236c1.a(), new L1(m11022, z12, qVar)).l0(eVar4).l0(c1222), new Y(o06));
            if (!z12) {
            }
            W w1422 = new W(interfaceC6511n, o06, t2, i12, i11, m11022, k11, x11, aVar3, b1422, a1622, z26 ? I0.c1.b(aVar2, w0622) : aVar2, interfaceC10969b2, w0622, z26, z13, function12, d1622, dVar3);
            c3969l2 = c3969l;
            b(a1722, w0622, a1.c.c(-374338080, w1422, c3969l2), c3969l2, 384);
        }
        S0.J0 m03 = c3969l2.m0();
        if (m03 != null) {
            m03.G(new X(k11, function1, eVar, t2, x11, function12, qVar, abstractC7799Q, z11, i11, i12, rVar, m02, z12, z13, interfaceC6511n, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.ui.e eVar, I0.W0 w02, C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-20551815);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(w02) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(c4912a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            B1.V f7 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = u11.I();
            S0.A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, eVar);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            S0.F1.b(u11, f11, InterfaceC2801g.a.f());
            L.c(w02, c4912a, u11, (i12 >> 3) & 126);
            u11.f();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2508s0(eVar, w02, c4912a, i11));
        }
    }

    public static final void c(@NotNull I0.W0 w02, InterfaceC3967k interfaceC3967k, int i11) {
        C3422b J11;
        C3969l u11 = interfaceC3967k.u(-1436003720);
        if ((((u11.F(w02) ? 4 : 2) | i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            O0 H11 = w02.H();
            if (H11 == null || !H11.r() || (J11 = w02.J()) == null || J11.length() <= 0) {
                u11.o(-284257090);
                u11.k();
            } else {
                u11.o(-285446808);
                boolean n11 = u11.n(w02);
                Object C11 = u11.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = w02.q();
                    u11.x(C11);
                }
                InterfaceC2477h1 interfaceC2477h1 = (InterfaceC2477h1) C11;
                long x11 = w02.x((Z1.d) u11.m(androidx.compose.ui.platform.K0.e()));
                boolean s11 = u11.s(x11);
                Object C12 = u11.C();
                if (s11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new a(x11);
                    u11.x(C12);
                }
                InterfaceC3214w interfaceC3214w = (InterfaceC3214w) C12;
                e.a aVar = androidx.compose.ui.e.f40358c0;
                boolean F11 = u11.F(interfaceC2477h1) | u11.F(w02);
                Object C13 = u11.C();
                if (F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new b(interfaceC2477h1, w02, null);
                    u11.x(C13);
                }
                androidx.compose.ui.e b11 = x1.L.b(aVar, interfaceC2477h1, (Function2) C13);
                boolean s12 = u11.s(x11);
                Object C14 = u11.C();
                if (s12 || C14 == InterfaceC3967k.a.a()) {
                    C14 = new c(x11);
                    u11.x(C14);
                }
                C2457b.a(interfaceC3214w, I1.o.c(b11, false, (Function1) C14), 0L, u11, 0, 4);
                u11.k();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(w02, i11));
        }
    }

    public static final void e(I0.W0 w02, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        R1 j11;
        K1.K e11;
        C3969l u11 = interfaceC3967k.u(626339208);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(w02) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (z11) {
            u11.o(-1286242594);
            O0 H11 = w02.H();
            K1.K k11 = null;
            if (H11 != null && (j11 = H11.j()) != null && (e11 = j11.e()) != null) {
                O0 H12 = w02.H();
                if (!(H12 != null ? H12.y() : true)) {
                    k11 = e11;
                }
            }
            if (k11 == null) {
                u11.o(-1285984396);
            } else {
                u11.o(-1285984395);
                if (K1.Q.e(w02.K().e())) {
                    u11.o(-1679637798);
                    u11.k();
                } else {
                    u11.o(-1680616096);
                    int originalToTransformed = w02.F().originalToTransformed((int) (w02.K().e() >> 32));
                    int originalToTransformed2 = w02.F().originalToTransformed((int) (w02.K().e() & 4294967295L));
                    V1.g c11 = k11.c(originalToTransformed);
                    V1.g c12 = k11.c(Math.max(originalToTransformed2 - 1, 0));
                    O0 H13 = w02.H();
                    if (H13 == null || !H13.u()) {
                        u11.o(-1679975078);
                        u11.k();
                    } else {
                        u11.o(-1680216289);
                        I0.X0.a(true, c11, w02, u11, ((i12 << 6) & 896) | 6);
                        u11.k();
                    }
                    O0 H14 = w02.H();
                    if (H14 == null || !H14.t()) {
                        u11.o(-1679655654);
                        u11.k();
                    } else {
                        u11.o(-1679895904);
                        I0.X0.a(false, c12, w02, u11, ((i12 << 6) & 896) | 6);
                        u11.k();
                    }
                    u11.k();
                }
                O0 H15 = w02.H();
                if (H15 != null) {
                    if (w02.M()) {
                        H15.J(false);
                    }
                    if (H15.e()) {
                        if (H15.s()) {
                            w02.c0();
                        } else {
                            w02.L();
                        }
                    }
                    Unit unit = Unit.f71690a;
                }
            }
            u11.k();
            u11.k();
        } else {
            u11.o(651305535);
            u11.k();
            w02.L();
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2511t0(w02, z11, i11));
        }
    }

    public static final void f(O0 o02) {
        Q1.V g10 = o02.g();
        if (g10 != null) {
            C3843l n11 = o02.n();
            ((O0.b) o02.m()).invoke(Q1.K.a(n11.c(), null, 0L, 3));
            g10.a();
        }
        o02.D(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q1.V, T] */
    public static final void h(Q1.M m11, O0 o02, Q1.K k11, Q1.r rVar, Q1.D d11) {
        C3843l n11 = o02.n();
        Function1<Q1.K, Unit> m12 = o02.m();
        Function1<C3848q, Unit> l11 = o02.l();
        kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
        ?? d12 = m11.d(k11, rVar, new C2492m1(n11, m12, m13), l11);
        m13.f71787a = d12;
        o02.D(d12);
        i(o02, k11, d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(O0 o02, Q1.K k11, Q1.D d11) {
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            R1 j11 = o02.j();
            if (j11 == null) {
                return;
            }
            Q1.V g10 = o02.g();
            if (g10 == null) {
                return;
            }
            B1.B i11 = o02.i();
            if (i11 == null) {
                return;
            }
            C2498o1.c(k11, o02.v(), j11.e(), i11, g10, o02.e(), d11);
            Unit unit = Unit.f71690a;
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }
}
