package J0;

import S0.InterfaceC3967k;
import b1.C5503f;
import b1.C5516s;
import b1.C5517t;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    private static final float f13004a = 56;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13005b = 400;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final m0.T0<Float> f13006c = new m0.T0<>(256, (m0.E) null, 6);

    @NotNull
    public static final W d(@NotNull X x11, InterfaceC3967k interfaceC3967k) {
        Q q11 = Q.f12945b;
        Object[] objArr = new Object[0];
        C5517t a11 = C5516s.a(U.f13010b, new V(q11));
        boolean n11 = interfaceC3967k.n(q11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new S(x11, q11);
            interfaceC3967k.x(C11);
        }
        return (W) C5503f.c(objArr, a11, (Function0) C11, interfaceC3967k, 0, 4);
    }
}
