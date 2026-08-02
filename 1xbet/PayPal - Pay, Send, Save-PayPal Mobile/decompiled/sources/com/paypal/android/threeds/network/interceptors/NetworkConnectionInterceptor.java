package com.paypal.android.threeds.network.interceptors;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/threeds/network/interceptors/NetworkConnectionInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkConnectionInterceptor implements okhttp3.Interceptor {
    public static final int $stable = 0;
    public static final com.paypal.android.threeds.network.interceptors.NetworkConnectionInterceptor INSTANCE = new com.paypal.android.threeds.network.interceptors.NetworkConnectionInterceptor();

    private NetworkConnectionInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        try {
            return chain.proceed(request);
        } catch (java.net.SocketTimeoutException e) {
            return new okhttp3.Response.Builder().request(request).protocol(okhttp3.Protocol.HTTP_1_1).code(408).message(com.paypal.android.threeds.utils.NetworkUtil.TIMEOUT_ERROR).body(okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody.INSTANCE, java.lang.String.valueOf(e), (okhttp3.MediaType) null, 1, (java.lang.Object) null)).build();
        } catch (java.lang.Exception e2) {
            okhttp3.Response.Builder code = new okhttp3.Response.Builder().request(request).protocol(okhttp3.Protocol.HTTP_1_1).code(503);
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = com.paypal.android.threeds.utils.NetworkUtil.SOMETHING_WENT_WRONG;
            }
            return code.message(message).body(okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody.INSTANCE, java.lang.String.valueOf(e2), (okhttp3.MediaType) null, 1, (java.lang.Object) null)).build();
        }
    }
}
