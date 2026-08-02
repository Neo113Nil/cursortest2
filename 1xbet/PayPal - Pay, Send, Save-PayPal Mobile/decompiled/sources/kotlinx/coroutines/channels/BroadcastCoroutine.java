package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ5\u0010\u001c\u001a\u00020\u00032#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00030\u0018H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030%2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b&\u0010'R \u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0005X\u0085\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u0000018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\t8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010/R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001068\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastCoroutine;", "E", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlin/coroutines/CoroutineContext;", "p0", "p1", "", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Z)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "(Ljava/lang/Throwable;)V", "onCancelled", "(Ljava/lang/Throwable;Z)V", "close", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cause", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/BroadcastChannel;", "getHighSpeedVideoSizes", "()Lkotlinx/coroutines/channels/BroadcastChannel;", "getHighSpeedVideoFpsRangesFor", "isActive", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/SendChannel;", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "isClosedForSend", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
class BroadcastCoroutine<E> extends kotlinx.coroutines.AbstractCoroutine<kotlin.Unit> implements kotlinx.coroutines.channels.ProducerScope<E>, kotlinx.coroutines.channels.BroadcastChannel<E> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.BroadcastChannel<E> getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.coroutines.AbstractCoroutine
    public /* synthetic */ void onCompleted(kotlin.Unit unit) {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
    }

    protected final kotlinx.coroutines.channels.BroadcastChannel<E> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public BroadcastCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, boolean z) {
        super(coroutineContext, false, z);
        this.getHighSpeedVideoFpsRangesFor = broadcastChannel;
        initParentJob((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public kotlinx.coroutines.channels.SendChannel<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(java.lang.Throwable p0) {
        java.util.concurrent.CancellationException cancellationException$default = kotlinx.coroutines.JobSupport.toCancellationException$default(this, p0, null, 1, null);
        this.getHighSpeedVideoFpsRangesFor.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(java.lang.Throwable p0, boolean p1) {
        if (this.getHighSpeedVideoFpsRangesFor.close(p0) || p1) {
            return;
        }
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getGetHighSpeedVideoSizes(), p0);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable p0) {
        boolean close = this.getHighSpeedVideoFpsRangesFor.close(p0);
        start();
        return close;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable p0) {
        if (p0 == null) {
            kotlinx.coroutines.channels.BroadcastCoroutine<E> broadcastCoroutine = this;
            p0 = new kotlinx.coroutines.JobCancellationException(broadcastCoroutine.cancellationExceptionMessage(), null, broadcastCoroutine);
        }
        cancelInternal(p0);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(java.util.concurrent.CancellationException p0) {
        if (p0 == null) {
            kotlinx.coroutines.channels.BroadcastCoroutine<E> broadcastCoroutine = this;
            p0 = new kotlinx.coroutines.JobCancellationException(broadcastCoroutine.cancellationExceptionMessage(), null, broadcastCoroutine);
        }
        cancelInternal(p0);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public java.lang.Object mo9266trySendJP2dKIU(E p0) {
        return this.getHighSpeedVideoFpsRangesFor.mo9266trySendJP2dKIU(p0);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.send(e, continuation);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        return this.getHighSpeedVideoFpsRangesFor.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E p0) {
        return this.getHighSpeedVideoFpsRangesFor.offer(p0);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.getHighSpeedVideoFpsRangesFor.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> p0) {
        this.getHighSpeedVideoFpsRangesFor.invokeOnClose(p0);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
        return this.getHighSpeedVideoFpsRangesFor.getOnSend();
    }
}
