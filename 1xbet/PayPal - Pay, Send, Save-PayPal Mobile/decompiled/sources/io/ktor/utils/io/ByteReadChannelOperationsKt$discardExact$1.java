package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {385}, m = "discardExact", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, s = {"J$0"})
/* loaded from: classes3.dex */
final class ByteReadChannelOperationsKt$discardExact$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(null, 0L, this);
    }

    ByteReadChannelOperationsKt$discardExact$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperationsKt$discardExact$1> continuation) {
        super(continuation);
    }
}
