package A0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final g f161a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f162b = 0;

    static {
        b a11 = c.a();
        f161a = new g(a11, a11, a11, a11);
    }

    @NotNull
    public static final g a(float f7) {
        f fVar = new f(f7);
        return new g(fVar, fVar, fVar, fVar);
    }

    @NotNull
    public static final g b(float f7) {
        d dVar = new d(f7);
        return new g(dVar, dVar, dVar, dVar);
    }

    @NotNull
    public static final g c(float f7, float f11, float f12, float f13) {
        return new g(new d(f7), new d(f11), new d(f12), new d(f13));
    }

    public static g d(float f7, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f7 = 0;
        }
        if ((i11 & 2) != 0) {
            f11 = 0;
        }
        if ((i11 & 4) != 0) {
            f12 = 0;
        }
        if ((i11 & 8) != 0) {
            f13 = 0;
        }
        return c(f7, f11, f12, f13);
    }

    @NotNull
    public static final g e() {
        return f161a;
    }
}
