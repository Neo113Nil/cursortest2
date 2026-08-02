package g2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class i extends S1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17115c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f17116d;

    public i(Context context, int i, int i5) {
        super(i, i5);
        this.f17116d = context;
    }

    @Override // S1.a
    public final void a(Y1.b bVar) {
        Context context = this.f17116d;
        switch (this.f17115c) {
            case 0:
                if (this.f5283b >= 10) {
                    ((SQLiteDatabase) bVar.f6123l).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean contains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bVar.f6123l;
                if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j5 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.b();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j5)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        bVar.p();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i5 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.b();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i5)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.p();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public i(Context context) {
        super(9, 10);
        this.f17116d = context;
    }
}
