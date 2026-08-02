package com.adjust.sdk;

/* loaded from: classes7.dex */
class FirstSessionDelayManager {
    public final com.adjust.sdk.ActivityHandler getHighSpeedVideoFpsRangesFor;
    public final java.util.ArrayList getHighSpeedVideoSizes = new java.util.ArrayList();
    public int getHighSpeedVideoFpsRanges = 0;

    public FirstSessionDelayManager(com.adjust.sdk.ActivityHandler activityHandler) {
        this.getHighSpeedVideoFpsRangesFor = activityHandler;
    }

    public final void getHighSpeedVideoSizes(java.lang.Runnable runnable, java.lang.String str) {
        if (this.getHighSpeedVideoFpsRanges != 3) {
            runnable.run();
            return;
        }
        com.adjust.sdk.ILogger logger = this.getHighSpeedVideoFpsRangesFor.getAdjustConfig().getLogger();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Enqueuing \"");
        sb.append(str);
        sb.append("\" action to be executed after first session delay ends");
        logger.debug(sb.toString(), new java.lang.Object[0]);
        this.getHighSpeedVideoSizes.add(runnable);
    }

    public final void getHighSpeedVideoFpsRanges(java.lang.String str, com.adjust.sdk.IRunActivityHandler iRunActivityHandler) {
        if (this.getHighSpeedVideoFpsRanges == 3) {
            com.adjust.sdk.ILogger logger = this.getHighSpeedVideoFpsRangesFor.getAdjustConfig().getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Enqueuing \"");
            sb.append(str);
            sb.append("\" action to be executed after first session delay ends");
            logger.debug(sb.toString(), new java.lang.Object[0]);
            this.getHighSpeedVideoFpsRangesFor.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
            return;
        }
        iRunActivityHandler.run(this.getHighSpeedVideoFpsRangesFor);
    }
}
