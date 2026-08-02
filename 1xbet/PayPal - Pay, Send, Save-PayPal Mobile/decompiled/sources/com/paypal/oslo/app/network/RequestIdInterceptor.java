package com.paypal.oslo.app.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/network/RequestIdInterceptor;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;", "payPalRequestFilter", "<init>", "(Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RequestIdInterceptor implements okhttp3.Interceptor {
    public static final java.lang.String HEADER_REQUEST_ID = "PayPal-Request-Id";
    private final com.paypal.oslo.core.network.http.PayPalRequestFilter getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public RequestIdInterceptor(com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalRequestFilter, "");
        this.getHighSpeedVideoSizes = payPalRequestFilter;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (!this.getHighSpeedVideoSizes.shouldAddPayPalHeaders(request, com.paypal.oslo.core.identity.NoAuthTag.class)) {
            return chain.proceed(request);
        }
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        okhttp3.Request build = request.newBuilder().header(HEADER_REQUEST_ID, obj).build();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Adding PayPal-Request-Id header", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("requestId", obj)), null, 4, null);
        return chain.proceed(build);
    }
}
