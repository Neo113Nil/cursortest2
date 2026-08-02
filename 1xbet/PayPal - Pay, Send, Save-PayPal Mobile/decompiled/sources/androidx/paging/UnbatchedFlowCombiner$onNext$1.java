package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", i = {0, 0, 1, 1, 1, 2}, l = {174, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "onNext", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "index", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$withLock_u24default$iv", "index", "$this$withLock_u24default$iv"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "L$0"}, v = 1)
/* loaded from: classes7.dex */
final class UnbatchedFlowCombiner$onNext$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.paging.UnbatchedFlowCombiner<T1, T2> getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.onNext(0, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbatchedFlowCombiner$onNext$1(androidx.paging.UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, kotlin.coroutines.Continuation<? super androidx.paging.UnbatchedFlowCombiner$onNext$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = unbatchedFlowCombiner;
    }
}
