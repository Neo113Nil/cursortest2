package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", i = {}, l = {54}, m = "closeResponseLog", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpClientCallLogger$closeResponseLog$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.plugins.logging.HttpClientCallLogger getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.closeResponseLog(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCallLogger$closeResponseLog$1(io.ktor.client.plugins.logging.HttpClientCallLogger httpClientCallLogger, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.HttpClientCallLogger$closeResponseLog$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = httpClientCallLogger;
    }
}
