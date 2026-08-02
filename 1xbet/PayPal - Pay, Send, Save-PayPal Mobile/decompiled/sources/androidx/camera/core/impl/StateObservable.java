package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class StateObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private int Camera2StreamConfigurationMap = 0;
    private boolean getHighSpeedVideoFpsRanges = false;
    private final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> getInputFormats = new java.util.HashMap();
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.CopyOnWriteArraySet<>();

    StateObservable(java.lang.Object obj, boolean z) {
        if (z) {
            androidx.core.util.Preconditions.checkArgument(obj instanceof java.lang.Throwable, "Initial errors must be Throwable");
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(androidx.camera.core.impl.StateObservable.ErrorWrapper.getHighSpeedVideoSizes((java.lang.Throwable) obj));
        } else {
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(obj);
        }
    }

    final void Camera2StreamConfigurationMap(T t) {
        getHighSpeedVideoFpsRanges(t);
    }

    final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
        getHighSpeedVideoFpsRanges(androidx.camera.core.impl.StateObservable.ErrorWrapper.getHighSpeedVideoSizes(th));
    }

    private void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (java.util.Objects.equals(this.getHighSpeedVideoSizes.getAndSet(obj), obj)) {
                return;
            }
            int i = this.Camera2StreamConfigurationMap + 1;
            this.Camera2StreamConfigurationMap = i;
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            java.util.Iterator<androidx.camera.core.impl.StateObservable.ObserverWrapper<T>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (true) {
                if (it.hasNext()) {
                    it.next().getHighSpeedVideoFpsRanges(i);
                } else {
                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                        if (this.Camera2StreamConfigurationMap == i) {
                            this.getHighSpeedVideoFpsRanges = false;
                            return;
                        } else {
                            it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                            i = this.Camera2StreamConfigurationMap;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
        java.lang.Object obj = this.getHighSpeedVideoSizes.get();
        if (obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getHighSpeedVideoFpsRanges());
        }
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        androidx.camera.core.impl.StateObservable.ObserverWrapper<T> observerWrapper;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            getHighSpeedVideoSizes(observer);
            observerWrapper = new androidx.camera.core.impl.StateObservable.ObserverWrapper<>(this.getHighSpeedVideoSizes, executor, observer);
            this.getInputFormats.put(observer, observerWrapper);
            this.getHighResolutionOutputSizeshNQ4ISI.add(observerWrapper);
        }
        observerWrapper.getHighSpeedVideoFpsRanges(0);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            getHighSpeedVideoSizes(observer);
        }
    }

    public void removeObservers() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator it = new java.util.HashSet(this.getInputFormats.keySet()).iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes((androidx.camera.core.impl.Observable.Observer) it.next());
            }
        }
    }

    private void getHighSpeedVideoSizes(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        androidx.camera.core.impl.StateObservable.ObserverWrapper<T> remove = this.getInputFormats.remove(observer);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRangesFor.set(false);
            this.getHighResolutionOutputSizeshNQ4ISI.remove(remove);
        }
    }

    static final class ObserverWrapper<T> implements java.lang.Runnable {
        private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
        private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.camera.core.impl.Observable.Observer<? super T> getHighSpeedVideoSizesFor;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getOutputFormats;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(true);
        private java.lang.Object getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes;
        private int Camera2StreamConfigurationMap = -1;
        private boolean getInputSizeshNQ4ISI = false;

        ObserverWrapper(java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference, java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super T> observer) {
            this.getOutputFormats = atomicReference;
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.getHighSpeedVideoSizesFor = observer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRangesFor.get()) {
                    this.getInputSizeshNQ4ISI = false;
                    return;
                }
                java.lang.Object obj = this.getOutputFormats.get();
                int i = this.Camera2StreamConfigurationMap;
                while (true) {
                    if (!java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, obj)) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        if (obj instanceof androidx.camera.core.impl.StateObservable.ErrorWrapper) {
                            this.getHighSpeedVideoSizesFor.onError(((androidx.camera.core.impl.StateObservable.ErrorWrapper) obj).getHighSpeedVideoFpsRanges());
                        } else {
                            this.getHighSpeedVideoSizesFor.onNewData(obj);
                        }
                    }
                    synchronized (this) {
                        if (i == this.Camera2StreamConfigurationMap || !this.getHighSpeedVideoFpsRangesFor.get()) {
                            break;
                        }
                        obj = this.getOutputFormats.get();
                        i = this.Camera2StreamConfigurationMap;
                    }
                }
                this.getInputSizeshNQ4ISI = false;
            }
        }

        final void getHighSpeedVideoFpsRanges(int i) {
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor.get()) {
                    if (i <= this.Camera2StreamConfigurationMap) {
                        return;
                    }
                    this.Camera2StreamConfigurationMap = i;
                    if (this.getInputSizeshNQ4ISI) {
                        return;
                    }
                    this.getInputSizeshNQ4ISI = true;
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI.execute(this);
                    } catch (java.lang.Throwable unused) {
                        synchronized (this) {
                            this.getInputSizeshNQ4ISI = false;
                        }
                    }
                }
            }
        }
    }

    static abstract class ErrorWrapper {
        public abstract java.lang.Throwable getHighSpeedVideoFpsRanges();

        ErrorWrapper() {
        }

        static androidx.camera.core.impl.StateObservable.ErrorWrapper getHighSpeedVideoSizes(java.lang.Throwable th) {
            return new androidx.camera.core.impl.AutoValue_StateObservable_ErrorWrapper(th);
        }
    }
}
