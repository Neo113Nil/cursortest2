package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
final class TimeoutFuture<V> extends com.google.common.util.concurrent.FluentFuture.TrustedFuture<V> {

    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.util.concurrent.ListenableFuture<V> delegateRef;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private java.util.concurrent.ScheduledFuture<?> timer;

    static <V> com.google.common.util.concurrent.ListenableFuture<V> create(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        com.google.common.util.concurrent.TimeoutFuture timeoutFuture = new com.google.common.util.concurrent.TimeoutFuture(listenableFuture);
        com.google.common.util.concurrent.TimeoutFuture.Fire fire = new com.google.common.util.concurrent.TimeoutFuture.Fire(timeoutFuture);
        timeoutFuture.timer = scheduledExecutorService.schedule(fire, j, timeUnit);
        listenableFuture.addListener(fire, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    private TimeoutFuture(com.google.common.util.concurrent.ListenableFuture<V> listenableFuture) {
        this.delegateRef = (com.google.common.util.concurrent.ListenableFuture) com.google.common.base.Preconditions.checkNotNull(listenableFuture);
    }

    static final class Fire<V> implements java.lang.Runnable {

        @com.google.errorprone.annotations.concurrent.LazyInit
        com.google.common.util.concurrent.TimeoutFuture<V> timeoutFutureRef;

        Fire(com.google.common.util.concurrent.TimeoutFuture<V> timeoutFuture) {
            this.timeoutFutureRef = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture;
            com.google.common.util.concurrent.TimeoutFuture<V> timeoutFuture = this.timeoutFutureRef;
            if (timeoutFuture == null || (listenableFuture = ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).delegateRef) == null) {
                return;
            }
            this.timeoutFutureRef = null;
            if (!listenableFuture.isDone()) {
                try {
                    java.util.concurrent.ScheduledFuture scheduledFuture = ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).timer;
                    ((com.google.common.util.concurrent.TimeoutFuture) timeoutFuture).timer = null;
                    java.lang.String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                str = sb.toString();
                            }
                        } catch (java.lang.Throwable th) {
                            timeoutFuture.setException(new com.google.common.util.concurrent.TimeoutFuture.TimeoutFutureException(str));
                            throw th;
                        }
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(listenableFuture);
                    timeoutFuture.setException(new com.google.common.util.concurrent.TimeoutFuture.TimeoutFutureException(sb2.toString()));
                    return;
                } finally {
                    listenableFuture.cancel(true);
                }
            }
            timeoutFuture.setFuture(listenableFuture);
        }
    }

    static final class TimeoutFutureException extends java.util.concurrent.TimeoutException {
        private TimeoutFutureException(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final java.lang.Throwable fillInStackTrace() {
            synchronized (this) {
                setStackTrace(new java.lang.StackTraceElement[0]);
            }
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final java.lang.String pendingToString() {
        com.google.common.util.concurrent.ListenableFuture<V> listenableFuture = this.delegateRef;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.timer;
        if (listenableFuture == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("inputFuture=[");
        sb.append(listenableFuture);
        sb.append("]");
        java.lang.String obj = sb.toString();
        if (scheduledFuture == null) {
            return obj;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void afterDone() {
        maybePropagateCancellationTo(this.delegateRef);
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.timer;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.delegateRef = null;
        this.timer = null;
    }
}
