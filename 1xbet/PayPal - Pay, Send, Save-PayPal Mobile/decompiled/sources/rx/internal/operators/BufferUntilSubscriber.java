package rx.internal.operators;

/* loaded from: classes18.dex */
public final class BufferUntilSubscriber<T> extends rx.subjects.Subject<T, T> {
    static final rx.Observer getHighSpeedVideoFpsRanges = new rx.Observer() { // from class: rx.internal.operators.BufferUntilSubscriber.1
        @Override // rx.Observer
        public final void onCompleted() {
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
        }

        @Override // rx.Observer
        public final void onNext(java.lang.Object obj) {
        }
    };
    private boolean Camera2StreamConfigurationMap;
    final rx.internal.operators.BufferUntilSubscriber.State<T> getHighSpeedVideoFpsRangesFor;

    public static <T> rx.internal.operators.BufferUntilSubscriber<T> create() {
        return new rx.internal.operators.BufferUntilSubscriber<>(new rx.internal.operators.BufferUntilSubscriber.State());
    }

    static final class State<T> extends java.util.concurrent.atomic.AtomicReference<rx.Observer<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        boolean getHighSpeedVideoFpsRangesFor;
        final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentLinkedQueue<>();

        State() {
        }
    }

    static final class OnSubscribeAction<T> implements rx.Observable.OnSubscribe<T> {
        final rx.internal.operators.BufferUntilSubscriber.State<T> getHighSpeedVideoFpsRanges;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            boolean z;
            rx.Subscriber subscriber = (rx.Subscriber) obj;
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(null, subscriber)) {
                subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.BufferUntilSubscriber.OnSubscribeAction.1
                    @Override // rx.functions.Action0
                    public void call() {
                        rx.internal.operators.BufferUntilSubscriber.OnSubscribeAction.this.getHighSpeedVideoFpsRanges.set(rx.internal.operators.BufferUntilSubscriber.getHighSpeedVideoFpsRanges);
                    }
                }));
                synchronized (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor) {
                        z = false;
                    } else {
                        z = true;
                        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = true;
                    }
                }
                if (!z) {
                    return;
                }
                while (true) {
                    java.lang.Object poll = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.poll();
                    if (poll != null) {
                        rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoFpsRanges.get(), poll);
                    } else {
                        synchronized (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges) {
                            if (this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = false;
                                return;
                            }
                        }
                    }
                }
            } else {
                subscriber.onError(new java.lang.IllegalStateException("Only one subscriber allowed!"));
            }
        }

        public OnSubscribeAction(rx.internal.operators.BufferUntilSubscriber.State<T> state) {
            this.getHighSpeedVideoFpsRanges = state;
        }
    }

    private BufferUntilSubscriber(rx.internal.operators.BufferUntilSubscriber.State<T> state) {
        super(new rx.internal.operators.BufferUntilSubscriber.OnSubscribeAction(state));
        this.getHighSpeedVideoFpsRangesFor = state;
    }

    private void Camera2StreamConfigurationMap(java.lang.Object obj) {
        synchronized (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.add(obj);
            if (this.getHighSpeedVideoFpsRangesFor.get() != null && !this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor = true;
            }
        }
        if (!this.Camera2StreamConfigurationMap) {
            return;
        }
        while (true) {
            java.lang.Object poll = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.poll();
            if (poll == null) {
                return;
            } else {
                rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoFpsRangesFor.get(), poll);
            }
        }
    }

    @Override // rx.Observer
    public final void onCompleted() {
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.get().onCompleted();
        } else {
            Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.completed());
        }
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.get().onError(th);
        } else {
            Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.error(th));
        }
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.get().onNext(t);
        } else {
            Camera2StreamConfigurationMap(rx.internal.operators.NotificationLite.next(t));
        }
    }

    @Override // rx.subjects.Subject
    public final boolean hasObservers() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges) {
            z = this.getHighSpeedVideoFpsRangesFor.get() != null;
        }
        return z;
    }
}
