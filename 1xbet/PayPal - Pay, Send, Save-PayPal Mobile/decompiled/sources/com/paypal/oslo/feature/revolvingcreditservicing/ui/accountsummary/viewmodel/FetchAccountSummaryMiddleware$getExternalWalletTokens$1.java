package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware", f = "FetchAccountSummaryMiddleware.kt", i = {}, l = {87, 88}, m = "getExternalWalletTokens", n = {}, nl = {88, 91}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class FetchAccountSummaryMiddleware$getExternalWalletTokens$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAccountSummaryMiddleware$getExternalWalletTokens$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware fetchAccountSummaryMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$getExternalWalletTokens$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = fetchAccountSummaryMiddleware;
    }
}
