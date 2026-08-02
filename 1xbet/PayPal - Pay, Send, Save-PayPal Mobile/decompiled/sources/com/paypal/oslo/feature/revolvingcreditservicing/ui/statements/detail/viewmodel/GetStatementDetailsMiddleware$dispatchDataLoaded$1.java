package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware", f = "GetStatementDetailsMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {99, 100, 102, 103, 107, 108}, m = "dispatchDataLoaded", n = {"statementDetails", "productIdentifier", "eventDispatcher", "statementDetails", "productIdentifier", "eventDispatcher", "headerUiModel", "statementDetails", "productIdentifier", "eventDispatcher", "headerUiModel", "statementSummaryUiModel", "productConfigurations", "statementDetails", "productIdentifier", "eventDispatcher", "headerUiModel", "statementSummaryUiModel", "productConfigurations", "paymentsUiModel", "statementDetails", "productIdentifier", "eventDispatcher", "headerUiModel", "statementSummaryUiModel", "productConfigurations", "paymentsUiModel", "specialFinancingSection", "statementDetails", "productIdentifier", "eventDispatcher", "headerUiModel", "statementSummaryUiModel", "productConfigurations", "paymentsUiModel", "specialFinancingSection", "cashbackSection"}, nl = {100, 101, 103, 107, 108, 109}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
/* loaded from: classes14.dex */
final class GetStatementDetailsMiddleware$dispatchDataLoaded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputStallDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetStatementDetailsMiddleware$dispatchDataLoaded$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getStatementDetailsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$dispatchDataLoaded$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = getStatementDetailsMiddleware;
    }
}
