package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableHide<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableHide(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableHide.HideDisposable(observer));
    }

    /* loaded from: classes17.dex */
    static final class HideDisposable<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        HideDisposable(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
