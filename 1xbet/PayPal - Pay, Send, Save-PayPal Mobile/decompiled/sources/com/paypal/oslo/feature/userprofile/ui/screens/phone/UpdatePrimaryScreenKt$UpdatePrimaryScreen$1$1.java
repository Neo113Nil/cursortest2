package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneSavedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1", f = "UpdatePrimaryScreen.kt", i = {0}, l = {83}, m = "invokeSuspend", n = {"result"}, nl = {84}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult phoneSavedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Phone added from update primary screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", phoneSavedNavResult.getAction().name())), null, 4, null);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneSavedNavResult);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoSizes.showToast(com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.toToastMessage(phoneSavedNavResult.getAction(), this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1) create(phoneSavedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1 updatePrimaryScreenKt$UpdatePrimaryScreen$1$1 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        updatePrimaryScreenKt$UpdatePrimaryScreen$1$1.getHighSpeedVideoFpsRanges = obj;
        return updatePrimaryScreenKt$UpdatePrimaryScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1(com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt$UpdatePrimaryScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = commonToastHostState;
        this.Camera2StreamConfigurationMap = context;
    }
}
