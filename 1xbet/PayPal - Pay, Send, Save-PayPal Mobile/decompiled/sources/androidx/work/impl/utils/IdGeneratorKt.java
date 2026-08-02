package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sqLiteDatabase", "", "migrateLegacyIdGenerator", "(Landroid/content/Context;Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "INITIAL_ID", com.visa.cbp.getEncExpo.warmup, "", "NEXT_JOB_SCHEDULER_ID_KEY", "Ljava/lang/String;", "NEXT_ALARM_MANAGER_ID_KEY", "PREFERENCE_FILE_KEY"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdGeneratorKt {
    public static final int INITIAL_ID = 0;
    public static final java.lang.String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    public static final java.lang.String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    public static final java.lang.String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    public static final void migrateLegacyIdGenerator(android.content.Context context, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i2 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(androidx.work.impl.utils.PreferenceUtils.INSERT_PREFERENCE, new java.lang.Object[]{NEXT_JOB_SCHEDULER_ID_KEY, java.lang.Integer.valueOf(i)});
                supportSQLiteDatabase.execSQL(androidx.work.impl.utils.PreferenceUtils.INSERT_PREFERENCE, new java.lang.Object[]{NEXT_ALARM_MANAGER_ID_KEY, java.lang.Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    public static final /* synthetic */ int access$nextId(androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
        java.lang.Long longValue = workDatabase.preferenceDao().getLongValue(str);
        int longValue2 = longValue != null ? (int) longValue.longValue() : 0;
        workDatabase.preferenceDao().insertPreference(new androidx.work.impl.model.Preference(str, java.lang.Long.valueOf(longValue2 != Integer.MAX_VALUE ? longValue2 + 1 : 0)));
        return longValue2;
    }
}
