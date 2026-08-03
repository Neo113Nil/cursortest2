package kotlinx.coroutines.tasks;

/* compiled from: Tasks.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u001e\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086@¢\u0006\u0002\u0010\t\u001a&\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0087@¢\u0006\u0002\u0010\n\u001a(\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"asTask", "Lcom/google/android/gms/tasks/Task;", "T", "Lkotlinx/coroutines/Deferred;", "asDeferred", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TasksKt {
    public static final <T> com.google.android.gms.tasks.Task<T> asTask(final kotlinx.coroutines.Deferred<? extends T> deferred) {
        final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource = new com.google.android.gms.tasks.CancellationTokenSource();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource(cancellationTokenSource.getToken());
        deferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit asTask$lambda$0;
                asTask$lambda$0 = kotlinx.coroutines.tasks.TasksKt.asTask$lambda$0(com.google.android.gms.tasks.CancellationTokenSource.this, deferred, taskCompletionSource, (java.lang.Throwable) obj);
                return asTask$lambda$0;
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit asTask$lambda$0(com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlinx.coroutines.Deferred deferred, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            cancellationTokenSource.cancel();
            return kotlin.Unit.INSTANCE;
        }
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
        return kotlin.Unit.INSTANCE;
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task) {
        return asDeferredImpl(task, null);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> asDeferred(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    private static final <T> kotlinx.coroutines.Deferred<T> asDeferredImpl(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource) {
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
                    kotlinx.coroutines.tasks.TasksKt.asDeferredImpl$lambda$1(kotlinx.coroutines.CompletableDeferred.this, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.tasks.TasksKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit asDeferredImpl$lambda$2;
                    asDeferredImpl$lambda$2 = kotlinx.coroutines.tasks.TasksKt.asDeferredImpl$lambda$2(com.google.android.gms.tasks.CancellationTokenSource.this, (java.lang.Throwable) obj);
                    return asDeferredImpl$lambda$2;
                }
            });
        }
        return new kotlinx.coroutines.Deferred<T>() { // from class: kotlinx.coroutines.tasks.TasksKt$asDeferredImpl$3
            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child) {
                return CompletableDeferred$default.attachChild(child);
            }

            @Override // kotlinx.coroutines.Deferred
            public java.lang.Object await(kotlin.coroutines.Continuation<? super T> continuation) {
                return CompletableDeferred$default.await(continuation);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ void cancel() {
                CompletableDeferred$default.cancel();
            }

            @Override // kotlinx.coroutines.Job
            public void cancel(java.util.concurrent.CancellationException cause) {
                CompletableDeferred$default.cancel(cause);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public /* synthetic */ boolean cancel(java.lang.Throwable cause) {
                return CompletableDeferred$default.cancel(cause);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
                return (R) CompletableDeferred$default.fold(initial, operation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
                return (E) CompletableDeferred$default.get(key);
            }

            @Override // kotlinx.coroutines.Job
            public java.util.concurrent.CancellationException getCancellationException() {
                return CompletableDeferred$default.getCancellationException();
            }

            @Override // kotlinx.coroutines.Job
            public kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
                return CompletableDeferred$default.getChildren();
            }

            @Override // kotlinx.coroutines.Deferred
            public T getCompleted() {
                return CompletableDeferred$default.getCompleted();
            }

            @Override // kotlinx.coroutines.Deferred
            public java.lang.Throwable getCompletionExceptionOrNull() {
                return CompletableDeferred$default.getCompletionExceptionOrNull();
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
                return CompletableDeferred$default.getKey();
            }

            @Override // kotlinx.coroutines.Deferred
            public kotlinx.coroutines.selects.SelectClause1<T> getOnAwait() {
                return CompletableDeferred$default.getOnAwait();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
                return CompletableDeferred$default.getOnJoin();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.Job getParent() {
                return CompletableDeferred$default.getParent();
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default.invokeOnCompletion(handler);
            }

            @Override // kotlinx.coroutines.Job
            public kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
                return CompletableDeferred$default.invokeOnCompletion(onCancelling, invokeImmediately, handler);
            }

            @Override // kotlinx.coroutines.Job
            public boolean isActive() {
                return CompletableDeferred$default.isActive();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCancelled() {
                return CompletableDeferred$default.isCancelled();
            }

            @Override // kotlinx.coroutines.Job
            public boolean isCompleted() {
                return CompletableDeferred$default.isCompleted();
            }

            @Override // kotlinx.coroutines.Job
            public java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return CompletableDeferred$default.join(continuation);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
                return CompletableDeferred$default.minusKey(key);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
                return CompletableDeferred$default.plus(context);
            }

            @Override // kotlinx.coroutines.Job
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            public kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other) {
                return CompletableDeferred$default.plus(other);
            }

            @Override // kotlinx.coroutines.Job
            public boolean start() {
                return CompletableDeferred$default.start();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$1(kotlinx.coroutines.CompletableDeferred completableDeferred, com.google.android.gms.tasks.Task task) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit asDeferredImpl$lambda$2(com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, java.lang.Throwable th) {
        cancellationTokenSource.cancel();
        return kotlin.Unit.INSTANCE;
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, kotlin.coroutines.Continuation<? super T> continuation) {
        return awaitImpl(task, null, continuation);
    }

    public static final <T> java.lang.Object await(com.google.android.gms.tasks.Task<T> task, com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) {
        return awaitImpl(task, cancellationTokenSource, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> java.lang.Object awaitImpl(com.google.android.gms.tasks.Task<T> task, final com.google.android.gms.tasks.CancellationTokenSource cancellationTokenSource, kotlin.coroutines.Continuation<? super T> continuation) {
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new java.util.concurrent.CancellationException("Task " + task + " was cancelled normally.");
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
                    continuation2.resumeWith(kotlin.Result.m10798constructorimpl(task2.getResult()));
                    return;
                }
                kotlin.coroutines.Continuation continuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation3.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(exception2)));
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
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
}
