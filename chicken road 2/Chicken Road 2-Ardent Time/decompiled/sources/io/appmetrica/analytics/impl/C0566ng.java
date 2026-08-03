package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566ng {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6534b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6535c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.EnumC0540mg f6536d;

    public C0566ng(byte[] bArr) {
        io.appmetrica.analytics.impl.C0592og a2 = io.appmetrica.analytics.impl.C0592og.a(bArr);
        this.f6533a = a2.f6592a;
        this.f6534b = a2.f6594c;
        this.f6535c = a2.f6593b;
        this.f6536d = a(a2.f6595d);
    }

    public final byte[] a() {
        io.appmetrica.analytics.impl.C0592og c0592og = new io.appmetrica.analytics.impl.C0592og();
        c0592og.f6592a = this.f6533a;
        c0592og.f6594c = this.f6534b;
        c0592og.f6593b = this.f6535c;
        int ordinal = this.f6536d.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 0;
            }
        }
        c0592og.f6595d = i2;
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(c0592og);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.C0566ng.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0566ng c0566ng = (io.appmetrica.analytics.impl.C0566ng) obj;
        return this.f6534b == c0566ng.f6534b && this.f6535c == c0566ng.f6535c && this.f6533a.equals(c0566ng.f6533a) && this.f6536d == c0566ng.f6536d;
    }

    public final int hashCode() {
        int hashCode = this.f6533a.hashCode() * 31;
        long j2 = this.f6534b;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f6535c;
        return this.f6536d.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final java.lang.String toString() {
        return "ReferrerInfo{installReferrer='" + this.f6533a + "', referrerClickTimestampSeconds=" + this.f6534b + ", installBeginTimestampSeconds=" + this.f6535c + ", source=" + this.f6536d + '}';
    }

    public C0566ng(java.lang.String str, long j2, long j3, io.appmetrica.analytics.impl.EnumC0540mg enumC0540mg) {
        this.f6533a = str;
        this.f6534b = j2;
        this.f6535c = j3;
        this.f6536d = enumC0540mg;
    }

    public static io.appmetrica.analytics.impl.EnumC0540mg a(int i2) {
        if (i2 == 1) {
            return io.appmetrica.analytics.impl.EnumC0540mg.f6429c;
        }
        if (i2 != 2) {
            return io.appmetrica.analytics.impl.EnumC0540mg.f6428b;
        }
        return io.appmetrica.analytics.impl.EnumC0540mg.f6430d;
    }
}
