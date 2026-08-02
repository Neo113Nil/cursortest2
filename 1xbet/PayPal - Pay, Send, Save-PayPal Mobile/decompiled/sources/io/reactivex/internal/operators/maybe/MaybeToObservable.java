package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeToObservable<T> extends io.reactivex.Observable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeToObservable(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(create(observer));
    }

    public static <T> io.reactivex.MaybeObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.internal.operators.maybe.MaybeToObservable.MaybeToObservableObserver(observer);
    }

    /* loaded from: classes17.dex */
    static final class MaybeToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        MaybeToObservableObserver(io.reactivex.Observer<? super T> observer) {
            super(observer);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.actual.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            error(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            complete();
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }
    }
}
