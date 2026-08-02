package androidx.core.app;

/* loaded from: classes7.dex */
public final class AlarmManagerCompat {
    public static void setAlarmClock(android.app.AlarmManager alarmManager, long j, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        alarmManager.setAlarmClock(new android.app.AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent2);
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
    }

    @androidx.annotation.ReplaceWith(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @java.lang.Deprecated
    public static void setExact(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager alarmManager, int i, long j, android.app.PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
    }

    public static boolean canScheduleExactAlarms(android.app.AlarmManager alarmManager) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.app.AlarmManagerCompat.Api31Impl.getHighSpeedVideoFpsRanges(alarmManager);
        }
        return true;
    }

    private AlarmManagerCompat() {
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.app.AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }
}
