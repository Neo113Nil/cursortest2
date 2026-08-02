package rx.internal.producers;

/* loaded from: classes18.dex */
public final class ProducerArbiter implements rx.Producer {
    static final rx.Producer getHighSpeedVideoFpsRanges = new rx.Producer() { // from class: rx.internal.producers.ProducerArbiter.1
        @Override // rx.Producer
        public final void request(long j) {
        }
    };
    boolean Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    rx.Producer getHighSpeedVideoFpsRangesFor;
    rx.Producer getHighSpeedVideoSizes;
    long getInputFormats;
    long getOutputMinFrameDuration;

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap) {
                this.getOutputMinFrameDuration += j;
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            try {
                long j2 = this.getInputFormats + j;
                if (j2 < 0) {
                    j2 = Long.MAX_VALUE;
                }
                this.getInputFormats = j2;
                rx.Producer producer = this.getHighSpeedVideoFpsRangesFor;
                if (producer != null) {
                    producer.request(j);
                }
                emitLoop();
            } catch (java.lang.Throwable th) {
                synchronized (this) {
                    this.Camera2StreamConfigurationMap = false;
                    throw th;
                }
            }
        }
    }

    public final void produced(long j) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI += j;
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            try {
                long j2 = this.getInputFormats;
                if (j2 != Long.MAX_VALUE) {
                    long j3 = j2 - j;
                    if (j3 < 0) {
                        throw new java.lang.IllegalStateException("more items arrived than were requested");
                    }
                    this.getInputFormats = j3;
                }
                emitLoop();
            } catch (java.lang.Throwable th) {
                synchronized (this) {
                    this.Camera2StreamConfigurationMap = false;
                    throw th;
                }
            }
        }
    }

    public final void setProducer(rx.Producer producer) {
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap) {
                if (producer == null) {
                    producer = getHighSpeedVideoFpsRanges;
                }
                this.getHighSpeedVideoSizes = producer;
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            try {
                this.getHighSpeedVideoFpsRangesFor = producer;
                if (producer != null) {
                    producer.request(this.getInputFormats);
                }
                emitLoop();
            } catch (java.lang.Throwable th) {
                synchronized (this) {
                    this.Camera2StreamConfigurationMap = false;
                    throw th;
                }
            }
        }
    }

    public final void emitLoop() {
        while (true) {
            synchronized (this) {
                long j = this.getOutputMinFrameDuration;
                long j2 = this.getHighResolutionOutputSizeshNQ4ISI;
                rx.Producer producer = this.getHighSpeedVideoSizes;
                if (j == 0 && j2 == 0 && producer == null) {
                    this.Camera2StreamConfigurationMap = false;
                    return;
                }
                this.getOutputMinFrameDuration = 0L;
                this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                this.getHighSpeedVideoSizes = null;
                long j3 = this.getInputFormats;
                if (j3 != Long.MAX_VALUE) {
                    long j4 = j3 + j;
                    if (j4 < 0 || j4 == Long.MAX_VALUE) {
                        this.getInputFormats = Long.MAX_VALUE;
                        j3 = Long.MAX_VALUE;
                    } else {
                        j3 = j4 - j2;
                        if (j3 < 0) {
                            throw new java.lang.IllegalStateException("more produced than requested");
                        }
                        this.getInputFormats = j3;
                    }
                }
                if (producer != null) {
                    if (producer == getHighSpeedVideoFpsRanges) {
                        this.getHighSpeedVideoFpsRangesFor = null;
                    } else {
                        this.getHighSpeedVideoFpsRangesFor = producer;
                        producer.request(j3);
                    }
                } else {
                    rx.Producer producer2 = this.getHighSpeedVideoFpsRangesFor;
                    if (producer2 != null && j != 0) {
                        producer2.request(j);
                    }
                }
            }
        }
    }
}
