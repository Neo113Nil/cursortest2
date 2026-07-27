package io.appmetrica.analytics.idsync.internal.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class RequestConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f5646a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5647b;

    /* renamed from: c, reason: collision with root package name */
    private final Preconditions f5648c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f5649d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5650e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5651g;

    public RequestConfig(String str, String str2, Preconditions preconditions, Map<String, ? extends List<String>> map, long j3, long j4, List<Integer> list) {
        this.f5646a = str;
        this.f5647b = str2;
        this.f5648c = preconditions;
        this.f5649d = map;
        this.f5650e = j3;
        this.f = j4;
        this.f5651g = list;
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
        return this.f5650e == requestConfig.f5650e && this.f == requestConfig.f && j.a(this.f5646a, requestConfig.f5646a) && j.a(this.f5647b, requestConfig.f5647b) && j.a(this.f5648c, requestConfig.f5648c) && j.a(this.f5649d, requestConfig.f5649d) && j.a(this.f5651g, requestConfig.f5651g);
    }

    public final Map<String, List<String>> getHeaders() {
        return this.f5649d;
    }

    public final Preconditions getPreconditions() {
        return this.f5648c;
    }

    public final long getResendIntervalForInvalidResponse() {
        return this.f;
    }

    public final long getResendIntervalForValidResponse() {
        return this.f5650e;
    }

    public final String getType() {
        return this.f5646a;
    }

    public final String getUrl() {
        return this.f5647b;
    }

    public final List<Integer> getValidResponseCodes() {
        return this.f5651g;
    }

    public int hashCode() {
        return this.f5651g.hashCode() + ((this.f5649d.hashCode() + ((this.f5648c.hashCode() + ((this.f5647b.hashCode() + ((this.f5646a.hashCode() + ((Long.hashCode(this.f) + (Long.hashCode(this.f5650e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequestConfig(type='" + this.f5646a + "', url='" + this.f5647b + "', preconditions=" + this.f5648c + ", headers=" + this.f5649d + ", resendIntervalForValidResponse=" + this.f5650e + ", resendIntervalForInvalidResponse=" + this.f + ", validResponseCodes=" + this.f5651g + ')';
    }
}
