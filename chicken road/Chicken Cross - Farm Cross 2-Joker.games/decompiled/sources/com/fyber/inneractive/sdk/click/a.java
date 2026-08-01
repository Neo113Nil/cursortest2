package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a {
    public static q a(Uri uri, q qVar) {
        if (uri == null) {
            return qVar;
        }
        String host = uri.getHost();
        String scheme = uri.getScheme();
        if (!"market".equalsIgnoreCase(scheme)) {
            if (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return qVar;
            }
            if (!"play.google.com".equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host)) {
                return qVar;
            }
        }
        return q.OPEN_GOOGLE_STORE;
    }

    public abstract b a(Context context, Uri uri, List list);

    public abstract void a();

    public abstract boolean a(Uri uri, r rVar);
}
