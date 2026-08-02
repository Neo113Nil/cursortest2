package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$verifyOtpCode$1", f = "OTPVerificationViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {"input"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class OTPVerificationViewModel$verifyOtpCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase completePhoneConfirmationUseCase;
        java.lang.String str2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Verifying OTP code", null, null, 6, null);
            java.lang.String str3 = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneContact access$createPhoneContact = com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel.access$createPhoneContact(this.getHighSpeedVideoFpsRanges);
            str = this.getHighSpeedVideoFpsRanges.getOutputFormats;
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput oTPVerificationInput = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.OTPVerificationInput(str3, access$createPhoneContact, str);
            completePhoneConfirmationUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(oTPVerificationInput);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = completePhoneConfirmationUseCase.invoke(oTPVerificationInput, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel oTPVerificationViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "OTP verification succeeded", null, null, 6, null);
            str2 = oTPVerificationViewModel.getHighSpeedVideoFpsRangesFor;
            function1.invoke(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationSucceeded(str2));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError phoneConfirmationError = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "OTP verification failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(phoneConfirmationError.getClass()).getSimpleName())), null, null, 12, null);
            function1.invoke(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent.VerificationFailed(phoneConfirmationError));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$verifyOtpCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$verifyOtpCode$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OTPVerificationViewModel$verifyOtpCode$1(java.lang.String str, com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel oTPVerificationViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel$verifyOtpCode$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = oTPVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
