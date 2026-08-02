package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {41}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$consumeEach$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
    }

    ChannelsKt__DeprecatedKt$consumeEach$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1> continuation) {
        super(continuation);
    }
}
