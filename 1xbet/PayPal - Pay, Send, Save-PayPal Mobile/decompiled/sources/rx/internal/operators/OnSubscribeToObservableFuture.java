package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeToObservableFuture {
    private OnSubscribeToObservableFuture() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static class ToObservableFuture<T> implements rx.Observable.OnSubscribe<T> {
        final java.util.concurrent.Future<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
        private final long getHighSpeedVideoSizes;

        @Override // rx.functions.Action1
        public /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OnSubscribeToObservableFuture.ToObservableFuture.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.operators.OnSubscribeToObservableFuture.ToObservableFuture.this.getHighResolutionOutputSizeshNQ4ISI.cancel(true);
                }
            }));
            try {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                java.util.concurrent.TimeUnit timeUnit = this.getHighSpeedVideoFpsRangesFor;
                subscriber.setProducer(new rx.internal.producers.SingleProducer(subscriber, timeUnit == null ? this.getHighResolutionOutputSizeshNQ4ISI.get() : this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoSizes, timeUnit)));
            } catch (java.lang.Throwable th) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                rx.exceptions.Exceptions.throwOrReport(th, subscriber);
            }
        }

        public ToObservableFuture(java.util.concurrent.Future<? extends T> future) {
            this.getHighResolutionOutputSizeshNQ4ISI = future;
            this.getHighSpeedVideoSizes = 0L;
            this.getHighSpeedVideoFpsRangesFor = null;
        }

        public ToObservableFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.getHighResolutionOutputSizeshNQ4ISI = future;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = timeUnit;
        }
    }

    public static <T> rx.Observable.OnSubscribe<T> toObservableFuture(java.util.concurrent.Future<? extends T> future) {
        return new rx.internal.operators.OnSubscribeToObservableFuture.ToObservableFuture(future);
    }

    public static <T> rx.Observable.OnSubscribe<T> toObservableFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        return new rx.internal.operators.OnSubscribeToObservableFuture.ToObservableFuture(future, j, timeUnit);
    }
}
