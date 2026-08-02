package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BlockingOperatorToIterator {
    private BlockingOperatorToIterator() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.util.Iterator<T> toIterator(rx.Observable<? extends T> observable) {
        rx.internal.operators.BlockingOperatorToIterator.SubscriberIterator subscriberIterator = new rx.internal.operators.BlockingOperatorToIterator.SubscriberIterator();
        observable.materialize().subscribe((rx.Subscriber<? super rx.Notification<? extends T>>) subscriberIterator);
        return subscriberIterator;
    }

    public static final class SubscriberIterator<T> extends rx.Subscriber<rx.Notification<? extends T>> implements java.util.Iterator<T> {
        static final int Camera2StreamConfigurationMap = (rx.internal.util.RxRingBuffer.SIZE * 3) / 4;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.BlockingQueue<rx.Notification<? extends T>> getHighSpeedVideoFpsRanges = new java.util.concurrent.LinkedBlockingQueue();
        private rx.Notification<? extends T> getHighSpeedVideoFpsRangesFor;

        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(rx.internal.util.RxRingBuffer.SIZE);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.offer(rx.Notification.createOnError(th));
        }

        @Override // rx.Observer
        public final void onNext(rx.Notification<? extends T> notification) {
            this.getHighSpeedVideoFpsRanges.offer(notification);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap();
                int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                if (i >= Camera2StreamConfigurationMap) {
                    request(i);
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor.isOnError()) {
                throw rx.exceptions.Exceptions.propagate(this.getHighSpeedVideoFpsRangesFor.getThrowable());
            }
            return !this.getHighSpeedVideoFpsRangesFor.isOnCompleted();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T value = this.getHighSpeedVideoFpsRangesFor.getValue();
                this.getHighSpeedVideoFpsRangesFor = null;
                return value;
            }
            throw new java.util.NoSuchElementException();
        }

        private rx.Notification<? extends T> Camera2StreamConfigurationMap() {
            try {
                rx.Notification<? extends T> poll = this.getHighSpeedVideoFpsRanges.poll();
                return poll != null ? poll : this.getHighSpeedVideoFpsRanges.take();
            } catch (java.lang.InterruptedException e) {
                unsubscribe();
                throw rx.exceptions.Exceptions.propagate(e);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator");
        }
    }
}
