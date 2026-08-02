package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1", f = "SaveBody.kt", i = {0, 0, 0}, l = {45, 52}, m = "invokeSuspend", n = {"$this$intercept", "response", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class DoubleReceivePluginKt$SaveBody$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit>, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(3:5|6|7)(2:9|10))(3:11|12|13))(2:38|(4:40|(1:42)|43|44)(6:45|46|(1:48)|49|(1:51)|22))|14|15|16|17|(1:19)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f3, code lost:
    
        if (r5.proceedWith(r11, r10) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r4 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r4));
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.pipeline.PipelineContext pipelineContext;
        io.ktor.util.AttributeKey<?> attributeKey;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.lang.Throwable th;
        io.ktor.util.Attributes attributes;
        java.lang.Object m23436constructorimpl;
        java.lang.Throwable m23439exceptionOrNullimpl;
        io.ktor.util.AttributeKey attributeKey2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
            io.ktor.client.statement.HttpResponse httpResponse2 = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
            io.ktor.client.call.HttpClientCall call = httpResponse2.getCall();
            io.ktor.util.Attributes attributes2 = call.getAttributes();
            attributeKey = io.ktor.client.plugins.DoubleReceivePluginKt.Camera2StreamConfigurationMap;
            if (attributes2.contains(attributeKey)) {
                org.slf4j.Logger access$getLOGGER = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(access$getLOGGER)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping body saving for ");
                    sb.append(call.getRequest().getGetHighSpeedVideoFpsRanges());
                    access$getLOGGER.trace(sb.toString());
                }
                return kotlin.Unit.INSTANCE;
            }
            try {
                org.slf4j.Logger access$getLOGGER2 = io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER();
                if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(access$getLOGGER2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Saving body for ");
                    sb2.append(call.getRequest().getGetHighSpeedVideoFpsRanges());
                    access$getLOGGER2.trace(sb2.toString());
                }
                this.getHighSpeedVideoFpsRanges = pipelineContext;
                this.Camera2StreamConfigurationMap = httpResponse2;
                this.getHighSpeedVideoFpsRangesFor = attributes2;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object save = io.ktor.client.call.SavedCallKt.save(call, this);
                if (save != coroutine_suspended) {
                    httpResponse = httpResponse2;
                    obj = save;
                    attributes = attributes2;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th2) {
                httpResponse = httpResponse2;
                th = th2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                io.ktor.utils.io.ByteReadChannelKt.cancel(httpResponse.getRawContent());
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    throw th;
                }
                io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER().debug("Failed to cancel response body", m23439exceptionOrNullimpl);
                throw th;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        attributes = (io.ktor.util.Attributes) this.getHighSpeedVideoFpsRangesFor;
        httpResponse = (io.ktor.client.statement.HttpResponse) this.Camera2StreamConfigurationMap;
        pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                io.ktor.utils.io.ByteReadChannelKt.cancel(httpResponse.getRawContent());
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th4) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th4));
            }
            m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
            }
        }
        io.ktor.client.statement.HttpResponse response = ((io.ktor.client.call.HttpClientCall) obj).getResponse();
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        io.ktor.utils.io.ByteReadChannelKt.cancel(httpResponse.getRawContent());
        java.lang.Object m23436constructorimpl2 = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        java.lang.Throwable m23439exceptionOrNullimpl2 = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl2);
        if (m23439exceptionOrNullimpl2 != null) {
            io.ktor.client.plugins.DoubleReceivePluginKt.access$getLOGGER().debug("Failed to cancel response body", m23439exceptionOrNullimpl2);
        }
        attributeKey2 = io.ktor.client.plugins.DoubleReceivePluginKt.getHighSpeedVideoSizes;
        attributes.put(attributeKey2, kotlin.Unit.INSTANCE);
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<io.ktor.client.statement.HttpResponse, kotlin.Unit> pipelineContext, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1 doubleReceivePluginKt$SaveBody$1$1 = new io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1(continuation);
        doubleReceivePluginKt$SaveBody$1$1.getHighSpeedVideoFpsRanges = pipelineContext;
        doubleReceivePluginKt$SaveBody$1$1.Camera2StreamConfigurationMap = httpResponse;
        return doubleReceivePluginKt$SaveBody$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    DoubleReceivePluginKt$SaveBody$1$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1> continuation) {
        super(3, continuation);
    }
}
