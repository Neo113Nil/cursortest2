package Gf0;

import B0.A0;
import B0.N0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.C3332q;
import J0.C3339s;
import J0.C3343t;
import J0.C3364y0;
import J0.D3;
import J0.E3;
import J0.F1;
import J0.u3;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
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
import qf0.EnumC9053a;
import u0.InterfaceC9895d;

/* renamed from: Gf0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3105h {

    /* renamed from: Gf0.h$a */
    static final class a extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10172b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10173c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(D d11, Function1<? super C, Unit> function1) {
            super(3);
            this.f10172b = d11;
            this.f10173c = function1;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9895d Block = interfaceC9895d;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Block, "$this$Block");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                boolean b11 = this.f10172b.b();
                e.a aVar = androidx.compose.ui.e.f40358c0;
                androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
                interfaceC3967k2.o(-1726177250);
                Function1<C, Unit> function1 = this.f10173c;
                boolean n11 = interfaceC3967k2.n(function1);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3103f(function1);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                C3332q.a((Function0) C11, e11, b11, null, null, null, null, P.f10150b, interfaceC3967k2, 805306416, 504);
                interfaceC3967k2.o(-1726171717);
                boolean n12 = interfaceC3967k2.n(function1);
                Object C12 = interfaceC3967k2.C();
                if (n12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C3104g(function1);
                    interfaceC3967k2.x(C12);
                }
                interfaceC3967k2.k();
                C3332q.b((Function0) C12, a0.e(aVar, 1.0f), null, P.f10151c, interfaceC3967k2, 805306416, 508);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10174b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10175c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(D d11, Function1<? super C, Unit> function1, int i11) {
            super(2);
            this.f10174b = d11;
            this.f10175c = function1;
            this.f10176d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f10176d | 1);
            C3105h.a(this.f10174b, this.f10175c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$c */
    static final class c extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10177b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10178c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10179d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f10180e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(D d11, Function1<? super C, Unit> function1, boolean z11, String str) {
            super(3);
            this.f10177b = d11;
            this.f10178c = function1;
            this.f10179d = z11;
            this.f10180e = str;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9895d Block = interfaceC9895d;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Block, "$this$Block");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Sf0.e.a("Домен", null, interfaceC3967k2, 6, 2);
                androidx.compose.ui.e e11 = a0.e(androidx.compose.ui.e.f40358c0, 1.0f);
                N0 n02 = new N0(0, 5, 121);
                String c11 = this.f10177b.c();
                interfaceC3967k2.o(1515037072);
                Function1<C, Unit> function1 = this.f10178c;
                boolean n11 = interfaceC3967k2.n(function1);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3106i(function1);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                F1.b(c11, (Function1) C11, e11, false, false, null, null, P.f10149a, null, this.f10179d, null, n02, null, false, 0, 0, null, null, interfaceC3967k2, 12583296, 0, 1043320);
                if (this.f10179d) {
                    u3.b(this.f10180e, null, ((C3339s) interfaceC3967k2.m(C3343t.d())).b(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((D3) interfaceC3967k2.m(E3.c())).d(), interfaceC3967k2, 0, 0, 65530);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$d */
    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10181b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10182c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10183d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(D d11, Function1<? super C, Unit> function1, int i11) {
            super(2);
            this.f10181b = d11;
            this.f10182c = function1;
            this.f10183d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f10183d | 1);
            C3105h.b(this.f10181b, this.f10182c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$e */
    static final class e extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(D d11, Function1<? super C, Unit> function1) {
            super(3);
            this.f10184b = d11;
            this.f10185c = function1;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9895d Block = interfaceC9895d;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Block, "$this$Block");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Sf0.e.a("Ping config", null, interfaceC3967k2, 6, 2);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
                String concat = "Повторных попыток при ".concat(Rf0.b.b(EnumC9053a.NotAvailable));
                D d11 = this.f10184b;
                int h11 = d11.h();
                interfaceC3967k2.o(1025984423);
                Function1<C, Unit> function1 = this.f10185c;
                boolean n11 = interfaceC3967k2.n(function1);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new C3116t(function1);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                Sf0.j.a(e11, concat, h11, (Function1) C11, interfaceC3967k2, 6);
                qf0.b e12 = d11.e();
                Xc.a<qf0.b> a11 = qf0.b.a();
                interfaceC3967k2.o(1025991832);
                Object C12 = interfaceC3967k2.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = C3117u.f10222a;
                    interfaceC3967k2.x(C12);
                }
                interfaceC3967k2.k();
                Function1 function12 = (Function1) ((kotlin.reflect.h) C12);
                interfaceC3967k2.o(1025993381);
                boolean n12 = interfaceC3967k2.n(function1);
                Object C13 = interfaceC3967k2.C();
                if (n12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C3118v(function1);
                    interfaceC3967k2.x(C13);
                }
                interfaceC3967k2.k();
                C3105h.h(e12, a11, function12, "Интерфейс соединения", (Function1) C13, interfaceC3967k2, 3456);
                Lf0.d g10 = d11.g();
                Xc.a<Lf0.d> a12 = Lf0.d.a();
                interfaceC3967k2.o(1026000640);
                Object C14 = interfaceC3967k2.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = C3119w.f10224a;
                    interfaceC3967k2.x(C14);
                }
                interfaceC3967k2.k();
                Function1 function13 = (Function1) ((kotlin.reflect.h) C14);
                interfaceC3967k2.o(1026002438);
                boolean n13 = interfaceC3967k2.n(function1);
                Object C15 = interfaceC3967k2.C();
                if (n13 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new C3120x(function1);
                    interfaceC3967k2.x(C15);
                }
                interfaceC3967k2.k();
                C3105h.h(g10, a12, function13, "Протокол", (Function1) C15, interfaceC3967k2, 3456);
                androidx.compose.ui.e e13 = a0.e(aVar, 1.0f);
                int f7 = d11.f();
                interfaceC3967k2.o(1026009438);
                boolean n14 = interfaceC3967k2.n(function1);
                Object C16 = interfaceC3967k2.C();
                if (n14 || C16 == InterfaceC3967k.a.a()) {
                    C16 = new y(function1);
                    interfaceC3967k2.x(C16);
                }
                interfaceC3967k2.k();
                Sf0.j.a(e13, "Порт", f7, (Function1) C16, interfaceC3967k2, 54);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$f */
    static final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10187c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10188d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(D d11, Function1<? super C, Unit> function1, int i11) {
            super(2);
            this.f10186b = d11;
            this.f10187c = function1;
            this.f10188d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f10188d | 1);
            C3105h.c(this.f10186b, this.f10187c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$g */
    static final class g extends AbstractC7737t implements InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10190c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(D d11, Function1<? super C, Unit> function1) {
            super(3);
            this.f10189b = d11;
            this.f10190c = function1;
        }

        @Override // fd.InterfaceC6511n
        public final Unit invoke(InterfaceC9895d interfaceC9895d, InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC9895d Block = interfaceC9895d;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(Block, "$this$Block");
            if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Sf0.e.a("Ping mode", null, interfaceC3967k2, 6, 2);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
                String b11 = A0.b("Период пинга ", Rf0.b.b(EnumC9053a.Available), " домена");
                D d11 = this.f10189b;
                long i11 = d11.i();
                interfaceC3967k2.o(1805470002);
                Function1<C, Unit> function1 = this.f10190c;
                boolean n11 = interfaceC3967k2.n(function1);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new z(function1);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                Sf0.j.b(e11, b11, i11, (Function1) C11, interfaceC3967k2, 3078);
                androidx.compose.ui.e e12 = a0.e(aVar, 1.0f);
                String b12 = A0.b("Период пинга ", Rf0.b.b(EnumC9053a.NotAvailable), " домена");
                long j11 = d11.j();
                interfaceC3967k2.o(1805481013);
                boolean n12 = interfaceC3967k2.n(function1);
                Object C12 = interfaceC3967k2.C();
                if (n12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new A(function1);
                    interfaceC3967k2.x(C12);
                }
                interfaceC3967k2.k();
                Sf0.j.b(e12, b12, j11, (Function1) C12, interfaceC3967k2, 3078);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: Gf0.h$h, reason: collision with other inner class name */
    static final class C0208h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f10191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C, Unit> f10192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10193d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0208h(D d11, Function1<? super C, Unit> function1, int i11) {
            super(2);
            this.f10191b = d11;
            this.f10192c = function1;
            this.f10193d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f10193d | 1);
            C3105h.d(this.f10191b, this.f10192c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D d11, Function1<? super C, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-633277913);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(1179812310, new a(d11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(d11, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(D d11, Function1<? super C, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(100684586);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            String d12 = d11.d();
            Sf0.c.a(null, a1.c.c(471906651, new c(d11, function1, !(d12 == null || kotlin.text.h.K(d12)), d12), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(d11, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(D d11, Function1<? super C, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(2040493466);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(533683019, new e(d11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(d11, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(D d11, Function1<? super C, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-937381415);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Sf0.c.a(null, a1.c.c(-675262518, new g(d11, function1), u11), u11, 48, 1);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C0208h(d11, function1, i11));
        }
    }

    public static final void e(D d11, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1530493883);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(d11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e c11 = androidx.compose.foundation.z.c(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), androidx.compose.foundation.z.b(u11), 14);
            C5194q a11 = C5193p.a(C5179b.n(16), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, c11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            S0.F1.b(u11, f7, InterfaceC2801g.a.f());
            int i13 = i12 & 126;
            b(d11, function1, u11, i13);
            d(d11, function1, u11, i13);
            c(d11, function1, u11, i13);
            a(d11, function1, u11, i13);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C3102e(d11, function1, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Enum r11, Xc.a aVar, Function1 function1, String str, Function1 function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(342551966);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(r11) : u11.F(r11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(str) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function12) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(-1597841654);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            boolean booleanValue = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
            u11.o(-1597836455);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new C3107j(interfaceC3978p0);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            C3364y0.a(booleanValue, (Function1) C12, null, a1.c.c(-1524467896, new r(function1, r11, str, interfaceC3978p0, aVar, function12), u11), c3969l, 3120);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C3115s(r11, aVar, function1, str, function12, i11));
        }
    }
}
