package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/logging/ReceiveHook$Context;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lio/ktor/client/call/HttpClientCall;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$4", f = "Logging.kt", i = {0, 1, 1, 2}, l = {619, 624, 625}, m = "invokeSuspend", n = {androidx.core.app.NotificationCompat.CATEGORY_CALL, "cause", "callLogger", "cause"}, s = {"L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.ReceiveHook.Context, io.ktor.client.call.HttpClientCall, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.client.plugins.logging.LogLevel Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r8 != r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.client.call.HttpClientCall] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.AttributeKey attributeKey;
        io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger;
        io.ktor.util.AttributeKey<?> attributeKey2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            io.ktor.util.Attributes attributes = r1.getAttributes();
            attributeKey = io.ktor.client.plugins.logging.LoggingKt.getHighSpeedVideoFpsRanges;
            io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger2 = (io.ktor.client.plugins.logging.HttpClientCallLogger) attributes.get(attributeKey);
            io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logResponseException(this.Camera2StreamConfigurationMap, sb, r1.getRequest(), th);
            java.lang.String obj2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.getHighSpeedVideoFpsRangesFor = httpClientCallLogger2;
            this.getHighSpeedVideoFpsRanges = 2;
            if (httpClientCallLogger2.logResponseException(obj2, this) != coroutine_suspended) {
                httpClientCallLogger = httpClientCallLogger2;
            }
        }
        if (r1 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.logging.ReceiveHook.Context context = (io.ktor.client.plugins.logging.ReceiveHook.Context) this.getHighResolutionOutputSizeshNQ4ISI;
            io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) this.getHighSpeedVideoFpsRangesFor;
            if (this.getHighSpeedVideoSizes) {
                return kotlin.Unit.INSTANCE;
            }
            if (this.Camera2StreamConfigurationMap != io.ktor.client.plugins.logging.LogLevel.NONE) {
                io.ktor.util.Attributes attributes2 = httpClientCall.getAttributes();
                attributeKey2 = io.ktor.client.plugins.logging.LoggingKt.getHighResolutionOutputSizeshNQ4ISI;
                if (!attributes2.contains(attributeKey2)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = httpClientCall;
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = context.proceed(this);
                    r1 = httpClientCall;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (r1 != 1) {
            if (r1 != 2) {
                if (r1 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Throwable th2 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th2;
            }
            httpClientCallLogger = (io.ktor.client.plugins.logging.HttpClientCallLogger) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Throwable th3 = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            th = th3;
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = 3;
            if (httpClientCallLogger.closeResponseLog(this) != coroutine_suspended) {
                throw th;
            }
            return coroutine_suspended;
        }
        io.ktor.client.call.HttpClientCall httpClientCall2 = (io.ktor.client.call.HttpClientCall) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        r1 = httpClientCall2;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.logging.ReceiveHook.Context context, io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$4 loggingKt$Logging$2$4 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$4(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        loggingKt$Logging$2$4.getHighResolutionOutputSizeshNQ4ISI = context;
        loggingKt$Logging$2$4.getHighSpeedVideoFpsRangesFor = httpClientCall;
        return loggingKt$Logging$2$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$4(boolean z, io.ktor.client.plugins.logging.LogLevel logLevel, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$4> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = logLevel;
    }
}
