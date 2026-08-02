package Zi0;

import P0.C3756n;
import P0.C3759o;
import S0.B1;
import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import a1.C4912a;
import aj0.C5030b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final B1 f36005a = new B1(C0684a.f36006b);

    /* renamed from: Zi0.a$a, reason: collision with other inner class name */
    static final class C0684a extends AbstractC7737t implements Function0<aj0.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0684a f36006b = new C0684a(0);

        @Override // kotlin.jvm.functions.Function0
        public final aj0.d invoke() {
            return aj0.c.f36829a;
        }
    }

    public static final void a(boolean z11, @NotNull C4912a content, InterfaceC3967k interfaceC3967k, int i11) {
        boolean a11;
        C3756n f7;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(206431831);
        if (((i11 | 2) & 19) == 18 && u11.b()) {
            u11.j();
            a11 = z11;
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                a11 = p.a(u11);
            } else {
                u11.j();
                a11 = z11;
            }
            u11.j0();
            if (a11) {
                int i12 = C3759o.f21264c;
                long t2 = R0.a.t();
                f7 = new C3756n(t2, R0.a.j(), R0.a.u(), R0.a.k(), R0.a.e(), R0.a.w(), R0.a.l(), R0.a.x(), R0.a.m(), R0.a.H(), R0.a.p(), R0.a.I(), R0.a.q(), R0.a.a(), R0.a.g(), R0.a.y(), R0.a.n(), R0.a.G(), R0.a.o(), t2, R0.a.f(), R0.a.d(), R0.a.b(), R0.a.h(), R0.a.c(), R0.a.i(), R0.a.r(), R0.a.s(), R0.a.v(), R0.a.z(), R0.a.F(), R0.a.A(), R0.a.B(), R0.a.C(), R0.a.D(), R0.a.E());
            } else {
                f7 = C3759o.f();
            }
            C3996z.a(f36005a.c(a11 ? C5030b.f36821a : aj0.c.f36829a), a1.c.c(274708887, new c(f7, content), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(a11, content, i11));
        }
    }

    @NotNull
    public static final B1 b() {
        return f36005a;
    }
}
