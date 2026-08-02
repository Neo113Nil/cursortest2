package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class BlockingObservableLatest<T> implements java.lang.Iterable<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public BlockingObservableLatest(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoSizes = observableSource;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.observable.BlockingObservableLatest.BlockingObservableLatestIterator blockingObservableLatestIterator = new io.reactivex.internal.operators.observable.BlockingObservableLatest.BlockingObservableLatestIterator();
        io.reactivex.Observable.wrap(this.getHighSpeedVideoSizes).materialize().subscribe(blockingObservableLatestIterator);
        return blockingObservableLatestIterator;
    }

    /* loaded from: classes17.dex */
    static final class BlockingObservableLatestIterator<T> extends io.reactivex.observers.DisposableObserver<io.reactivex.Notification<T>> implements java.util.Iterator<T> {
        io.reactivex.Notification<T> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.Semaphore getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.Semaphore(0);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        BlockingObservableLatestIterator() {
        }

        @Override // io.reactivex.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            if (this.getHighSpeedVideoSizes.getAndSet((io.reactivex.Notification) obj) == null) {
                this.getHighResolutionOutputSizeshNQ4ISI.release();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            io.reactivex.Notification<T> notification = this.getHighSpeedVideoFpsRanges;
            if (notification != null && notification.isOnError()) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(this.getHighSpeedVideoFpsRanges.getError());
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                try {
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    this.getHighResolutionOutputSizeshNQ4ISI.acquire();
                    io.reactivex.Notification<T> andSet = this.getHighSpeedVideoSizes.getAndSet(null);
                    this.getHighSpeedVideoFpsRanges = andSet;
                    if (andSet.isOnError()) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (java.lang.InterruptedException e) {
                    dispose();
                    this.getHighSpeedVideoFpsRanges = io.reactivex.Notification.createOnError(e);
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.getHighSpeedVideoFpsRanges.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T value = this.getHighSpeedVideoFpsRanges.getValue();
                this.getHighSpeedVideoFpsRanges = null;
                return value;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator.");
        }
    }
}
