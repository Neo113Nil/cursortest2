package com.inmobi.media;

import com.google.common.net.HttpHeaders;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes6.dex */
public final class Xc implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        if (proceed.isRedirect()) {
            Intrinsics.checkNotNull(proceed);
            Intrinsics.checkNotNullParameter(proceed, "<this>");
            String header = proceed.isRedirect() ? proceed.header(HttpHeaders.LOCATION) : null;
            if (header != null) {
                Intrinsics.checkNotNullParameter(header, "<this>");
                try {
                    new URL(header);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException("Invalid URL in Location header: " + header);
        }
        Intrinsics.checkNotNull(proceed);
        return proceed;
    }
}
