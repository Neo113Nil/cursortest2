package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/AddressSearchNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1", f = "PersonalInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PersonalInfoScreenKt$PersonalInfoScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult addressSearchNavResult = (com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome outcome = addressSearchNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.AddressSelected) {
            this.getHighSpeedVideoFpsRanges.handleAddressSelected(((com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.AddressSelected) outcome).getAddress());
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult.Outcome.ManualEntryRequested)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.switchToManualAddressEntry();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult addressSearchNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1) create(addressSearchNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1 personalInfoScreenKt$PersonalInfoScreen$2$1 = new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        personalInfoScreenKt$PersonalInfoScreen$2$1.getHighSpeedVideoSizes = obj;
        return personalInfoScreenKt$PersonalInfoScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoScreenKt$PersonalInfoScreen$2$1(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = personalInfoViewModel;
    }
}
