package io.appmetrica.analytics.networktasks.impl;

/* loaded from: classes.dex */
public final class a {
    public static io.appmetrica.analytics.networkapi.Response a(java.lang.String str, java.lang.String str2, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        io.appmetrica.analytics.networkapi.Request.Builder withMethod = new io.appmetrica.analytics.networkapi.Request.Builder(str2).withMethod(io.appmetrica.analytics.networkapi.Request.Method.GET);
        if (!android.text.TextUtils.isEmpty(str)) {
            withMethod.addHeader("If-None-Match", str);
        }
        io.appmetrica.analytics.network.internal.NetworkClientBuilder networkClientBuilder = new io.appmetrica.analytics.network.internal.NetworkClientBuilder();
        io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder withSslSocketFactory = new io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int i2 = io.appmetrica.analytics.networktasks.impl.b.f7368a;
        return networkClientBuilder.withSettings(withSslSocketFactory.withConnectTimeout(i2).withReadTimeout(i2).build()).build().newCall(withMethod.build()).execute();
    }
}
