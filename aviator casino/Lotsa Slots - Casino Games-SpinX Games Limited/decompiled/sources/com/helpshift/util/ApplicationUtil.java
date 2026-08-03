package com.helpshift.util;

/* loaded from: classes5.dex */
public class ApplicationUtil {
    public static final int NOTIFICATION_ID = 121;
    public static final java.lang.String NOTIFICATION_TAG = "hsft_notification_tag";
    public static final int REQUEST_SELECT_FILE = 1001;
    private static final java.lang.String TAG = "AppUtil";

    private ApplicationUtil() {
    }

    public static boolean isApplicationInDebugMode(android.content.Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean isPermissionGranted(android.content.Context context, java.lang.String str) {
        try {
            return androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.d(TAG, "Error checking for permission : " + str, e);
            return false;
        }
    }

    public static void showNotification(android.content.Context context, android.app.Notification notification, java.lang.String str) {
        if (notification == null) {
            com.helpshift.log.HSLogger.d(TAG, "notification is null, not showing.");
            return;
        }
        android.app.NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            com.helpshift.log.HSLogger.d(TAG, "NotificationManager is null, not showing.");
            return;
        }
        try {
            boolean isNotificationAllowed = isNotificationAllowed(context);
            com.helpshift.log.HSLogger.d(TAG, "areNotificationAllowed : " + isNotificationAllowed);
            if (isNotificationAllowed) {
                java.lang.String generateNotificationTag = generateNotificationTag(str);
                com.helpshift.log.HSLogger.d(TAG, "Showing notification : Tag : " + generateNotificationTag);
                notificationManager.notify(generateNotificationTag, 121, notification);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error showing notification", e);
        }
    }

    public static boolean isNotificationAllowed(android.content.Context context) {
        try {
            return androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error checking notification permission", e);
            return true;
        }
    }

    public static android.app.NotificationManager getNotificationManager(android.content.Context context) {
        try {
            return (android.app.NotificationManager) context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Unable to get notification manager from System service", e);
            return null;
        }
    }

    public static int getLogoResourceValue(android.content.Context context) {
        int i = context.getApplicationInfo().logo;
        return i == 0 ? context.getApplicationInfo().icon : i;
    }

    public static int getTargetSDKVersion(android.content.Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.d(TAG, "Target SDK version not found", e);
            return 0;
        }
    }

    public static void cancelNotification(android.content.Context context) {
        cancelNotification(context, com.helpshift.activities.HSMainActivity.class.getName());
    }

    public static void cancelNotification(android.content.Context context, java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Cancelling notification");
        java.lang.String generateNotificationTag = generateNotificationTag(str);
        android.app.NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager != null) {
            notificationManager.cancel(generateNotificationTag, 121);
        }
    }

    public static int getResourceIdFromName(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return context.getResources().getIdentifier(str, str2, str3);
    }

    public static android.content.Intent getLaunchIntent(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting launch activity for package : " + str, e);
            return null;
        }
    }

    public static java.lang.String generateNotificationTag(java.lang.String str) {
        return "hsft_notification_tag_" + str;
    }

    public static boolean isLocalListNotEmpty(android.os.LocaleList localeList) {
        return (localeList == null || localeList.isEmpty()) ? false : true;
    }

    public static java.lang.String getLanguage(android.content.Context context) {
        java.lang.String languageTag;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                android.os.LocaleList applicationLocales = ((android.app.LocaleManager) context.getSystemService(android.app.LocaleManager.class)).getApplicationLocales();
                if (isLocalListNotEmpty(applicationLocales)) {
                    languageTag = applicationLocales.get(0).toLanguageTag();
                } else {
                    languageTag = java.util.Locale.getDefault().toLanguageTag();
                }
            } else {
                languageTag = java.util.Locale.getDefault().toLanguageTag();
            }
            return languageTag;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting app language", e);
            return "unknown";
        }
    }

    public static boolean isWebViewAvailable(android.content.Context context) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 26) {
            return true;
        }
        try {
            new android.webkit.WebView(context).destroy();
            return true;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Webview not available on device:" + e.getMessage(), e);
            return false;
        }
    }

    public static void startLauncherActivity(android.content.Context context) {
        android.content.Intent launchIntent = getLaunchIntent(context, context.getPackageName());
        if (launchIntent != null) {
            context.startActivity(launchIntent);
        }
    }
}
