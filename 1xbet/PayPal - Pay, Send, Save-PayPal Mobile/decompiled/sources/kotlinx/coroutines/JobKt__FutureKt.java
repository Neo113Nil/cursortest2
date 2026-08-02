package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CancellableContinuation;", "Ljava/util/concurrent/Future;", "p0", "", "cancelFutureOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/util/concurrent/Future;)V"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes3.dex */
final /* synthetic */ class JobKt__FutureKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @kotlin.ReplaceWith(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void cancelFutureOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, java.util.concurrent.Future<?> future) {
        kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(cancellableContinuation, new kotlinx.coroutines.PublicCancelFutureOnCancel(future));
    }
}
