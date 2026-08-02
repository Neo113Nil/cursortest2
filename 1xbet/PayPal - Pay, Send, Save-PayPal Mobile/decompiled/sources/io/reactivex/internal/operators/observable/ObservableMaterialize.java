package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMaterialize<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Notification<T>> {
    public ObservableMaterialize(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Notification<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableMaterialize.MaterializeObserver(observer));
    }

    /* loaded from: classes17.dex */
    static final class MaterializeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super io.reactivex.Notification<T>> getHighSpeedVideoFpsRangesFor;

        MaterializeObserver(io.reactivex.Observer<? super io.reactivex.Notification<T>> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(io.reactivex.Notification.createOnNext(t));
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onNext(io.reactivex.Notification.createOnError(th));
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onNext(io.reactivex.Notification.createOnComplete());
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
