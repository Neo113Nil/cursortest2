package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getHighSpeedVideoFpsRanges = ((kotlinx.coroutines.channels.ChannelResult) this.getHighSpeedVideoFpsRanges).getGetHighSpeedVideoFpsRanges();
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoSizes;
            if (!(getHighSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Failed)) {
                this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = 1;
                if (flowCollector.emit(getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = getHighSpeedVideoFpsRanges;
            }
            if (getHighSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(getHighSpeedVideoFpsRanges);
            if (m24083exceptionOrNullimpl != null) {
                throw m24083exceptionOrNullimpl;
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        getHighSpeedVideoFpsRanges = obj2;
        if (getHighSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1) create(kotlinx.coroutines.channels.ChannelResult.m24079boximpl(((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1(this.getHighSpeedVideoSizes, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.getHighSpeedVideoFpsRanges = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$timeoutInternal$1$1$1(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = flowCollector;
    }
}
