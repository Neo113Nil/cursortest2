package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class BlockingObservableNext<T> implements java.lang.Iterable<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRanges;

    public BlockingObservableNext(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoFpsRanges = observableSource;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new io.reactivex.internal.operators.observable.BlockingObservableNext.NextIterator(this.getHighSpeedVideoFpsRanges, new io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver());
    }

    /* loaded from: classes17.dex */
    static final class NextIterator<T> implements java.util.Iterator<T> {
        private final io.reactivex.ObservableSource<T> Camera2StreamConfigurationMap;
        private java.lang.Throwable getHighSpeedVideoFpsRanges;
        private T getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> getInputFormats;
        private boolean getOutputMinFrameDuration;
        private boolean getHighResolutionOutputSizeshNQ4ISI = true;
        private boolean getHighSpeedVideoSizes = true;

        NextIterator(io.reactivex.ObservableSource<T> observableSource, io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> nextObserver) {
            this.Camera2StreamConfigurationMap = observableSource;
            this.getInputFormats = nextObserver;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return !this.getHighSpeedVideoSizes || getHighSpeedVideoFpsRanges();
            }
            return false;
        }

        private boolean getHighSpeedVideoFpsRanges() {
            if (!this.getOutputMinFrameDuration) {
                this.getOutputMinFrameDuration = true;
                this.getInputFormats.getHighSpeedVideoFpsRangesFor.set(1);
                new io.reactivex.internal.operators.observable.ObservableMaterialize(this.Camera2StreamConfigurationMap).subscribe(this.getInputFormats);
            }
            try {
                io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> nextObserver = this.getInputFormats;
                nextObserver.getHighSpeedVideoFpsRangesFor.set(1);
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                io.reactivex.Notification<T> take = nextObserver.getHighSpeedVideoSizes.take();
                if (take.isOnNext()) {
                    this.getHighSpeedVideoSizes = false;
                    this.getHighSpeedVideoFpsRangesFor = take.getValue();
                    return true;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = false;
                if (take.isOnComplete()) {
                    return false;
                }
                java.lang.Throwable error = take.getError();
                this.getHighSpeedVideoFpsRanges = error;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(error);
            } catch (java.lang.InterruptedException e) {
                this.getInputFormats.dispose();
                this.getHighSpeedVideoFpsRanges = e;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (hasNext()) {
                this.getHighSpeedVideoSizes = true;
                return this.getHighSpeedVideoFpsRangesFor;
            }
            throw new java.util.NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    /* loaded from: classes17.dex */
    static final class NextObserver<T> extends io.reactivex.observers.DisposableObserver<io.reactivex.Notification<T>> {
        final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> getHighSpeedVideoSizes = new java.util.concurrent.ArrayBlockingQueue(1);
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger();

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        NextObserver() {
        }

        @Override // io.reactivex.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.Notification<T> notification = (io.reactivex.Notification) obj;
            if (this.getHighSpeedVideoFpsRangesFor.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.getHighSpeedVideoSizes.offer(notification)) {
                    io.reactivex.Notification<T> poll = this.getHighSpeedVideoSizes.poll();
                    if (poll != null && !poll.isOnNext()) {
                        notification = poll;
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
