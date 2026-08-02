package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class LottieThreadFactory implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.ThreadGroup getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.String getHighSpeedVideoSizes;

    public LottieThreadFactory() {
        java.lang.SecurityManager securityManager = java.lang.System.getSecurityManager();
        this.getHighSpeedVideoFpsRanges = securityManager == null ? java.lang.Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("lottie-");
        sb.append(getHighResolutionOutputSizeshNQ4ISI.getAndIncrement());
        sb.append("-thread-");
        this.getHighSpeedVideoSizes = sb.toString();
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.ThreadGroup threadGroup = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAndIncrement());
        java.lang.Thread thread = new java.lang.Thread(threadGroup, runnable, sb.toString(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
