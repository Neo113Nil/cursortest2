package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl", f = "DownloadEngineImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "emitDownloadResult", n = {"$this$emitDownloadResult", "targetFile", "entity", "response", "$this$emitDownloadResult", "targetFile", "entity", "response", "validationResult", "$this$emitDownloadResult", "targetFile", "entity", "response", "validationResult", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE}, nl = {236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadEngineImpl$emitDownloadResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$emitDownloadResult(this.getInputFormats, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadEngineImpl$emitDownloadResult$1(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$emitDownloadResult$1> continuation) {
        super(continuation);
        this.getInputFormats = downloadEngineImpl;
    }
}
