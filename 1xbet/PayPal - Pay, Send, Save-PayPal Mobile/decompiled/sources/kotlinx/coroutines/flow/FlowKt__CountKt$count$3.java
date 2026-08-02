package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, n = {"i"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__CountKt$count$3<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.count(null, null, this);
    }

    FlowKt__CountKt$count$3(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__CountKt$count$3> continuation) {
        super(continuation);
    }
}
