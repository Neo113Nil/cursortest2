package u;

import android.app.NotificationManager;

/* renamed from: u.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1453A {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
