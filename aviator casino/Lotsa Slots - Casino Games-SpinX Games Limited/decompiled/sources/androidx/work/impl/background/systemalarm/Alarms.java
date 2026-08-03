package androidx.work.impl.background.systemalarm;

/* loaded from: classes2.dex */
class Alarms {
    private static final java.lang.String TAG = androidx.work.Logger.tagWithPrefix("Alarms");

    public static void setAlarm(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.model.WorkGenerationalId id, long triggerAtMillis) {
        androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        androidx.work.impl.model.SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(id);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, id, systemIdInfo.systemId);
            setExactAlarm(context, id, systemIdInfo.systemId, triggerAtMillis);
        } else {
            int nextAlarmManagerId = new androidx.work.impl.utils.IdGenerator(workDatabase).nextAlarmManagerId();
            systemIdInfoDao.insertSystemIdInfo(androidx.work.impl.model.SystemIdInfoKt.systemIdInfo(id, nextAlarmManagerId));
            setExactAlarm(context, id, nextAlarmManagerId, triggerAtMillis);
        }
    }

    public static void cancelAlarm(android.content.Context context, androidx.work.impl.WorkDatabase workDatabase, androidx.work.impl.model.WorkGenerationalId id) {
        androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        androidx.work.impl.model.SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(id);
        if (systemIdInfo != null) {
            cancelExactAlarm(context, id, systemIdInfo.systemId);
            androidx.work.Logger.get().debug(TAG, "Removing SystemIdInfo for workSpecId (" + id + ")");
            systemIdInfoDao.removeSystemIdInfo(id);
        }
    }

    private static void cancelExactAlarm(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id, int alarmId) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, alarmId, androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(context, id), android.os.Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        androidx.work.Logger.get().debug(TAG, "Cancelling existing alarm with (workSpecId, systemId) (" + id + ", " + alarmId + ")");
        alarmManager.cancel(service);
    }

    private static void setExactAlarm(android.content.Context context, androidx.work.impl.model.WorkGenerationalId id, int alarmId, long triggerAtMillis) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, alarmId, androidx.work.impl.background.systemalarm.CommandHandler.createDelayMetIntent(context, id), android.os.Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            androidx.work.impl.background.systemalarm.Alarms.Api19Impl.setExact(alarmManager, 0, triggerAtMillis, service);
        }
    }

    private Alarms() {
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setExact(android.app.AlarmManager alarmManager, int type, long triggerAtMillis, android.app.PendingIntent operation) {
            alarmManager.setExact(type, triggerAtMillis, operation);
        }
    }
}
