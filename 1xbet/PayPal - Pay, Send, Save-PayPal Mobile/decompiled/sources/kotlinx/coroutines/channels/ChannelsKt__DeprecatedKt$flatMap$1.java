package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (kotlinx.coroutines.channels.ChannelsKt.toChannel((kotlinx.coroutines.channels.ReceiveChannel) r9, r5, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (r9 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0086 -> B:7:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            it = this.Camera2StreamConfigurationMap.iterator();
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                java.lang.Object next = it.next();
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = producerScope;
                this.getHighSpeedVideoSizes = it;
                this.getHighSpeedVideoFpsRanges = 2;
                obj = function2.invoke(next, this);
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else if (i == 2) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = producerScope;
            this.getHighSpeedVideoSizes = it;
            this.getHighSpeedVideoFpsRanges = 3;
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor = producerScope;
        this.getHighSpeedVideoSizes = it;
        this.getHighSpeedVideoFpsRanges = 1;
        obj = it.hasNext(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        channelsKt__DeprecatedKt$flatMap$1.getHighSpeedVideoFpsRangesFor = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$flatMap$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = receiveChannel;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }
}
