package com.paypal.oslo.feature.taptopay.data.observer.auth;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLoginObserver;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;", "isNfcSupportedUseCase", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/PayairAccessTokenUpdater;", "accessTokenUpdater", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkUserRegistrar;", "sdkUserRegistrar", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;", "syncFailedNotifyCallsUseCase", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcSupportedUseCase;Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/PayairAccessTokenUpdater;Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkUserRegistrar;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/payair/csdk/PayairAccessTokenUpdater;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkUserRegistrar;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSyncAllFailedNotifyCallsUseCase;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayLoginObserver implements com.paypal.oslo.core.session.LogoutObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public TapToPayLoginObserver(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcSupportedUseCase isNfcSupportedUseCase, com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater payairAccessTokenUpdater, com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar sdkUserRegistrar, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcSupportedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairAccessTokenUpdater, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkUserRegistrar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSyncAllFailedNotifyCallsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.Camera2StreamConfigurationMap = payairAccessTokenUpdater;
        this.getHighSpeedVideoSizes = sdkUserRegistrar;
        this.getHighSpeedVideoFpsRanges = payPalSyncAllFailedNotifyCallsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        if (isNfcSupportedUseCase.invoke()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$observeUserState$1(this, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay login observer skipped: NFC not supported", null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(3:21|22|(2:24|20))|18))|29|6|7|(0)(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r12.invoke(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to handle login", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "handle_login")), null, r12, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleLogin$1 tapToPayLoginObserver$handleLogin$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleLogin$1) {
            tapToPayLoginObserver$handleLogin$1 = (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleLogin$1) continuation;
            if ((tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = tapToPayLoginObserver$handleLogin$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay login detected", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "updating_token_and_syncing")), null, 4, null);
                    com.paypal.oslo.feature.taptopay.data.payair.csdk.PayairAccessTokenUpdater payairAccessTokenUpdater = this.Camera2StreamConfigurationMap;
                    tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes = 1;
                    if (payairAccessTokenUpdater.update(tapToPayLoginObserver$handleLogin$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase = this.getHighSpeedVideoFpsRanges;
                tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes = 2;
            }
        }
        tapToPayLoginObserver$handleLogin$1 = new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleLogin$1(this, continuation);
        java.lang.Object obj2 = tapToPayLoginObserver$handleLogin$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSyncAllFailedNotifyCallsUseCase payPalSyncAllFailedNotifyCallsUseCase2 = this.getHighSpeedVideoFpsRanges;
        tapToPayLoginObserver$handleLogin$1.getHighSpeedVideoSizes = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:25|26))(3:27|28|(1:30))|11|(5:13|14|(1:16)(1:21)|(1:18)|19)|22|23))|35|6|7|(0)(0)|11|(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to register user with Payair SDK", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "payair_registration")), null, r11, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0099, CancellationException -> 0x00b4, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00b4, all -> 0x0099, blocks: (B:10:0x0026, B:11:0x004b, B:13:0x0053, B:16:0x007a, B:18:0x0080, B:19:0x0084, B:28:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleProfileLoaded$1 tapToPayLoginObserver$handleProfileLoaded$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleProfileLoaded$1) {
            tapToPayLoginObserver$handleProfileLoaded$1 = (com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleProfileLoaded$1) continuation;
            if ((tapToPayLoginObserver$handleProfileLoaded$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                tapToPayLoginObserver$handleProfileLoaded$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = tapToPayLoginObserver$handleProfileLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapToPayLoginObserver$handleProfileLoaded$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay profile loaded, registering user with Payair SDK", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.sdk.SdkUserRegistrar sdkUserRegistrar = this.getHighSpeedVideoSizes;
                    tapToPayLoginObserver$handleProfileLoaded$1.getHighSpeedVideoFpsRanges = 1;
                    obj = sdkUserRegistrar.invoke(tapToPayLoginObserver$handleProfileLoaded$1);
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
                if (either.isLeft()) {
                    com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError payairUserRegistrationError = (com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(payairUserRegistrationError.getClass()).getSimpleName());
                    com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed registrationFailed = payairUserRegistrationError instanceof com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed ? (com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed) payairUserRegistrationError : null;
                    pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE, registrationFailed != null ? registrationFailed.getErrorCode() : null);
                    com.paypal.android.logger.Logger.w$default(logger, "Payair user registration failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        tapToPayLoginObserver$handleProfileLoaded$1 = new com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver$handleProfileLoaded$1(this, continuation);
        java.lang.Object obj2 = tapToPayLoginObserver$handleProfileLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapToPayLoginObserver$handleProfileLoaded$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
