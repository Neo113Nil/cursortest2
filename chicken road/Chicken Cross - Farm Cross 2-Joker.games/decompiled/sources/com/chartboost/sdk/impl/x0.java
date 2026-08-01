package com.chartboost.sdk.impl;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f5065a;
    public final double b;

    public x0(double d, double d2) {
        this.f5065a = d;
        this.b = d2;
    }

    public final double a() {
        return this.b;
    }

    public final double b() {
        return this.f5065a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Double.compare(this.f5065a, x0Var.f5065a) == 0 && Double.compare(this.b, x0Var.b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f5065a) * 31) + Double.hashCode(this.b);
    }

    public String toString() {
        return "DoubleSize(width=" + this.f5065a + ", height=" + this.b + ")";
    }
}
