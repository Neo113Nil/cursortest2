package androidx.core.util;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/Continuation;", "", "Ljava/lang/Runnable;", "asRunnable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Runnable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RunnableKt {
    public static final java.lang.Runnable asRunnable(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new androidx.core.util.ContinuationRunnable(continuation);
    }
}
