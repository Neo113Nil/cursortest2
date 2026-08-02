package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/payair/register/PayairUserRegistration;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkUserRegistrar;", "Lcom/payair/logic/managers/SetupManager;", "setupManager", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "authToken", "Lcom/payair/logic/managers/ConfigurationManager;", "confManager", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;", "isApiLevelSupportedUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/payair/logic/managers/SetupManager;Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;Lcom/payair/logic/managers/ConfigurationManager;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/payair/logic/managers/SetupManager;", "Lcom/paypal/oslo/feature/taptopay/data/payair/register/AuthToken;", "getHighSpeedVideoSizes", "Lcom/payair/logic/managers/ConfigurationManager;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsApiLevelSupportedUseCase;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairUserRegistration implements com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.payair.logic.managers.ConfigurationManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.payair.logic.managers.SetupManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayairUserRegistration(com.payair.logic.managers.SetupManager setupManager, com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken, com.payair.logic.managers.ConfigurationManager configurationManager, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isApiLevelSupportedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = setupManager;
        this.getHighSpeedVideoSizes = authToken;
        this.getHighSpeedVideoFpsRangesFor = configurationManager;
        this.getHighResolutionOutputSizeshNQ4ISI = isApiLevelSupportedUseCase;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r14 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$performRegistration(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$performRegistration$1 payairUserRegistration$performRegistration$1;
        int i;
        com.payair.model.Response response;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$performRegistration$1) {
            payairUserRegistration$performRegistration$1 = (com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$performRegistration$1) continuation;
            if ((payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = payairUserRegistration$performRegistration$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.managers.SetupManager setupManager = payairUserRegistration.getHighSpeedVideoFpsRanges;
                    payairUserRegistration$performRegistration$1.getHighSpeedVideoSizes = str;
                    payairUserRegistration$performRegistration$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap = 1;
                    obj = setupManager.registerPayair(str, "", null, payairUserRegistration$performRegistration$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z2 = payairUserRegistration$performRegistration$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    z = payairUserRegistration$performRegistration$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) payairUserRegistration$performRegistration$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                response = (com.payair.model.Response) obj;
                if (!(response instanceof com.payair.model.Response.Success)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayAir registration successful", null, null, 6, null);
                    payairUserRegistration.getHighSpeedVideoFpsRangesFor.updateJWT(str);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (!(response instanceof com.payair.model.Response.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.payair.model.Response.Error error = (com.payair.model.Response.Error) response;
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayAir registration failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxInt(error.getErrorCode()))), null, null, 12, null);
                int errorCode = error.getErrorCode();
                payairUserRegistration$performRegistration$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                payairUserRegistration$performRegistration$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                payairUserRegistration$performRegistration$1.getHighResolutionOutputSizeshNQ4ISI = z;
                payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap = 2;
                java.lang.Object highSpeedVideoFpsRanges = payairUserRegistration.getHighSpeedVideoFpsRanges(errorCode, z, payairUserRegistration$performRegistration$1);
                return highSpeedVideoFpsRanges == coroutine_suspended ? coroutine_suspended : highSpeedVideoFpsRanges;
            }
        }
        payairUserRegistration$performRegistration$1 = new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$performRegistration$1(payairUserRegistration, continuation);
        java.lang.Object obj2 = payairUserRegistration$performRegistration$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairUserRegistration$performRegistration$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (!(response instanceof com.payair.model.Response.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$retrieveAuthToken(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$retrieveAuthToken$1 payairUserRegistration$retrieveAuthToken$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$retrieveAuthToken$1) {
            payairUserRegistration$retrieveAuthToken$1 = (com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$retrieveAuthToken$1) continuation;
            if ((payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payairUserRegistration$retrieveAuthToken$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken = payairUserRegistration.getHighSpeedVideoSizes;
                    payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = authToken.getToken(payairUserRegistration$retrieveAuthToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState tokenRefreshState = (com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState) obj;
                        if (tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success) {
                            return ((com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success) tokenRefreshState).getToken();
                        }
                        if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to refresh empty auth token", null, null, null, 14, null);
                        return null;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str.length() <= 0) {
                    return str;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth token is empty, refreshing token", null, null, 6, null);
                com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken2 = payairUserRegistration.getHighSpeedVideoSizes;
                payairUserRegistration$retrieveAuthToken$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = authToken2.refreshToken(payairUserRegistration$retrieveAuthToken$1);
            }
        }
        payairUserRegistration$retrieveAuthToken$1 = new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$retrieveAuthToken$1(payairUserRegistration, continuation);
        java.lang.Object obj2 = payairUserRegistration$retrieveAuthToken$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairUserRegistration$retrieveAuthToken$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str.length() <= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(int i, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError, kotlin.Unit>> continuation) {
        if (i != 102) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed("PayAir registration failed with error code: ".concat(java.lang.String.valueOf(i)), kotlin.coroutines.jvm.internal.Boxing.boxInt(i)));
        }
        return getHighResolutionOutputSizeshNQ4ISI(z, i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r14 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(boolean z, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$handleAuthenticationFailure$1 payairUserRegistration$handleAuthenticationFailure$1;
        int i2;
        com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState tokenRefreshState;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$handleAuthenticationFailure$1) {
            payairUserRegistration$handleAuthenticationFailure$1 = (com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$handleAuthenticationFailure$1) continuation;
            if ((payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth token invalid or expired even after refresh, failing registration", null, null, 6, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed("PayAir registration failed due to invalid or expired auth token", kotlin.coroutines.jvm.internal.Boxing.boxInt(i)));
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth token invalid or expired, refreshing token and retrying registration", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.data.payair.register.AuthToken authToken = this.getHighSpeedVideoSizes;
                    payairUserRegistration$handleAuthenticationFailure$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoFpsRangesFor = i;
                    payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap = 1;
                    obj = authToken.refreshToken(payairUserRegistration$handleAuthenticationFailure$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoFpsRangesFor;
                        boolean z2 = payairUserRegistration$handleAuthenticationFailure$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    i = payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoFpsRangesFor;
                    z = payairUserRegistration$handleAuthenticationFailure$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                tokenRefreshState = (com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState) obj;
                if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Token refreshed successfully, retrying registration", null, null, 6, null);
                    payairUserRegistration$handleAuthenticationFailure$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoFpsRangesFor = i;
                    payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap = 2;
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2(this, true, null), payairUserRegistration$handleAuthenticationFailure$1);
                    return withContext == coroutine_suspended ? coroutine_suspended : withContext;
                }
                if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to refresh token", null, null, null, 14, null);
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed("Failed to refresh auth token"));
            }
        }
        payairUserRegistration$handleAuthenticationFailure$1 = new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$handleAuthenticationFailure$1(this, continuation);
        java.lang.Object obj2 = payairUserRegistration$handleAuthenticationFailure$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = payairUserRegistration$handleAuthenticationFailure$1.Camera2StreamConfigurationMap;
        if (i2 != 0) {
        }
        tokenRefreshState = (com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState) obj2;
        if (!(tokenRefreshState instanceof com.paypal.oslo.feature.taptopay.data.payair.register.TokenRefreshState.Success)) {
        }
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError, kotlin.Unit>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2(this, false, null), continuation);
    }
}
