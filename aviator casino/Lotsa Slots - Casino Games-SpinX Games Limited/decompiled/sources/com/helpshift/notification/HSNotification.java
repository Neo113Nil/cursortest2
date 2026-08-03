package com.helpshift.notification;

/* loaded from: classes2.dex */
class HSNotification {
    public static final java.lang.String HELPSHIFT_DEFAULT_CHANNEL_DESCRIPTION = "";
    public static final java.lang.String HELPSHIFT_DEFAULT_CHANNEL_ID = "In-app Support";
    public static final java.lang.String HELPSHIFT_DEFAULT_PROACTIVE_ENGAGE_CHANNEL_DESCRIPTION = "Get notifications that take you to app features or personalized offers";
    public static final java.lang.String HELPSHIFT_DEFAULT_PROACTIVE_ENGAGE_CHANNEL_ID = "Proactive Engage";
    public static final java.lang.String HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_DESCRIPTION = "Get notifications that guide you to Help Center or Chat for quick help";
    public static final java.lang.String HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_ID = "Proactive Support";
    private static final int REQUEST_CODE = 50;
    private static final java.lang.String TAG = "SDKXNotif";

    private HSNotification() {
    }

    public static androidx.core.app.NotificationCompat.Builder createNotification(android.content.Context context, com.helpshift.platform.Device device, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Class<? extends android.app.Activity> cls) {
        java.lang.String appName = device.getAppName();
        if (!com.helpshift.util.Utils.isNotEmpty(str2)) {
            str2 = "";
        }
        com.helpshift.log.HSLogger.d(TAG, "Creating Support notification :\n Title : " + appName);
        int logoResourceValue = com.helpshift.util.ApplicationUtil.getLogoResourceValue(context);
        if (!com.helpshift.util.AssetsUtil.resourceExists(context, i)) {
            i = logoResourceValue;
        }
        android.graphics.Bitmap decodeResource = com.helpshift.util.AssetsUtil.resourceExists(context, i2) ? android.graphics.BitmapFactory.decodeResource(context.getResources(), i2) : null;
        android.content.Intent intent = new android.content.Intent(context, cls);
        intent.putExtra(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY, com.helpshift.util.ConfigValues.WEBCHAT_SERVICE);
        intent.putExtra("source", com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        intent.setFlags(268435456);
        android.app.PendingIntent pendingIntentForNotification = com.helpshift.HSPluginEventBridge.getPendingIntentForNotification(context, android.app.PendingIntent.getActivity(context, 50, intent, 268435456 | (android.os.Build.VERSION.SDK_INT < 23 ? 0 : androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL)));
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, str);
        builder.setSmallIcon(i);
        builder.setContentTitle(appName);
        builder.setContentText(str2);
        builder.setContentIntent(pendingIntentForNotification);
        builder.setAutoCancel(true);
        if (decodeResource != null) {
            builder.setLargeIcon(decodeResource);
        }
        setSoundInNotification(context, builder, i3);
        return builder;
    }

