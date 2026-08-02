package com.paypal.oslo.core.identity;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/identity/AccessTokenAuthenticator;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "<init>", "(Lcom/paypal/oslo/core/identity/domain/TokenProvider;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccessTokenAuthenticator implements okhttp3.Interceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AccessTokenAuthenticator(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        this.Camera2StreamConfigurationMap = tokenProvider;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        okhttp3.Response proceed = chain.proceed(request);
        if (proceed.code() == 401 && request.tag(com.paypal.oslo.core.identity.NoAuthTag.class) == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.identity.LoggerKt.log, "Received 401 response, attempting token refresh", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", request.url().toString())), null, 4, null);
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.identity.AccessTokenAuthenticator$buildAuthenticatedRequest$1(proceed, this, null), 1, null);
            okhttp3.Request request2 = (okhttp3.Request) runBlocking$default;
            if (request2 != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.identity.LoggerKt.log, "Token refresh successful, retrying request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", request.url().toString())), null, 4, null);
                proceed.close();
                return chain.proceed(request2);
            }
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.identity.LoggerKt.log, "Token refresh failed, returning original 401 response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", request.url().toString())), null, 4, null);
        }
        return proceed;
    }
}
