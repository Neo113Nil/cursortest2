package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.ObservingUtilsKt", f = "ObservingUtils.kt", i = {0, 0, 1, 3}, l = {14, 15, 31, 33}, m = "observe", n = {"$this$observe", "log", "$this$observe", "$this$observe"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes17.dex */
final class ObservingUtilsKt$observe$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.logging.ObservingUtilsKt.observe(null, null, this);
    }

    ObservingUtilsKt$observe$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.ObservingUtilsKt$observe$1> continuation) {
        super(continuation);
    }
}
