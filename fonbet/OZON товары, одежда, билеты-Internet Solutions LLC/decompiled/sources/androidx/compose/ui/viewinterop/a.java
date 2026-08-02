package androidx.compose.ui.viewinterop;

import Bl0.C2652m;
import D1.H;
import D1.InterfaceC2801g;
import D1.x0;
import S0.A;
import S0.A0;
import S0.AbstractC3984t;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Z1.s;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.J;
import b1.C5514q;
import b1.InterfaceC5512o;
import c2.C5728b;
import c2.C5732f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<View, Unit> f41139a = h.f41157b;

    /* renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    static final class C0751a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f41140b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f41141c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f41142d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f41143e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f41144f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0751a(Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, Unit> function12, int i11, int i12) {
            super(2);
            this.f41140b = function1;
            this.f41141c = eVar;
            this.f41142d = function12;
            this.f41143e = i11;
            this.f41144f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f41143e | 1);
            Function1<Context, T> function1 = this.f41140b;
            a.a(function1, this.f41141c, this.f41142d, interfaceC3967k, e11, this.f41144f);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends AbstractC7737t implements Function2<H, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f41145b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Object obj) {
            a.c(h11).D((Function1) obj);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class c<T> extends AbstractC7737t implements Function2<H, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f41146b = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Object obj) {
            a.c(h11).E((Function1) obj);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class d<T> extends AbstractC7737t implements Function2<H, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f41147b = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Object obj) {
            a.c(h11).C((Function1) obj);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class e<T> extends AbstractC7737t implements Function2<H, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f41148b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Object obj) {
            a.c(h11).E((Function1) obj);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class f<T> extends AbstractC7737t implements Function2<H, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f41149b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Object obj) {
            a.c(h11).C((Function1) obj);
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f41150b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f41151c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f41152d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f41153e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f41154f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f41155g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f41156h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Function1<? super T, Unit> function14, int i11, int i12) {
            super(2);
            this.f41150b = function1;
            this.f41151c = eVar;
            this.f41152d = function12;
            this.f41153e = function13;
            this.f41154f = function14;
            this.f41155g = i11;
            this.f41156h = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f41155g | 1);
            Function1<T, Unit> function1 = this.f41152d;
            a.b(this.f41150b, this.f41151c, function1, this.f41153e, this.f41154f, interfaceC3967k, e11, this.f41156h);
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f41157b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(View view) {
            return Unit.f71690a;
        }
    }

    static final class i extends AbstractC7737t implements Function0<H> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f41158b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f41159c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC3984t f41160d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5512o f41161e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f41162f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f41163g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, Function1<? super Context, ? extends T> function1, AbstractC3984t abstractC3984t, InterfaceC5512o interfaceC5512o, int i11, View view) {
            super(0);
            this.f41158b = context;
            this.f41159c = function1;
            this.f41160d = abstractC3984t;
            this.f41161e = interfaceC5512o;
            this.f41162f = i11;
            this.f41163g = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final H invoke() {
            KeyEvent.Callback callback = this.f41163g;
            Intrinsics.g(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            x0 x0Var = (x0) callback;
            return new C5732f(this.f41158b, this.f41159c, this.f41160d, this.f41161e, this.f41162f, x0Var).l();
        }
    }

    static final class j extends AbstractC7737t implements Function2<H, androidx.compose.ui.e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f41164b = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, androidx.compose.ui.e eVar) {
            a.c(h11).r(eVar);
            return Unit.f71690a;
        }
    }

    static final class k extends AbstractC7737t implements Function2<H, Z1.d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f41165b = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, Z1.d dVar) {
            a.c(h11).p(dVar);
            return Unit.f71690a;
        }
    }

    static final class l extends AbstractC7737t implements Function2<H, J, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f41166b = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, J j11) {
            a.c(h11).q(j11);
            return Unit.f71690a;
        }
    }

    static final class m extends AbstractC7737t implements Function2<H, M4.e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f41167b = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, M4.e eVar) {
            a.c(h11).v(eVar);
            return Unit.f71690a;
        }
    }

    static final class n extends AbstractC7737t implements Function2<H, s, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f41168b = new n(2);

        /* renamed from: androidx.compose.ui.viewinterop.a$n$a, reason: collision with other inner class name */
        public /* synthetic */ class C0752a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f41169a;

            static {
                int[] iArr = new int[s.values().length];
                try {
                    iArr[s.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41169a = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(H h11, s sVar) {
            C5732f c11 = a.c(h11);
            int i11 = C0752a.f41169a[sVar.ordinal()];
            int i12 = 1;
            if (i11 == 1) {
                i12 = 0;
            } else if (i11 != 2) {
                throw new o();
            }
            c11.setLayoutDirection(i12);
            return Unit.f71690a;
        }
    }

    public static final <T extends View> void a(@NotNull Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super Context, ? extends T> function13;
        androidx.compose.ui.e eVar2;
        Function1<? super T, Unit> function14;
        C3969l u11 = interfaceC3967k.u(-1783766393);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(function1) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            function14 = function12;
            eVar2 = eVar;
            function13 = function1;
        } else {
            if (i14 != 0) {
                eVar = androidx.compose.ui.e.f40358c0;
            }
            androidx.compose.ui.e eVar3 = eVar;
            Function1<View, Unit> function15 = f41139a;
            Function1<? super T, Unit> function16 = i15 != 0 ? function15 : function12;
            b(function1, eVar3, null, function15, function16, u11, (i13 & 14) | 3072 | (i13 & 112) | (57344 & (i13 << 6)), 4);
            function13 = function1;
            eVar2 = eVar3;
            function14 = function16;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C0751a(function13, eVar2, function14, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends View> void b(@NotNull Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Function1<? super T, Unit> function14, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super T, Unit> function15;
        int i14;
        Function1<? super T, Unit> function16;
        Function1<? super T, Unit> function17;
        Function1<? super T, Unit> function18;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-180024211);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(function1) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function15 = function12;
            i13 |= u11.F(function15) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                function16 = function13;
                i13 |= u11.F(function16) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i11 & 24576) == 0) {
                    i13 |= u11.F(function14) ? 16384 : 8192;
                }
                if ((i13 & 9363) == 9362 || !u11.b()) {
                    function17 = i15 != 0 ? null : function15;
                    function18 = f41139a;
                    if (i14 == 0) {
                        function18 = function16;
                    }
                    int I11 = u11.I();
                    androidx.compose.ui.e l02 = eVar.l0(FocusGroupPropertiesElement.f41137a);
                    FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.f40387a;
                    androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, l02.l0(focusTargetElement).l0(FocusTargetPropertiesElement.f41138a).l0(focusTargetElement));
                    Z1.d dVar = (Z1.d) u11.m(K0.e());
                    s sVar = (s) u11.m(K0.k());
                    A0 d11 = u11.d();
                    J j11 = (J) u11.m(r.a());
                    M4.e eVar2 = (M4.e) u11.m(AndroidCompositionLocals_androidKt.g());
                    if (function17 != null) {
                        u11.o(607871394);
                        Function0<H> d12 = d(function1, u11, i13 & 14);
                        u11.i();
                        if (u11.t()) {
                            u11.H(d12);
                        } else {
                            u11.e();
                        }
                        f(u11, f7, I11, dVar, j11, eVar2, sVar, d11);
                        F1.b(u11, function17, b.f41145b);
                        F1.b(u11, function14, c.f41146b);
                        F1.b(u11, function18, d.f41147b);
                        u11.f();
                        u11.k();
                    } else {
                        u11.o(608726777);
                        Function0<H> d13 = d(function1, u11, i13 & 14);
                        u11.S0();
                        if (u11.t()) {
                            u11.H(d13);
                        } else {
                            u11.e();
                        }
                        f(u11, f7, I11, dVar, j11, eVar2, sVar, d11);
                        F1.b(u11, function14, e.f41148b);
                        F1.b(u11, function18, f.f41149b);
                        u11.f();
                        u11.k();
                    }
                } else {
                    u11.j();
                    function17 = function15;
                    function18 = function16;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new g(function1, eVar, function17, function18, function14, i11, i12));
                    return;
                }
                return;
            }
            function16 = function13;
            if ((i11 & 24576) == 0) {
            }
            if ((i13 & 9363) == 9362) {
            }
            if (i15 != 0) {
            }
            function18 = f41139a;
            if (i14 == 0) {
            }
            int I112 = u11.I();
            androidx.compose.ui.e l022 = eVar.l0(FocusGroupPropertiesElement.f41137a);
            FocusTargetNode.FocusTargetElement focusTargetElement2 = FocusTargetNode.FocusTargetElement.f40387a;
            androidx.compose.ui.e f72 = androidx.compose.ui.c.f(u11, l022.l0(focusTargetElement2).l0(FocusTargetPropertiesElement.f41138a).l0(focusTargetElement2));
            Z1.d dVar2 = (Z1.d) u11.m(K0.e());
            s sVar2 = (s) u11.m(K0.k());
            A0 d112 = u11.d();
            J j112 = (J) u11.m(r.a());
            M4.e eVar22 = (M4.e) u11.m(AndroidCompositionLocals_androidKt.g());
            if (function17 != null) {
            }
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        function15 = function12;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        function16 = function13;
        if ((i11 & 24576) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        if (i15 != 0) {
        }
        function18 = f41139a;
        if (i14 == 0) {
        }
        int I1122 = u11.I();
        androidx.compose.ui.e l0222 = eVar.l0(FocusGroupPropertiesElement.f41137a);
        FocusTargetNode.FocusTargetElement focusTargetElement22 = FocusTargetNode.FocusTargetElement.f40387a;
        androidx.compose.ui.e f722 = androidx.compose.ui.c.f(u11, l0222.l0(focusTargetElement22).l0(FocusTargetPropertiesElement.f41138a).l0(focusTargetElement22));
        Z1.d dVar22 = (Z1.d) u11.m(K0.e());
        s sVar22 = (s) u11.m(K0.k());
        A0 d1122 = u11.d();
        J j1122 = (J) u11.m(r.a());
        M4.e eVar222 = (M4.e) u11.m(AndroidCompositionLocals_androidKt.g());
        if (function17 != null) {
        }
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final C5732f c(H h11) {
        C5728b L11 = h11.L();
        if (L11 != null) {
            return (C5732f) L11;
        }
        A1.a.c("Required value was null.");
        throw null;
    }

    private static final <T extends View> Function0<H> d(Function1<? super Context, ? extends T> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int I11 = interfaceC3967k.I();
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        AbstractC3984t l11 = interfaceC3967k.l();
        InterfaceC5512o interfaceC5512o = (InterfaceC5512o) interfaceC3967k.m(C5514q.b());
        View view = (View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h());
        boolean F11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(function1)) || (i11 & 6) == 4) | interfaceC3967k.F(context) | interfaceC3967k.F(l11) | interfaceC3967k.F(interfaceC5512o) | interfaceC3967k.r(I11) | interfaceC3967k.F(view);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new i(context, function1, l11, interfaceC5512o, I11, view);
            interfaceC3967k.x(C11);
        }
        return (Function0) C11;
    }

    @NotNull
    public static final Function1<View, Unit> e() {
        return f41139a;
    }

    private static final <T extends View> void f(InterfaceC3967k interfaceC3967k, androidx.compose.ui.e eVar, int i11, Z1.d dVar, J j11, M4.e eVar2, s sVar, A a11) {
        InterfaceC2801g.f5440U.getClass();
        F1.b(interfaceC3967k, a11, InterfaceC2801g.a.g());
        F1.b(interfaceC3967k, eVar, j.f41164b);
        F1.b(interfaceC3967k, dVar, k.f41165b);
        F1.b(interfaceC3967k, j11, l.f41166b);
        F1.b(interfaceC3967k, eVar2, m.f41167b);
        F1.b(interfaceC3967k, sVar, n.f41168b);
        Function2 b11 = InterfaceC2801g.a.b();
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(i11))) {
            Nk.a.d(b11, i11, interfaceC3967k, i11);
        }
    }
}
