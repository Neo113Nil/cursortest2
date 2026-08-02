package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0}, l = {34}, m = "logResponseBody", n = {"message"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpClientCallLogger$logResponseBody$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.plugins.logging.HttpClientCallLogger getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.logResponseBody(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCallLogger$logResponseBody$1(io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseBody$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = httpClientCallLogger;
    }
}
