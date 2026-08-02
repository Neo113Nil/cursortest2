package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorToObservableSortedList<T> implements rx.Observable.Operator<java.util.List<T>, T> {
    private static final java.util.Comparator getHighSpeedVideoFpsRanges = new rx.internal.operators.OperatorToObservableSortedList.DefaultComparableFunction();
    final java.util.Comparator<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoSizes;

    public OperatorToObservableSortedList(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = i;
    }

    public OperatorToObservableSortedList(final rx.functions.Func2<? super T, ? super T, java.lang.Integer> func2, int i) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Comparator<T>() { // from class: rx.internal.operators.OperatorToObservableSortedList.1
            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return ((java.lang.Integer) func2.call(t, t2)).intValue();
            }
        };
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super java.util.List<T>> subscriber) {
        final rx.internal.producers.SingleDelayedProducer singleDelayedProducer = new rx.internal.producers.SingleDelayedProducer(subscriber);
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorToObservableSortedList.2
            boolean Camera2StreamConfigurationMap;
            java.util.List<T> getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(rx.internal.operators.OperatorToObservableSortedList.this.getHighSpeedVideoSizes);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                java.util.List<T> list = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = null;
                try {
                    java.util.Collections.sort(list, rx.internal.operators.OperatorToObservableSortedList.this.getHighResolutionOutputSizeshNQ4ISI);
                    singleDelayedProducer.setValue(list);
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
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor.add(t);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }

    static final class DefaultComparableFunction implements java.util.Comparator<java.lang.Object> {
        DefaultComparableFunction() {
        }

        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return ((java.lang.Comparable) obj).compareTo((java.lang.Comparable) obj2);
        }
    }
}
