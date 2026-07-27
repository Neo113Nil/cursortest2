package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5901b;

    public E7(int i3, long j3) {
        this.f5900a = j3;
        this.f5901b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e7 = (E7) obj;
        return this.f5900a == e7.f5900a && this.f5901b == e7.f5901b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5901b) + (Long.hashCode(this.f5900a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f5900a + ", exponent=" + this.f5901b + ')';
    }
}
