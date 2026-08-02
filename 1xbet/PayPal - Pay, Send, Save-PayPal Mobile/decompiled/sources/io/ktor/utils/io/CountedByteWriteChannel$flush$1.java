package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", i = {}, l = {32}, m = "flush", n = {}, s = {})
/* loaded from: classes17.dex */
final class CountedByteWriteChannel$flush$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.CountedByteWriteChannel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.flush(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountedByteWriteChannel$flush$1(io.ktor.utils.io.CountedByteWriteChannel countedByteWriteChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.CountedByteWriteChannel$flush$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = countedByteWriteChannel;
    }
}
