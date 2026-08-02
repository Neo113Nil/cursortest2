package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f3318a;
    public final float b;
    public final float c;
    public final float d;

    public l(float f, float f2, float f3, float f4) {
        this.c = f;
        this.f3318a = f2;
        this.d = f3;
        this.b = f4;
    }

    public static double a(com.dyneti.android.dyscan.l lVar, com.dyneti.android.dyscan.l lVar2) {
        float f = lVar.b;
        float f2 = lVar.f3318a;
        double d = (lVar.d - lVar.c) * (f - f2);
        if (d <= 0.0d) {
            return 0.0d;
        }
        float f3 = lVar2.b;
        float f4 = lVar2.f3318a;
        double d2 = (lVar2.d - lVar2.c) * (f3 - f4);
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        float max = java.lang.Math.max(f2, f4);
        float max2 = java.lang.Math.max(lVar.c, lVar2.c);
        float min = java.lang.Math.min(lVar.b, lVar2.b);
        double max3 = java.lang.Math.max(min - max, 0.0d) * java.lang.Math.max(java.lang.Math.min(lVar.d, lVar2.d) - max2, 0.0d);
        return max3 / ((d + d2) - max3);
    }
}
