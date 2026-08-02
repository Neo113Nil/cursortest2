package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperatorImpl;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "dropChannelOperators", "()Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "flowCollect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelFlowOperatorImpl<T> extends kotlinx.coroutines.flow.internal.ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, (i2 & 2) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? kotlinx.coroutines.channels.BufferOverflow.SUSPEND : bufferOverflow);
    }

    public ChannelFlowOperatorImpl(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(flow, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
        return (kotlinx.coroutines.flow.Flow<T>) this.flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    protected final java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.flow.collect(flowCollector, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
