package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0094@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "flowCollect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ProducerScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ChannelFlowOperator<S, T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    protected final kotlinx.coroutines.flow.Flow<S> flow;

    protected abstract java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(kotlinx.coroutines.flow.Flow<? extends S> flow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(coroutineContext, kotlinx.coroutines.flow.internal.ChannelFlowKt.access$withUndispatchedContextCollector(flowCollector, continuation.getContext()), null, new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.flow);
        sb.append(" -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.capacity == -3) {
            kotlin.coroutines.CoroutineContext context = continuation.getContext();
            kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(context, this.context);
            if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext, context)) {
                java.lang.Object flowCollect = flowCollect(flowCollector, continuation);
                return flowCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flowCollect : kotlin.Unit.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE), context.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE))) {
                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(flowCollector, newCoroutineContext, continuation);
                return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
            }
        }
        java.lang.Object collect = super.collect(flowCollector, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flowCollect = flowCollect(new kotlinx.coroutines.flow.internal.SendingCollector(producerScope), continuation);
        return flowCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flowCollect : kotlin.Unit.INSTANCE;
    }
}
