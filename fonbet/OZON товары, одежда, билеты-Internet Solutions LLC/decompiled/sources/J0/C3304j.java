package J0;

import S0.InterfaceC3967k;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import u0.C9915y;

/* renamed from: J0.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3304j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9915y f13241a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f13242b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13243c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C9915y f13244d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13245e = 0;

    static {
        float f7 = 16;
        float f11 = 8;
        C9915y c9915y = new C9915y(f7, f11, f7, f11);
        f13241a = c9915y;
        f13242b = 64;
        f13243c = 36;
        f13244d = new C9915y(f11, c9915y.d(), f11, c9915y.a());
    }

    @NotNull
    public static C9915y a() {
        return f13241a;
    }

    public static float b() {
        return f13243c;
    }

    public static float c() {
        return f13242b;
    }

    @NotNull
    public static C9915y d() {
        return f13244d;
    }

    @NotNull
    public static InterfaceC3300i e(long j11, InterfaceC3967k interfaceC3967k, int i11) {
        long j12;
        j12 = C7807Z.f72258l;
        if ((i11 & 2) != 0) {
            j11 = ((C3339s) interfaceC3967k.m(C3343t.d())).h();
        }
        return new C3367z(j12, j11, j12, C7807Z.o(Bl0.k0.p(interfaceC3967k, 6), ((C3339s) interfaceC3967k.m(C3343t.d())).g()));
    }
}
