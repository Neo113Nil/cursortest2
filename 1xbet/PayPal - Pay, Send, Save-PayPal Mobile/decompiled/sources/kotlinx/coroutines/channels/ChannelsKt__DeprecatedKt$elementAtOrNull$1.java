package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$elementAtOrNull$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object elementAtOrNull;
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        elementAtOrNull = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.elementAtOrNull(null, 0, this);
        return elementAtOrNull;
    }

    ChannelsKt__DeprecatedKt$elementAtOrNull$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1> continuation) {
        super(continuation);
    }
}
