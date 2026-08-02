package rx.singles;

/* loaded from: classes18.dex */
public final class BlockingSingle<T> {
    private final rx.Single<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    private BlockingSingle(rx.Single<? extends T> single) {
        this.getHighResolutionOutputSizeshNQ4ISI = single;
    }

    public static <T> rx.singles.BlockingSingle<T> from(rx.Single<? extends T> single) {
        return new rx.singles.BlockingSingle<>(single);
    }

    public final T value() {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        rx.internal.util.BlockingUtils.awaitForComplete(countDownLatch, this.getHighResolutionOutputSizeshNQ4ISI.subscribe((rx.SingleSubscriber<? super java.lang.Object>) new rx.SingleSubscriber<T>() { // from class: rx.singles.BlockingSingle.1
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                atomicReference.set(t);
                countDownLatch.countDown();
            }

            @Override // rx.SingleSubscriber
            public void onError(java.lang.Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }
        }));
        java.lang.Throwable th = (java.lang.Throwable) atomicReference2.get();
        if (th != null) {
            throw rx.exceptions.Exceptions.propagate(th);
        }
        return (T) atomicReference.get();
    }

    public final java.util.concurrent.Future<T> toFuture() {
        return rx.internal.operators.BlockingOperatorToFuture.toFuture(this.getHighResolutionOutputSizeshNQ4ISI.toObservable());
    }
}
