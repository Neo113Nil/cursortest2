package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware", f = "GetStatementDetailsMiddleware.kt", i = {0, 0, 0}, l = {136}, m = "downloadStatement", n = {"args", "eventDispatcher", "requestCreditAccountId"}, nl = {141}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class GetStatementDetailsMiddleware$downloadStatement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetStatementDetailsMiddleware$downloadStatement$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getStatementDetailsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware$downloadStatement$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = getStatementDetailsMiddleware;
    }
}
