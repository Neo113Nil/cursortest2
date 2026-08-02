package com.datadog.trace.common.writer;

/* loaded from: classes8.dex */
public class ListWriter extends java.util.concurrent.CopyOnWriteArrayList<java.util.List<com.datadog.trace.core.DDSpan>> implements com.datadog.trace.common.writer.Writer {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.common.writer.ListWriter.class);
    public static final com.datadog.trace.common.writer.ListWriter.Filter ACCEPT_ALL = new com.datadog.trace.common.writer.ListWriter.Filter() { // from class: com.datadog.trace.common.writer.ListWriter.1
        @Override // com.datadog.trace.common.writer.ListWriter.Filter
        public boolean accept(java.util.List<com.datadog.trace.core.DDSpan> list) {
            return true;
        }
    };
    private final java.util.List<java.util.concurrent.CountDownLatch> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger();
    private final com.datadog.trace.common.writer.TraceStructureWriter getHighResolutionOutputSizeshNQ4ISI = new com.datadog.trace.common.writer.TraceStructureWriter(true);
    private final com.datadog.trace.core.tagprocessor.PeerServiceCalculator getHighSpeedVideoFpsRangesFor = new com.datadog.trace.core.tagprocessor.PeerServiceCalculator();
    private com.datadog.trace.common.writer.ListWriter.Filter Camera2StreamConfigurationMap = ACCEPT_ALL;

    public interface Filter {
        boolean accept(java.util.List<com.datadog.trace.core.DDSpan> list);
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void incrementDropCounts(int i) {
    }

    public java.util.List<com.datadog.trace.core.DDSpan> firstTrace() {
        return get(0);
    }

    public java.util.List<com.datadog.trace.core.DDSpan> secondTrace() {
        return get(1);
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void write(java.util.List<com.datadog.trace.core.DDSpan> list) {
        if (this.Camera2StreamConfigurationMap.accept(list)) {
            java.util.Iterator<com.datadog.trace.core.DDSpan> it = list.iterator();
            while (it.hasNext()) {
                it.next().processTagsAndBaggage(com.datadog.trace.core.MetadataConsumer.NO_OP);
            }
            this.getOutputMinFrameDuration.incrementAndGet();
            synchronized (this.getHighSpeedVideoFpsRanges) {
                add(list);
                for (java.util.concurrent.CountDownLatch countDownLatch : this.getHighSpeedVideoFpsRanges) {
                    if (size() >= countDownLatch.getCount()) {
                        while (countDownLatch.getCount() > 0) {
                            countDownLatch.countDown();
                        }
                    }
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.write(list);
        }
    }

    public boolean waitForTracesMax(int i, int i2) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(i);
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (size() >= i) {
                return true;
            }
            this.getHighSpeedVideoFpsRanges.add(countDownLatch);
            return countDownLatch.await(i2, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public void waitForTraces(int i) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (waitForTracesMax(i, 20)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout waiting for ");
        sb.append(i);
        sb.append(" trace(s). ListWriter.size() == ");
        sb.append(size());
        sb.append(" : ");
        sb.append(super.toString());
        java.lang.String obj = sb.toString();
        getHighSpeedVideoSizes.warn(obj);
        throw new java.util.concurrent.TimeoutException(obj);
    }

    public void waitUntilReported(com.datadog.trace.core.DDSpan dDSpan) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        waitUntilReported(dDSpan, 20, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void waitUntilReported(com.datadog.trace.core.DDSpan dDSpan, int i, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        java.util.concurrent.CountDownLatch countDownLatch;
        do {
            countDownLatch = new java.util.concurrent.CountDownLatch(size() + 1);
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges.add(countDownLatch);
            }
            java.util.Iterator<java.util.List<com.datadog.trace.core.DDSpan>> it = iterator();
            while (it.hasNext()) {
                java.util.Iterator<com.datadog.trace.core.DDSpan> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    if (it2.next() == dDSpan) {
                        return;
                    }
                }
            }
        } while (countDownLatch.await(i, timeUnit));
        java.lang.String concat = "Timeout waiting for span to be reported: ".concat(java.lang.String.valueOf(dDSpan));
        getHighSpeedVideoSizes.warn(concat);
        throw new java.util.concurrent.TimeoutException(concat);
    }

    public void setFilter(com.datadog.trace.common.writer.ListWriter.Filter filter) {
        this.Camera2StreamConfigurationMap = filter;
    }

    @Override // com.datadog.trace.common.writer.Writer
    public void start() {
        close();
    }

    @Override // com.datadog.trace.common.writer.Writer
    public boolean flush() {
        this.Camera2StreamConfigurationMap = ACCEPT_ALL;
        return true;
    }

    public java.util.concurrent.atomic.AtomicInteger getTraceCount() {
        return this.getOutputMinFrameDuration;
    }

    @Override // com.datadog.trace.common.writer.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        clear();
        synchronized (this.getHighSpeedVideoFpsRanges) {
            for (java.util.concurrent.CountDownLatch countDownLatch : this.getHighSpeedVideoFpsRanges) {
                while (countDownLatch.getCount() > 0) {
                    countDownLatch.countDown();
                }
            }
            this.getHighSpeedVideoFpsRanges.clear();
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListWriter { size=");
        sb.append(size());
        sb.append(" }");
        return sb.toString();
    }
}
