package e1;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: e1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001h extends E0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12527c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f12528d;

    public C1001h(int i7, Context context, int i8) {
        super(i7, i8);
        this.f12528d = context;
    }

    @Override // E0.a
    public final void a(K0.b bVar) {
        switch (this.f12527c) {
            case 0:
                if (this.f1899b >= 10) {
                    ((SQLiteDatabase) bVar.f3868b).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f12528d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                bVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f12528d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean contains = sharedPreferences.contains("reschedule_needed");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bVar.f3868b;
                if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                        sharedPreferences.edit().clear().apply();
                        bVar.j();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i8 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    bVar.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                        sharedPreferences2.edit().clear().apply();
                        bVar.j();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public C1001h(Context context) {
        super(9, 10);
        this.f12528d = context;
    }
}
