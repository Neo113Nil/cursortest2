package k2;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1214a {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* synthetic */ NotificationChannel c(int i2, String str, String str2) {
        return new NotificationChannel(str, str2, i2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel e(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup f(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ NotificationChannel w() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
