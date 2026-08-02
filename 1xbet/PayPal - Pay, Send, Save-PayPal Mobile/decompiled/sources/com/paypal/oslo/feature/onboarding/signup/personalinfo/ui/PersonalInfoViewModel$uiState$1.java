package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/PersonalInfoUiState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "showModal", "", "componentStates", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel$uiState$1", f = "PersonalInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PersonalInfoViewModel$uiState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function4<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData, java.lang.Boolean, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData = (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData) this.Camera2StreamConfigurationMap;
        boolean z = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap = (com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState(new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PersonalData(new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.NameData(signupData.getName().m16304getFirstNamew8YRmDk(), signupData.getName().m16305getLastNamei7KAUmI(), null), signupData.getAddress()), z, mutableComponentStateMap);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.Boolean bool, com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoUiState> continuation) {
        boolean booleanValue = bool.booleanValue();
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel$uiState$1 personalInfoViewModel$uiState$1 = new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel$uiState$1(continuation);
        personalInfoViewModel$uiState$1.Camera2StreamConfigurationMap = signupData;
        personalInfoViewModel$uiState$1.getHighSpeedVideoFpsRanges = booleanValue;
        personalInfoViewModel$uiState$1.getHighSpeedVideoSizes = mutableComponentStateMap;
        return personalInfoViewModel$uiState$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    PersonalInfoViewModel$uiState$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel$uiState$1> continuation) {
        super(4, continuation);
    }
}
