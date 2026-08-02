package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\f"}, d2 = {"T", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlin/Result;", "result", "", "completeWith", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/Job;", "parent", "CompletableDeferred", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableDeferred;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompletableDeferredKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(kotlinx.coroutines.CompletableDeferred<T> completableDeferred, java.lang.Object obj) {
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        return m23439exceptionOrNullimpl == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(m23439exceptionOrNullimpl);
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableDeferred CompletableDeferred$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.CompletableDeferredImpl(job);
    }

    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(T t) {
        kotlinx.coroutines.CompletableDeferredImpl completableDeferredImpl = new kotlinx.coroutines.CompletableDeferredImpl(null);
        completableDeferredImpl.complete(t);
        return completableDeferredImpl;
    }
}
