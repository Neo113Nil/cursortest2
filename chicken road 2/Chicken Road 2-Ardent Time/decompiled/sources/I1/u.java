package I1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f828a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f829b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f830c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f832e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.Serializable f833f;

    public I1.v a() {
        java.util.Map unmodifiableMap;
        I1.o oVar = (I1.o) this.f830c;
        if (oVar == null) {
            throw new java.lang.IllegalStateException("url == null");
        }
        java.lang.String str = this.f829b;
        I1.m b2 = ((I1.l) this.f831d).b();
        I1.w wVar = (I1.w) this.f832e;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f833f;
        byte[] bArr = J1.b.f932a;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = i1.C0200s.f3326a;
        } else {
            unmodifiableMap = java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.i.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new I1.v(oVar, str, b2, wVar, unmodifiableMap);
    }

    public void b(java.lang.String str, java.lang.String value) {
        kotlin.jvm.internal.i.e(value, "value");
        I1.l lVar = (I1.l) this.f831d;
        lVar.getClass();
        a.AbstractC0059a.e(str);
        a.AbstractC0059a.g(value, str);
        lVar.d(str);
        lVar.a(str, value);
    }

    public void c(java.lang.String method, I1.w wVar) {
        kotlin.jvm.internal.i.e(method, "method");
        if (method.length() <= 0) {
            throw new java.lang.IllegalArgumentException("method.isEmpty() == true");
        }
        if (wVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new java.lang.IllegalArgumentException(("method " + method + " must have a request body.").toString());
            }
        } else if (!Q1.l.r(method)) {
            throw new java.lang.IllegalArgumentException(("method " + method + " must not have a request body.").toString());
        }
        this.f829b = method;
        this.f832e = wVar;
    }

    public void d(java.lang.String url) {
        kotlin.jvm.internal.i.e(url, "url");
        if (y1.o.K(url, "ws:", true)) {
            java.lang.String substring = url.substring(3);
            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
            url = kotlin.jvm.internal.i.h(substring, "http:");
        } else if (y1.o.K(url, "wss:", true)) {
            java.lang.String substring2 = url.substring(4);
            kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
            url = kotlin.jvm.internal.i.h(substring2, "https:");
        }
        kotlin.jvm.internal.i.e(url, "<this>");
        I1.n nVar = new I1.n();
        nVar.c(null, url);
        this.f830c = nVar.a();
    }

    public java.lang.String toString() {
        switch (this.f828a) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + this.f829b + ", mProviderPackage: " + ((java.lang.String) this.f830c) + ", mQuery: " + ((java.lang.String) this.f831d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    java.util.List list = (java.util.List) this.f832e;
                    if (i2 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    java.util.List list2 = (java.util.List) list.get(i2);
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        sb.append(" \"");
                        sb.append(android.util.Base64.encodeToString((byte[]) list2.get(i3), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i2++;
                }
            default:
                return super.toString();
        }
    }

    public u(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f828a = 1;
        this.f829b = str;
        this.f830c = str2;
        this.f831d = str3;
        list.getClass();
        this.f832e = list;
        this.f833f = str + "-" + str2 + "-" + str3;
    }

    public u() {
        this.f828a = 0;
        this.f833f = new java.util.LinkedHashMap();
        this.f829b = "GET";
        this.f831d = new I1.l(0);
    }
}
