package com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/onboarding/api/navigation/result/AddressSearchNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1", f = "PersonalInfoStepScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult addressSearchNavResult = (com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> mutableState = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.i18n.domain.model.Address) obj2);
            }
        };
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt.handleAddressSearchResult(addressSearchNavResult, function1, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.i18n.domain.model.Address address) {
        mutableState.setValue(address);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(true));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.onboarding.api.navigation.result.AddressSearchNavResult addressSearchNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1) create(addressSearchNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1 personalInfoStepScreenKt$PersonalInfoStepScreen$1$1 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        personalInfoStepScreenKt$PersonalInfoStepScreen$1$1.getHighSpeedVideoFpsRanges = obj;
        return personalInfoStepScreenKt$PersonalInfoStepScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1(androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.ui.PersonalInfoStepScreenKt$PersonalInfoStepScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
    }
}
