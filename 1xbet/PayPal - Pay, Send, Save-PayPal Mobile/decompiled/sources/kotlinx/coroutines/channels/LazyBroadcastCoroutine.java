package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BL\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/coroutines/channels/LazyBroadcastCoroutine;", "E", "Lkotlinx/coroutines/channels/BroadcastCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlinx/coroutines/channels/BroadcastChannel;", "p1", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "onStart", "()V", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LazyBroadcastCoroutine<E> extends kotlinx.coroutines.channels.BroadcastCoroutine<E> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    public LazyBroadcastCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        super(coroutineContext, broadcastChannel, false);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public final kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = getHighSpeedVideoSizes().openSubscription();
        start();
        return openSubscription;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onStart() {
        kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }
}
