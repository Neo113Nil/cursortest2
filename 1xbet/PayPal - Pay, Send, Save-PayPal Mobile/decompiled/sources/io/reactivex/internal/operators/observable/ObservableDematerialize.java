package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDematerialize<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<io.reactivex.Notification<T>, T> {
    public ObservableDematerialize(io.reactivex.ObservableSource<io.reactivex.Notification<T>> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDematerialize.DematerializeObserver(observer));
    }

    /* loaded from: classes17.dex */
    static final class DematerializeObserver<T> implements io.reactivex.Observer<io.reactivex.Notification<T>>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoSizes;

        @Override // io.reactivex.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.Notification notification = (io.reactivex.Notification) obj;
            if (this.getHighSpeedVideoSizes) {
                if (notification.isOnError()) {
                    io.reactivex.plugins.RxJavaPlugins.onError(notification.getError());
                }
            } else if (notification.isOnError()) {
                this.Camera2StreamConfigurationMap.dispose();
                onError(notification.getError());
            } else if (notification.isOnComplete()) {
                this.Camera2StreamConfigurationMap.dispose();
                onComplete();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext((java.lang.Object) notification.getValue());
            }
        }

        DematerializeObserver(io.reactivex.Observer<? super T> observer) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
