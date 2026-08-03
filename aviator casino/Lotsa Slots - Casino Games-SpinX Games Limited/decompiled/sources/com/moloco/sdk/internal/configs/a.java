package com.moloco.sdk.internal.configs;

/* loaded from: classes5.dex */
public final class a {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6944a;
    public final int b;

    public a(java.lang.String reportingUrl, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        this.f6944a = reportingUrl;
        this.b = i;
    }

    public final java.lang.String a() {
        return this.f6944a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final java.lang.String d() {
        return this.f6944a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.configs.a)) {
            return false;
        }
        com.moloco.sdk.internal.configs.a aVar = (com.moloco.sdk.internal.configs.a) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6944a, aVar.f6944a) && this.b == aVar.b;
    }

    public int hashCode() {
        return (this.f6944a.hashCode() * 31) + this.b;
    }

    public java.lang.String toString() {
        return "OperationalMetricsConfig(reportingUrl=" + this.f6944a + ", pollingIntervalSeconds=" + this.b + ')';
    }

    public final com.moloco.sdk.internal.configs.a a(java.lang.String reportingUrl, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        return new com.moloco.sdk.internal.configs.a(reportingUrl, i);
    }

    public static /* synthetic */ com.moloco.sdk.internal.configs.a a(com.moloco.sdk.internal.configs.a aVar, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.f6944a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.b;
        }
        return aVar.a(str, i);
    }
}
