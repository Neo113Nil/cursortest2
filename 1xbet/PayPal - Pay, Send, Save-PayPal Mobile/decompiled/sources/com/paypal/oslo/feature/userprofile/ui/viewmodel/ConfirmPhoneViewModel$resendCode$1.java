package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$resendCode$1", f = "ConfirmPhoneViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {}, nl = {225}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmPhoneViewModel$resendCode$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase reinitiatePhoneConfirmationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow9;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow10;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow11;
        android.content.Context context;
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getInputFormats;
                mutableStateFlow2.setValue(null);
                mutableStateFlow3 = this.getHighSpeedVideoSizes.getOutputStallDurationlomOqCM;
                mutableStateFlow3.setValue(null);
                reinitiatePhoneConfirmationUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 1;
                obj = reinitiatePhoneConfirmationUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor.getAuthId(), this.getHighSpeedVideoFpsRangesFor.getChallengeId(), this);
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
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel = this.getHighSpeedVideoSizes;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = (com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge) ((arrow.core.Either.Right) either).getValue();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Phone confirmation code resent successfully:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str2)), null, 4, null);
                confirmPhoneViewModel.getHighSpeedVideoFpsRangesFor = phoneConfirmationChallenge;
                mutableStateFlow7 = confirmPhoneViewModel.getInputSizeshNQ4ISI;
                mutableStateFlow7.setValue("");
                mutableStateFlow8 = confirmPhoneViewModel.getInputFormats;
                mutableStateFlow8.setValue(null);
                mutableStateFlow9 = confirmPhoneViewModel.getOutputStallDurationlomOqCM;
                mutableStateFlow9.setValue(null);
                mutableStateFlow10 = confirmPhoneViewModel.getHighSpeedVideoSizesFor;
                mutableStateFlow10.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Success.INSTANCE);
                mutableStateFlow11 = confirmPhoneViewModel.getOutputSizes;
                context = confirmPhoneViewModel.getHighSpeedVideoFpsRanges;
                int i2 = com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_email_confirmation_email_body;
                str = confirmPhoneViewModel.getOutputFormats;
                mutableStateFlow11.setValue(context.getString(i2, str));
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError = (com.paypal.oslo.feature.userprofile.domain.model.PhoneError) ((arrow.core.Either.Left) either).getValue();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to resend phone confirmation code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str2), kotlin.TuplesKt.to("error", phoneError.toString())), null, 4, null);
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone().trackPhoneError(phoneError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_CONFIRM_PHONE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.RESEND, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.RESEND_CODE_FAILED);
                mutableStateFlow4 = confirmPhoneViewModel.getHighSpeedVideoSizesFor;
                mutableStateFlow4.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Success.INSTANCE);
                if (!(phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError)) {
                    mutableStateFlow5 = confirmPhoneViewModel.getInputFormats;
                    mutableStateFlow5.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$mapPhoneErrorToMessage(confirmPhoneViewModel, phoneError));
                } else {
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$handleValidationError(confirmPhoneViewModel, (com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) phoneError);
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableStateFlow6 = this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM;
            mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.getHighSpeedVideoSizes.getOutputMinFrameDurationlomOqCM;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$resendCode$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$resendCode$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmPhoneViewModel$resendCode$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, java.lang.String str, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$resendCode$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = confirmPhoneViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = phoneConfirmationChallenge;
    }
}
