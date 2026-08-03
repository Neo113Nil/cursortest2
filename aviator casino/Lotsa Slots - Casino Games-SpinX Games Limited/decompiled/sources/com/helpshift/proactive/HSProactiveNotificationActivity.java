package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class HSProactiveNotificationActivity extends android.app.Activity {
    private static final java.lang.String TAG = "Helpshift_ProNotAct";

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        long j;
        int i;
        boolean z;
        java.util.HashMap hashMap;
        super.onCreate(bundle);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null || extras.isEmpty()) {
            android.util.Log.e(TAG, "Empty data in handling Proactive notification from Helpshift");
            finish();
            return;
        }
        try {
            string = extras.getString("action");
            string2 = extras.getString("actionConfig");
            string3 = extras.getString(com.helpshift.proactive.ProactiveNotificationConstants.ACTION_VALUE);
            string4 = extras.getString(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID);
            string5 = extras.getString(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID);
            j = extras.getLong(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME);
            i = extras.getInt("priority", -1);
            java.lang.String string6 = extras.getString(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, "");
            z = extras.getBoolean(com.helpshift.proactive.ProactiveNotificationConstants.IS_FALLBACK_NOTIFICATION, false);
            hashMap = new java.util.HashMap();
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, string4);
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, string5);
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, java.lang.String.valueOf(j));
            hashMap.put(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, string6);
            if (i != -1) {
                hashMap.put("priority", java.lang.String.valueOf(i));
            }
            androidx.core.app.NotificationManagerCompat.from(this).cancel(com.helpshift.util.ApplicationUtil.generateNotificationTag(string4), 121);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error handling proactive notification click", e);
        }
        if (z) {
            com.helpshift.util.ApplicationUtil.startLauncherActivity(this);
            finish();
            return;
        }
        if (!com.helpshift.core.HSContext.verifyInstall()) {
            android.util.Log.e(TAG, "Helpshift not installed! Skipping proactive notification handling.");
            finish();
            return;
        }
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        java.util.Map<java.lang.String, java.lang.Object> commonEventData = com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(string4, string5, j);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addPriority(i, commonEventData);
        com.helpshift.proactive.ProactiveAnalyticsUtil.addActionType(string, commonEventData);
        com.helpshift.analytics.HSAnalyticsEventDM analyticsEventDM = hSContext.getAnalyticsEventDM();
        analyticsEventDM.addEventToStorage(java.lang.System.currentTimeMillis(), com.helpshift.analytics.AnalyticsEventType.PROACTIVE_PUSH_OPEN, commonEventData);
        analyticsEventDM.sendAllEvents();
        com.helpshift.proactive.ProactiveActions fromValue = com.helpshift.proactive.ProactiveActions.fromValue(string);
        if (!hSContext.isAppInBackground() && fromValue == com.helpshift.proactive.ProactiveActions.OPEN_APP) {
            com.helpshift.log.HSLogger.d(TAG, "App is in foreground, skipping proactive push notification");
            finish();
        } else {
            com.helpshift.proactive.ProactiveActionHandler.handleProactiveAction(this, hSContext.getConfigManager(), string2, hashMap, string, string3);
            finish();
        }
    }
}
