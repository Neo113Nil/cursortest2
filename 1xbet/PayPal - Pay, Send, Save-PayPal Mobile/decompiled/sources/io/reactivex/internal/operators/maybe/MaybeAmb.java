package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeAmb<T> extends io.reactivex.Maybe<T> {
    private final io.reactivex.MaybeSource<? extends T>[] Camera2StreamConfigurationMap;
    private final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeAmb(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr, java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> iterable) {
        this.Camera2StreamConfigurationMap = maybeSourceArr;
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        int length;
        io.reactivex.MaybeSource<? extends T>[] maybeSourceArr = this.Camera2StreamConfigurationMap;
        if (maybeSourceArr == null) {
            maybeSourceArr = new io.reactivex.MaybeSource[8];
            try {
                length = 0;
                for (io.reactivex.MaybeSource<? extends T> maybeSource : this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (maybeSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), maybeObserver);
                        return;
                    }
                    if (length == maybeSourceArr.length) {
                        io.reactivex.MaybeSource<? extends T>[] maybeSourceArr2 = new io.reactivex.MaybeSource[(length >> 2) + length];
                        java.lang.System.arraycopy(maybeSourceArr, 0, maybeSourceArr2, 0, length);
                        maybeSourceArr = maybeSourceArr2;
                    }
                    maybeSourceArr[length] = maybeSource;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
                return;
            }
        } else {
            length = maybeSourceArr.length;
        }
        io.reactivex.internal.operators.maybe.MaybeAmb.AmbMaybeObserver ambMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeAmb.AmbMaybeObserver(maybeObserver);
        maybeObserver.onSubscribe(ambMaybeObserver);
        for (int i = 0; i < length; i++) {
            io.reactivex.MaybeSource<? extends T> maybeSource2 = maybeSourceArr[i];
            if (ambMaybeObserver.isDisposed()) {
                return;
            }
            if (maybeSource2 == null) {
                ambMaybeObserver.onError(new java.lang.NullPointerException("One of the MaybeSources is null"));
                return;
            }
            maybeSource2.subscribe(ambMaybeObserver);
        }
        if (length == 0) {
            maybeObserver.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbMaybeObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7044685185359438206L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes = new io.reactivex.disposables.CompositeDisposable();

        AmbMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }
    }
}
