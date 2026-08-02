package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware", f = "FetchAccountSummaryMiddleware.kt", i = {0, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {61, 58, 77, 82}, m = "fetchAccountSummary", n = {"eventDispatcher", "eventDispatcher", "eventDispatcher", "accountSummaryResult", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-FetchAccountSummaryMiddleware$fetchAccountSummary$3", "eventDispatcher", "accountSummaryResult", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-FetchAccountSummaryMiddleware$fetchAccountSummary$4"}, nl = {59, 65, 81, 167}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class FetchAccountSummaryMiddleware$fetchAccountSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputFormats.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAccountSummaryMiddleware$fetchAccountSummary$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware fetchAccountSummaryMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$fetchAccountSummary$1> continuation) {
        super(continuation);
        this.getOutputFormats = fetchAccountSummaryMiddleware;
    }
}
