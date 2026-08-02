package kotlinx.coroutines.channels;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\n\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cause", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/util/concurrent/CancellationException;)V", "", "", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BroadcastChannel<E> extends kotlinx.coroutines.channels.SendChannel<E> {
    void cancel(java.util.concurrent.CancellationException cause);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean cancel(java.lang.Throwable cause);

    kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean offer(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, E e) {
            return kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(broadcastChannel, e);
        }

        public static /* synthetic */ void cancel$default(kotlinx.coroutines.channels.BroadcastChannel broadcastChannel, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            broadcastChannel.cancel(cancellationException);
        }

        public static /* synthetic */ boolean cancel$default(kotlinx.coroutines.channels.BroadcastChannel broadcastChannel, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return broadcastChannel.cancel(th);
        }
    }
}
