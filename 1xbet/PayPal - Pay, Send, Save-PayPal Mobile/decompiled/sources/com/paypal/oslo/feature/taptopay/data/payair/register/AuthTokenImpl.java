package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthTokenImpl;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "tokenProvider", "<init>", "(Lcom/paypal/oslo/core/identity/domain/TokenProvider;)V", "", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/TokenRefreshState;", "refreshToken", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthTokenImpl implements com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.TokenProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AuthTokenImpl(com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        this.getHighSpeedVideoSizes = tokenProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("payair_registration", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$getToken$1 authTokenImpl$getToken$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$getToken$1) {
            authTokenImpl$getToken$1 = (com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$getToken$1) continuation;
            if ((authTokenImpl$getToken$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                authTokenImpl$getToken$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = authTokenImpl$getToken$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authTokenImpl$getToken$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = this.getHighResolutionOutputSizeshNQ4ISI;
                    authTokenImpl$getToken$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = tokenProvider.getToken(userAccessTokenType, authTokenImpl$getToken$1);
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
                    return ((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue()).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return "";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        authTokenImpl$getToken$1 = new com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$getToken$1(this, continuation);
        java.lang.Object obj2 = authTokenImpl$getToken$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authTokenImpl$getToken$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r6 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r6.invalidateToken(r2, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refreshToken(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$refreshToken$1 authTokenImpl$refreshToken$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$refreshToken$1) {
            authTokenImpl$refreshToken$1 = (com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$refreshToken$1) continuation;
            if ((authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = authTokenImpl$refreshToken$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType = this.getHighResolutionOutputSizeshNQ4ISI;
                    authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either = (arrow.core.Either) obj;
                        if (either instanceof arrow.core.Either.Right) {
                            return new com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success(((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue()).getValue());
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            return com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Failure.INSTANCE;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider2 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType2 = this.getHighResolutionOutputSizeshNQ4ISI;
                authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap = 2;
                obj = tokenProvider2.getToken(userAccessTokenType2, authTokenImpl$refreshToken$1);
            }
        }
        authTokenImpl$refreshToken$1 = new com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$refreshToken$1(this, continuation);
        java.lang.Object obj2 = authTokenImpl$refreshToken$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.core.identity.domain.TokenProvider tokenProvider22 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType22 = this.getHighResolutionOutputSizeshNQ4ISI;
        authTokenImpl$refreshToken$1.Camera2StreamConfigurationMap = 2;
        obj2 = tokenProvider22.getToken(userAccessTokenType22, authTokenImpl$refreshToken$1);
    }
}
