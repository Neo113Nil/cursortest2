package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ?? getHighSpeedVideoFpsRanges = ((kotlinx.coroutines.channels.ChannelResult) this.getHighSpeedVideoFpsRangesFor).getGetHighSpeedVideoFpsRanges();
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef = this.getHighSpeedVideoSizes;
        boolean z = getHighSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Failed;
        if (!z) {
            objectRef.element = getHighSpeedVideoFpsRanges;
        }
        kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> receiveChannel = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2 = this.getHighSpeedVideoSizes;
        if (z) {
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(getHighSpeedVideoFpsRanges);
            if (m24083exceptionOrNullimpl != null) {
                throw m24083exceptionOrNullimpl;
            }
            receiveChannel.cancel((java.util.concurrent.CancellationException) new kotlinx.coroutines.flow.internal.ChildCancelledException());
            objectRef2.element = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> channelResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1) create(kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channelResult.getGetHighSpeedVideoFpsRanges()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        flowKt__DelayKt$sample$2$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = objectRef;
        this.Camera2StreamConfigurationMap = receiveChannel;
    }
}
