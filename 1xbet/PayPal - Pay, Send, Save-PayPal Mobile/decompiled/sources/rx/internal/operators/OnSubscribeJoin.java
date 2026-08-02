package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeJoin<TLeft, TRight, TLeftDuration, TRightDuration, R> implements rx.Observable.OnSubscribe<R> {
    final rx.functions.Func2<TLeft, TRight, R> Camera2StreamConfigurationMap;
    final rx.functions.Func1<TLeft, rx.Observable<TLeftDuration>> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<TRight, rx.Observable<TRightDuration>> getHighSpeedVideoFpsRanges;
    final rx.Observable<TRight> getHighSpeedVideoFpsRangesFor;
    final rx.Observable<TLeft> getHighSpeedVideoSizes;

    public OnSubscribeJoin(rx.Observable<TLeft> observable, rx.Observable<TRight> observable2, rx.functions.Func1<TLeft, rx.Observable<TLeftDuration>> func1, rx.functions.Func1<TRight, rx.Observable<TRightDuration>> func12, rx.functions.Func2<TLeft, TRight, R> func2) {
        this.getHighSpeedVideoSizes = observable;
        this.getHighSpeedVideoFpsRangesFor = observable2;
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
        this.getHighSpeedVideoFpsRanges = func12;
        this.Camera2StreamConfigurationMap = func2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        rx.internal.operators.OnSubscribeJoin.ResultSink resultSink = new rx.internal.operators.OnSubscribeJoin.ResultSink(new rx.observers.SerializedSubscriber(subscriber));
        resultSink.getHighSpeedVideoSizesFor.add(resultSink.getHighSpeedVideoSizes);
        rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber leftSubscriber = resultSink.new LeftSubscriber();
        rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber rightSubscriber = resultSink.new RightSubscriber();
        resultSink.getHighSpeedVideoSizes.add(leftSubscriber);
        resultSink.getHighSpeedVideoSizes.add(rightSubscriber);
        rx.internal.operators.OnSubscribeJoin.this.getHighSpeedVideoSizes.unsafeSubscribe(leftSubscriber);
        rx.internal.operators.OnSubscribeJoin.this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(rightSubscriber);
    }

    final class ResultSink extends java.util.HashMap<java.lang.Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;
        boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super R> getHighSpeedVideoSizesFor;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoSizes = new rx.subscriptions.CompositeSubscription();
        final java.util.Map<java.lang.Integer, TRight> getOutputFormats = new java.util.HashMap();

        public ResultSink(rx.Subscriber<? super R> subscriber) {
            this.getHighSpeedVideoSizesFor = subscriber;
        }

        final class LeftSubscriber extends rx.Subscriber<TLeft> {
            LeftSubscriber() {
            }

            @Override // rx.Observer
            public final void onNext(TLeft tleft) {
                int i;
                int i2;
                synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink resultSink = rx.internal.operators.OnSubscribeJoin.ResultSink.this;
                    i = resultSink.getHighResolutionOutputSizeshNQ4ISI;
                    resultSink.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.put(java.lang.Integer.valueOf(i), tleft);
                    i2 = rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoFpsRangesFor;
                }
                try {
                    rx.Observable<TLeftDuration> call = rx.internal.operators.OnSubscribeJoin.this.getHighResolutionOutputSizeshNQ4ISI.call(tleft);
                    rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber.LeftDurationSubscriber leftDurationSubscriber = new rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber.LeftDurationSubscriber(i);
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.add(leftDurationSubscriber);
                    call.unsafeSubscribe(leftDurationSubscriber);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                        for (java.util.Map.Entry<java.lang.Integer, TRight> entry : rx.internal.operators.OnSubscribeJoin.ResultSink.this.getOutputFormats.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onNext(rx.internal.operators.OnSubscribeJoin.this.Camera2StreamConfigurationMap.call(tleft, it.next()));
                    }
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onError(th);
                rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
            }

            @Override // rx.Observer
            public final void onCompleted() {
                boolean z;
                synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                    z = true;
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoFpsRanges = true;
                    if (!rx.internal.operators.OnSubscribeJoin.ResultSink.this.Camera2StreamConfigurationMap) {
                        if (!rx.internal.operators.OnSubscribeJoin.ResultSink.this.isEmpty()) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onCompleted();
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
                } else {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.remove(this);
                }
            }

            final class LeftDurationSubscriber extends rx.Subscriber<TLeftDuration> {
                boolean Camera2StreamConfigurationMap = true;
                final int getHighSpeedVideoFpsRangesFor;

                public LeftDurationSubscriber(int i) {
                    this.getHighSpeedVideoFpsRangesFor = i;
                }

                @Override // rx.Observer
                public final void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }

                @Override // rx.Observer
                public final void onError(java.lang.Throwable th) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber.this.onError(th);
                }

                @Override // rx.Observer
                public final void onCompleted() {
                    if (this.Camera2StreamConfigurationMap) {
                        boolean z = false;
                        this.Camera2StreamConfigurationMap = false;
                        rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber leftSubscriber = rx.internal.operators.OnSubscribeJoin.ResultSink.LeftSubscriber.this;
                        int i = this.getHighSpeedVideoFpsRangesFor;
                        synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                            if (rx.internal.operators.OnSubscribeJoin.ResultSink.this.remove(java.lang.Integer.valueOf(i)) != null && rx.internal.operators.OnSubscribeJoin.ResultSink.this.isEmpty()) {
                                if (rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoFpsRanges) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onCompleted();
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
                        } else {
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.remove(this);
                        }
                    }
                }
            }
        }

        final class RightSubscriber extends rx.Subscriber<TRight> {
            RightSubscriber() {
            }

            @Override // rx.Observer
            public final void onNext(TRight tright) {
                int i;
                int i2;
                synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink resultSink = rx.internal.operators.OnSubscribeJoin.ResultSink.this;
                    i = resultSink.getHighSpeedVideoFpsRangesFor;
                    resultSink.getHighSpeedVideoFpsRangesFor = i + 1;
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getOutputFormats.put(java.lang.Integer.valueOf(i), tright);
                    i2 = rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighResolutionOutputSizeshNQ4ISI;
                }
                rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.add(new rx.subscriptions.SerialSubscription());
                try {
                    rx.Observable<TRightDuration> call = rx.internal.operators.OnSubscribeJoin.this.getHighSpeedVideoFpsRanges.call(tright);
                    rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber.RightDurationSubscriber rightDurationSubscriber = new rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber.RightDurationSubscriber(i);
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.add(rightDurationSubscriber);
                    call.unsafeSubscribe(rightDurationSubscriber);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                        for (java.util.Map.Entry<java.lang.Integer, TLeft> entry : rx.internal.operators.OnSubscribeJoin.ResultSink.this.entrySet()) {
                            if (entry.getKey().intValue() < i2) {
                                arrayList.add(entry.getValue());
                            }
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onNext(rx.internal.operators.OnSubscribeJoin.this.Camera2StreamConfigurationMap.call(it.next(), tright));
                    }
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }

            @Override // rx.Observer
            public final void onError(java.lang.Throwable th) {
                rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onError(th);
                rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
            }

            @Override // rx.Observer
            public final void onCompleted() {
                boolean z;
                synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                    z = true;
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.Camera2StreamConfigurationMap = true;
                    if (!rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoFpsRanges) {
                        if (!rx.internal.operators.OnSubscribeJoin.ResultSink.this.getOutputFormats.isEmpty()) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onCompleted();
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
                } else {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.remove(this);
                }
            }

            final class RightDurationSubscriber extends rx.Subscriber<TRightDuration> {
                boolean getHighSpeedVideoFpsRanges = true;
                final int getHighSpeedVideoSizes;

                public RightDurationSubscriber(int i) {
                    this.getHighSpeedVideoSizes = i;
                }

                @Override // rx.Observer
                public final void onNext(TRightDuration trightduration) {
                    onCompleted();
                }

                @Override // rx.Observer
                public final void onError(java.lang.Throwable th) {
                    rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber.this.onError(th);
                }

                @Override // rx.Observer
                public final void onCompleted() {
                    if (this.getHighSpeedVideoFpsRanges) {
                        boolean z = false;
                        this.getHighSpeedVideoFpsRanges = false;
                        rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber rightSubscriber = rx.internal.operators.OnSubscribeJoin.ResultSink.RightSubscriber.this;
                        int i = this.getHighSpeedVideoSizes;
                        synchronized (rx.internal.operators.OnSubscribeJoin.ResultSink.this) {
                            if (rx.internal.operators.OnSubscribeJoin.ResultSink.this.getOutputFormats.remove(java.lang.Integer.valueOf(i)) != null && rx.internal.operators.OnSubscribeJoin.ResultSink.this.getOutputFormats.isEmpty()) {
                                if (rx.internal.operators.OnSubscribeJoin.ResultSink.this.Camera2StreamConfigurationMap) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.onCompleted();
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizesFor.unsubscribe();
                        } else {
                            rx.internal.operators.OnSubscribeJoin.ResultSink.this.getHighSpeedVideoSizes.remove(this);
                        }
                    }
                }
            }
        }
    }
}
