package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware", f = "FetchAccountSummaryMiddleware.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {97, 112, 118, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, m = "onAccountSummaryResult", n = {"result", "eventDispatcher", "result", "eventDispatcher", "balanceModuleUiModel", "result", "eventDispatcher", "balanceModuleUiModel", "result", "eventDispatcher", "balanceModuleUiModel", "result", "eventDispatcher", "balanceModuleUiModel"}, nl = {102, 116, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 125, 108}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class FetchAccountSummaryMiddleware$onAccountSummaryResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAccountSummaryMiddleware$onAccountSummaryResult$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware fetchAccountSummaryMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$onAccountSummaryResult$1> continuation) {
        super(continuation);
        this.getOutputSizes = fetchAccountSummaryMiddleware;
    }
}
