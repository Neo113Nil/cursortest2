package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public final class UncaughtExceptionHandlers {

    interface RuntimeWrapper {
        void exit(int i);
    }

    private UncaughtExceptionHandlers() {
    }

    public static java.lang.Thread.UncaughtExceptionHandler systemExit() {
        final java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        java.util.Objects.requireNonNull(runtime);
        return new com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter(new com.google.common.util.concurrent.UncaughtExceptionHandlers.RuntimeWrapper() { // from class: com.google.common.util.concurrent.UncaughtExceptionHandlers$$ExternalSyntheticLambda0
            @Override // com.google.common.util.concurrent.UncaughtExceptionHandlers.RuntimeWrapper
            public final void exit(int i) {
                runtime.exit(i);
            }
        });
    }

    static final class Exiter implements java.lang.Thread.UncaughtExceptionHandler {
        private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.class);
        private final com.google.common.util.concurrent.UncaughtExceptionHandlers.RuntimeWrapper runtime;

        Exiter(com.google.common.util.concurrent.UncaughtExceptionHandlers.RuntimeWrapper runtimeWrapper) {
            this.runtime = runtimeWrapper;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
            try {
                logger.get().log(java.util.logging.Level.SEVERE, java.lang.String.format(java.util.Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
