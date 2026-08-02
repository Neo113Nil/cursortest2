package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorToObservableList<T> implements rx.Observable.Operator<java.util.List<T>, T> {

    static final class Holder {
        static final rx.internal.operators.OperatorToObservableList<java.lang.Object> getHighSpeedVideoSizes = new rx.internal.operators.OperatorToObservableList<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorToObservableList<T> instance() {
        return (rx.internal.operators.OperatorToObservableList<T>) rx.internal.operators.OperatorToObservableList.Holder.getHighSpeedVideoSizes;
    }

    OperatorToObservableList() {
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super java.util.List<T>> subscriber) {
        final rx.internal.producers.SingleDelayedProducer singleDelayedProducer = new rx.internal.producers.SingleDelayedProducer(subscriber);
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorToObservableList.1
            java.util.List<T> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedList();
            boolean getHighSpeedVideoFpsRangesFor;

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    singleDelayedProducer.setValue(arrayList);
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.add(t);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
