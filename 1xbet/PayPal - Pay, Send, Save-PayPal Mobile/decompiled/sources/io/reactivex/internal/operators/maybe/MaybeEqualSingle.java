package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.MaybeSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public MaybeEqualSingle(io.reactivex.MaybeSource<? extends T> maybeSource, io.reactivex.MaybeSource<? extends T> maybeSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
        this.getHighSpeedVideoFpsRangesFor = maybeSource;
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource2;
        this.getHighSpeedVideoFpsRanges = biPredicate;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator(singleObserver, this.getHighSpeedVideoFpsRanges);
        singleObserver.onSubscribe(equalCoordinator);
        io.reactivex.MaybeSource<? extends T> maybeSource = this.getHighSpeedVideoFpsRangesFor;
        io.reactivex.MaybeSource<? extends T> maybeSource2 = this.getHighResolutionOutputSizeshNQ4ISI;
        maybeSource.subscribe(equalCoordinator.getHighSpeedVideoFpsRanges);
        maybeSource2.subscribe(equalCoordinator.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiPredicate<? super T, ? super T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoSizes;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            super(2);
            this.getHighSpeedVideoSizes = singleObserver;
            this.Camera2StreamConfigurationMap = biPredicate;
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<>(this);
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<>(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
        }

        final void getHighSpeedVideoSizes() {
            if (decrementAndGet() == 0) {
                java.lang.Object obj = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                if (obj != null && obj2 != null) {
                    try {
                        this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap.test(obj, obj2)));
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoSizes.onError(th);
                        return;
                    }
                }
                this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.valueOf(obj == null && obj2 == null));
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class EqualObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> getHighSpeedVideoSizes;

        EqualObserver(io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> equalCoordinator) {
            this.getHighSpeedVideoSizes = equalCoordinator;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> equalCoordinator = this.getHighSpeedVideoSizes;
            if (equalCoordinator.getAndSet(0) > 0) {
                io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> equalObserver = equalCoordinator.getHighSpeedVideoFpsRanges;
                if (this == equalObserver) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(equalCoordinator.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(equalObserver);
                }
                equalCoordinator.getHighSpeedVideoSizes.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }
    }
}
