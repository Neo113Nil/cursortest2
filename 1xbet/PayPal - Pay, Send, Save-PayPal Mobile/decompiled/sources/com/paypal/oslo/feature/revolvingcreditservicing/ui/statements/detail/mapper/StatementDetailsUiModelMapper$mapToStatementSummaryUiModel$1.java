package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper", f = "StatementDetailsUiModelMapper.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {106, 107, 108, 109, 112}, m = "mapToStatementSummaryUiModel", n = {"statementDetails", "creditProductIdentifier", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedClosingDate", "statementDetails", "creditProductIdentifier", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedClosingDate", "statementDetails", "creditProductIdentifier", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedClosingDate", "statementDetails", "creditProductIdentifier", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedClosingDate", "statementDetails", "creditProductIdentifier", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "formattedClosingDate"}, nl = {107, 108, 111, 112, 113}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class StatementDetailsUiModelMapper$mapToStatementSummaryUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizes.mapToStatementSummaryUiModel(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementDetailsUiModelMapper$mapToStatementSummaryUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper statementDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.mapper.StatementDetailsUiModelMapper$mapToStatementSummaryUiModel$1> continuation) {
        super(continuation);
        this.getOutputSizes = statementDetailsUiModelMapper;
    }
}
