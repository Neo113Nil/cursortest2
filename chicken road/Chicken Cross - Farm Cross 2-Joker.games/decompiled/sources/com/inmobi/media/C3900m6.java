package com.inmobi.media;

/* renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3900m6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7240a;
    public final int b;
    public final float c;

    public C3900m6(int i, int i2, float f) {
        this.f7240a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3900m6)) {
            return false;
        }
        C3900m6 c3900m6 = (C3900m6) obj;
        return this.f7240a == c3900m6.f7240a && this.b == c3900m6.b && Float.compare(this.c, c3900m6.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + Hj.a(this.b, Integer.hashCode(this.f7240a) * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f7240a + ", height=" + this.b + ", density=" + this.c + ")";
    }
}
