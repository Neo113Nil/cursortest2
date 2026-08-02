package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.CountedByteReadChannel", f = "CountedByteReadChannel.kt", i = {}, l = {48}, m = "awaitContent", n = {}, s = {})
/* loaded from: classes3.dex */
final class CountedByteReadChannel$awaitContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.utils.io.CountedByteReadChannel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.awaitContent(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountedByteReadChannel$awaitContent$1(io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.utils.io.CountedByteReadChannel$awaitContent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = countedByteReadChannel;
    }
}
