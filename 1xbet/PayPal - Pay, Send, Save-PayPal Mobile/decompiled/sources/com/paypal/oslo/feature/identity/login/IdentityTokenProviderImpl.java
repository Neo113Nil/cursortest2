package com.paypal.oslo.feature.identity.login;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082@¢\u0006\u0004\b \u0010!J\u0098\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0019\u001a\u00020\"2 \u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0018\u00010$0#2&\u0010(\u001a\"\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0018\u00010$\u0012\u0004\u0012\u00020'0&2(\u0010+\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130)\u0012\u0006\u0012\u0004\u0018\u00010*0&H\u0082@¢\u0006\u0004\b \u0010,J\u0010\u0010\u001a\u001a\u00020'H\u0082@¢\u0006\u0004\b\u001a\u0010!J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082@¢\u0006\u0004\b-\u0010!J\u0018\u0010.\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b.\u0010\u0017R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00104R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0014\u00109\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u0014\u0010:\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010<\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010;R*\u00105\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010="}, d2 = {"Lcom/paypal/oslo/feature/identity/login/IdentityTokenProviderImpl;", "Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/usecase/GetClientTokenUseCase;", "getClientTokenUseCase", "Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;", "llsLoginUseCase", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/usecase/PostLoginDeviceRegisterUseCase;", "postLoginDeviceRegisterUseCaseLazy", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "elapsedRealtimeProvider", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/clienttoken/domain/usecase/GetClientTokenUseCase;Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;Ldagger/Lazy;Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/core/identity/domain/model/TokenType;", "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "asAuthenticationTier$identity_prodRelease", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;)Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/Function0;", "Lkotlinx/coroutines/CompletableDeferred;", "p1", "Lkotlin/Function1;", "", "p2", "Lkotlin/coroutines/Continuation;", "", "p3", "(Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "invalidateToken", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/usecase/GetClientTokenUseCase;", "Lcom/paypal/oslo/feature/identity/llslogin/domain/usecase/LLSLoginUseCase;", "getOutputFormats", "Ldagger/Lazy;", "Lcom/paypal/oslo/feature/identity/login/ElapsedRealtimeProvider;", "Lkotlinx/coroutines/CoroutineScope;", "getInputFormats", "getOutputMinFrameDuration", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityTokenProviderImpl implements com.paypal.oslo.feature.identity.api.IdentityTokenProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final dagger.Lazy<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.sync.Mutex getOutputMinFrameDuration;

    @javax.inject.Inject
    public IdentityTokenProviderImpl(com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase getClientTokenUseCase, com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase, dagger.Lazy<com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase> lazy, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getClientTokenUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSLoginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elapsedRealtimeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.Camera2StreamConfigurationMap = identityTokenStorage;
        this.getHighSpeedVideoFpsRangesFor = getClientTokenUseCase;
        this.getHighSpeedVideoSizes = lLSLoginUseCase;
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = elapsedRealtimeProvider;
        this.getInputFormats = coroutineScope;
        this.getOutputMinFrameDuration = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchClientTokenFromUseCase(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchClientTokenFromUseCase$1 identityTokenProviderImpl$fetchClientTokenFromUseCase$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchClientTokenFromUseCase$1) {
            identityTokenProviderImpl$fetchClientTokenFromUseCase$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchClientTokenFromUseCase$1) continuation;
            if ((identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.clienttoken.domain.usecase.GetClientTokenUseCase getClientTokenUseCase = identityTokenProviderImpl.getHighSpeedVideoFpsRangesFor;
                    identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getClientTokenUseCase.invoke(false, identityTokenProviderImpl$fetchClientTokenFromUseCase$1);
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
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImplKt.access$toTokenError((com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    return new arrow.core.Either.Right(new com.paypal.oslo.core.identity.domain.model.Token.ClientAccessToken(((com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientAccessToken) ((arrow.core.Either.Right) right).getValue()).getTokenValue()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        identityTokenProviderImpl$fetchClientTokenFromUseCase$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchClientTokenFromUseCase$1(identityTokenProviderImpl, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$fetchClientTokenFromUseCase$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchUserTokenViaLLSLogin(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1 identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1) {
            identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1) continuation;
            if ((identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.llslogin.domain.usecase.LLSLoginUseCase lLSLoginUseCase = identityTokenProviderImpl.getHighSpeedVideoSizes;
                    identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoSizes = 1;
                    obj = lLSLoginUseCase.invoke(identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1);
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
                    com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError lLSLoginError = (com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(lLSLoginError.getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "Unknown";
                    }
                    com.paypal.android.logger.Logger.w$default(logger, "LLS automatic login failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
                    right = new arrow.core.Either.Left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) right).getValue();
                    if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "LLS automatic login succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasToken", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(identityTokenProviderImpl.getInputFormats, null, null, new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$3$1(identityTokenProviderImpl, null), 3, null);
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(((com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult).getFirstPartyUserAccessToken().getTokenValue()));
                    }
                    if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                    java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult().getClass()).getSimpleName();
                    com.paypal.android.logger.Logger.w$default(logger2, "Unexpected challenge returned from LLS login", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("challengeType", simpleName2 != null ? simpleName2 : "Unknown")), null, 4, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1(identityTokenProviderImpl, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$fetchUserTokenViaLLSLogin$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentityTokenProvider
    public final java.lang.Object getToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        if (tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) {
            return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) tokenType, continuation);
        }
        if (tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.ClientAccessTokenType) {
            return getHighSpeedVideoSizes(continuation);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        if (r1 != r3) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessToken$1 identityTokenProviderImpl$getUserAccessToken$1;
        int i;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType2;
        com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData;
        java.lang.String accessToken;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessToken$1) {
            identityTokenProviderImpl$getUserAccessToken$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessToken$1) continuation;
            if ((identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.Camera2StreamConfigurationMap;
                    userAccessTokenType2 = userAccessTokenType;
                    identityTokenProviderImpl$getUserAccessToken$1.getHighResolutionOutputSizeshNQ4ISI = userAccessTokenType2;
                    identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges = 1;
                    obj = identityTokenStorage.getUserAccessToken(identityTokenProviderImpl$getUserAccessToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    userAccessTokenType2 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) identityTokenProviderImpl$getUserAccessToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj;
                com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier asAuthenticationTier$identity_prodRelease = asAuthenticationTier$identity_prodRelease(userAccessTokenType2.getAuthenticationContext().getAuthenticationState());
                if (userAccessTokenData != null && (accessToken = userAccessTokenData.getAccessToken()) != null) {
                    if (kotlin.text.StringsKt.isBlank(accessToken)) {
                        accessToken = null;
                    }
                    if (accessToken != null) {
                        long elapsedRealtimeMillis = this.getHighResolutionOutputSizeshNQ4ISI.elapsedRealtimeMillis();
                        if (!com.paypal.oslo.feature.identity.storage.model.TokenExpiryValidator.INSTANCE.isValid(userAccessTokenData, elapsedRealtimeMillis)) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "User access token has expired, clearing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("remainingMs", kotlin.coroutines.jvm.internal.Boxing.boxLong(userAccessTokenData.getExpiresAtElapsedRealtime() - elapsedRealtimeMillis)), kotlin.TuplesKt.to("tier", userAccessTokenData.getAuthenticationTier().name())), null, 4, null);
                            this.Camera2StreamConfigurationMap.clearUserAccessTokenSilently();
                        } else if (userAccessTokenData.getAuthenticationTier().compareTo(asAuthenticationTier$identity_prodRelease) >= 0) {
                            return arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(accessToken));
                        }
                    }
                }
                if (userAccessTokenType2.getAuthenticationContext().getAuthenticationState() != com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED) {
                    identityTokenProviderImpl$getUserAccessToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                    identityTokenProviderImpl$getUserAccessToken$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenData);
                    identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(asAuthenticationTier$identity_prodRelease);
                    identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges = 2;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(identityTokenProviderImpl$getUserAccessToken$1);
                    return highSpeedVideoFpsRanges == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRanges;
                }
                return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
            }
        }
        identityTokenProviderImpl$getUserAccessToken$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessToken$1(this, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$getUserAccessToken$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        userAccessTokenData = (com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData) obj2;
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier asAuthenticationTier$identity_prodRelease2 = asAuthenticationTier$identity_prodRelease(userAccessTokenType2.getAuthenticationContext().getAuthenticationState());
        if (userAccessTokenData != null) {
            if (kotlin.text.StringsKt.isBlank(accessToken)) {
            }
            if (accessToken != null) {
            }
        }
        if (userAccessTokenType2.getAuthenticationContext().getAuthenticationState() != com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED) {
        }
    }

    public final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier asAuthenticationTier$identity_prodRelease(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        int i = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.WhenMappings.$EnumSwitchMapping$0[authenticationState.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_LONG_LIVED_SESSION;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        return getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.coroutines.CompletableDeferred completableDeferred;
                completableDeferred = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.this.getInputSizeshNQ4ISI;
                return completableDeferred;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.$r8$lambda$ykdoPEfP4LWasGYhYPFd250Vyz8(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.this, (kotlinx.coroutines.CompletableDeferred) obj);
            }
        }, new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getUserAccessTokenWithQueue$4(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: all -> 0x0195, TryCatch #1 {all -> 0x0195, blocks: (B:35:0x00cd, B:37:0x00d5, B:43:0x00de), top: B:34:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #1 {all -> 0x0195, blocks: (B:35:0x00cd, B:37:0x00d5, B:43:0x00de), top: B:34:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.sync.Mutex mutex, kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>> function0, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, ? extends java.lang.Object> function12, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchWithQueue$1 identityTokenProviderImpl$fetchWithQueue$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.sync.Mutex mutex3;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> invoke;
        kotlin.Pair pair;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        boolean booleanValue;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        boolean z;
        kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>> function02;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, ? extends java.lang.Object> function13;
        kotlinx.coroutines.sync.Mutex mutex4;
        kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>, kotlin.Unit> function14;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchWithQueue$1) {
                identityTokenProviderImpl$fetchWithQueue$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchWithQueue$1) continuation;
                if ((identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDurationlomOqCM;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = mutex;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = function0;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = function12;
                        identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = mutex;
                        identityTokenProviderImpl$fetchWithQueue$1.Camera2StreamConfigurationMap = 0;
                        identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 1;
                        if (mutex.lock(null, identityTokenProviderImpl$fetchWithQueue$1) != coroutine_suspended) {
                            mutex2 = mutex;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                boolean z2 = identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return obj;
                            }
                            int i2 = identityTokenProviderImpl$fetchWithQueue$1.Camera2StreamConfigurationMap;
                            z = identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI;
                            either = (arrow.core.Either) identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration;
                            completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) identityTokenProviderImpl$fetchWithQueue$1.getInputFormats;
                            function13 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes;
                            function14 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI;
                            function02 = (kotlin.jvm.functions.Function0) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor;
                            mutex4 = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            try {
                                completableDeferred2.complete(either);
                                function14.invoke(null);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex3.unlock(null);
                                booleanValue = z;
                                completableDeferred = completableDeferred2;
                                function12 = function13;
                                function1 = function14;
                                function0 = function02;
                                mutex2 = mutex4;
                                identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex2);
                                identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                                identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                                identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                                identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred);
                                identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = null;
                                identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = null;
                                identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = booleanValue;
                                identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 4;
                                java.lang.Object await = completableDeferred.await(identityTokenProviderImpl$fetchWithQueue$1);
                                return await != coroutine_suspended ? coroutine_suspended : await;
                            } finally {
                            }
                        }
                        z = identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor;
                        kotlinx.coroutines.CompletableDeferred completableDeferred3 = (kotlinx.coroutines.CompletableDeferred) identityTokenProviderImpl$fetchWithQueue$1.getInputFormats;
                        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, ? extends java.lang.Object> function15 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>>> function03 = (kotlin.jvm.functions.Function0) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.sync.Mutex mutex5 = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        completableDeferred2 = completableDeferred3;
                        mutex3 = mutex5;
                        function02 = function03;
                        function13 = function15;
                        function1 = function16;
                        arrow.core.Either either2 = (arrow.core.Either) obj;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex3);
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function02);
                        identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                        identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = completableDeferred2;
                        identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = either2;
                        identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = mutex3;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = z;
                        identityTokenProviderImpl$fetchWithQueue$1.Camera2StreamConfigurationMap = 0;
                        identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 3;
                        if (mutex3.lock(null, identityTokenProviderImpl$fetchWithQueue$1) != coroutine_suspended) {
                            mutex4 = mutex3;
                            function14 = function1;
                            either = either2;
                            completableDeferred2.complete(either);
                            function14.invoke(null);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            mutex3.unlock(null);
                            booleanValue = z;
                            completableDeferred = completableDeferred2;
                            function12 = function13;
                            function1 = function14;
                            function0 = function02;
                            mutex2 = mutex4;
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex2);
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                            identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                            identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred);
                            identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = null;
                            identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = null;
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = booleanValue;
                            identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 4;
                            java.lang.Object await2 = completableDeferred.await(identityTokenProviderImpl$fetchWithQueue$1);
                            if (await2 != coroutine_suspended) {
                            }
                        }
                    }
                    int i3 = identityTokenProviderImpl$fetchWithQueue$1.Camera2StreamConfigurationMap;
                    mutex = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$fetchWithQueue$1.getInputFormats;
                    function12 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes;
                    function1 = (kotlin.jvm.functions.Function1) identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI;
                    function0 = (kotlin.jvm.functions.Function0) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke = function0.invoke();
                    if (invoke == null) {
                        pair = kotlin.TuplesKt.to(invoke, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    } else {
                        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        function1.invoke(CompletableDeferred$default);
                        pair = kotlin.TuplesKt.to(CompletableDeferred$default, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    mutex3.unlock(null);
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) pair.component1();
                    booleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
                    if (booleanValue) {
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = mutex2;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                        identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                        identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = completableDeferred;
                        identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = booleanValue;
                        identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 2;
                        java.lang.Object invoke2 = function12.invoke(identityTokenProviderImpl$fetchWithQueue$1);
                        if (invoke2 != coroutine_suspended) {
                            kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>>, ? extends java.lang.Object> function17 = function12;
                            completableDeferred2 = completableDeferred;
                            z = booleanValue;
                            obj = invoke2;
                            function02 = function0;
                            mutex3 = mutex2;
                            function13 = function17;
                            arrow.core.Either either22 = (arrow.core.Either) obj;
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex3);
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function02);
                            identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function13);
                            identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = completableDeferred2;
                            identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = either22;
                            identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = mutex3;
                            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = z;
                            identityTokenProviderImpl$fetchWithQueue$1.Camera2StreamConfigurationMap = 0;
                            identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 3;
                            if (mutex3.lock(null, identityTokenProviderImpl$fetchWithQueue$1) != coroutine_suspended) {
                            }
                        }
                    }
                    identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex2);
                    identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
                    identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred);
                    identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = null;
                    identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = null;
                    identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = booleanValue;
                    identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 4;
                    java.lang.Object await22 = completableDeferred.await(identityTokenProviderImpl$fetchWithQueue$1);
                    if (await22 != coroutine_suspended) {
                    }
                }
            }
            invoke = function0.invoke();
            if (invoke == null) {
            }
            mutex3.unlock(null);
            completableDeferred = (kotlinx.coroutines.CompletableDeferred) pair.component1();
            booleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
            if (booleanValue) {
            }
            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(mutex2);
            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function0);
            identityTokenProviderImpl$fetchWithQueue$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
            identityTokenProviderImpl$fetchWithQueue$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred);
            identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDuration = null;
            identityTokenProviderImpl$fetchWithQueue$1.getInputSizeshNQ4ISI = null;
            identityTokenProviderImpl$fetchWithQueue$1.getHighSpeedVideoSizesFor = booleanValue;
            identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats = 4;
            java.lang.Object await222 = completableDeferred.await(identityTokenProviderImpl$fetchWithQueue$1);
            if (await222 != coroutine_suspended) {
            }
        } finally {
        }
        identityTokenProviderImpl$fetchWithQueue$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchWithQueue$1(this, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$fetchWithQueue$1.getOutputMinFrameDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$fetchWithQueue$1.getOutputFormats;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Post-login device registration failed unexpectedly", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1 identityTokenProviderImpl$runPostLoginDeviceRegistration$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1) {
            identityTokenProviderImpl$runPostLoginDeviceRegistration$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1) continuation;
            if ((identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.deviceregistration.domain.usecase.PostLoginDeviceRegisterUseCase postLoginDeviceRegisterUseCase = this.getHighSpeedVideoFpsRanges.get();
                    identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (postLoginDeviceRegisterUseCase.invoke(identityTokenProviderImpl$runPostLoginDeviceRegistration$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        identityTokenProviderImpl$runPostLoginDeviceRegistration$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1(this, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$runPostLoginDeviceRegistration$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.coroutines.CompletableDeferred completableDeferred;
                completableDeferred = com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.this.getOutputFormats;
                return completableDeferred;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.$r8$lambda$6iinPdk6YKOqutPEyqAWXPpqJxw(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.this, (kotlinx.coroutines.CompletableDeferred) obj);
            }
        }, new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$getClientAccessToken$4(this, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r8.clearClientAccessToken(r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.identity.api.IdentityTokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invalidateToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$invalidateToken$1 identityTokenProviderImpl$invalidateToken$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        if (continuation instanceof com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$invalidateToken$1) {
            identityTokenProviderImpl$invalidateToken$1 = (com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$invalidateToken$1) continuation;
            if ((identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.ClientAccessTokenType) {
                        com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.Camera2StreamConfigurationMap;
                        identityTokenProviderImpl$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
                        identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap = 1;
                    } else {
                        if (!(tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.Camera2StreamConfigurationMap.clearUserAccessTokenSilently();
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoSizes;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            this.getOutputFormats = null;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            return kotlin.Unit.INSTANCE;
                        } finally {
                            mutex2.unlock(null);
                        }
                    }
                    tokenType = (com.paypal.oslo.core.identity.domain.model.TokenType) identityTokenProviderImpl$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mutex = this.getHighSpeedVideoSizesFor;
                identityTokenProviderImpl$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
                identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoFpsRangesFor = mutex;
                identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoSizes = 0;
                identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap = 2;
                if (mutex.lock(null, identityTokenProviderImpl$invalidateToken$1) != coroutine_suspended) {
                    mutex2 = mutex;
                    this.getOutputFormats = null;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        identityTokenProviderImpl$invalidateToken$1 = new com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$invalidateToken$1(this, continuation);
        java.lang.Object obj2 = identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        mutex = this.getHighSpeedVideoSizesFor;
        identityTokenProviderImpl$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
        identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoFpsRangesFor = mutex;
        identityTokenProviderImpl$invalidateToken$1.getHighSpeedVideoSizes = 0;
        identityTokenProviderImpl$invalidateToken$1.Camera2StreamConfigurationMap = 2;
        if (mutex.lock(null, identityTokenProviderImpl$invalidateToken$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6iinPdk6YKOqutPEyqAWXPpqJxw(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlinx.coroutines.CompletableDeferred completableDeferred) {
        identityTokenProviderImpl.getOutputFormats = completableDeferred;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ykdoPEfP4LWasGYhYPFd250Vyz8(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlinx.coroutines.CompletableDeferred completableDeferred) {
        identityTokenProviderImpl.getInputSizeshNQ4ISI = completableDeferred;
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.identity.domain.model.AuthenticationState.values().length];
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
