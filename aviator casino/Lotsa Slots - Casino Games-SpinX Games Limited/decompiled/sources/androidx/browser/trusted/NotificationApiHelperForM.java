package androidx.browser.trusted;

/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    static android.os.Parcelable[] getActiveNotifications(android.app.NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }

    private NotificationApiHelperForM() {
    }
}
