package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class Callables {
    static /* synthetic */ java.lang.Object lambda$returning$0(java.lang.Object obj) throws java.lang.Exception {
        return obj;
    }

    private Callables() {
    }

    public static <T> java.util.concurrent.Callable<T> returning(final T t) {
        return new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.common.util.concurrent.Callables.lambda$returning$0(t);
            }
        };
    }

    public static <T> com.google.common.util.concurrent.AsyncCallable<T> asAsyncCallable(final java.util.concurrent.Callable<T> callable, final com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService) {
        com.google.common.base.Preconditions.checkNotNull(callable);
        com.google.common.base.Preconditions.checkNotNull(listeningExecutorService);
        return new com.google.common.util.concurrent.AsyncCallable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda1
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final com.google.common.util.concurrent.ListenableFuture call() {
                com.google.common.util.concurrent.ListenableFuture submit;
                submit = com.google.common.util.concurrent.ListeningExecutorService.this.submit(callable);
                return submit;
            }
        };
    }

    static <T> java.util.concurrent.Callable<T> threadRenaming(final java.util.concurrent.Callable<T> callable, final com.google.common.base.Supplier<java.lang.String> supplier) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        com.google.common.base.Preconditions.checkNotNull(callable);
        return new java.util.concurrent.Callable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.common.util.concurrent.Callables.lambda$threadRenaming$0(com.google.common.base.Supplier.this, callable);
            }
        };
    }

    static /* synthetic */ java.lang.Object lambda$threadRenaming$0(com.google.common.base.Supplier supplier, java.util.concurrent.Callable callable) throws java.lang.Exception {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.String name2 = currentThread.getName();
        boolean trySetName = trySetName((java.lang.String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (trySetName) {
                trySetName(name2, currentThread);
            }
        }
    }

    static java.lang.Runnable threadRenaming(final java.lang.Runnable runnable, final com.google.common.base.Supplier<java.lang.String> supplier) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        com.google.common.base.Preconditions.checkNotNull(runnable);
        return new java.lang.Runnable() { // from class: com.google.common.util.concurrent.Callables$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.util.concurrent.Callables.lambda$threadRenaming$1(com.google.common.base.Supplier.this, runnable);
            }
        };
    }

    static /* synthetic */ void lambda$threadRenaming$1(com.google.common.base.Supplier supplier, java.lang.Runnable runnable) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.String name2 = currentThread.getName();
        boolean trySetName = trySetName((java.lang.String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (trySetName) {
                trySetName(name2, currentThread);
            }
        }
    }

    private static boolean trySetName(java.lang.String str, java.lang.Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }
}
