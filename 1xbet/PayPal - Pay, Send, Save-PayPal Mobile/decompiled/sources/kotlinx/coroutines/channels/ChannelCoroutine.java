package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\r\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\r\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0011J+\u0010\u001b\u001a\u00020\u00032\u0019\u0010\u001a\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u000f¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u00030\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b%\u0010&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096A¢\u0006\u0004\b(\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00018\u0000H\u0097A¢\u0006\u0004\b*\u0010&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010 \u001a\u00028\u0000H\u0096A¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0001¢\u0006\u0004\b-\u0010$J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010 \u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b/\u00100R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048G¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u00107\u001a\u00020\b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020\b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000;8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0;8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010=R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000;8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010=R&\u0010G\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0C8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010F"}, d2 = {"Lkotlinx/coroutines/channels/ChannelCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;ZZ)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "cause", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "(Ljava/lang/Throwable;)V", "close", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "()Lkotlinx/coroutines/channels/ChannelIterator;", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "receiveOrNull", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryReceive-PtdJZtk", "tryReceive", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/Channel;", "get_channel", "()Lkotlinx/coroutines/channels/Channel;", "getChannel", "channel", "isClosedForReceive", "()Z", "isClosedForSend", "isEmpty", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ChannelCoroutine<E> extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> implements kotlinx.coroutines.channels.Channel<E> {
    private final kotlinx.coroutines.channels.Channel<E> _channel;

    protected final kotlinx.coroutines.channels.Channel<E> get_channel() {
        return this._channel;
    }

    public ChannelCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.Channel<E> channel, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this._channel = channel;
    }

    public final kotlinx.coroutines.channels.Channel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(java.util.concurrent.CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            kotlinx.coroutines.channels.ChannelCoroutine<E> channelCoroutine = this;
            cause = new kotlinx.coroutines.JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine);
        }
        cancelInternal(cause);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(java.lang.Throwable cause) {
        java.util.concurrent.CancellationException cancellationException$default = kotlinx.coroutines.JobSupport.toCancellationException$default(this, cause, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        kotlinx.coroutines.channels.ChannelCoroutine<E> channelCoroutine = this;
        cancelInternal(new kotlinx.coroutines.JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable cause) {
        kotlinx.coroutines.channels.ChannelCoroutine<E> channelCoroutine = this;
        cancelInternal(new kotlinx.coroutines.JobCancellationException(channelCoroutine.cancellationExceptionMessage(), null, channelCoroutine));
        return true;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public java.lang.Object mo9266trySendJP2dKIU(E element) {
        return this._channel.mo9266trySendJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk */
    public java.lang.Object mo24073tryReceivePtdJZtk() {
        return this._channel.mo24073tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this._channel.send(e, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> continuation) {
        return this._channel.receiveOrNull(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU */
    public java.lang.Object mo24072receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        java.lang.Object obj = this._channel.mo24072receiveCatchingJP2dKIU(continuation);
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return obj;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation) {
        return this._channel.receive(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        this._channel.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
        return this._channel.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
        return this._channel.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        return this._channel.close(cause);
    }
}
