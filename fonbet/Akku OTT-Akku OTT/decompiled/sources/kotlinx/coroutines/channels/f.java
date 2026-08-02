package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.InterfaceC1096l;

/* loaded from: classes5.dex */
public final class f {
    public static final l<Object> a = new l<>(-1, null, null, 0);

    @JvmField
    public static final int b = com.bumptech.glide.load.engine.q.c(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = com.bumptech.glide.load.engine.q.c(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    @JvmField
    public static final kotlinx.coroutines.internal.x d = new kotlinx.coroutines.internal.x("BUFFERED");
    public static final kotlinx.coroutines.internal.x e = new kotlinx.coroutines.internal.x("SHOULD_BUFFER");
    public static final kotlinx.coroutines.internal.x f = new kotlinx.coroutines.internal.x("S_RESUMING_BY_RCV");
    public static final kotlinx.coroutines.internal.x g = new kotlinx.coroutines.internal.x("RESUMING_BY_EB");
    public static final kotlinx.coroutines.internal.x h = new kotlinx.coroutines.internal.x("POISONED");
    public static final kotlinx.coroutines.internal.x i = new kotlinx.coroutines.internal.x("DONE_RCV");
    public static final kotlinx.coroutines.internal.x j = new kotlinx.coroutines.internal.x("INTERRUPTED_SEND");
    public static final kotlinx.coroutines.internal.x k = new kotlinx.coroutines.internal.x("INTERRUPTED_RCV");
    public static final kotlinx.coroutines.internal.x l = new kotlinx.coroutines.internal.x("CHANNEL_CLOSED");
    public static final kotlinx.coroutines.internal.x m = new kotlinx.coroutines.internal.x("SUSPEND");
    public static final kotlinx.coroutines.internal.x n = new kotlinx.coroutines.internal.x("SUSPEND_NO_WAITER");
    public static final kotlinx.coroutines.internal.x o = new kotlinx.coroutines.internal.x("FAILED");
    public static final kotlinx.coroutines.internal.x p = new kotlinx.coroutines.internal.x("NO_RECEIVE_RESULT");
    public static final kotlinx.coroutines.internal.x q = new kotlinx.coroutines.internal.x("CLOSE_HANDLER_CLOSED");
    public static final kotlinx.coroutines.internal.x r = new kotlinx.coroutines.internal.x("CLOSE_HANDLER_INVOKED");
    public static final kotlinx.coroutines.internal.x s = new kotlinx.coroutines.internal.x("NO_CLOSE_CAUSE");

    public static final <T> boolean a(InterfaceC1096l<? super T> interfaceC1096l, T t, Function3<? super Throwable, ? super T, ? super CoroutineContext, Unit> function3) {
        kotlinx.coroutines.internal.x b2 = interfaceC1096l.b(t, function3);
        if (b2 == null) {
            return false;
        }
        interfaceC1096l.k(b2);
        return true;
    }
}
