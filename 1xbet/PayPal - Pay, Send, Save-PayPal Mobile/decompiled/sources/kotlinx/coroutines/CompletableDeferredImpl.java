package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\f8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/CompletableDeferredImpl;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/Job;", "p0", "<init>", "(Lkotlinx/coroutines/Job;)V", "getCompleted", "()Ljava/lang/Object;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "(Ljava/lang/Object;)Z", "", "completeExceptionally", "(Ljava/lang/Throwable;)Z", "getOnCancelComplete$kotlinx_coroutines_core", "()Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CompletableDeferredImpl<T> extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableDeferred<T> {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }

    public CompletableDeferredImpl(kotlinx.coroutines.Job job) {
        super(true);
        initParentJob(job);
    }

    @Override // kotlinx.coroutines.Deferred
    public final T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public final java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object awaitInternal = awaitInternal(continuation);
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.Deferred
    public final kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
        kotlinx.coroutines.selects.SelectClause1<T> selectClause1 = (kotlinx.coroutines.selects.SelectClause1<T>) getOnAwaitInternal();
        kotlin.jvm.internal.Intrinsics.checkNotNull(selectClause1, "");
        return selectClause1;
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean complete(T p0) {
        return makeCompleting$kotlinx_coroutines_core(p0);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean completeExceptionally(java.lang.Throwable p0) {
        return makeCompleting$kotlinx_coroutines_core(new kotlinx.coroutines.CompletedExceptionally(p0, false, 2, null));
    }
}
