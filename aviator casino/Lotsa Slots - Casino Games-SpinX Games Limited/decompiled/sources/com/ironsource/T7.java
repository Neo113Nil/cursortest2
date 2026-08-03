package com.ironsource;

/* loaded from: classes5.dex */
public final class T7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5981a;
    private final int b;

    public T7(int i, int i2) {
        this.f5981a = i;
        this.b = i2;
    }

    public final int a() {
        return this.f5981a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.f5981a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.T7)) {
            return false;
        }
        com.ironsource.T7 t7 = (com.ironsource.T7) obj;
        return this.f5981a == t7.f5981a && this.b == t7.b;
    }

    public int hashCode() {
        return (this.f5981a * 31) + this.b;
    }

    public java.lang.String toString() {
        return "ISContainerParams(width=" + this.f5981a + ", height=" + this.b + ")";
    }

    public final com.ironsource.T7 a(int i, int i2) {
        return new com.ironsource.T7(i, i2);
    }

    public static /* synthetic */ com.ironsource.T7 a(com.ironsource.T7 t7, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = t7.f5981a;
        }
        if ((i3 & 2) != 0) {
            i2 = t7.b;
        }
        return t7.a(i, i2);
    }
}
