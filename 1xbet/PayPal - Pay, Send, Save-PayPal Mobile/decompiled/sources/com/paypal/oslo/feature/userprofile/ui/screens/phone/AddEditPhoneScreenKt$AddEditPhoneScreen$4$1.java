package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1", f = "AddEditPhoneScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneScreenKt$AddEditPhoneScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
        final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> mutableState = this.getHighSpeedVideoFpsRanges;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.this, mutableState, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.copy$default(phoneSavedNavResult, null, com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt.access$AddEditPhoneScreen$lambda$12(mutableState), 1, null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1) create(phoneSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1 addEditPhoneScreenKt$AddEditPhoneScreen$4$1 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        addEditPhoneScreenKt$AddEditPhoneScreen$4$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return addEditPhoneScreenKt$AddEditPhoneScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneScreenKt$AddEditPhoneScreen$4$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
