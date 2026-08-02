package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BL\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010%\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlinx/coroutines/channels/Channel;", "p1", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;)V", "onStart", "()V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "close", "(Ljava/lang/Throwable;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/Continuation;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LazyActorCoroutine<E> extends kotlinx.coroutines.channels.ActorCoroutine<E> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.coroutines.Continuation<? super kotlin.Unit> Camera2StreamConfigurationMap;

    public LazyActorCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.Channel<E> channel, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        super(coroutineContext, channel, false);
        this.Camera2StreamConfigurationMap = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onStart() {
        kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(this.Camera2StreamConfigurationMap, this);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public final java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        start();
        java.lang.Object send = super.send(e, continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public final boolean offer(E p0) {
        start();
        return super.offer(p0);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public final java.lang.Object mo9266trySendJP2dKIU(E p0) {
        start();
        return super.mo9266trySendJP2dKIU(p0);
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public final boolean close(java.lang.Throwable p0) {
        boolean close = super.close(p0);
        start();
        return close;
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
        kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = kotlinx.coroutines.channels.LazyActorCoroutine$onSend$1.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(lazyActorCoroutine$onSend$1, "");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(lazyActorCoroutine$onSend$1, 3), super.getOnSend().getProcessResFunc(), null, 8, null);
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.LazyActorCoroutine lazyActorCoroutine, kotlinx.coroutines.selects.SelectInstance selectInstance, java.lang.Object obj) {
        lazyActorCoroutine.onStart();
        super.getOnSend().getRegFunc().invoke(lazyActorCoroutine, selectInstance, obj);
    }
}
