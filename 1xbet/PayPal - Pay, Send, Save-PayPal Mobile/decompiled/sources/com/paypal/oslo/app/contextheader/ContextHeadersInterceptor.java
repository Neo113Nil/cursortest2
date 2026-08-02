package com.paypal.oslo.app.contextheader;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/app/contextheader/ContextHeadersInterceptor;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/app/contextheader/ContextHeadersProvider;", "headersProvider", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;", "payPalRequestFilter", "<init>", "(Lcom/paypal/oslo/app/contextheader/ContextHeadersProvider;Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/app/contextheader/ContextHeadersProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContextHeadersInterceptor implements okhttp3.Interceptor {
    public static final int $stable = 8;
    private final com.paypal.oslo.app.contextheader.ContextHeadersProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.network.http.PayPalRequestFilter getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ContextHeadersInterceptor(com.paypal.oslo.app.contextheader.ContextHeadersProvider contextHeadersProvider, com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextHeadersProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalRequestFilter, "");
        this.Camera2StreamConfigurationMap = contextHeadersProvider;
        this.getHighSpeedVideoFpsRangesFor = payPalRequestFilter;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (!this.getHighSpeedVideoFpsRangesFor.shouldAddPayPalHeaders(request, com.paypal.oslo.core.identity.NoAuthTag.class)) {
            return chain.proceed(request);
        }
        okhttp3.Request.Builder newBuilder = request.newBuilder();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.paypal.oslo.app.contextheader.ContextHeader>> it = this.Camera2StreamConfigurationMap.getContextHeaders().entrySet().iterator();
        while (it.hasNext()) {
            com.paypal.oslo.app.contextheader.ContextHeader value = it.next().getValue();
            arrow.core.Either<kotlinx.serialization.SerializationException, java.lang.String> jsonValue = value.jsonValue();
            if (jsonValue instanceof arrow.core.Either.Right) {
                newBuilder.header(value.getHeaderKey().getValue(), (java.lang.String) ((arrow.core.Either.Right) jsonValue).getValue());
            } else if (jsonValue instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.app.LoggerKt.log, "Failed to encode context header value to JSON. Header will not be added to the request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, value.getHeaderKey().getValue())), null, (kotlinx.serialization.SerializationException) ((arrow.core.Either.Left) jsonValue).getValue(), 4, null);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return chain.proceed(newBuilder.build());
    }
}
