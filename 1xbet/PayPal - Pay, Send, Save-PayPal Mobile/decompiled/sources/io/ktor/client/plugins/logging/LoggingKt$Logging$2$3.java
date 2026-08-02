package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/logging/ResponseHook$Context;", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$3", f = "Logging.kt", i = {0, 0, 0, 0}, l = {600, 607, 607}, m = "invokeSuspend", n = {"response", "callLogger", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "failed"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.ResponseHook.Context, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.logging.LogLevel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (r8.closeResponseLog(r13) != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r14 != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        io.ktor.client.statement.HttpResponse httpResponse;
        io.ktor.util.AttributeKey<?> attributeKey;
        io.ktor.util.AttributeKey attributeKey2;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger;
        java.lang.StringBuilder sb;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        int i2 = 1;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                io.ktor.client.plugins.logging.ResponseHook.Context context = (io.ktor.client.plugins.logging.ResponseHook.Context) this.getOutputFormats;
                httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
                if (this.getHighSpeedVideoSizes) {
                    return kotlin.Unit.INSTANCE;
                }
                if (this.Camera2StreamConfigurationMap != io.ktor.client.plugins.logging.LogLevel.NONE) {
                    io.ktor.util.Attributes attributes = httpResponse.getCall().getAttributes();
                    attributeKey = io.ktor.client.plugins.logging.LoggingKt.getHighResolutionOutputSizeshNQ4ISI;
                    if (!attributes.contains(attributeKey)) {
                        io.ktor.util.Attributes attributes2 = httpResponse.getCall().getAttributes();
                        attributeKey2 = io.ktor.client.plugins.logging.LoggingKt.getHighSpeedVideoFpsRanges;
                        httpClientCallLogger = (io.ktor.client.plugins.logging.HttpClientCallLogger) attributes2.get(attributeKey2);
                        sb = new java.lang.StringBuilder();
                        i = 0;
                        io.ktor.client.plugins.logging.LoggingUtilsKt.logResponseHeader(sb, httpResponse.getCall().getResponse(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
                        this.getOutputFormats = httpResponse;
                        this.getHighSpeedVideoFpsRanges = httpClientCallLogger;
                        this.getInputSizeshNQ4ISI = sb;
                        this.getHighResolutionOutputSizeshNQ4ISI = 0;
                        this.getHighSpeedVideoSizesFor = 1;
                        obj = context.proceed(this);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (java.lang.Throwable) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th;
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
            sb = (java.lang.StringBuilder) this.getInputSizeshNQ4ISI;
            httpClientCallLogger = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighSpeedVideoFpsRanges;
            httpResponse = (io.ktor.client.statement.HttpResponse) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            httpClientCallLogger.logResponseHeader(obj2);
            if (i != 0 || !this.Camera2StreamConfigurationMap.getBody()) {
                this.getOutputFormats = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoSizesFor = 2;
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            try {
                io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logResponseException(this.Camera2StreamConfigurationMap, sb, httpResponse.getCall().getRequest(), th2);
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    java.lang.String obj3 = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                    httpClientCallLogger.logResponseHeader(obj3);
                    if (i2 == 0 && this.Camera2StreamConfigurationMap.getBody()) {
                        throw th;
                    }
                    this.getOutputFormats = th;
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getInputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoSizesFor = 3;
                    if (httpClientCallLogger.closeResponseLog(this) != coroutine_suspended) {
                        th = th;
                        throw th;
                    }
                    return coroutine_suspended;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                i2 = i;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.logging.ResponseHook.Context context, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$3 loggingKt$Logging$2$3 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$3(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        loggingKt$Logging$2$3.getOutputFormats = context;
        loggingKt$Logging$2$3.getHighSpeedVideoFpsRanges = httpResponse;
        return loggingKt$Logging$2$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$3(boolean z, io.ktor.client.plugins.logging.LogLevel logLevel, java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> list, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$3> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = logLevel;
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
