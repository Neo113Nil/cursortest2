package io.ktor.utils.io.jvm.javaio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", i = {0}, l = {69}, m = "awaitContent", n = {com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY}, s = {"I$0"})
/* loaded from: classes17.dex */
final class RawSourceChannel$awaitContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.utils.io.jvm.javaio.RawSourceChannel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.awaitContent(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$1(io.ktor.utils.io.jvm.javaio.RawSourceChannel rawSourceChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = rawSourceChannel;
    }
}
