package io.appmetrica.analytics.networkokhttp.impl;

/* loaded from: classes.dex */
public final class c extends io.appmetrica.analytics.networkapi.Call {

    /* renamed from: a, reason: collision with root package name */
    public final I1.s f7364a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.networkapi.Request f7365b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.networkapi.NetworkClientSettings f7366c;

    public c(I1.s sVar, io.appmetrica.analytics.networkapi.Request request, io.appmetrica.analytics.networkapi.NetworkClientSettings networkClientSettings) {
        this.f7364a = sVar;
        this.f7365b = request;
        this.f7366c = networkClientSettings;
    }

    public static java.util.LinkedHashMap a(I1.m mVar) {
        v1.C1002c F2 = u0.AbstractC0995a.F(0, mVar.size());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = F2.iterator();
        while (((v1.C1001b) it).f8392c) {
            int a2 = ((v1.C1001b) it).a();
            java.lang.String b2 = mVar.b(a2);
            java.lang.Object obj = linkedHashMap.get(b2);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(b2, obj);
            }
            ((java.util.List) obj).add(mVar.d(a2));
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.networkapi.Call
    public final io.appmetrica.analytics.networkapi.Response execute() {
        try {
            I1.s sVar = this.f7364a;
            I1.v request = a(this.f7365b);
            sVar.getClass();
            kotlin.jvm.internal.i.e(request, "request");
            I1.y c2 = new M1.i(sVar, request).c();
            return new io.appmetrica.analytics.networkapi.Response.Builder(true, c2.f860d, io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils.INSTANCE.readSafelyApprox(this.f7366c.getMaxResponseSize(), new io.appmetrica.analytics.networkokhttp.impl.b(c2))).withHeaders(a(c2.f862f)).withUrl(c2.f857a.f834a.f768h).build();
        } catch (java.lang.Throwable th) {
            return new io.appmetrica.analytics.networkapi.Response.Builder(th).build();
        }
    }

    public static I1.v a(io.appmetrica.analytics.networkapi.Request request) {
        I1.u uVar = new I1.u();
        uVar.d(request.getUrl());
        int i2 = io.appmetrica.analytics.networkokhttp.impl.a.f7362a[request.getMethod().ordinal()];
        if (i2 == 1) {
            uVar.c("GET", null);
        } else if (i2 == 2) {
            java.lang.String methodName = request.getMethod().getMethodName();
            byte[] body = request.getBody();
            int length = body.length;
            kotlin.jvm.internal.i.e(body, "<this>");
            J1.b.c(body.length, 0, length);
            uVar.c(methodName, new I1.w(null, length, body, 0));
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : request.getHeaders().entrySet()) {
            java.lang.String name = entry.getKey();
            java.lang.String value = entry.getValue();
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            I1.l lVar = (I1.l) uVar.f831d;
            lVar.getClass();
            a.AbstractC0059a.e(name);
            a.AbstractC0059a.g(value, name);
            lVar.a(name, value);
        }
        return uVar.a();
    }
}
