package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/Job;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "()Z", "", "exception", "completeExceptionally", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CompletableJob extends kotlinx.coroutines.Job {
    boolean complete();

    boolean completeExceptionally(java.lang.Throwable exception);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(kotlinx.coroutines.CompletableJob completableJob, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlinx.coroutines.Job.DefaultImpls.fold(completableJob, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.CompletableJob completableJob, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlinx.coroutines.Job.DefaultImpls.get(completableJob, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.CompletableJob completableJob, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlinx.coroutines.Job.DefaultImpls.minusKey(completableJob, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.CompletableJob completableJob, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlinx.coroutines.Job.DefaultImpls.plus(completableJob, coroutineContext);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static kotlinx.coroutines.Job plus(kotlinx.coroutines.CompletableJob completableJob, kotlinx.coroutines.Job job) {
            return kotlinx.coroutines.Job.DefaultImpls.plus((kotlinx.coroutines.Job) completableJob, job);
        }
    }
}
