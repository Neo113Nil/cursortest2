package androidx.work;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/ListenableFuture;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "V", "Ljava/util/concurrent/Executor;", "", "debugTag", "Lkotlin/Function0;", "executeAsync", "(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/common/util/concurrent/ListenableFuture;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListenableFutureKt {
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture launchFuture$default(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return launchFuture(coroutineContext, coroutineStart, function2);
    }

    public static final <T> com.google.common.util.concurrent.ListenableFuture<T> launchFuture(final kotlin.coroutines.CoroutineContext coroutineContext, final kotlinx.coroutines.CoroutineStart coroutineStart, final kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineStart, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        com.google.common.util.concurrent.ListenableFuture<T> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.work.ListenableFutureKt.m9465$r8$lambda$GaXsP0J9ZiqTNKOjjWkBCoRah8(kotlin.coroutines.CoroutineContext.this, coroutineStart, function2, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return future;
    }

    public static final <V> com.google.common.util.concurrent.ListenableFuture<V> executeAsync(final java.util.concurrent.Executor executor, final java.lang.String str, final kotlin.jvm.functions.Function0<? extends V> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        com.google.common.util.concurrent.ListenableFuture<V> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.work.ListenableFutureKt.$r8$lambda$X5HWWttRZ_Ir0xD9aqd6GXUt6fY(executor, str, function0, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return future;
    }

    public static /* synthetic */ void $r8$lambda$2J7WTnmfyHeSyx3GGU57K1DCNjw(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, kotlin.jvm.functions.Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(function0.invoke());
        } catch (java.lang.Throwable th) {
            completer.setException(th);
        }
    }

    /* renamed from: $r8$lambda$GaXsP0J9ZiqT-NKOjjWkBCoRah8, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9465$r8$lambda$GaXsP0J9ZiqTNKOjjWkBCoRah8(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
        final kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.ListenableFutureKt.$r8$lambda$vr_XgQ5qIrw8Yb6kuj8zI4IjUEw(kotlinx.coroutines.Job.this);
            }
        }, androidx.work.DirectExecutor.INSTANCE);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext), null, coroutineStart, new androidx.work.ListenableFutureKt$launchFuture$1$2(function2, completer, null), 1, null);
        return launch$default;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$X5HWWttRZ_Ir0xD9aqd6GXUt6fY(java.util.concurrent.Executor executor, java.lang.String str, final kotlin.jvm.functions.Function0 function0, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        completer.addCancellationListener(new java.lang.Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, androidx.work.DirectExecutor.INSTANCE);
        executor.execute(new java.lang.Runnable() { // from class: androidx.work.ListenableFutureKt$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.work.ListenableFutureKt.$r8$lambda$2J7WTnmfyHeSyx3GGU57K1DCNjw(atomicBoolean, completer, function0);
            }
        });
        return str;
    }

    public static /* synthetic */ void $r8$lambda$vr_XgQ5qIrw8Yb6kuj8zI4IjUEw(kotlinx.coroutines.Job job) {
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
