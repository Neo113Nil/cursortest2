package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware", f = "DownloadStatementMiddleware.kt", i = {0, 0}, l = {37}, m = "downloadStatement", n = {"state", "eventDispatcher"}, nl = {42}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class DownloadStatementMiddleware$downloadStatement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadStatementMiddleware$downloadStatement$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware downloadStatementMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware$downloadStatement$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = downloadStatementMiddleware;
    }
}
