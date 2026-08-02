package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class LottieTask<T> {
    public static java.util.concurrent.Executor EXECUTOR;
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<com.airbnb.lottie.LottieListener<T>> getHighSpeedVideoFpsRanges;
    private final java.util.Set<com.airbnb.lottie.LottieListener<java.lang.Throwable>> getHighSpeedVideoFpsRangesFor;
    private volatile com.airbnb.lottie.LottieResult<T> getHighSpeedVideoSizes;

    static {
        if ("true".equals(java.lang.System.getProperty("lottie.testing.directExecutor"))) {
            EXECUTOR = new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0();
        } else {
            EXECUTOR = java.util.concurrent.Executors.newCachedThreadPool(new com.airbnb.lottie.utils.LottieThreadFactory());
        }
    }

    public LottieTask(java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable) {
        this(callable, false);
    }

    public LottieTask(T t) {
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet(1);
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashSet(1);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = handler;
        this.getHighSpeedVideoSizes = null;
        com.airbnb.lottie.LottieResult<T> lottieResult = new com.airbnb.lottie.LottieResult<>(t);
        if (this.getHighSpeedVideoSizes != null) {
            throw new java.lang.IllegalStateException("A task may only be set once.");
        }
        this.getHighSpeedVideoSizes = lottieResult;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            getHighSpeedVideoSizes();
        } else {
            handler.post(new com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0(this));
        }
    }

    LottieTask(java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable, boolean z) {
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet(1);
        this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashSet(1);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = handler;
        this.getHighSpeedVideoSizes = null;
        if (z) {
            try {
                com.airbnb.lottie.LottieResult<T> call = callable.call();
                if (this.getHighSpeedVideoSizes != null) {
                    throw new java.lang.IllegalStateException("A task may only be set once.");
                }
                this.getHighSpeedVideoSizes = call;
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    getHighSpeedVideoSizes();
                    return;
                } else {
                    handler.post(new com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0(this));
                    return;
                }
            } catch (java.lang.Throwable th) {
                com.airbnb.lottie.LottieResult<T> lottieResult = new com.airbnb.lottie.LottieResult<>(th);
                if (this.getHighSpeedVideoSizes != null) {
                    throw new java.lang.IllegalStateException("A task may only be set once.");
                }
                this.getHighSpeedVideoSizes = lottieResult;
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    getHighSpeedVideoSizes();
                    return;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.post(new com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0(this));
                    return;
                }
            }
        }
        EXECUTOR.execute(new com.airbnb.lottie.LottieTask.LottieFutureTask(this, callable));
    }

    public com.airbnb.lottie.LottieTask<T> addListener(com.airbnb.lottie.LottieListener<T> lottieListener) {
        synchronized (this) {
            com.airbnb.lottie.LottieResult<T> lottieResult = this.getHighSpeedVideoSizes;
            if (lottieResult != null && lottieResult.getValue() != null) {
                lottieListener.onResult(lottieResult.getValue());
            }
            this.getHighSpeedVideoFpsRanges.add(lottieListener);
        }
        return this;
    }

    public com.airbnb.lottie.LottieTask<T> removeListener(com.airbnb.lottie.LottieListener<T> lottieListener) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRanges.remove(lottieListener);
        }
        return this;
    }

    public com.airbnb.lottie.LottieTask<T> addFailureListener(com.airbnb.lottie.LottieListener<java.lang.Throwable> lottieListener) {
        synchronized (this) {
            com.airbnb.lottie.LottieResult<T> lottieResult = this.getHighSpeedVideoSizes;
            if (lottieResult != null && lottieResult.getException() != null) {
                lottieListener.onResult(lottieResult.getException());
            }
            this.getHighSpeedVideoFpsRangesFor.add(lottieListener);
        }
        return this;
    }

    public com.airbnb.lottie.LottieTask<T> removeFailureListener(com.airbnb.lottie.LottieListener<java.lang.Throwable> lottieListener) {
        synchronized (this) {
            this.getHighSpeedVideoFpsRangesFor.remove(lottieListener);
        }
        return this;
    }

    public com.airbnb.lottie.LottieResult<T> getResult() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes() {
        com.airbnb.lottie.LottieResult<T> lottieResult = this.getHighSpeedVideoSizes;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() != null) {
            getHighResolutionOutputSizeshNQ4ISI((com.airbnb.lottie.LottieTask<T>) lottieResult.getValue());
        } else {
            getHighResolutionOutputSizeshNQ4ISI(lottieResult.getException());
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(T t) {
        synchronized (this) {
            java.util.Iterator it = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges).iterator();
            while (it.hasNext()) {
                ((com.airbnb.lottie.LottieListener) it.next()).onResult(t);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
        synchronized (this) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
            if (arrayList.isEmpty()) {
                com.airbnb.lottie.utils.Logger.warning("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.airbnb.lottie.LottieListener) it.next()).onResult(th);
            }
        }
    }

    static class LottieFutureTask<T> extends java.util.concurrent.FutureTask<com.airbnb.lottie.LottieResult<T>> {
        private com.airbnb.lottie.LottieTask<T> getHighSpeedVideoFpsRanges;

        LottieFutureTask(com.airbnb.lottie.LottieTask<T> lottieTask, java.util.concurrent.Callable<com.airbnb.lottie.LottieResult<T>> callable) {
            super(callable);
            this.getHighSpeedVideoFpsRanges = lottieTask;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    com.airbnb.lottie.LottieTask.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, get());
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    com.airbnb.lottie.LottieTask.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, new com.airbnb.lottie.LottieResult(e));
                }
            } finally {
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.LottieTask lottieTask, com.airbnb.lottie.LottieResult lottieResult) {
        if (lottieTask.getHighSpeedVideoSizes != null) {
            throw new java.lang.IllegalStateException("A task may only be set once.");
        }
        lottieTask.getHighSpeedVideoSizes = lottieResult;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            lottieTask.getHighSpeedVideoSizes();
        } else {
            lottieTask.getHighResolutionOutputSizeshNQ4ISI.post(new com.airbnb.lottie.LottieTask$$ExternalSyntheticLambda0(lottieTask));
        }
    }
}
