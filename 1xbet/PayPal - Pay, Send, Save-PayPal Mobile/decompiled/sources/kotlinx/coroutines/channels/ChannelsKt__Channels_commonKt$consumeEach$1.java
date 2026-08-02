package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {161}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(null, null, this);
    }

    ChannelsKt__Channels_commonKt$consumeEach$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1> continuation) {
        super(continuation);
    }
}
