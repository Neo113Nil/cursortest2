package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1", f = "AllPhonesScreen.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"result"}, nl = {112}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class AllPhonesScreenKt$AllPhonesScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (phoneSavedNavResult.getAction() != com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.ADD) {
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneSavedNavResult);
                this.Camera2StreamConfigurationMap = 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.showToast(com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.toToastMessage(phoneSavedNavResult.getAction(), this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1) create(phoneSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1 allPhonesScreenKt$AllPhonesScreen$3$1 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        allPhonesScreenKt$AllPhonesScreen$3$1.getHighSpeedVideoFpsRanges = obj;
        return allPhonesScreenKt$AllPhonesScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllPhonesScreenKt$AllPhonesScreen$3$1(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt$AllPhonesScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = commonToastHostState;
        this.getHighSpeedVideoFpsRangesFor = context;
    }
}
