package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656r3 implements io.appmetrica.analytics.impl.T7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f6715a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S7 f6716b;

    public C0656r3(java.util.Map<java.lang.String, java.lang.String> map, io.appmetrica.analytics.impl.S7 s7) {
        this.f6715a = map;
        this.f6716b = s7;
    }

    public final io.appmetrica.analytics.impl.C0656r3 a(java.util.Map<java.lang.String, java.lang.String> map, io.appmetrica.analytics.impl.S7 s7) {
        return new io.appmetrica.analytics.impl.C0656r3(map, s7);
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        return this.f6715a;
    }

    public final io.appmetrica.analytics.impl.S7 c() {
        return this.f6716b;
    }

    public final java.util.Map<java.lang.String, java.lang.String> d() {
        return this.f6715a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0656r3)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0656r3 c0656r3 = (io.appmetrica.analytics.impl.C0656r3) obj;
        return kotlin.jvm.internal.i.a(this.f6715a, c0656r3.f6715a) && this.f6716b == c0656r3.f6716b;
    }

    public final int hashCode() {
        java.util.Map map = this.f6715a;
        return this.f6716b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "Candidate(clids=" + this.f6715a + ", source=" + this.f6716b + ')';
    }

    public static io.appmetrica.analytics.impl.C0656r3 a(io.appmetrica.analytics.impl.C0656r3 c0656r3, java.util.Map map, io.appmetrica.analytics.impl.S7 s7, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            map = c0656r3.f6715a;
        }
        if ((i2 & 2) != 0) {
            s7 = c0656r3.f6716b;
        }
        c0656r3.getClass();
        return new io.appmetrica.analytics.impl.C0656r3(map, s7);
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final io.appmetrica.analytics.impl.S7 a() {
        return this.f6716b;
    }
}
