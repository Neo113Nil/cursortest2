package androidx.browser.trusted;

/* loaded from: classes6.dex */
class NotificationApiHelperForO {
    static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationManager notificationManager, java.lang.String str) {
        android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    static android.app.Notification Camera2StreamConfigurationMap(android.content.Context context, android.app.NotificationManager notificationManager, android.app.Notification notification, java.lang.String str, java.lang.String str2) {
        notificationManager.createNotificationChannel(new android.app.NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        android.app.Notification.Builder recoverBuilder = android.app.Notification.Builder.recoverBuilder(context, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    private NotificationApiHelperForO() {
    }
}
