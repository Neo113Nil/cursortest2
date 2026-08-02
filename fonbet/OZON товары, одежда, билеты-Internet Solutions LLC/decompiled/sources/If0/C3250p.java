package If0;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import If0.J;
import J0.C3296h;
import J0.C3332q;
import J0.C3339s;
import J0.C3343t;
import J0.D3;
import J0.E3;
import J0.u3;
import Lf0.a;
import Rf0.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qf0.EnumC9053a;
import u0.C9915y;
import u0.InterfaceC9890C;
import v0.C10164d;

/* renamed from: If0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3250p {

    /* renamed from: If0.p$a */
    static final class a extends AbstractC7737t implements InterfaceC6511n<InterfaceC9890C, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.EnumC0331a f12456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a.EnumC0331a enumC0331a) {
            super(3);
            this.f12456b = enumC0331a;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9890C interfaceC9890C, InterfaceC3967k interfaceC3967k, Integer num) {
            String str;
            InterfaceC9890C Badge = interfaceC9890C;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Badge, "$this$Badge");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                androidx.compose.ui.e f7 = androidx.compose.foundation.layout.T.f(androidx.compose.ui.e.f40358c0, 2);
                a.EnumC0331a enumC0331a = this.f12456b;
                Intrinsics.checkNotNullParameter(enumC0331a, "<this>");
                int i11 = b.a.f25065d[enumC0331a.ordinal()];
                if (i11 == 1) {
                    str = "User";
                } else if (i11 == 2) {
                    str = "System";
                } else {
                    if (i11 != 3) {
                        throw new Sc.o();
                    }
                    str = "Default";
                }
                u3.b(str, f7, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((D3) interfaceC3967k2.m(E3.c())).d(), interfaceC3967k2, 48, 0, 65532);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: If0.p$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.EnumC0331a f12457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a.EnumC0331a enumC0331a, int i11) {
            super(2);
            this.f12457b = enumC0331a;
            this.f12458c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f12458c | 1);
            C3250p.a(this.f12457b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: If0.p$c */
    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.a.C0246a f12459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(J.a.C0246a c0246a, int i11) {
            super(2);
            this.f12459b = c0246a;
            this.f12460c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f12460c | 1);
            C3250p.b(this.f12459b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: If0.p$d */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.a.b f12461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12462c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(J.a.b bVar, int i11) {
            super(2);
            this.f12461b = bVar;
            this.f12462c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f12462c | 1);
            C3250p.c(this.f12461b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: If0.p$e */
    static final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J.a f12463b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12464c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J.a aVar, int i11) {
            super(2);
            this.f12463b = aVar;
            this.f12464c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f12464c | 1);
            C3250p.d(this.f12463b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a.EnumC0331a enumC0331a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-903536054);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(enumC0331a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C3296h.a(null, ((C3339s) u11.m(C3343t.d())).j(), 0L, a1.c.c(-2103956419, new a(enumC0331a), u11), u11, 3072);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(enumC0331a, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(J.a.C0246a c0246a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-158167695);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c0246a) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            K1.T d12 = ((D3) u11.m(E3.c())).d();
            c3969l = u11;
            u3.b("Повторных попыток при " + Rf0.b.b(EnumC9053a.NotAvailable) + " " + c0246a.d(), androidx.compose.foundation.layout.a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 48, 0, 65532);
            u3.b("Интерфейс соединения: ".concat(Rf0.b.c(c0246a.a())), androidx.compose.foundation.layout.a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 48, 0, 65532);
            u3.b("Протокол: " + Rf0.b.a(c0246a.c()) + ", порт: " + c0246a.b(), androidx.compose.foundation.layout.a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 48, 0, 65532);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new c(c0246a, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(J.a.b bVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-344317841);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.n(bVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            K1.T d12 = ((D3) u11.m(E3.c())).d();
            c3969l = u11;
            u3.b(Sh.b.c("Период пинга для ", Rf0.b.b(EnumC9053a.Available), " ", kotlin.time.b.p(bVar.a())), androidx.compose.foundation.layout.a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 48, 0, 65532);
            u3.b(Sh.b.c("Период пинга для ", Rf0.b.b(EnumC9053a.NotAvailable), " ", kotlin.time.b.p(bVar.b())), androidx.compose.foundation.layout.a0.e(aVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 48, 0, 65532);
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new d(bVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(J.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1037003840);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.n(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = androidx.compose.foundation.layout.a0.e(aVar2, 1.0f);
            androidx.compose.foundation.layout.Y b11 = androidx.compose.foundation.layout.X.b(C5179b.d(), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            K1.T d12 = ((D3) u11.m(E3.c())).d();
            u3.b(Rf0.b.b(aVar.f()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, u11, 0, 0, 65534);
            androidx.compose.foundation.layout.Y b12 = androidx.compose.foundation.layout.X.b(C5179b.n(4), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, aVar2);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            u3.b(aVar.c() ? "Observing" : "Paused", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, u11, 0, 0, 65534);
            u11.o(141067200);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
                u11.x(C11);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C11;
            u11.k();
            Long b13 = aVar.b();
            c3969l = u11;
            u3.b(b13 != null ? Nk.a.b("Updated at ", simpleDateFormat.format(new Date(b13.longValue()))) : "Not yet updated", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d12, c3969l, 0, 0, 65534);
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new e(aVar, i11));
        }
    }

    public static final void e(J j11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1219215938);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(774275309, new C3247m(j11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3248n(j11, function1, i11));
        }
    }

    public static final void f(String str, Lf0.a aVar, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str2;
        Function1 function12;
        C3969l u11 = interfaceC3967k.u(529540602);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            str2 = str;
            function12 = function1;
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e u12 = androidx.compose.foundation.layout.a0.u(androidx.compose.foundation.layout.a0.e(aVar2, 1.0f), 3);
            C5194q a11 = C5193p.a(C5179b.n(4), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, u12);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            str2 = str;
            function12 = function1;
            Sf0.j.a(GZ.e.c(u11, f7, aVar2, 1.0f), str2, aVar.a(), function12, u11, ((i12 << 3) & 112) | 6 | ((i12 << 6) & 57344));
            a(aVar.b(), u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3249o(str2, aVar, function12, i11));
        }
    }

    public static final void h(J j11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(2143841022);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(-262701395, new r(j11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3252s(j11, function1, i11));
        }
    }

    public static final void i(J.a aVar, boolean z11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1996638623);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e a11 = Sf0.d.a(aVar2, z11, u11);
            C5194q a12 = C5193p.a(C5179b.n(8), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, a11);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u3.b(aVar.a(), androidx.compose.foundation.layout.a0.e(aVar2, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, u11, 48, 0, 131068);
            u11 = u11;
            J.a.b e11 = aVar.e();
            u11.o(-552712494);
            if (e11 != null) {
                c(e11, u11, 0);
            }
            u11.k();
            J.a.C0246a d12 = aVar.d();
            u11.o(-552710828);
            if (d12 != null) {
                b(d12, u11, 0);
            }
            u11.k();
            int i13 = i12 & 14;
            d(aVar, u11, i13);
            androidx.compose.ui.e e12 = androidx.compose.foundation.layout.a0.e(aVar2, 1.0f);
            u11.o(-552705797);
            int i14 = i12 & 896;
            boolean z12 = (i13 == 4) | (i14 == 256);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C3253t(aVar, function1);
                u11.x(C11);
            }
            u11.k();
            C3332q.b((Function0) C11, e12, null, a1.c.c(-1103274932, new C3254u(aVar), u11), u11, 805306416, 508);
            androidx.compose.ui.e e13 = androidx.compose.foundation.layout.a0.e(aVar2, 1.0f);
            u11.o(-552687929);
            boolean z13 = (i14 == 256) | (i13 == 4);
            Object C12 = u11.C();
            if (z13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C3255v(aVar, function1);
                u11.x(C12);
            }
            u11.k();
            C3332q.b((Function0) C12, e13, null, C3237c.f12425f, u11, 805306416, 508);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3256w(aVar, z11, function1, i11));
        }
    }

    public static final void j(J j11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(2142744843);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            float f7 = 8;
            C5179b.i n11 = C5179b.n(f7);
            C9915y a11 = androidx.compose.foundation.layout.T.a(0.0f, 1, f7);
            u11.o(-449305524);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new A(j11, function1);
                u11.x(C11);
            }
            u11.k();
            C10164d.a(null, null, a11, n11, null, null, false, (Function1) C11, u11, 24960, 235);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B(j11, function1, i11));
        }
    }

    public static final void k(J j11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-740969035);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(-747833180, new F(j11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new G(j11, function1, i11));
        }
    }
}
