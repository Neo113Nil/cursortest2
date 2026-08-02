package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleResumeNext<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoFpsRangesFor;

    public SingleResumeNext(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> function) {
        this.getHighSpeedVideoFpsRanges = singleSource;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.single.SingleResumeNext.ResumeMainSingleObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ResumeMainSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5314538511045349925L;
        final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoFpsRanges;

        ResumeMainSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            try {
                ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(th), "The nextFunction returned a null SingleSource.")).subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.getHighResolutionOutputSizeshNQ4ISI));
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
