package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt", f = "Logging.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {197, 207}, m = "Logging$lambda$16$logRequestBody", n = {"content", "headers", "method", "logLines", "method", "logLines", io.ktor.http.ContentDisposition.Parameters.Size, io.ktor.http.auth.HttpAuthHeader.Parameters.Charset}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$logRequestBody$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = io.ktor.client.plugins.logging.LoggingKt.getHighSpeedVideoSizes(null, null, null, null, null, null, null, this);
        return highSpeedVideoSizes;
    }

    LoggingKt$Logging$2$logRequestBody$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$logRequestBody$1> continuation) {
        super(continuation);
    }
}
