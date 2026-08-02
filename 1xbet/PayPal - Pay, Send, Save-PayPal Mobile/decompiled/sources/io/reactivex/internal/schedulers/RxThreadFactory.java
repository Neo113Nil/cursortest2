package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class RxThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoFpsRanges;

    public RxThreadFactory(java.lang.String str) {
        this(str, 5, false);
    }

    public RxThreadFactory(java.lang.String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(java.lang.String str, int i, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.getHighSpeedVideoFpsRanges);
        sb.append('-');
        sb.append(incrementAndGet());
        java.lang.String obj = sb.toString();
        java.lang.Thread rxCustomThread = this.Camera2StreamConfigurationMap ? new io.reactivex.internal.schedulers.RxThreadFactory.RxCustomThread(runnable, obj) : new java.lang.Thread(runnable, obj);
        rxCustomThread.setPriority(this.getHighResolutionOutputSizeshNQ4ISI);
        rxCustomThread.setDaemon(true);
        return rxCustomThread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RxThreadFactory[");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("]");
        return sb.toString();
    }

    static final class RxCustomThread extends java.lang.Thread implements io.reactivex.internal.schedulers.NonBlockingThread {
        RxCustomThread(java.lang.Runnable runnable, java.lang.String str) {
            super(runnable, str);
        }
    }
}
