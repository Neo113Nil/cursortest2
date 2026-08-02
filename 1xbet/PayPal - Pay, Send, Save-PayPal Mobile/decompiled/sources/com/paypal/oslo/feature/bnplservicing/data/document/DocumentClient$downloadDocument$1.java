package com.paypal.oslo.feature.bnplservicing.data.document;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient", f = "DocumentClient.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {55, 58}, m = "downloadDocument", n = {"request", "$this$downloadDocument_u24lambda_u240", "fullUrl", "downloadRequestResult", "downloadRequest", "$i$a$-runCatching-DocumentClient$downloadDocument$2", "request", "$this$downloadDocument_u24lambda_u240", "fullUrl", "downloadRequestResult", "downloadId", "downloadRequest", "$i$a$-runCatching-DocumentClient$downloadDocument$2"}, nl = {58, 64}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class DocumentClient$downloadDocument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.downloadDocument(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentClient$downloadDocument$1(com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient documentClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = documentClient;
    }
}
