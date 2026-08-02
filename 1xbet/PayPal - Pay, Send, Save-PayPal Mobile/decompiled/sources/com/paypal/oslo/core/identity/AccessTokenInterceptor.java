package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/identity/AccessTokenInterceptor;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;", "payPalRequestFilter", "<init>", "(Lcom/paypal/oslo/core/identity/domain/TokenProvider;Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/http/PayPalRequestFilter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccessTokenInterceptor implements okhttp3.Interceptor {
    private final com.paypal.oslo.core.network.http.PayPalRequestFilter getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AccessTokenInterceptor(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider, com.paypal.oslo.core.network.http.PayPalRequestFilter payPalRequestFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalRequestFilter, "");
        this.getHighSpeedVideoFpsRanges = tokenProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalRequestFilter;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (this.getHighResolutionOutputSizeshNQ4ISI.shouldAddPayPalHeaders(request, com.paypal.oslo.core.identity.NoAuthTag.class)) {
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.identity.AccessTokenInterceptor$intercept$accessToken$1(this, com.paypal.oslo.core.identity.RequestExtensionsKt.extractTokenType(request), null), 1, null);
            java.lang.String str = (java.lang.String) runBlocking$default;
            if (str != null) {
                request = request.newBuilder().header("Authorization", "Bearer ".concat(java.lang.String.valueOf(str))).build();
            }
            return chain.proceed(request);
        }
        return chain.proceed(request);
    }
}
