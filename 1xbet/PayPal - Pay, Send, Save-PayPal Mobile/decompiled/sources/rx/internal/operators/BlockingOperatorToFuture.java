package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BlockingOperatorToFuture {
    private BlockingOperatorToFuture() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> java.util.concurrent.Future<T> toFuture(rx.Observable<? extends T> observable) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        final rx.Subscription subscribe = observable.single().subscribe((rx.Subscriber<? super java.lang.Object>) new rx.Subscriber<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.1
            @Override // rx.Observer
            public final void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, null, th);
                countDownLatch.countDown();
            }

            @Override // rx.Observer
            public final void onNext(T t) {
                atomicReference.set(t);
            }
        });
        return new java.util.concurrent.Future<T>() { // from class: rx.internal.operators.BlockingOperatorToFuture.2
            private volatile boolean getHighSpeedVideoSizes;

            @Override // java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                if (countDownLatch.getCount() <= 0) {
                    return false;
                }
                this.getHighSpeedVideoSizes = true;
                subscribe.unsubscribe();
                countDownLatch.countDown();
                return true;
            }

            @Override // java.util.concurrent.Future
            public final boolean isCancelled() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // java.util.concurrent.Future
            public final boolean isDone() {
                return countDownLatch.getCount() == 0;
            }

            @Override // java.util.concurrent.Future
            public final T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
                countDownLatch.await();
                return getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // java.util.concurrent.Future
            public final T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
                if (countDownLatch.await(j, timeUnit)) {
                    return getHighResolutionOutputSizeshNQ4ISI();
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed out after ");
                sb.append(timeUnit.toMillis(j));
                sb.append("ms waiting for underlying Observable.");
                throw new java.util.concurrent.TimeoutException(sb.toString());
            }

            private T getHighResolutionOutputSizeshNQ4ISI() throws java.util.concurrent.ExecutionException {
                java.lang.Throwable th = (java.lang.Throwable) atomicReference2.get();
                if (th != null) {
                    throw new java.util.concurrent.ExecutionException("Observable onError", th);
                }
                if (this.getHighSpeedVideoSizes) {
                    throw new java.util.concurrent.CancellationException("Subscription unsubscribed");
                }
                return (T) atomicReference.get();
            }
        };
    }
}
