package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class ThreadFactoryBuilder {

    @javax.annotation.CheckForNull
    private java.lang.String nameFormat = null;

    @javax.annotation.CheckForNull
    private java.lang.Boolean daemon = null;

    @javax.annotation.CheckForNull
    private java.lang.Integer priority = null;

    @javax.annotation.CheckForNull
    private java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;

    @javax.annotation.CheckForNull
    private java.util.concurrent.ThreadFactory backingThreadFactory = null;

    public com.google.common.util.concurrent.ThreadFactoryBuilder setNameFormat(java.lang.String nameFormat) {
        format(nameFormat, 0);
        this.nameFormat = nameFormat;
        return this;
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setDaemon(boolean daemon) {
        this.daemon = java.lang.Boolean.valueOf(daemon);
        return this;
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setPriority(int priority) {
        com.google.common.base.Preconditions.checkArgument(priority >= 1, "Thread priority (%s) must be >= %s", priority, 1);
        com.google.common.base.Preconditions.checkArgument(priority <= 10, "Thread priority (%s) must be <= %s", priority, 10);
        this.priority = java.lang.Integer.valueOf(priority);
        return this;
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = (java.lang.Thread.UncaughtExceptionHandler) com.google.common.base.Preconditions.checkNotNull(uncaughtExceptionHandler);
        return this;
    }

    public com.google.common.util.concurrent.ThreadFactoryBuilder setThreadFactory(java.util.concurrent.ThreadFactory backingThreadFactory) {
        this.backingThreadFactory = (java.util.concurrent.ThreadFactory) com.google.common.base.Preconditions.checkNotNull(backingThreadFactory);
        return this;
    }

    public java.util.concurrent.ThreadFactory build() {
        return doBuild(this);
    }

    private static java.util.concurrent.ThreadFactory doBuild(com.google.common.util.concurrent.ThreadFactoryBuilder builder) {
        final java.lang.String str = builder.nameFormat;
        final java.lang.Boolean bool = builder.daemon;
        final java.lang.Integer num = builder.priority;
        final java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.uncaughtExceptionHandler;
        java.util.concurrent.ThreadFactory threadFactory = builder.backingThreadFactory;
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
    public static java.lang.String format(java.lang.String format, java.lang.Object... args) {
        return java.lang.String.format(java.util.Locale.ROOT, format, args);
    }
}
