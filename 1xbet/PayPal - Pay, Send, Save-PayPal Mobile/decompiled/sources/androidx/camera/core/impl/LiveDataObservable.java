package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class LiveDataObservable<T> implements androidx.camera.core.impl.Observable<T> {
    androidx.view.Observer<androidx.camera.core.impl.LiveDataObservable.Result<T>> getHighSpeedVideoSizes;
    final androidx.view.MutableLiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>();
    final java.util.Map<androidx.camera.core.impl.Observable.Observer<? super T>, java.util.concurrent.Executor> Camera2StreamConfigurationMap = new java.util.HashMap();

    public final void postValue(T t) {
        this.getHighSpeedVideoFpsRanges.postValue(androidx.camera.core.impl.LiveDataObservable.Result.Camera2StreamConfigurationMap(t));
    }

    public final void postError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges.postValue(androidx.camera.core.impl.LiveDataObservable.Result.getHighResolutionOutputSizeshNQ4ISI(th));
    }

    public final androidx.view.LiveData<androidx.camera.core.impl.LiveDataObservable.Result<T>> getLiveData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.Observable
    public final com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                final androidx.camera.core.impl.LiveDataObservable liveDataObservable = androidx.camera.core.impl.LiveDataObservable.this;
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.LiveDataObservable liveDataObservable2 = androidx.camera.core.impl.LiveDataObservable.this;
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                        androidx.camera.core.impl.LiveDataObservable.Result result = (androidx.camera.core.impl.LiveDataObservable.Result) liveDataObservable2.getHighSpeedVideoFpsRanges.getValue();
                        if (result == null) {
                            completer2.setException(new java.lang.IllegalStateException("Observable has not yet been initialized with a value."));
                        } else if (result.completedSuccessfully()) {
                            completer2.set(result.getValue());
                        } else {
                            androidx.core.util.Preconditions.checkNotNull(result.getError());
                            completer2.setException(result.getError());
                        }
                    }
                });
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(liveDataObservable);
                sb.append(" [fetch@");
                sb.append(android.os.SystemClock.uptimeMillis());
                sb.append("]");
                return sb.toString();
            }
        });
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(java.util.concurrent.Executor executor, final androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.Camera2StreamConfigurationMap) {
            boolean isEmpty = this.Camera2StreamConfigurationMap.isEmpty();
            this.Camera2StreamConfigurationMap.put(observer, executor);
            if (!isEmpty) {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.LiveDataObservable liveDataObservable = androidx.camera.core.impl.LiveDataObservable.this;
                        androidx.camera.core.impl.Observable.Observer observer2 = observer;
                        androidx.camera.core.impl.LiveDataObservable.Result result = (androidx.camera.core.impl.LiveDataObservable.Result) liveDataObservable.getHighSpeedVideoFpsRanges.getValue();
                        if (result != null) {
                            if (result.completedSuccessfully()) {
                                observer2.onNewData(result.getValue());
                            } else {
                                androidx.core.util.Preconditions.checkNotNull(result.getError());
                                observer2.onError(result.getError());
                            }
                        }
                    }
                });
            } else {
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        final androidx.camera.core.impl.LiveDataObservable liveDataObservable = androidx.camera.core.impl.LiveDataObservable.this;
                        if (liveDataObservable.getHighSpeedVideoSizes == null) {
                            liveDataObservable.getHighSpeedVideoSizes = new androidx.view.Observer() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda0
                                @Override // androidx.view.Observer
                                public final void onChanged(java.lang.Object obj) {
                                    java.util.HashMap hashMap;
                                    androidx.camera.core.impl.LiveDataObservable liveDataObservable2 = androidx.camera.core.impl.LiveDataObservable.this;
                                    final androidx.camera.core.impl.LiveDataObservable.Result result = (androidx.camera.core.impl.LiveDataObservable.Result) obj;
                                    synchronized (liveDataObservable2.Camera2StreamConfigurationMap) {
                                        hashMap = new java.util.HashMap(liveDataObservable2.Camera2StreamConfigurationMap);
                                    }
                                    for (final java.util.Map.Entry entry : hashMap.entrySet()) {
                                        ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda4
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                androidx.camera.core.impl.LiveDataObservable.getHighSpeedVideoFpsRangesFor(entry, result);
                                            }
                                        });
                                    }
                                }
                            };
                        }
                        liveDataObservable.getHighSpeedVideoFpsRanges.observeForever(liveDataObservable.getHighSpeedVideoSizes);
                    }
                });
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap.remove(observer);
            if (this.Camera2StreamConfigurationMap.isEmpty()) {
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.LiveDataObservable liveDataObservable = androidx.camera.core.impl.LiveDataObservable.this;
                        java.lang.Object obj = liveDataObservable.getHighSpeedVideoSizes;
                        if (obj != null) {
                            liveDataObservable.getHighSpeedVideoFpsRanges.removeObserver(obj);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.Map.Entry entry, androidx.camera.core.impl.LiveDataObservable.Result result) {
        androidx.camera.core.impl.Observable.Observer observer = (androidx.camera.core.impl.Observable.Observer) entry.getKey();
        if (result.completedSuccessfully()) {
            observer.onNewData(result.getValue());
        } else {
            androidx.core.util.Preconditions.checkNotNull(result.getError());
            observer.onError(result.getError());
        }
    }

    public static final class Result<T> {
        private final T getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

        private Result(T t, java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.getHighSpeedVideoFpsRangesFor = th;
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> Camera2StreamConfigurationMap(T t) {
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(t, null);
        }

        static <T> androidx.camera.core.impl.LiveDataObservable.Result<T> getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            return new androidx.camera.core.impl.LiveDataObservable.Result<>(null, (java.lang.Throwable) androidx.core.util.Preconditions.checkNotNull(th));
        }

        public final boolean completedSuccessfully() {
            return this.getHighSpeedVideoFpsRangesFor == null;
        }

        public final T getValue() {
            if (!completedSuccessfully()) {
                throw new java.lang.IllegalStateException("Result contains an error. Does not contain a value.");
            }
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final java.lang.Throwable getError() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            java.lang.String obj;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[Result: <");
            if (completedSuccessfully()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Value: ");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                obj = sb2.toString();
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Error: ");
                sb3.append(this.getHighSpeedVideoFpsRangesFor);
                obj = sb3.toString();
            }
            sb.append(obj);
            sb.append(">]");
            return sb.toString();
        }
    }
}
