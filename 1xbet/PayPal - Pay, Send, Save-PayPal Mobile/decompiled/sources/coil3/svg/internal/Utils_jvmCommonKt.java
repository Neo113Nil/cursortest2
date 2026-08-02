package coil3.svg.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080H¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "runInterruptible", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Utils_jvmCommonKt {
    public static final <T> java.lang.Object runInterruptible(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.InterruptibleKt.runInterruptible(coroutineContext, function0, continuation);
    }

    public static /* synthetic */ java.lang.Object runInterruptible$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return kotlinx.coroutines.InterruptibleKt.runInterruptible(coroutineContext, function0, continuation);
    }
}
