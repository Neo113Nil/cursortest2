package kotlinx.coroutines.future;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/future/ContinuationHandler;", "T", "Ljava/util/function/BiFunction;", "", "", "Lkotlin/coroutines/Continuation;", "p0", "<init>", "(Lkotlin/coroutines/Continuation;)V", "cont", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ContinuationHandler<T> implements java.util.function.BiFunction<T, java.lang.Throwable, kotlin.Unit> {
    public volatile kotlin.coroutines.Continuation<? super T> cont;

    public ContinuationHandler(kotlin.coroutines.Continuation<? super T> continuation) {
        this.cont = continuation;
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ kotlin.Unit apply(java.lang.Object obj, java.lang.Throwable th) {
        java.lang.Throwable cause;
        java.lang.Throwable th2 = th;
        kotlin.coroutines.Continuation<? super T> continuation = this.cont;
        if (continuation != null) {
            if (th2 == null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(obj));
            } else {
                java.util.concurrent.CompletionException completionException = th2 instanceof java.util.concurrent.CompletionException ? (java.util.concurrent.CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2)));
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
