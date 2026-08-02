package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1", f = "AmountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AmountScreenKt$AmountScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<java.lang.String> getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel getOutputFormats;
    final /* synthetic */ java.util.List<java.lang.String> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getOutputFormats.initialize(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountScreenKt$AmountScreen$1$1(com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountViewModel amountViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountScreenKt$AmountScreen$1$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = amountViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = autoReloadAmountIntent;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getInputFormats = str2;
        this.getHighSpeedVideoSizesFor = str3;
        this.getOutputMinFrameDuration = list;
        this.Camera2StreamConfigurationMap = str4;
        this.getHighSpeedVideoFpsRanges = str5;
        this.getHighSpeedVideoSizes = list2;
    }
}
