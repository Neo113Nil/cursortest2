package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class E {
    public static final int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f7203a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;

    public E(int i2, float f, int i3, float f2, float f3, int i4, float f4, float f5) {
        this.f7203a = i2;
        this.b = f;
        this.c = i3;
        this.d = f2;
        this.e = f3;
        this.f = i4;
        this.g = f4;
        this.h = f5;
    }

    public final int a() {
        return this.f7203a;
    }

    public final float b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final float e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.E)) {
            return false;
        }
        com.moloco.sdk.internal.services.E e = (com.moloco.sdk.internal.services.E) obj;
        return this.f7203a == e.f7203a && java.lang.Float.compare(this.b, e.b) == 0 && this.c == e.c && java.lang.Float.compare(this.d, e.d) == 0 && java.lang.Float.compare(this.e, e.e) == 0 && this.f == e.f && java.lang.Float.compare(this.g, e.g) == 0 && java.lang.Float.compare(this.h, e.h) == 0;
    }

    public final int f() {
        return this.f;
    }

    public final float g() {
        return this.g;
    }

    public final float h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((this.f7203a * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + this.f) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h);
    }

    public final float i() {
        return this.e;
    }

    public final int j() {
        return this.f;
    }

    public final float k() {
        return this.d;
    }

    public final int l() {
        return this.c;
    }

    public final float m() {
        return this.b;
    }

    public final int n() {
        return this.f7203a;
    }

    public final float o() {
        return this.g;
    }

    public final float p() {
        return this.h;
    }

    public java.lang.String toString() {
        return "ScreenInfo(screenWidthPx=" + this.f7203a + ", screenWidthDp=" + this.b + ", screenHeightPx=" + this.c + ", screenHeightDp=" + this.d + ", density=" + this.e + ", dpi=" + this.f + ", xdpi=" + this.g + ", ydpi=" + this.h + ')';
    }

    public final com.moloco.sdk.internal.services.E a(int i2, float f, int i3, float f2, float f3, int i4, float f4, float f5) {
        return new com.moloco.sdk.internal.services.E(i2, f, i3, f2, f3, i4, f4, f5);
    }
}
