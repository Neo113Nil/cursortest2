package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0017\u0010\u0005\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\t\"\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\n8G¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onFrame", "withFrameMillis", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    public static /* synthetic */ void getMonotonicFrameClock$annotations(kotlin.coroutines.CoroutineContext coroutineContext) {
    }

    public static final <R> java.lang.Object withFrameMillis(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return monotonicFrameClock.withFrameNanos(new androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2(function1), continuation);
    }

    public static final <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(function1, continuation);
    }

    public static final <R> java.lang.Object withFrameMillis(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(new androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2(function1), continuation);
    }

    public static final androidx.compose.runtime.MonotonicFrameClock getMonotonicFrameClock(kotlin.coroutines.CoroutineContext coroutineContext) {
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) coroutineContext.get(androidx.compose.runtime.MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }
}
