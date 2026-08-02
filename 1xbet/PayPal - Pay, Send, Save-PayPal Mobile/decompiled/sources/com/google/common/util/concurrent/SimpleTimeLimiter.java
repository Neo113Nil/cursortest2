package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class SimpleTimeLimiter implements com.google.common.util.concurrent.TimeLimiter {
    private final java.util.concurrent.ExecutorService executor;

    private SimpleTimeLimiter(java.util.concurrent.ExecutorService executorService) {
        this.executor = (java.util.concurrent.ExecutorService) com.google.common.base.Preconditions.checkNotNull(executorService);
    }

    public static com.google.common.util.concurrent.SimpleTimeLimiter create(java.util.concurrent.ExecutorService executorService) {
        return new com.google.common.util.concurrent.SimpleTimeLimiter(executorService);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T newProxy(final T t, java.lang.Class<T> cls, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.base.Preconditions.checkNotNull(t);
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        com.google.common.base.Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        final java.util.Set<java.lang.reflect.Method> findInterruptibleMethods = findInterruptibleMethods(cls);
        return (T) newProxy(cls, new java.lang.reflect.InvocationHandler() { // from class: com.google.common.util.concurrent.SimpleTimeLimiter$$ExternalSyntheticLambda1
            @Override // java.lang.reflect.InvocationHandler
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                return com.google.common.util.concurrent.SimpleTimeLimiter.this.m10357xcdfbcc37(t, j, timeUnit, findInterruptibleMethods, obj, method, objArr);
            }
        });
    }

    /* renamed from: lambda$newProxy$0$com-google-common-util-concurrent-SimpleTimeLimiter, reason: not valid java name */
    final /* synthetic */ java.lang.Object m10357xcdfbcc37(final java.lang.Object obj, long j, java.util.concurrent.TimeUnit timeUnit, java.util.Set set, java.lang.Object obj2, final java.lang.reflect.Method method, final java.lang.Object[] objArr) throws java.lang.Throwable {
        return callWithTimeout(new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.SimpleTimeLimiter$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.common.util.concurrent.SimpleTimeLimiter.lambda$newProxy$1(method, obj, objArr);
            }
        }, j, timeUnit, set.contains(method));
    }

    static /* synthetic */ java.lang.Object lambda$newProxy$1(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object[] objArr) throws java.lang.Exception {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw throwCause(e, false);
        }
    }

    private static <T> T newProxy(java.lang.Class<T> cls, java.lang.reflect.InvocationHandler invocationHandler) {
        return cls.cast(java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{cls}, invocationHandler));
    }

    private <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit, boolean z) throws java.lang.Exception {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<T> submit = this.executor.submit(callable);
        try {
            if (z) {
                return submit.get(j, timeUnit);
            }
            return (T) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (java.lang.InterruptedException e) {
            submit.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw throwCause(e2, true);
        } catch (java.util.concurrent.TimeoutException e3) {
            submit.cancel(true);
            throw new com.google.common.util.concurrent.UncheckedTimeoutException(e3);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T callWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<T> submit = this.executor.submit(callable);
        try {
            return submit.get(j, timeUnit);
        } catch (java.lang.InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowExecutionExceptionOrError(e2.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final <T> T callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<T> submit = this.executor.submit(callable);
        try {
            return (T) com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (java.util.concurrent.ExecutionException e) {
            wrapAndThrowExecutionExceptionOrError(e.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final void runWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException, java.lang.InterruptedException {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<?> submit = this.executor.submit(runnable);
        try {
            submit.get(j, timeUnit);
        } catch (java.lang.InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e2.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public final void runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        com.google.common.base.Preconditions.checkNotNull(timeUnit);
        checkPositiveTimeout(j);
        java.util.concurrent.Future<?> submit = this.executor.submit(runnable);
        try {
            com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (java.util.concurrent.ExecutionException e) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e.getCause());
            throw new java.lang.AssertionError();
        } catch (java.util.concurrent.TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    private static java.lang.Exception throwCause(java.lang.Exception exc, boolean z) throws java.lang.Exception {
        java.lang.Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z) {
            cause.setStackTrace((java.lang.StackTraceElement[]) com.google.common.collect.ObjectArrays.concat(cause.getStackTrace(), exc.getStackTrace(), java.lang.StackTraceElement.class));
        }
        if (cause instanceof java.lang.Exception) {
            throw ((java.lang.Exception) cause);
        }
        if (cause instanceof java.lang.Error) {
            throw ((java.lang.Error) cause);
        }
        throw exc;
    }

    private static java.util.Set<java.lang.reflect.Method> findInterruptibleMethods(java.lang.Class<?> cls) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.reflect.Method method : cls.getMethods()) {
            if (declaresInterruptedEx(method)) {
                hashSet.add(method);
            }
        }
        return hashSet;
    }

    private static boolean declaresInterruptedEx(java.lang.reflect.Method method) {
        for (java.lang.Class<?> cls : method.getExceptionTypes()) {
            if (cls == java.lang.InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static void wrapAndThrowExecutionExceptionOrError(java.lang.Throwable th) throws java.util.concurrent.ExecutionException {
        if (th instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) th);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw new com.google.common.util.concurrent.UncheckedExecutionException(th);
        }
        throw new java.util.concurrent.ExecutionException(th);
    }

    private static void wrapAndThrowRuntimeExecutionExceptionOrError(java.lang.Throwable th) {
        if (th instanceof java.lang.Error) {
            throw new com.google.common.util.concurrent.ExecutionError((java.lang.Error) th);
        }
        throw new com.google.common.util.concurrent.UncheckedExecutionException(th);
    }

    private static void checkPositiveTimeout(long j) {
        com.google.common.base.Preconditions.checkArgument(j > 0, "timeout must be positive: %s", j);
    }
}
