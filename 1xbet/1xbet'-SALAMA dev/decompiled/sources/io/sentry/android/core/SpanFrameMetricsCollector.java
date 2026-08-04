package io.sentry.android.core;

import io.sentry.DateUtils;
import io.sentry.IPerformanceContinuousCollector;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.NoOpSpan;
import io.sentry.NoOpTransaction;
import io.sentry.SentryDate;
import io.sentry.SentryNanotimeDate;
import io.sentry.SpanDataConvention;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.protocol.MeasurementValue;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class SpanFrameMetricsCollector implements IPerformanceContinuousCollector, SentryFrameMetricsCollector.FrameMetricsCollectorListener {
    private static final int MAX_FRAMES_COUNT = 3600;
    private final boolean enabled;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private volatile String listenerId;
    private static final long ONE_SECOND_NANOS = TimeUnit.SECONDS.toNanos(1);
    private static final SentryNanotimeDate EMPTY_NANO_TIME = new SentryNanotimeDate(new Date(0), 0);
    protected final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final SortedSet<ISpan> runningSpans = new TreeSet(new u());
    private final ConcurrentSkipListSet<Frame> frames = new ConcurrentSkipListSet<>();
    private long lastKnownFrameDurationNanos = 16666666;

    public static class Frame implements Comparable<Frame> {
        private final long delayNanos;
        private final long durationNanos;
        private final long endNanos;
        private final long expectedDurationNanos;
        private final boolean isFrozen;
        private final boolean isSlow;
        private final long startNanos;

        public Frame(long j) {
            this(j, j, 0L, 0L, false, false, 0L);
        }

        public Frame(long j, long j3, long j7, long j8, boolean z4, boolean z7, long j9) {
            this.startNanos = j;
            this.endNanos = j3;
            this.durationNanos = j7;
            this.delayNanos = j8;
            this.isSlow = z4;
            this.isFrozen = z7;
            this.expectedDurationNanos = j9;
        }

        @Override // java.lang.Comparable
        public int compareTo(Frame frame) {
            return Long.compare(this.endNanos, frame.endNanos);
        }
    }

    public SpanFrameMetricsCollector(SentryAndroidOptions sentryAndroidOptions, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
        this.enabled = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    private static int addPendingFrameDelay(SentryFrameMetrics sentryFrameMetrics, long j, long j3, long j7) {
        long jMax = Math.max(0L, j3 - j7);
        if (!SentryFrameMetricsCollector.isSlow(jMax, j)) {
            return 0;
        }
        sentryFrameMetrics.addFrame(jMax, Math.max(0L, jMax - j), true, SentryFrameMetricsCollector.isFrozen(jMax));
        return 1;
    }

    private void captureFrameMetrics(ISpan iSpan) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.runningSpans.remove(iSpan)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            SentryDate finishDate = iSpan.getFinishDate();
            if (finishDate == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            long nanoTime = toNanoTime(iSpan.getStartDate());
            long nanoTime2 = toNanoTime(finishDate);
            long j = nanoTime2 - nanoTime;
            long j3 = 0;
            if (j <= 0) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            SentryFrameMetrics sentryFrameMetrics = new SentryFrameMetrics();
            long j7 = this.lastKnownFrameDurationNanos;
            if (!this.frames.isEmpty()) {
                for (Frame frame : this.frames.tailSet(new Frame(nanoTime))) {
                    if (frame.startNanos > nanoTime2) {
                        break;
                    }
                    if (frame.startNanos >= nanoTime && frame.endNanos <= nanoTime2) {
                        sentryFrameMetrics.addFrame(frame.durationNanos, frame.delayNanos, frame.isSlow, frame.isFrozen);
                    } else if ((nanoTime > frame.startNanos && nanoTime < frame.endNanos) || (nanoTime2 > frame.startNanos && nanoTime2 < frame.endNanos)) {
                        long jMin = Math.min(frame.delayNanos - Math.max(j3, Math.max(j3, nanoTime - frame.startNanos) - frame.expectedDurationNanos), j);
                        long jMin2 = Math.min(nanoTime2, frame.endNanos) - Math.max(nanoTime, frame.startNanos);
                        sentryFrameMetrics.addFrame(jMin2, jMin, SentryFrameMetricsCollector.isSlow(jMin2, frame.expectedDurationNanos), SentryFrameMetricsCollector.isFrozen(jMin2));
                    }
                    j7 = frame.expectedDurationNanos;
                    j3 = 0;
                }
            }
            long j8 = j7;
            int slowFrozenFrameCount = sentryFrameMetrics.getSlowFrozenFrameCount();
            long lastKnownFrameStartTimeNanos = this.frameMetricsCollector.getLastKnownFrameStartTimeNanos();
            if (lastKnownFrameStartTimeNanos != -1) {
                slowFrozenFrameCount = slowFrozenFrameCount + addPendingFrameDelay(sentryFrameMetrics, j8, nanoTime2, lastKnownFrameStartTimeNanos) + interpolateFrameCount(sentryFrameMetrics, j8, j);
            }
            double slowFrameDelayNanos = (sentryFrameMetrics.getSlowFrameDelayNanos() + sentryFrameMetrics.getFrozenFrameDelayNanos()) / 1.0E9d;
            iSpan.setData(SpanDataConvention.FRAMES_TOTAL, Integer.valueOf(slowFrozenFrameCount));
            iSpan.setData(SpanDataConvention.FRAMES_SLOW, Integer.valueOf(sentryFrameMetrics.getSlowFrameCount()));
            iSpan.setData(SpanDataConvention.FRAMES_FROZEN, Integer.valueOf(sentryFrameMetrics.getFrozenFrameCount()));
            iSpan.setData(SpanDataConvention.FRAMES_DELAY, Double.valueOf(slowFrameDelayNanos));
            if (iSpan instanceof ITransaction) {
                iSpan.setMeasurement(MeasurementValue.KEY_FRAMES_TOTAL, Integer.valueOf(slowFrozenFrameCount));
                iSpan.setMeasurement(MeasurementValue.KEY_FRAMES_SLOW, Integer.valueOf(sentryFrameMetrics.getSlowFrameCount()));
                iSpan.setMeasurement(MeasurementValue.KEY_FRAMES_FROZEN, Integer.valueOf(sentryFrameMetrics.getFrozenFrameCount()));
                iSpan.setMeasurement(MeasurementValue.KEY_FRAMES_DELAY, Double.valueOf(slowFrameDelayNanos));
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static int interpolateFrameCount(SentryFrameMetrics sentryFrameMetrics, long j, long j3) {
        long totalDurationNanos = j3 - sentryFrameMetrics.getTotalDurationNanos();
        if (totalDurationNanos > 0) {
            return (int) Math.ceil(totalDurationNanos / j);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(ISpan iSpan, ISpan iSpan2) {
        if (iSpan == iSpan2) {
            return 0;
        }
        int iCompareTo = iSpan.getStartDate().compareTo(iSpan2.getStartDate());
        return iCompareTo != 0 ? iCompareTo : iSpan.getSpanContext().getSpanId().toString().compareTo(iSpan2.getSpanContext().getSpanId().toString());
    }

    private static long toNanoTime(SentryDate sentryDate) {
        if (sentryDate instanceof SentryNanotimeDate) {
            return sentryDate.diff(EMPTY_NANO_TIME);
        }
        return System.nanoTime() - (DateUtils.millisToNanos(System.currentTimeMillis()) - sentryDate.nanoTimestamp());
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void clear() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.listenerId != null) {
                this.frameMetricsCollector.stopCollection(this.listenerId);
                this.listenerId = null;
            }
            this.frames.clear();
            this.runningSpans.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
    public void onFrameMetricCollected(long j, long j3, long j7, long j8, boolean z4, boolean z7, float f7) {
        if (this.frames.size() > MAX_FRAMES_COUNT) {
            return;
        }
        long j9 = (long) (ONE_SECOND_NANOS / ((double) f7));
        this.lastKnownFrameDurationNanos = j9;
        if (z4 || z7) {
            this.frames.add(new Frame(j, j3, j7, j8, z4, z7, j9));
        }
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void onSpanFinished(ISpan iSpan) {
        if (!this.enabled || (iSpan instanceof NoOpSpan) || (iSpan instanceof NoOpTransaction)) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.runningSpans.contains(iSpan)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            captureFrameMetrics(iSpan);
            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.lock.acquire();
            try {
                if (this.runningSpans.isEmpty()) {
                    clear();
                } else {
                    this.frames.headSet(new Frame(toNanoTime(this.runningSpans.first().getStartDate()))).clear();
                }
                if (iSentryLifecycleTokenAcquire2 != null) {
                    iSentryLifecycleTokenAcquire2.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire2 != null) {
                    try {
                        iSentryLifecycleTokenAcquire2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void onSpanStarted(ISpan iSpan) {
        if (!this.enabled || (iSpan instanceof NoOpSpan) || (iSpan instanceof NoOpTransaction)) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.runningSpans.add(iSpan);
            if (this.listenerId == null) {
                this.listenerId = this.frameMetricsCollector.startCollection(this);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
