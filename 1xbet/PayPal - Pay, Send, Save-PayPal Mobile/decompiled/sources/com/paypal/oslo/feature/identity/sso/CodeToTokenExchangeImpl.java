package com.paypal.oslo.feature.identity.sso;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/CodeToTokenExchangeImpl;", "Lcom/paypal/oslo/feature/identity/api/CodeToTokenExchange;", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/CodeToTokenUseCase;", "codeToTokenUseCase", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "authConfigProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/sso/domain/usecase/CodeToTokenUseCase;Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;)V", "Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeError;", "Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeData;", "exchange", "(Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/sso/domain/usecase/CodeToTokenUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CodeToTokenExchangeImpl implements com.paypal.oslo.feature.identity.api.CodeToTokenExchange {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.config.AuthConfigProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CodeToTokenExchangeImpl(com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase codeToTokenUseCase, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeToTokenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfigProvider, "");
        this.getHighSpeedVideoSizes = codeToTokenUseCase;
        this.getHighSpeedVideoFpsRanges = authConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.identity.api.CodeToTokenExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object exchange(com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest codeToTokenExchangeRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError, com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData>> continuation) {
        com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl$exchange$1 codeToTokenExchangeImpl$exchange$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl$exchange$1) {
                codeToTokenExchangeImpl$exchange$1 = (com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl$exchange$1) continuation;
                if ((codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Starting code to token exchange", null, null, 6, null);
                        com.paypal.oslo.feature.identity.sso.domain.usecase.CodeToTokenUseCase codeToTokenUseCase = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest codeToTokenRequest = new com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest(this.getHighSpeedVideoFpsRanges.getConfig().getFirstPartyClientId(), codeToTokenExchangeRequest.getAuthorizationCode(), codeToTokenExchangeRequest.getCodeVerifier(), codeToTokenExchangeRequest.getNonce(), codeToTokenExchangeRequest.getAuthenticationContext());
                        codeToTokenExchangeImpl$exchange$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeRequest);
                        codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoFpsRanges = 1;
                        obj = codeToTokenUseCase.invoke(codeToTokenRequest, codeToTokenExchangeImpl$exchange$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (arrow.core.Either) obj;
                }
            }
            if (i != 0) {
            }
            return (arrow.core.Either) obj;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Error during code to token exchange:", e);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown error occurred";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Unknown(message));
        }
        codeToTokenExchangeImpl$exchange$1 = new com.paypal.oslo.feature.identity.sso.CodeToTokenExchangeImpl$exchange$1(this, continuation);
        java.lang.Object obj2 = codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = codeToTokenExchangeImpl$exchange$1.getHighSpeedVideoFpsRanges;
    }
}
