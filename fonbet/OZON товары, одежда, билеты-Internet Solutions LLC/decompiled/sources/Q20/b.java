package Q20;

import D1.InterfaceC2801g;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.core.ui.widgets.text.TextKt;
import u0.E;
import y20.C10833a;

/* loaded from: classes3.dex */
public final class b {
    public static final void a(@NotNull a stub, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(stub, "stub");
        interfaceC3967k.o(1684848853);
        e.a aVar = e.f40358c0;
        float f7 = 16;
        e h11 = T.h(a0.d(aVar), f7, 0.0f, 2);
        C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), interfaceC3967k, 54);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, h11);
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
        Function2 c11 = P.c(interfaceC3967k, a11, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            Nk.a.d(c11, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        TextKt.m1643Text4IGK_g(stub.b(), null, C10833a.a(interfaceC3967k).l(), 0L, null, null, null, 0L, null, h.a(3), 0L, 0, false, 0, 0, null, C10833a.b().f(), interfaceC3967k, 0, 1572864, 65018);
        E.a(interfaceC3967k, a0.f(aVar, f7));
        interfaceC3967k.o(370660681);
        if (stub.a() != null) {
            TextKt.m1643Text4IGK_g(stub.a(), null, C10833a.a(interfaceC3967k).m(), 0L, null, null, null, 0L, null, h.a(3), 0L, 0, false, 0, 0, null, C10833a.b().d(), interfaceC3967k, 0, 1572864, 65018);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        interfaceC3967k.k();
    }
}
