package com.chartboost.sdk.impl;

/* loaded from: classes4.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4991a;
    public final int b;

    public r6(int i, int i2) {
        this.f4991a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.f4991a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.f4991a == r6Var.f4991a && this.b == r6Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f4991a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "DisplaySize(width=" + this.f4991a + ", height=" + this.b + ")";
    }
}
