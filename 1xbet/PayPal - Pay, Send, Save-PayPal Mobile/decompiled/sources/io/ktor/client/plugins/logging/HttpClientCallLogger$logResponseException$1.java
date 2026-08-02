package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {0}, l = {29}, m = "logResponseException", n = {"message"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class HttpClientCallLogger$logResponseException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.logging.HttpClientCallLogger getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.logResponseException(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCallLogger$logResponseException$1(io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.HttpClientCallLogger$logResponseException$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = httpClientCallLogger;
    }
}
