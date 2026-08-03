package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4808a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4809b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f4810c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4811d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType f4812e;

    public P3(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f4808a = str;
        this.f4809b = str2;
        this.f4810c = num;
        this.f4811d = str3;
        this.f4812e = counterConfigurationReporterType;
    }

    public static io.appmetrica.analytics.impl.P3 a(io.appmetrica.analytics.impl.H3 h3) {
        return new io.appmetrica.analytics.impl.P3(h3.f4368b.getApiKey(), h3.f4367a.f4123a.getAsString("PROCESS_CFG_PACKAGE_NAME"), h3.f4367a.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID"), h3.f4367a.f4123a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), h3.f4368b.getReporterType());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.impl.P3.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.P3 p3 = (io.appmetrica.analytics.impl.P3) obj;
        java.lang.String str = this.f4808a;
        if (str == null ? p3.f4808a != null : !str.equals(p3.f4808a)) {
            return false;
        }
        if (!this.f4809b.equals(p3.f4809b)) {
            return false;
        }
        java.lang.Integer num = this.f4810c;
        if (num == null ? p3.f4810c != null : !num.equals(p3.f4810c)) {
            return false;
        }
        java.lang.String str2 = this.f4811d;
        if (str2 == null ? p3.f4811d == null : str2.equals(p3.f4811d)) {
            return this.f4812e == p3.f4812e;
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.f4808a;
        int e2 = B1.a.e(this.f4809b, (str != null ? str.hashCode() : 0) * 31, 31);
        java.lang.Integer num = this.f4810c;
        int hashCode = (e2 + (num != null ? num.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f4811d;
        return this.f4812e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "ClientDescription{mApiKey='" + this.f4808a + "', mPackageName='" + this.f4809b + "', mProcessID=" + this.f4810c + ", mProcessSessionID='" + this.f4811d + "', mReporterType=" + this.f4812e + '}';
    }
}
