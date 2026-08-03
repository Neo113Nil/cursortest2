package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3979a;

    public u(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext) {
        this.f3979a = serviceContext;
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        try {
            io.appmetrica.analytics.networkapi.Response execute = new io.appmetrica.analytics.network.internal.NetworkClientBuilder().withSettings(new io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder().withSslSocketFactory(this.f3979a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(10240).build()).build().newCall(new io.appmetrica.analytics.networkapi.Request.Builder(str).withMethod(io.appmetrica.analytics.networkapi.Request.Method.POST).withBody(str2.getBytes(y1.a.f8486a)).addHeader("Content-Type", "application/json").build()).execute();
            if (!execute.isCompleted()) {
                return false;
            }
            if (execute.getCode() != 200) {
                int code = execute.getCode();
                if (400 > code || code >= 500) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
