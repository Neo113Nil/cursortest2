package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public abstract class AbstractFuture<V> extends com.google.common.util.concurrent.AbstractFutureState<V> {

    interface Trusted<V> extends com.google.common.util.concurrent.ListenableFuture<V> {
    }

    protected void afterDone() {
    }

    protected void interruptTask() {
    }

    public static abstract class TrustedFuture<V> extends com.google.common.util.concurrent.AbstractFuture<V> implements com.google.common.util.concurrent.AbstractFuture.Trusted<V> {
        TrustedFuture() {
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    static final class Listener {
        static final com.google.common.util.concurrent.AbstractFuture.Listener TOMBSTONE = new com.google.common.util.concurrent.AbstractFuture.Listener();
        final java.util.concurrent.Executor executor;
        com.google.common.util.concurrent.AbstractFuture.Listener next;
        final java.lang.Runnable task;

        Listener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }

        Listener() {
            this.task = null;
            this.executor = null;
        }
    }

    static final class Failure {
        static final com.google.common.util.concurrent.AbstractFuture.Failure FALLBACK_INSTANCE = new com.google.common.util.concurrent.AbstractFuture.Failure(new java.lang.Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public java.lang.Throwable fillInStackTrace() {
                return this;
            }
        });
        final java.lang.Throwable exception;

        Failure(java.lang.Throwable th) {
            this.exception = (java.lang.Throwable) com.google.common.base.Preconditions.checkNotNull(th);
        }
    }

    static final class Cancellation {
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_CANCELLED;
        static final com.google.common.util.concurrent.AbstractFuture.Cancellation CAUSELESS_INTERRUPTED;
        final java.lang.Throwable cause;
        final boolean wasInterrupted;

        static {
            if (com.google.common.util.concurrent.AbstractFutureState.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, null);
                CAUSELESS_INTERRUPTED = new com.google.common.util.concurrent.AbstractFuture.Cancellation(true, null);
            }
        }

        Cancellation(boolean z, java.lang.Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    static final class DelegatingToFuture<V> implements java.lang.Runnable {
        final com.google.common.util.concurrent.ListenableFuture<? extends V> future;
        final com.google.common.util.concurrent.AbstractFuture<V> owner;

        DelegatingToFuture(com.google.common.util.concurrent.AbstractFuture<V> abstractFuture, com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
            this.owner = abstractFuture;
            this.future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.owner.value() == this) {
                if (com.google.common.util.concurrent.AbstractFutureState.casValue(this.owner, this, com.google.common.util.concurrent.AbstractFuture.getFutureValue(this.future))) {
                    com.google.common.util.concurrent.AbstractFuture.complete(this.owner, false);
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        return (V) com.google.common.util.concurrent.Platform.get(this, j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public V get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return (V) com.google.common.util.concurrent.Platform.get(this);
    }

    final V getFromAlreadyDoneTrustedFuture() throws java.util.concurrent.ExecutionException {
        java.lang.Object value = value();
        if ((value == null) | (value instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture)) {
            throw new java.lang.IllegalStateException("Cannot get() on a pending future.");
        }
        return (V) getDoneValue(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <V> V getDoneValue(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((com.google.common.util.concurrent.AbstractFuture.Cancellation) obj).cause);
        }
        if (obj instanceof com.google.common.util.concurrent.AbstractFuture.Failure) {
            throw new java.util.concurrent.ExecutionException(((com.google.common.util.concurrent.AbstractFuture.Failure) obj).exception);
        }
        return obj == NULL ? (V) com.google.common.util.concurrent.NullnessCasts.uncheckedNull() : obj;
    }

    static boolean notInstanceOfDelegatingToFuture(java.lang.Object obj) {
        return !(obj instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object value = value();
        return notInstanceOfDelegatingToFuture(value) & (value != null);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return value() instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        com.google.common.util.concurrent.AbstractFuture.Cancellation cancellation;
        java.lang.Object requireNonNull;
        java.lang.Object value = value();
        if (!(value == null) && !(value instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            requireNonNull = new com.google.common.util.concurrent.AbstractFuture.Cancellation(z, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                cancellation = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_INTERRUPTED;
            } else {
                cancellation = com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
            }
            requireNonNull = java.util.Objects.requireNonNull(cancellation);
        }
        com.google.common.util.concurrent.AbstractFuture<V> abstractFuture = this;
        boolean z2 = false;
        while (true) {
            if (casValue(abstractFuture, value, requireNonNull)) {
                complete(abstractFuture, z);
                if (!(value instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture)) {
                    break;
                }
                com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture = ((com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture) value).future;
                if (listenableFuture instanceof com.google.common.util.concurrent.AbstractFuture.Trusted) {
                    abstractFuture = (com.google.common.util.concurrent.AbstractFuture) listenableFuture;
                    value = abstractFuture.value();
                    if (!(value == null) && !(value instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture)) {
                        break;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    break;
                }
            } else {
                value = abstractFuture.value();
                if (notInstanceOfDelegatingToFuture(value)) {
                    return z2;
                }
            }
        }
        return true;
    }

    protected final boolean wasInterrupted() {
        java.lang.Object value = value();
        return (value instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) && ((com.google.common.util.concurrent.AbstractFuture.Cancellation) value).wasInterrupted;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.AbstractFuture.Listener listeners;
        com.google.common.base.Preconditions.checkNotNull(runnable, "Runnable was null.");
        com.google.common.base.Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listeners = listeners()) != com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener = new com.google.common.util.concurrent.AbstractFuture.Listener(runnable, executor);
            do {
                listener.next = listeners;
                if (casListeners(listeners, listener)) {
                    return;
                } else {
                    listeners = listeners();
                }
            } while (listeners != com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE);
        }
        executeListener(runnable, executor);
    }

    public boolean set(V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!casValue(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(java.lang.Throwable th) {
        if (!casValue(this, null, new com.google.common.util.concurrent.AbstractFuture.Failure((java.lang.Throwable) com.google.common.base.Preconditions.checkNotNull(th)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    protected boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        com.google.common.util.concurrent.AbstractFuture.Failure failure;
        com.google.common.base.Preconditions.checkNotNull(listenableFuture);
        java.lang.Object value = value();
        if (value == null) {
            if (listenableFuture.isDone()) {
                if (!casValue(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture delegatingToFuture = new com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture(this, listenableFuture);
            if (casValue(this, null, delegatingToFuture)) {
                try {
                    listenableFuture.addListener(delegatingToFuture, com.google.common.util.concurrent.DirectExecutor.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        failure = new com.google.common.util.concurrent.AbstractFuture.Failure(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        failure = com.google.common.util.concurrent.AbstractFuture.Failure.FALLBACK_INSTANCE;
                    }
                    casValue(this, delegatingToFuture, failure);
                }
                return true;
            }
            value = value();
        }
        if (value instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
            listenableFuture.cancel(((com.google.common.util.concurrent.AbstractFuture.Cancellation) value).wasInterrupted);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object getFutureValue(com.google.common.util.concurrent.ListenableFuture<?> listenableFuture) {
        java.lang.Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof com.google.common.util.concurrent.AbstractFuture.Trusted) {
            java.lang.Object value = ((com.google.common.util.concurrent.AbstractFuture) listenableFuture).value();
            if (value instanceof com.google.common.util.concurrent.AbstractFuture.Cancellation) {
                com.google.common.util.concurrent.AbstractFuture.Cancellation cancellation = (com.google.common.util.concurrent.AbstractFuture.Cancellation) value;
                if (cancellation.wasInterrupted) {
                    value = cancellation.cause != null ? new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, cancellation.cause) : com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED;
                }
            }
            return java.util.Objects.requireNonNull(value);
        }
        if ((listenableFuture instanceof com.google.common.util.concurrent.internal.InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = com.google.common.util.concurrent.internal.InternalFutures.tryInternalFastPathGetFailure((com.google.common.util.concurrent.internal.InternalFutureFailureAccess) listenableFuture)) != null) {
            return new com.google.common.util.concurrent.AbstractFuture.Failure(tryInternalFastPathGetFailure);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return java.util.Objects.requireNonNull(com.google.common.util.concurrent.AbstractFuture.Cancellation.CAUSELESS_CANCELLED);
        }
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(listenableFuture);
            if (!isCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(listenableFuture);
            return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, new java.lang.IllegalArgumentException(sb.toString()));
        } catch (java.lang.Error e) {
            e = e;
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e);
        } catch (java.util.concurrent.CancellationException e2) {
            if (!isCancelled) {
                return new com.google.common.util.concurrent.AbstractFuture.Failure(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(listenableFuture)), e2));
            }
            return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, e2);
        } catch (java.util.concurrent.ExecutionException e3) {
            if (isCancelled) {
                return new com.google.common.util.concurrent.AbstractFuture.Cancellation(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(listenableFuture)), e3));
            }
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e3.getCause());
        } catch (java.lang.Exception e4) {
            e = e4;
            return new com.google.common.util.concurrent.AbstractFuture.Failure(e);
        }
    }

    private static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    com.google.common.util.concurrent.Platform.interruptCurrentThread();
                }
                throw th;
            }
        }
        if (z) {
            com.google.common.util.concurrent.Platform.interruptCurrentThread();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void complete(com.google.common.util.concurrent.AbstractFuture<?> abstractFuture, boolean z) {
        com.google.common.util.concurrent.AbstractFuture.Listener listener = null;
        while (true) {
            abstractFuture.releaseWaiters();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            com.google.common.util.concurrent.AbstractFuture.Listener clearListeners = abstractFuture.clearListeners(listener);
            while (clearListeners != null) {
                listener = clearListeners.next;
                java.lang.Runnable runnable = (java.lang.Runnable) java.util.Objects.requireNonNull(clearListeners.task);
                if (runnable instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture) {
                    com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture delegatingToFuture = (com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture) runnable;
                    abstractFuture = delegatingToFuture.owner;
                    if (abstractFuture.value() == delegatingToFuture && casValue(abstractFuture, delegatingToFuture, getFutureValue(delegatingToFuture.future))) {
                        break;
                    }
                } else {
                    executeListener(runnable, (java.util.concurrent.Executor) java.util.Objects.requireNonNull(clearListeners.executor));
                }
                clearListeners = listener;
            }
            return;
        }
    }

    @Override // com.google.common.util.concurrent.internal.InternalFutureFailureAccess
    public final java.lang.Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof com.google.common.util.concurrent.AbstractFuture.Trusted)) {
            return null;
        }
        java.lang.Object value = value();
        if (value instanceof com.google.common.util.concurrent.AbstractFuture.Failure) {
            return ((com.google.common.util.concurrent.AbstractFuture.Failure) value).exception;
        }
        return null;
    }

    final void maybePropagateCancellationTo(java.util.concurrent.Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private com.google.common.util.concurrent.AbstractFuture.Listener clearListeners(com.google.common.util.concurrent.AbstractFuture.Listener listener) {
        com.google.common.util.concurrent.AbstractFuture.Listener listener2 = listener;
        com.google.common.util.concurrent.AbstractFuture.Listener gasListeners = gasListeners(com.google.common.util.concurrent.AbstractFuture.Listener.TOMBSTONE);
        while (gasListeners != null) {
            com.google.common.util.concurrent.AbstractFuture.Listener listener3 = gasListeners.next;
            gasListeners.next = listener2;
            listener2 = gasListeners;
            gasListeners = listener3;
        }
        return listener2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String pendingToString() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("remaining delay=[");
        sb.append(((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
        sb.append(" ms]");
        return sb.toString();
    }

    private void addPendingString(java.lang.StringBuilder sb) {
        java.lang.String obj;
        int length = sb.length();
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        java.lang.Object value = value();
        if (value instanceof com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture) {
            sb.append(", setFuture=[");
            appendUserObject(sb, ((com.google.common.util.concurrent.AbstractFuture.DelegatingToFuture) value).future);
            sb.append("]");
        } else {
            try {
                obj = com.google.common.base.Strings.emptyToNull(pendingToString());
            } catch (java.lang.Throwable th) {
                com.google.common.util.concurrent.Platform.rethrowIfErrorOtherThanStackOverflow(th);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Exception thrown from implementation: ");
                sb2.append(th.getClass());
                obj = sb2.toString();
            }
            if (obj != null) {
                sb.append(", info=[");
                sb.append(obj);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            addDoneString(sb);
        }
    }

    private void addDoneString(java.lang.StringBuilder sb) {
        try {
            java.lang.Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            appendResultObject(sb, uninterruptibly);
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        } catch (java.util.concurrent.ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (java.lang.Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void appendResultObject(java.lang.StringBuilder sb, java.lang.Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(java.lang.StringBuilder sb, java.lang.Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (java.lang.Throwable th) {
            com.google.common.util.concurrent.Platform.rethrowIfErrorOtherThanStackOverflow(th);
            sb.append("Exception thrown from implementation: ");
            sb.append(th.getClass());
        }
    }

    private static void executeListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            java.util.logging.Logger logger = log.get();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (java.lang.Throwable) e);
        }
    }

    private static java.util.concurrent.CancellationException cancellationExceptionWithCause(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
