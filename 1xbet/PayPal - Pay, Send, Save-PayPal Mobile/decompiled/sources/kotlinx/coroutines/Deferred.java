package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/coroutines/Deferred;", "T", "Lkotlinx/coroutines/Job;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwait"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Deferred<T> extends kotlinx.coroutines.Job {
    java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation);

    T getCompleted();

    java.lang.Throwable getCompletionExceptionOrNull();

    kotlinx.coroutines.selects.SelectClause1<T> getOnAwait();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T, R> R fold(kotlinx.coroutines.Deferred<? extends T> deferred, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlinx.coroutines.Job.DefaultImpls.fold(deferred, r, function2);
        }

        public static <T, E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.Deferred<? extends T> deferred, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlinx.coroutines.Job.DefaultImpls.get(deferred, key);
        }

        public static <T> kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.Deferred<? extends T> deferred, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlinx.coroutines.Job.DefaultImpls.minusKey(deferred, key);
        }

        public static <T> kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.Deferred<? extends T> deferred, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlinx.coroutines.Job.DefaultImpls.plus(deferred, coroutineContext);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static <T> kotlinx.coroutines.Job plus(kotlinx.coroutines.Deferred<? extends T> deferred, kotlinx.coroutines.Job job) {
            return kotlinx.coroutines.Job.DefaultImpls.plus((kotlinx.coroutines.Job) deferred, job);
        }
    }
}
