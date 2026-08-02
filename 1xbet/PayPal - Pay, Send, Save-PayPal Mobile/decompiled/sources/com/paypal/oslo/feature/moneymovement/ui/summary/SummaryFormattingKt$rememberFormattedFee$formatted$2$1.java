package com.paypal.oslo.feature.moneymovement.ui.summary;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1", f = "SummaryFormatting.kt", i = {0}, l = {114}, m = "invokeSuspend", n = {"$this$produceState"}, nl = {115}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class SummaryFormattingKt$rememberFormattedFee$formatted$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(produceStateScope);
            this.getHighSpeedVideoFpsRanges = produceStateScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = this.getHighSpeedVideoSizes.format(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.String> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1 summaryFormattingKt$rememberFormattedFee$formatted$2$1 = new com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        summaryFormattingKt$rememberFormattedFee$formatted$2$1.getInputSizeshNQ4ISI = obj;
        return summaryFormattingKt$rememberFormattedFee$formatted$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SummaryFormattingKt$rememberFormattedFee$formatted$2$1(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt$rememberFormattedFee$formatted$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = moneyAmountFormatter;
        this.getHighSpeedVideoFpsRangesFor = moneyAmount;
        this.Camera2StreamConfigurationMap = z;
    }
}
