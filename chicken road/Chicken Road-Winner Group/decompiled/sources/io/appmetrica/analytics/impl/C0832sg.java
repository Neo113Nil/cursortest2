package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832sg {

    /* renamed from: a, reason: collision with root package name */
    public final String f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8309b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8310c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0806rg f8311d;

    public C0832sg(byte[] bArr) {
        C0858tg a3 = C0858tg.a(bArr);
        this.f8308a = a3.f8366a;
        this.f8309b = a3.f8368c;
        this.f8310c = a3.f8367b;
        this.f8311d = a(a3.f8369d);
    }

    public final byte[] a() {
        C0858tg c0858tg = new C0858tg();
        c0858tg.f8366a = this.f8308a;
        c0858tg.f8368c = this.f8309b;
        c0858tg.f8367b = this.f8310c;
        int ordinal = this.f8311d.ordinal();
        int i3 = 1;
        if (ordinal != 1) {
            i3 = 2;
            if (ordinal != 2) {
                i3 = 0;
            }
        }
        c0858tg.f8369d = i3;
        return MessageNano.toByteArray(c0858tg);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0832sg.class == obj.getClass()) {
            C0832sg c0832sg = (C0832sg) obj;
            if (this.f8309b == c0832sg.f8309b && this.f8310c == c0832sg.f8310c && this.f8308a.equals(c0832sg.f8308a) && this.f8311d == c0832sg.f8311d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8308a.hashCode() * 31;
        long j3 = this.f8309b;
        int i3 = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f8310c;
        return this.f8311d.hashCode() + ((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f8308a + "', referrerClickTimestampSeconds=" + this.f8309b + ", installBeginTimestampSeconds=" + this.f8310c + ", source=" + this.f8311d + '}';
    }

    public C0832sg(String str, long j3, long j4, EnumC0806rg enumC0806rg) {
        this.f8308a = str;
        this.f8309b = j3;
        this.f8310c = j4;
        this.f8311d = enumC0806rg;
    }

    public static EnumC0806rg a(int i3) {
        if (i3 == 1) {
            return EnumC0806rg.f8230c;
        }
        if (i3 != 2) {
            return EnumC0806rg.f8229b;
        }
        return EnumC0806rg.f8231d;
    }
}
