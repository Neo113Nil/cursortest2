package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor", f = "DownloadFileExecutor.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {58, 60}, m = "execute", n = {"request", "targetFile", "request", "targetFile", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-DownloadFileExecutor$execute$3"}, nl = {179, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class DownloadFileExecutor$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.execute(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileExecutor$execute$1(com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor downloadFileExecutor, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$execute$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = downloadFileExecutor;
    }
}
