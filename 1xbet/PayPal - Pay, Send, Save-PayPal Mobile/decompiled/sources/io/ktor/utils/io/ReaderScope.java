package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getChannel", "()Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReaderScope implements kotlinx.coroutines.CoroutineScope {
    private final io.ktor.utils.io.ByteReadChannel channel;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    public ReaderScope(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.channel = byteReadChannel;
        this.coroutineContext = coroutineContext;
    }

    public final io.ktor.utils.io.ByteReadChannel getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
