package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pt1 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f6254j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ sq1 f6255k;

    public pt1(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.f6254j;
        sq1 sq1Var = this.f6255k;
        switch (i) {
            case 0:
                qt1 qt1Var = (qt1) sq1Var;
                f02 f02Var = (f02) qt1Var.f7192j;
                f02 f02Var2 = (f02) qt1Var.f7192j;
                f02Var.getClass();
                C0683s8 c0683s8 = qt1Var.f6616n;
                if (c0683s8.f7047j != 0) {
                    ((wa0) c0683s8.f7048k).getClass();
                    if (SystemClock.elapsedRealtime() - c0683s8.f7047j < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((wa0) c0683s8.f7048k).getClass();
                    c0683s8.f7047j = SystemClock.elapsedRealtime();
                    ky1 ky1Var = f02Var2.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5312a("Opening the database failed, dropping and recreating it");
                    if (!f02Var2.f2242j.getDatabasePath("google_app_measurement.db").delete()) {
                        ky1 ky1Var2 = f02Var2.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4600o.m5313b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c0683s8.f7047j = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        ky1 ky1Var3 = f02Var2.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4600o.m5313b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                ay1 ay1Var = (ay1) sq1Var;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    f02 f02Var3 = (f02) ay1Var.f7192j;
                    ky1 ky1Var4 = f02Var3.f2247o;
                    f02.m1560m(ky1Var4);
                    ky1Var4.f4600o.m5312a("Opening the local database failed, dropping and recreating it");
                    if (!f02Var3.f2242j.getDatabasePath("google_app_measurement_local.db").delete()) {
                        ky1 ky1Var5 = f02Var3.f2247o;
                        f02.m1560m(ky1Var5);
                        ky1Var5.f4600o.m5313b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        ky1 ky1Var6 = ((f02) ay1Var.f7192j).f2247o;
                        f02.m1560m(ky1Var6);
                        ky1Var6.f4600o.m5313b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f6254j;
        sq1 sq1Var = this.f6255k;
        switch (i) {
            case 0:
                ky1 ky1Var = ((f02) ((qt1) sq1Var).f7192j).f2247o;
                f02.m1560m(ky1Var);
                hn0.m2323s(ky1Var, sQLiteDatabase);
                break;
            default:
                ky1 ky1Var2 = ((f02) ((ay1) sq1Var).f7192j).f2247o;
                f02.m1560m(ky1Var2);
                hn0.m2323s(ky1Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f6254j;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.f6254j;
        sq1 sq1Var = this.f6255k;
        switch (i) {
            case 0:
                f02 f02Var = (f02) ((qt1) sq1Var).f7192j;
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                hn0.m2321q(ky1Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", qt1.f6604o);
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", qt1.f6606q);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", qt1.f6607r);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", qt1.f6609t);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", qt1.f6608s);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", qt1.f6610u);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", qt1.f6611v);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", qt1.f6612w);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", qt1.f6613x);
                fs1.m1890a();
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", qt1.f6614y);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", qt1.f6605p);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                f02.m1560m(ky1Var2);
                hn0.m2321q(ky1Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                ky1 ky1Var3 = ((f02) ((ay1) sq1Var).f7192j).f2247o;
                f02.m1560m(ky1Var3);
                hn0.m2321q(ky1Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", ay1.f655n);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f6254j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pt1(ay1 ay1Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f6254j = 1;
        this.f6255k = ay1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pt1(qt1 qt1Var, Context context) {
        this(context, "google_app_measurement.db");
        this.f6254j = 0;
        this.f6255k = qt1Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m3986a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: e */
    private final void m3987e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: i */
    private final void m3988i(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: j */
    private final void m3989j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
