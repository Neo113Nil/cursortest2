package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086H¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086H¢\u0006\u0004\b\n\u0010\b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/coroutines/ThreadContextElement;", "asContextElement", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/ThreadContextElement;", "", "isPresent", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ensurePresent"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadContextElementKt {
    public static /* synthetic */ kotlinx.coroutines.ThreadContextElement asContextElement$default(java.lang.ThreadLocal threadLocal, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final <T> kotlinx.coroutines.ThreadContextElement<T> asContextElement(java.lang.ThreadLocal<T> threadLocal, T t) {
        return new kotlinx.coroutines.internal.ThreadLocalElement(t, threadLocal);
    }

    public static final java.lang.Object isPresent(java.lang.ThreadLocal<?> threadLocal, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(continuation.getContext().get(new kotlinx.coroutines.internal.ThreadLocalKey(threadLocal)) != null);
    }

    public static final java.lang.Object ensurePresent(java.lang.ThreadLocal<?> threadLocal, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (continuation.getContext().get(new kotlinx.coroutines.internal.ThreadLocalKey(threadLocal)) != null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreadLocal ");
        sb.append(threadLocal);
        sb.append(" is missing from context ");
        sb.append(continuation.getContext());
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
