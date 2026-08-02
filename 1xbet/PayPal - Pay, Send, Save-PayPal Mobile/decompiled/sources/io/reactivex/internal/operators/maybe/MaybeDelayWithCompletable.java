package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDelayWithCompletable<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public MaybeDelayWithCompletable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.CompletableSource completableSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
        this.getHighSpeedVideoFpsRangesFor = completableSource;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable.OtherObserver(maybeObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 703409937383992161L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRangesFor;

        OtherObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<T> maybeSource) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighSpeedVideoFpsRangesFor = maybeSource;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable.DelayWithMainObserver(this, this.getHighSpeedVideoFpsRanges));
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

    /* loaded from: classes17.dex */
    static final class DelayWithMainObserver<T> implements io.reactivex.MaybeObserver<T> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;

        DelayWithMainObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.Camera2StreamConfigurationMap = atomicReference;
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.Camera2StreamConfigurationMap, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
