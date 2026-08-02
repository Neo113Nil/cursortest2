package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper", f = "SpecialFinancingDetailMapper.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {43, 46, 49}, m = "toDetailUiModel", n = {"activity", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "it", "$i$a$-let-SpecialFinancingDetailMapper$toDetailUiModel$formattedRemainingBalance$1", "activity", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "formattedRemainingBalance", "it", "$i$a$-let-SpecialFinancingDetailMapper$toDetailUiModel$formattedPurchaseAmount$1", "activity", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "formattedRemainingBalance", "formattedPurchaseAmount", "it", "$i$a$-let-SpecialFinancingDetailMapper$toDetailUiModel$formattedAccruedInterest$1"}, nl = {42, 45, 48}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class SpecialFinancingDetailMapper$toDetailUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.toDetailUiModel(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpecialFinancingDetailMapper$toDetailUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper specialFinancingDetailMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.detail.mapper.SpecialFinancingDetailMapper$toDetailUiModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = specialFinancingDetailMapper;
    }
}
