package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> Camera2StreamConfigurationMap;
    final /* synthetic */ E getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.SendChannel<E> sendChannel = this.Camera2StreamConfigurationMap;
                E e = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.getHighSpeedVideoFpsRanges = 1;
                if (sendChannel.send(e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return kotlinx.coroutines.channels.ChannelResult.m24079boximpl(kotlin.Result.m23442isSuccessimpl(m23436constructorimpl) ? kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE) : kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24092closedJP2dKIU(kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.getHighSpeedVideoSizes = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__ChannelsKt$trySendBlocking$2(kotlinx.coroutines.channels.SendChannel<? super E> sendChannel, E e, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = sendChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = e;
    }
}
