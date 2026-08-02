package B0;

import m0.C8006o;
import m0.C8008p;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1347a;

    public static C8006o a(float f7, int i11, float f11) {
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return new C8006o(m0.W0.b(), Float.valueOf(f7), new C8008p(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static C8006o b(C8006o c8006o, float f7, float f11, int i11) {
        if ((i11 & 1) != 0) {
            f7 = ((Number) c8006o.getValue()).floatValue();
        }
        if ((i11 & 2) != 0) {
            f11 = ((C8008p) c8006o.s()).f();
        }
        return new C8006o(c8006o.m(), Float.valueOf(f7), new C8008p(f11), c8006o.k(), c8006o.b(), c8006o.v());
    }

    public static boolean c() {
        return f1347a;
    }

    public static void d(boolean z11) {
        f1347a = z11;
    }

    public static final void e(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException(Cm.e.c("both minLines ", i11, " and maxLines ", " must be greater than zero", i12).toString());
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "minLines ", " must be less than or equal to maxLines ").toString());
        }
    }
}
