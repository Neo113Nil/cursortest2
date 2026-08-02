package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$confirmPhone$1", f = "ConfirmPhoneViewModel.kt", i = {1, 1, 1, 1}, l = {179, 199}, m = "invokeSuspend", n = {"this_$iv", "verifiedPhone", "$i$f$fold", "$i$a$-fold-ConfirmPhoneViewModel$confirmPhone$1$2"}, nl = {185, 200}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmPhoneViewModel$confirmPhone$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r13 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase verifyPhoneUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.getInputFormats.getInputFormats;
                mutableStateFlow2.setValue(null);
                mutableStateFlow3 = this.getInputFormats.getOutputStallDurationlomOqCM;
                mutableStateFlow3.setValue(null);
                verifyPhoneUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
                java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
                java.lang.String authId = this.getHighSpeedVideoFpsRanges.getAuthId();
                java.lang.String challengeId = this.getHighSpeedVideoFpsRanges.getChallengeId();
                mutableStateFlow4 = this.getInputFormats.getInputSizeshNQ4ISI;
                this.getOutputFormats = 1;
                obj = verifyPhoneUseCase.invoke(str, authId, challengeId, (java.lang.String) mutableStateFlow4.getValue(), false, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableStateFlow6 = this.getInputFormats.getOutputStallDuration;
                    mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            arrow.core.Either either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel = this.getInputFormats;
            if (either instanceof arrow.core.Either.Right) {
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((arrow.core.Either.Right) either).getValue();
                mutableSharedFlow = confirmPhoneViewModel.getOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent.ConfirmationSuccess confirmationSuccess = new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneEvent.ConfirmationSuccess(profilePhone);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profilePhone);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getOutputFormats = 2;
                if (mutableSharedFlow.emit(confirmationSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError = (com.paypal.oslo.feature.userprofile.domain.model.PhoneError) ((arrow.core.Either.Left) either).getValue();
                com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone().trackPhoneError(phoneError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_CONFIRM_PHONE, "confirm", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.CONFIRM_FAILED);
                if (!(phoneError instanceof com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError)) {
                    mutableStateFlow5 = confirmPhoneViewModel.getInputFormats;
                    mutableStateFlow5.setValue(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$mapPhoneErrorToMessage(confirmPhoneViewModel, phoneError));
                } else {
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.access$handleValidationError(confirmPhoneViewModel, (com.paypal.oslo.feature.userprofile.domain.model.PhoneError.ValidationError) phoneError);
                }
            }
            mutableStateFlow6 = this.getInputFormats.getOutputStallDuration;
            mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutableStateFlow = this.getInputFormats.getOutputStallDuration;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$confirmPhone$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$confirmPhone$1(this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmPhoneViewModel$confirmPhone$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, java.lang.String str, com.paypal.oslo.feature.userprofile.domain.model.phone.PhoneConfirmationChallenge phoneConfirmationChallenge, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel$confirmPhone$1> continuation) {
        super(2, continuation);
        this.getInputFormats = confirmPhoneViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = phoneConfirmationChallenge;
    }
}
