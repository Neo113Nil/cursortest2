package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$firstOrNull$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object firstOrNull;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        firstOrNull = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.firstOrNull(null, this);
        return firstOrNull;
    }

    ChannelsKt__DeprecatedKt$firstOrNull$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1> continuation) {
        super(continuation);
    }
}
