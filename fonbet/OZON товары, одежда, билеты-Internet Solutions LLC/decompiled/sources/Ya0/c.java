package Ya0;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.activity.J;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import ff0.C6554a;
import hb0.C6905a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import mf0.InterfaceC8142d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.navBar.OziNavBarKt;

/* loaded from: classes3.dex */
public abstract class c extends Ze0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<J, InterfaceC8142d, Unit> f34888a = a.f34889b;

    static final class a extends AbstractC7737t implements Function2<J, InterfaceC8142d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34889b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(J j11, InterfaceC8142d interfaceC8142d) {
            InterfaceC8142d router = interfaceC8142d;
            Intrinsics.checkNotNullParameter(j11, "<unused var>");
            Intrinsics.checkNotNullParameter(router, "router");
            router.a();
            return Unit.f71690a;
        }
    }

    @Override // Ze0.a
    public final void a(InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.o(-1134146514);
        J j11 = (J) interfaceC3967k.m(C6905a.a());
        InterfaceC8142d interfaceC8142d = (InterfaceC8142d) interfaceC3967k.m(C6554a.a());
        e d11 = a0.d(z.c(e.f40358c0, z.b(interfaceC3967k), 14));
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), interfaceC3967k, 48);
        int I11 = interfaceC3967k.I();
        A0 d12 = interfaceC3967k.d();
        e f7 = androidx.compose.ui.c.f(interfaceC3967k, d11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a12);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d12);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f7, InterfaceC2801g.a.f());
        OziNavBarKt.m3111OziNavBarFJfuzF0(a1.c.c(-400564331, new b(this, j11, interfaceC8142d), interfaceC3967k), null, null, false, 0.0f, interfaceC3967k, 6, 30);
        b(interfaceC3967k);
        interfaceC3967k.f();
        interfaceC3967k.k();
    }

    protected abstract void b(InterfaceC3967k interfaceC3967k);

    @NotNull
    protected abstract Function2<J, InterfaceC8142d, Unit> c();

    @NotNull
    protected abstract String d();

    @NotNull
    protected abstract String e();
}
