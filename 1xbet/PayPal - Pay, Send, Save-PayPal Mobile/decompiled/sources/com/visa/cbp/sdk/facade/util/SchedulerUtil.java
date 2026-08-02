package com.visa.cbp.sdk.facade.util;

@java.lang.Deprecated
/* loaded from: classes16.dex */
public class SchedulerUtil {
    public static final long DEFAULT_REPLENISH_INTERVAL = 86400000;
    public static final int REPLENISH_REQUEST_CODE = 101;
    private static final java.lang.String TAG = "com.visa.cbp.sdk.facade.util.SchedulerUtil";

    public static void setupReplenishmentScheduler(android.content.Context context, long j, boolean z) {
    }

    public static void setupReplenishmentScheduler(android.content.Context context, boolean z) {
        setupReplenishmentScheduler(context, getTimeFromUUID(), z);
    }

    public static boolean isReplenishServiceScheduled(android.content.Context context) {
        return com.visa.cbp.sdk.facade.util.ContextHelper.getPendingIntentService(context, 101, new android.content.Intent(context, (java.lang.Class<?>) com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishmentCheckService.class), 536870912) != null;
    }

    private static long getTimeFromUUID() {
        try {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            if (obj != null) {
                int i = 1;
                if (obj.length() > 1) {
                    int numericValue = java.lang.Character.getNumericValue(obj.charAt(obj.length() - 1));
                    if (numericValue < 0) {
                        numericValue = 2;
                    }
                    int i2 = numericValue % 12;
                    if (i2 > 0) {
                        i = i2;
                    }
                    return java.lang.System.currentTimeMillis() + (i * 60000);
                }
            }
            return java.lang.System.currentTimeMillis() + 7200000;
        } catch (java.lang.Exception unused) {
            return java.lang.System.currentTimeMillis() + 7200000;
        }
    }
}