    public static androidx.core.app.NotificationCompat.Builder createProactiveNotification(android.content.Context context, java.lang.String str, java.lang.String str2, com.helpshift.proactive.ProactivePushNotification proactivePushNotification, java.io.File file) {
        android.graphics.Bitmap decodeResource;
        android.content.Context context2 = context;
        com.helpshift.proactive.ProactivePushNotification proactivePushNotification2 = proactivePushNotification;
        int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) / 1000;
        android.text.Spanned fromHtml = android.text.Html.fromHtml(proactivePushNotification2.title);
        android.text.Spanned fromHtml2 = android.text.Html.fromHtml(com.helpshift.util.Utils.isNotEmpty(proactivePushNotification2.content) ? proactivePushNotification2.content : "");
        android.text.Spanned fromHtml3 = android.text.Html.fromHtml(com.helpshift.util.Utils.isNotEmpty(proactivePushNotification2.bigText) ? proactivePushNotification2.bigText : "");
        com.helpshift.log.HSLogger.d(TAG, "Creating Proactive notification :\n Title : " + proactivePushNotification2.title);
        int logoResourceValue = com.helpshift.util.AssetsUtil.resourceExists(context2, proactivePushNotification2.defaultNotificationIconId) ? proactivePushNotification2.defaultNotificationIconId : com.helpshift.util.ApplicationUtil.getLogoResourceValue(context);
        if (file != null && file.exists() && file.canRead()) {
            decodeResource = android.graphics.BitmapFactory.decodeFile(file.getAbsolutePath());
        } else {
            decodeResource = com.helpshift.util.AssetsUtil.resourceExists(context2, proactivePushNotification2.defaultLargeNotificationIconId) ? android.graphics.BitmapFactory.decodeResource(context.getResources(), proactivePushNotification2.defaultLargeNotificationIconId) : null;
        }
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.helpshift.proactive.HSProactiveNotificationActivity.class);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, proactivePushNotification2.notificationId);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, proactivePushNotification2.analyticsId);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, proactivePushNotification2.deliveryTime);
        intent.putExtra("action", proactivePushNotification2.baseAction.action.value);
        intent.putExtra("actionConfig", proactivePushNotification2.baseAction.actionConfigJSON);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ACTION_VALUE, proactivePushNotification2.baseAction.actionValue);
        intent.putExtra("priority", proactivePushNotification2.baseAction.priority);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, str);
        intent.setFlags(268435456);
        int i = (android.os.Build.VERSION.SDK_INT < 23 ? 0 : androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) | 268435456;
        int i2 = currentTimeMillis + 1;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context2, i2, intent, i);
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context2, str2);
        builder.setSmallIcon(logoResourceValue);
        builder.setContentTitle(fromHtml);
        builder.setContentText(fromHtml2);
        builder.setContentIntent(activity);
        builder.setVisibility(1);
        builder.setAutoCancel(true);
        if (decodeResource != null) {
            builder.setLargeIcon(decodeResource);
            builder.setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(decodeResource).bigLargeIcon((android.graphics.Bitmap) null));
        } else if (com.helpshift.util.Utils.isNotEmpty(proactivePushNotification2.bigText)) {
            builder.setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(fromHtml3));
        }
        setSoundInNotification(context2, builder, proactivePushNotification2.defaultSoundId);
        for (com.helpshift.proactive.ProactivePushButton proactivePushButton : proactivePushNotification2.buttons) {
            android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.helpshift.proactive.HSProactiveNotificationActivity.class);
            intent2.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, proactivePushNotification2.notificationId);
            intent2.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, proactivePushNotification2.analyticsId);
            intent2.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, proactivePushNotification2.deliveryTime);
            intent2.putExtra("action", proactivePushButton.actionEntity.action.value);
            intent2.putExtra("actionConfig", proactivePushButton.actionEntity.actionConfigJSON);
            intent2.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ACTION_VALUE, proactivePushButton.actionEntity.actionValue);
            intent2.putExtra("priority", proactivePushButton.actionEntity.priority);
            intent2.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, str);
            i2++;
            builder.addAction(0, proactivePushButton.title, android.app.PendingIntent.getActivity(context2, i2, intent2, i));
            context2 = context;
            proactivePushNotification2 = proactivePushNotification;
        }
        return builder;
    }

    public static androidx.core.app.NotificationCompat.Builder createProactiveFallbackNotification(android.content.Context context, com.helpshift.platform.Device device, com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, java.lang.String str) {
        androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, str);
        int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) / 1000;
        int logoResourceValue = com.helpshift.util.AssetsUtil.resourceExists(context, proactiveInappNotification.defaultNotificationIconId) ? proactiveInappNotification.defaultNotificationIconId : com.helpshift.util.ApplicationUtil.getLogoResourceValue(context);
        android.text.Spanned fromHtml = android.text.Html.fromHtml(com.helpshift.util.Utils.isEmpty(proactiveInappNotification.fallbackPushNotificationTitle) ? device.getAppName() : proactiveInappNotification.fallbackPushNotificationTitle);
        android.text.Spanned fromHtml2 = android.text.Html.fromHtml(com.helpshift.util.Utils.isNotEmpty(proactiveInappNotification.fallbackPushNotificationText) ? proactiveInappNotification.fallbackPushNotificationText : "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.helpshift.proactive.HSProactiveNotificationActivity.class);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, proactiveInappNotification.notificationId);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, proactiveInappNotification.analyticsId);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, proactiveInappNotification.deliveryTime);
        intent.putExtra(com.helpshift.proactive.ProactiveNotificationConstants.IS_FALLBACK_NOTIFICATION, true);
        intent.setFlags(268435456);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, currentTimeMillis + 1, intent, 268435456 | (android.os.Build.VERSION.SDK_INT < 23 ? 0 : androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        builder.setSmallIcon(logoResourceValue);
        builder.setContentTitle(fromHtml);
        builder.setContentText(fromHtml2);
        builder.setContentIntent(activity);
        builder.setVisibility(1);
        builder.setAutoCancel(true);
        setSoundInNotification(context, builder, proactiveInappNotification.defaultSoundId);
        return builder;
    }

    private static void setSoundInNotification(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, int i) {
        android.net.Uri notificationSoundUri = getNotificationSoundUri(context, i);
        if (notificationSoundUri == null) {
            builder.setDefaults(-1);
        } else {
            builder.setSound(notificationSoundUri);
            builder.setDefaults(6);
        }
    }

    public static android.net.Uri getNotificationSoundUri(android.content.Context context, int i) {
        if (i == 0) {
            return null;
        }
        return android.net.Uri.parse("android.resource://" + context.getPackageName() + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + i);
    }
}
