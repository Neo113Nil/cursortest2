package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/register/PayairUserRegistrationError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2", f = "PayairUserRegistration.kt", i = {1}, l = {76, 80}, m = "invokeSuspend", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {77, -1}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairUserRegistration$register$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError, ? extends kotlin.Unit>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r11 != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.device.IsApiLevelSupportedUseCase isApiLevelSupportedUseCase;
        com.payair.logic.managers.SetupManager setupManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running PayAirRegisterUseCase", null, null, 6, null);
            isApiLevelSupportedUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            if (isApiLevelSupportedUseCase.invoke()) {
                setupManager = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                if (setupManager.checkRegistrationStatus() == com.payair.model.RegistrationStatus.REGISTERED) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device already PayAir registered, skipping register call", null, null, 6, null);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration.access$retrieveAuthToken(this.getHighSpeedVideoFpsRangesFor, this);
            } else {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair registration skipped: Device API level is below minimum required (Android P / API 28)", null, null, 6, null);
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.RegistrationFailed(com.paypal.oslo.feature.taptopay.domain.PayairRequirements.UNSUPPORTED_API_LEVEL_MESSAGE, null, 2, null));
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError.TokenRefreshFailed("Failed to refresh empty auth token"));
        }
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object access$performRegistration = com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration.access$performRegistration(this.getHighSpeedVideoFpsRangesFor, str, this.getHighSpeedVideoFpsRanges, this);
        return access$performRegistration == coroutine_suspended ? coroutine_suspended : access$performRegistration;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.register.PayairUserRegistrationError, ? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairUserRegistration$register$2(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$register$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = payairUserRegistration;
        this.getHighSpeedVideoFpsRanges = z;
    }
}
