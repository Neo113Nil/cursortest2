package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class BlockingObservableIterable<T> implements java.lang.Iterable<T> {
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizes;

    public BlockingObservableIterable(io.reactivex.ObservableSource<? extends T> observableSource, int i) {
        this.getHighSpeedVideoSizes = observableSource;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.observable.BlockingObservableIterable.BlockingObservableIterator blockingObservableIterator = new io.reactivex.internal.operators.observable.BlockingObservableIterable.BlockingObservableIterator(this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizes.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }

    /* loaded from: classes17.dex */
    static final class BlockingObservableIterator<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, java.util.Iterator<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> Camera2StreamConfigurationMap;
        final java.util.concurrent.locks.Condition getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final java.util.concurrent.locks.Lock getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;

        BlockingObservableIterator(int i) {
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.getHighSpeedVideoFpsRangesFor = reentrantLock;
            this.getHighResolutionOutputSizeshNQ4ISI = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                boolean z = this.getHighSpeedVideoFpsRanges;
                boolean isEmpty = this.Camera2StreamConfigurationMap.isEmpty();
                if (z) {
                    java.lang.Throwable th = this.getHighSpeedVideoSizes;
                    if (th != null) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                try {
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    this.getHighSpeedVideoFpsRangesFor.lock();
                    while (!this.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap.isEmpty()) {
                        try {
                            this.getHighResolutionOutputSizeshNQ4ISI.await();
                        } finally {
                        }
                    }
                    this.getHighSpeedVideoFpsRangesFor.unlock();
                } catch (java.lang.InterruptedException e) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                    getHighSpeedVideoFpsRangesFor();
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                }
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                return this.Camera2StreamConfigurationMap.poll();
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.offer(t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        private void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor.lock();
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.signalAll();
            } finally {
                this.getHighSpeedVideoFpsRangesFor.unlock();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("remove");
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
}
