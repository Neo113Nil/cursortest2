package com.paypal.oslo.feature.bnplacquisition.data.document;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient", f = "DocumentClient.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {59, 60}, m = "downloadDocument", n = {"request", "fullUrl", "downloadRequest", "request", "fullUrl", "downloadRequest", "downloadId"}, nl = {60, 62}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class DocumentClient$downloadDocument$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.downloadDocument(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentClient$downloadDocument$1(com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient documentClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$downloadDocument$1> continuation) {
        super(continuation);
        this.getInputFormats = documentClient;
    }
}
