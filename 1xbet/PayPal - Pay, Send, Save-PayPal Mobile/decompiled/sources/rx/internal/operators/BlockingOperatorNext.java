package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BlockingOperatorNext {
    private BlockingOperatorNext() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.lang.Iterable<T> next(final rx.Observable<? extends T> observable) {
        return new java.lang.Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorNext.1
            @Override // java.lang.Iterable
            public final java.util.Iterator<T> iterator() {
                return new rx.internal.operators.BlockingOperatorNext.NextIterator(rx.Observable.this, new rx.internal.operators.BlockingOperatorNext.NextObserver());
            }
        };
    }

    static final class NextIterator<T> implements java.util.Iterator<T> {
        private T Camera2StreamConfigurationMap;
        private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Observable<? extends T> getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizesFor;
        private final rx.internal.operators.BlockingOperatorNext.NextObserver<T> getOutputMinFrameDuration;
        private boolean getHighSpeedVideoSizes = true;
        private boolean getHighSpeedVideoFpsRanges = true;

        NextIterator(rx.Observable<? extends T> observable, rx.internal.operators.BlockingOperatorNext.NextObserver<T> nextObserver) {
            this.getHighSpeedVideoFpsRangesFor = observable;
            this.getOutputMinFrameDuration = nextObserver;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th != null) {
                throw rx.exceptions.Exceptions.propagate(th);
            }
            if (this.getHighSpeedVideoSizes) {
                return !this.getHighSpeedVideoFpsRanges || getHighResolutionOutputSizeshNQ4ISI();
            }
            return false;
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI() {
            try {
                if (!this.getHighSpeedVideoSizesFor) {
                    this.getHighSpeedVideoSizesFor = true;
                    this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI.set(1);
                    this.getHighSpeedVideoFpsRangesFor.materialize().subscribe((rx.Subscriber<? super rx.Notification<? extends T>>) this.getOutputMinFrameDuration);
                }
                rx.internal.operators.BlockingOperatorNext.NextObserver<T> nextObserver = this.getOutputMinFrameDuration;
                nextObserver.getHighResolutionOutputSizeshNQ4ISI.set(1);
                rx.Notification<? extends T> take = nextObserver.getHighSpeedVideoFpsRanges.take();
                if (take.isOnNext()) {
                    this.getHighSpeedVideoFpsRanges = false;
                    this.Camera2StreamConfigurationMap = take.getValue();
                    return true;
                }
                this.getHighSpeedVideoSizes = false;
                if (take.isOnCompleted()) {
                    return false;
                }
                if (take.isOnError()) {
                    java.lang.Throwable throwable = take.getThrowable();
                    this.getHighResolutionOutputSizeshNQ4ISI = throwable;
                    throw rx.exceptions.Exceptions.propagate(throwable);
                }
                throw new java.lang.IllegalStateException("Should not reach here");
            } catch (java.lang.InterruptedException e) {
                this.getOutputMinFrameDuration.unsubscribe();
                java.lang.Thread.currentThread().interrupt();
                this.getHighResolutionOutputSizeshNQ4ISI = e;
                throw rx.exceptions.Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th != null) {
                throw rx.exceptions.Exceptions.propagate(th);
            }
            if (hasNext()) {
                this.getHighSpeedVideoFpsRanges = true;
                return this.Camera2StreamConfigurationMap;
            }
            throw new java.util.NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    static final class NextObserver<T> extends rx.Subscriber<rx.Notification<? extends T>> {
        final java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> getHighSpeedVideoFpsRanges = new java.util.concurrent.ArrayBlockingQueue(1);
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
        }

        NextObserver() {
        }

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            rx.Notification<? extends T> notification = (rx.Notification) obj;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.getHighSpeedVideoFpsRanges.offer(notification)) {
                    rx.Notification<? extends T> poll = this.getHighSpeedVideoFpsRanges.poll();
                    if (poll != null && !poll.isOnNext()) {
                        notification = poll;
                    }
                }
            }
        }
    }
}
