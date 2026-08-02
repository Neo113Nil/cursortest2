package com.paypal.oslo.core.webview.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/webview/data/repository/WebAuthSessionRepositoryImpl;", "Lcom/paypal/oslo/core/webview/domain/repository/WebAuthSessionRepository;", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "identitySessionTransfer", "<init>", "(Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;)V", "", "url", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthContext;", "webAuthContext", "Larrow/core/Either;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSession;", "transferNativeAuthSessionToWeb", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/WebAuthContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WebAuthSessionRepositoryImpl implements com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.IdentitySessionTransfer getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public WebAuthSessionRepositoryImpl(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySessionTransfer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identitySessionTransfer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.webview.domain.repository.WebAuthSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object transferNativeAuthSessionToWeb(java.lang.String str, com.paypal.oslo.core.webview.domain.models.WebAuthContext webAuthContext, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.webview.domain.models.WebAuthSessionError, com.paypal.oslo.core.webview.domain.models.WebAuthSession>> continuation) {
        com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1 webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.Unknown unknown;
        if (continuation instanceof com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1) {
            webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1 = (com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1) continuation;
            if ((webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext webSessionTransferAuthenticationContext = new com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant.PAYPAL, new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(webAuthContext.getSource(), (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), str, null, 8, null);
                    com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer = this.getHighResolutionOutputSizeshNQ4ISI;
                    webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(webAuthContext);
                    webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(webSessionTransferAuthenticationContext);
                    webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRanges = 1;
                    obj = identitySessionTransfer.transferSessionToWeb(webSessionTransferAuthenticationContext, webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1);
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
                if (either instanceof arrow.core.Either.Left) {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                } else {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                    if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) {
                        unknown = com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.InvalidRedirectUri.INSTANCE;
                    } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) {
                        unknown = com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.AuthenticationFailed.INSTANCE;
                    } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) {
                        unknown = com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.NetworkError.INSTANCE;
                    } else if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                        unknown = com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.UserCancelled.INSTANCE;
                    } else {
                        if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        unknown = new com.paypal.oslo.core.webview.domain.models.WebAuthSessionError.Unknown(((com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown) webSessionTransferError).getMessage());
                    }
                    right = new arrow.core.Either.Left(unknown);
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.identity.domain.model.WebSessionTransferData webSessionTransferData = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferData) ((arrow.core.Either.Right) right).getValue();
                    return new arrow.core.Either.Right(new com.paypal.oslo.core.webview.domain.models.WebAuthSession(webSessionTransferData.getRedirectUrl(), webSessionTransferData.getAuthorizationCode()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1 = new com.paypal.oslo.core.webview.data.repository.WebAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1(this, continuation);
        java.lang.Object obj2 = webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webAuthSessionRepositoryImpl$transferNativeAuthSessionToWeb$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Left) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
