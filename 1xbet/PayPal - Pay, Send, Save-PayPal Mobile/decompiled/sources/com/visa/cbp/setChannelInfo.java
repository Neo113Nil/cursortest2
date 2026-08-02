package com.visa.cbp;

/* loaded from: classes16.dex */
class setChannelInfo {
    private static final java.lang.String Camera2StreamConfigurationMap = "setChannelInfo";

    setChannelInfo() {
    }

    boolean getHighSpeedVideoFpsRanges(android.content.Context context) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        java.lang.String packageName = context.getPackageName();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }
}
