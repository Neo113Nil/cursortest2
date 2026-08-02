package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/channels/ActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ChannelCoroutine;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlinx/coroutines/channels/Channel;", "p1", "", "p2", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Z)V", "", "", "onCancelling", "(Ljava/lang/Throwable;)V", "handleJobException", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
class ActorCoroutine<E> extends kotlinx.coroutines.channels.ChannelCoroutine<E> implements kotlinx.coroutines.channels.ActorScope<E> {
    public ActorCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.channels.Channel<E> channel, boolean z) {
        super(coroutineContext, channel, false, z);
        initParentJob((kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE));
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onCancelling(java.lang.Throwable p0) {
        kotlinx.coroutines.channels.Channel<E> channel = get_channel();
        if (p0 != null) {
            r1 = p0 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) p0 : null;
            if (r1 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
                sb.append(" was cancelled");
                r1 = kotlinx.coroutines.ExceptionsKt.CancellationException(sb.toString(), p0);
            }
        }
        channel.cancel(r1);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(java.lang.Throwable p0) {
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getGetHighSpeedVideoSizes(), p0);
        return true;
    }
}
