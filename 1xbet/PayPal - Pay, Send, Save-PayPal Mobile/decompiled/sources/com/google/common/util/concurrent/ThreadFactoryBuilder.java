package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
public final class ThreadFactoryBuilder {
    private java.lang.String nameFormat = null;
    private java.lang.Boolean daemon = null;
    private java.lang.Integer priority = null;
    private java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
    private java.util.concurrent.ThreadFactory backingThreadFactory = null;

    public final com.google.common.util.concurrent.ThreadFactoryBuilder setNameFormat(java.lang.String str) {
        format(str, 0);
        this.nameFormat = str;
        return this;
    }

    public final com.google.common.util.concurrent.ThreadFactoryBuilder setDaemon(boolean z) {
        this.daemon = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.common.util.concurrent.ThreadFactoryBuilder setPriority(int i) {
        com.google.common.base.Preconditions.checkArgument(i > 0, "Thread priority (%s) must be >= %s", i, 1);
        com.google.common.base.Preconditions.checkArgument(i <= 10, "Thread priority (%s) must be <= %s", i, 10);
        this.priority = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.common.util.concurrent.ThreadFactoryBuilder setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = (java.lang.Thread.UncaughtExceptionHandler) com.google.common.base.Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }

    public final com.google.common.util.concurrent.ThreadFactoryBuilder setThreadFactory(java.util.concurrent.ThreadFactory threadFactory) {
        this.backingThreadFactory = (java.util.concurrent.ThreadFactory) com.google.common.base.Preconditions.checkNotNull(threadFactory);
        return this;
    }

    public final java.util.concurrent.ThreadFactory build() {
        return doBuild(this);
    }

    private static java.util.concurrent.ThreadFactory doBuild(com.google.common.util.concurrent.ThreadFactoryBuilder threadFactoryBuilder) {
        final java.lang.String str = threadFactoryBuilder.nameFormat;
        final java.lang.Boolean bool = threadFactoryBuilder.daemon;
        final java.lang.Integer num = threadFactoryBuilder.priority;
        final java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadFactoryBuilder.uncaughtExceptionHandler;
        java.util.concurrent.ThreadFactory threadFactory = threadFactoryBuilder.backingThreadFactory;
        if (threadFactory == null) {
            threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        }
        final java.util.concurrent.ThreadFactory threadFactory2 = threadFactory;
        final java.util.concurrent.atomic.AtomicLong atomicLong = str != null ? new java.util.concurrent.atomic.AtomicLong(0L) : null;
        return new java.util.concurrent.ThreadFactory() { // from class: com.google.common.util.concurrent.ThreadFactoryBuilder.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread newThread = threadFactory2.newThread(runnable);
                java.util.Objects.requireNonNull(newThread);
                java.lang.String str2 = str;
                if (str2 != null) {
                    newThread.setName(com.google.common.util.concurrent.ThreadFactoryBuilder.format(str2, java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) java.util.Objects.requireNonNull(atomicLong)).getAndIncrement())));
                }
                java.lang.Boolean bool2 = bool;
                if (bool2 != null) {
                    newThread.setDaemon(bool2.booleanValue());
                }
                java.lang.Integer num2 = num;
                if (num2 != null) {
                    newThread.setPriority(num2.intValue());
                }
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return newThread;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.ROOT, str, objArr);
    }
}
