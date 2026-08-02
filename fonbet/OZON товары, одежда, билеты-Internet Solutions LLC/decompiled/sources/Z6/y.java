package Z6;

import Am.C2438a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
final class y extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    private static final String f35645c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    static int f35646d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final List<a> f35647e = Arrays.asList(new t(), new u(), new v(), new w(), new x());

    /* renamed from: a, reason: collision with root package name */
    private final int f35648a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35649b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    y(Context context, int i11, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f35649b = false;
        this.f35648a = i11;
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f35645c);
    }

    private static void d(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        List<a> list = f35647e;
        if (i12 <= list.size()) {
            while (i11 < i12) {
                list.get(i11).a(sQLiteDatabase);
                i11++;
            }
        } else {
            StringBuilder a11 = C2438a.a("Migration from ", i11, " to ", " was requested, but cannot be performed. Only ", i12);
            a11.append(list.size());
            a11.append(" migrations are provided");
            throw new IllegalArgumentException(a11.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f35649b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f35649b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, this.f35648a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f35649b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, 0, i12);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f35649b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (!this.f35649b) {
            onConfigure(sQLiteDatabase);
        }
        d(sQLiteDatabase, i11, i12);
    }
}
