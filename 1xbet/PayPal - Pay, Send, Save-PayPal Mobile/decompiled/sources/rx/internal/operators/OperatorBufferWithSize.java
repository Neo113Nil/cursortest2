package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorBufferWithSize<T> implements rx.Observable.Operator<java.util.List<T>, T> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("count must be greater than 0");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("skip must be greater than 0");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super java.util.List<T>> subscriber) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == i2) {
            final rx.internal.operators.OperatorBufferWithSize.BufferExact bufferExact = new rx.internal.operators.OperatorBufferWithSize.BufferExact(subscriber, i2);
            subscriber.add(bufferExact);
            subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorBufferWithSize.BufferExact.1
                @Override // rx.Producer
                public void request(long j) {
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
                    }
                    if (j != 0) {
                        rx.internal.operators.OperatorBufferWithSize.BufferExact.this.request(rx.internal.operators.BackpressureUtils.multiplyCap(j, rx.internal.operators.OperatorBufferWithSize.BufferExact.this.Camera2StreamConfigurationMap));
                    }
                }
            });
            return bufferExact;
        }
        if (i > i2) {
            rx.internal.operators.OperatorBufferWithSize.BufferSkip bufferSkip = new rx.internal.operators.OperatorBufferWithSize.BufferSkip(subscriber, i2, i);
            subscriber.add(bufferSkip);
            subscriber.setProducer(new rx.internal.operators.OperatorBufferWithSize.BufferSkip.BufferSkipProducer());
            return bufferSkip;
        }
        rx.internal.operators.OperatorBufferWithSize.BufferOverlap bufferOverlap = new rx.internal.operators.OperatorBufferWithSize.BufferOverlap(subscriber, i2, i);
        subscriber.add(bufferOverlap);
        subscriber.setProducer(new rx.internal.operators.OperatorBufferWithSize.BufferOverlap.BufferOverlapProducer());
        return bufferOverlap;
    }

    static final class BufferExact<T> extends rx.Subscriber<T> {
        final int Camera2StreamConfigurationMap;
        java.util.List<T> getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoSizes;

        public BufferExact(rx.Subscriber<? super java.util.List<T>> subscriber, int i) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = i;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            java.util.List list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list == null) {
                list = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
                this.getHighResolutionOutputSizeshNQ4ISI = list;
            }
            list.add(t);
            if (list.size() == this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoSizes.onNext(list);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            java.util.List<T> list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list != null) {
                this.getHighSpeedVideoSizes.onNext(list);
            }
            this.getHighSpeedVideoSizes.onCompleted();
        }
    }

    static final class BufferSkip<T> extends rx.Subscriber<T> {
        java.util.List<T> Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        public BufferSkip(rx.Subscriber<? super java.util.List<T>> subscriber, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoSizes;
            java.util.List list = this.Camera2StreamConfigurationMap;
            if (j == 0) {
                list = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                this.Camera2StreamConfigurationMap = list;
            }
            long j2 = j + 1;
            if (j2 == this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizes = 0L;
            } else {
                this.getHighSpeedVideoSizes = j2;
            }
            if (list != null) {
                list.add(t);
                if (list.size() == this.getHighSpeedVideoFpsRangesFor) {
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighSpeedVideoFpsRanges.onNext(list);
                }
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            java.util.List<T> list = this.Camera2StreamConfigurationMap;
            if (list != null) {
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges.onNext(list);
            }
            this.getHighSpeedVideoFpsRanges.onCompleted();
        }

        final class BufferSkipProducer extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
            private static final long serialVersionUID = 3428177408082367154L;

            BufferSkipProducer() {
            }

            @Override // rx.Producer
            public final void request(long j) {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
                if (j != 0) {
                    rx.internal.operators.OperatorBufferWithSize.BufferSkip bufferSkip = rx.internal.operators.OperatorBufferWithSize.BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.request(rx.internal.operators.BackpressureUtils.multiplyCap(j, bufferSkip.getHighResolutionOutputSizeshNQ4ISI));
                    } else {
                        bufferSkip.request(rx.internal.operators.BackpressureUtils.addCap(rx.internal.operators.BackpressureUtils.multiplyCap(j, bufferSkip.getHighSpeedVideoFpsRangesFor), rx.internal.operators.BackpressureUtils.multiplyCap(bufferSkip.getHighResolutionOutputSizeshNQ4ISI - bufferSkip.getHighSpeedVideoFpsRangesFor, j - 1)));
                    }
                }
            }
        }
    }

    static final class BufferOverlap<T> extends rx.Subscriber<T> {
        final int Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final rx.Subscriber<? super java.util.List<T>> getHighSpeedVideoSizes;
        final int getInputSizeshNQ4ISI;
        final java.util.ArrayDeque<java.util.List<T>> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque<>();
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong();

        public BufferOverlap(rx.Subscriber<? super java.util.List<T>> subscriber, int i, int i2) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = i;
            this.getInputSizeshNQ4ISI = i2;
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j == 0) {
                this.getHighSpeedVideoFpsRangesFor.offer(new java.util.ArrayList(this.Camera2StreamConfigurationMap));
            }
            long j2 = j + 1;
            if (j2 == this.getInputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0L;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = j2;
            }
            java.util.Iterator<java.util.List<T>> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            java.util.List<T> peek = this.getHighSpeedVideoFpsRangesFor.peek();
            if (peek == null || peek.size() != this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.poll();
            this.getHighSpeedVideoFpsRanges++;
            this.getHighSpeedVideoSizes.onNext(peek);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            long j = this.getHighSpeedVideoFpsRanges;
            if (j != 0) {
                if (j > this.getOutputMinFrameDuration.get()) {
                    this.getHighSpeedVideoSizes.onError(new rx.exceptions.MissingBackpressureException("More produced than requested? ".concat(java.lang.String.valueOf(j))));
                    return;
                }
                this.getOutputMinFrameDuration.addAndGet(-j);
            }
            rx.internal.operators.BackpressureUtils.postCompleteDone(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }

        final class BufferOverlapProducer extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
            private static final long serialVersionUID = -4015894850868853147L;

            BufferOverlapProducer() {
            }

            @Override // rx.Producer
            public final void request(long j) {
                rx.internal.operators.OperatorBufferWithSize.BufferOverlap bufferOverlap = rx.internal.operators.OperatorBufferWithSize.BufferOverlap.this;
                if (!rx.internal.operators.BackpressureUtils.postCompleteRequest(bufferOverlap.getOutputMinFrameDuration, j, bufferOverlap.getHighSpeedVideoFpsRangesFor, bufferOverlap.getHighSpeedVideoSizes) || j == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bufferOverlap.request(rx.internal.operators.BackpressureUtils.multiplyCap(bufferOverlap.getInputSizeshNQ4ISI, j));
                } else {
                    bufferOverlap.request(rx.internal.operators.BackpressureUtils.addCap(rx.internal.operators.BackpressureUtils.multiplyCap(bufferOverlap.getInputSizeshNQ4ISI, j - 1), bufferOverlap.Camera2StreamConfigurationMap));
                }
            }
        }
    }
}
