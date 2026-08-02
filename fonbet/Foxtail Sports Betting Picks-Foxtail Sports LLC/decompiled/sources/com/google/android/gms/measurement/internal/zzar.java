package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzar extends zzot {
    private final zzaz zzm;
    private final zzoh zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    private final int zzr(String str) {
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        try {
            int zzb2 = zze().zzb(str, zzbn.zzv);
            if (zzb2 <= 0) {
                return 0;
            }
            return f_().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(zzb2)});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit queued batches. appId", zzgo.zza(str), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzot
    protected final boolean zzc() {
        return false;
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        try {
            return f_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        try {
            return f_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zze().zzb(str, zzbn.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e);
            return 0L;
        }
    }

    public final long c_() {
        Cursor cursor = null;
        try {
            try {
                cursor = f_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzgf.zzk zzkVar) throws IOException {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzab());
        byte[] zzce = zzkVar.zzce();
        long zza2 = h_().zza(zzce);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzab());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzce);
        try {
            f_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzab()), e);
            throw e;
        }
    }

    public final long zza(String str, zzgf.zzj zzjVar, String str2, Map<String, String> map, zzlu zzluVar, Long l) {
        int delete;
        zzv();
        zzam();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (!zze().zza(zzbn.zzch)) {
            return -1L;
        }
        zzv();
        zzam();
        if (zzab()) {
            long zza2 = zzo().zzb.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzai.zzo()) {
                zzo().zzb.zza(elapsedRealtime);
                zzv();
                zzam();
                if (zzab() && (delete = f_().delete("upload_queue", zzap(), new String[0])) > 0) {
                    zzj().zzq().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                if (zze().zza(zzbn.zzcj)) {
                    zzr(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] zzce = zzjVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzce);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i = 1;
            while (i < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i);
                i++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzluVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = f_().insert("upload_queue", null, contentValues);
            if (insert == -1) {
                zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            }
            return insert;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e);
            return -1L;
        }
    }

    protected final long zzb(String str, String str2) {
        long zza2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        SQLiteDatabase f_ = f_();
        f_.beginTransaction();
        long j = 0;
        try {
            try {
                zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (f_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    zza2 = 0;
                }
            } catch (SQLiteException e) {
                e = e;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + zza2));
                if (f_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                    return -1L;
                }
                f_.setTransactionSuccessful();
                return zza2;
            } catch (SQLiteException e2) {
                e = e2;
                j = zza2;
                zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                return j;
            }
        } finally {
            f_.endTransaction();
        }
    }

    public final long d_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long e_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = f_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = f_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    final SQLiteDatabase f_() {
        zzv();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzr().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0089: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0089 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzc(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzv();
        zzam();
        Cursor cursor3 = null;
        try {
            try {
                cursor = f_().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzq().zza("Default event parameters not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        zzgf.zzf zzfVar = (zzgf.zzf) ((com.google.android.gms.internal.measurement.zzkg) ((zzgf.zzf.zza) zzpj.zza(zzgf.zzf.zze(), cursor.getBlob(0))).zzaj());
                        h_();
                        Bundle zza2 = zzpj.zza(zzfVar.zzh());
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zza2;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to retrieve default event parameters. appId", zzgo.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<zzgf.zzf, Long> zza(String str, Long l) {
        Cursor cursor;
        Cursor cursor2;
        zzv();
        zzam();
        Cursor cursor3 = null;
        try {
            try {
                cursor = f_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzq().zza("Main event not found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    try {
                        Pair<zzgf.zzf, Long> create = Pair.create((zzgf.zzf) ((com.google.android.gms.internal.measurement.zzkg) ((zzgf.zzf.zza) zzpj.zza(zzgf.zzf.zze(), cursor.getBlob(0))).zzaj()), Long.valueOf(cursor.getLong(1)));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return create;
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge main event. appId, eventId", zzgo.zza(str), l, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error selecting main event", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0271 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0291 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d8 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fe A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0355 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0368 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0388 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a0 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0340 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0315 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262 A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020d A[Catch: SQLiteException -> 0x03b7, all -> 0x03df, TryCatch #0 {SQLiteException -> 0x03b7, blocks: (B:8:0x0137, B:14:0x0143, B:16:0x015c, B:17:0x0163, B:19:0x0178, B:20:0x017f, B:22:0x01be, B:26:0x01c8, B:29:0x0212, B:31:0x0241, B:35:0x024b, B:38:0x0266, B:40:0x0271, B:41:0x0283, B:43:0x0291, B:44:0x029a, B:46:0x02a2, B:49:0x02ab, B:51:0x02d8, B:53:0x02e4, B:54:0x02f6, B:56:0x02fe, B:59:0x0307, B:62:0x0320, B:65:0x034a, B:67:0x0355, B:68:0x0360, B:70:0x0368, B:71:0x0373, B:73:0x0388, B:75:0x0390, B:76:0x0397, B:78:0x03a0, B:83:0x0340, B:84:0x0315, B:87:0x031c, B:90:0x0262, B:92:0x020d), top: B:7:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03db  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.google.android.gms.measurement.internal.zzh] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzd(String str) {
        Cursor cursor;
        ?? r16;
        Cursor cursor2;
        Cursor cursor3;
        SQLiteDatabase f_;
        String[] strArr;
        boolean z;
        boolean z2;
        Boolean valueOf;
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        try {
            f_ = f_();
            strArr = new String[45];
            strArr[0] = "app_instance_id";
            strArr[1] = "gmp_app_id";
            strArr[2] = "resettable_device_id_hash";
            strArr[3] = "last_bundle_index";
            strArr[4] = "last_bundle_start_timestamp";
            strArr[5] = "last_bundle_end_timestamp";
            strArr[6] = "app_version";
            strArr[7] = "app_store";
            strArr[8] = "gmp_version";
            strArr[9] = "dev_cert_hash";
            cursor = null;
            r16 = 0;
            r16 = 0;
        } catch (SQLiteException e) {
            e = e;
            r16 = 0;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            strArr[10] = "measurement_enabled";
            strArr[11] = "day";
            strArr[12] = "daily_public_events_count";
            strArr[13] = "daily_events_count";
            strArr[14] = "daily_conversions_count";
            strArr[15] = "config_fetched_time";
            strArr[16] = "failed_config_fetch_time";
            strArr[17] = "app_version_int";
            strArr[18] = "firebase_instance_id";
            strArr[19] = "daily_error_events_count";
            strArr[20] = "daily_realtime_events_count";
            strArr[21] = "health_monitor_sample";
            strArr[22] = "android_id";
            strArr[23] = "adid_reporting_enabled";
            strArr[24] = "admob_app_id";
            strArr[25] = "dynamite_version";
            strArr[26] = "safelisted_events";
            strArr[27] = "ga_app_id";
            strArr[28] = "session_stitching_token";
            strArr[29] = "sgtm_upload_enabled";
            strArr[30] = "target_os_version";
            strArr[31] = "session_stitching_token_hash";
            strArr[32] = "ad_services_version";
            strArr[33] = "unmatched_first_open_without_ad_id";
            strArr[34] = "npa_metadata_value";
            strArr[35] = "attribution_eligibility_status";
            strArr[36] = "sgtm_preview_key";
            strArr[37] = "dma_consent_state";
            strArr[38] = "daily_realtime_dcu_count";
            strArr[39] = "bundle_delivery_index";
            strArr[40] = "serialized_npa_metadata";
            strArr[41] = "unmatched_pfo";
            strArr[42] = "unmatched_uwa";
            strArr[43] = "ad_campaign_info";
            strArr[44] = "client_upload_eligibility";
            cursor3 = f_.query("apps", strArr, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor3.moveToFirst()) {
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzg.zzk(), str);
                    if (this.zzg.zzb(str).zza(zzjj.zza.ANALYTICS_STORAGE)) {
                        zzhVar.zzb(cursor3.getString(0));
                    }
                    zzhVar.zzf(cursor3.getString(1));
                    if (this.zzg.zzb(str).zza(zzjj.zza.AD_STORAGE)) {
                        zzhVar.zzh(cursor3.getString(2));
                    }
                    zzhVar.zzq(cursor3.getLong(3));
                    zzhVar.zzr(cursor3.getLong(4));
                    zzhVar.zzp(cursor3.getLong(5));
                    zzhVar.zzd(cursor3.getString(6));
                    zzhVar.zzc(cursor3.getString(7));
                    zzhVar.zzn(cursor3.getLong(8));
                    zzhVar.zzk(cursor3.getLong(9));
                    if (!cursor3.isNull(10) && cursor3.getInt(10) == 0) {
                        z = false;
                        zzhVar.zzb(z);
                        zzhVar.zzj(cursor3.getLong(11));
                        zzhVar.zzh(cursor3.getLong(12));
                        zzhVar.zzg(cursor3.getLong(13));
                        zzhVar.zze(cursor3.getLong(14));
                        zzhVar.zzd(cursor3.getLong(15));
                        zzhVar.zzm(cursor3.getLong(16));
                        zzhVar.zzb(!cursor3.isNull(17) ? -2147483648L : cursor3.getInt(17));
                        zzhVar.zze(cursor3.getString(18));
                        zzhVar.zzf(cursor3.getLong(19));
                        zzhVar.zzi(cursor3.getLong(20));
                        zzhVar.zzg(cursor3.getString(21));
                        if (!cursor3.isNull(23) && cursor3.getInt(23) == 0) {
                            z2 = false;
                            zzhVar.zza(z2);
                            zzhVar.zza(cursor3.getString(24));
                            zzhVar.zzl(!cursor3.isNull(25) ? 0L : cursor3.getLong(25));
                            if (!cursor3.isNull(26)) {
                                zzhVar.zza(Arrays.asList(cursor3.getString(26).split(",", -1)));
                            }
                            if (this.zzg.zzb(str).zza(zzjj.zza.ANALYTICS_STORAGE)) {
                                zzhVar.zzj(cursor3.getString(28));
                            }
                            zzhVar.zzc(cursor3.isNull(29) && cursor3.getInt(29) != 0);
                            zzhVar.zzo(cursor3.getLong(39));
                            zzhVar.zzk(cursor3.getString(36));
                            zzhVar.zzt(cursor3.getLong(30));
                            zzhVar.zzs(cursor3.getLong(31));
                            if (com.google.android.gms.internal.measurement.zzoy.zza() && zze().zze(str, zzbn.zzcp)) {
                                zzhVar.zza(cursor3.getInt(32));
                                zzhVar.zzc(cursor3.getLong(35));
                            }
                            zzhVar.zzd(cursor3.isNull(33) && cursor3.getInt(33) != 0);
                            if (cursor3.isNull(34)) {
                                valueOf = Boolean.valueOf(cursor3.getInt(34) != 0);
                            } else {
                                valueOf = null;
                            }
                            zzhVar.zza(valueOf);
                            zzhVar.zzd(cursor3.getInt(37));
                            zzhVar.zzc(cursor3.getInt(38));
                            zzhVar.zzi(!cursor3.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursor3.getString(40)));
                            if (!cursor3.isNull(41)) {
                                zzhVar.zza(Long.valueOf(cursor3.getLong(41)));
                            }
                            if (!cursor3.isNull(42)) {
                                zzhVar.zzb(Long.valueOf(cursor3.getLong(42)));
                            }
                            zzhVar.zza(cursor3.getBlob(43));
                            if (zze().zze(str, zzbn.zzcj) && !cursor3.isNull(44)) {
                                zzhVar.zzb(cursor3.getInt(44));
                            }
                            zzhVar.zzao();
                            if (cursor3.moveToNext()) {
                                zzj().zzg().zza("Got multiple records for app, expected one. appId", zzgo.zza(str));
                            }
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            return zzhVar;
                        }
                        z2 = true;
                        zzhVar.zza(z2);
                        zzhVar.zza(cursor3.getString(24));
                        zzhVar.zzl(!cursor3.isNull(25) ? 0L : cursor3.getLong(25));
                        if (!cursor3.isNull(26)) {
                        }
                        if (this.zzg.zzb(str).zza(zzjj.zza.ANALYTICS_STORAGE)) {
                        }
                        zzhVar.zzc(cursor3.isNull(29) && cursor3.getInt(29) != 0);
                        zzhVar.zzo(cursor3.getLong(39));
                        zzhVar.zzk(cursor3.getString(36));
                        zzhVar.zzt(cursor3.getLong(30));
                        zzhVar.zzs(cursor3.getLong(31));
                        if (com.google.android.gms.internal.measurement.zzoy.zza()) {
                            zzhVar.zza(cursor3.getInt(32));
                            zzhVar.zzc(cursor3.getLong(35));
                        }
                        zzhVar.zzd(cursor3.isNull(33) && cursor3.getInt(33) != 0);
                        if (cursor3.isNull(34)) {
                        }
                        zzhVar.zza(valueOf);
                        zzhVar.zzd(cursor3.getInt(37));
                        zzhVar.zzc(cursor3.getInt(38));
                        zzhVar.zzi(!cursor3.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursor3.getString(40)));
                        if (!cursor3.isNull(41)) {
                        }
                        if (!cursor3.isNull(42)) {
                        }
                        zzhVar.zza(cursor3.getBlob(43));
                        if (zze().zze(str, zzbn.zzcj)) {
                            zzhVar.zzb(cursor3.getInt(44));
                        }
                        zzhVar.zzao();
                        if (cursor3.moveToNext()) {
                        }
                        if (cursor3 != null) {
                        }
                        return zzhVar;
                    }
                    z = true;
                    zzhVar.zzb(z);
                    zzhVar.zzj(cursor3.getLong(11));
                    zzhVar.zzh(cursor3.getLong(12));
                    zzhVar.zzg(cursor3.getLong(13));
                    zzhVar.zze(cursor3.getLong(14));
                    zzhVar.zzd(cursor3.getLong(15));
                    zzhVar.zzm(cursor3.getLong(16));
                    zzhVar.zzb(!cursor3.isNull(17) ? -2147483648L : cursor3.getInt(17));
                    zzhVar.zze(cursor3.getString(18));
                    zzhVar.zzf(cursor3.getLong(19));
                    zzhVar.zzi(cursor3.getLong(20));
                    zzhVar.zzg(cursor3.getString(21));
                    if (!cursor3.isNull(23)) {
                        z2 = false;
                        zzhVar.zza(z2);
                        zzhVar.zza(cursor3.getString(24));
                        zzhVar.zzl(!cursor3.isNull(25) ? 0L : cursor3.getLong(25));
                        if (!cursor3.isNull(26)) {
                        }
                        if (this.zzg.zzb(str).zza(zzjj.zza.ANALYTICS_STORAGE)) {
                        }
                        zzhVar.zzc(cursor3.isNull(29) && cursor3.getInt(29) != 0);
                        zzhVar.zzo(cursor3.getLong(39));
                        zzhVar.zzk(cursor3.getString(36));
                        zzhVar.zzt(cursor3.getLong(30));
                        zzhVar.zzs(cursor3.getLong(31));
                        if (com.google.android.gms.internal.measurement.zzoy.zza()) {
                        }
                        zzhVar.zzd(cursor3.isNull(33) && cursor3.getInt(33) != 0);
                        if (cursor3.isNull(34)) {
                        }
                        zzhVar.zza(valueOf);
                        zzhVar.zzd(cursor3.getInt(37));
                        zzhVar.zzc(cursor3.getInt(38));
                        zzhVar.zzi(!cursor3.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursor3.getString(40)));
                        if (!cursor3.isNull(41)) {
                        }
                        if (!cursor3.isNull(42)) {
                        }
                        zzhVar.zza(cursor3.getBlob(43));
                        if (zze().zze(str, zzbn.zzcj)) {
                        }
                        zzhVar.zzao();
                        if (cursor3.moveToNext()) {
                        }
                        if (cursor3 != null) {
                        }
                        return zzhVar;
                    }
                    z2 = true;
                    zzhVar.zza(z2);
                    zzhVar.zza(cursor3.getString(24));
                    zzhVar.zzl(!cursor3.isNull(25) ? 0L : cursor3.getLong(25));
                    if (!cursor3.isNull(26)) {
                    }
                    if (this.zzg.zzb(str).zza(zzjj.zza.ANALYTICS_STORAGE)) {
                    }
                    zzhVar.zzc(cursor3.isNull(29) && cursor3.getInt(29) != 0);
                    zzhVar.zzo(cursor3.getLong(39));
                    zzhVar.zzk(cursor3.getString(36));
                    zzhVar.zzt(cursor3.getLong(30));
                    zzhVar.zzs(cursor3.getLong(31));
                    if (com.google.android.gms.internal.measurement.zzoy.zza()) {
                    }
                    zzhVar.zzd(cursor3.isNull(33) && cursor3.getInt(33) != 0);
                    if (cursor3.isNull(34)) {
                    }
                    zzhVar.zza(valueOf);
                    zzhVar.zzd(cursor3.getInt(37));
                    zzhVar.zzc(cursor3.getInt(38));
                    zzhVar.zzi(!cursor3.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursor3.getString(40)));
                    if (!cursor3.isNull(41)) {
                    }
                    if (!cursor3.isNull(42)) {
                    }
                    zzhVar.zza(cursor3.getBlob(43));
                    if (zze().zze(str, zzbn.zzcj)) {
                    }
                    zzhVar.zzao();
                    if (cursor3.moveToNext()) {
                    }
                    if (cursor3 != null) {
                    }
                    return zzhVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().zzg().zza("Error querying app. appId", zzgo.zza(str), e);
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    return r16;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor3;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor3 = r16;
            zzj().zzg().zza("Error querying app. appId", zzgo.zza(str), e);
            if (cursor3 != null) {
            }
            return r16;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [com.google.android.gms.measurement.internal.zzag] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzag zzc(String str, String str2) {
        Cursor cursor;
        zzar zzarVar;
        String str3;
        ?? r16;
        Cursor cursor2;
        Cursor cursor3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        try {
            cursor = null;
            r16 = 0;
            r16 = 0;
            r16 = 0;
        } catch (SQLiteException e) {
            e = e;
            zzarVar = this;
            str3 = str2;
            r16 = 0;
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            cursor3 = f_().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            zzarVar = this;
            str3 = str2;
            cursor3 = r16;
            zzarVar.zzj().zzg().zza("Error querying conditional property", zzgo.zza(str), zzarVar.zzi().zzc(str3), e);
            if (cursor3 != null) {
            }
            return r16;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
            }
            throw th;
        }
        try {
            if (!cursor3.moveToFirst()) {
                if (cursor3 != null) {
                    cursor3.close();
                }
                return null;
            }
            String string = cursor3.getString(0);
            if (string == null) {
                string = "";
            }
            zzarVar = this;
            try {
                try {
                    Object zza2 = zzarVar.zza(cursor3, 1);
                    boolean z = cursor3.getInt(2) != 0;
                    String string2 = cursor3.getString(3);
                    long j = cursor3.getLong(4);
                    str3 = str2;
                    String str4 = string;
                    try {
                        zzag zzagVar = new zzag(str, str4, new zzpm(str3, cursor3.getLong(8), zza2, str4), cursor3.getLong(6), z, string2, (zzbl) zzarVar.h_().zza(cursor3.getBlob(5), zzbl.CREATOR), j, (zzbl) zzarVar.h_().zza(cursor3.getBlob(7), zzbl.CREATOR), cursor3.getLong(9), (zzbl) zzarVar.h_().zza(cursor3.getBlob(10), zzbl.CREATOR));
                        if (cursor3.moveToNext()) {
                            zzarVar.zzj().zzg().zza("Got multiple records for conditional property, expected one", zzgo.zza(str), zzarVar.zzi().zzc(str3));
                        }
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return zzagVar;
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzarVar.zzj().zzg().zza("Error querying conditional property", zzgo.zza(str), zzarVar.zzi().zzc(str3), e);
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        return r16;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str3 = str2;
                zzarVar.zzj().zzg().zza("Error querying conditional property", zzgo.zza(str), zzarVar.zzi().zzc(str3), e);
                if (cursor3 != null) {
                }
                return r16;
            }
        } catch (SQLiteException e5) {
            e = e5;
            zzarVar = this;
        } catch (Throwable th4) {
            th = th4;
            cursor2 = cursor3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzat zze(String str) {
        Throwable th;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        Cursor cursor2 = null;
        try {
            cursor = f_().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    byte[] blob = cursor.getBlob(0);
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(2);
                    if (cursor.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for app config, expected one. appId", zzgo.zza(str));
                    }
                    if (blob == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    zzat zzatVar = new zzat(blob, string, string2);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzatVar;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying remote config. appId", zzgo.zza(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    public final zzas zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzas zza(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        String[] strArr = {str};
        zzas zzasVar = new zzas();
        try {
            try {
                SQLiteDatabase f_ = f_();
                cursor2 = f_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor2.moveToFirst()) {
                        zzj().zzr().zza("Not updating daily counts, app is not known. appId", zzgo.zza(str));
                        if (cursor2 != null) {
                            cursor2.close();
                            return zzasVar;
                        }
                    } else {
                        if (cursor2.getLong(0) == j) {
                            zzasVar.zzb = cursor2.getLong(1);
                            zzasVar.zza = cursor2.getLong(2);
                            zzasVar.zzc = cursor2.getLong(3);
                            zzasVar.zzd = cursor2.getLong(4);
                            zzasVar.zze = cursor2.getLong(5);
                            zzasVar.zzf = cursor2.getLong(6);
                            zzasVar.zzg = cursor2.getLong(7);
                        }
                        if (z) {
                            zzasVar.zzb += j2;
                        }
                        if (z2) {
                            zzasVar.zza += j2;
                        }
                        if (z3) {
                            zzasVar.zzc += j2;
                        }
                        if (z4) {
                            zzasVar.zzd += j2;
                        }
                        if (z5) {
                            zzasVar.zze += j2;
                        }
                        if (z6) {
                            zzasVar.zzf += j2;
                        }
                        if (z7) {
                            zzasVar.zzg += j2;
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("day", Long.valueOf(j));
                        contentValues.put("daily_public_events_count", Long.valueOf(zzasVar.zza));
                        contentValues.put("daily_events_count", Long.valueOf(zzasVar.zzb));
                        contentValues.put("daily_conversions_count", Long.valueOf(zzasVar.zzc));
                        contentValues.put("daily_error_events_count", Long.valueOf(zzasVar.zzd));
                        contentValues.put("daily_realtime_events_count", Long.valueOf(zzasVar.zze));
                        contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzasVar.zzf));
                        contentValues.put("daily_registered_triggers_count", Long.valueOf(zzasVar.zzg));
                        f_.update("apps", contentValues, "app_id=?", strArr);
                        if (cursor2 != null) {
                            cursor2.close();
                            return zzasVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error updating daily counts. appId", zzgo.zza(str), e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzasVar;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (0 != 0) {
            }
            throw th;
        }
        return zzasVar;
    }

    public final zzbd zzf(String str) {
        Preconditions.checkNotNull(str);
        zzv();
        zzam();
        return zzbd.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzbh zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzbh zzc(String str, String str2, String str3) {
        String str4;
        Cursor cursor;
        Cursor cursor2;
        Boolean valueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzv();
        zzam();
        Cursor cursor3 = null;
        try {
            cursor = f_().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                long j = cursor.getLong(0);
                long j2 = cursor.getLong(1);
                long j3 = cursor.getLong(2);
                long j4 = 0;
                long j5 = cursor.isNull(3) ? 0L : cursor.getLong(3);
                Long valueOf2 = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
                Long valueOf3 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
                Long valueOf4 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
                if (cursor.isNull(7)) {
                    valueOf = null;
                } else {
                    try {
                        try {
                            valueOf = Boolean.valueOf(cursor.getLong(7) == 1);
                        } catch (SQLiteException e) {
                            e = e;
                            str4 = str3;
                            zzj().zzg().zza("Error querying events. appId", zzgo.zza(str2), zzi().zza(str4), e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                }
                if (!cursor.isNull(8)) {
                    j4 = cursor.getLong(8);
                }
                cursor2 = cursor;
                Long l = valueOf3;
                str4 = str3;
                try {
                    zzbh zzbhVar = new zzbh(str2, str4, j, j2, j4, j3, j5, valueOf2, l, valueOf4, valueOf);
                    if (cursor2.moveToNext()) {
                        zzj().zzg().zza("Got multiple records for event aggregates, expected one. appId", zzgo.zza(str2));
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zzbhVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = cursor2;
                    zzj().zzg().zza("Error querying events. appId", zzgo.zza(str2), zzi().zza(str4), e);
                    if (cursor != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str4 = str3;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
            }
        } catch (SQLiteException e4) {
            e = e4;
            str4 = str3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final zzjj zzg(String str) {
        Preconditions.checkNotNull(str);
        zzv();
        zzam();
        return zzjj.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzjj zzh(String str) {
        Preconditions.checkNotNull(str);
        zzv();
        zzam();
        zzjj zzjjVar = (zzjj) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzaw() { // from class: com.google.android.gms.measurement.internal.zzaq
            @Override // com.google.android.gms.measurement.internal.zzaw
            public final Object zza(Cursor cursor) {
                zzjj zza2;
                zza2 = zzjj.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zzjjVar == null ? zzjj.zza : zzjjVar;
    }

    private final zzpi zza(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3) {
        zzlu zzluVar;
        if (TextUtils.isEmpty(str2)) {
            zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzgf.zzj.zzb zzbVar = (zzgf.zzj.zzb) zzpj.zza(zzgf.zzj.zzb(), bArr);
            zzlu[] values = zzlu.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    zzluVar = values[i3];
                    if (zzluVar.zza() == i) {
                        break;
                    }
                    i3++;
                } else {
                    zzluVar = zzlu.UNKNOWN;
                    break;
                }
            }
            if (zzluVar != zzlu.GOOGLE_SIGNAL && zzluVar != zzlu.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<zzgf.zzk> it = zzbVar.zzd().iterator();
                while (it.hasNext()) {
                    zzgf.zzk.zza zzch = it.next().zzch();
                    zzgf.zzk.zza zzaVar = zzch;
                    zzgf.zzk.zza zzaVar2 = zzch;
                    zzaVar2.zzi(i2);
                    arrayList.add((zzgf.zzk) ((com.google.android.gms.internal.measurement.zzkg) zzaVar2.zzaj()));
                }
                zzbVar.zzb();
                zzbVar.zza(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        zzj().zzg().zza("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new zzph().zzc(j).zza((zzgf.zzj) ((com.google.android.gms.internal.measurement.zzkg) zzbVar.zzaj())).zza(str2).zza(hashMap).zza(zzluVar).zzb(j2).zza(j3).zza();
        } catch (IOException e) {
            zzj().zzg().zza("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpi zzi(String str) {
        Cursor cursor;
        Cursor cursor2;
        zzpi zzpiVar;
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        Cursor cursor3 = null;
        if (!zze().zza(zzbn.zzch)) {
            return null;
        }
        if (zze().zza(zzbn.zzcj)) {
            List<zzpi> zza2 = zza(str, zzop.zza(zzlu.GOOGLE_SIGNAL), 1);
            if (zza2.isEmpty()) {
                return null;
            }
            return zza2.get(0);
        }
        try {
            cursor = null;
            try {
                cursor2 = f_().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id"}, "app_id=? AND NOT " + zzap(), new String[]{str}, null, null, "creation_timestamp ASC", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                try {
                    try {
                        if (!cursor2.moveToFirst()) {
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            return null;
                        }
                        cursor3 = cursor2;
                        try {
                            zzpi zza3 = zza(str, cursor2.getLong(0), cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8));
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            return zza3;
                        } catch (SQLiteException e) {
                            e = e;
                            cursor2 = cursor3;
                            zzpiVar = cursor;
                            zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                            if (cursor2 != null) {
                            }
                            return zzpiVar;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        zzpiVar = cursor;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor2 = cursor;
                zzpiVar = cursor;
                zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                if (cursor2 != null) {
                    cursor2.close();
                }
                return zzpiVar;
            } catch (Throwable th3) {
                th = th3;
                cursor3 = null;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00d8: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:37:0x00d8 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.google.android.gms.measurement.internal.zzpi] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpi zza(long j) {
        ?? r16;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        if (!zze().zza(zzbn.zzcj)) {
            return null;
        }
        zzv();
        zzam();
        try {
            try {
                r16 = 0;
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor;
            }
            try {
                cursor2 = f_().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id"}, "rowId=?", new String[]{String.valueOf(j)}, null, null, null, AppEventsConstants.EVENT_PARAM_VALUE_YES);
                try {
                    if (!cursor2.moveToFirst()) {
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        return null;
                    }
                    zzpi zza2 = zza((String) Preconditions.checkNotNull(cursor2.getString(1)), j, cursor2.getBlob(2), cursor2.getString(3), cursor2.getString(4), cursor2.getInt(5), cursor2.getInt(6), cursor2.getLong(7), cursor2.getLong(8));
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return zza2;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return r16;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = r16;
                zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                if (cursor2 != null) {
                }
                return r16;
            } catch (Throwable th2) {
                th = th2;
                cursor3 = null;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            r16 = 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpo zze(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        Cursor cursor2 = null;
        try {
            cursor = f_().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object zza2 = zza(cursor, 1);
                    if (zza2 == null) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        zzpo zzpoVar = new zzpo(str3, cursor.getString(2), str4, j, zza2);
                        if (cursor.moveToNext()) {
                            zzj().zzg().zza("Got multiple records for user property, expected one. appId", zzgo.zza(str3));
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return zzpoVar;
                    } catch (SQLiteException e) {
                        e = e;
                        sQLiteException = e;
                        zzj().zzg().zza("Error querying user property. appId", zzgo.zza(str3), zzi().zzc(str4), sQLiteException);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    cursor2.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
    }

    private final zzgf.zzk zzb(String str, long j) {
        zzgf.zzk zzkVar;
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, Long.toString(j)}, null, null, "rowid", "2");
                try {
                    try {
                        if (!query.moveToFirst()) {
                            zzj().zzg().zza("Raw event metadata record is missing. appId", zzgo.zza(str));
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        }
                        try {
                            zzkVar = (zzgf.zzk) ((com.google.android.gms.internal.measurement.zzkg) ((zzgf.zzk.zza) zzpj.zza(zzgf.zzk.zzx(), query.getBlob(0))).zzaj());
                            try {
                                if (query.moveToNext()) {
                                    zzj().zzr().zza("Get multiple raw event metadata records, expected one. appId", zzgo.zza(str));
                                }
                                query.close();
                                if (query != null) {
                                    query.close();
                                }
                                return zzkVar;
                            } catch (SQLiteException e) {
                                e = e;
                                cursor = query;
                                zzj().zzg().zza("Data loss. Error selecting raw event. appId", zzgo.zza(str), e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return zzkVar;
                            }
                        } catch (IOException e2) {
                            zzj().zzg().zza("Data loss. Failed to merge raw event metadata. appId", zzgo.zza(str), e2);
                            if (query != null) {
                                query.close();
                            }
                            return null;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzkVar = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            zzkVar = null;
        }
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
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
        if (type == 4) {
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T zza(String str, String[] strArr, zzaw<T> zzawVar) {
        Cursor cursor;
        ?? r0 = 0;
        try {
            try {
                cursor = f_().rawQuery(str, strArr);
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzq().zza("No data found");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    T zza2 = zzawVar.zza(cursor);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zza2;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error querying database.", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
            }
            throw th;
        }
    }

    private final String zzap() {
        long currentTimeMillis = zzb().currentTimeMillis();
        return "(" + String.format(Locale.US, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(zzlu.GOOGLE_SIGNAL.zza()), Long.valueOf(currentTimeMillis), Long.valueOf(zzbn.zzan.zza(null).longValue())) + " OR " + String.format(Locale.US, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", Integer.valueOf(zzlu.GOOGLE_SIGNAL.zza()), Long.valueOf(currentTimeMillis), Long.valueOf(zzai.zzm())) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzb(long j) {
        Cursor cursor;
        zzv();
        zzam();
        Cursor cursor2 = null;
        try {
            try {
                cursor = f_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
                try {
                    if (!cursor.moveToFirst()) {
                        zzj().zzq().zza("No expired configs for apps with pending events");
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Error selecting expired configs", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = j;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g_() {
        Throwable th;
        Cursor cursor;
        try {
            cursor = f_().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().zzg().zza("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = f_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private static String zzb(List<Integer> list) {
        if (list.isEmpty()) {
            return "";
        }
        return String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0173, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<zzgf.zzk, Long>> zza(String str, int i, int i2) {
        byte[] zzc2;
        long j;
        long j2;
        zzv();
        zzam();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!query.moveToFirst()) {
                    List<Pair<zzgf.zzk, Long>> emptyList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (true) {
                    long j3 = query.getLong(0);
                    try {
                        zzc2 = h_().zzc(query.getBlob(i3));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzc2.length + i4 > i2) {
                        break;
                    }
                    try {
                        zzgf.zzk.zza zzaVar = (zzgf.zzk.zza) zzpj.zza(zzgf.zzk.zzx(), zzc2);
                        if (!arrayList.isEmpty()) {
                            zzgf.zzk zzkVar = (zzgf.zzk) ((Pair) arrayList.get(0)).first;
                            zzgf.zzk zzkVar2 = (zzgf.zzk) ((com.google.android.gms.internal.measurement.zzkg) zzaVar.zzaj());
                            if (!zzkVar.zzag().equals(zzkVar2.zzag()) || !zzkVar.zzaf().equals(zzkVar2.zzaf()) || zzkVar.zzaw() != zzkVar2.zzaw() || !zzkVar.zzah().equals(zzkVar2.zzah())) {
                                break;
                            }
                            Iterator<zzgf.zzp> it = zzkVar.zzau().iterator();
                            while (true) {
                                j = -1;
                                if (!it.hasNext()) {
                                    j2 = -1;
                                    break;
                                }
                                zzgf.zzp next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    j2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzgf.zzp> it2 = zzkVar2.zzau().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzgf.zzp next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    j = next2.zzc();
                                    break;
                                }
                            }
                            if (j2 != j) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i4 += zzc2.length;
                        arrayList.add(Pair.create((zzgf.zzk) ((com.google.android.gms.internal.measurement.zzkg) zzaVar.zzaj()), Long.valueOf(j3)));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(str), e2);
                    }
                    if (!query.moveToNext() || i4 > i2) {
                        break;
                    }
                    i3 = 1;
                }
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(str), e3);
                List<Pair<zzgf.zzk, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List<zzag> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzag> zza(String str, String[] strArr) {
        Cursor cursor;
        zzar zzarVar;
        zzv();
        zzam();
        ArrayList arrayList = new ArrayList();
        try {
            int i = 5;
            Cursor query = f_().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
            try {
                if (query.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        zzarVar = this;
                        try {
                            Object zza2 = zzarVar.zza(query, 3);
                            boolean z = query.getInt(4) != 0;
                            arrayList.add(new zzag(string, string2, new zzpm(string3, query.getLong(10), zza2, string2), query.getLong(8), z, query.getString(i), (zzbl) zzarVar.h_().zza(query.getBlob(7), zzbl.CREATOR), query.getLong(6), (zzbl) zzarVar.h_().zza(query.getBlob(9), zzbl.CREATOR), query.getLong(11), (zzbl) zzarVar.h_().zza(query.getBlob(12), zzbl.CREATOR)));
                            if (!query.moveToNext()) {
                                break;
                            }
                            i = 5;
                        } catch (SQLiteException e) {
                            e = e;
                            cursor = query;
                            try {
                                zzarVar.zzj().zzg().zza("Error querying conditional user property value", e);
                                List<zzag> emptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return emptyList;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } else if (query != null) {
                    query.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                zzarVar = this;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e3) {
            e = e3;
            zzarVar = this;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final List<zzog> zzj(String str) {
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = f_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzog(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e);
                List<zzog> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzpi> zza(String str, zzop zzopVar, int i) {
        Cursor cursor;
        String str2;
        Cursor cursor2;
        if (!zze().zza(zzbn.zzcj)) {
            return Collections.emptyList();
        }
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        try {
            int i2 = 3;
            int i3 = 4;
            int i4 = 5;
            int i5 = 6;
            int i6 = 7;
            Cursor query = f_().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id"}, "app_id=?" + zzb(zzopVar.zza) + " AND NOT " + zzap(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            try {
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    ArrayList arrayList2 = arrayList;
                    long j = query.getLong(0);
                    byte[] blob = query.getBlob(2);
                    String string = query.getString(i2);
                    String string2 = query.getString(i3);
                    int i7 = query.getInt(i4);
                    int i8 = query.getInt(i5);
                    int i9 = i2;
                    long j2 = query.getLong(i6);
                    int i10 = i3;
                    int i11 = i4;
                    long j3 = query.getLong(8);
                    int i12 = i6;
                    cursor2 = query;
                    str2 = str;
                    try {
                        zzpi zza2 = zza(str2, j, blob, string, string2, i7, i8, j2, j3);
                        if (zza2 != null) {
                            arrayList2.add(zza2);
                        }
                        arrayList = arrayList2;
                        query = cursor2;
                        i6 = i12;
                        i4 = i11;
                        i3 = i10;
                        i2 = i9;
                        i5 = 6;
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = cursor2;
                        try {
                            zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str2, e);
                            List<zzpi> emptyList = Collections.emptyList();
                            if (cursor != null) {
                                cursor.close();
                            }
                            return emptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                Cursor cursor3 = query;
                ArrayList arrayList3 = arrayList;
                if (cursor3 != null) {
                    cursor3.close();
                }
                return arrayList3;
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = query;
                str2 = str;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final List<zzpo> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = f_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = cursor.getLong(2);
                        Object zza2 = zza(cursor, 3);
                        if (zza2 == null) {
                            zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzgo.zza(str));
                        } else {
                            arrayList.add(new zzpo(str, str2, string, j, zza2));
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                } else if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying user properties. appId", zzgo.zza(str), e);
                List<zzpo> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<zzpo> zzb(String str, String str2, String str3) {
        Cursor cursor;
        zzar zzarVar;
        String str4;
        int i;
        Preconditions.checkNotEmpty(str);
        zzv();
        zzam();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str5 = str;
                arrayList2.add(str5);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = null;
                        zzarVar = this;
                        try {
                            zzarVar.zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                            List<zzpo> emptyList = Collections.emptyList();
                            if (cursor != null) {
                            }
                            return emptyList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                }
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String sb2 = sb.toString();
                    int i2 = 1;
                    Cursor query = f_().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb2, strArr, null, null, "rowid", "1001");
                    try {
                        if (query.moveToFirst()) {
                            while (true) {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string = query.getString(0);
                                long j = query.getLong(i2);
                                zzarVar = this;
                                try {
                                    Object zza2 = zzarVar.zza(query, 2);
                                    str4 = query.getString(3);
                                    if (zza2 == null) {
                                        zzarVar.zzj().zzg().zza("(2)Read invalid user property value, ignoring it", zzgo.zza(str5), str4, str3);
                                        i = i2;
                                    } else {
                                        i = i2;
                                        arrayList.add(new zzpo(str5, str4, string, j, zza2));
                                    }
                                    if (!query.moveToNext()) {
                                        break;
                                    }
                                    str5 = str;
                                    i2 = i;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = query;
                                    zzarVar.zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                                    List<zzpo> emptyList2 = Collections.emptyList();
                                    if (cursor != null) {
                                    }
                                    return emptyList2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = query;
                                    if (cursor != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (query != null) {
                                query.close();
                            }
                        } else if (query != null) {
                            query.close();
                            return arrayList;
                        }
                        return arrayList;
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzarVar = this;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    zzarVar = this;
                    cursor = null;
                    zzarVar.zzj().zzg().zza("(2)Error querying user properties", zzgo.zza(str), str4, e);
                    List<zzpo> emptyList22 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyList22;
                }
            } catch (SQLiteException e5) {
                e = e5;
                zzarVar = this;
                str4 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
        }
    }

    final Map<Integer, zzgf.zzm> zzl(String str) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzgf.zzm> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzgf.zzm) ((com.google.android.gms.internal.measurement.zzkg) ((zzgf.zzm.zza) zzpj.zza(zzgf.zzm.zze(), query.getBlob(1))).zzaj()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e2);
                Map<Integer, zzgf.zzm> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzfw.zzb>> zzm(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfw.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfw.zzb zzbVar = (zzfw.zzb) ((com.google.android.gms.internal.measurement.zzkg) ((zzfw.zzb.zza) zzpj.zza(zzfw.zzb.zzc(), query.getBlob(1))).zzaj());
                        if (zzbVar.zzk()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } finally {
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
            Map<Integer, List<zzfw.zzb>> emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    final Map<Integer, List<zzfw.zzb>> zzf(String str, String str2) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfw.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfw.zzb zzbVar = (zzfw.zzb) ((com.google.android.gms.internal.measurement.zzkg) ((zzfw.zzb.zza) zzpj.zza(zzfw.zzb.zzc(), query.getBlob(1))).zzaj());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfw.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<zzfw.zze>> zzg(String str, String str2) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = f_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfw.zze>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfw.zze zzeVar = (zzfw.zze) ((com.google.android.gms.internal.measurement.zzkg) ((zzfw.zze.zza) zzpj.zza(zzfw.zze.zzc(), query.getBlob(1))).zzaj());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfw.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } finally {
        }
    }

    final Map<Integer, List<Integer>> zzn(String str) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = f_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return emptyMap;
                }
                do {
                    int i = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return arrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    zzar(zzou zzouVar) {
        super(zzouVar);
        this.zzn = new zzoh(zzb());
        this.zzm = new zzaz(this, zza(), "google_app_measurement.db");
    }

    public final void zza(String str, Long l, String str2, Bundle bundle) {
        zzax zzaxVar;
        zzgf.zzk zzb2;
        zzar zzarVar = this;
        String str3 = str;
        Preconditions.checkNotNull(bundle);
        zzarVar.zzv();
        zzarVar.zzam();
        if (zzarVar.zze().zza(zzbn.zzcz) && l != null) {
            zzaxVar = new zzax(zzarVar, str3, l.longValue());
        } else {
            zzaxVar = new zzax(zzarVar, str3);
        }
        zzax zzaxVar2 = zzaxVar;
        List<zzav> zza2 = zzaxVar2.zza();
        while (!zza2.isEmpty()) {
            for (zzav zzavVar : zza2) {
                if (!TextUtils.isEmpty(str2) && (zzb2 = zzarVar.zzb(str3, zzavVar.zzb)) != null) {
                    Iterator<zzgf.zzp> it = zzb2.zzau().iterator();
                    while (it.hasNext()) {
                        if (it.next().zzg().equals(str2)) {
                            break;
                        }
                    }
                }
                zzpj h_ = zzarVar.h_();
                zzgf.zzf zzfVar = zzavVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzgf.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (!zzhVar.zzi().isEmpty()) {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzpj.zzb(zzhVar.zzi()));
                    } else {
                        h_.zzj().zzg().zza("Unexpected parameter type for parameter", zzhVar);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String zzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(zzg, string, bundle2, zzfVar.zzd());
                zzarVar.zzs().zza(zzgsVar.zzc, bundle);
                zzarVar.zza(zzavVar.zza, new zzbe(zzarVar.zzu, zzgsVar.zzb, str3, zzavVar.zzd.zzg(), zzavVar.zzd.zzd(), zzavVar.zzd.zzc(), zzgsVar.zzc), zzavVar.zzb, zzavVar.zzc);
                zzarVar = this;
                str3 = str;
            }
            zza2 = zzaxVar2.zza();
            zzarVar = this;
            str3 = str;
        }
    }

    public final void zzq() {
        zzam();
        f_().beginTransaction();
    }

    private final void zzj(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        try {
            f_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e);
        }
    }

    public final void zzo(String str) {
        zzbh zzd2;
        zzj("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = f_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } finally {
        }
    }

    public final void zza(Long l) {
        zzv();
        zzam();
        Preconditions.checkNotNull(l);
        if (zze().zza(zzbn.zzch)) {
            try {
                if (f_().delete("upload_queue", "rowid=?", new String[]{String.valueOf(l)}) != 1) {
                    zzj().zzr().zza("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e) {
                zzj().zzg().zza("Failed to delete a MeasurementBatch in a upload_queue table", e);
                throw e;
            }
        }
    }

    public final void zzr() {
        zzam();
        f_().endTransaction();
    }

    final void zza(List<Long> list) {
        zzv();
        zzam();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzab()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzr().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                f_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzb(Long l) {
        zzv();
        zzam();
        Preconditions.checkNotNull(l);
        if (zze().zza(zzbn.zzch) && zzab()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzr().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                f_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzw() {
        int delete;
        zzv();
        zzam();
        if (zzab()) {
            long zza2 = zzo().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzai.zzo()) {
                zzo().zza.zza(elapsedRealtime);
                zzv();
                zzam();
                if (!zzab() || (delete = f_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzai.zzm())})) <= 0) {
                    return;
                }
                zzj().zzq().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzv();
        zzam();
        try {
            f_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp(String str) {
        boolean z;
        zzbh zzc2;
        boolean z2 = false;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zzbh zzd2 = zzd(str, "_f");
        zzbh zzd3 = zzd(str, "_v");
        zzj("events", str);
        Cursor cursor = null;
        try {
            cursor = f_().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                if (zzd2 != null) {
                    zza("events", zzd2);
                } else if (zzd3 != null) {
                    zza("events", zzd3);
                }
                zzj("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursor.getString(0);
                    if (cursor.getLong(1) >= 1) {
                        if ("_f".equals(string)) {
                            z3 = true;
                        } else if ("_v".equals(string)) {
                            z = true;
                        }
                    }
                    if (string != null && (zzc2 = zzc("events_snapshot", str, string)) != null) {
                        zza("events", zzc2);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().zzg().zza("Error querying snapshot. appId", zzgo.zza(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (!z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzj("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (z2 && zzd2 != null) {
                            zza("events", zzd2);
                        } else if (!z && zzd3 != null) {
                            zza("events", zzd3);
                        }
                        zzj("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    if (cursor != null) {
                    }
                    if (z2) {
                    }
                    if (!z) {
                        zza("events", zzd3);
                    }
                    zzj("events_snapshot", str);
                    throw th;
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            if (!z3 && zzd2 != null) {
                zza("events", zzd2);
            } else if (!z && zzd3 != null) {
                zza("events", zzd3);
            }
            zzj("events_snapshot", str);
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    final void zza(String str, List<zzfw.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzfw.zza.C0002zza zzch = list.get(i).zzch();
            if (zzch.zza() != 0) {
                for (int i2 = 0; i2 < zzch.zza(); i2++) {
                    zzfw.zzb.zza zzch2 = zzch.zza(i2).zzch();
                    zzfw.zzb.zza zzaVar = (zzfw.zzb.zza) ((zzkg.zza) zzch2.clone());
                    String zzb2 = zzjp.zzb(zzch2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzch2.zza(); i3++) {
                        zzfw.zzc zza2 = zzch2.zza(i3);
                        String zza3 = zzjo.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzfw.zzc) ((com.google.android.gms.internal.measurement.zzkg) zza2.zzch().zza(zza3).zzaj()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzch = zzch.zza(i2, zzaVar);
                        list.set(i, (zzfw.zza) ((com.google.android.gms.internal.measurement.zzkg) zzch.zzaj()));
                    }
                }
            }
            if (zzch.zzb() != 0) {
                for (int i4 = 0; i4 < zzch.zzb(); i4++) {
                    zzfw.zze zzb3 = zzch.zzb(i4);
                    String zza4 = zzjr.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzch = zzch.zza(i4, zzb3.zzch().zza(zza4));
                        list.set(i, (zzfw.zza) ((com.google.android.gms.internal.measurement.zzkg) zzch.zzaj()));
                    }
                }
            }
        }
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase f_ = f_();
        f_.beginTransaction();
        try {
            zzam();
            zzv();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase f_2 = f_();
            f_2.delete("property_filters", "app_id=?", new String[]{str});
            f_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfw.zza zzaVar2 : list) {
                zzam();
                zzv();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzr().zza("Audience with no ID. appId", zzgo.zza(str));
                } else {
                    int zza5 = zzaVar2.zza();
                    Iterator<zzfw.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzr().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzfw.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzr().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfw.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzfw.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzam();
                                        zzv();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase f_3 = f_();
                                        f_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        f_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfw.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            f_.setTransactionSuccessful();
        } finally {
            f_.endTransaction();
        }
    }

    public final void zzx() {
        zzam();
        f_().setTransactionSuccessful();
    }

    public final void zza(zzh zzhVar, boolean z, boolean z2) {
        Preconditions.checkNotNull(zzhVar);
        zzv();
        zzam();
        String zzac = zzhVar.zzac();
        Preconditions.checkNotNull(zzac);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzac);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzb(zzac).zza(zzjj.zza.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzad());
        }
        contentValues.put("gmp_app_id", zzhVar.zzah());
        if (this.zzg.zzb(zzac).zza(zzjj.zza.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzaj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzt()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzu()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzs()));
        contentValues.put("app_version", zzhVar.zzaf());
        contentValues.put("app_store", zzhVar.zzae());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzq()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzn()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzar()));
        contentValues.put("day", Long.valueOf(zzhVar.zzm()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzk()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzj()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzg()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zze()));
        contentValues.put("firebase_instance_id", zzhVar.zzag());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzl()));
        contentValues.put("health_monitor_sample", zzhVar.zzai());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("admob_app_id", zzhVar.zzaa());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzo()));
        if (this.zzg.zzb(zzac).zza(zzjj.zza.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzal());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzat()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzw()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzv()));
        if (com.google.android.gms.internal.measurement.zzoy.zza() && zze().zze(zzac, zzbn.zzcp)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zza()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzf()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzau()));
        contentValues.put("npa_metadata_value", zzhVar.zzx());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzr()));
        contentValues.put("sgtm_preview_key", zzhVar.zzam());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzd()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzc()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzak());
        if (zze().zze(zzac, zzbn.zzcj)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzb()));
        }
        List<String> zzan = zzhVar.zzan();
        if (zzan != null) {
            if (zzan.isEmpty()) {
                zzj().zzr().zza("Safelisted events should not be an empty list. appId", zzac);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", zzan));
            }
        }
        if (com.google.android.gms.internal.measurement.zzog.zza() && zze().zza(zzbn.zzce) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzy());
        contentValues.put("unmatched_uwa", zzhVar.zzz());
        contentValues.put("ad_campaign_info", zzhVar.zzav());
        try {
            SQLiteDatabase f_ = f_();
            if (f_.update("apps", contentValues, "app_id = ?", new String[]{zzac}) == 0 && f_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update app (got -1). appId", zzgo.zza(zzac));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing app. appId", zzgo.zza(zzac), e);
        }
    }

    public final void zza(String str, zzbd zzbdVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzbdVar);
        zzv();
        zzam();
        if (zzh(str) == zzjj.zza) {
            zzb(str, zzjj.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzbdVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzbh zzbhVar) {
        zza("events", zzbhVar);
    }

    private final void zza(String str, zzbh zzbhVar) {
        Preconditions.checkNotNull(zzbhVar);
        zzv();
        zzam();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbhVar.zza);
        contentValues.put("name", zzbhVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbhVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbhVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbhVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbhVar.zzg));
        contentValues.put("last_bundled_day", zzbhVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbhVar.zzi);
        contentValues.put("last_sampling_rate", zzbhVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbhVar.zze));
        contentValues.put("last_exempt_from_sampling", (zzbhVar.zzk == null || !zzbhVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (f_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbhVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbhVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase f_ = f_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
            } else if (f_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && f_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e);
        }
    }

    public final void zza(String str, zzjj zzjjVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjjVar);
        zzv();
        zzam();
        zzb(str, zzh(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjjVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zzb(String str, zzjj zzjjVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjjVar);
        zzv();
        zzam();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjjVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjjVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzam();
        zzv();
        SQLiteDatabase f_ = f_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, zze().zzb(str, zzbn.zzap)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return f_.delete("audience_filter_values", new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(new StringBuilder("(").append(TextUtils.join(",", arrayList)).append(")").toString()).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zzq(String str) {
        if (!zze().zza(zzbn.zzch)) {
            return false;
        }
        if (!zze().zza(zzbn.zzcj)) {
            return zzb(new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ").append(zzap()).toString(), new String[]{str}) != 0;
        }
        zzlu[] zzluVarArr = {zzlu.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i <= 0; i++) {
            arrayList.add(Integer.valueOf(zzluVarArr[0].zza()));
        }
        return zzb(new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?").append(zzb(arrayList)).append(" AND NOT ").append(zzap()).toString(), new String[]{str}) != 0;
    }

    public final boolean zzi(String str, String str2) {
        return zzb("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzaa() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean zza(zzgf.zzk zzkVar, boolean z) {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzab());
        Preconditions.checkState(zzkVar.zzbm());
        zzw();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzn() < currentTimeMillis - zzai.zzm() || zzkVar.zzn() > zzai.zzm() + currentTimeMillis) {
            zzj().zzr().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(zzkVar.zzab()), Long.valueOf(currentTimeMillis), Long.valueOf(zzkVar.zzn()));
        }
        try {
            byte[] zzb2 = h_().zzb(zzkVar.zzce());
            zzj().zzq().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzab());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzn()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzkVar.zzbt()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (f_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzab()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzab()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzab()), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzfw.zzb zzbVar) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzr().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzce = zzbVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzce);
        try {
            if (f_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    private final boolean zza(String str, int i, zzfw.zze zzeVar) {
        zzam();
        zzv();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzr().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzce = zzeVar.zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzce);
        try {
            if (f_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzbe zzbeVar, long j, boolean z) {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzbeVar);
        Preconditions.checkNotEmpty(zzbeVar.zza);
        byte[] zzce = h_().zza(zzbeVar).zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbeVar.zza);
        contentValues.put("name", zzbeVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbeVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzce);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (f_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbeVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbeVar.zza), e);
            return false;
        }
    }

    public final boolean zza(String str, zzog zzogVar) {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzogVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzogVar.zzb < currentTimeMillis - zzbn.zzbp.zza(null).longValue() || zzogVar.zzb > zzbn.zzbp.zza(null).longValue() + currentTimeMillis) {
            zzj().zzr().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zzogVar.zzb));
        }
        zzj().zzq().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzogVar.zza);
        contentValues.put("source", Integer.valueOf(zzogVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zzogVar.zzb));
        try {
            if (f_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e);
            return false;
        }
    }

    protected final boolean zzab() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzgf.zzf zzfVar) {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzce = zzfVar.zzce();
        zzj().zzq().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzce.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzce);
        try {
            if (f_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e);
            return false;
        }
    }

    final boolean zza(String str, long j) {
        if (!zze().zza(zzbn.zzcz) && zzb().currentTimeMillis() > 15000 + j) {
            return false;
        }
        try {
            if (zza("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}, 0L) > 0) {
                return false;
            }
            return zza("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j)}, 0L) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error checking backfill conditions", e);
            return false;
        }
    }

    public final boolean zza(zzag zzagVar) {
        Preconditions.checkNotNull(zzagVar);
        zzv();
        zzam();
        String str = zzagVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzagVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzagVar.zzb);
        contentValues.put("name", zzagVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzagVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzagVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzagVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzagVar.zzh));
        zzs();
        contentValues.put("timed_out_event", zzpn.zza((Parcelable) zzagVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzagVar.zzd));
        zzs();
        contentValues.put("triggered_event", zzpn.zza((Parcelable) zzagVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzagVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzagVar.zzj));
        zzs();
        contentValues.put("expired_event", zzpn.zza((Parcelable) zzagVar.zzk));
        try {
            if (f_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e);
        }
        return true;
    }

    final boolean zza(String str, Bundle bundle) {
        zzv();
        zzam();
        byte[] zzce = h_().zza(new zzbe(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzce();
        zzj().zzq().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzce.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzce);
        try {
            if (f_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    private final boolean zza(long j, zzbe zzbeVar, long j2, boolean z) {
        zzv();
        zzam();
        Preconditions.checkNotNull(zzbeVar);
        Preconditions.checkNotEmpty(zzbeVar.zza);
        byte[] zzce = h_().zza(zzbeVar).zzce();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbeVar.zza);
        contentValues.put("name", zzbeVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbeVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", zzce);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            long update = f_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            if (update == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbeVar.zza), Long.valueOf(update));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbeVar.zza), e);
            return false;
        }
    }

    public final boolean zza(zzpo zzpoVar) {
        Preconditions.checkNotNull(zzpoVar);
        zzv();
        zzam();
        if (zze(zzpoVar.zza, zzpoVar.zzc) == null) {
            if (zzpn.zzg(zzpoVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzpoVar.zza}) >= zze().zza(zzpoVar.zza, zzbn.zzaq, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzpoVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzpoVar.zza, zzpoVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzpoVar.zza);
        contentValues.put("origin", zzpoVar.zzb);
        contentValues.put("name", zzpoVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzpoVar.zzd));
        zza(contentValues, "value", zzpoVar.zze);
        try {
            if (f_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzpoVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzpoVar.zza), e);
        }
        return true;
    }
}
