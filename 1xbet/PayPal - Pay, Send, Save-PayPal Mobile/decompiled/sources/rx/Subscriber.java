package rx;

/* loaded from: classes18.dex */
public abstract class Subscriber<T> implements rx.Observer<T>, rx.Subscription {
    private rx.Producer Camera2StreamConfigurationMap;
    private final rx.internal.util.SubscriptionList getHighResolutionOutputSizeshNQ4ISI;
    private final rx.Subscriber<?> getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoSizes;

    public void onStart() {
    }

    public Subscriber() {
        this(null, false);
    }

    public Subscriber(rx.Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    public Subscriber(rx.Subscriber<?> subscriber, boolean z) {
        this.getHighSpeedVideoSizes = Long.MIN_VALUE;
        this.getHighSpeedVideoFpsRanges = subscriber;
        this.getHighResolutionOutputSizeshNQ4ISI = (!z || subscriber == null) ? new rx.internal.util.SubscriptionList() : subscriber.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void add(rx.Subscription subscription) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(subscription);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighResolutionOutputSizeshNQ4ISI.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed();
    }

    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("number requested cannot be negative: ".concat(java.lang.String.valueOf(j)));
        }
        synchronized (this) {
            rx.Producer producer = this.Camera2StreamConfigurationMap;
            if (producer != null) {
                producer.request(j);
                return;
            }
            long j2 = this.getHighSpeedVideoSizes;
            if (j2 == Long.MIN_VALUE) {
                this.getHighSpeedVideoSizes = j;
            } else {
                long j3 = j2 + j;
                if (j3 < 0) {
                    this.getHighSpeedVideoSizes = Long.MAX_VALUE;
                } else {
                    this.getHighSpeedVideoSizes = j3;
                }
            }
        }
    }

    public void setProducer(rx.Producer producer) {
        long j;
        rx.Subscriber<?> subscriber;
        boolean z;
        synchronized (this) {
            j = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = producer;
            subscriber = this.getHighSpeedVideoFpsRanges;
            z = subscriber != null && j == Long.MIN_VALUE;
        }
        if (z) {
            subscriber.setProducer(producer);
        } else if (j == Long.MIN_VALUE) {
            producer.request(Long.MAX_VALUE);
        } else {
            producer.request(j);
        }
    }
}
