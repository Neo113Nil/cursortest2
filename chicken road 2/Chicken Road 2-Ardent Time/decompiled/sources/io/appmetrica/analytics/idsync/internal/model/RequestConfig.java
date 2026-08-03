package io.appmetrica.analytics.idsync.internal.model;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3993a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3994b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.idsync.internal.model.Preconditions f3995c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.Map f3996d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3997e;

    /* renamed from: f, reason: collision with root package name */
    private final long f3998f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.List f3999g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4000h;

    /* renamed from: i, reason: collision with root package name */
    private final java.lang.String f4001i;

    public RequestConfig(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.idsync.internal.model.Preconditions preconditions, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, long j2, long j3, java.util.List<java.lang.Integer> list, boolean z2, java.lang.String str3) {
        this.f3993a = str;
        this.f3994b = str2;
        this.f3995c = preconditions;
        this.f3996d = map;
        this.f3997e = j2;
        this.f3998f = j3;
        this.f3999g = list;
        this.f4000h = z2;
        this.f4001i = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.idsync.internal.model.RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig = (io.appmetrica.analytics.idsync.internal.model.RequestConfig) obj;
        return this.f3997e == requestConfig.f3997e && this.f3998f == requestConfig.f3998f && kotlin.jvm.internal.i.a(this.f3993a, requestConfig.f3993a) && kotlin.jvm.internal.i.a(this.f3994b, requestConfig.f3994b) && kotlin.jvm.internal.i.a(this.f3995c, requestConfig.f3995c) && kotlin.jvm.internal.i.a(this.f3996d, requestConfig.f3996d) && kotlin.jvm.internal.i.a(this.f3999g, requestConfig.f3999g) && this.f4000h == requestConfig.f4000h && kotlin.jvm.internal.i.a(this.f4001i, requestConfig.f4001i);
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.f3996d;
    }

    public final io.appmetrica.analytics.idsync.internal.model.Preconditions getPreconditions() {
        return this.f3995c;
    }

    public final boolean getReportEventEnabled() {
        return this.f4000h;
    }

    public final java.lang.String getReportUrl() {
        return this.f4001i;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f3998f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f3997e;
    }

    public final java.lang.String getType() {
        return this.f3993a;
    }

    public final java.lang.String getUrl() {
        return this.f3994b;
    }

    public final java.util.List<java.lang.Integer> getValidResponseCodes() {
        return this.f3999g;
    }

    public int hashCode() {
        int hashCode = (java.lang.Boolean.hashCode(this.f4000h) + ((this.f3999g.hashCode() + ((this.f3996d.hashCode() + ((this.f3995c.hashCode() + B1.a.e(this.f3994b, B1.a.e(this.f3993a, (java.lang.Long.hashCode(this.f3998f) + (java.lang.Long.hashCode(this.f3997e) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        java.lang.String str = this.f4001i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "RequestConfig(type='" + this.f3993a + "', url='" + this.f3994b + "', preconditions=" + this.f3995c + ", headers=" + this.f3996d + ", resendIntervalForValidResponse=" + this.f3997e + ", resendIntervalForInvalidResponse=" + this.f3998f + ", validResponseCodes=" + this.f3999g + ", reportEventEnabled=" + this.f4000h + ", reportUrl=" + this.f4001i + ')';
    }
}
