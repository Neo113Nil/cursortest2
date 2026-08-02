package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$5$1", f = "FinicityFlowScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FinicityFlowScreenKt$FinicityFlowScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.app.Activity getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Activity activity = this.getHighSpeedVideoFpsRanges;
        if (activity != null) {
            this.Camera2StreamConfigurationMap.launchConnectSdk(activity, this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            this.Camera2StreamConfigurationMap.sdkLaunchFailed();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$5$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinicityFlowScreenKt$FinicityFlowScreen$5$1(android.app.Activity activity, com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activity;
        this.Camera2StreamConfigurationMap = finicityFlowViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
