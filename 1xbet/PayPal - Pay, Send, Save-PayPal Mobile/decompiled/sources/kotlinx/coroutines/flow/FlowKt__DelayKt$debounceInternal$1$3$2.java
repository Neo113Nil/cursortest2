package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ?? getHighSpeedVideoFpsRanges = ((kotlinx.coroutines.channels.ChannelResult) this.getHighSpeedVideoFpsRanges).getGetHighSpeedVideoFpsRanges();
            kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef3 = this.getHighSpeedVideoFpsRangesFor;
            boolean z = getHighSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
            if (!z) {
                objectRef3.element = getHighSpeedVideoFpsRanges;
            }
            objectRef = this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoSizes;
            if (z) {
                java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(getHighSpeedVideoFpsRanges);
                if (m24083exceptionOrNullimpl != null) {
                    throw m24083exceptionOrNullimpl;
                }
                if (objectRef.element != null) {
                    kotlinx.coroutines.internal.Symbol symbol = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    java.lang.Object obj2 = objectRef.element;
                    if (obj2 == symbol) {
                        obj2 = null;
                    }
                    this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges;
                    this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
                    this.Camera2StreamConfigurationMap = 1;
                    if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        objectRef = objectRef2;
        objectRef.element = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> channelResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2) create(kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channelResult.getGetHighSpeedVideoFpsRanges()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.getHighSpeedVideoFpsRanges = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$debounceInternal$1$3$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = objectRef;
        this.getHighSpeedVideoSizes = flowCollector;
    }
}
