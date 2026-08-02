package com.discover.mpos.sdk.core.performance;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/core/performance/PerformanceCounter;", "Lcom/discover/mpos/sdk/core/performance/Benchmark;", "<init>", "()V", "", "reset", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "counter", "J", "", "oneMilliInNano", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "getTotalTime", "()J", "totalTime"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class PerformanceCounter implements com.discover.mpos.sdk.core.performance.Benchmark {
    private long counter;
    private final int oneMilliInNano = 1000000;
    private long startTime;

    @Override // com.discover.mpos.sdk.core.performance.Benchmark
    public final long getTotalTime() {
        return this.counter / this.oneMilliInNano;
    }

    @Override // com.discover.mpos.sdk.core.performance.Benchmark
    public final void reset() {
        this.counter = 0L;
        this.startTime = 0L;
    }

    @Override // com.discover.mpos.sdk.core.performance.Benchmark
    public final void start() {
        this.startTime = java.lang.System.nanoTime();
    }

    @Override // com.discover.mpos.sdk.core.performance.Benchmark
    public final void stop() {
        if (this.startTime > 0) {
            this.counter += java.lang.System.nanoTime() - this.startTime;
            this.startTime = 0L;
        }
    }
}
