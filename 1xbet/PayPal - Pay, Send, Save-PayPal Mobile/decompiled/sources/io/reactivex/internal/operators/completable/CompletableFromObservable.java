package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromObservable<T> extends io.reactivex.Completable {
    final io.reactivex.ObservableSource<T> Camera2StreamConfigurationMap;

    public CompletableFromObservable(io.reactivex.ObservableSource<T> observableSource) {
        this.Camera2StreamConfigurationMap = observableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.completable.CompletableFromObservable.CompletableFromObservableObserver(completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class CompletableFromObservableObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
        }

        CompletableFromObservableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoSizes = completableObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
