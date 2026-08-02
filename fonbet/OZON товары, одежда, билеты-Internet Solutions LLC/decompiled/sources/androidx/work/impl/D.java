package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D extends K4.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f45302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(@NotNull Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45302a = context;
    }

    @Override // K4.a
    public final void migrate(@NotNull O4.b sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "db");
        sqLiteDatabase.O0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.f45302a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j12 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sqLiteDatabase.A();
            try {
                sqLiteDatabase.H1(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                sqLiteDatabase.H1(new Object[]{"reschedule_needed", Long.valueOf(j12)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.f1();
            } finally {
            }
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.A();
            try {
                sqLiteDatabase.H1(new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                sqLiteDatabase.H1(new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                sharedPreferences2.edit().clear().apply();
                sqLiteDatabase.f1();
            } finally {
            }
        }
    }
}
