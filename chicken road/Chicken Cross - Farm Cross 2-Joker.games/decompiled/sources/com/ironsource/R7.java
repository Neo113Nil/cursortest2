package com.ironsource;

/* loaded from: classes6.dex */
public final class R7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7871a;
    private final int b;

    public R7(int i, int i2) {
        this.f7871a = i;
        this.b = i2;
    }

    public final int a() {
        return this.f7871a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.f7871a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R7)) {
            return false;
        }
        R7 r7 = (R7) obj;
        return this.f7871a == r7.f7871a && this.b == r7.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f7871a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "ISContainerParams(width=" + this.f7871a + ", height=" + this.b + ")";
    }

    public final R7 a(int i, int i2) {
        return new R7(i, i2);
    }

    public static /* synthetic */ R7 a(R7 r7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = r7.f7871a;
        }
        if ((i3 & 2) != 0) {
            i2 = r7.b;
        }
        return r7.a(i, i2);
    }
}
