package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "runInterruptible", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InterruptibleKt {
    public static /* synthetic */ java.lang.Object runInterruptible$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return runInterruptible(coroutineContext, function0, continuation);
    }

    public static final <T> java.lang.Object runInterruptible(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(coroutineContext, new kotlinx.coroutines.InterruptibleKt$runInterruptible$2(function0, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getHighSpeedVideoFpsRanges(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function0<? extends T> function0) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2;
        try {
            kotlinx.coroutines.ThreadState threadState = new kotlinx.coroutines.ThreadState();
            threadState.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(kotlinx.coroutines.JobKt.getJob(coroutineContext), false, threadState, 1, null);
            atomicIntegerFieldUpdater = kotlinx.coroutines.ThreadState.getHighSpeedVideoFpsRanges;
            try {
                do {
                    i = atomicIntegerFieldUpdater.get(threadState);
                    if (i == 0) {
                        atomicIntegerFieldUpdater2 = kotlinx.coroutines.ThreadState.getHighSpeedVideoFpsRanges;
                    } else if (i != 2 && i != 3) {
                        kotlinx.coroutines.ThreadState.getHighSpeedVideoFpsRangesFor(i);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    return function0.invoke();
                } while (!atomicIntegerFieldUpdater2.compareAndSet(threadState, i, 0));
                return function0.invoke();
            } finally {
                threadState.getHighResolutionOutputSizeshNQ4ISI();
            }
        } catch (java.lang.InterruptedException e) {
            throw new java.util.concurrent.CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
