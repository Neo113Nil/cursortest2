package rx.internal.producers;

/* loaded from: classes18.dex */
public final class ProducerObserverArbiter<T> implements rx.Producer, rx.Observer<T> {
    static final rx.Producer getHighSpeedVideoFpsRangesFor = new rx.Producer() { // from class: rx.internal.producers.ProducerObserverArbiter.1
        @Override // rx.Producer
        public final void request(long j) {
        }
    };
    volatile boolean Camera2StreamConfigurationMap;
    rx.Producer getHighResolutionOutputSizeshNQ4ISI;
    final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    long getInputFormats;
    rx.Producer getInputSizeshNQ4ISI;
    java.util.List<T> getOutputFormats;
    long getOutputMinFrameDuration;

    public ProducerObserverArbiter(rx.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRanges = subscriber;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                java.util.List list = this.getOutputFormats;
                if (list == null) {
                    list = new java.util.ArrayList(4);
                    this.getOutputFormats = list;
                }
                list.add(t);
                return;
            }
            this.getHighSpeedVideoSizes = true;
            try {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                long j = this.getOutputMinFrameDuration;
                if (j != Long.MAX_VALUE) {
                    this.getOutputMinFrameDuration = j - 1;
                }
                Camera2StreamConfigurationMap();
            } catch (java.lang.Throwable th) {
                synchronized (this) {
                    this.getHighSpeedVideoSizes = false;
                    throw th;
                }
            }
        }
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        boolean z;
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizesFor = th;
                z = false;
            } else {
                this.getHighSpeedVideoSizes = true;
                z = true;
            }
        }
        if (z) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        } else {
            this.Camera2StreamConfigurationMap = true;
        }
    }

    @Override // rx.Observer
    public final void onCompleted() {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizesFor = java.lang.Boolean.TRUE;
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRanges.onCompleted();
            }
        }
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j != 0) {
            synchronized (this) {
                if (this.getHighSpeedVideoSizes) {
                    this.getInputFormats += j;
                    return;
                }
                this.getHighSpeedVideoSizes = true;
                rx.Producer producer = this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    long j2 = this.getOutputMinFrameDuration + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.getOutputMinFrameDuration = j2;
                    Camera2StreamConfigurationMap();
                    if (producer != null) {
                        producer.request(j);
                    }
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                        this.getHighSpeedVideoSizes = false;
                        throw th;
                    }
                }
            }
        }
    }

    public final void setProducer(rx.Producer producer) {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                if (producer == null) {
                    producer = getHighSpeedVideoFpsRangesFor;
                }
                this.getInputSizeshNQ4ISI = producer;
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI = producer;
            long j = this.getOutputMinFrameDuration;
            try {
                Camera2StreamConfigurationMap();
                if (producer == null || j == 0) {
                    return;
                }
                producer.request(j);
            } catch (java.lang.Throwable th) {
                synchronized (this) {
                    this.getHighSpeedVideoSizes = false;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0009, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap() {
        long j;
        rx.Producer producer;
        java.lang.Object obj;
        java.util.List<T> list;
        boolean z;
        boolean z2;
        long j2;
        rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
        rx.Producer producer2 = null;
        long j3 = 0;
        while (true) {
            synchronized (this) {
                j = this.getInputFormats;
                producer = this.getInputSizeshNQ4ISI;
                obj = this.getHighSpeedVideoSizesFor;
                list = this.getOutputFormats;
                z = true;
                if (j == 0 && producer == null && list == null && obj == null) {
                    this.getHighSpeedVideoSizes = false;
                    z2 = true;
                } else {
                    this.getInputFormats = 0L;
                    this.getInputSizeshNQ4ISI = null;
                    this.getOutputFormats = null;
                    this.getHighSpeedVideoSizesFor = null;
                    z2 = false;
                }
            }
            if (z2) {
                if (j3 == 0 || producer2 == null) {
                    return;
                }
                producer2.request(j3);
                return;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (obj != null) {
                if (obj != java.lang.Boolean.TRUE) {
                    subscriber.onError((java.lang.Throwable) obj);
                    return;
                } else if (z) {
                    subscriber.onCompleted();
                    return;
                }
            }
            if (list != null) {
                for (T t : list) {
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    if (!this.Camera2StreamConfigurationMap) {
                        try {
                            subscriber.onNext(t);
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                            return;
                        }
                    }
                }
                j2 = list.size();
            } else {
                j2 = 0;
            }
            long j4 = this.getOutputMinFrameDuration;
            if (j4 != Long.MAX_VALUE) {
                if (j != 0) {
                    j4 += j;
                    if (j4 < 0) {
                        j4 = Long.MAX_VALUE;
                    }
                }
                if (j2 != 0 && j4 != Long.MAX_VALUE) {
                    j4 -= j2;
                    if (j4 < 0) {
                        throw new java.lang.IllegalStateException("More produced than requested");
                    }
                }
                this.getOutputMinFrameDuration = j4;
            }
            if (producer != null) {
                if (producer == getHighSpeedVideoFpsRangesFor) {
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = producer;
                    if (j4 != 0) {
                        j3 = rx.internal.operators.BackpressureUtils.addCap(j3, j4);
                        producer2 = producer;
                    }
                }
            } else {
                producer = this.getHighResolutionOutputSizeshNQ4ISI;
                if (producer != null && j != 0) {
                    j3 = rx.internal.operators.BackpressureUtils.addCap(j3, j);
                    producer2 = producer;
                }
            }
        }
    }
}
