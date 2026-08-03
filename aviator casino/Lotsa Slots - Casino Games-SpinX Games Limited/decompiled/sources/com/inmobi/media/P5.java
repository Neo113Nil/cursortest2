package com.inmobi.media;

/* loaded from: classes5.dex */
public final class P5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4888a;
    public final int b;
    public final float c;

    public P5(int i, int i2, float f) {
        this.f4888a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.P5)) {
            return false;
        }
        com.inmobi.media.P5 p5 = (com.inmobi.media.P5) obj;
        return this.f4888a == p5.f4888a && this.b == p5.b && java.lang.Float.compare(this.c, p5.c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.c) + com.inmobi.media.AbstractC2755si.a(this.b, this.f4888a * 31, 31);
    }

    public final java.lang.String toString() {
        return "DisplayProperties(width=" + this.f4888a + ", height=" + this.b + ", density=" + this.c + ")";
    }
}
