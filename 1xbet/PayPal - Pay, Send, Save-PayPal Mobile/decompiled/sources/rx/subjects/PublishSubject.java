package rx.subjects;

/* loaded from: classes18.dex */
public final class PublishSubject<T> extends rx.subjects.Subject<T, T> {
    final rx.subjects.PublishSubject.PublishSubjectState<T> getHighSpeedVideoFpsRanges;

    public static <T> rx.subjects.PublishSubject<T> create() {
        return new rx.subjects.PublishSubject<>(new rx.subjects.PublishSubject.PublishSubjectState());
    }

    protected PublishSubject(rx.subjects.PublishSubject.PublishSubjectState<T> publishSubjectState) {
        super(publishSubjectState);
        this.getHighSpeedVideoFpsRanges = publishSubjectState;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        this.getHighSpeedVideoFpsRanges.onNext(t);
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges.onError(th);
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoFpsRanges.onCompleted();
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.get().length != 0;
    }

    public final boolean hasThrowable() {
        return this.getHighSpeedVideoFpsRanges.get() == rx.subjects.PublishSubject.PublishSubjectState.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap != null;
    }

    public final boolean hasCompleted() {
        return this.getHighSpeedVideoFpsRanges.get() == rx.subjects.PublishSubject.PublishSubjectState.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap == null;
    }

    public final java.lang.Throwable getThrowable() {
        if (this.getHighSpeedVideoFpsRanges.get() == rx.subjects.PublishSubject.PublishSubjectState.getHighSpeedVideoFpsRanges) {
            return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
        }
        return null;
    }

    static final class PublishSubjectState<T> extends java.util.concurrent.atomic.AtomicReference<rx.subjects.PublishSubject.PublishSubjectProducer<T>[]> implements rx.Observable.OnSubscribe<T>, rx.Observer<T> {
        private static final long serialVersionUID = -7568940796666027140L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        static final rx.subjects.PublishSubject.PublishSubjectProducer[] getHighSpeedVideoFpsRangesFor = new rx.subjects.PublishSubject.PublishSubjectProducer[0];
        static final rx.subjects.PublishSubject.PublishSubjectProducer[] getHighSpeedVideoFpsRanges = new rx.subjects.PublishSubject.PublishSubjectProducer[0];

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.subjects.PublishSubject.PublishSubjectProducer<T>[] publishSubjectProducerArr;
            rx.subjects.PublishSubject.PublishSubjectProducer[] publishSubjectProducerArr2;
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            rx.subjects.PublishSubject.PublishSubjectProducer<T> publishSubjectProducer = new rx.subjects.PublishSubject.PublishSubjectProducer<>(this, subscriber);
            subscriber.add(publishSubjectProducer);
            subscriber.setProducer(publishSubjectProducer);
            do {
                publishSubjectProducerArr = get();
                if (publishSubjectProducerArr == getHighSpeedVideoFpsRanges) {
                    java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onCompleted();
                        return;
                    }
                }
                int length = publishSubjectProducerArr.length;
                publishSubjectProducerArr2 = new rx.subjects.PublishSubject.PublishSubjectProducer[length + 1];
                java.lang.System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr2, 0, length);
                publishSubjectProducerArr2[length] = publishSubjectProducer;
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
            if (publishSubjectProducer.isUnsubscribed()) {
                Camera2StreamConfigurationMap(publishSubjectProducer);
            }
        }

        public PublishSubjectState() {
            lazySet(getHighSpeedVideoFpsRangesFor);
        }

        final void Camera2StreamConfigurationMap(rx.subjects.PublishSubject.PublishSubjectProducer<T> publishSubjectProducer) {
            rx.subjects.PublishSubject.PublishSubjectProducer<T>[] publishSubjectProducerArr;
            rx.subjects.PublishSubject.PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = get();
                if (publishSubjectProducerArr == getHighSpeedVideoFpsRanges || publishSubjectProducerArr == getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                int length = publishSubjectProducerArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (publishSubjectProducerArr[i] == publishSubjectProducer) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    publishSubjectProducerArr2 = getHighSpeedVideoFpsRangesFor;
                } else {
                    rx.subjects.PublishSubject.PublishSubjectProducer[] publishSubjectProducerArr3 = new rx.subjects.PublishSubject.PublishSubjectProducer[length - 1];
                    java.lang.System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr3, 0, i);
                    java.lang.System.arraycopy(publishSubjectProducerArr, i + 1, publishSubjectProducerArr3, i, (length - i) - 1);
                    publishSubjectProducerArr2 = publishSubjectProducerArr3;
                }
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            for (rx.subjects.PublishSubject.PublishSubjectProducer<T> publishSubjectProducer : get()) {
                publishSubjectProducer.onNext(t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            java.util.ArrayList arrayList = null;
            for (rx.subjects.PublishSubject.PublishSubjectProducer<T> publishSubjectProducer : getAndSet(getHighSpeedVideoFpsRanges)) {
                try {
                    publishSubjectProducer.onError(th);
                } catch (java.lang.Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            rx.exceptions.Exceptions.throwIfAny(arrayList);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            for (rx.subjects.PublishSubject.PublishSubjectProducer<T> publishSubjectProducer : getAndSet(getHighSpeedVideoFpsRanges)) {
                publishSubjectProducer.onCompleted();
            }
        }
    }

    static final class PublishSubjectProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription, rx.Observer<T> {
        private static final long serialVersionUID = 6451806817170721536L;
        long getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final rx.subjects.PublishSubject.PublishSubjectState<T> getHighSpeedVideoSizes;

        public PublishSubjectProducer(rx.subjects.PublishSubject.PublishSubjectState<T> publishSubjectState, rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = publishSubjectState;
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            long j2;
            if (rx.internal.operators.BackpressureUtils.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, rx.internal.operators.BackpressureUtils.addCap(j2, j)));
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (j != j2) {
                    this.getHighResolutionOutputSizeshNQ4ISI = j2 + 1;
                    this.getHighSpeedVideoFpsRangesFor.onNext(t);
                } else {
                    unsubscribe();
                    this.getHighSpeedVideoFpsRangesFor.onError(new rx.exceptions.MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.getHighSpeedVideoFpsRangesFor.onCompleted();
            }
        }
    }
}
