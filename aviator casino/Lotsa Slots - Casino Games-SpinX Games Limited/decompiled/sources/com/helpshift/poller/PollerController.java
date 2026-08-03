package com.helpshift.poller;

/* loaded from: classes2.dex */
public class PollerController {
    private static final java.lang.String TAG = "PolerCntlr";
    private final com.helpshift.poller.ExponentialBackoff exponentialBackoff;
    private boolean isRunning;
    private final com.helpshift.poller.FetchNotificationUpdate pollFunction;
    private final java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
    private boolean shouldStop;
    private final com.helpshift.user.UserManager userManager;

    public PollerController(com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate, com.helpshift.user.UserManager userManager, com.helpshift.poller.ExponentialBackoff exponentialBackoff, java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.pollFunction = fetchNotificationUpdate;
        this.userManager = userManager;
        this.exponentialBackoff = exponentialBackoff;
        this.scheduledThreadPoolExecutor = scheduledThreadPoolExecutor;
    }

    void start() {
        this.shouldStop = false;
        if (this.isRunning) {
            return;
        }
        scheduleNextPoll(0);
        this.isRunning = true;
    }

    void stop() {
        this.shouldStop = true;
        this.isRunning = false;
        this.exponentialBackoff.reset();
        try {
            this.scheduledThreadPoolExecutor.getQueue().clear();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in clearing the polling queue.", e);
        }
    }

    private void scheduleNextPoll(int i) {
        if (this.shouldStop || !this.userManager.shouldPoll() || i == -1) {
            com.helpshift.log.HSLogger.d(TAG, "Stopping poller, shouldPoll is false or STOP_POLLING received.");
            return;
        }
        this.exponentialBackoff.reconcileIntervals(this.userManager.getPollingBaseInterval(), this.userManager.getPollingMaxInterval());
        int nextInterval = this.exponentialBackoff.nextInterval(i);
        if (nextInterval == -1) {
            com.helpshift.log.HSLogger.d(TAG, "Stopping poller, request failed");
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Scheduling next poll with interval: " + nextInterval);
        try {
            this.scheduledThreadPoolExecutor.schedule(new com.helpshift.util.SafeWrappedRunnable(new java.lang.Runnable() { // from class: com.helpshift.poller.PollerController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.poller.PollerController.this.m5683lambda$scheduleNextPoll$0$comhelpshiftpollerPollerController();
                }
            }), nextInterval, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in scheduling next poll", e);
        }
    }

    /* renamed from: lambda$scheduleNextPoll$0$com-helpshift-poller-PollerController, reason: not valid java name */
    /* synthetic */ void m5683lambda$scheduleNextPoll$0$comhelpshiftpollerPollerController() {
        scheduleNextPoll(this.pollFunction.execute(com.helpshift.util.Utils.ORIGIN_POLLER, this.userManager.getHashForActiveUser(), true));
    }
}
