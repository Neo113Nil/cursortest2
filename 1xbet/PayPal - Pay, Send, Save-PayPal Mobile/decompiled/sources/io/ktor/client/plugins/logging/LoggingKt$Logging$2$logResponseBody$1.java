package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt", f = "Logging.kt", i = {0, 0, 1, 1, 1, 1}, l = {347, 368}, m = "Logging$lambda$16$logResponseBody", n = {"response", "logLines", "logLines", io.ktor.http.ContentDisposition.Parameters.Size, io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "duration"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$logResponseBody$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = io.ktor.client.plugins.logging.LoggingKt.getHighSpeedVideoFpsRangesFor(null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    LoggingKt$Logging$2$logResponseBody$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$logResponseBody$1> continuation) {
        super(continuation);
    }
}
