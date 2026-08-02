package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class PreferenceUtils {
    public static final java.lang.String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    public static final java.lang.String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final java.lang.String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    public static final java.lang.String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final java.lang.String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";
    private final androidx.work.impl.WorkDatabase Camera2StreamConfigurationMap;

    public PreferenceUtils(androidx.work.impl.WorkDatabase workDatabase) {
        this.Camera2StreamConfigurationMap = workDatabase;
    }

    public long getLastCancelAllTimeMillis() {
        java.lang.Long longValue = this.Camera2StreamConfigurationMap.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public androidx.view.LiveData<java.lang.Long> getLastCancelAllTimeMillisLiveData() {
        return androidx.view.Transformations.map(this.Camera2StreamConfigurationMap.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.utils.PreferenceUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Long valueOf;
                valueOf = java.lang.Long.valueOf(r2 != null ? ((java.lang.Long) obj).longValue() : 0L);
                return valueOf;
            }
        });
    }

    public void setLastCancelAllTimeMillis(long j) {
        this.Camera2StreamConfigurationMap.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(KEY_LAST_CANCEL_ALL_TIME_MS, java.lang.Long.valueOf(j)));
    }

    public boolean getNeedsReschedule() {
        java.lang.Long longValue = this.Camera2StreamConfigurationMap.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setNeedsReschedule(boolean z) {
        this.Camera2StreamConfigurationMap.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(KEY_RESCHEDULE_NEEDED, z));
    }

    public void setLastForceStopEventMillis(long j) {
        this.Camera2StreamConfigurationMap.preferenceDao().insertPreference(new androidx.work.impl.model.Preference("last_force_stop_ms", java.lang.Long.valueOf(j)));
    }

    public long getLastForceStopEventMillis() {
        java.lang.Long longValue = this.Camera2StreamConfigurationMap.preferenceDao().getLongValue("last_force_stop_ms");
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    public static void migrateLegacyPreferences(android.content.Context context, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        if (sharedPreferences.contains(KEY_RESCHEDULE_NEEDED) || sharedPreferences.contains(KEY_LAST_CANCEL_ALL_TIME_MS)) {
            long j = sharedPreferences.getLong(KEY_LAST_CANCEL_ALL_TIME_MS, 0L);
            long j2 = sharedPreferences.getBoolean(KEY_RESCHEDULE_NEEDED, false) ? 1L : 0L;
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(INSERT_PREFERENCE, new java.lang.Object[]{KEY_LAST_CANCEL_ALL_TIME_MS, java.lang.Long.valueOf(j)});
                supportSQLiteDatabase.execSQL(INSERT_PREFERENCE, new java.lang.Object[]{KEY_RESCHEDULE_NEEDED, java.lang.Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }
}
