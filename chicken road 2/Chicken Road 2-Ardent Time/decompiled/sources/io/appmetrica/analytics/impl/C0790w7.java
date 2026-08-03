package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790w7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7004b;

    public C0790w7(long j2, int i2) {
        this.f7003a = j2;
        this.f7004b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0790w7)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0790w7 c0790w7 = (io.appmetrica.analytics.impl.C0790w7) obj;
        return this.f7003a == c0790w7.f7003a && this.f7004b == c0790w7.f7004b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f7004b) + (java.lang.Long.hashCode(this.f7003a) * 31);
    }

    public final java.lang.String toString() {
        return "DecimalProtoModel(mantissa=" + this.f7003a + ", exponent=" + this.f7004b + ')';
    }
}
