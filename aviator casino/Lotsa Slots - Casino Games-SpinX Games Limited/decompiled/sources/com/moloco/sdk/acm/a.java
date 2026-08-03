package com.moloco.sdk.acm;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6872a;
    public java.lang.String b;
    public long c;
    public final java.util.Map<java.lang.String, java.lang.String> d;

    public a(java.lang.String appId, java.lang.String postAnalyticsUrl, long j, java.util.Map<java.lang.String, java.lang.String> clientOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.f6872a = appId;
        this.b = postAnalyticsUrl;
        this.c = j;
        this.d = clientOptions;
    }

    public final java.lang.String a() {
        return this.f6872a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final java.util.Map<java.lang.String, java.lang.String> d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.f6872a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.acm.a)) {
            return false;
        }
        com.moloco.sdk.acm.a aVar = (com.moloco.sdk.acm.a) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6872a, aVar.f6872a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d);
    }

    public final java.util.Map<java.lang.String, java.lang.String> f() {
        return this.d;
    }

    public final java.lang.String g() {
        return this.b;
    }

    public final long h() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.f6872a.hashCode() * 31) + this.b.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c)) * 31) + this.d.hashCode();
    }

    public java.lang.String toString() {
        return "ACMConfig(appId=" + this.f6872a + ", postAnalyticsUrl=" + this.b + ", requestPeriodSeconds=" + this.c + ", clientOptions=" + this.d + ')';
    }

    public final com.moloco.sdk.acm.a a(java.lang.String appId, java.lang.String postAnalyticsUrl, long j, java.util.Map<java.lang.String, java.lang.String> clientOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        return new com.moloco.sdk.acm.a(appId, postAnalyticsUrl, j, clientOptions);
    }

    public static /* synthetic */ com.moloco.sdk.acm.a a(com.moloco.sdk.acm.a aVar, java.lang.String str, java.lang.String str2, long j, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f6872a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.b;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            j = aVar.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            map = aVar.d;
        }
        return aVar.a(str, str3, j2, map);
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(long j) {
        this.c = j;
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, long j, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 600L : j, map);
    }
}
