package a1;

import S0.I0;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.InterfaceC4003e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object f36179a = new Object();

    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    @NotNull
    public static final C4912a b(@NotNull Function2 function2, @NotNull InterfaceC3967k interfaceC3967k, int i11) {
        C4912a c4912a;
        interfaceC3967k.G(Integer.rotateLeft(i11, 1), f36179a);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            c4912a = new C4912a(true, i11, function2);
            interfaceC3967k.x(c4912a);
        } else {
            Intrinsics.g(C11, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            c4912a = (C4912a) C11;
            c4912a.j(function2);
        }
        interfaceC3967k.J();
        return c4912a;
    }

    @NotNull
    public static final C4912a c(int i11, @NotNull InterfaceC4003e interfaceC4003e, InterfaceC3967k interfaceC3967k) {
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new C4912a(true, i11, interfaceC4003e);
            interfaceC3967k.x(C11);
        }
        C4912a c4912a = (C4912a) C11;
        c4912a.j(interfaceC4003e);
        return c4912a;
    }

    public static final boolean d(I0 i02, @NotNull I0 i03) {
        if (i02 == null) {
            return true;
        }
        if (!(i02 instanceof J0) || !(i03 instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) i02;
        return !j02.p() || i02.equals(i03) || Intrinsics.d(j02.h(), ((J0) i03).h());
    }
}
