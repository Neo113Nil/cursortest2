package com.inmobi.media;

/* renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4175w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7448a;
    public final int b;

    public C4175w1(int i, int i2) {
        this.f7448a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4175w1)) {
            return false;
        }
        C4175w1 c4175w1 = (C4175w1) obj;
        return this.f7448a == c4175w1.f7448a && this.b == c4175w1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7448a) * 31);
    }

    public final String toString() {
        return "BannerSize(widthDp=" + this.f7448a + ", heightDp=" + this.b + ")";
    }
}
