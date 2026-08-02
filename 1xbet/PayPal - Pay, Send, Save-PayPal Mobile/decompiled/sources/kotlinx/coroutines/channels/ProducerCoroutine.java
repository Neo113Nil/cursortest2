package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/channels/ProducerCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlinx/coroutines/channels/Channel;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;)V", "", "", "", "onCancelled", "(Ljava/lang/Throwable;Z)V", "isActive", "()Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ProducerCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ProducerScope<E> {
    @Override // kotlinx.coroutines.channels.ProducerScope
    public final /* bridge */ /* synthetic */ kotlinx.coroutines.channels.SendChannel getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final /* synthetic */ void onCompleted(kotlin.Unit unit) {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(get_channel(), null, 1, null);
    }

    public ProducerCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.Channel<E> channel) {
        super(coroutineContext, channel, true, true);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(java.lang.Throwable p0, boolean p1) {
        if (get_channel().close(p0) || p1) {
            return;
        }
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getGetInputFormats(), p0);
    }
}
