package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorSkipLast<T> implements rx.Observable.Operator<T, T> {
    final int getHighResolutionOutputSizeshNQ4ISI;

    public OperatorSkipLast(int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("count could not be negative");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLast.1
            private final java.util.Deque<java.lang.Object> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque();

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public void onNext(T t) {
                if (rx.internal.operators.OperatorSkipLast.this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                    subscriber.onNext(t);
                    return;
                }
                if (this.getHighSpeedVideoFpsRangesFor.size() == rx.internal.operators.OperatorSkipLast.this.getHighResolutionOutputSizeshNQ4ISI) {
                    subscriber.onNext(rx.internal.operators.NotificationLite.getValue(this.getHighSpeedVideoFpsRangesFor.removeFirst()));
                } else {
                    request(1L);
                }
                this.getHighSpeedVideoFpsRangesFor.offerLast(rx.internal.operators.NotificationLite.next(t));
            }
        };
    }
}
