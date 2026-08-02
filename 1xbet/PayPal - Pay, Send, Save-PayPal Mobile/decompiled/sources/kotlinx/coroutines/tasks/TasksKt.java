package kotlinx.coroutines.tasks;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a \u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\u000e\u001a*\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"T", "Lkotlinx/coroutines/Deferred;", "Lcom/google/android/gms/tasks/Task;", "asTask", "(Lkotlinx/coroutines/Deferred;)Lcom/google/android/gms/tasks/Task;", "asDeferred", "(Lcom/google/android/gms/tasks/Task;)Lkotlinx/coroutines/Deferred;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;)Lkotlinx/coroutines/Deferred;", "p0", "Camera2StreamConfigurationMap", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TasksKt {
    public static final <T> com.google.android.gms.tasks.Task<T> asTask(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.tasks.TasksKt.$r8$lambda$5f1mT_oG6KfnaA6v83cFog9ygp8(com.google.android.gms.tasks.CancellationTokenSource.this, deferred, taskCompletionSource, (java.lang.Throwable) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task) {
        return Camera2StreamConfigurationMap(task, null);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        return Camera2StreamConfigurationMap(task, cancellationTokenSource);
    }

    private static final <T> kotlinx.coroutines.Deferred<T> Camera2StreamConfigurationMap(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) CompletableDeferred$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                } else {
                    CompletableDeferred$default.complete(task.getResult());
                }
            } else {
                CompletableDeferred$default.completeExceptionally(exception);
            }
        } else {
            task.addOnCompleteListener(kotlinx.coroutines.tasks.DirectExecutor.INSTANCE, new com.google.android.gms.tasks.OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task2) {
                    kotlinx.coroutines.tasks.TasksKt.$r8$lambda$KKtandt8fYuSCG03KTNU_gUwQgM(kotlinx.coroutines.CompletableDeferred.this, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.coroutines.tasks.TasksKt.$r8$lambda$WS4CsADCb8YgmqyOAgsLZD2JfF0(com.google.android.gms.tasks.CancellationTokenSource.this, (java.lang.Throwable) obj);
                }
            });
        }
        return new kotlinx.coroutines.Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$3
            @Override // kotlinx.coroutines.Job
            public final boolean start() {
                return CompletableDeferred$default.start();
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            public final kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other) {
                return CompletableDeferred$default.plus(other);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
                return CompletableDeferred$default.plus(context);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
                return CompletableDeferred$default.minusKey(key);
            }

            @Override // kotlinx.coroutines.Job
            public final java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return CompletableDeferred$default.join(continuation);
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isCompleted() {
                return CompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isCancelled() {
                return CompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public final boolean isActive() {
                return CompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.Job getParent() {
                return CompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
                return CompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Deferred
            public final kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
                return CompletableDeferred$default.getOnAwait();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
                return CompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public final java.lang.Throwable getCompletionExceptionOrNull() {
                return CompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlinx.coroutines.Deferred
            public final T getCompleted() {
                return CompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
                return CompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Job
            public final java.util.concurrent.CancellationException getCancellationException() {
                return CompletableDeferred$default.getCancellationException();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
                return (E) CompletableDeferred$default.get(key);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
                return (R) CompletableDeferred$default.fold(initial, operation);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public final /* synthetic */ boolean cancel(java.lang.Throwable cause) {
                return CompletableDeferred$default.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            public final void cancel(java.util.concurrent.CancellationException cause) {
                CompletableDeferred$default.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public final /* synthetic */ void cancel() {
                CompletableDeferred$default.cancel();
            }

            @Override // kotlinx.coroutines.Deferred
            public final java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
                return CompletableDeferred$default.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            public final kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
                return CompletableDeferred$default.attachChild(child);
            }
        };
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, kotlin.coroutines.Continuation<? super T> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(task, null, continuation);
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(task, cancellationTokenSource, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) {
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Task ");
                    sb.append(task);
                    sb.append(" was cancelled normally.");
                    throw new java.util.concurrent.CancellationException(sb.toString());
                }
                return task.getResult();
            }
            throw exception;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        task.addOnCompleteListener(kotlinx.coroutines.tasks.DirectExecutor.INSTANCE, new com.google.android.gms.tasks.OnCompleteListener() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task<T> task2) {
                java.lang.Exception exception2 = task2.getException();
                if (exception2 == null) {
                    if (task2.isCanceled()) {
                        kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl2, null, 1, null);
                        return;
                    }
                    kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(task2.getResult()));
                    return;
                }
                kotlin.coroutines.Continuation continuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation3.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exception2)));
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighResolutionOutputSizeshNQ4ISI(th);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                    com.google.android.gms.tasks.CancellationTokenSource.this.cancel();
                }
            });
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5f1mT_oG6KfnaA6v83cFog9ygp8(com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlinx.coroutines.Deferred deferred, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            cancellationTokenSource.cancel();
        } else {
            java.lang.Throwable completionExceptionOrNull = deferred.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                taskCompletionSource.setResult(deferred.getCompleted());
            } else {
                com.google.android.gms.tasks.RuntimeExecutionException runtimeExecutionException = completionExceptionOrNull instanceof java.lang.Exception ? (java.lang.Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new com.google.android.gms.tasks.RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$KKtandt8fYuSCG03KTNU_gUwQgM(kotlinx.coroutines.CompletableDeferred completableDeferred, com.google.android.gms.tasks.Task task) {
        java.lang.Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableDeferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return;
            } else {
                completableDeferred.complete(task.getResult());
                return;
            }
        }
        completableDeferred.completeExceptionally(exception);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WS4CsADCb8YgmqyOAgsLZD2JfF0(com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, java.lang.Throwable th) {
        cancellationTokenSource.cancel();
        return kotlin.Unit.INSTANCE;
    }
}
