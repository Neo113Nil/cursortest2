package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getInputFormats.getHighSpeedVideoFpsRangesFor((kotlinx.coroutines.channels.ChannelSegment) null, 0, 0L, (kotlin.coroutines.Continuation) this);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlinx.coroutines.channels.ChannelResult.m24079boximpl(highSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.getInputFormats = bufferedChannel;
    }
}
