package v0;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1486a {
    public static void a(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
        alarmManager.setExact(i2, j2, pendingIntent);
    }
}
