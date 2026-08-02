package com.datadog.trace.core;

/* loaded from: classes3.dex */
public abstract class PendingTraceBuffer implements java.lang.AutoCloseable {

    public interface Element {
        com.datadog.trace.core.DDSpan getRootSpan();

        boolean lastReferencedNanosAgo(long j);

        long oldestFinishedTime();

        boolean setEnqueued(boolean z);

        void write();

        boolean writeOnBufferFull();
    }

    @Override // java.lang.AutoCloseable
    public abstract void close();

    public abstract void enqueue(com.datadog.trace.core.PendingTraceBuffer.Element element);

    public abstract void flush();

    public boolean longRunningSpansEnabled() {
        return false;
    }

    public abstract void start();

    static class DelayingPendingTraceBuffer extends com.datadog.trace.core.PendingTraceBuffer {
        private final com.datadog.trace.api.time.TimeSource getInputSizeshNQ4ISI;
        private final com.datadog.trace.core.LongRunningTracesTracker getOutputMinFrameDuration;
        private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);
        private static final long getHighSpeedVideoFpsRanges = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(500);
        private volatile boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger(0);
        private final org.jctools.queues.MpscBlockingConsumerArrayQueue<com.datadog.trace.core.PendingTraceBuffer.Element> Camera2StreamConfigurationMap = new org.jctools.queues.MpscBlockingConsumerArrayQueue<>(4096);
        private final java.lang.Thread getInputFormats = com.datadog.trace.util.AgentThreadFactory.newAgentThread(com.datadog.trace.util.AgentThreadFactory.AgentThread.TRACE_MONITOR, new com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.Worker(this, 0));

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public boolean longRunningSpansEnabled() {
            return this.getOutputMinFrameDuration != null;
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void enqueue(com.datadog.trace.core.PendingTraceBuffer.Element element) {
            if (!element.setEnqueued(true) || this.Camera2StreamConfigurationMap.offer(element)) {
                return;
            }
            element.setEnqueued(false);
            if (element.writeOnBufferFull()) {
                element.write();
            }
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void start() {
            this.getInputFormats.start();
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer, java.lang.AutoCloseable
        public void close() {
            flush();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getInputFormats.interrupt();
            try {
                this.getInputFormats.join(800L);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void flush() {
            if (this.getInputFormats.isAlive()) {
                int i = this.getHighSpeedVideoSizes.get();
                boolean offer = this.Camera2StreamConfigurationMap.offer(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement.getHighResolutionOutputSizeshNQ4ISI);
                int i2 = 1;
                while (!this.getHighResolutionOutputSizeshNQ4ISI && !offer) {
                    if (i2 <= 3) {
                        java.lang.Thread.yield();
                    } else {
                        try {
                            java.lang.Thread.sleep(10L);
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    offer = this.Camera2StreamConfigurationMap.offer(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement.getHighResolutionOutputSizeshNQ4ISI);
                    i2++;
                }
                int i3 = this.getHighSpeedVideoSizes.get();
                while (!this.getHighResolutionOutputSizeshNQ4ISI && i >= i3) {
                    if (i2 <= 3) {
                        java.lang.Thread.yield();
                    } else {
                        try {
                            java.lang.Thread.sleep(10L);
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    i3 = this.getHighSpeedVideoSizes.get();
                    i2++;
                }
            }
        }

        static final class WriteDrain implements org.jctools.queues.MessagePassingQueue.Consumer<com.datadog.trace.core.PendingTraceBuffer.Element> {
            private static final com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.WriteDrain getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.WriteDrain();

            private WriteDrain() {
            }

            @Override // org.jctools.queues.MessagePassingQueue.Consumer
            public final /* synthetic */ void accept(com.datadog.trace.core.PendingTraceBuffer.Element element) {
                element.write();
            }
        }

        static final class FlushElement implements com.datadog.trace.core.PendingTraceBuffer.Element {
            static com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement();

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final com.datadog.trace.core.DDSpan getRootSpan() {
                return null;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean lastReferencedNanosAgo(long j) {
                return false;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final long oldestFinishedTime() {
                return 0L;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean setEnqueued(boolean z) {
                return true;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final void write() {
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean writeOnBufferFull() {
                return true;
            }

            private FlushElement() {
            }
        }

        final class Worker implements java.lang.Runnable {
            private Worker() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.trace.core.PendingTraceBuffer.Element element;
                while (!com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getHighResolutionOutputSizeshNQ4ISI && !java.lang.Thread.currentThread().isInterrupted()) {
                    try {
                        if (com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.longRunningSpansEnabled()) {
                            element = (com.datadog.trace.core.PendingTraceBuffer.Element) com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.Camera2StreamConfigurationMap.poll(1L, java.util.concurrent.TimeUnit.SECONDS);
                            com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getOutputMinFrameDuration.flushAndCompact(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getInputSizeshNQ4ISI.getCurrentTimeMillis());
                            if (element == null) {
                            }
                        } else {
                            element = (com.datadog.trace.core.PendingTraceBuffer.Element) com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.Camera2StreamConfigurationMap.take();
                        }
                        if (!(element instanceof com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement)) {
                            element.setEnqueued(false);
                            if (!com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.longRunningSpansEnabled() || !com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getOutputMinFrameDuration.add(element)) {
                                if (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(element.oldestFinishedTime()) <= com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getInputSizeshNQ4ISI.getCurrentTimeMillis() - com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.getHighSpeedVideoFpsRangesFor) {
                                    element.write();
                                } else if (element.lastReferencedNanosAgo(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.getHighSpeedVideoFpsRanges)) {
                                    element.write();
                                } else {
                                    com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.enqueue(element);
                                    java.lang.Thread.sleep(100L);
                                }
                            }
                        } else {
                            com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.Camera2StreamConfigurationMap.drain(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.WriteDrain.getHighResolutionOutputSizeshNQ4ISI);
                            com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer.this.getHighSpeedVideoSizes.incrementAndGet();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                }
            }

            /* synthetic */ Worker(com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer delayingPendingTraceBuffer, byte b) {
                this();
            }
        }

        public DelayingPendingTraceBuffer(com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.api.Config config, com.datadog.trace.core.monitor.HealthMetrics healthMetrics) {
            this.getInputSizeshNQ4ISI = timeSource;
            this.getOutputMinFrameDuration = config.isLongRunningTraceEnabled() ? new com.datadog.trace.core.LongRunningTracesTracker(config, 4096, healthMetrics) : null;
        }
    }

    static class DiscardingPendingTraceBuffer extends com.datadog.trace.core.PendingTraceBuffer {
        private final com.datadog.trace.logger.Logger Camera2StreamConfigurationMap;

        @Override // com.datadog.trace.core.PendingTraceBuffer, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void flush() {
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void start() {
        }

        public DiscardingPendingTraceBuffer(com.datadog.android.api.InternalLogger internalLogger) {
            this.Camera2StreamConfigurationMap = com.datadog.trace.logger.LoggerFactory.getLogger(com.datadog.trace.core.PendingTraceBuffer.DiscardingPendingTraceBuffer.class.getSimpleName(), internalLogger);
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public void enqueue(com.datadog.trace.core.PendingTraceBuffer.Element element) {
            this.Camera2StreamConfigurationMap.debug("PendingTrace enqueued but won't be reported. Root span: {}", element.getRootSpan());
        }
    }

    public static com.datadog.trace.core.PendingTraceBuffer delaying(com.datadog.trace.api.time.TimeSource timeSource, com.datadog.trace.api.Config config, com.datadog.trace.core.monitor.HealthMetrics healthMetrics) {
        return new com.datadog.trace.core.PendingTraceBuffer.DelayingPendingTraceBuffer(timeSource, config, healthMetrics);
    }

    public static com.datadog.trace.core.PendingTraceBuffer discarding(com.datadog.android.api.InternalLogger internalLogger) {
        return new com.datadog.trace.core.PendingTraceBuffer.DiscardingPendingTraceBuffer(internalLogger);
    }
}
