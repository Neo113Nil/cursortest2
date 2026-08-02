package io.sentry.backpressure;

/* loaded from: classes2.dex */
public final class NoOpBackpressureMonitor implements IBackpressureMonitor {
    private static final NoOpBackpressureMonitor instance = new NoOpBackpressureMonitor();

    private NoOpBackpressureMonitor() {
    }

    public static NoOpBackpressureMonitor getInstance() {
        return instance;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return 0;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
    }
}
