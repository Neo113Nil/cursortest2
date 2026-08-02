package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qt1 extends k62 {

    /* JADX INFO: renamed from: o */
    public static final String[] f6604o = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: p */
    public static final String[] f6605p = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: q */
    public static final String[] f6606q = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: r */
    public static final String[] f6607r = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: s */
    public static final String[] f6608s = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: t */
    public static final String[] f6609t = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: u */
    public static final String[] f6610u = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: v */
    public static final String[] f6611v = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: w */
    public static final String[] f6612w = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: x */
    public static final String[] f6613x = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: y */
    public static final String[] f6614y = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: m */
    public final pt1 f6615m;

    /* JADX INFO: renamed from: n */
    public final C0683s8 f6616n;

    public qt1(x62 x62Var) {
        super(x62Var);
        this.f6616n = new C0683s8(((f02) this.f7192j).f2252t);
        ((f02) this.f7192j).getClass();
        this.f6615m = new pt1(this, ((f02) this.f7192j).f2242j);
    }

    /* JADX INFO: renamed from: f0 */
    public static final String m4142f0(List list) {
        return list.isEmpty() ? "" : AbstractC0024an.m284g(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m4143n0(ContentValues contentValues, Object obj) {
        p80.m3860e("value");
        p80.m3863h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            C0270h1.m2190f("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
    /* JADX INFO: renamed from: A0 */
    public final hr1 m4144A0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        p80.m3860e(str2);
        mo11z();
        m2988B();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m4191r0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM4163N = m4163N(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    a72 a72Var = this.f1566k.f8827p;
                    x62.m5533U(a72Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<fu1> creator = fu1.CREATOR;
                    fu1 fu1Var = (fu1) a72Var.m72d0(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    x62.m5533U(a72Var);
                    fu1 fu1Var2 = (fu1) a72Var.m72d0(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    x62.m5533U(a72Var);
                    str3 = str2;
                    try {
                        hr1 hr1Var = new hr1(str, str4, new b72(j3, objM4163N, str3, str4), j2, z, string2, fu1Var, j, fu1Var2, j4, (fu1) a72Var.m72d0(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5314c(ky1.m3106I(str), f02Var.f2251s.m1045c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return hr1Var;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var2);
        ky1Var2.f4600o.m5315d("Error querying conditional property", ky1.m3106I(str), f02Var.f2251s.m1045c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m4145B0(String str, String str2) {
        p80.m3860e(str);
        p80.m3860e(str2);
        mo11z();
        m2988B();
        try {
            m4191r0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            f02 f02Var = (f02) this.f7192j;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5315d("Error deleting conditional property", ky1.m3106I(str), f02Var.f2251s.m1045c(str2), e);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final List m4146C0(String str, String str2, String str3) {
        p80.m3860e(str);
        mo11z();
        m2988B();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m4147D0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
        f02 f02Var = (f02) this.f7192j;
        if (f02Var.f2245m.m770L(null, jx1.f4178e1)) {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new cm1(3, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX INFO: renamed from: D0 */
    public final List m4147D0(String str, String[] strArr) {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                f02Var.getClass();
                cursorQuery = m4191r0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5313b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM4163N = m4163N(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        a72 a72Var = this.f1566k.f8827p;
                        x62.m5533U(a72Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<fu1> creator = fu1.CREATOR;
                        fu1 fu1Var = (fu1) a72Var.m72d0(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        x62.m5533U(a72Var);
                        fu1 fu1Var2 = (fu1) a72Var.m72d0(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        x62.m5533U(a72Var);
                        arrayList.add(new hr1(string, string2, new b72(j3, objM4163N, string3, string2), j2, z, string4, fu1Var, j, fu1Var2, j4, (fu1) a72Var.m72d0(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final long m4148E(String str, e02 e02Var, String str2, Map map, e32 e32Var, Long l) {
        int iDelete;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        p80.m3863h(e02Var);
        p80.m3860e(str);
        mo11z();
        m2988B();
        if (m4186l0()) {
            x62 x62Var = this.f1566k;
            long jM821a = x62Var.f8829r.f9149o.m821a();
            wa0 wa0Var = f02Var.f2252t;
            ky1 ky1Var = f02Var.f2247o;
            wa0Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM821a) > ((Long) jx1.f4136M.m2715a(null)).longValue()) {
                x62Var.f8829r.f9149o.m822b(jElapsedRealtime);
                mo11z();
                m2988B();
                if (m4186l0() && (iDelete = m4191r0().delete("upload_queue", m4180e0(), new String[0])) > 0) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5313b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                p80.m3860e(str);
                mo11z();
                m2988B();
                try {
                    int iM768J = f02Var.f2245m.m768J(str, jx1.f4112A);
                    if (iM768J > 0) {
                        m4191r0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM768J)});
                    }
                } catch (SQLiteException e) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrM1274a = e02Var.m1274a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM1274a);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(e32Var.f1946j));
        wa0 wa0Var2 = f02Var.f2252t;
        ky1 ky1Var2 = f02Var.f2247o;
        wa0Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m4191r0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(str, e2, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    /* JADX INFO: renamed from: E0 */
    public final uy1 m4149E0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        mo11z();
        m2988B();
        Cursor cursor = null;
        try {
            cursorQuery = m4191r0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        x62 x62Var = this.f1566k;
                        uy1 uy1Var = new uy1(x62Var.f8832u, str);
                        f02 f02Var2 = uy1Var.f7944a;
                        l12 l12VarM5557d = x62Var.m5557d(str);
                        k12 k12Var = k12.f4250l;
                        if (l12VarM5557d.m3157i(k12Var)) {
                            uy1Var.m4964G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        uy1Var.m4966I(cursorQuery.getString(1));
                        if (x62Var.m5557d(str).m3157i(k12.f4249k)) {
                            uy1Var.m4967J(cursorQuery.getString(2));
                        }
                        uy1Var.m4982e(cursorQuery.getLong(3));
                        uy1Var.m4970M(cursorQuery.getLong(4));
                        uy1Var.m4971N(cursorQuery.getLong(5));
                        uy1Var.m4973P(cursorQuery.getString(6));
                        uy1Var.m4976S(cursorQuery.getString(7));
                        uy1Var.m4977T(cursorQuery.getLong(8));
                        uy1Var.m4978a(cursorQuery.getLong(9));
                        uy1Var.m4981d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        uy1Var.m4986i(cursorQuery.getLong(11));
                        uy1Var.m4987j(cursorQuery.getLong(12));
                        uy1Var.m4988k(cursorQuery.getLong(13));
                        uy1Var.m4989l(cursorQuery.getLong(14));
                        uy1Var.m4983f(cursorQuery.getLong(15));
                        uy1Var.m4984g(cursorQuery.getLong(16));
                        uy1Var.m4975R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        uy1Var.m4969L(cursorQuery.getString(18));
                        uy1Var.m4991n(cursorQuery.getLong(19));
                        uy1Var.m4990m(cursorQuery.getLong(20));
                        uy1Var.m5000w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        a02 a02Var = f02Var2.f2248p;
                        f02.m1560m(a02Var);
                        a02Var.mo11z();
                        uy1Var.f7941R |= uy1Var.f7959p != z2;
                        uy1Var.f7959p = z2;
                        uy1Var.m4980c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            uy1Var.m5002y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (x62Var.m5557d(str).m3157i(k12Var)) {
                            String string2 = cursorQuery.getString(28);
                            a02 a02Var2 = f02Var2.f2248p;
                            f02.m1560m(a02Var2);
                            a02Var2.mo11z();
                            uy1Var.f7941R |= !Objects.equals(uy1Var.f7963t, string2);
                            uy1Var.f7963t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        a02 a02Var3 = f02Var2.f2248p;
                        f02.m1560m(a02Var3);
                        a02Var3.mo11z();
                        uy1Var.f7941R |= uy1Var.f7964u != z3;
                        uy1Var.f7964u = z3;
                        uy1Var.m4995r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        a02 a02Var4 = f02Var2.f2248p;
                        f02.m1560m(a02Var4);
                        a02Var4.mo11z();
                        uy1Var.f7941R |= uy1Var.f7926C != string3;
                        uy1Var.f7926C = string3;
                        uy1Var.m4958A(cursorQuery.getLong(30));
                        uy1Var.m4959B(cursorQuery.getLong(31));
                        fs1.m1890a();
                        if (f02Var.f2245m.m770L(str, jx1.f4141O0)) {
                            int i = cursorQuery.getInt(32);
                            a02 a02Var5 = f02Var2.f2248p;
                            f02.m1560m(a02Var5);
                            a02Var5.mo11z();
                            uy1Var.f7941R |= uy1Var.f7967x != i;
                            uy1Var.f7967x = i;
                            uy1Var.m4960C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        a02 a02Var6 = f02Var2.f2248p;
                        f02.m1560m(a02Var6);
                        a02Var6.mo11z();
                        uy1Var.f7941R |= uy1Var.f7968y != z4;
                        uy1Var.f7968y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        a02 a02Var7 = f02Var2.f2248p;
                        f02.m1560m(a02Var7);
                        a02Var7.mo11z();
                        uy1Var.f7941R |= !Objects.equals(uy1Var.f7960q, boolValueOf);
                        uy1Var.f7960q = boolValueOf;
                        uy1Var.m4993p(cursorQuery.getInt(37));
                        uy1Var.m4994q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            p80.m3863h(string);
                        }
                        a02 a02Var8 = f02Var2.f2248p;
                        f02.m1560m(a02Var8);
                        a02Var8.mo11z();
                        uy1Var.f7941R |= uy1Var.f7930G != string;
                        uy1Var.f7930G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            a02 a02Var9 = f02Var2.f2248p;
                            f02.m1560m(a02Var9);
                            a02Var9.mo11z();
                            uy1Var.f7941R |= !Objects.equals(uy1Var.f7969z, lValueOf);
                            uy1Var.f7969z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            a02 a02Var10 = f02Var2.f2248p;
                            f02.m1560m(a02Var10);
                            a02Var10.mo11z();
                            uy1Var.f7941R |= !Objects.equals(uy1Var.f7924A, lValueOf2);
                            uy1Var.f7924A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        a02 a02Var11 = f02Var2.f2248p;
                        f02.m1560m(a02Var11);
                        a02Var11.mo11z();
                        uy1Var.f7941R |= uy1Var.f7931H != blob;
                        uy1Var.f7931H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            a02 a02Var12 = f02Var2.f2248p;
                            f02.m1560m(a02Var12);
                            a02Var12.mo11z();
                            boolean z5 = uy1Var.f7941R;
                            if (uy1Var.f7932I == i2) {
                                z = false;
                            }
                            uy1Var.f7941R = z | z5;
                            uy1Var.f7932I = i2;
                        }
                        if (f02Var.f2245m.m770L(str, jx1.f4193j1) && !cursorQuery.isNull(45)) {
                            uy1Var.m4998u(cursorQuery.getLong(45));
                        }
                        a02 a02Var13 = f02Var2.f2248p;
                        f02.m1560m(a02Var13);
                        a02Var13.mo11z();
                        uy1Var.f7941R = false;
                        if (cursorQuery.moveToNext()) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5313b(ky1.m3106I(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return uy1Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5314c(ky1.m3106I(str), e, "Error querying app. appId");
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: F */
    public final List m4150F(String str, g62 g62Var, int i) {
        ?? arrayList;
        p80.m3860e(str);
        mo11z();
        m2988B();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM4142f0 = m4142f0(g62Var.f2636j);
            String strM4180e0 = m4180e0();
            StringBuilder sb = new StringBuilder(strM4142f0.length() + 17 + strM4180e0.length());
            sb.append("app_id=?");
            sb.append(strM4142f0);
            sb.append(" AND NOT ");
            sb.append(strM4180e0);
            cursorQuery = sQLiteDatabaseM4191r0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                z62 z62VarM4179d0 = m4179d0(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (z62VarM4179d0 != null) {
                    arrayList.add(z62VarM4179d0);
                }
            }
        } catch (SQLiteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m4151F0(uy1 uy1Var, boolean z) {
        f02 f02Var = (f02) this.f7192j;
        f02 f02Var2 = uy1Var.f7944a;
        mo11z();
        m2988B();
        String strM4962E = uy1Var.m4962E();
        p80.m3863h(strM4962E);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM4962E);
        k12 k12Var = k12.f4250l;
        x62 x62Var = this.f1566k;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (x62Var.m5557d(strM4962E).m3157i(k12Var)) {
            contentValues.put("app_instance_id", uy1Var.m4963F());
        }
        contentValues.put("gmp_app_id", uy1Var.m4965H());
        if (x62Var.m5557d(strM4962E).m3157i(k12.f4249k)) {
            a02 a02Var = f02Var2.f2248p;
            f02.m1560m(a02Var);
            a02Var.mo11z();
            contentValues.put("resettable_device_id_hash", uy1Var.f7948e);
        }
        a02 a02Var2 = f02Var2.f2248p;
        f02.m1560m(a02Var2);
        a02Var2.mo11z();
        contentValues.put("last_bundle_index", Long.valueOf(uy1Var.f7950g));
        a02 a02Var3 = f02Var2.f2248p;
        f02.m1560m(a02Var3);
        a02Var3.mo11z();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(uy1Var.f7951h));
        a02 a02Var4 = f02Var2.f2248p;
        f02.m1560m(a02Var4);
        a02Var4.mo11z();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(uy1Var.f7952i));
        contentValues.put("app_version", uy1Var.m4972O());
        a02 a02Var5 = f02Var2.f2248p;
        f02.m1560m(a02Var5);
        a02Var5.mo11z();
        contentValues.put("app_store", uy1Var.f7955l);
        a02 a02Var6 = f02Var2.f2248p;
        f02.m1560m(a02Var6);
        a02Var6.mo11z();
        contentValues.put("gmp_version", Long.valueOf(uy1Var.f7956m));
        a02 a02Var7 = f02Var2.f2248p;
        f02.m1560m(a02Var7);
        a02Var7.mo11z();
        contentValues.put("dev_cert_hash", Long.valueOf(uy1Var.f7957n));
        a02 a02Var8 = f02Var2.f2248p;
        f02.m1560m(a02Var8);
        a02Var8.mo11z();
        contentValues.put("measurement_enabled", Boolean.valueOf(uy1Var.f7958o));
        a02 a02Var9 = f02Var2.f2248p;
        a02 a02Var10 = f02Var2.f2248p;
        f02.m1560m(a02Var9);
        a02Var9.mo11z();
        contentValues.put("day", Long.valueOf(uy1Var.f7934K));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_public_events_count", Long.valueOf(uy1Var.f7935L));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_events_count", Long.valueOf(uy1Var.f7936M));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_conversions_count", Long.valueOf(uy1Var.f7937N));
        a02 a02Var11 = f02Var2.f2248p;
        f02.m1560m(a02Var11);
        a02Var11.mo11z();
        contentValues.put("config_fetched_time", Long.valueOf(uy1Var.f7942S));
        a02 a02Var12 = f02Var2.f2248p;
        f02.m1560m(a02Var12);
        a02Var12.mo11z();
        contentValues.put("failed_config_fetch_time", Long.valueOf(uy1Var.f7943T));
        contentValues.put("app_version_int", Long.valueOf(uy1Var.m4974Q()));
        contentValues.put("firebase_instance_id", uy1Var.m4968K());
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_error_events_count", Long.valueOf(uy1Var.f7938O));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_realtime_events_count", Long.valueOf(uy1Var.f7939P));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("health_monitor_sample", uy1Var.f7940Q);
        contentValues.put("android_id", (Long) 0L);
        a02 a02Var13 = f02Var2.f2248p;
        f02.m1560m(a02Var13);
        a02Var13.mo11z();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(uy1Var.f7959p));
        contentValues.put("dynamite_version", Long.valueOf(uy1Var.m4979b()));
        if (x62Var.m5557d(strM4962E).m3157i(k12Var)) {
            a02 a02Var14 = f02Var2.f2248p;
            f02.m1560m(a02Var14);
            a02Var14.mo11z();
            contentValues.put("session_stitching_token", uy1Var.f7963t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(uy1Var.m5003z()));
        a02 a02Var15 = f02Var2.f2248p;
        f02.m1560m(a02Var15);
        a02Var15.mo11z();
        contentValues.put("target_os_version", Long.valueOf(uy1Var.f7965v));
        a02 a02Var16 = f02Var2.f2248p;
        f02.m1560m(a02Var16);
        a02Var16.mo11z();
        contentValues.put("session_stitching_token_hash", Long.valueOf(uy1Var.f7966w));
        fs1.m1890a();
        bt1 bt1Var = f02Var.f2245m;
        ky1 ky1Var = f02Var.f2247o;
        if (bt1Var.m770L(strM4962E, jx1.f4141O0)) {
            a02 a02Var17 = f02Var2.f2248p;
            f02.m1560m(a02Var17);
            a02Var17.mo11z();
            contentValues.put("ad_services_version", Integer.valueOf(uy1Var.f7967x));
            a02 a02Var18 = f02Var2.f2248p;
            f02.m1560m(a02Var18);
            a02Var18.mo11z();
            contentValues.put("attribution_eligibility_status", Long.valueOf(uy1Var.f7925B));
        }
        a02 a02Var19 = f02Var2.f2248p;
        f02.m1560m(a02Var19);
        a02Var19.mo11z();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(uy1Var.f7968y));
        contentValues.put("npa_metadata_value", uy1Var.m5001x());
        a02 a02Var20 = f02Var2.f2248p;
        f02.m1560m(a02Var20);
        a02Var20.mo11z();
        contentValues.put("bundle_delivery_index", Long.valueOf(uy1Var.f7929F));
        contentValues.put("sgtm_preview_key", uy1Var.m4961D());
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("dma_consent_state", Integer.valueOf(uy1Var.f7927D));
        f02.m1560m(a02Var10);
        a02Var10.mo11z();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(uy1Var.f7928E));
        contentValues.put("serialized_npa_metadata", uy1Var.m4996s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(uy1Var.m4997t()));
        a02 a02Var21 = f02Var2.f2248p;
        f02.m1560m(a02Var21);
        a02Var21.mo11z();
        ArrayList arrayList = uy1Var.f7962s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(strM4962E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (bt1Var.m770L(null, jx1.f4133K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        a02 a02Var22 = f02Var2.f2248p;
        f02.m1560m(a02Var22);
        a02Var22.mo11z();
        contentValues.put("unmatched_pfo", uy1Var.f7969z);
        a02 a02Var23 = f02Var2.f2248p;
        f02.m1560m(a02Var23);
        a02Var23.mo11z();
        contentValues.put("unmatched_uwa", uy1Var.f7924A);
        a02 a02Var24 = f02Var2.f2248p;
        f02.m1560m(a02Var24);
        a02Var24.mo11z();
        contentValues.put("ad_campaign_info", uy1Var.f7931H);
        if (bt1Var.m770L(strM4962E, jx1.f4193j1)) {
            a02 a02Var25 = f02Var2.f2248p;
            f02.m1560m(a02Var25);
            a02Var25.mo11z();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(uy1Var.f7933J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
            if (sQLiteDatabaseM4191r0.update("apps", contentValues, "app_id = ?", new String[]{strM4962E}) == 0 && sQLiteDatabaseM4191r0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5313b(ky1.m3106I(strM4962E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(ky1.m3106I(strM4962E), e, "Error storing app. appId");
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4152G(String str) {
        e32[] e32VarArr = {e32.f1940l};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(e32VarArr[0].f1946j));
        String strM4142f0 = m4142f0(arrayList);
        String strM4180e0 = m4180e0();
        StringBuilder sb = new StringBuilder(strM4142f0.length() + 61 + strM4180e0.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strM4142f0);
        sb.append(" AND NOT ");
        sb.append(strM4180e0);
        return m4172W(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: G0 */
    public final kt1 m4153G0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m4155H0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX INFO: renamed from: H */
    public final void m4154H(Long l) {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        try {
            if (m4191r0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5312a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final kt1 m4155H0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        mo11z();
        m2988B();
        String[] strArr = {str};
        kt1 kt1Var = new kt1();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
                cursorQuery = sQLiteDatabaseM4191r0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        kt1Var.f4551b = cursorQuery.getLong(1);
                        kt1Var.f4550a = cursorQuery.getLong(2);
                        kt1Var.f4552c = cursorQuery.getLong(3);
                        kt1Var.f4553d = cursorQuery.getLong(4);
                        kt1Var.f4554e = cursorQuery.getLong(5);
                        kt1Var.f4555f = cursorQuery.getLong(6);
                        kt1Var.f4556g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        kt1Var.f4551b += j2;
                    }
                    if (z2) {
                        kt1Var.f4550a += j2;
                    }
                    if (z3) {
                        kt1Var.f4552c += j2;
                    }
                    if (z4) {
                        kt1Var.f4553d += j2;
                    }
                    if (z5) {
                        kt1Var.f4554e += j2;
                    }
                    if (z6) {
                        kt1Var.f4555f += j2;
                    }
                    if (z7) {
                        kt1Var.f4556g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(kt1Var.f4550a));
                    contentValues.put("daily_events_count", Long.valueOf(kt1Var.f4551b));
                    contentValues.put("daily_conversions_count", Long.valueOf(kt1Var.f4552c));
                    contentValues.put("daily_error_events_count", Long.valueOf(kt1Var.f4553d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(kt1Var.f4554e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(kt1Var.f4555f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(kt1Var.f4556g));
                    sQLiteDatabaseM4191r0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4603r.m5313b(ky1.m3106I(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5314c(ky1.m3106I(str), e, "Error updating daily counts. appId");
            }
            return kt1Var;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: I */
    public final String m4156I() {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM4191r0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ky1 ky1Var = ((f02) this.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5313b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseM4191r0;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: I0 */
    public final oq0 m4157I0(String str) {
        Throwable th;
        Cursor cursorQuery;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        mo11z();
        m2988B();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = m4191r0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5313b(ky1.m3106I(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            oq0 oq0Var = new oq0((Object) blob, string, (Object) string2, 10);
                            cursorQuery.close();
                            return oq0Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5314c(ky1.m3106I(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m4158J(long j) {
        mo11z();
        m2988B();
        try {
            if (m4191r0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m4159J0(i02 i02Var, boolean z) {
        mo11z();
        m2988B();
        p80.m3860e(i02Var.m2493t());
        if (!i02Var.m2456g2()) {
            throw new IllegalStateException();
        }
        m4160K();
        f02 f02Var = (f02) this.f7192j;
        wa0 wa0Var = f02Var.f2252t;
        ky1 ky1Var = f02Var.f2247o;
        wa0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM2459h2 = i02Var.m2459h2();
        ix1 ix1Var = jx1.f4146R;
        if (jM2459h2 < jCurrentTimeMillis - ((Long) ix1Var.m2715a(null)).longValue() || i02Var.m2459h2() > ((Long) ix1Var.m2715a(null)).longValue() + jCurrentTimeMillis) {
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5315d("Storing bundle outside of the max uploading time span. appId, now, timestamp", ky1.m3106I(i02Var.m2493t()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(i02Var.m2459h2()));
        }
        byte[] bArrM1274a = i02Var.m1274a();
        try {
            a72 a72Var = this.f1566k.f8827p;
            x62.m5533U(a72Var);
            byte[] bArrM76k0 = a72Var.m76k0(bArrM1274a);
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(Integer.valueOf(bArrM76k0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i02Var.m2493t());
            contentValues.put("bundle_end_timestamp", Long.valueOf(i02Var.m2459h2()));
            contentValues.put("data", bArrM76k0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (i02Var.m2494t0()) {
                contentValues.put("retry_count", Integer.valueOf(i02Var.m2497u0()));
            }
            try {
                if (m4191r0().insert("queue", null, contentValues) == -1) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5313b(ky1.m3106I(i02Var.m2493t()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(ky1.m3106I(i02Var.m2493t()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(ky1.m3106I(i02Var.m2493t()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4160K() {
        mo11z();
        m2988B();
        if (m4186l0()) {
            x62 x62Var = this.f1566k;
            long jM821a = x62Var.f8829r.f9148n.m821a();
            f02 f02Var = (f02) this.f7192j;
            f02Var.f2252t.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM821a) > ((Long) jx1.f4136M.m2715a(null)).longValue()) {
                x62Var.f8829r.f9148n.m822b(jElapsedRealtime);
                mo11z();
                m2988B();
                if (m4186l0()) {
                    SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
                    f02Var.f2252t.getClass();
                    int iDelete = sQLiteDatabaseM4191r0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) jx1.f4146R.m2715a(null)).longValue())});
                    if (iDelete > 0) {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4608w.m5313b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m4161L(ArrayList arrayList) {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        p80.m3863h(arrayList);
        if (arrayList.size() == 0) {
            C0270h1.m2190f("Given Integer is zero");
            return;
        }
        if (m4186l0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM286i = AbstractC0024an.m286i(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m4172W(AbstractC0024an.m286i(new StringBuilder(strM286i.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM286i, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5312a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
                StringBuilder sb = new StringBuilder(strM286i.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM286i);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM4191r0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4162M(Long l) {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        if (m4186l0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m4172W(sb.toString(), null) > 0) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5312a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
                f02Var.f2252t.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM4191r0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final Object m4163N(Cursor cursor, int i) {
        f02 f02Var = (f02) this.f7192j;
        int type = cursor.getType(i);
        if (type == 0) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5313b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        ky1 ky1Var3 = f02Var.f2247o;
        f02.m1560m(ky1Var3);
        ky1Var3.f4600o.m5312a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX INFO: renamed from: O */
    public final long m4164O(String str) {
        long j;
        ContentValues contentValues;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        p80.m3860e("first_open_count");
        mo11z();
        m2988B();
        SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
        sQLiteDatabaseM4191r0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jM4173X = m4173X(sb.toString(), new String[]{str}, -1L);
                if (jM4173X == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM4191r0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5314c(ky1.m3106I(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jM4173X = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM4173X));
                            if (sQLiteDatabaseM4191r0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                ky1 ky1Var2 = f02Var.f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4600o.m5314c(ky1.m3106I(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseM4191r0.setTransactionSuccessful();
                                j = jM4173X;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jM4173X;
                            ky1 ky1Var3 = f02Var.f2247o;
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4600o.m5315d("Error inserting column. appId", ky1.m3106I(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM4173X));
                    if (sQLiteDatabaseM4191r0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        ky1 ky1Var4 = f02Var.f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4600o.m5314c(ky1.m3106I(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseM4191r0.setTransactionSuccessful();
                        j = jM4173X;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return j;
        } finally {
            sQLiteDatabaseM4191r0.endTransaction();
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m4165P(String str, String str2) {
        return m4172W("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX INFO: renamed from: Q */
    public final void m4166Q(List list) {
        p80.m3863h(list);
        mo11z();
        m2988B();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m4191r0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    /* JADX INFO: renamed from: R */
    public final long m4167R(String str) {
        p80.m3860e(str);
        return m4173X("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: S */
    public final void m4168S(String str, Long l, long j, rz1 rz1Var) {
        mo11z();
        m2988B();
        p80.m3863h(rz1Var);
        p80.m3860e(str);
        f02 f02Var = (f02) this.f7192j;
        byte[] bArrM1274a = rz1Var.m1274a();
        ky1 ky1Var = f02Var.f2247o;
        ky1 ky1Var2 = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5314c(f02Var.f2251s.m1043a(str), Integer.valueOf(bArrM1274a.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM1274a);
        try {
            if (m4191r0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(ky1.m3106I(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(ky1.m3106I(str), e, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX INFO: renamed from: T */
    public final void m4169T(String str, Long l, String str2, Bundle bundle) {
        ky1 ky1Var;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        ky1 ky1Var2;
        i02 i02Var;
        Iterator it;
        qt1 qt1Var = this;
        String str4 = str;
        f02 f02Var = (f02) qt1Var.f7192j;
        p80.m3863h(bundle);
        qt1Var.mo11z();
        qt1Var.m2988B();
        qa1 qa1Var = l != null ? new qa1(qt1Var, str4, l.longValue()) : new qa1(qt1Var, str4);
        List<mt1> listM4045c = qa1Var.m4045c();
        while (!listM4045c.isEmpty()) {
            for (mt1 mt1Var : listM4045c) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        i02 i02Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = qt1Var.m4191r0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(mt1Var.f5158b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                i02Var = (i02) ((g02) a72.m58l0(i02.m2358Y(), cursorQuery.getBlob(0))).m5683d();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        ky1 ky1Var3 = f02Var.f2247o;
                                                        f02.m1560m(ky1Var3);
                                                        ky1Var3.f4603r.m5313b(ky1.m3106I(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    ky1 ky1Var4 = f02Var.f2247o;
                                                    f02.m1560m(ky1Var4);
                                                    ky1Var4.f4600o.m5314c(ky1.m3106I(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                i02Var2 = i02Var;
                                            } catch (IOException e2) {
                                                ky1 ky1Var5 = f02Var.f2247o;
                                                f02.m1560m(ky1Var5);
                                                ky1Var5.f4600o.m5314c(ky1.m3106I(str4), e2, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (i02Var2 != null) {
                                                it = i02Var2.m2435Z1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((t02) it.next()).m4643v().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            ky1 ky1Var6 = f02Var.f2247o;
                                            f02.m1560m(ky1Var6);
                                            ky1Var6.f4600o.m5313b(ky1.m3106I(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        i02Var = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            i02Var = null;
                        }
                        if (i02Var2 != null) {
                            it = i02Var2.m2435Z1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((t02) it.next()).m4643v().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = m4191r0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        f02.m1560m(ky1Var);
                        ky1Var2 = ky1Var;
                        try {
                            ky1Var2.f4600o.m5314c(ky1.m3106I(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e5) {
                            e = e5;
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4600o.m5314c(ky1.m3106I(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    ky1Var2 = ky1Var;
                }
                x62 x62Var = qt1Var.f1566k;
                a72 a72Var = x62Var.f8827p;
                x62.m5533U(a72Var);
                rz1 rz1Var = mt1Var.f5160d;
                Bundle bundle3 = new Bundle();
                for (wz1 wz1Var : rz1Var.m4461v()) {
                    if (wz1Var.m5465B()) {
                        bundle3.putDouble(wz1Var.m5480u(), wz1Var.m5466C());
                    } else if (wz1Var.m5485z()) {
                        bundle3.putFloat(wz1Var.m5480u(), wz1Var.m5464A());
                    } else if (wz1Var.m5483x()) {
                        bundle3.putLong(wz1Var.m5480u(), wz1Var.m5484y());
                    } else if (wz1Var.m5481v()) {
                        bundle3.putString(wz1Var.m5480u(), wz1Var.m5482w());
                    } else if (wz1Var.m5467D().isEmpty()) {
                        ky1 ky1Var7 = ((f02) a72Var.f7192j).f2247o;
                        f02.m1560m(ky1Var7);
                        ky1Var7.f4600o.m5313b(wz1Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(wz1Var.m5480u(), a72.m60n0(wz1Var.m5467D()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM4464y = rz1Var.m4464y();
                if (string == null) {
                    string = "";
                }
                f72 f72Var = f02Var.f2250r;
                ky1Var = f02Var.f2247o;
                f02.m1558k(f72Var);
                if (strM4464y.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        mt1 mt1Var2 = mt1Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        mt1Var = mt1Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                mt1 mt1Var3 = mt1Var;
                f72Var.m1716N(bundle3, bundle2);
                bu1 bu1Var = new bu1((f02) qt1Var.f7192j, string, str4, rz1Var.m4464y(), rz1Var.m4440A(), rz1Var.m4448I(), rz1Var.m4442C(), bundle3);
                j = mt1Var3.f5157a;
                long j2 = mt1Var3.f5158b;
                boolean z = mt1Var3.f5159c;
                mo11z();
                m2988B();
                str3 = bu1Var.f992a;
                p80.m3860e(str3);
                a72 a72Var2 = x62Var.f8827p;
                x62.m5533U(a72Var2);
                byte[] bArrM1274a = a72Var2.m69a0(bu1Var).m1274a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", bu1Var.f993b);
                contentValues.put("timestamp", Long.valueOf(bu1Var.f995d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrM1274a);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(bu1Var.f996e));
                qt1Var = this;
                str4 = str;
            }
            listM4045c = qa1Var.m4045c();
            qt1Var = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [k62, qt1, sq1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: U */
    public final l12 m4170U(String str) {
        Throwable th;
        SQLiteException e;
        f02 f02Var = (f02) this.f7192j;
        p80.m3863h(str);
        mo11z();
        m2988B();
        ?? r2 = 0;
        l12VarM3150c = null;
        l12VarM3150c = null;
        l12 l12VarM3150c = null;
        try {
            try {
                this = m4191r0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        l12VarM3150c = l12.m3150c(this.getString(0), this.getInt(1));
                    } else {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4608w.m5312a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5313b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (l12VarM3150c == null) {
                        return l12.f4643c;
                    }
                    return l12VarM3150c;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (l12VarM3150c == null) {
            return l12.f4643c;
        }
        return l12VarM3150c;
    }

    /* JADX INFO: renamed from: V */
    public final void m4171V(String str, y52 y52Var) {
        mo11z();
        m2988B();
        p80.m3860e(str);
        f02 f02Var = (f02) this.f7192j;
        wa0 wa0Var = f02Var.f2252t;
        ky1 ky1Var = f02Var.f2247o;
        wa0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ix1 ix1Var = jx1.f4215u0;
        long jLongValue = jCurrentTimeMillis - ((Long) ix1Var.m2715a(null)).longValue();
        long j = y52Var.f9177k;
        if (j < jLongValue || j > ((Long) ix1Var.m2715a(null)).longValue() + jCurrentTimeMillis) {
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5315d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", ky1.m3106I(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5312a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", y52Var.f9176j);
        contentValues.put("source", Integer.valueOf(y52Var.f9178l));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m4191r0().insert("trigger_uris", null, contentValues) == -1) {
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5313b(ky1.m3106I(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Error storing trigger URI. appId");
        }
    }

    /* JADX INFO: renamed from: W */
    public final long m4172W(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m4191r0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                ky1 ky1Var = ((f02) this.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public final long m4173X(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m4191r0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                ky1 ky1Var = ((f02) this.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: Y */
    public final String m4174Y(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m4191r0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                ky1 ky1Var = ((f02) this.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: Z */
    public final void m4175Z(ContentValues contentValues) {
        f02 f02Var = (f02) this.f7192j;
        try {
            SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4602q.m5313b(ky1.m3106I("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM4191r0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM4191r0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5314c(ky1.m3106I("consent_settings"), ky1.m3106I("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4600o.m5315d("Error storing into table. key", ky1.m3106I("consent_settings"), ky1.m3106I("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: a0 */
    public final du1 m4176a0(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str2);
        p80.m3860e(str3);
        mo11z();
        m2988B();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = m4191r0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        du1 du1Var = new du1(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            ky1 ky1Var = f02Var.f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5313b(ky1.m3106I(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return du1Var;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5315d("Error querying events. appId", ky1.m3106I(str2), f02Var.f2251s.m1043a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m4177b0(String str, du1 du1Var) {
        f02 f02Var = (f02) this.f7192j;
        p80.m3863h(du1Var);
        mo11z();
        m2988B();
        ContentValues contentValues = new ContentValues();
        String str2 = du1Var.f1829a;
        contentValues.put("app_id", str2);
        contentValues.put("name", du1Var.f1830b);
        contentValues.put("lifetime_count", Long.valueOf(du1Var.f1831c));
        contentValues.put("current_bundle_count", Long.valueOf(du1Var.f1832d));
        contentValues.put("last_fire_timestamp", Long.valueOf(du1Var.f1834f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(du1Var.f1835g));
        contentValues.put("last_bundled_day", du1Var.f1836h);
        contentValues.put("last_sampled_complex_event_id", du1Var.f1837i);
        contentValues.put("last_sampling_rate", du1Var.f1838j);
        contentValues.put("current_session_count", Long.valueOf(du1Var.f1833e));
        Boolean bool = du1Var.f1839k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m4191r0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5313b(ky1.m3106I(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(ky1.m3106I(str2), e, "Error storing event aggregates. appId");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4178c0(String str, String str2) {
        p80.m3860e(str2);
        mo11z();
        m2988B();
        try {
            m4191r0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(ky1.m3106I(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final z62 m4179d0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        e32 e32Var;
        f02 f02Var = (f02) this.f7192j;
        if (TextUtils.isEmpty(str2)) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4607v.m5312a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            b02 b02Var = (b02) a72.m58l0(e02.m1329A(), bArr);
            e32[] e32VarArrValues = e32.values();
            int length = e32VarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    e32Var = e32.f1944p;
                    break;
                }
                e32Var = e32VarArrValues[i3];
                if (e32Var.f1946j == i) {
                    break;
                }
                i3++;
            }
            if (e32Var != e32.f1940l && e32Var != e32.f1943o && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((e02) b02Var.f9011k).m1338t()).iterator();
                while (it.hasNext()) {
                    g02 g02Var = (g02) ((i02) it.next()).m5969k();
                    g02Var.m5681b();
                    ((i02) g02Var.f9011k).m2430X0(i2);
                    arrayList.add((i02) g02Var.m5683d());
                }
                b02Var.m5681b();
                ((e02) b02Var.f9011k).m1334F();
                b02Var.m5681b();
                ((e02) b02Var.f9011k).m1333E(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4600o.m5313b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new z62(j, (e02) b02Var.m5683d(), str2, map, e32Var, j2, j3, j4, i2);
        } catch (IOException e) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4600o.m5314c(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m4180e0() {
        ((f02) this.f7192j).f2252t.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) jx1.f4148S.m2715a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) jx1.f4146R.m2715a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4181g0(String str, l12 l12Var) {
        p80.m3863h(str);
        p80.m3863h(l12Var);
        mo11z();
        m2988B();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", l12Var.m3156g());
        contentValues.put("consent_source", Integer.valueOf(l12Var.f4645b));
        m4175Z(contentValues);
    }

    /* JADX INFO: renamed from: h0 */
    public final List m4182h0(String str) {
        List list;
        String string;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
            sQLiteDatabaseM4191r0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseM4191r0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                p80.m3863h(string);
                            }
                            if (string2 == null) {
                                ky1 ky1Var = f02Var.f2247o;
                                f02.m1560m(ky1Var);
                                ky1Var.f4600o.m5313b(ky1.m3106I(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                qw1 qw1VarM4410t = rw1.m4410t();
                                qw1VarM4410t.m5681b();
                                ((rw1) qw1VarM4410t.f9011k).m4411u(string2);
                                qw1VarM4410t.m5681b();
                                ((rw1) qw1VarM4410t.f9011k).m4414x(j);
                                qw1VarM4410t.m5681b();
                                ((rw1) qw1VarM4410t.f9011k).m4413w(string);
                                if (zIsEmpty) {
                                    qw1VarM4410t.m5681b();
                                    ((rw1) qw1VarM4410t.f9011k).m4412v();
                                }
                                arrayList.add((rw1) qw1VarM4410t.m5683d());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseM4191r0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseM4191r0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseM4191r0.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5314c(ky1.m3106I(str), e, "Error querying or deleting diagnostic signals. appId");
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseM4191r0.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM4191r0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            ky1 ky1Var3 = f02Var.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4600o.m5314c(ky1.m3106I(str), e2, "Error opening database for diagnostic signals. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m4183i0(String str, l12 l12Var) {
        p80.m3863h(str);
        mo11z();
        m2988B();
        m4181g0(str, m4170U(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", l12Var.m3156g());
        m4175Z(contentValues);
    }

    /* JADX INFO: renamed from: j0 */
    public final l12 m4184j0(String str) {
        p80.m3863h(str);
        mo11z();
        m2988B();
        return l12.m3150c(m4174Y("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}), 100);
    }

    /* JADX INFO: renamed from: k0 */
    public final du1 m4185k0(String str, rz1 rz1Var, String str2) {
        du1 du1VarM4176a0 = m4176a0("events", str, rz1Var.m4464y());
        if (du1VarM4176a0 != null) {
            long j = du1VarM4176a0.f1833e + 1;
            long j2 = du1VarM4176a0.f1832d + 1;
            return new du1(du1VarM4176a0.f1829a, du1VarM4176a0.f1830b, du1VarM4176a0.f1831c + 1, j2, j, du1VarM4176a0.f1834f, du1VarM4176a0.f1835g, du1VarM4176a0.f1836h, du1VarM4176a0.f1837i, du1VarM4176a0.f1838j, du1VarM4176a0.f1839k);
        }
        f02 f02Var = (f02) this.f7192j;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4603r.m5314c(ky1.m3106I(str), f02Var.f2251s.m1043a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new du1(str, rz1Var.m4464y(), 1L, 1L, 1L, rz1Var.m4440A(), 0L, null, null, null, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m4186l0() {
        return ((f02) this.f7192j).f2242j.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: m0 */
    public final void m4187m0(String str, long j, long j2, C0593pt c0593pt) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jM4173X;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        qz1 qz1Var;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM4191r0 = m4191r0();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM4191r0.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        i02 i02Var = (i02) ((g02) a72.m58l0(i02.m2358Y(), cursorRawQuery.getBlob(0))).m5683d();
                                        if (cursorRawQuery.moveToNext()) {
                                            ky1 ky1Var = f02Var.f2247o;
                                            f02.m1560m(ky1Var);
                                            ky1Var.f4603r.m5313b(ky1.m3106I(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        c0593pt.f6248k = i02Var;
                                        jM4173X = m4173X("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jM4173X != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        qz1Var = (qz1) a72.m58l0(rz1.m4439J(), blob);
                                                        qz1Var.m4215n(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        qz1Var.m5681b();
                                                        ((rz1) qz1Var.f9011k).m4455Q(j6);
                                                        qz1Var.m5681b();
                                                        ((rz1) qz1Var.f9011k).m4459t(j5);
                                                        if (!c0593pt.m3984b(j4, (rz1) qz1Var.m5683d())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        ky1 ky1Var2 = f02Var.f2247o;
                                                        f02.m1560m(ky1Var2);
                                                        ky1Var2.f4600o.m5314c(ky1.m3106I(r3), e, "Data loss. Failed to merge raw event. appId");
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                ky1 ky1Var3 = f02Var.f2247o;
                                                f02.m1560m(ky1Var3);
                                                ky1Var3.f4603r.m5313b(ky1.m3106I(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jM4173X != -1) {
                                            jM4173X = Math.min(j3, jM4173X);
                                        } else if (j3 != -1) {
                                            jM4173X = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jM4173X)};
                                        cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                qz1Var = (qz1) a72.m58l0(rz1.m4439J(), blob2);
                                                qz1Var.m4215n(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                qz1Var.m5681b();
                                                ((rz1) qz1Var.f9011k).m4455Q(j8);
                                                qz1Var.m5681b();
                                                ((rz1) qz1Var.f9011k).m4459t(j7);
                                                if (!c0593pt.m3984b(j4, (rz1) qz1Var.m5683d())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            ky1 ky1Var4 = f02Var.f2247o;
                                            f02.m1560m(ky1Var4);
                                            ky1Var4.f4603r.m5313b(ky1.m3106I(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        ky1 ky1Var5 = f02Var.f2247o;
                                        f02.m1560m(ky1Var5);
                                        ky1Var5.f4600o.m5314c(ky1.m3106I(r3), e2, "Data loss. Failed to merge raw event metadata. appId");
                                    }
                                } else {
                                    ky1 ky1Var6 = f02Var.f2247o;
                                    f02.m1560m(ky1Var6);
                                    ky1Var6.f4600o.m5313b(ky1.m3106I(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                ky1 ky1Var7 = f02Var.f2247o;
                                f02.m1560m(ky1Var7);
                                ky1Var7.f4600o.m5314c(ky1.m3106I(string), e, "Data loss. Error selecting raw event. appId");
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM4191r0.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                ky1 ky1Var8 = f02Var.f2247o;
                                f02.m1560m(ky1Var8);
                                ky1Var8.f4600o.m5313b(ky1.m3106I(r3), "Raw event metadata record is missing. appId");
                            } else {
                                i02 i02Var2 = (i02) ((g02) a72.m58l0(i02.m2358Y(), cursorRawQuery.getBlob(0))).m5683d();
                                if (cursorRawQuery.moveToNext()) {
                                    ky1 ky1Var9 = f02Var.f2247o;
                                    f02.m1560m(ky1Var9);
                                    ky1Var9.f4603r.m5313b(ky1.m3106I(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                c0593pt.f6248k = i02Var2;
                                jM4173X = m4173X("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j2 == -1) {
                                    if (jM4173X != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            qz1Var = (qz1) a72.m58l0(rz1.m4439J(), blob3);
                                            qz1Var.m4215n(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            qz1Var.m5681b();
                                            ((rz1) qz1Var.f9011k).m4455Q(j10);
                                            qz1Var.m5681b();
                                            ((rz1) qz1Var.f9011k).m4459t(j9);
                                            if (!c0593pt.m3984b(j4, (rz1) qz1Var.m5683d())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        ky1 ky1Var10 = f02Var.f2247o;
                                        f02.m1560m(ky1Var10);
                                        ky1Var10.f4603r.m5313b(ky1.m3106I(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jM4173X = j3;
                                    }
                                } else if (j3 != -1) {
                                    jM4173X = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jM4173X)};
                                cursorRawQuery = sQLiteDatabaseM4191r0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        qz1Var = (qz1) a72.m58l0(rz1.m4439J(), blob4);
                                        qz1Var.m4215n(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        qz1Var.m5681b();
                                        ((rz1) qz1Var.f9011k).m4455Q(j12);
                                        qz1Var.m5681b();
                                        ((rz1) qz1Var.f9011k).m4459t(j11);
                                        if (!c0593pt.m3984b(j4, (rz1) qz1Var.m5683d())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    ky1 ky1Var11 = f02Var.f2247o;
                                    f02.m1560m(ky1Var11);
                                    ky1Var11.f4603r.m5313b(ky1.m3106I(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        ky1 ky1Var12 = f02Var.f2247o;
                        f02.m1560m(ky1Var12);
                        ky1Var12.f4600o.m5314c(ky1.m3106I(string), e, "Data loss. Error selecting raw event. appId");
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4188o0() {
        m2988B();
        m4191r0().beginTransaction();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m4189p0() {
        m2988B();
        m4191r0().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m4190q0() {
        m2988B();
        m4191r0().endTransaction();
    }

    /* JADX INFO: renamed from: r0 */
    public final SQLiteDatabase m4191r0() {
        mo11z();
        try {
            return this.f6615m.getWritableDatabase();
        } catch (SQLiteException e) {
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5313b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m4192s0(String str) {
        du1 du1VarM4176a0;
        m4178c0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m4191r0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (du1VarM4176a0 = m4176a0("events", str, string)) != null) {
                            m4177b0("events_snapshot", du1VarM4176a0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                ky1 ky1Var = ((f02) this.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: t0 */
    public final void m4193t0(String str) throws Throwable {
        boolean z;
        du1 du1VarM4176a0;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        du1 du1VarM4176a1 = m4176a0("events", str, "_f");
        du1 du1VarM4176a2 = m4176a0("events", str, "_v");
        m4178c0("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m4191r0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (du1VarM4176a0 = m4176a0("events_snapshot", str, string)) != null) {
                            m4177b0("events", du1VarM4176a0);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            ky1 ky1Var = ((f02) this.f7192j).f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Error querying snapshot. appId");
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && du1VarM4176a1 != null) {
                                m4177b0("events", du1VarM4176a1);
                            } else if (!z && du1VarM4176a2 != null) {
                                m4177b0("events", du1VarM4176a2);
                            }
                            m4178c0("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                m4177b0("events", du1VarM4176a2);
                            }
                        } else if (!z) {
                            m4177b0("events", du1VarM4176a2);
                        }
                        m4178c0("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && du1VarM4176a1 != null) {
                    m4177b0("events", du1VarM4176a1);
                } else if (!z && du1VarM4176a2 != null) {
                    m4177b0("events", du1VarM4176a2);
                }
            } else {
                cursorQuery.close();
                if (du1VarM4176a1 != null) {
                    m4177b0("events", du1VarM4176a1);
                } else if (du1VarM4176a2 != null) {
                    m4177b0("events", du1VarM4176a2);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        m4178c0("events_snapshot", str);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m4194u0(String str, String str2) {
        p80.m3860e(str);
        p80.m3860e(str2);
        mo11z();
        m2988B();
        try {
            m4191r0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            f02 f02Var = (f02) this.f7192j;
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5315d("Error deleting user property. appId", ky1.m3106I(str), f02Var.f2251s.m1045c(str2), e);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m4195v0(d72 d72Var) {
        f02 f02Var = (f02) this.f7192j;
        String str = d72Var.f1572b;
        mo11z();
        m2988B();
        String str2 = d72Var.f1571a;
        String str3 = d72Var.f1573c;
        if (m4196w0(str2, str3) == null) {
            if (f72.m1680B0(str3)) {
                if (m4172W("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(f02Var.f2245m.m768J(str2, jx1.f4154V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM4172W = m4172W("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                f02Var.getClass();
                if (jM4172W >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(d72Var.f1574d));
        m4143n0(contentValues, d72Var.f1575e);
        try {
            if (m4191r0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(ky1.m3106I(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(ky1.m3106I(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: w0 */
    public final d72 m4196w0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        p80.m3860e(str2);
        mo11z();
        m2988B();
        Cursor cursor = null;
        try {
            cursorQuery = m4191r0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objM4163N = m4163N(cursorQuery, 1);
                        if (objM4163N != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                d72 d72Var = new d72(str3, cursorQuery.getString(2), str4, j, objM4163N);
                                if (cursorQuery.moveToNext()) {
                                    ky1 ky1Var = f02Var.f2247o;
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4600o.m5313b(ky1.m3106I(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return d72Var;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4600o.m5315d("Error querying user property. appId", ky1.m3106I(str3), f02Var.f2251s.m1045c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: x0 */
    public final List m4197x0(String str) {
        String str2;
        SQLiteException sQLiteException;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        mo11z();
        m2988B();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                f02Var.getClass();
                cursorQuery = m4191r0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objM4163N = m4163N(cursorQuery, 3);
                        if (objM4163N == null) {
                            try {
                                ky1 ky1Var = f02Var.f2247o;
                                f02.m1560m(ky1Var);
                                ky1Var.f4600o.m5313b(ky1.m3106I(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                ky1 ky1Var2 = f02Var.f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4600o.m5314c(ky1.m3106I(str2), sQLiteException, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new d72(str2, str3, string, j, objM4163N));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            ky1 ky1Var3 = f02Var.f2247o;
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4600o.m5314c(ky1.m3106I(str2), sQLiteException, "Error querying user properties. appId");
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX INFO: renamed from: y0 */
    public final List m4198y0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        f02 f02Var = (f02) this.f7192j;
        p80.m3860e(str);
        mo11z();
        m2988B();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            f02Var.getClass();
            ky1 ky1Var = f02Var.f2247o;
            cursorQuery = m4191r0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    f02.m1560m(ky1Var);
                                    ky1Var.f4600o.m5313b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objM4163N = m4163N(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM4163N == null) {
                                    try {
                                        f02.m1560m(ky1Var);
                                        ky1Var.f4600o.m5315d("(2)Read invalid user property value, ignoring it", ky1.m3106I(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            ky1 ky1Var2 = f02Var.f2247o;
                                            f02.m1560m(ky1Var2);
                                            ky1Var2.f4600o.m5315d("(2)Error querying user properties", ky1.m3106I(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new d72(str, str5, string2, j, objM4163N));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    ky1 ky1Var3 = f02Var.f2247o;
                                    f02.m1560m(ky1Var3);
                                    ky1Var3.f4600o.m5315d("(2)Error querying user properties", ky1.m3106I(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                ky1 ky1Var4 = f02Var.f2247o;
                                f02.m1560m(ky1Var4);
                                ky1Var4.f4600o.m5315d("(2)Error querying user properties", ky1.m3106I(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m4199z0(hr1 hr1Var) {
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        String str = hr1Var.f3299j;
        p80.m3863h(str);
        if (m4196w0(str, hr1Var.f3301l.f749k) == null) {
            long jM4172W = m4172W("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            f02Var.getClass();
            if (jM4172W >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", hr1Var.f3300k);
        contentValues.put("name", hr1Var.f3301l.f749k);
        Object objM600b = hr1Var.f3301l.m600b();
        p80.m3863h(objM600b);
        m4143n0(contentValues, objM600b);
        contentValues.put("active", Boolean.valueOf(hr1Var.f3303n));
        contentValues.put("trigger_event_name", hr1Var.f3304o);
        contentValues.put("trigger_timeout", Long.valueOf(hr1Var.f3306q));
        fu1 fu1Var = hr1Var.f3305p;
        f72 f72Var = f02Var.f2250r;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1558k(f72Var);
        contentValues.put("timed_out_event", f72.m1693k0(fu1Var));
        contentValues.put("creation_timestamp", Long.valueOf(hr1Var.f3302m));
        f02.m1558k(f72Var);
        contentValues.put("triggered_event", f72.m1693k0(hr1Var.f3307r));
        contentValues.put("triggered_timestamp", Long.valueOf(hr1Var.f3301l.f750l));
        contentValues.put("time_to_live", Long.valueOf(hr1Var.f3308s));
        contentValues.put("expired_event", f72.m1693k0(hr1Var.f3309t));
        try {
            if (m4191r0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(ky1.m3106I(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5314c(ky1.m3106I(str), e, "Error storing conditional user property");
            return true;
        }
    }
}
