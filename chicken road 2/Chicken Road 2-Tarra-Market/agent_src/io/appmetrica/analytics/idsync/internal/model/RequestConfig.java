package io.appmetrica.analytics.idsync.internal.model;

import C0.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f2101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2102b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f2103c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f2104d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2105e;

    /* renamed from: f, reason: collision with root package name */
    private final long f2106f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2107g;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j2, long j3, List<Integer> list) {
        this.f2101a = str;
        this.f2102b = str2;
        this.f2103c = preconditions;
        this.f2104d = map;
        this.f2105e = j2;
        this.f2106f = j3;
        this.f2107g = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RequestConfig.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.RequestConfig");
        }
        RequestConfig requestConfig = (RequestConfig) obj;
        return this.f2105e == requestConfig.f2105e && this.f2106f == requestConfig.f2106f && j.a(this.f2101a, requestConfig.f2101a) && j.a(this.f2102b, requestConfig.f2102b) && j.a(this.f2103c, requestConfig.f2103c) && j.a(this.f2104d, requestConfig.f2104d) && j.a(this.f2107g, requestConfig.f2107g);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f2104d;
    }

    public final Preconditions getPreconditions() {
        return this.f2103c;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f2106f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f2105e;
    }

    public final String getType() {
        return this.f2101a;
    }

    public final String getUrl() {
        return this.f2102b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f2107g;
    }

    public int hashCode() {
        return this.f2107g.hashCode() + ((this.f2104d.hashCode() + ((this.f2103c.hashCode() + g.f(this.f2102b, g.f(this.f2101a, (Long.hashCode(this.f2106f) + (Long.hashCode(this.f2105e) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f2101a + "', url='" + this.f2102b + "', preconditions=" + this.f2103c + ", headers=" + this.f2104d + ", resendIntervalForValidResponse=" + this.f2105e + ", resendIntervalForInvalidResponse=" + this.f2106f + ", validResponseCodes=" + this.f2107g + ')';
    }
}
