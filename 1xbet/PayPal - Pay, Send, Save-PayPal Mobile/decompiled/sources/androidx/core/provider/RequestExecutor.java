package androidx.core.provider;

/* loaded from: classes3.dex */
class RequestExecutor {
    private RequestExecutor() {
    }

    static <T> void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, java.util.concurrent.Callable<T> callable, androidx.core.util.Consumer<T> consumer) {
        executor.execute(new androidx.core.provider.RequestExecutor.ReplyRunnable(androidx.core.provider.CalleeHandler.getHighSpeedVideoSizes(), callable, consumer));
    }

    static <T> T getHighSpeedVideoFpsRangesFor(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Callable<T> callable, int i) throws java.lang.InterruptedException {
        try {
            return executorService.submit(callable).get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.InterruptedException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        }
    }

    static java.util.concurrent.ThreadPoolExecutor getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new androidx.core.provider.RequestExecutor.DefaultThreadFactory(str, 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static java.util.concurrent.Executor getHighSpeedVideoSizes(android.os.Handler handler) {
        return new androidx.core.provider.RequestExecutor.HandlerExecutor(handler);
    }

    static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;

        HandlerExecutor(android.os.Handler handler) {
            this.getHighResolutionOutputSizeshNQ4ISI = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" is shutting down");
            throw new java.util.concurrent.RejectedExecutionException(sb.toString());
        }
    }

    static class ReplyRunnable<T> implements java.lang.Runnable {
        private androidx.core.util.Consumer<T> Camera2StreamConfigurationMap;
        private android.os.Handler getHighSpeedVideoFpsRanges;
        private java.util.concurrent.Callable<T> getHighSpeedVideoSizes;

        ReplyRunnable(android.os.Handler handler, java.util.concurrent.Callable<T> callable, androidx.core.util.Consumer<T> consumer) {
            this.getHighSpeedVideoSizes = callable;
            this.Camera2StreamConfigurationMap = consumer;
            this.getHighSpeedVideoFpsRanges = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T t;
            try {
                t = this.getHighSpeedVideoSizes.call();
            } catch (java.lang.Exception unused) {
                t = null;
            }
            final androidx.core.util.Consumer<T> consumer = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges.post(new java.lang.Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(t);
                }
            });
        }
    }

    static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private int getHighResolutionOutputSizeshNQ4ISI = 10;
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        DefaultThreadFactory(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new androidx.core.provider.RequestExecutor.DefaultThreadFactory.ProcessPriorityThread(runnable, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        static class ProcessPriorityThread extends java.lang.Thread {
            private final int getHighSpeedVideoFpsRangesFor;

            ProcessPriorityThread(java.lang.Runnable runnable, java.lang.String str, int i) {
                super(runnable, str);
                this.getHighSpeedVideoFpsRangesFor = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                android.os.Process.setThreadPriority(this.getHighSpeedVideoFpsRangesFor);
                super.run();
            }
        }
    }
}
