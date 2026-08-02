package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDetach<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableDetach(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDetach.DetachObserver(observer));
    }

    /* loaded from: classes17.dex */
    static final class DetachObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        DetachObserver(io.reactivex.Observer<? super T> observer) {
            this.Camera2StreamConfigurationMap = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.util.EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.Observer<? super T> observer = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.util.EmptyComponent.asObserver();
            observer.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.Observer<? super T> observer = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.util.EmptyComponent.asObserver();
            observer.onComplete();
        }
    }
}
