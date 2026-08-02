package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1", f = "DownloadEngineImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {142, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {"$this$flow", "filename", "targetFile", "resp", "$i$a$-use-DownloadEngineImpl$processResponse$1$1", "$this$flow", "filename", "targetFile", "resp", "resumeInfo", "$i$a$-use-DownloadEngineImpl$processResponse$1$1", "totalBytes", "startingBytes", "$this$flow", "filename", "targetFile", "resp", "resumeInfo", "$i$a$-use-DownloadEngineImpl$processResponse$1$1", "totalBytes", "startingBytes", "$this$flow", "filename", "targetFile", "e"}, nl = {151, 167, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 179}, s = {"L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "L$7", "L$8", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadEngineImpl$processResponse$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.downloads.impl.engine.DownloadResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ okhttp3.Response Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.downloads.impl.data.entity.DownloadEntity getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    long getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl isOutputSupportedForhNQ4ISI;

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:(1:(3:7|8|9)(2:11|12))(1:13))(8:14|15|16|17|18|19|(7:21|22|23|24|25|8|9)|31))|48|49|50|51|22|23|24|25|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x021e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0296, code lost:
    
        if (r12.emit(new com.paypal.oslo.downloads.impl.engine.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.StorageError("Failed to write file: ".concat(java.lang.String.valueOf(r0.getMessage())), 0, 0, r0, 6, null)), r28) != r13) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0213  */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor responseMetadataExtractor;
        java.lang.String extractFilename;
        java.io.File file;
        okhttp3.Response response;
        okhttp3.Response response2;
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl;
        long j;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity;
        okhttp3.Response response3;
        java.io.File file2;
        java.io.Closeable closeable;
        okhttp3.Response response4;
        com.paypal.oslo.downloads.impl.engine.ResumeHandler resumeHandler;
        com.paypal.oslo.downloads.impl.engine.ResumeHandler resumeHandler2;
        java.lang.Object highSpeedVideoSizes;
        okhttp3.Response response5;
        long j2;
        long j3;
        com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo;
        okhttp3.Response response6;
        int i;
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl2;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity2;
        java.lang.String str;
        java.io.File file3;
        okhttp3.Response response7;
        java.io.File file4;
        java.lang.String str2;
        java.lang.Throwable th;
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.Companion unused;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputStallDuration;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            responseMetadataExtractor = this.isOutputSupportedForhNQ4ISI.getInputFormats;
            extractFilename = responseMetadataExtractor.extractFilename(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.getFileName(), com.paypal.oslo.downloads.worker.DownloadWorkScheduler.WORK_NAME_PREFIX.concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor.getId())));
            java.io.File file5 = new java.io.File(this.getHighSpeedVideoFpsRangesFor.getStorageLocation(), extractFilename);
            try {
                response = this.Camera2StreamConfigurationMap;
                response2 = response;
                downloadEngineImpl = this.isOutputSupportedForhNQ4ISI;
                j = this.getHighSpeedVideoFpsRanges;
                downloadEntity = this.getHighSpeedVideoFpsRangesFor;
                try {
                    response4 = response2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    response3 = response2;
                    file2 = file5;
                }
            } catch (java.io.IOException e) {
                e = e;
                file = file5;
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractFilename);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                this.getInputSizeshNQ4ISI = null;
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputSizes = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputStallDuration = 4;
            }
            if (response4.getIsSuccessful()) {
                resumeHandler = downloadEngineImpl.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.downloads.impl.engine.ResumeInfo detectResumeSupport = resumeHandler.detectResumeSupport(response4, j);
                resumeHandler2 = downloadEngineImpl.getHighSpeedVideoFpsRangesFor;
                long calculateTotalBytes = resumeHandler2.calculateTotalBytes(response4, detectResumeSupport);
                long j4 = detectResumeSupport.isResuming() ? j : 0L;
                if (j > 0 && !detectResumeSupport.isResuming()) {
                    com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$deleteFileIfExists(downloadEngineImpl, file5);
                }
                this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractFilename);
                this.getOutputMinFrameDuration = file5;
                this.getHighSpeedVideoSizesFor = response2;
                this.getInputSizeshNQ4ISI = downloadEngineImpl;
                this.getOutputSizeshNQ4ISI = downloadEntity;
                this.getOutputSizes = response;
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response4);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(detectResumeSupport);
                this.getHighSpeedVideoSizes = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = calculateTotalBytes;
                long j5 = j4;
                this.getOutputFormats = j5;
                this.getOutputStallDuration = 2;
                response3 = response2;
                file2 = file5;
                try {
                    highSpeedVideoSizes = downloadEngineImpl.getHighSpeedVideoSizes(flowCollector, response4, file5, detectResumeSupport, j5, calculateTotalBytes, this);
                    if (highSpeedVideoSizes != coroutine_suspended) {
                        response5 = response;
                        closeable = response3;
                        j2 = calculateTotalBytes;
                        j3 = j5;
                        resumeInfo = detectResumeSupport;
                        response6 = response4;
                        i = 0;
                        downloadEngineImpl2 = downloadEngineImpl;
                        downloadEntity2 = downloadEntity;
                        str = extractFilename;
                        file3 = file2;
                        this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file3);
                        this.getHighSpeedVideoSizesFor = closeable;
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response6);
                        this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resumeInfo);
                        this.getOutputSizes = null;
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputMinFrameDurationlomOqCM = null;
                        this.getHighSpeedVideoSizes = i;
                        this.getHighResolutionOutputSizeshNQ4ISI = j2;
                        this.getOutputFormats = j3;
                        this.getOutputStallDuration = 3;
                        if (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$emitDownloadResult(downloadEngineImpl2, flowCollector, file3, downloadEntity2, response5, this) != coroutine_suspended) {
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    file = file2;
                    closeable = response3;
                    th = th;
                    str = extractFilename;
                    file3 = file;
                    throw th;
                }
            } else {
                int code = response4.code();
                java.lang.String message = response4.message();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
                sb.append(code);
                sb.append(": ");
                sb.append(message);
                java.lang.String obj2 = sb.toString();
                int code2 = response4.code();
                unused = com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.Companion;
                kotlin.ranges.IntRange Camera2StreamConfigurationMap = com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.Companion.Camera2StreamConfigurationMap();
                int first = Camera2StreamConfigurationMap.getFirst();
                int last = Camera2StreamConfigurationMap.getLast();
                int code3 = response4.code();
                com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.ServerError(obj2, code2, first <= code3 && code3 <= last, null, 8, null));
                this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractFilename);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file5);
                this.getHighSpeedVideoSizesFor = response2;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response4);
                this.getHighSpeedVideoSizes = 0;
                this.getOutputStallDuration = 1;
                if (flowCollector.emit(error, this) != coroutine_suspended) {
                    response7 = response2;
                    file4 = file5;
                    str2 = extractFilename;
                    closeable = response7;
                    file = file4;
                    extractFilename = str2;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(closeable, null);
                    return kotlin.Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    j3 = this.getOutputFormats;
                    j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    i = this.getHighSpeedVideoSizes;
                    resumeInfo = (com.paypal.oslo.downloads.impl.engine.ResumeInfo) this.getOutputMinFrameDurationlomOqCM;
                    response6 = (okhttp3.Response) this.getOutputStallDurationlomOqCM;
                    response5 = (okhttp3.Response) this.getOutputSizes;
                    downloadEntity2 = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) this.getOutputSizeshNQ4ISI;
                    downloadEngineImpl2 = (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl) this.getInputSizeshNQ4ISI;
                    closeable = (java.io.Closeable) this.getHighSpeedVideoSizesFor;
                    file = (java.io.File) this.getOutputMinFrameDuration;
                    extractFilename = (java.lang.String) this.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = extractFilename;
                        file3 = file;
                        try {
                            this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
                            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file3);
                            this.getHighSpeedVideoSizesFor = closeable;
                            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response6);
                            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resumeInfo);
                            this.getOutputSizes = null;
                            this.getOutputStallDurationlomOqCM = null;
                            this.getOutputMinFrameDurationlomOqCM = null;
                            this.getHighSpeedVideoSizes = i;
                            this.getHighResolutionOutputSizeshNQ4ISI = j2;
                            this.getOutputFormats = j3;
                            this.getOutputStallDuration = 3;
                            if (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.access$emitDownloadResult(downloadEngineImpl2, flowCollector, file3, downloadEntity2, response5, this) != coroutine_suspended) {
                                file = file3;
                                extractFilename = str;
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                kotlin.io.CloseableKt.closeFinally(closeable, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                try {
                                    kotlin.io.CloseableKt.closeFinally(closeable, th);
                                    throw th5;
                                } catch (java.io.IOException e2) {
                                    e = e2;
                                    file = file3;
                                    extractFilename = str;
                                    this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractFilename);
                                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                                    this.getInputSizeshNQ4ISI = null;
                                    this.getOutputSizeshNQ4ISI = null;
                                    this.getOutputSizes = null;
                                    this.getOutputStallDurationlomOqCM = null;
                                    this.getOutputMinFrameDurationlomOqCM = null;
                                    this.getOutputStallDuration = 4;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        th = th;
                        str = extractFilename;
                        file3 = file;
                        throw th;
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            closeable = response7;
            file = file4;
            extractFilename = str2;
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(closeable, null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th7) {
            th = th7;
            closeable = response7;
            file = file4;
            extractFilename = str2;
            th = th;
            str = extractFilename;
            file3 = file;
            throw th;
        }
        ?? r0 = (java.io.Closeable) this.getHighSpeedVideoSizesFor;
        java.io.File file6 = (java.io.File) this.getOutputMinFrameDuration;
        str2 = (java.lang.String) this.getInputFormats;
        file4 = file6;
        response7 = r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.downloads.impl.engine.DownloadResult> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1 downloadEngineImpl$processResponse$1 = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1(this.isOutputSupportedForhNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        downloadEngineImpl$processResponse$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return downloadEngineImpl$processResponse$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadEngineImpl$processResponse$1(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, okhttp3.Response response, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, long j, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$processResponse$1> continuation) {
        super(2, continuation);
        this.isOutputSupportedForhNQ4ISI = downloadEngineImpl;
        this.Camera2StreamConfigurationMap = response;
        this.getHighSpeedVideoFpsRangesFor = downloadEntity;
        this.getHighSpeedVideoFpsRanges = j;
    }
}
