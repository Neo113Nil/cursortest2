package H0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f495a;

    @Override // H0.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        long j3 = this.f495a;
        try {
            Cursor cursor = rawQuery;
            cursor.moveToNext();
            return new D0.h(cursor.getLong(0), j3);
        } finally {
            rawQuery.close();
        }
    }
}
