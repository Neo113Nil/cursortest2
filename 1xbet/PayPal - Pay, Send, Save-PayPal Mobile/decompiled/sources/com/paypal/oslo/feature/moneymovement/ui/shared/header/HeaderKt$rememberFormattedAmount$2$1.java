package com.paypal.oslo.feature.moneymovement.ui.shared.header;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$rememberFormattedAmount$2$1", f = "Header.kt", i = {0}, l = {316}, m = "invokeSuspend", n = {"$this$produceState"}, nl = {317}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class HeaderKt$rememberFormattedAmount$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = produceStateScope;
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.format(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (str2 != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            str = sb.toString();
        }
        produceStateScope.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.String> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$rememberFormattedAmount$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$rememberFormattedAmount$2$1 headerKt$rememberFormattedAmount$2$1 = new com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$rememberFormattedAmount$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        headerKt$rememberFormattedAmount$2$1.getOutputMinFrameDuration = obj;
        return headerKt$rememberFormattedAmount$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeaderKt$rememberFormattedAmount$2$1(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt$rememberFormattedAmount$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = moneyAmountFormatter;
        this.getHighSpeedVideoFpsRanges = moneyAmount;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
