package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", i = {}, l = {99, 105, 110}, m = "advanceToNextPotentialMatch", n = {}, s = {})
/* loaded from: classes17.dex */
final class ByteChannelScanner$advanceToNextPotentialMatch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.utils.io.ByteChannelScanner getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$advanceToNextPotentialMatch$1(io.ktor.utils.io.ByteChannelScanner byteChannelScanner, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = byteChannelScanner;
    }
}
