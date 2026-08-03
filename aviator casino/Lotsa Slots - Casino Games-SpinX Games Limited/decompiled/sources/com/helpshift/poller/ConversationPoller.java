package com.helpshift.poller;

/* loaded from: classes2.dex */
public class ConversationPoller {
    private static final java.lang.String TAG = "ConvPolr";
    private final com.helpshift.poller.PollerController pollerController;
    private final com.helpshift.user.UserManager userManager;

    public ConversationPoller(com.helpshift.poller.PollerController pollerController, com.helpshift.user.UserManager userManager) {
        this.pollerController = pollerController;
        this.userManager = userManager;
    }

    public synchronized void startPoller() {
        boolean shouldPoll = this.userManager.shouldPoll();
        boolean isPushTokenSynced = this.userManager.isPushTokenSynced();
        if (shouldPoll && !isPushTokenSynced) {
            com.helpshift.log.HSLogger.d(TAG, "Starting poller.");
            this.pollerController.start();
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Not starting poller, shouldPoll: " + shouldPoll + ",  push synced: " + isPushTokenSynced);
    }

    public synchronized void stopPoller() {
        com.helpshift.log.HSLogger.d(TAG, "Stopping poller.");
        this.pollerController.stop();
    }
}
