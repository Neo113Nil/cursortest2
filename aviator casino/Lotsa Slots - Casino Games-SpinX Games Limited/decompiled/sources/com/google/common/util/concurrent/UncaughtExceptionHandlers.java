package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class UncaughtExceptionHandlers {
    private UncaughtExceptionHandlers() {
    }

    public static java.lang.Thread.UncaughtExceptionHandler systemExit() {
        return new com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter(java.lang.Runtime.getRuntime());
    }

    static final class Exiter implements java.lang.Thread.UncaughtExceptionHandler {
        private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.class);
        private final java.lang.Runtime runtime;

        Exiter(java.lang.Runtime runtime) {
            this.runtime = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
            try {
                logger.get().log(java.util.logging.Level.SEVERE, java.lang.String.format(java.util.Locale.ROOT, "Caught an exception in %s.  Shutting down.", t), e);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
