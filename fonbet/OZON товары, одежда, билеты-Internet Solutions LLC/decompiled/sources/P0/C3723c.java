package P0;

import S0.InterfaceC3967k;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: P0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3723c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9915y f20986a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C9915y f20987b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f20988c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f20989d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20990e = 0;

    static {
        float f7 = 24;
        float f11 = 8;
        C9915y c9915y = new C9915y(f7, f11, f7, f11);
        f20986a = c9915y;
        float f12 = 16;
        new C9915y(f12, f11, f7, f11);
        float f13 = 12;
        f20987b = new C9915y(f13, c9915y.d(), f13, c9915y.a());
        new C9915y(f13, c9915y.d(), f12, c9915y.a());
        f20988c = 58;
        f20989d = 40;
        int i11 = R0.e.f23976k;
    }

    @NotNull
    public static C3720b a(InterfaceC3967k interfaceC3967k) {
        C3756n c3756n = (C3756n) interfaceC3967k.m(C3759o.d());
        C3720b c11 = c3756n.c();
        if (c11 != null) {
            return c11;
        }
        C3720b c3720b = new C3720b(C3759o.c(c3756n, R0.f.a()), C3759o.c(c3756n, R0.f.g()), C7807Z.o(0.12f, C3759o.c(c3756n, R0.f.c())), C7807Z.o(0.38f, C3759o.c(c3756n, R0.f.d())));
        c3756n.R(c3720b);
        return c3720b;
    }

    @NotNull
    public static C9915y b() {
        return f20986a;
    }

    @NotNull
    public static C3720b c(@NotNull C3756n c3756n) {
        C3720b b11 = c3756n.b();
        if (b11 != null) {
            return b11;
        }
        C3720b c3720b = new C3720b(C3759o.c(c3756n, R0.e.a()), C3759o.c(c3756n, R0.e.i()), C7807Z.o(0.12f, C3759o.c(c3756n, R0.e.d())), C7807Z.o(0.38f, C3759o.c(c3756n, R0.e.f())));
        c3756n.Q(c3720b);
        return c3720b;
    }

    public static float d() {
        return f20989d;
    }

    public static float e() {
        return f20988c;
    }

    @NotNull
    public static C9915y f() {
        return f20987b;
    }
}
