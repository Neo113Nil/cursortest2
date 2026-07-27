package t0;

import android.content.Context;
import android.content.SharedPreferences;
import c0.C0301c;

/* loaded from: classes.dex */
public final class g extends Y.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11864c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11865d;

    public g(Context context, int i2, int i3) {
        super(i2, i3);
        this.f11865d = context;
    }

    @Override // Y.a
    public final void a(C0301c c0301c) {
        switch (this.f11864c) {
            case 0:
                if (this.f3660b >= 10) {
                    c0301c.p(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f11865d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c0301c.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f11865d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c0301c.a();
                    try {
                        c0301c.p(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        c0301c.p(new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        c0301c.D();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c0301c.a();
                    try {
                        c0301c.p(new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        c0301c.p(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        c0301c.D();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f11865d = context;
    }
}
