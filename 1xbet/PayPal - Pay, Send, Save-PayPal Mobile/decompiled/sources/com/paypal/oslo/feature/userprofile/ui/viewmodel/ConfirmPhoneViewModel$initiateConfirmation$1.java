package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$initiateConfirmation$1", f = "ConfirmPhoneViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, nl = {309}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmPhoneViewModel$initiateConfirmation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Loading.INSTANCE);
            initiatePhoneConfirmationUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = initiatePhoneConfirmationUseCase.invoke(this.getHighSpeedVideoSizes, this);
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
        java.lang.String str = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge = (com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Phone confirmation initiated successfully:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str)), null, 4, null);
            confirmPhoneViewModel.getHighSpeedVideoFpsRangesFor = phoneConfirmationChallenge;
            mutableStateFlow4 = confirmPhoneViewModel.getHighSpeedVideoSizesFor;
            mutableStateFlow4.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Success.INSTANCE);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError = (com.paypal.oslo.feature.userprofile.domain.model.PhoneError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to initiate phone confirmation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str), kotlin.TuplesKt.to("error", phoneError.toString())), null, 4, null);
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone().trackPhoneError(phoneError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_CONFIRM_PHONE, "view", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.INITIATE_CONFIRMATION_FAILED);
            mutableStateFlow2 = confirmPhoneViewModel.getHighSpeedVideoSizesFor;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Success.INSTANCE);
            if (!(phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError)) {
                mutableStateFlow3 = confirmPhoneViewModel.getOutputStallDurationlomOqCM;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$mapPhoneErrorToMessage(confirmPhoneViewModel, phoneError));
            } else {
                com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$handleValidationError(confirmPhoneViewModel, (com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) phoneError);
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$initiateConfirmation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$initiateConfirmation$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmPhoneViewModel$initiateConfirmation$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$initiateConfirmation$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = confirmPhoneViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
