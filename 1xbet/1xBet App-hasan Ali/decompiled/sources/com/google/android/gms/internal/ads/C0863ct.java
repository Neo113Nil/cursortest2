package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863ct {

    /* renamed from: a, reason: collision with root package name */
    public final String f13054a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13055b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13056c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13057d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13058e;

    public C0863ct(String str, boolean z3, boolean z5, long j5, long j6) {
        this.f13054a = str;
        this.f13055b = z3;
        this.f13056c = z5;
        this.f13057d = j5;
        this.f13058e = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0863ct)) {
            return false;
        }
        C0863ct c0863ct = (C0863ct) obj;
        return this.f13054a.equals(c0863ct.f13054a) && this.f13055b == c0863ct.f13055b && this.f13056c == c0863ct.f13056c && this.f13057d == c0863ct.f13057d && this.f13058e == c0863ct.f13058e;
    }

    public final int hashCode() {
        return ((((((((((((this.f13054a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f13055b ? 1237 : 1231)) * 1000003) ^ (true != this.f13056c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f13057d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f13058e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f13054a + ", shouldGetAdvertisingId=" + this.f13055b + ", isGooglePlayServicesAvailable=" + this.f13056c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f13057d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f13058e + "}";
    }
}
