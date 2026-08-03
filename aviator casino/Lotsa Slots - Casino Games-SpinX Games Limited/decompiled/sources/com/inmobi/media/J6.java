package com.inmobi.media;

/* loaded from: classes5.dex */
public final class J6 {

    /* renamed from: a, reason: collision with root package name */
    public final float f4776a;
    public final float b;
    public final int c;
    public final int d;

    public J6(float f, float f2, int i, int i2) {
        this.f4776a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.J6)) {
            return false;
        }
        com.inmobi.media.J6 j6 = (com.inmobi.media.J6) obj;
        return java.lang.Float.compare(this.f4776a, j6.f4776a) == 0 && java.lang.Float.compare(this.b, j6.b) == 0 && this.c == j6.c && this.d == j6.d;
    }

    public final int hashCode() {
        return this.d + com.inmobi.media.AbstractC2755si.a(this.c, (java.lang.Float.floatToIntBits(this.b) + (java.lang.Float.floatToIntBits(this.f4776a) * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "ExposureRectangle(x=" + this.f4776a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
