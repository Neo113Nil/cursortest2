package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/di/UprInterceptor;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "tokenExchange", "<init>", "(Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UprInterceptor implements okhttp3.Interceptor {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.TokenToCodeExchange getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UprInterceptor(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenToCodeExchange, "");
        this.getHighResolutionOutputSizeshNQ4ISI = tokenToCodeExchange;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        java.lang.String str = null;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor$intercept$authorizationCode$1(this, new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("ttp_info", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.ZETTLE_SINGLE_SIGN_ON), null), 1, null);
        arrow.core.Either either = (arrow.core.Either) runBlocking$default;
        if (either instanceof arrow.core.Either.Right) {
            str = ((com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData) ((arrow.core.Either.Right) either).getValue()).getAuthorizationCode();
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Token-to-code exchange failed, proceeding without authorization", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (str == null) {
            return chain.proceed(request);
        }
        return chain.proceed(request.newBuilder().header("Authorization", "Bearer ".concat(java.lang.String.valueOf(str))).build());
    }
}
