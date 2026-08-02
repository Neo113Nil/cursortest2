package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/paging/ChannelFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/channels/SendChannel;", "channel", "<init>", "(Lkotlinx/coroutines/channels/SendChannel;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChannelFlowCollector<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    private final kotlinx.coroutines.channels.SendChannel<T> channel;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowCollector(kotlinx.coroutines.channels.SendChannel<? super T> sendChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendChannel, "");
        this.channel = sendChannel;
    }

    public final kotlinx.coroutines.channels.SendChannel<T> getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = this.channel.send(t, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }
}
