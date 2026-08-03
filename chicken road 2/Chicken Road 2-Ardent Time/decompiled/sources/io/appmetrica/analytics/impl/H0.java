package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4360a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4361b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType f4362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4364e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f4365f;

    public H0(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType, int i2, java.lang.String str3, java.lang.String str4) {
        this.f4360a = str;
        this.f4361b = str2;
        this.f4362c = counterConfigurationReporterType;
        this.f4363d = i2;
        this.f4364e = str3;
        this.f4365f = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.H0)) {
            return false;
        }
        io.appmetrica.analytics.impl.H0 h02 = (io.appmetrica.analytics.impl.H0) obj;
        return kotlin.jvm.internal.i.a(this.f4360a, h02.f4360a) && kotlin.jvm.internal.i.a(this.f4361b, h02.f4361b) && this.f4362c == h02.f4362c && this.f4363d == h02.f4363d && kotlin.jvm.internal.i.a(this.f4364e, h02.f4364e) && kotlin.jvm.internal.i.a(this.f4365f, h02.f4365f);
    }

    public final int hashCode() {
        int e2 = B1.a.e(this.f4364e, (java.lang.Integer.hashCode(this.f4363d) + ((this.f4362c.hashCode() + B1.a.e(this.f4361b, this.f4360a.hashCode() * 31, 31)) * 31)) * 31, 31);
        java.lang.String str = this.f4365f;
        return e2 + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f4360a + ", packageName=" + this.f4361b + ", reporterType=" + this.f4362c + ", processID=" + this.f4363d + ", processSessionID=" + this.f4364e + ", errorEnvironment=" + this.f4365f + ')';
    }
}
