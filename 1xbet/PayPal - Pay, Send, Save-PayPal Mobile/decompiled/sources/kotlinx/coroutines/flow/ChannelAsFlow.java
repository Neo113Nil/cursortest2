package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0094@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "channel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "consume", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "markConsumed", "", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "collectTo", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceImpl", "Lkotlinx/coroutines/CoroutineScope;", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "additionalToStringProps", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ChannelAsFlow<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.flow.ChannelAsFlow.class, "consumed$volatile");
    private final boolean Camera2StreamConfigurationMap;
    private volatile /* synthetic */ int consumed$volatile;
    private final kotlinx.coroutines.channels.ReceiveChannel<T> getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, boolean z) {
        this(receiveChannel, z, kotlin.coroutines.EmptyCoroutineContext.INSTANCE, -3, kotlinx.coroutines.channels.BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel, boolean z, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
        this.Camera2StreamConfigurationMap = z;
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.Camera2StreamConfigurationMap && getHighSpeedVideoSizes.getAndSet(this, 1) == 1) {
            throw new java.lang.IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return new kotlinx.coroutines.flow.ChannelAsFlow(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
        return new kotlinx.coroutines.flow.ChannelAsFlow(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoSizes;
        highSpeedVideoSizes = kotlinx.coroutines.flow.FlowKt__ChannelsKt.getHighSpeedVideoSizes(new kotlinx.coroutines.flow.internal.SendingCollector(producerScope), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope scope) {
        getHighSpeedVideoFpsRanges();
        if (this.capacity == -3) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return super.produceImpl(scope);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoSizes;
        if (this.capacity == -3) {
            getHighSpeedVideoFpsRanges();
            highSpeedVideoSizes = kotlinx.coroutines.flow.FlowKt__ChannelsKt.getHighSpeedVideoSizes(flowCollector, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        java.lang.Object collect = super.collect(flowCollector, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final java.lang.String additionalToStringProps() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("channel=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
