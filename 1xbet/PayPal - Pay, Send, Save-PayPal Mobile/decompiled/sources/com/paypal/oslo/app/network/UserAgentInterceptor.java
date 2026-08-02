package com.paypal.oslo.app.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/network/UserAgentInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAgentInterceptor implements okhttp3.Interceptor {
    public static final int $stable = 0;
    private static final kotlin.text.Regex Camera2StreamConfigurationMap;
    private static final java.lang.String getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UserAgentInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        java.lang.String header = request.header("User-Agent");
        if (header != null && !kotlin.text.StringsKt.isBlank(header)) {
            java.lang.String obj = kotlin.text.StringsKt.trim(header).toString();
            kotlin.text.Regex regex = Camera2StreamConfigurationMap;
            java.lang.String str2 = obj;
            if (regex.containsMatchIn(str2)) {
                str = regex.replace(str2, "Android");
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append(" Android");
                str = sb.toString();
            }
        } else {
            str = getHighSpeedVideoSizes;
        }
        return chain.proceed(request.newBuilder().header("User-Agent", str).build());
    }

    static {
        java.lang.String str = okhttp3.OkHttp.VERSION;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("okhttp/");
        sb.append(str);
        sb.append(" Android");
        getHighSpeedVideoSizes = sb.toString();
        Camera2StreamConfigurationMap = new kotlin.text.Regex("\\bAndroid\\b", kotlin.text.RegexOption.IGNORE_CASE);
    }
}
