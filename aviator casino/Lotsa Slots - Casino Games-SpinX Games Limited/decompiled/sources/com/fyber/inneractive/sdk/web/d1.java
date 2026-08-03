package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4330a;
    public final java.lang.String b;
    public final java.util.HashMap c;

    public d1(android.webkit.WebResourceRequest webResourceRequest) {
        this.f4330a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        this.c = new java.util.HashMap(webResourceRequest.getRequestHeaders() == null ? java.util.Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.web.d1.class != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.web.d1 d1Var = (com.fyber.inneractive.sdk.web.d1) obj;
        if (this.f4330a.equals(d1Var.f4330a) && this.b.equals(d1Var.b)) {
            return this.c.equals(d1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4330a.hashCode() * 31)) * 31);
    }
}
