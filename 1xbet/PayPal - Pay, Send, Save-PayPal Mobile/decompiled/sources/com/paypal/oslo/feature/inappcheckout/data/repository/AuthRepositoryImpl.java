package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\fH\u0096@¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "tokenToCodeExchange", "Lcom/paypal/oslo/feature/identity/api/IdentityCheckoutDataProvider;", "identityCheckoutDataProvider", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;Lcom/paypal/oslo/feature/identity/api/IdentityCheckoutDataProvider;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "getAuthData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "getOneShotAuthentication", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$TransferSessionError;", "Lcom/paypal/oslo/feature/inappcheckout/features/auth/SessionTransferData;", "transferSession", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/api/TokenToCodeExchange;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/IdentityCheckoutDataProvider;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.TokenToCodeExchange getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AuthRepositoryImpl(com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange, com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider identityCheckoutDataProvider, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenToCodeExchange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityCheckoutDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighSpeedVideoFpsRanges = tokenToCodeExchange;
        this.Camera2StreamConfigurationMap = identityCheckoutDataProvider;
        this.getHighSpeedVideoFpsRangesFor = checkoutLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = analyticsTracer;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    public final java.lang.Object getAuthData(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse>> continuation) {
        return com.paypal.oslo.feature.inappcheckout.data.utils.RetryUtilKt.executeWithRetry(1, new com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getAuthData$2(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOneShotAuthentication(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getOneShotAuthentication$1 authRepositoryImpl$getOneShotAuthentication$1;
        int i;
        com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getOneShotAuthentication$1) {
            authRepositoryImpl$getOneShotAuthentication$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getOneShotAuthentication$1) continuation;
            if ((authRepositoryImpl$getOneShotAuthentication$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                authRepositoryImpl$getOneShotAuthentication$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = authRepositoryImpl$getOneShotAuthentication$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authRepositoryImpl$getOneShotAuthentication$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("checkout", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", "nativeWebXO")));
                    com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, authenticationFlowInfo);
                    com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext2 = new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext(authenticationContext, new com.paypal.oslo.feature.identity.api.CheckoutInputData(checkoutToken.getValue(), com.paypal.oslo.feature.inappcheckout.data.mapper.CheckoutDataMapperKt.toCheckoutTokenType(checkoutToken.getType())));
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRangesFor, "Attempting one-shot authentication with checkout data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("checkoutToken", checkoutToken.getValue())), null, 4, null);
                    com.paypal.oslo.feature.identity.api.IdentityCheckoutDataProvider identityCheckoutDataProvider = this.Camera2StreamConfigurationMap;
                    authRepositoryImpl$getOneShotAuthentication$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                    authRepositoryImpl$getOneShotAuthentication$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationFlowInfo);
                    authRepositoryImpl$getOneShotAuthentication$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationContext);
                    authRepositoryImpl$getOneShotAuthentication$1.Camera2StreamConfigurationMap = checkoutAuthenticationContext2;
                    authRepositoryImpl$getOneShotAuthentication$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    java.lang.Object checkoutData = identityCheckoutDataProvider.getCheckoutData(checkoutAuthenticationContext2, authRepositoryImpl$getOneShotAuthentication$1);
                    if (checkoutData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    checkoutAuthenticationContext = checkoutAuthenticationContext2;
                    obj = checkoutData;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    checkoutAuthenticationContext = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext) authRepositoryImpl$getOneShotAuthentication$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRangesFor, "Successfully completed one-shot authentication and fetched checkout data without prompting login.", null, null, 6, null);
                    return arrow.core.EitherKt.right(checkoutAuthenticationSuccessData);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.identity.domain.model.TokenError tokenError = (com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getHighSpeedVideoFpsRangesFor, "One-shot checkout data retrieval failed because a login prompt was required.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", tokenError.toString())), null, 4, null);
                    if (tokenError instanceof com.paypal.oslo.core.identity.domain.model.TokenError.NotFound) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired(checkoutAuthenticationContext));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        authRepositoryImpl$getOneShotAuthentication$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getOneShotAuthentication$1(this, continuation);
        java.lang.Object obj2 = authRepositoryImpl$getOneShotAuthentication$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authRepositoryImpl$getOneShotAuthentication$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object transferSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError, com.paypal.oslo.feature.inappcheckout.features.auth.SessionTransferData>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$transferSession$1 authRepositoryImpl$transferSession$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$transferSession$1) {
            authRepositoryImpl$transferSession$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$transferSession$1) continuation;
            if ((authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = authRepositoryImpl$transferSession$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("checkout", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", "nativeWebXO")));
                    com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, authenticationFlowInfo);
                    com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext tokenToCodeExchangeAuthenticationContext = new com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeAuthenticationContext(authenticationContext, com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.WEB_CHECKOUT_SINGLE_SIGN_ON);
                    com.paypal.oslo.feature.identity.api.TokenToCodeExchange tokenToCodeExchange = this.getHighSpeedVideoFpsRanges;
                    authRepositoryImpl$transferSession$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationFlowInfo);
                    authRepositoryImpl$transferSession$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationContext);
                    authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenToCodeExchangeAuthenticationContext);
                    authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = tokenToCodeExchange.exchangeTokenToCode(tokenToCodeExchangeAuthenticationContext, authRepositoryImpl$transferSession$1);
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
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                    this.getHighResolutionOutputSizeshNQ4ISI.trackCompleteAuthFlowError(new java.lang.Exception("Token-to-code exchange failed"));
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError(webSessionTransferError));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData tokenToCodeExchangeData = (com.paypal.oslo.feature.identity.api.model.TokenToCodeExchangeData) ((arrow.core.Either.Right) right).getValue();
                    this.getHighResolutionOutputSizeshNQ4ISI.trackCompleteAuthFlowSuccess();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.inappcheckout.features.auth.SessionTransferData(tokenToCodeExchangeData.getAuthorizationCode()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        authRepositoryImpl$transferSession$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$transferSession$1(this, continuation);
        java.lang.Object obj2 = authRepositoryImpl$transferSession$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authRepositoryImpl$transferSession$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
