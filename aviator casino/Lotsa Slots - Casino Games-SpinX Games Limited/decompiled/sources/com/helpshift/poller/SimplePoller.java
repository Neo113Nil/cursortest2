package com.helpshift.poller;

/* loaded from: classes2.dex */
public class SimplePoller {
    private static final java.lang.String TAG = "SimplePoller";
    private boolean isRunning;
    private final com.helpshift.poller.PollFunction pollFunction;
    private final java.lang.String pollerName;
    private final long pollingInterval;
    private final java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
    private boolean shouldStop;

    public SimplePoller(com.helpshift.poller.PollFunction pollFunction, long j, java.lang.String str, java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
        this.pollingInterval = j;
        this.pollFunction = pollFunction;
        this.pollerName = str;
    }

    public void start() {
        this.shouldStop = false;
        if (!this.isRunning) {
            com.helpshift.log.HSLogger.d(TAG, "Starting poller: " + this.pollerName);
            scheduleNextPoll();
            this.isRunning = true;
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Poller already running, skipping start again: " + this.pollerName);
    }

    public void stop() {
        com.helpshift.log.HSLogger.d(TAG, "Stopping poller: " + this.pollerName);
        this.shouldStop = true;
        this.isRunning = false;
        try {
            this.scheduledThreadPoolExecutor.getQueue().clear();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in clearing the polling queue.", e);
        }
    }

    private void scheduleNextPoll() {
        if (this.shouldStop) {
            com.helpshift.log.HSLogger.d(TAG, "Stop signalled, stopping poller: " + this.pollerName);
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Scheduling next poll: " + this.pollerName);
        try {
            this.scheduledThreadPoolExecutor.schedule(new com.helpshift.util.SafeWrappedRunnable(new java.lang.Runnable() { // from class: com.helpshift.poller.SimplePoller$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.poller.SimplePoller.this.m5684lambda$scheduleNextPoll$0$comhelpshiftpollerSimplePoller();
                }
            }), this.pollingInterval, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in scheduling next poll: " + this.pollerName, e);
        }
    }

    /* renamed from: lambda$scheduleNextPoll$0$com-helpshift-poller-SimplePoller, reason: not valid java name */
    /* synthetic */ void m5684lambda$scheduleNextPoll$0$comhelpshiftpollerSimplePoller() {
        if (this.pollFunction.execute()) {
            scheduleNextPoll();
        } else {
            this.isRunning = false;
            this.shouldStop = true;
        }
    }
}
