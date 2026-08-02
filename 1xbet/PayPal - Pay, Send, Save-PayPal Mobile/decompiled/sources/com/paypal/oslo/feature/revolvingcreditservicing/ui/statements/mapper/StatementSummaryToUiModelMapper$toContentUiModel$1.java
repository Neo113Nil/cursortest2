package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper", f = "StatementSummaryToUiModelMapper.kt", i = {0, 0}, l = {81}, m = "toContentUiModel", n = {"$this$toContentUiModel", "formattingLocale"}, nl = {82}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class StatementSummaryToUiModelMapper$toContentUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementSummaryToUiModelMapper$toContentUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper statementSummaryToUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper$toContentUiModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = statementSummaryToUiModelMapper;
    }
}
