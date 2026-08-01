package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Mo {

    /* renamed from: a, reason: collision with root package name */
    public final int f6726a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ Mo() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mo)) {
            return false;
        }
        Mo mo = (Mo) obj;
        return this.f6726a == mo.f6726a && this.b == mo.b && this.c == mo.c && this.d == mo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Hj.a(this.c, Hj.a(this.b, Integer.hashCode(this.f6726a) * 31, 31), 31);
    }

    public final String toString() {
        return "VideoLayoutRect(x=" + this.f6726a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }

    public Mo(int i, int i2, int i3, int i4) {
        this.f6726a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
