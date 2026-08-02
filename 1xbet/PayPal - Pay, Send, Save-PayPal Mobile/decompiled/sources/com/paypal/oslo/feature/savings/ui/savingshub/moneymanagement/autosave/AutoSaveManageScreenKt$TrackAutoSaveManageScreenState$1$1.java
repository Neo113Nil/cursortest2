package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1", f = "AutoSaveManageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        switch (str.hashCode()) {
            case -1050195209:
                if (str.equals("error_network")) {
                    com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsErrorScreen(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.SCREEN_MANAGE_ERROR, "NETWORK_ERROR", "network");
                    break;
                }
                break;
            case 336650556:
                if (str.equals("loading")) {
                    com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsScreen$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.SCREEN_MANAGE_LOADING, null, 2, null);
                    break;
                }
                break;
            case 386302298:
                if (str.equals("error_server")) {
                    com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsErrorScreen(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.SCREEN_MANAGE_ERROR, "AUTOSAVE_MANAGE_ERROR", "server");
                    break;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsScreen$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.SCREEN_MANAGE_CONTENT, null, 2, null);
                    break;
                }
                break;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
    }
}
