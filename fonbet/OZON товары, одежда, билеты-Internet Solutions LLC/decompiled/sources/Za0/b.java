package Za0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.activity.J;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import bb0.B;
import bb0.G;
import bb0.i;
import bb0.l;
import bb0.x;
import db0.InterfaceC6135a;
import e1.InterfaceC6250b;
import e3.C6285b;
import eb0.C6340a;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import m3.C8060b;
import mf0.InterfaceC8142d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends Ya0.c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35750b = "Host Config";

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f35751c = "HostConfig.NavBar";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<J, InterfaceC8142d, Unit> f35752d = a.f35753b;

    static final class a extends AbstractC7737t implements Function2<J, InterfaceC8142d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f35753b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(J j11, InterfaceC8142d interfaceC8142d) {
            J dispatcher = j11;
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(interfaceC8142d, "<unused var>");
            dispatcher.l();
            return Unit.f71690a;
        }
    }

    @Override // Ya0.c
    protected final void b(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(1158850796);
        interfaceC3967k.o(-698833156);
        z0.b bVar = (z0.b) interfaceC3967k.m(Ia0.c.a());
        interfaceC3967k.B(1729797275);
        B0 a11 = C6616a.a(interfaceC3967k);
        if (a11 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        w0 a12 = C6617b.a(N.b(e.class), a11, null, bVar, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        interfaceC3967k.k();
        e eVar = (e) a12;
        InterfaceC6135a interfaceC6135a = (InterfaceC6135a) C6285b.c(eVar.getState(), interfaceC3967k, 0).getValue();
        if (interfaceC6135a instanceof InterfaceC6135a.C0956a) {
            float f7 = 4;
            androidx.compose.ui.e d11 = a0.d(T.j(androidx.compose.ui.e.f40358c0, 0.0f, f7, 0.0f, 0.0f, 13));
            C5194q a13 = C5193p.a(C5179b.n(f7), InterfaceC6250b.a.k(), interfaceC3967k, 6);
            int I11 = interfaceC3967k.I();
            A0 d12 = interfaceC3967k.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k, d11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a14);
            } else {
                interfaceC3967k.e();
            }
            Function2 c11 = P.c(interfaceC3967k, a13, interfaceC3967k, d12);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                Nk.a.d(c11, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
            InterfaceC6135a.C0956a c0956a = (InterfaceC6135a.C0956a) interfaceC6135a;
            B.a(c0956a.d(), null, interfaceC3967k, 0);
            List<C6340a> b11 = c0956a.b();
            interfaceC3967k.o(1080307035);
            boolean F11 = interfaceC3967k.F(eVar);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new Za0.a(eVar);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            i.a(b11, null, (Function1) C11, interfaceC3967k, 0);
            l.a(c0956a.e(), null, interfaceC3967k, 0);
            G.a(c0956a.a(), null, interfaceC3967k, 0);
            x.a(c0956a.c(), null, interfaceC3967k, 0);
            interfaceC3967k.f();
        }
        interfaceC3967k.k();
    }

    @Override // Ya0.c
    @NotNull
    protected final Function2<J, InterfaceC8142d, Unit> c() {
        return this.f35752d;
    }

    @Override // Ya0.c
    @NotNull
    protected final String d() {
        return this.f35751c;
    }

    @Override // Ya0.c
    @NotNull
    protected final String e() {
        return this.f35750b;
    }
}
