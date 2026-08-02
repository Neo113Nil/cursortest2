package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerKt {
    public static /* synthetic */ void $r8$lambda$06LNzu7McnKR6G06fSbfQ2BCegc(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, kotlin.jvm.functions.Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (java.lang.Throwable th) {
            completer.setException(th);
        }
    }

    /* renamed from: $r8$lambda$stbDiVrUcYsUSVFbJy_5-j0wuK4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9469$r8$lambda$stbDiVrUcYsUSVFbJy_5j0wuK4(java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function0 function0, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, androidx.work.DirectExecutor.INSTANCE);
        executor.execute(new java.lang.Runnable() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.WorkerKt.$r8$lambda$06LNzu7McnKR6G06fSbfQ2BCegc(atomicBoolean, completer, function0);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.google.common.util.concurrent.ListenableFuture access$future(final java.util.concurrent.Executor executor, final kotlin.jvm.functions.Function0 function0) {
        com.google.common.util.concurrent.ListenableFuture future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.work.WorkerKt$$ExternalSyntheticLambda2
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.work.WorkerKt.m9469$r8$lambda$stbDiVrUcYsUSVFbJy_5j0wuK4(executor, function0, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return future;
    }
}
