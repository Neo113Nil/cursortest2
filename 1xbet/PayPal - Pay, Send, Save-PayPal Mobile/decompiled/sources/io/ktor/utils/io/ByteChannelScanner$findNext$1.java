package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", i = {0, 1, 2}, l = {53, 55, 58, 70}, m = "findNext$ktor_io", n = {"ignoreMissing", "ignoreMissing", "ignoreMissing"}, s = {"Z$0", "Z$0", "Z$0"})
/* loaded from: classes17.dex */
final class ByteChannelScanner$findNext$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteChannelScanner getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.findNext$ktor_io(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$findNext$1(io.ktor.utils.io.ByteChannelScanner byteChannelScanner, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannelScanner$findNext$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = byteChannelScanner;
    }
}
