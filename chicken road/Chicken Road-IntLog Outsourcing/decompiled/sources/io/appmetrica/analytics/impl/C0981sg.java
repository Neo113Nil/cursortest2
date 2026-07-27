package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981sg {

    /* renamed from: a, reason: collision with root package name */
    public final String f9256a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9257b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9258c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0955rg f9259d;

    public C0981sg(byte[] bArr) {
        C1007tg a6 = C1007tg.a(bArr);
        this.f9256a = a6.f9317a;
        this.f9257b = a6.f9319c;
        this.f9258c = a6.f9318b;
        this.f9259d = a(a6.f9320d);
    }

    public final byte[] a() {
        C1007tg c1007tg = new C1007tg();
        c1007tg.f9317a = this.f9256a;
        c1007tg.f9319c = this.f9257b;
        c1007tg.f9318b = this.f9258c;
        int ordinal = this.f9259d.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 0;
            }
        }
        c1007tg.f9320d = i2;
        return MessageNano.toByteArray(c1007tg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0981sg.class != obj.getClass()) {
            return false;
        }
        C0981sg c0981sg = (C0981sg) obj;
        return this.f9257b == c0981sg.f9257b && this.f9258c == c0981sg.f9258c && this.f9256a.equals(c0981sg.f9256a) && this.f9259d == c0981sg.f9259d;
    }

    public final int hashCode() {
        int hashCode = this.f9256a.hashCode() * 31;
        long j2 = this.f9257b;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j6 = this.f9258c;
        return this.f9259d.hashCode() + ((i2 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f9256a + "', referrerClickTimestampSeconds=" + this.f9257b + ", installBeginTimestampSeconds=" + this.f9258c + ", source=" + this.f9259d + '}';
    }

    public C0981sg(String str, long j2, long j6, EnumC0955rg enumC0955rg) {
        this.f9256a = str;
        this.f9257b = j2;
        this.f9258c = j6;
        this.f9259d = enumC0955rg;
    }

    public static EnumC0955rg a(int i2) {
        if (i2 == 1) {
            return EnumC0955rg.f9174c;
        }
        if (i2 != 2) {
            return EnumC0955rg.f9173b;
        }
        return EnumC0955rg.f9175d;
    }
}
