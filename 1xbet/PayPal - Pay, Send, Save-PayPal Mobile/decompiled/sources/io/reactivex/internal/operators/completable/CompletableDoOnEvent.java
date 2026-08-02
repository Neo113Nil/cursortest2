package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDoOnEvent extends io.reactivex.Completable {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoSizes;

    public CompletableDoOnEvent(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        this.getHighSpeedVideoFpsRangesFor = completableSource;
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.completable.CompletableDoOnEvent.DoOnEvent(completableObserver));
    }

    /* loaded from: classes17.dex */
    final class DoOnEvent implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;

        DoOnEvent(io.reactivex.CompletableObserver completableObserver) {
            this.Camera2StreamConfigurationMap = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                io.reactivex.internal.operators.completable.CompletableDoOnEvent.this.getHighSpeedVideoSizes.accept(null);
                this.Camera2StreamConfigurationMap.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.completable.CompletableDoOnEvent.this.getHighSpeedVideoSizes.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.Camera2StreamConfigurationMap.onSubscribe(disposable);
        }
    }
}
