package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/datadog/android/core/internal/thread/DatadogThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "", "newThreadContext", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogThreadFactory implements java.util.concurrent.ThreadFactory {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI;

    public DatadogThreadFactory(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r) {
        int andIncrement = this.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("datadog-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(andIncrement);
        java.lang.Thread thread = new java.lang.Thread(r, sb.toString());
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}
