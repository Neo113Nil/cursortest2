package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BlockingOperatorLatest {
    private BlockingOperatorLatest() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.lang.Iterable<T> latest(final rx.Observable<? extends T> observable) {
        return new java.lang.Iterable<T>() { // from class: rx.internal.operators.BlockingOperatorLatest.1
            @Override // java.lang.Iterable
            public final java.util.Iterator<T> iterator() {
                rx.internal.operators.BlockingOperatorLatest.LatestObserverIterator latestObserverIterator = new rx.internal.operators.BlockingOperatorLatest.LatestObserverIterator();
                rx.Observable.this.materialize().subscribe((rx.Subscriber<? super rx.Notification<T>>) latestObserverIterator);
                return latestObserverIterator;
            }
        };
    }

    static final class LatestObserverIterator<T> extends rx.Subscriber<rx.Notification<? extends T>> implements java.util.Iterator<T> {
        final java.util.concurrent.Semaphore Camera2StreamConfigurationMap = new java.util.concurrent.Semaphore(0);
        final java.util.concurrent.atomic.AtomicReference<rx.Notification<? extends T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        rx.Notification<? extends T> getHighSpeedVideoFpsRangesFor;

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
        }

        LatestObserverIterator() {
        }

        @Override // rx.Observer
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet((rx.Notification) obj) == null) {
                this.Camera2StreamConfigurationMap.release();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            rx.Notification<? extends T> notification = this.getHighSpeedVideoFpsRangesFor;
            if (notification != null && notification.isOnError()) {
                throw rx.exceptions.Exceptions.propagate(this.getHighSpeedVideoFpsRangesFor.getThrowable());
            }
            rx.Notification<? extends T> notification2 = this.getHighSpeedVideoFpsRangesFor;
            if ((notification2 == null || !notification2.isOnCompleted()) && this.getHighSpeedVideoFpsRangesFor == null) {
                try {
                    this.Camera2StreamConfigurationMap.acquire();
                    rx.Notification<? extends T> andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(null);
                    this.getHighSpeedVideoFpsRangesFor = andSet;
                    if (andSet.isOnError()) {
                        throw rx.exceptions.Exceptions.propagate(this.getHighSpeedVideoFpsRangesFor.getThrowable());
                    }
                } catch (java.lang.InterruptedException e) {
                    unsubscribe();
                    java.lang.Thread.currentThread().interrupt();
                    this.getHighSpeedVideoFpsRangesFor = rx.Notification.createOnError(e);
                    throw rx.exceptions.Exceptions.propagate(e);
                }
            }
            return !this.getHighSpeedVideoFpsRangesFor.isOnCompleted();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext() && this.getHighSpeedVideoFpsRangesFor.isOnNext()) {
                T value = this.getHighSpeedVideoFpsRangesFor.getValue();
                this.getHighSpeedVideoFpsRangesFor = null;
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
