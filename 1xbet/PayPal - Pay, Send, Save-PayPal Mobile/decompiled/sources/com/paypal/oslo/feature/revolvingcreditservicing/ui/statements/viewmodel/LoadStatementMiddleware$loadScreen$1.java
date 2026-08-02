package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware", f = "LoadStatementMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {53, 56}, m = "loadScreen", n = {"args", "eventDispatcher", "creditProductIdentifier", "request", "args", "eventDispatcher", "creditProductIdentifier", "request", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-LoadStatementMiddleware$loadScreen$3"}, nl = {68, 57}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class LoadStatementMiddleware$loadScreen$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadStatementMiddleware$loadScreen$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware loadStatementMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware$loadScreen$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = loadStatementMiddleware;
    }
}
