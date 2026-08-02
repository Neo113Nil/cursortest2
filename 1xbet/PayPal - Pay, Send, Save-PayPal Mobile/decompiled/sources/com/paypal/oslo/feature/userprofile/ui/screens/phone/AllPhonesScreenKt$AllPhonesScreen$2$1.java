package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1", f = "AllPhonesScreen.kt", i = {0}, l = {102}, m = "invokeSuspend", n = {"result"}, nl = {103}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AllPhonesScreenKt$AllPhonesScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneSavedNavResult);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.showToast(com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.toToastMessage(phoneSavedNavResult.getAction(), this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1) create(phoneSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1 allPhonesScreenKt$AllPhonesScreen$2$1 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        allPhonesScreenKt$AllPhonesScreen$2$1.Camera2StreamConfigurationMap = obj;
        return allPhonesScreenKt$AllPhonesScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllPhonesScreenKt$AllPhonesScreen$2$1(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = commonToastHostState;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
