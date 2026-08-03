package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class e implements com.fyber.inneractive.sdk.metrics.g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Long f3795a = null;
    public java.lang.Long b = null;
    public java.lang.Long c = null;
    public java.lang.Long d = null;
    public java.lang.Long e = null;
    public java.lang.Long f = null;
    public java.lang.Long g = null;
    public java.lang.Long h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long b() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.g = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long c() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.f3795a = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long d() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.d = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long e() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.f = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long f() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.b = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long g() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.c = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long h() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.h = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.lang.Long i() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        this.e = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final java.util.HashMap j() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Long l = this.b;
        if (l != null && this.f3795a != null) {
            hashMap.put("sdk_init_network_req", java.lang.Long.valueOf(l.longValue() - this.f3795a.longValue()));
        }
        java.lang.Long l2 = this.h;
        if (l2 != null && this.b != null) {
            hashMap.put("sdk_got_response_from_markup_url", java.lang.Long.valueOf(l2.longValue() - this.b.longValue()));
        }
        java.lang.Long l3 = this.d;
        if (l3 != null && this.h != null) {
            hashMap.put("sdk_parsed_res", java.lang.Long.valueOf(l3.longValue() - this.h.longValue()));
        }
        java.lang.Long l4 = this.c;
        if (l4 != null && this.b != null) {
            hashMap.put("sdk_got_server_res", java.lang.Long.valueOf(l4.longValue() - this.b.longValue()));
        }
        java.lang.Long l5 = this.d;
        if (l5 != null && this.c != null) {
            hashMap.put("sdk_parsed_res", java.lang.Long.valueOf(l5.longValue() - this.c.longValue()));
        }
        java.lang.Long l6 = this.e;
        if (l6 != null && this.d != null) {
            hashMap.put("ad_loaded_result", java.lang.Long.valueOf(l6.longValue() - this.d.longValue()));
        }
        java.lang.Long l7 = this.f;
        if (l7 != null && this.e != null) {
            hashMap.put("publisher_notified", java.lang.Long.valueOf(l7.longValue() - this.e.longValue()));
        }
        java.lang.Long l8 = this.g;
        if (l8 != null && this.f3795a != null) {
            hashMap.put("roundtrip", java.lang.Long.valueOf(l8.longValue() - this.f3795a.longValue()));
        }
        return hashMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MetricsCollectorData{");
        if (this.f3795a != null && this.b != null) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.b.longValue() - this.f3795a.longValue());
        }
        if (this.h != null && this.b != null) {
            sb.append(", sdk_got_response_from_markup_url=");
            sb.append(this.h.longValue() - this.b.longValue());
        }
        if (this.c != null && this.b != null) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.c.longValue() - this.b.longValue());
        }
        if (this.d != null && this.c != null) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.d.longValue() - this.c.longValue());
        }
        if (this.e != null && this.d != null) {
            sb.append(", ad_loaded_result=");
            sb.append(this.e.longValue() - this.d.longValue());
        }
        if (this.f != null && this.e != null) {
            sb.append(", publisher_notified=");
            sb.append(this.f.longValue() - this.e.longValue());
        }
        if (this.g != null && this.f3795a != null) {
            sb.append(", roundtrip=");
            sb.append(this.g.longValue() - this.f3795a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
