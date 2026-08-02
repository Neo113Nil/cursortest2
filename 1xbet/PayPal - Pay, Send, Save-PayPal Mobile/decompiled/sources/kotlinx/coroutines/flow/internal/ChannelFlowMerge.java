package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "", "concurrency", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "additionalToStringProps", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChannelFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> Camera2StreamConfigurationMap;

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.Flow flow, int i, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, i, (i3 & 4) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? kotlinx.coroutines.channels.BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return new kotlinx.coroutines.flow.internal.ChannelFlowMerge(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope scope) {
        return kotlinx.coroutines.channels.ProduceKt.produce(scope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected final java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.Camera2StreamConfigurationMap.collect(new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2((kotlinx.coroutines.Job) continuation.getGetHighSpeedVideoSizes().get(kotlinx.coroutines.Job.INSTANCE), kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(this.getHighSpeedVideoFpsRanges, 0, 2, null), producerScope, new kotlinx.coroutines.flow.internal.SendingCollector(producerScope)), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected final java.lang.String additionalToStringProps() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("concurrency=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return sb.toString();
    }
}
