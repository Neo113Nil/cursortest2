package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class ConstantObservable<T> implements androidx.camera.core.impl.Observable<T> {
    private static final androidx.camera.core.impl.ConstantObservable<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.ConstantObservable<>(null);
    final com.google.common.util.concurrent.ListenableFuture<T> getHighSpeedVideoFpsRanges;

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(androidx.camera.core.impl.Observable.Observer<? super T> observer) {
    }

    public static <U> androidx.camera.core.impl.Observable<U> withValue(U u) {
        if (u == null) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        return new androidx.camera.core.impl.ConstantObservable(u);
    }

    private ConstantObservable(T t) {
        this.getHighSpeedVideoFpsRanges = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(t);
    }

    @Override // androidx.camera.core.impl.Observable
    public final com.google.common.util.concurrent.ListenableFuture<T> fetchData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(java.util.concurrent.Executor executor, final androidx.camera.core.impl.Observable.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRanges.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.ConstantObservable$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.ConstantObservable constantObservable = androidx.camera.core.impl.ConstantObservable.this;
                androidx.camera.core.impl.Observable.Observer observer2 = observer;
                try {
                    observer2.onNewData(constantObservable.getHighSpeedVideoFpsRanges.get());
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    observer2.onError(e);
                }
            }
        }, executor);
    }
}
