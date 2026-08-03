package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682s3 implements io.appmetrica.analytics.impl.Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0656r3 f6789a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f6790b;

    public C0682s3(io.appmetrica.analytics.impl.C0656r3 c0656r3, java.util.List<io.appmetrica.analytics.impl.C0656r3> list) {
        this.f6789a = c0656r3;
        this.f6790b = list;
    }

    public final io.appmetrica.analytics.impl.C0682s3 a(io.appmetrica.analytics.impl.C0656r3 c0656r3, java.util.List<io.appmetrica.analytics.impl.C0656r3> list) {
        return new io.appmetrica.analytics.impl.C0682s3(c0656r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final java.lang.Object b() {
        return this.f6789a;
    }

    public final io.appmetrica.analytics.impl.C0656r3 c() {
        return this.f6789a;
    }

    public final java.util.List<io.appmetrica.analytics.impl.C0656r3> d() {
        return this.f6790b;
    }

    public final io.appmetrica.analytics.impl.C0656r3 e() {
        return this.f6789a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0682s3)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0682s3 c0682s3 = (io.appmetrica.analytics.impl.C0682s3) obj;
        return kotlin.jvm.internal.i.a(this.f6789a, c0682s3.f6789a) && kotlin.jvm.internal.i.a(this.f6790b, c0682s3.f6790b);
    }

    public final int hashCode() {
        return this.f6790b.hashCode() + (this.f6789a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ClidsInfo(chosen=" + this.f6789a + ", candidates=" + this.f6790b + ')';
    }

    public static io.appmetrica.analytics.impl.C0682s3 a(io.appmetrica.analytics.impl.C0682s3 c0682s3, io.appmetrica.analytics.impl.C0656r3 c0656r3, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            c0656r3 = c0682s3.f6789a;
        }
        if ((i2 & 2) != 0) {
            list = c0682s3.f6790b;
        }
        c0682s3.getClass();
        return new io.appmetrica.analytics.impl.C0682s3(c0656r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final java.util.List<io.appmetrica.analytics.impl.C0656r3> a() {
        return this.f6790b;
    }
}
