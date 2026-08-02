package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
final class LazyLogger {
    private final java.lang.Object lock = new java.lang.Object();
    private volatile java.util.logging.Logger logger;
    private final java.lang.String loggerName;

    LazyLogger(java.lang.Class<?> cls) {
        this.loggerName = cls.getName();
    }

    final java.util.logging.Logger get() {
        java.util.logging.Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        synchronized (this.lock) {
            java.util.logging.Logger logger2 = this.logger;
            if (logger2 != null) {
                return logger2;
            }
            java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(this.loggerName);
            this.logger = logger3;
            return logger3;
        }
    }
}
