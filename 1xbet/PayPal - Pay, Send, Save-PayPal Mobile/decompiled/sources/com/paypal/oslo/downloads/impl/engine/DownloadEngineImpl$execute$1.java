package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1", f = "DownloadEngineImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {77, 74}, m = "invokeSuspend", n = {"$this$flow", "request", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-DownloadEngineImpl$execute$1$2", "$this$flow", "request", "this_$iv", "httpError", "$i$f$fold", "$i$a$-fold-DownloadEngineImpl$execute$1$1"}, nl = {78, 75}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadEngineImpl$execute$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.downloads.impl.engine.DownloadResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.downloads.impl.data.entity.DownloadEntity getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, r5, r11) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r0.emit(r6, r11) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient;
        kotlinx.coroutines.flow.Flow flow;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i != 0) {
            if (i == 1) {
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.downloads.api.model.DownloadRequest access$buildDownloadRequest = com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$buildDownloadRequest(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            downloadHttpClient = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            arrow.core.Either<com.paypal.oslo.downloads.api.HttpDownloadError, okhttp3.Response> download = downloadHttpClient.download(access$buildDownloadRequest);
            com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl = this.getOutputFormats;
            com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity = this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!(download instanceof arrow.core.Either.Right)) {
                if (download instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.downloads.api.HttpDownloadError httpDownloadError = (com.paypal.oslo.downloads.api.HttpDownloadError) ((arrow.core.Either.Left) download).getValue();
                    com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Error(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$mapHttpError(downloadEngineImpl, httpDownloadError));
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildDownloadRequest);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(download);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(httpDownloadError);
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getHighSpeedVideoSizesFor = 2;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                okhttp3.Response response = (okhttp3.Response) ((arrow.core.Either.Right) download).getValue();
                flow = kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1(downloadEngineImpl, response, downloadEntity, j, null));
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildDownloadRequest);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(download);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoSizesFor = 1;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.downloads.impl.engine.DownloadResult> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1 downloadEngineImpl$execute$1 = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        downloadEngineImpl$execute$1.getInputSizeshNQ4ISI = obj;
        return downloadEngineImpl$execute$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadEngineImpl$execute$1(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, long j, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = downloadEngineImpl;
        this.getHighSpeedVideoFpsRangesFor = downloadEntity;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }
}
