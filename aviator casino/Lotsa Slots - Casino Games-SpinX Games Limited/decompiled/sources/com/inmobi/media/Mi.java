package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Mi implements okhttp3.Interceptor {
    public static void a(com.inmobi.media.Ni ni, int i) {
        long pow = (long) (java.lang.Math.pow(1.0d, i) * ni.b);
        if (pow > 0) {
            try {
                java.lang.Thread.sleep(pow);
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.IOException("Retry delay interrupted", e);
            }
        }
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Request request = chain.request();
        java.lang.Object tag = request.tag();
        okhttp3.Response response = null;
        com.inmobi.media.Ni ni = tag instanceof com.inmobi.media.Ni ? (com.inmobi.media.Ni) tag : null;
        if (ni == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(request);
            try {
                okhttp3.Response proceed = chain.proceed(request);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
                return proceed;
            } catch (java.lang.IllegalArgumentException e) {
                java.lang.String message = e.getMessage();
                if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) (message != null ? message : ""), (java.lang.CharSequence) "port out of range", true)) {
                    throw e;
                }
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
                throw new java.io.IOException("Proxy configuration error", e);
            }
        }
        int i = ni.f4859a;
        int i2 = i + 1;
        java.lang.Throwable e2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            if (response != null) {
                try {
                    okhttp3.ResponseBody body = response.body();
                    if (body != null) {
                        body.close();
                    }
                } catch (java.io.IOException e3) {
                    e2 = e3;
                    if (i3 == i) {
                        break;
                    }
                    a(ni, i3);
                } catch (java.lang.IllegalArgumentException e4) {
                    java.lang.String message2 = e4.getMessage();
                    if (!kotlin.text.StringsKt.contains((java.lang.CharSequence) (message2 != null ? message2 : ""), (java.lang.CharSequence) "port out of range", true)) {
                        throw e4;
                    }
                    kotlin.Lazy lazy2 = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(new com.inmobi.media.M2(e4));
                    throw new java.io.IOException("Proxy configuration error", e4);
                } catch (java.util.concurrent.CancellationException e5) {
                    throw e5;
                } catch (java.lang.IllegalStateException e6) {
                    e2 = e6;
                    if (i3 == i) {
                        break;
                    }
                    a(ni, i3);
                }
            }
            response = chain.proceed(request);
            kotlin.jvm.internal.Intrinsics.checkNotNull(response);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "<this>");
            int code = response.code();
            if (400 <= code && code < 600 && com.inmobi.media.AbstractC2751sg.a(response) && i3 < i) {
                a(ni, i3);
            }
            return response;
        }
        if (response != null) {
            return response;
        }
        throw new java.io.IOException("Retry policy exhausted", e2);
    }
}
