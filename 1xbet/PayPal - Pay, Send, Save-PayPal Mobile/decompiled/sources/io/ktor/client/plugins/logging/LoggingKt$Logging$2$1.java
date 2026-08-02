package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/logging/SendHook$Context;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$1", f = "Logging.kt", i = {0, 0, 3, 3, 4}, l = {539, 547, 549, 560, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST}, m = "invokeSuspend", n = {"$this$on", "requestLogLines", "$this$on", "request", "request"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.SendHook.Context, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.logging.Logger Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<kotlin.jvm.functions.Function1<io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.logging.LogLevel getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0128, code lost:
    
        if (r5.proceedWith(r4, r19) != r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (r3.proceed(r19) != r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117 A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #3 {all -> 0x0024, blocks: (B:10:0x001f, B:23:0x0117, B:24:0x011b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #2 {all -> 0x0044, blocks: (B:32:0x003f, B:41:0x00c3, B:44:0x00d3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #2 {all -> 0x0044, blocks: (B:32:0x003f, B:41:0x00c3, B:44:0x00d3), top: B:2:0x000e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.client.request.HttpRequestBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.client.plugins.logging.SendHook.Context context;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder;
        java.lang.Object access$Logging$lambda$16$logRequest;
        io.ktor.client.plugins.logging.SendHook.Context context2;
        java.lang.Object access$Logging$lambda$16$logRequestOkHttpFormat;
        io.ktor.client.plugins.logging.SendHook.Context context3;
        java.util.List list;
        io.ktor.util.AttributeKey attributeKey;
        io.ktor.http.content.OutgoingContent outgoingContent;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.getHighSpeedVideoSizesFor;
        try {
            try {
            } catch (java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.log("<-- HTTP FAILED: ".concat(java.lang.String.valueOf(th)));
                throw th;
            }
            if (r2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.plugins.logging.SendHook.Context context4 = (io.ktor.client.plugins.logging.SendHook.Context) this.getOutputMinFrameDuration;
                io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2 = (io.ktor.client.request.HttpRequestBuilder) this.getInputFormats;
                if (!io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$shouldBeLogged(this.getHighResolutionOutputSizeshNQ4ISI, httpRequestBuilder2)) {
                    io.ktor.util.Attributes attributes = httpRequestBuilder2.getAttributes();
                    attributeKey = io.ktor.client.plugins.logging.LoggingKt.getHighResolutionOutputSizeshNQ4ISI;
                    attributes.put(attributeKey, kotlin.Unit.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                if (this.getHighSpeedVideoFpsRangesFor) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    this.getOutputMinFrameDuration = context4;
                    this.getInputFormats = arrayList;
                    this.getHighSpeedVideoSizesFor = 1;
                    access$Logging$lambda$16$logRequestOkHttpFormat = io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logRequestOkHttpFormat(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputFormats, httpRequestBuilder2, arrayList, this);
                    if (access$Logging$lambda$16$logRequestOkHttpFormat != coroutine_suspended) {
                        context3 = context4;
                        list = arrayList;
                        outgoingContent = (io.ktor.http.content.OutgoingContent) access$Logging$lambda$16$logRequestOkHttpFormat;
                        if (list.size() > 0) {
                        }
                        if (outgoingContent == null) {
                        }
                        this.Camera2StreamConfigurationMap.log("<-- HTTP FAILED: ".concat(java.lang.String.valueOf(th)));
                        throw th;
                    }
                } else {
                    try {
                        this.getOutputMinFrameDuration = context4;
                        this.getInputFormats = httpRequestBuilder2;
                        this.getHighSpeedVideoSizesFor = 4;
                        access$Logging$lambda$16$logRequest = io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logRequest(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, httpRequestBuilder2, this);
                    } catch (java.lang.Throwable unused) {
                        context = context4;
                        httpRequestBuilder = httpRequestBuilder2;
                        context2 = context;
                        obj2 = null;
                        if (obj2 == null) {
                        }
                        this.getOutputMinFrameDuration = httpRequestBuilder;
                        this.getInputFormats = null;
                        this.getHighSpeedVideoSizesFor = 5;
                    }
                    if (access$Logging$lambda$16$logRequest != coroutine_suspended) {
                        context2 = context4;
                        httpRequestBuilder = httpRequestBuilder2;
                        obj2 = (io.ktor.http.content.OutgoingContent) access$Logging$lambda$16$logRequest;
                        if (obj2 == null) {
                        }
                        this.getOutputMinFrameDuration = httpRequestBuilder;
                        this.getInputFormats = null;
                        this.getHighSpeedVideoSizesFor = 5;
                    }
                }
                return coroutine_suspended;
            }
            if (r2 == 1) {
                list = (java.util.List) this.getInputFormats;
                context3 = (io.ktor.client.plugins.logging.SendHook.Context) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                access$Logging$lambda$16$logRequestOkHttpFormat = obj;
                outgoingContent = (io.ktor.http.content.OutgoingContent) access$Logging$lambda$16$logRequestOkHttpFormat;
                if (list.size() > 0) {
                    this.Camera2StreamConfigurationMap.log(kotlin.collections.CollectionsKt.joinToString$default(list, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null));
                }
                if (outgoingContent == null) {
                    this.getOutputMinFrameDuration = null;
                    this.getInputFormats = null;
                    this.getHighSpeedVideoSizesFor = 2;
                    if (context3.proceedWith(outgoingContent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                this.getOutputMinFrameDuration = null;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = 3;
                this.Camera2StreamConfigurationMap.log("<-- HTTP FAILED: ".concat(java.lang.String.valueOf(th)));
                throw th;
            }
            if (r2 == 2 || r2 == 3) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            if (r2 != 4) {
                if (r2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getInputFormats;
            context = (io.ktor.client.plugins.logging.SendHook.Context) this.getOutputMinFrameDuration;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                context2 = context;
                access$Logging$lambda$16$logRequest = obj;
            } catch (java.lang.Throwable unused2) {
                context2 = context;
                obj2 = null;
                if (obj2 == null) {
                }
                this.getOutputMinFrameDuration = httpRequestBuilder;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = 5;
            }
            try {
                obj2 = (io.ktor.http.content.OutgoingContent) access$Logging$lambda$16$logRequest;
            } catch (java.lang.Throwable unused3) {
                context = context2;
                context2 = context;
                obj2 = null;
                if (obj2 == null) {
                }
                this.getOutputMinFrameDuration = httpRequestBuilder;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = 5;
            }
            if (obj2 == null) {
                obj2 = httpRequestBuilder.getBody();
            }
            this.getOutputMinFrameDuration = httpRequestBuilder;
            this.getInputFormats = null;
            this.getHighSpeedVideoSizesFor = 5;
        } catch (java.lang.Throwable th2) {
            io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logRequestException(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, r2, th2);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.logging.SendHook.Context context, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$1 loggingKt$Logging$2$1 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputFormats, continuation);
        loggingKt$Logging$2$1.getOutputMinFrameDuration = context;
        loggingKt$Logging$2$1.getInputFormats = httpRequestBuilder;
        return loggingKt$Logging$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LoggingKt$Logging$2$1(boolean z, io.ktor.client.plugins.logging.Logger logger, java.util.List<? extends kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, java.lang.Boolean>> list, java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> list2, io.ktor.client.plugins.logging.LogLevel logLevel, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = logger;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRanges = list2;
        this.getHighSpeedVideoSizes = logLevel;
        this.getOutputFormats = clientPluginBuilder;
    }
}
