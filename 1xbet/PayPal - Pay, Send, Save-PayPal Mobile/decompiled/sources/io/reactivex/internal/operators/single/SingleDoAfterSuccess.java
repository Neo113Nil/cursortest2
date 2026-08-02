package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoAfterSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

    public SingleDoAfterSuccess(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super T> consumer) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleDoAfterSuccess.DoAfterObserver(singleObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class DoAfterObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Consumer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        DoAfterObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Consumer<? super T> consumer) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.onSuccess(t);
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }
    }
}
