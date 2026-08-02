package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519re {

    /* renamed from: d, reason: collision with root package name */
    public static final C1519re f15321d = new C1519re(1.0f, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f15322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15323b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15324c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C1519re(float f, int i, int i5) {
        this.f15322a = i;
        this.f15323b = i5;
        this.f15324c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1519re) {
            C1519re c1519re = (C1519re) obj;
            if (this.f15322a == c1519re.f15322a && this.f15323b == c1519re.f15323b && this.f15324c == c1519re.f15324c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f15324c) + ((((this.f15322a + 217) * 31) + this.f15323b) * 31);
    }
}
