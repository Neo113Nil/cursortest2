package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public abstract class a {
    public static com.fyber.inneractive.sdk.click.q a(android.net.Uri uri, com.fyber.inneractive.sdk.click.q qVar) {
        if (uri == null) {
            return qVar;
        }
        java.lang.String host = uri.getHost();
        java.lang.String scheme = uri.getScheme();
        if (!"market".equalsIgnoreCase(scheme)) {
            if (!androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return qVar;
            }
            if (!"play.google.com".equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host)) {
                return qVar;
            }
        }
        return com.fyber.inneractive.sdk.click.q.OPEN_GOOGLE_STORE;
    }

    public abstract com.fyber.inneractive.sdk.click.b a(android.content.Context context, android.net.Uri uri, java.util.List list);

    public abstract void a();

    public abstract boolean a(android.net.Uri uri, com.fyber.inneractive.sdk.click.r rVar);
}
