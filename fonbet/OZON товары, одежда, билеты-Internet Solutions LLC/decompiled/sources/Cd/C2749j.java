package Cd;

import Hj.C3143a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Cd.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2749j {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4762a;

    private static float a(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float b(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (float) ((Math.pow(f7, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final Sd.c c(Sd.c cVar, String str) {
        Sd.c c11 = cVar.c(Sd.f.f(str));
        Intrinsics.checkNotNullExpressionValue(c11, "child(...)");
        return c11;
    }

    public static final Object d(Ib.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.get();
    }

    public static int e(float f7, int i11, int i12) {
        if (i11 == i12) {
            return i11;
        }
        float f11 = ((i11 >> 24) & 255) / 255.0f;
        float f12 = ((i12 >> 24) & 255) / 255.0f;
        float a11 = a(((i11 >> 16) & 255) / 255.0f);
        float a12 = a(((i11 >> 8) & 255) / 255.0f);
        float a13 = a((i11 & 255) / 255.0f);
        float a14 = a(((i12 >> 16) & 255) / 255.0f);
        float a15 = a(((i12 >> 8) & 255) / 255.0f);
        float a16 = a((i12 & 255) / 255.0f);
        float d11 = C3143a.d(f12, f11, f7, f11);
        float d12 = C3143a.d(a14, a11, f7, a11);
        float d13 = C3143a.d(a15, a12, f7, a12);
        float d14 = C3143a.d(a16, a13, f7, a13);
        float b11 = b(d12) * 255.0f;
        float b12 = b(d13) * 255.0f;
        return Math.round(b(d14) * 255.0f) | (Math.round(b11) << 16) | (Math.round(d11 * 255.0f) << 24) | (Math.round(b12) << 8);
    }

    public static final boolean f() {
        return f4762a;
    }

    public static final void g() {
        f4762a = true;
    }
}
