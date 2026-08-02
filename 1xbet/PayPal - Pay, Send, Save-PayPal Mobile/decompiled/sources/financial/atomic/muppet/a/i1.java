package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class i1 implements okhttp3.Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        if (kotlin.jvm.internal.Intrinsics.areEqual("http", request.url().scheme())) {
            request = request.newBuilder().url(financial.atomic.muppet.http.RequestKt.toHttps(request.url().toString())).build();
        }
        java.lang.String cookie = cookieManager.getCookie(request.url().toString());
        okhttp3.Response proceed = cookie != null ? chain.proceed(request.newBuilder().addHeader("Cookie", cookie).build()) : chain.proceed(request);
        java.util.List<java.lang.String> list = proceed.headers().toMultimap().get("Set-Cookie");
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                cookieManager.setCookie(request.url().toString(), (java.lang.String) it.next());
            }
        }
        return proceed;
    }
}
