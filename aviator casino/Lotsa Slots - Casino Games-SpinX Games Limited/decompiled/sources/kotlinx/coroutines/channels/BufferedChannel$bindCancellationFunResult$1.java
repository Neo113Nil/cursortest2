package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BufferedChannel$bindCancellationFunResult$1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<java.lang.Throwable, kotlinx.coroutines.channels.ChannelResult<? extends E>, kotlin.coroutines.CoroutineContext, kotlin.Unit> {
    BufferedChannel$bindCancellationFunResult$1(java.lang.Object obj) {
        super(3, obj, kotlinx.coroutines.channels.BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        m12313invoke5_sEAP8(th, ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder(), coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke-5_sEAP8, reason: not valid java name */
    public final void m12313invoke5_sEAP8(java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        ((kotlinx.coroutines.channels.BufferedChannel) this.receiver).m12307onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, coroutineContext);
    }
}
