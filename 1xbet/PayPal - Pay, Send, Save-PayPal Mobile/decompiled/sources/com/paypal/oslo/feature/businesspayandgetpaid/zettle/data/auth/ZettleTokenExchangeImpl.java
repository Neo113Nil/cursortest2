package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/auth/ZettleTokenExchangeImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "tokenToCodeExchange", "<init>", "(Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;)V", "", "exchangeTokenForAuthCode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ZettleTokenExchangeImpl implements com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.TokenToCodeExchange getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ZettleTokenExchangeImpl(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenToCodeExchange, "");
        this.getHighSpeedVideoSizes = tokenToCodeExchange;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object exchangeTokenForAuthCode(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1 zettleTokenExchangeImpl$exchangeTokenForAuthCode$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1) {
            zettleTokenExchangeImpl$exchangeTokenForAuthCode$1 = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1) continuation;
            if ((zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext = new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("business-pay-and-get-paid-zettle-sdk-token-provider", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.ZETTLE_SINGLE_SIGN_ON);
                    com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange = this.getHighSpeedVideoSizes;
                    zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenToCodeExchangeAuthenticationContext);
                    zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.Camera2StreamConfigurationMap = 1;
                    obj = tokenToCodeExchange.exchangeTokenToCode(tokenToCodeExchangeAuthenticationContext, zettleTokenExchangeImpl$exchangeTokenForAuthCode$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return ((com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData) ((arrow.core.Either.Right) either).getValue()).getAuthorizationCode();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Token-to-code exchange failed for Zettle SDK. Initialization not attempted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        zettleTokenExchangeImpl$exchangeTokenForAuthCode$1 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.ZettleTokenExchangeImpl$exchangeTokenForAuthCode$1(this, continuation);
        java.lang.Object obj2 = zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zettleTokenExchangeImpl$exchangeTokenForAuthCode$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
