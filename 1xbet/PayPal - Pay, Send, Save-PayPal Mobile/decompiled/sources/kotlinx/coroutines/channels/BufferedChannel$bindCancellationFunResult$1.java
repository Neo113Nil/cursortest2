package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<java.lang.Throwable, kotlinx.coroutines.channels.ChannelResult<? extends E>, kotlin.coroutines.CoroutineContext, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.channels.BufferedChannel.m24070access$onCancellationChannelResultImplDoNotCall5_sEAP8((kotlinx.coroutines.channels.BufferedChannel) this.receiver, th, ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges(), coroutineContext);
        return kotlin.Unit.INSTANCE;
    }

    BufferedChannel$bindCancellationFunResult$1(java.lang.Object obj) {
        super(3, obj, kotlinx.coroutines.channels.BufferedChannel.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }
}
