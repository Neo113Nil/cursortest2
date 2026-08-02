package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BT\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R;\u0010\u0019\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", "T", "Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "", "p2", "Lkotlinx/coroutines/channels/BufferOverflow;", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CallbackFlowBuilder<T> extends kotlinx.coroutines.flow.ChannelFlowBuilder<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    public /* synthetic */ CallbackFlowBuilder(kotlin.jvm.functions.Function2 function2, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? kotlinx.coroutines.channels.BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CallbackFlowBuilder(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow);
        this.getHighSpeedVideoFpsRanges = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) continuation;
            if ((callbackFlowBuilder$collectTo$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = callbackFlowBuilder$collectTo$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = callbackFlowBuilder$collectTo$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    callbackFlowBuilder$collectTo$1.getHighSpeedVideoSizes = producerScope;
                    callbackFlowBuilder$collectTo$1.getHighSpeedVideoFpsRanges = 1;
                    if (super.collectTo(producerScope, callbackFlowBuilder$collectTo$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) callbackFlowBuilder$collectTo$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (producerScope.isClosedForSend()) {
                    throw new java.lang.IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        callbackFlowBuilder$collectTo$1 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1(this, continuation);
        java.lang.Object obj2 = callbackFlowBuilder$collectTo$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = callbackFlowBuilder$collectTo$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (producerScope.isClosedForSend()) {
        }
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext p0, int p1, kotlinx.coroutines.channels.BufferOverflow p2) {
        return new kotlinx.coroutines.flow.CallbackFlowBuilder(this.getHighSpeedVideoFpsRanges, p0, p1, p2);
    }
}
