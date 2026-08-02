package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\u00020\u00042\u0019\u0010\u0012\u001a\u0015\u0012\u000b\u0012\t\u0018\u00010\u000b¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00040\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\r8'X¦\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/coroutines/channels/SendChannel;", "E", "", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "isClosedForSend", "()Z", "isClosedForSend$annotations", "()V", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SendChannel<E> {
    boolean close(java.lang.Throwable cause);

    kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend();

    void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler);

    boolean isClosedForSend();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E element);

    java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* renamed from: trySend-JP2dKIU */
    java.lang.Object mo9266trySendJP2dKIU(E element);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void isClosedForSend$annotations() {
        }

        public static /* synthetic */ boolean close$default(kotlinx.coroutines.channels.SendChannel sendChannel, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return sendChannel.close(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(kotlinx.coroutines.channels.SendChannel<? super E> sendChannel, E e) {
            java.lang.Object mo9266trySendJP2dKIU = sendChannel.mo9266trySendJP2dKIU(e);
            if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(mo9266trySendJP2dKIU)) {
                return true;
            }
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(mo9266trySendJP2dKIU);
            if (m24083exceptionOrNullimpl == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(m24083exceptionOrNullimpl);
        }
    }
}
