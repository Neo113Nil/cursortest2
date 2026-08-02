package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadFrequencyNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1", f = "AutoReloadScheduledScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult autoReloadFrequencyNavResult = (com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.processIntent(new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnScheduledFrequencySelected(autoReloadFrequencyNavResult.getStartDate(), autoReloadFrequencyNavResult.getFrequency()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult autoReloadFrequencyNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1) create(autoReloadFrequencyNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1 autoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1(this.getHighSpeedVideoSizes, continuation);
        autoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1.getHighSpeedVideoFpsRanges = obj;
        return autoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoReloadScheduledViewModel;
    }
}
