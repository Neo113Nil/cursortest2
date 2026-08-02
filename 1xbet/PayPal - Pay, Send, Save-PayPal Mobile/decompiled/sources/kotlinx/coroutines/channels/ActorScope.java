package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/channels/ActorScope;", "E", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/Channel;", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "channel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ActorScope<E> extends kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.channels.ReceiveChannel<E> {
    kotlinx.coroutines.channels.Channel<E> getChannel();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <E> kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull(kotlinx.coroutines.channels.ActorScope<E> actorScope) {
            return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E poll(kotlinx.coroutines.channels.ActorScope<E> actorScope) {
            return (E) kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ActorScope<E> actorScope, kotlin.coroutines.Continuation<? super E> continuation) {
            return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, continuation);
        }
    }
}
