package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010&\u001a\u00020%*\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b&\u0010'J\"\u0010&\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0082@¢\u0006\u0004\b&\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020.2\b\u0010\u001e\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b/\u00100J%\u0010&\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*012\b\u0010\u001e\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b&\u00102R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00106R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00107R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010<R\u0014\u0010>\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010@"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadEngineImpl;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadEngine;", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "downloadHttpClient", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "contentValidator", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "dispatchers", "Lcom/paypal/oslo/downloads/impl/engine/ResumeHandler;", "resumeHandler", "Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTrackerFactory;", "progressTrackerFactory", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "fileDeleter", "Lcom/paypal/oslo/downloads/impl/util/ResponseMetadataExtractor;", "responseMetadataExtractor", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadHttpClient;Lcom/paypal/oslo/downloads/api/validation/ContentValidator;Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;Lcom/paypal/oslo/downloads/impl/engine/ResumeHandler;Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTrackerFactory;Lcom/paypal/oslo/downloads/impl/util/FileDeleter;Lcom/paypal/oslo/downloads/impl/util/ResponseMetadataExtractor;Lkotlinx/serialization/json/Json;)V", "Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;", "entity", "", "existingBytes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadResult;", "execute", "(Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;J)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lokhttp3/Response;", "p0", "Ljava/io/File;", "p1", "Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;", "p2", "p3", "p4", "", "getHighSpeedVideoSizes", "(Lkotlinx/coroutines/flow/FlowCollector;Lokhttp3/Response;Ljava/io/File;Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "(Ljava/io/File;Lcom/paypal/oslo/downloads/impl/data/entity/DownloadEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/downloads/api/model/DownloadConfig;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/model/DownloadConfig;", "Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/model/DownloadAuthType;", "", "(Ljava/lang/String;)Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "Lcom/paypal/oslo/downloads/impl/di/DownloadDispatchers;", "getOutputFormats", "Lcom/paypal/oslo/downloads/impl/engine/ResumeHandler;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/downloads/impl/engine/DownloadProgressTrackerFactory;", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "getInputSizeshNQ4ISI", "getInputFormats", "Lcom/paypal/oslo/downloads/impl/util/ResponseMetadataExtractor;", "Lkotlinx/serialization/json/Json;", "getOutputMinFrameDuration", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadEngineImpl implements com.paypal.oslo.downloads.impl.engine.DownloadEngine {

    @java.lang.Deprecated
    public static final int BUFFER_SIZE = 8192;
    private static final com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.Companion Companion = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.Companion(null);
    private static final kotlin.ranges.IntRange getHighSpeedVideoSizes = new kotlin.ranges.IntRange(500, 599);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.validation.ContentValidator getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.di.DownloadDispatchers getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadHttpClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.util.FileDeleter getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory Camera2StreamConfigurationMap;
    private final com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.engine.ResumeHandler getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DownloadEngineImpl(com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient, com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers, com.paypal.oslo.downloads.impl.engine.ResumeHandler resumeHandler, com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory downloadProgressTrackerFactory, com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter, com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor responseMetadataExtractor, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDispatchers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resumeHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadProgressTrackerFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileDeleter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseMetadataExtractor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighResolutionOutputSizeshNQ4ISI = downloadHttpClient;
        this.getHighSpeedVideoFpsRanges = contentValidator;
        this.getHighSpeedVideoSizes = downloadDispatchers;
        this.getHighSpeedVideoFpsRangesFor = resumeHandler;
        this.Camera2StreamConfigurationMap = downloadProgressTrackerFactory;
        this.getInputSizeshNQ4ISI = fileDeleter;
        this.getInputFormats = responseMetadataExtractor;
        this.getOutputMinFrameDuration = json;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0117, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r12 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$emitDownloadResult(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, kotlinx.coroutines.flow.FlowCollector flowCollector, java.io.File file, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, okhttp3.Response response, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$emitDownloadResult$1 downloadEngineImpl$emitDownloadResult$1;
        int i;
        com.paypal.oslo.downloads.api.model.DownloadError downloadError;
        if (continuation instanceof com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$emitDownloadResult$1) {
            downloadEngineImpl$emitDownloadResult$1 = (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$emitDownloadResult$1) continuation;
            if ((downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = downloadEngineImpl$emitDownloadResult$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    downloadEngineImpl$emitDownloadResult$1.Camera2StreamConfigurationMap = flowCollector;
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoSizes = file;
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                    downloadEngineImpl$emitDownloadResult$1.getHighResolutionOutputSizeshNQ4ISI = response;
                    downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration = 1;
                    obj = downloadEngineImpl.getHighSpeedVideoSizes(file, downloadEntity, downloadEngineImpl$emitDownloadResult$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    response = (okhttp3.Response) downloadEngineImpl$emitDownloadResult$1.getHighResolutionOutputSizeshNQ4ISI;
                    downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRangesFor;
                    file = (java.io.File) downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoSizes;
                    flowCollector = (kotlinx.coroutines.flow.FlowCollector) downloadEngineImpl$emitDownloadResult$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                downloadError = (com.paypal.oslo.downloads.api.model.DownloadError) obj;
                if (downloadError != null) {
                    java.lang.String extractMimeType = downloadEngineImpl.getInputFormats.extractMimeType(response, file);
                    java.lang.String absolutePath = file.getAbsolutePath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                    com.paypal.oslo.downloads.impl.engine.DownloadResult.Success success = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Success(absolutePath, file.length(), extractMimeType);
                    downloadEngineImpl$emitDownloadResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                    downloadEngineImpl$emitDownloadResult$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadError);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(extractMimeType);
                    downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration = 3;
                } else {
                    com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter = downloadEngineImpl.getInputSizeshNQ4ISI;
                    java.lang.String absolutePath2 = file.getAbsolutePath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
                    fileDeleter.deleteIfExists(absolutePath2);
                    com.paypal.oslo.downloads.impl.engine.DownloadResult.Error error = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Error(downloadError);
                    downloadEngineImpl$emitDownloadResult$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                    downloadEngineImpl$emitDownloadResult$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    downloadEngineImpl$emitDownloadResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadError);
                    downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration = 2;
                }
                return coroutine_suspended;
            }
        }
        downloadEngineImpl$emitDownloadResult$1 = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$emitDownloadResult$1(downloadEngineImpl, continuation);
        java.lang.Object obj2 = downloadEngineImpl$emitDownloadResult$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadEngineImpl$emitDownloadResult$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        downloadError = (com.paypal.oslo.downloads.api.model.DownloadError) obj2;
        if (downloadError != null) {
        }
        return coroutine_suspended2;
    }

    @Override // com.paypal.oslo.downloads.impl.engine.DownloadEngine
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.impl.engine.DownloadResult> execute(com.paypal.oslo.downloads.impl.data.entity.DownloadEntity entity, long existingBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$execute$1(this, entity, existingBytes, null)), this.getHighSpeedVideoSizes.getDispatcher());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadEngineImpl$Companion;", "", "<init>", "()V", "", "BUFFER_SIZE", com.visa.cbp.getEncExpo.warmup, "Lkotlin/ranges/IntRange;", "getHighSpeedVideoSizes", "Lkotlin/ranges/IntRange;", "Camera2StreamConfigurationMap", "()Lkotlin/ranges/IntRange;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static kotlin.ranges.IntRange Camera2StreamConfigurationMap() {
            return com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014c, code lost:
    
        r10 = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress(r9);
        r7.getOutputMinFrameDuration = r0;
        r7.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2);
        r7.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
        r7.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4);
        r7.getOutputStallDuration = r14;
        r7.getOutputSizeshNQ4ISI = r15;
        r7.getOutputStallDurationlomOqCM = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016f, code lost:
    
        r13 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
    
        r7.toString = r13;
        r7.unwrapAs = r1;
        r33 = r1;
        r7.getValidOutputFormatsForInputhNQ4ISI = r13;
        r7.getInputFormats = r3;
        r7.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0185, code lost:
    
        r35 = r13;
        r9 = r14;
        r13 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018a, code lost:
    
        r7.getHighResolutionOutputSizeshNQ4ISI = r13;
        r7.getHighSpeedVideoFpsRangesFor = r11;
        r13 = r28;
        r7.getHighSpeedVideoSizes = r13;
        r14 = r30;
        r7.Camera2StreamConfigurationMap = r14;
        r7.getInputSizeshNQ4ISI = r5;
        r7.getHighSpeedVideoFpsRanges = 0;
        r7.isOutputSupportedForhNQ4ISI = 1;
        r16 = r14;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01aa, code lost:
    
        if (r0.emit(r10, r7) == r14) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ac, code lost:
    
        r19 = r34;
        r20 = r9;
        r17 = r11;
        r28 = r13;
        r21 = r15;
        r10 = r5;
        r15 = r13;
        r9 = r4;
        r12 = r7;
        r13 = r8;
        r8 = r35;
        r4 = r0;
        r7 = r3;
        r0 = r13;
        r3 = r2;
        r2 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x027d, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0293, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e4, code lost:
    
        r35 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0205, code lost:
    
        r16 = r30;
        r35 = r33;
        r33 = r1;
        r1 = r9;
        r13 = r28;
        r10 = new com.paypal.oslo.downloads.impl.engine.DownloadResult.Progress(new com.paypal.oslo.downloads.api.model.DownloadProgress(r5, r11, 0, 0));
        r7.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0);
        r7.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2);
        r7.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8);
        r7.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4);
        r7.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14);
        r7.getOutputSizeshNQ4ISI = r15;
        r7.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024b, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r7.toString = r8;
        r7.unwrapAs = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r33);
        r7.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1);
        r7.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3);
        r7.getOutputFormats = null;
        r7.getHighResolutionOutputSizeshNQ4ISI = r31;
        r7.getHighSpeedVideoFpsRangesFor = r11;
        r7.getHighSpeedVideoSizes = r13;
        r7.Camera2StreamConfigurationMap = r16;
        r7.getInputSizeshNQ4ISI = r5;
        r7.isOutputSupportedForhNQ4ISI = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0279, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x027b, code lost:
    
        if (r0.emit(r10, r7) != r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x027e, code lost:
    
        r3 = r8;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0291, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205 A[EDGE_INSN: B:74:0x0205->B:75:0x0205 BREAK  A[LOOP:0: B:45:0x0130->B:52:0x01e8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e3  */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01ac -> B:43:0x01c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.downloads.impl.engine.DownloadResult> flowCollector, okhttp3.Response response, java.io.File file, com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo, long j, long j2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1 downloadEngineImpl$streamToFile$1;
        int i;
        java.io.InputStream byteStream;
        java.io.File file2;
        java.lang.Throwable th;
        java.io.OutputStream outputStream;
        byte[] bArr;
        long j3;
        com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker downloadProgressTracker;
        java.lang.Object obj;
        java.io.Closeable closeable;
        java.io.InputStream inputStream;
        java.io.OutputStream outputStream2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        int i2;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo2;
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1 downloadEngineImpl$streamToFile$12;
        java.io.OutputStream outputStream3;
        int i3;
        okhttp3.Response response2;
        long j4;
        long j5;
        java.io.OutputStream outputStream4;
        int read;
        java.io.OutputStream outputStream5;
        byte[] bArr2;
        long j6;
        try {
            if (continuation instanceof com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1) {
                downloadEngineImpl$streamToFile$1 = (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1) continuation;
                if ((downloadEngineImpl$streamToFile$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                    downloadEngineImpl$streamToFile$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                    java.lang.Object obj2 = downloadEngineImpl$streamToFile$1.isOutputSupportedFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = downloadEngineImpl$streamToFile$1.isOutputSupportedForhNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker create = this.Camera2StreamConfigurationMap.create();
                        create.reset();
                        byteStream = response.body().byteStream();
                        try {
                            java.io.InputStream inputStream2 = byteStream;
                            file2 = file;
                            java.io.OutputStream createOutputStream = this.getHighSpeedVideoFpsRangesFor.createOutputStream(file2, resumeInfo.isResuming());
                            try {
                                bArr = new byte[8192];
                                j3 = j2;
                                downloadProgressTracker = create;
                                obj = coroutine_suspended;
                                closeable = byteStream;
                                inputStream = inputStream2;
                                outputStream2 = createOutputStream;
                                intRef = new kotlin.jvm.internal.Ref.IntRef();
                                i2 = 0;
                                flowCollector2 = flowCollector;
                                resumeInfo2 = resumeInfo;
                                downloadEngineImpl$streamToFile$12 = downloadEngineImpl$streamToFile$1;
                                outputStream3 = createOutputStream;
                                i3 = 0;
                                response2 = response;
                                j4 = j;
                                j5 = j4;
                                while (true) {
                                    read = inputStream.read(bArr);
                                    intRef.element = read;
                                    java.io.InputStream inputStream3 = inputStream;
                                    if (read != -1) {
                                    }
                                    j5 = j6;
                                    inputStream = inputStream3;
                                    bArr = bArr2;
                                    outputStream2 = outputStream2;
                                    outputStream3 = outputStream3;
                                }
                                outputStream4 = outputStream5;
                                th = th;
                                byteStream = closeable;
                                outputStream = outputStream4;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                outputStream = createOutputStream;
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                kotlin.io.CloseableKt.closeFinally(byteStream, th3);
                                throw th4;
                            }
                        }
                    } else if (i == 1) {
                        int i4 = downloadEngineImpl$streamToFile$1.getHighSpeedVideoFpsRanges;
                        long j7 = downloadEngineImpl$streamToFile$1.getInputSizeshNQ4ISI;
                        int i5 = downloadEngineImpl$streamToFile$1.Camera2StreamConfigurationMap;
                        int i6 = downloadEngineImpl$streamToFile$1.getHighSpeedVideoSizes;
                        long j8 = downloadEngineImpl$streamToFile$1.getHighSpeedVideoFpsRangesFor;
                        long j9 = downloadEngineImpl$streamToFile$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) downloadEngineImpl$streamToFile$1.getInputFormats;
                        byte[] bArr3 = (byte[]) downloadEngineImpl$streamToFile$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.io.OutputStream outputStream6 = (java.io.OutputStream) downloadEngineImpl$streamToFile$1.unwrapAs;
                        ?? r8 = (java.io.Closeable) downloadEngineImpl$streamToFile$1.toString;
                        java.io.InputStream inputStream4 = (java.io.InputStream) downloadEngineImpl$streamToFile$1.getOutputStallDurationlomOqCM;
                        java.io.Closeable closeable2 = (java.io.Closeable) downloadEngineImpl$streamToFile$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker downloadProgressTracker2 = (com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker) downloadEngineImpl$streamToFile$1.getOutputStallDuration;
                        com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo3 = (com.paypal.oslo.downloads.impl.engine.ResumeInfo) downloadEngineImpl$streamToFile$1.getOutputMinFrameDurationlomOqCM;
                        java.io.File file3 = (java.io.File) downloadEngineImpl$streamToFile$1.getOutputSizes;
                        okhttp3.Response response3 = (okhttp3.Response) downloadEngineImpl$streamToFile$1.getHighSpeedVideoSizesFor;
                        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) downloadEngineImpl$streamToFile$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            int i7 = i5;
                            java.io.InputStream inputStream5 = inputStream4;
                            java.io.Closeable closeable3 = closeable2;
                            com.paypal.oslo.downloads.impl.engine.DownloadProgressTracker downloadProgressTracker3 = downloadProgressTracker2;
                            i2 = i6;
                            long j10 = j8;
                            long j11 = j9;
                            java.io.File file4 = file3;
                            com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1 downloadEngineImpl$streamToFile$13 = downloadEngineImpl$streamToFile$1;
                            java.lang.Object obj3 = coroutine_suspended;
                            java.io.OutputStream outputStream7 = outputStream6;
                            byte[] bArr4 = bArr3;
                            long j12 = j7;
                            com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo4 = resumeInfo3;
                            okhttp3.Response response4 = response3;
                            kotlin.jvm.internal.Ref.IntRef intRef3 = intRef2;
                            java.io.OutputStream outputStream8 = r8;
                            j4 = j11;
                            outputStream2 = outputStream7;
                            response2 = response4;
                            flowCollector2 = flowCollector3;
                            intRef = intRef3;
                            outputStream3 = outputStream8;
                            resumeInfo2 = resumeInfo4;
                            j5 = j12;
                            downloadEngineImpl$streamToFile$12 = downloadEngineImpl$streamToFile$13;
                            file2 = file4;
                            obj = obj3;
                            bArr = bArr4;
                            i3 = i7;
                            j3 = j10;
                            inputStream = inputStream5;
                            downloadProgressTracker = downloadProgressTracker3;
                            closeable = closeable3;
                            while (true) {
                                try {
                                    read = inputStream.read(bArr);
                                    intRef.element = read;
                                    java.io.InputStream inputStream32 = inputStream;
                                    if (read != -1) {
                                        break;
                                    }
                                    try {
                                        outputStream2.write(bArr, 0, intRef.element);
                                        bArr2 = bArr;
                                        j6 = j5 + intRef.element;
                                        com.paypal.oslo.downloads.api.model.DownloadProgress trackProgress = downloadProgressTracker.trackProgress(j6, j3);
                                        if (trackProgress != null) {
                                            break;
                                        }
                                        j5 = j6;
                                        inputStream = inputStream32;
                                        bArr = bArr2;
                                        outputStream2 = outputStream2;
                                        outputStream3 = outputStream3;
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        outputStream5 = outputStream3;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    outputStream4 = outputStream3;
                                }
                            }
                            outputStream4 = outputStream5;
                            th = th;
                            byteStream = closeable;
                            outputStream = outputStream4;
                        } catch (java.lang.Throwable th7) {
                            byteStream = closeable2;
                            th = th7;
                            outputStream = r8;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j13 = downloadEngineImpl$streamToFile$1.getInputSizeshNQ4ISI;
                        int i8 = downloadEngineImpl$streamToFile$1.Camera2StreamConfigurationMap;
                        int i9 = downloadEngineImpl$streamToFile$1.getHighSpeedVideoSizes;
                        long j14 = downloadEngineImpl$streamToFile$1.getHighSpeedVideoFpsRangesFor;
                        long j15 = downloadEngineImpl$streamToFile$1.getHighResolutionOutputSizeshNQ4ISI;
                        ?? r3 = (java.io.Closeable) downloadEngineImpl$streamToFile$1.toString;
                        byteStream = (java.io.Closeable) downloadEngineImpl$streamToFile$1.getOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(r3, null);
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(byteStream, null);
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            outputStream = r3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (java.lang.Throwable th9) {
            kotlin.io.CloseableKt.closeFinally(outputStream, th);
            throw th9;
        }
        downloadEngineImpl$streamToFile$1 = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$streamToFile$1(this, continuation);
        java.lang.Object obj22 = downloadEngineImpl$streamToFile$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadEngineImpl$streamToFile$1.isOutputSupportedForhNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.io.File file, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadError> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1 downloadEngineImpl$validateContent$1;
        int i;
        com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult;
        if (continuation instanceof com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1) {
            downloadEngineImpl$validateContent$1 = (com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1) continuation;
            if ((downloadEngineImpl$validateContent$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                downloadEngineImpl$validateContent$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1 downloadEngineImpl$validateContent$12 = downloadEngineImpl$validateContent$1;
                java.lang.Object obj = downloadEngineImpl$validateContent$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadEngineImpl$validateContent$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator = this.getHighSpeedVideoFpsRanges;
                    java.lang.String expectedMimeType = downloadEntity.getExpectedMimeType();
                    java.lang.String expectedChecksum = downloadEntity.getExpectedChecksum();
                    downloadEngineImpl$validateContent$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    downloadEngineImpl$validateContent$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                    downloadEngineImpl$validateContent$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.downloads.api.validation.ContentValidator.validate$default(contentValidator, file, expectedMimeType, expectedChecksum, null, downloadEngineImpl$validateContent$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                contentValidationResult = (com.paypal.oslo.downloads.api.validation.ContentValidationResult) obj;
                if (!contentValidationResult.isValid()) {
                    return null;
                }
                java.lang.String errorMessage = contentValidationResult.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "Content validation failed";
                }
                return new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(errorMessage, com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE, null, 4, null);
            }
        }
        downloadEngineImpl$validateContent$1 = new com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1(this, continuation);
        com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl$validateContent$1 downloadEngineImpl$validateContent$122 = downloadEngineImpl$validateContent$1;
        java.lang.Object obj2 = downloadEngineImpl$validateContent$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadEngineImpl$validateContent$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        contentValidationResult = (com.paypal.oslo.downloads.api.validation.ContentValidationResult) obj2;
        if (!contentValidationResult.isValid()) {
        }
    }

    private final com.paypal.oslo.downloads.api.model.DownloadConfig Camera2StreamConfigurationMap(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl = this;
            kotlinx.serialization.json.Json json = this.getOutputMinFrameDuration;
            json.getSerializersModule();
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(((com.paypal.oslo.downloads.impl.data.ConfigJson) json.decodeFromString(com.paypal.oslo.downloads.impl.data.ConfigJson.INSTANCE.serializer(), p0)).toDownloadConfig());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.downloads.api.model.DownloadConfig downloadConfig = new com.paypal.oslo.downloads.api.model.DownloadConfig(false, false, false, false, 0, 0L, 0L, false, null, null, 1023, null);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = downloadConfig;
        }
        return (com.paypal.oslo.downloads.api.model.DownloadConfig) m23436constructorimpl;
    }

    private final com.paypal.oslo.downloads.api.model.DownloadAuthType getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState;
        com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth userAuth;
        java.lang.String str = p0;
        if (str == null || str.length() == 0) {
            return com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth.INSTANCE;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl = this;
            kotlinx.serialization.json.Json json = this.getOutputMinFrameDuration;
            json.getSerializersModule();
            com.paypal.oslo.downloads.impl.data.AuthProviderJson authProviderJson = (com.paypal.oslo.downloads.impl.data.AuthProviderJson) json.decodeFromString(com.paypal.oslo.downloads.impl.data.AuthProviderJson.INSTANCE.serializer(), p0);
            com.paypal.oslo.downloads.impl.data.AuthTypeJson type = authProviderJson.getType();
            int i = type == null ? -1 : com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            if (i == 1) {
                com.paypal.oslo.downloads.impl.data.AuthStateJson authState = authProviderJson.getAuthState();
                if (authState != null && com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl.WhenMappings.$EnumSwitchMapping$0[authState.ordinal()] == 1) {
                    authenticationState = com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN;
                    userAuth = new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(authenticationState, authProviderJson.getSource());
                }
                authenticationState = com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED;
                userAuth = new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(authenticationState, authProviderJson.getSource());
            } else if (i == 2) {
                userAuth = new com.paypal.oslo.downloads.api.model.DownloadAuthType.ClientAuth(authProviderJson.getSource());
            } else {
                userAuth = com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth.INSTANCE;
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(userAuth);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth noAuth = com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth.INSTANCE;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = noAuth;
        }
        return (com.paypal.oslo.downloads.api.model.DownloadAuthType) m23436constructorimpl;
    }

    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes(java.lang.String p0) {
        java.lang.Object m23436constructorimpl;
        java.lang.String str = p0;
        if (str == null || str.length() == 0) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl = this;
            kotlinx.serialization.json.Json json = this.getOutputMinFrameDuration;
            json.getSerializersModule();
            kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((java.util.Map) json.decodeFromString(new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, stringSerializer), p0));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = emptyMap;
        }
        return (java.util.Map) m23436constructorimpl;
    }

    public static final /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadRequest access$buildDownloadRequest(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity, long j) {
        java.lang.Object obj;
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(downloadEngineImpl.getHighSpeedVideoSizes(downloadEntity.getHeadersJson()));
        if (j > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            mutableMap.put(com.google.common.net.HttpHeaders.RANGE, sb.toString());
        }
        java.lang.String url = downloadEntity.getUrl();
        java.lang.String fileName = downloadEntity.getFileName();
        com.paypal.oslo.downloads.api.model.DownloadConfig Camera2StreamConfigurationMap = downloadEngineImpl.Camera2StreamConfigurationMap(downloadEntity.getConfigJson());
        com.paypal.oslo.downloads.api.model.DownloadAuthType highSpeedVideoFpsRangesFor = downloadEngineImpl.getHighSpeedVideoFpsRangesFor(downloadEntity.getAuthProviderJson());
        java.util.Iterator<E> it = com.paypal.oslo.downloads.api.model.DownloadPriority.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.downloads.api.model.DownloadPriority) obj).getValue() == downloadEntity.getPriority()) {
                break;
            }
        }
        com.paypal.oslo.downloads.api.model.DownloadPriority downloadPriority = (com.paypal.oslo.downloads.api.model.DownloadPriority) obj;
        return new com.paypal.oslo.downloads.api.model.DownloadRequest(url, fileName, Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor, mutableMap, downloadPriority == null ? com.paypal.oslo.downloads.api.model.DownloadPriority.NORMAL : downloadPriority, downloadEntity.getTag(), downloadEntity.getExpectedMimeType());
    }

    public static final /* synthetic */ void access$deleteFileIfExists(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, java.io.File file) {
        com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter = downloadEngineImpl.getInputSizeshNQ4ISI;
        java.lang.String absolutePath = file.getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        fileDeleter.deleteIfExists(absolutePath);
    }

    public static final /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadError access$mapHttpError(com.paypal.oslo.downloads.impl.engine.DownloadEngineImpl downloadEngineImpl, com.paypal.oslo.downloads.api.HttpDownloadError httpDownloadError) {
        if (httpDownloadError instanceof com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated) {
            com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated networkRelated = (com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated) httpDownloadError;
            return new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(networkRelated.getMessage(), false, networkRelated.getCause(), 2, null);
        }
        if (!(httpDownloadError instanceof com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch mimeTypeMismatch = (com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch) httpDownloadError;
        java.lang.String expectedMimeType = mimeTypeMismatch.getExpectedMimeType();
        java.lang.String actualMimeType = mimeTypeMismatch.getActualMimeType();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MIME type mismatch: expected '");
        sb.append(expectedMimeType);
        sb.append("' but received '");
        sb.append(actualMimeType);
        sb.append("'");
        return new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(sb.toString(), com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE, null, 4, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.downloads.impl.data.AuthStateJson.values().length];
            try {
                iArr[com.paypal.oslo.downloads.impl.data.AuthStateJson.LOGGED_IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.downloads.impl.data.AuthTypeJson.values().length];
            try {
                iArr2[com.paypal.oslo.downloads.impl.data.AuthTypeJson.USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.downloads.impl.data.AuthTypeJson.CLIENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
