package kotlinx.coroutines.future;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/future/CompletableFutureCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Ljava/util/function/BiFunction;", "", "", "Lkotlin/coroutines/CoroutineContext;", "p0", "Ljava/util/concurrent/CompletableFuture;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CompletableFuture;)V", "onCompleted", "(Ljava/lang/Object;)V", "", "onCancelled", "(Ljava/lang/Throwable;Z)V", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/CompletableFuture;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CompletableFutureCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.Unit> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.CompletableFuture<T> getHighSpeedVideoFpsRanges;

    @Override // java.util.function.BiFunction
    public final /* synthetic */ kotlin.Unit apply(java.lang.Object obj, java.lang.Throwable th) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public CompletableFutureCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CompletableFuture<T> completableFuture) {
        super(coroutineContext, true, true);
        this.getHighSpeedVideoFpsRanges = completableFuture;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCompleted(T p0) {
        this.getHighSpeedVideoFpsRanges.complete(p0);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public final void onCancelled(java.lang.Throwable p0, boolean p1) {
        this.getHighSpeedVideoFpsRanges.completeExceptionally(p0);
    }
}
