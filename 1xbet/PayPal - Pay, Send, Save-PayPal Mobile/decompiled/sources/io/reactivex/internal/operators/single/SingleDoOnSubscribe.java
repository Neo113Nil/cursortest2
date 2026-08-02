package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoOnSubscribe<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDoOnSubscribe(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.getHighSpeedVideoSizes = singleSource;
        this.Camera2StreamConfigurationMap = consumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleDoOnSubscribe.DoOnSubscribeSingleObserver(singleObserver, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class DoOnSubscribeSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        DoOnSubscribeSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            try {
                this.getHighSpeedVideoFpsRangesFor.accept(disposable);
                this.getHighSpeedVideoSizes.onSubscribe(disposable);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges = true;
                disposable.dispose();
                io.reactivex.internal.disposables.EmptyDisposable.error(th, this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoSizes.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes.onError(th);
            }
        }
    }
}
