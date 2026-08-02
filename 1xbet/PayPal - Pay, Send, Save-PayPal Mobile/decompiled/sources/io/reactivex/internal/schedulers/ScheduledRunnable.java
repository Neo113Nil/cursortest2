package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class ScheduledRunnable extends java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> implements java.lang.Runnable, java.util.concurrent.Callable<java.lang.Object>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -6120223772001106981L;
    final java.lang.Runnable getHighSpeedVideoFpsRanges;
    static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    public ScheduledRunnable(java.lang.Runnable runnable, io.reactivex.internal.disposables.DisposableContainer disposableContainer) {
        super(3);
        this.getHighSpeedVideoFpsRanges = runnable;
        lazySet(0, disposableContainer);
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        boolean compareAndSet;
        java.lang.Object obj4;
        java.lang.Object obj5;
        lazySet(2, java.lang.Thread.currentThread());
        try {
            this.getHighSpeedVideoFpsRanges.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != getHighSpeedVideoSizes) {
                    ((io.reactivex.internal.disposables.DisposableContainer) obj4).delete(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != Camera2StreamConfigurationMap) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, getHighResolutionOutputSizeshNQ4ISI));
            } catch (java.lang.Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != getHighSpeedVideoSizes && compareAndSet(0, obj4, getHighResolutionOutputSizeshNQ4ISI) && obj4 != null) {
            ((io.reactivex.internal.disposables.DisposableContainer) obj4).delete(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != Camera2StreamConfigurationMap || obj5 == getHighSpeedVideoFpsRangesFor) {
                return;
            }
        } while (!compareAndSet(1, obj5, getHighResolutionOutputSizeshNQ4ISI));
    }

    public final void setFuture(java.util.concurrent.Future<?> future) {
        java.lang.Object obj;
        do {
            obj = get(1);
            if (obj == getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            if (obj == Camera2StreamConfigurationMap) {
                future.cancel(false);
                return;
            } else if (obj == getHighSpeedVideoFpsRangesFor) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        while (true) {
            java.lang.Object obj5 = get(1);
            if (obj5 == getHighResolutionOutputSizeshNQ4ISI || obj5 == (obj3 = Camera2StreamConfigurationMap) || obj5 == (obj4 = getHighSpeedVideoFpsRangesFor)) {
                break;
            }
            boolean z = get(2) != java.lang.Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((java.util.concurrent.Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == getHighResolutionOutputSizeshNQ4ISI || obj == (obj2 = getHighSpeedVideoSizes) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((io.reactivex.internal.disposables.DisposableContainer) obj).delete(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        java.lang.Object obj = get(0);
        return obj == getHighSpeedVideoSizes || obj == getHighResolutionOutputSizeshNQ4ISI;
    }
}
