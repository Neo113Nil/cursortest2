package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableFromSingle<T> extends io.reactivex.Completable {
    final io.reactivex.SingleSource<T> Camera2StreamConfigurationMap;

    public CompletableFromSingle(io.reactivex.SingleSource<T> singleSource) {
        this.Camera2StreamConfigurationMap = singleSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.completable.CompletableFromSingle.CompletableFromSingleObserver(completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class CompletableFromSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;

        CompletableFromSingleObserver(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
