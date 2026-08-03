package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzav extends com.google.android.gms.measurement.internal.zzor {
    private final com.google.android.gms.measurement.internal.zzau zzm;
    private final com.google.android.gms.measurement.internal.zzof zzn;
    private static final java.lang.String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final java.lang.String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final java.lang.String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final java.lang.String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    private static final java.lang.String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final java.lang.String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final java.lang.String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final java.lang.String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final java.lang.String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    zzav(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
        this.zzn = new com.google.android.gms.measurement.internal.zzof(this.zzu.zzaZ());
        this.zzu.zzc();
        this.zzm = new com.google.android.gms.measurement.internal.zzau(this, this.zzu.zzaY(), "google_app_measurement.db");
    }

    private final long zzaA(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor rawQuery = zze().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new android.database.sqlite.SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaB(java.lang.String str, java.lang.String[] strArr, long j) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = zze().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                return j;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final java.lang.String zzaC(java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = zze().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor == null) {
                    return "";
                }
                cursor.close();
                return "";
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final void zzaD(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            android.database.sqlite.SQLiteDatabase zze2 = zze();
            if (contentValues.getAsString("app_id") == null) {
                this.zzu.zzaV().zzd().zzb("Value of the primary key is not set.", com.google.android.gms.measurement.internal.zzgt.zzl("app_id"));
                return;
            }
            new java.lang.StringBuilder(10).append("app_id = ?");
            if (zze2.update("consent_settings", contentValues, r3.toString(), new java.lang.String[]{r2}) == 0 && zze2.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", com.google.android.gms.measurement.internal.zzgt.zzl("consent_settings"), com.google.android.gms.measurement.internal.zzgt.zzl("app_id"));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzd("Error storing into table. key", com.google.android.gms.measurement.internal.zzgt.zzl("consent_settings"), com.google.android.gms.measurement.internal.zzgt.zzl("app_id"), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final com.google.android.gms.measurement.internal.zzbc zzaE(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.database.Cursor cursor;
        java.lang.Boolean bool;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
        zzg();
        zzay();
        android.database.Cursor cursor2 = null;
        try {
            cursor = zze().query(str, (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new java.lang.String[0]), "app_id=? and name=?", new java.lang.String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    zzibVar.zzaV().zzb().zzd("Error querying events. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), zzibVar.zzl().zza(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        long j3 = cursor.getLong(2);
        long j4 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        java.lang.Long valueOf = cursor.isNull(4) ? null : java.lang.Long.valueOf(cursor.getLong(4));
        java.lang.Long valueOf2 = cursor.isNull(5) ? null : java.lang.Long.valueOf(cursor.getLong(5));
        java.lang.Long valueOf3 = cursor.isNull(6) ? null : java.lang.Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(cursor.getLong(7) == 1);
        }
        com.google.android.gms.measurement.internal.zzbc zzbcVar = new com.google.android.gms.measurement.internal.zzbc(str2, str3, j, j2, cursor.isNull(8) ? 0L : cursor.getLong(8), j3, j4, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            this.zzu.zzaV().zzb().zzb("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
        }
        if (cursor != null) {
            cursor.close();
        }
        return zzbcVar;
    }

    private final void zzaF(java.lang.String str, com.google.android.gms.measurement.internal.zzbc zzbcVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbcVar);
        zzg();
        zzay();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.lang.String str2 = zzbcVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(zzbcVar.zzc));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(zzbcVar.zzd));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(zzbcVar.zzf));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(zzbcVar.zzg));
        contentValues.put("last_bundled_day", zzbcVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.zzi);
        contentValues.put("last_sampling_rate", zzbcVar.zzj);
        contentValues.put("current_session_count", java.lang.Long.valueOf(zzbcVar.zze));
        java.lang.Boolean bool = zzbcVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzbcVar.zza), e);
        }
    }

    private final void zzaG(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete(str, "app_id=?", new java.lang.String[]{str2});
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error deleting snapshot. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e);
        }
    }

    private final com.google.android.gms.measurement.internal.zzpi zzaH(java.lang.String str, long j, byte[] bArr, java.lang.String str2, java.lang.String str3, int i, int i2, long j2, long j3, long j4) {
        if (android.text.TextUtils.isEmpty(str2)) {
            this.zzu.zzaV().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), bArr);
            com.google.android.gms.measurement.internal.zzlr zzb2 = com.google.android.gms.measurement.internal.zzlr.zzb(i);
            if (zzb2 != com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL && zzb2 != com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzcl();
                    zzicVar.zzao(i2);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (str3 != null) {
                java.lang.String[] split = str3.split(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    java.lang.String str4 = split[i3];
                    if (str4.isEmpty()) {
                        break;
                    }
                    java.lang.String[] split2 = str4.split(com.ironsource.X3.j.b, 2);
                    if (split2.length != 2) {
                        this.zzu.zzaV().zzb().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i3++;
                }
            }
            com.google.android.gms.measurement.internal.zzph zzphVar = new com.google.android.gms.measurement.internal.zzph();
            zzphVar.zzb(j);
            zzphVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
            zzphVar.zzd(str2);
            zzphVar.zze(hashMap);
            zzphVar.zzf(zzb2);
            zzphVar.zzg(j2);
            zzphVar.zzh(j3);
            zzphVar.zzi(j4);
            zzphVar.zzj(i2);
            return zzphVar.zza();
        } catch (java.io.IOException e) {
            this.zzu.zzaV().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    private final java.lang.String zzaI() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        java.util.Locale locale = java.util.Locale.US;
        com.google.android.gms.measurement.internal.zzlr zzlrVar = com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(zzlrVar.zza());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(currentTimeMillis);
        zzibVar.zzc();
        java.lang.Long l = (java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzS.zzb(null);
        l.longValue();
        java.lang.String format = java.lang.String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", valueOf, valueOf2, l);
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(zzlrVar.zza());
        zzibVar.zzc();
        java.lang.String format2 = java.lang.String.format(locale2, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", valueOf3, valueOf2, java.lang.Long.valueOf(com.google.android.gms.measurement.internal.zzal.zzI()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 5 + java.lang.String.valueOf(format2).length() + 1);
        sb.append("(");
        sb.append(format);
        sb.append(" OR ");
        sb.append(format2);
        sb.append(")");
        return sb.toString();
    }

    private static final java.lang.String zzaJ(java.util.List list) {
        return list.isEmpty() ? "" : java.lang.String.format(" AND (upload_type IN (%s))", android.text.TextUtils.join(", ", list));
    }

    static final void zzaw(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("value");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        if (obj instanceof java.lang.String) {
            contentValues.put("value", (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            contentValues.put("value", (java.lang.Long) obj);
        } else {
            if (!(obj instanceof java.lang.Double)) {
                throw new java.lang.IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (java.lang.Double) obj);
        }
    }

    public final long zzA(java.lang.String str, com.google.android.gms.internal.measurement.zzib zzibVar, java.lang.String str2, java.util.Map map, com.google.android.gms.measurement.internal.zzlr zzlrVar, java.lang.Long l) {
        int delete;
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzibVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        if (zzai()) {
            com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
            long zza2 = zzpfVar.zzq().zzb.zza();
            com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
            long elapsedRealtime = zzibVar2.zzaZ().elapsedRealtime();
            long abs = java.lang.Math.abs(elapsedRealtime - zza2);
            zzibVar2.zzc();
            if (abs > com.google.android.gms.measurement.internal.zzal.zzJ()) {
                zzpfVar.zzq().zzb.zzb(elapsedRealtime);
                zzg();
                zzay();
                if (zzai() && (delete = zze().delete("upload_queue", zzaI(), new java.lang.String[0])) > 0) {
                    zzibVar2.zzaV().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", java.lang.Integer.valueOf(delete));
                }
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                zzg();
                zzay();
                try {
                    int zzm = zzibVar2.zzc().zzm(str, com.google.android.gms.measurement.internal.zzfx.zzz);
                    if (zzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new java.lang.String[]{str, java.lang.String.valueOf(zzm)});
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    this.zzu.zzaV().zzb().zzc("Error deleting over the limit queued batches. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.String str4 = (java.lang.String) entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str4).length());
            sb.append(str3);
            sb.append(com.ironsource.X3.j.b);
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] zzcc = zzibVar.zzcc();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", kotlin.UByte$$ExternalSyntheticBackport0.m((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.END_OF_LINE, (java.lang.Iterable) arrayList));
        contentValues.put("upload_type", java.lang.Integer.valueOf(zzlrVar.zza()));
        com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzibVar3.zzaZ().currentTimeMillis()));
        contentValues.put("retry_count", (java.lang.Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = zze().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            zzibVar3.zzaV().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (android.database.sqlite.SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzpi zzB(long j) {
        android.database.Cursor cursor;
        zzg();
        zzay();
        try {
            cursor = zze().query("upload_queue", new java.lang.String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new java.lang.String[]{java.lang.String.valueOf(j)}, null, null, null, "1");
            try {
            } catch (android.database.sqlite.SQLiteException e) {
                e = e;
                try {
                    this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", java.lang.Long.valueOf(j), e);
                    if (cursor != null) {
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor.moveToFirst()) {
            com.google.android.gms.measurement.internal.zzpi zzaH = zzaH((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursor.getString(1)), j, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
            if (cursor != null) {
                cursor.close();
            }
            return zzaH;
        }
        if (cursor != null) {
            return null;
        }
        cursor.close();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzC(java.lang.String str, com.google.android.gms.measurement.internal.zzon zzonVar, int i) {
        android.database.Cursor cursor;
        java.util.List emptyList;
        android.database.Cursor query;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        try {
            android.database.sqlite.SQLiteDatabase zze2 = zze();
            java.lang.String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"};
            java.lang.String zzaJ = zzaJ(zzonVar.zza);
            java.lang.String zzaI = zzaI();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzaJ).length() + 17 + zzaI.length());
            sb.append("app_id=?");
            sb.append(zzaJ);
            sb.append(" AND NOT ");
            sb.append(zzaI);
            query = zze2.query("upload_queue", strArr, sb.toString(), new java.lang.String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? java.lang.String.valueOf(i) : null);
        } catch (android.database.sqlite.SQLiteException e) {
            e = e;
            cursor = null;
        } catch (java.lang.Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            emptyList = new java.util.ArrayList();
            while (query.moveToNext()) {
                com.google.android.gms.measurement.internal.zzpi zzaH = zzaH(str, query.getLong(0), query.getBlob(2), query.getString(3), query.getString(4), query.getInt(5), query.getInt(6), query.getLong(7), query.getLong(8), query.getLong(9));
                if (zzaH != null) {
                    emptyList.add(zzaH);
                }
            }
            cursor = query;
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = query;
            try {
                this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                emptyList = java.util.Collections.emptyList();
                if (cursor != null) {
                }
                return emptyList;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return emptyList;
    }

    public final boolean zzD(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzlr[] zzlrVarArr = {com.google.android.gms.measurement.internal.zzlr.GOOGLE_SIGNAL};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(java.lang.Integer.valueOf(zzlrVarArr[0].zza()));
        java.lang.String zzaJ = zzaJ(arrayList);
        java.lang.String zzaI = zzaI();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzaJ).length() + 61 + zzaI.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(zzaJ);
        sb.append(" AND NOT ");
        sb.append(zzaI);
        return zzaA(sb.toString(), new java.lang.String[]{str}) != 0;
    }

    public final void zzE(java.lang.Long l) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        try {
            if (zze().delete("upload_queue", "rowid=?", new java.lang.String[]{l.toString()}) != 1) {
                this.zzu.zzaV().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String zzF() {
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursor;
        android.database.sqlite.SQLiteDatabase zze2 = zze();
        ?? r1 = 0;
        try {
            try {
                cursor = zze2.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        java.lang.String string = cursor.getString(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzb("Database error getting next bundle app id", e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                r1 = zze2;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final boolean zzG() {
        return zzaA("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void zzH(long j) {
        zzg();
        zzay();
        try {
            if (zze().delete("queue", "rowid=?", new java.lang.String[]{java.lang.String.valueOf(j)}) == 1) {
            } else {
                throw new android.database.sqlite.SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a bundle in a queue table", e);
            throw e;
        }
    }

    final void zzI() {
        zzg();
        zzay();
        if (zzai()) {
            com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
            long zza2 = zzpfVar.zzq().zza.zza();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
            long abs = java.lang.Math.abs(elapsedRealtime - zza2);
            zzibVar.zzc();
            if (abs > com.google.android.gms.measurement.internal.zzal.zzJ()) {
                zzpfVar.zzq().zza.zzb(elapsedRealtime);
                zzg();
                zzay();
                if (zzai()) {
                    android.database.sqlite.SQLiteDatabase zze2 = zze();
                    java.lang.String valueOf = java.lang.String.valueOf(zzibVar.zzaZ().currentTimeMillis());
                    zzibVar.zzc();
                    int delete = zze2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{valueOf, java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzal.zzI())});
                    if (delete > 0) {
                        zzibVar.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    final void zzJ(java.util.List list) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotZero(list.size());
        if (zzai()) {
            java.lang.String join = android.text.TextUtils.join(",", list);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            java.lang.String sb2 = sb.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb3.toString(), null) > 0) {
                this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase zze2 = zze();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                zze2.execSQL(sb4.toString());
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final void zzK(java.lang.Long l) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        if (zzai()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb.toString(), null) > 0) {
                this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase zze2 = zze();
                long currentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                java.lang.String sb3 = sb2.toString();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                zze2.execSQL(sb4.toString());
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    final java.lang.Object zzL(android.database.Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.zzu.zzaV().zzb().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return java.lang.Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return java.lang.Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            this.zzu.zzaV().zzb().zzb("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
            return null;
        }
        this.zzu.zzaV().zzb().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long zzM() {
        return zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(3:2|3|4)|(2:6|(3:8|9|10)(1:14))|15|16|(1:18)(2:21|22)|19|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
    
        r12.zzu.zzaV().zzb().zzd("Error inserting column. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r13), "first_open_count", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r5 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final long zzN(java.lang.String str, java.lang.String str2) {
        long j;
        long zzaB;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzay();
        android.database.sqlite.SQLiteDatabase zze2 = zze();
        zze2.beginTransaction();
        long j2 = 0;
        try {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                zzaB = zzaB(sb.toString(), new java.lang.String[]{str}, -1L);
            } finally {
                zze2.endTransaction();
            }
        } catch (android.database.sqlite.SQLiteException e) {
            e = e;
        }
        if (zzaB == -1) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (java.lang.Integer) 0);
            contentValues.put("previous_install_count", (java.lang.Integer) 0);
            if (zze2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzc("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), "first_open_count");
                return j;
            }
            zzaB = 0;
        }
        android.content.ContentValues contentValues2 = new android.content.ContentValues();
        contentValues2.put("app_id", str);
        contentValues2.put("first_open_count", java.lang.Long.valueOf(1 + zzaB));
        if (zze2.update("app2", contentValues2, "app_id = ?", new java.lang.String[]{str}) == 0) {
            this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), "first_open_count");
        } else {
            zze2.setTransactionSuccessful();
            j = zzaB;
        }
        return j;
    }

    public final long zzO() {
        return zzaB("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean zzP() {
        return zzaA("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzQ(java.lang.String str, java.lang.String str2) {
        return zzaA("select count(1) from raw_events where app_id = ? and name = ?", new java.lang.String[]{str, str2}) > 0;
    }

    public final boolean zzR() {
        return zzaA("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void zzS(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        zzg();
        zzay();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((java.lang.Long) list.get(i)).longValue());
        }
        sb.append(")");
        int delete = zze().delete("raw_events", sb.toString(), null);
        if (delete != list.size()) {
            this.zzu.zzaV().zzb().zzc("Deleted fewer rows from raw events table than expected", java.lang.Integer.valueOf(delete), java.lang.Integer.valueOf(list.size()));
        }
    }

    public final void zzT(java.lang.String str) {
        try {
            zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new java.lang.String[]{str, str});
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
        }
    }

    public final long zzU(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return zzaB("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    public final boolean zzV(java.lang.String str, java.lang.Long l, long j, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhsVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        byte[] zzcc = zzhsVar.zzcc();
        zzibVar.zzaV().zzk().zzc("Saving complex main event, appId, data size", zzibVar.zzl().zza(str), java.lang.Integer.valueOf(zzcc.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", java.lang.Long.valueOf(j));
        contentValues.put("main_event", zzcc);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzibVar.zzaV().zzb().zzb("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing complex main event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:26:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.os.Bundle zzW(java.lang.String str) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        zzg();
        zzay();
        android.database.Cursor cursor3 = null;
        try {
            try {
                cursor = zze().rawQuery("select parameters from default_event_params where app_id=?", new java.lang.String[]{str});
                try {
                    if (cursor.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursor.getBlob(0))).zzbc();
                            this.zzg.zzp();
                            android.os.Bundle zzE = com.google.android.gms.measurement.internal.zzpj.zzE(zzhsVar.zza());
                            if (cursor != null) {
                                cursor.close();
                            }
                            return zzE;
                        } catch (java.io.IOException e) {
                            this.zzu.zzaV().zzb().zzc("Failed to retrieve default event parameters. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                        }
                    } else {
                        this.zzu.zzaV().zzk().zza("Default event parameters not found");
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzb("Error selecting default event parameters", e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    final boolean zzX(java.lang.String str, long j) {
        try {
            if (zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new java.lang.String[]{str, java.lang.String.valueOf(j)}, 0L) > 0) {
                return false;
            }
            return zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new java.lang.String[]{str, java.lang.String.valueOf(j)}, 0L) > 0;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzb("Error checking backfill conditions", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00db, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        r2.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02be A[Catch: SQLiteException -> 0x02d4, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x02d4, blocks: (B:67:0x02a3, B:69:0x02be), top: B:66:0x02a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(java.lang.String str, java.lang.Long l, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str3;
        android.os.Bundle bundle2;
        long update;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        android.database.Cursor query;
        java.lang.String str4 = str;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzg();
        zzay();
        com.google.android.gms.measurement.internal.zzat zzatVar = l != null ? new com.google.android.gms.measurement.internal.zzat(this, str4, l.longValue()) : new com.google.android.gms.measurement.internal.zzat(this, str4);
        java.util.List<com.google.android.gms.measurement.internal.zzas> zza2 = zzatVar.zza();
        while (!zza2.isEmpty()) {
            for (com.google.android.gms.measurement.internal.zzas zzasVar : zza2) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    android.database.Cursor cursor = null;
                    r4 = null;
                    r4 = null;
                    com.google.android.gms.internal.measurement.zzid zzidVar2 = null;
                    android.database.Cursor cursor2 = null;
                    try {
                        try {
                            query = zze().query("raw_events_metadata", new java.lang.String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{str4, java.lang.Long.toString(zzasVar.zzb)}, null, null, "rowid", "2");
                        } catch (android.database.sqlite.SQLiteException e) {
                            e = e;
                            zzidVar = null;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    try {
                        try {
                        } catch (android.database.sqlite.SQLiteException e2) {
                            e = e2;
                            zzidVar = null;
                        }
                        if (query.moveToFirst()) {
                            try {
                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), query.getBlob(0))).zzbc();
                            } catch (java.io.IOException e3) {
                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e3);
                            }
                            try {
                                if (query.moveToNext()) {
                                    this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                                }
                                query.close();
                                if (query != null) {
                                    query.close();
                                }
                            } catch (android.database.sqlite.SQLiteException e4) {
                                e = e4;
                                cursor2 = query;
                                this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                zzidVar2 = zzidVar;
                                if (zzidVar2 == null) {
                                }
                                com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
                                com.google.android.gms.measurement.internal.zzpj zzp = zzpfVar.zzp();
                                com.google.android.gms.internal.measurement.zzhs zzhsVar = zzasVar.zzd;
                                android.os.Bundle bundle3 = new android.os.Bundle();
                                while (r5.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                java.lang.String zzd2 = zzhsVar.zzd();
                                if (string == null) {
                                }
                                com.google.android.gms.measurement.internal.zzgu zzguVar = new com.google.android.gms.measurement.internal.zzgu(zzd2, string, bundle3, zzhsVar.zzf());
                                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                                android.os.Bundle bundle4 = zzguVar.zzd;
                                str3 = zzguVar.zza;
                                com.google.android.gms.measurement.internal.zzpo zzk2 = zzibVar.zzk();
                                if (str3.equals(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                                }
                                zzk2.zzI(bundle4, bundle2);
                                com.google.android.gms.measurement.internal.zzbb zzbbVar = new com.google.android.gms.measurement.internal.zzbb(this.zzu, zzguVar.zzb, str, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle4);
                                long j = zzasVar.zza;
                                long j2 = zzasVar.zzb;
                                boolean z = zzasVar.zzc;
                                zzg();
                                zzay();
                                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar);
                                java.lang.String str5 = zzbbVar.zza;
                                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
                                byte[] zzcc = zzpfVar.zzp().zzh(zzbbVar).zzcc();
                                android.content.ContentValues contentValues = new android.content.ContentValues();
                                contentValues.put("app_id", str5);
                                contentValues.put("name", zzbbVar.zzb);
                                contentValues.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzbbVar.zzd));
                                contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j2));
                                contentValues.put("data", zzcc);
                                contentValues.put("realtime", java.lang.Integer.valueOf(z ? 1 : 0));
                                update = zze().update("raw_events", contentValues, "rowid = ?", new java.lang.String[]{java.lang.String.valueOf(j)});
                                if (update != 1) {
                                }
                                str4 = str;
                            }
                            zzidVar2 = zzidVar;
                            if (zzidVar2 == null) {
                                java.util.Iterator it = zzidVar2.zzf().iterator();
                                while (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.zziu) it.next()).zzc().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                com.google.android.gms.measurement.internal.zzpf zzpfVar2 = this.zzg;
                com.google.android.gms.measurement.internal.zzpj zzp2 = zzpfVar2.zzp();
                com.google.android.gms.internal.measurement.zzhs zzhsVar2 = zzasVar.zzd;
                android.os.Bundle bundle32 = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar2.zza()) {
                    if (zzhwVar.zzi()) {
                        bundle32.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                    } else if (zzhwVar.zzg()) {
                        bundle32.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                    } else if (zzhwVar.zze()) {
                        bundle32.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle32.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzk().isEmpty()) {
                        zzp2.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle32.putParcelableArray(zzhwVar.zzb(), com.google.android.gms.measurement.internal.zzpj.zzy(zzhwVar.zzk()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                java.lang.String zzd22 = zzhsVar2.zzd();
                if (string == null) {
                    string = "";
                }
                com.google.android.gms.measurement.internal.zzgu zzguVar2 = new com.google.android.gms.measurement.internal.zzgu(zzd22, string, bundle32, zzhsVar2.zzf());
                com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
                android.os.Bundle bundle42 = zzguVar2.zzd;
                str3 = zzguVar2.zza;
                com.google.android.gms.measurement.internal.zzpo zzk22 = zzibVar2.zzk();
                if (str3.equals(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new android.os.Bundle(bundle);
                    for (java.lang.String str6 : bundle.keySet()) {
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                    }
                }
                zzk22.zzI(bundle42, bundle2);
                com.google.android.gms.measurement.internal.zzbb zzbbVar2 = new com.google.android.gms.measurement.internal.zzbb(this.zzu, zzguVar2.zzb, str, zzhsVar2.zzd(), zzhsVar2.zzf(), zzhsVar2.zzh(), bundle42);
                long j3 = zzasVar.zza;
                long j22 = zzasVar.zzb;
                boolean z2 = zzasVar.zzc;
                zzg();
                zzay();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbbVar2);
                java.lang.String str52 = zzbbVar2.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str52);
                byte[] zzcc2 = zzpfVar2.zzp().zzh(zzbbVar2).zzcc();
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("app_id", str52);
                contentValues2.put("name", zzbbVar2.zzb);
                contentValues2.put(com.ironsource.C4.a.d, java.lang.Long.valueOf(zzbbVar2.zzd));
                contentValues2.put("metadata_fingerprint", java.lang.Long.valueOf(j22));
                contentValues2.put("data", zzcc2);
                contentValues2.put("realtime", java.lang.Integer.valueOf(z2 ? 1 : 0));
                try {
                    update = zze().update("raw_events", contentValues2, "rowid = ?", new java.lang.String[]{java.lang.String.valueOf(j3)});
                    if (update != 1) {
                        zzibVar2.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", com.google.android.gms.measurement.internal.zzgt.zzl(str52), java.lang.Long.valueOf(update));
                    }
                } catch (android.database.sqlite.SQLiteException e5) {
                    this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzbbVar2.zza), e5);
                }
                str4 = str;
            }
            zza2 = zzatVar.zza();
            str4 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzjk zzZ(java.lang.String str) {
        java.lang.Throwable th;
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursor;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzay();
        java.lang.String[] strArr = {str};
        ?? r1 = 0;
        r1 = null;
        r1 = null;
        r1 = null;
        com.google.android.gms.measurement.internal.zzjk zzjkVar = null;
        try {
            try {
                cursor = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", strArr);
                try {
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzb("Error querying database.", e);
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                r1 = strArr;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (r1 != 0) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            this.zzu.zzaV().zzk().zza("No data found");
            if (cursor != null) {
                cursor.close();
            }
            return zzjkVar == null ? com.google.android.gms.measurement.internal.zzjk.zza : zzjkVar;
        }
        zzjkVar = com.google.android.gms.measurement.internal.zzjk.zzf(cursor.getString(0), cursor.getInt(1));
    }

    public final boolean zzaa(java.lang.String str, com.google.android.gms.measurement.internal.zzog zzogVar) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzogVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzav;
        long longValue = currentTimeMillis - ((java.lang.Long) zzfwVar.zzb(null)).longValue();
        long j = zzogVar.zzb;
        if (j < longValue || j > ((java.lang.Long) zzfwVar.zzb(null)).longValue() + currentTimeMillis) {
            zzibVar.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzgt.zzl(str), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j));
        }
        zzibVar.zzaV().zzk().zza("Saving trigger URI");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzogVar.zza);
        contentValues.put("source", java.lang.Integer.valueOf(zzogVar.zzc));
        contentValues.put("timestamp_millis", java.lang.Long.valueOf(j));
        try {
            if (zze().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzibVar.zzaV().zzb().zzb("Failed to insert trigger URI (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing trigger URI. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            return false;
        }
    }

    public final void zzab(java.lang.String str, com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjkVar);
        zzg();
        zzay();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjkVar.zzl());
        contentValues.put("consent_source", java.lang.Integer.valueOf(zzjkVar.zzb()));
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final com.google.android.gms.measurement.internal.zzaz zzac(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return com.google.android.gms.measurement.internal.zzaz.zzg(zzaC("select dma_consent_settings from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""));
    }

    public final void zzad(java.lang.String str, com.google.android.gms.measurement.internal.zzaz zzazVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzazVar);
        zzg();
        zzay();
        com.google.android.gms.measurement.internal.zzjk zzZ = zzZ(str);
        com.google.android.gms.measurement.internal.zzjk zzjkVar = com.google.android.gms.measurement.internal.zzjk.zza;
        if (zzZ == zzjkVar) {
            zzab(str, zzjkVar);
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzazVar.zze());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final void zzae(java.lang.String str, com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjkVar);
        zzg();
        zzay();
        zzab(str, zzZ(str));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjkVar.zzl());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final com.google.android.gms.measurement.internal.zzjk zzaf(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return com.google.android.gms.measurement.internal.zzjk.zzf(zzaC("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new java.lang.String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0251, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0235, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01df, code lost:
    
        r0 = r23.zzu.zzaV().zze();
        r9 = com.google.android.gms.measurement.internal.zzgt.zzl(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f7, code lost:
    
        if (r12.zza() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f9, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0204, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0297, code lost:
    
        r21 = r7;
        r0 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r0.hasNext() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a7, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzfn) r0.next();
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c1, code lost:
    
        if (r3.zzc().isEmpty() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f0, code lost:
    
        r7 = r3.zzcc();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0307, code lost:
    
        if (r3.zza() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0309, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0313, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0325, code lost:
    
        if (r3.zzg() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0327, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0331, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0345, code lost:
    
        if (zze().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x035b, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0347, code lost:
    
        r23.zzu.zzaV().zzb().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0360, code lost:
    
        r23.zzu.zzaV().zzb().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0330, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0312, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c3, code lost:
    
        r0 = r23.zzu.zzaV().zze();
        r8 = com.google.android.gms.measurement.internal.zzgt.zzl(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02db, code lost:
    
        if (r3.zza() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02dd, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e7, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e6, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r11 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
    
        if (r11.hasNext() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0190, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r11.next()).zza() != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0192, code lost:
    
        r23.zzu.zzaV().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgt.zzl(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ab, code lost:
    
        r11 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        if (r11.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c3, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzff) r11.next();
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dd, code lost:
    
        if (r12.zzc().isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0211, code lost:
    
        r3 = r12.zzcc();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022a, code lost:
    
        if (r12.zza() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022c, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0236, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0246, code lost:
    
        if (r12.zzk() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0248, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0252, code lost:
    
        r7.put("session_scoped", r9);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0266, code lost:
    
        if (zze().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0268, code lost:
    
        r23.zzu.zzaV().zzb().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027b, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0281, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0282, code lost:
    
        r23.zzu.zzaV().zzb().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0373, code lost:
    
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = zze();
        r9 = r17;
        r0.delete("property_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a6, code lost:
    
        r7 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzag(java.lang.String str, java.util.List list) {
        boolean z;
        java.lang.String str2 = "app_id=? and audience_id=?";
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) list.get(i)).zzcl();
            if (zzfcVar.zzd() != 0) {
                int i2 = 0;
                while (i2 < zzfcVar.zzd()) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzfcVar.zze(i2).zzcl();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    java.lang.String zzb2 = com.google.android.gms.measurement.internal.zzjl.zzb(zzfeVar.zza());
                    if (zzb2 != null) {
                        zzfeVar2.zzb(zzb2);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzfeVar.zzc()) {
                        com.google.android.gms.internal.measurement.zzfh zzd2 = zzfeVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        java.lang.String str3 = str2;
                        java.lang.String zzc2 = com.google.android.gms.measurement.internal.zzls.zzc(zzd2.zzh(), com.google.android.gms.measurement.internal.zzjm.zza, com.google.android.gms.measurement.internal.zzjm.zzb);
                        if (zzc2 != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzd2.zzcl();
                            zzfgVar.zza(zzc2);
                            zzfeVar2.zze(i3, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzbc());
                            z = true;
                        }
                        i3++;
                        zzfeVar = zzfeVar3;
                        str2 = str3;
                    }
                    java.lang.String str4 = str2;
                    if (z) {
                        zzfcVar.zzf(i2, zzfeVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            java.lang.String str5 = str2;
            if (zzfcVar.zza() != 0) {
                for (int i4 = 0; i4 < zzfcVar.zza(); i4++) {
                    com.google.android.gms.internal.measurement.zzfn zzb3 = zzfcVar.zzb(i4);
                    java.lang.String zzc3 = com.google.android.gms.measurement.internal.zzls.zzc(zzb3.zzc(), com.google.android.gms.measurement.internal.zzjn.zza, com.google.android.gms.measurement.internal.zzjn.zzb);
                    if (zzc3 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzb3.zzcl();
                        zzfmVar.zza(zzc3);
                        zzfcVar.zzc(i4, zzfmVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        java.lang.String str6 = str2;
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        android.database.sqlite.SQLiteDatabase zze2 = zze();
        zze2.beginTransaction();
        try {
            zzay();
            zzg();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            android.database.sqlite.SQLiteDatabase zze3 = zze();
            zze3.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            zze3.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) it.next();
                zzay();
                zzg();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfdVar);
                if (zzfdVar.zza()) {
                    int zzb4 = zzfdVar.zzb();
                    java.util.Iterator it2 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff) it2.next()).zza()) {
                                this.zzu.zzaV().zze().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgt.zzl(str), java.lang.Integer.valueOf(zzb4));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzu.zzaV().zze().zzb("Audience with no ID. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar2 = (com.google.android.gms.internal.measurement.zzfd) it3.next();
                arrayList.add(zzfdVar2.zza() ? java.lang.Integer.valueOf(zzfdVar2.zzb()) : null);
            }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            zzay();
            zzg();
            android.database.sqlite.SQLiteDatabase zze4 = zze();
            try {
                long zzaA = zzaA("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
                int max = java.lang.Math.max(0, java.lang.Math.min(2000, this.zzu.zzc().zzm(str, com.google.android.gms.measurement.internal.zzfx.zzU)));
                if (zzaA > max) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            java.lang.String join = android.text.TextUtils.join(",", arrayList2);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 2);
                            sb.append("(");
                            sb.append(join);
                            sb.append(")");
                            java.lang.String sb2 = sb.toString();
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 140);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(sb2);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            zze4.delete("audience_filter_values", sb3.toString(), new java.lang.String[]{str, java.lang.Integer.toString(max)});
                            break;
                        }
                        java.lang.Integer num = (java.lang.Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(java.lang.Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            }
            zze2.setTransactionSuccessful();
        } finally {
            zze2.endTransaction();
        }
    }

    final com.google.android.gms.measurement.internal.zzbc zzah(java.lang.String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzbc zzaE = zzaE("events", str, zzhsVar.zzd());
        if (zzaE == null) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar.zzl().zza(str2));
            return new com.google.android.gms.measurement.internal.zzbc(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j = zzaE.zze + 1;
        long j2 = zzaE.zzd + 1;
        return new com.google.android.gms.measurement.internal.zzbc(zzaE.zza, zzaE.zzb, zzaE.zzc + 1, j2, j, zzaE.zzf, zzaE.zzg, zzaE.zzh, zzaE.zzi, zzaE.zzj, zzaE.zzk);
    }

    protected final boolean zzai() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        android.content.Context zzaY = zzibVar.zzaY();
        zzibVar.zzc();
        return zzaY.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long zzaj(java.lang.String str, java.lang.String[] strArr, long j) {
        return zzaB("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzof zzau() {
        return this.zzn;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[Catch: all -> 0x01fc, SQLiteException -> 0x01ff, TryCatch #9 {SQLiteException -> 0x01ff, all -> 0x01fc, blocks: (B:30:0x00e5, B:32:0x00eb, B:34:0x0100, B:36:0x0104, B:37:0x0114, B:39:0x011a, B:40:0x012d, B:42:0x013a, B:43:0x0157, B:45:0x0186, B:47:0x018e, B:49:0x0199, B:51:0x01cb, B:60:0x01b6, B:61:0x01d2, B:62:0x014d, B:65:0x01e7), top: B:29:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100 A[Catch: all -> 0x01fc, SQLiteException -> 0x01ff, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01ff, all -> 0x01fc, blocks: (B:30:0x00e5, B:32:0x00eb, B:34:0x0100, B:36:0x0104, B:37:0x0114, B:39:0x011a, B:40:0x012d, B:42:0x013a, B:43:0x0157, B:45:0x0186, B:47:0x018e, B:49:0x0199, B:51:0x01cb, B:60:0x01b6, B:61:0x01d2, B:62:0x014d, B:65:0x01e7), top: B:29:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzav(java.lang.String str, long j, long j2, com.google.android.gms.measurement.internal.zzpb zzpbVar) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        android.database.Cursor cursor;
        android.database.Cursor query;
        char c;
        char c2;
        java.lang.String[] strArr;
        java.lang.String str4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpbVar);
        zzg();
        zzay();
        android.database.Cursor cursor2 = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase zze2 = zze();
                if (android.text.TextUtils.isEmpty(str)) {
                    java.lang.String[] strArr2 = j2 != -1 ? new java.lang.String[]{java.lang.String.valueOf(j2), java.lang.String.valueOf(j)} : new java.lang.String[]{java.lang.String.valueOf(j)};
                    str3 = j2 != -1 ? "rowid <= ? and " : "";
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(str3.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str3);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursor2 = zze2.rawQuery(sb.toString(), strArr2);
                    if (cursor2.moveToFirst()) {
                        str2 = cursor2.getString(0);
                        try {
                            string = cursor2.getString(1);
                            cursor2.close();
                            try {
                                cursor = cursor2;
                                try {
                                    query = zze2.query("raw_events_metadata", new java.lang.String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{str2, string}, null, null, "rowid", "2");
                                } catch (android.database.sqlite.SQLiteException e) {
                                    e = e;
                                    cursor2 = cursor;
                                    this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e);
                                    if (cursor2 == null) {
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (android.database.sqlite.SQLiteException e2) {
                                e = e2;
                                cursor = cursor2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                cursor = cursor2;
                            }
                        } catch (android.database.sqlite.SQLiteException e3) {
                            e = e3;
                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e);
                            if (cursor2 == null) {
                            }
                        }
                        try {
                            if (query.moveToFirst()) {
                                this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
                            } else {
                                try {
                                    com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), query.getBlob(0))).zzbc();
                                    if (query.moveToNext()) {
                                        this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
                                    }
                                    query.close();
                                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzidVar);
                                    zzpbVar.zza = zzidVar;
                                    if (j2 != -1) {
                                        c2 = 1;
                                        c = 2;
                                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new java.lang.String[]{str2, string, java.lang.String.valueOf(j2)};
                                    } else {
                                        c = 2;
                                        c2 = 1;
                                        strArr = new java.lang.String[]{str2, string};
                                        str4 = "app_id = ? and metadata_fingerprint = ?";
                                    }
                                    java.lang.String[] strArr3 = new java.lang.String[4];
                                    strArr3[0] = "rowid";
                                    strArr3[c2] = "name";
                                    strArr3[c] = com.ironsource.C4.a.d;
                                    strArr3[3] = "data";
                                    query = zze2.query("raw_events", strArr3, str4, strArr, null, null, "rowid", null);
                                    if (query.moveToFirst()) {
                                        do {
                                            long j3 = query.getLong(0);
                                            try {
                                                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), query.getBlob(3));
                                                zzhrVar.zzl(query.getString(1));
                                                zzhrVar.zzo(query.getLong(2));
                                                if (!zzpbVar.zza(j3, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                    break;
                                                }
                                            } catch (java.io.IOException e4) {
                                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e4);
                                            }
                                        } while (query.moveToNext());
                                    } else {
                                        this.zzu.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2));
                                    }
                                } catch (java.io.IOException e5) {
                                    this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e5);
                                }
                            }
                            cursor2 = query;
                        } catch (android.database.sqlite.SQLiteException e6) {
                            e = e6;
                            cursor2 = query;
                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str2), e);
                            if (cursor2 == null) {
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            cursor2 = query;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    java.lang.String[] strArr4 = j2 != -1 ? new java.lang.String[]{str, java.lang.String.valueOf(j2)} : new java.lang.String[]{str};
                    str3 = j2 != -1 ? " and rowid <= ?" : "";
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str3.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str3);
                    sb2.append(" order by rowid limit 1;");
                    cursor2 = zze2.rawQuery(sb2.toString(), strArr4);
                    if (cursor2.moveToFirst()) {
                        string = cursor2.getString(0);
                        cursor2.close();
                        str2 = str;
                        cursor = cursor2;
                        query = zze2.query("raw_events_metadata", new java.lang.String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new java.lang.String[]{str2, string}, null, null, "rowid", "2");
                        if (query.moveToFirst()) {
                        }
                        cursor2 = query;
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        } catch (android.database.sqlite.SQLiteException e7) {
            e = e7;
            str2 = str;
        }
        if (cursor2 == null) {
            cursor2.close();
        }
    }

    public final void zzb() {
        zzay();
        zze().beginTransaction();
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    public final void zzc() {
        zzay();
        zze().setTransactionSuccessful();
    }

    public final void zzd() {
        zzay();
        zze().endTransaction();
    }

    final android.database.sqlite.SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zze().zzb("Error opening database", e);
            throw e;
        }
    }

    public final com.google.android.gms.measurement.internal.zzbc zzf(java.lang.String str, java.lang.String str2) {
        return zzaE("events", str, str2);
    }

    public final void zzh(com.google.android.gms.measurement.internal.zzbc zzbcVar) {
        zzaF("events", zzbcVar);
    }

    public final void zzi(java.lang.String str) {
        com.google.android.gms.measurement.internal.zzbc zzaE;
        zzaG("events_snapshot", str);
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = zze().query("events", (java.lang.String[]) java.util.Collections.singletonList("name").toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        java.lang.String string = cursor.getString(0);
                        if (string != null && (zzaE = zzaE("events", str, string)) != null) {
                            zzaF("events_snapshot", zzaE);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Error creating snapshot. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bd, code lost:
    
        zzaF("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r8 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (r8 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(java.lang.String str) {
        boolean z;
        com.google.android.gms.measurement.internal.zzbc zzaE;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList("name", "lifetime_count"));
        com.google.android.gms.measurement.internal.zzbc zzaE2 = zzaE("events", str, "_f");
        com.google.android.gms.measurement.internal.zzbc zzaE3 = zzaE("events", str, "_v");
        zzaG("events", str);
        android.database.Cursor cursor = null;
        boolean z2 = false;
        try {
            cursor = zze().query("events_snapshot", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "app_id=?", new java.lang.String[]{str}, null, null, null);
        } catch (android.database.sqlite.SQLiteException e) {
            e = e;
            z = false;
        } catch (java.lang.Throwable th) {
            th = th;
            z = false;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            if (zzaE2 == null) {
            }
            zzaF("events", zzaE2);
            zzaG("events_snapshot", str);
        }
        boolean z3 = false;
        z = false;
        do {
            try {
                java.lang.String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z3 = true;
                    } else if ("_v".equals(string)) {
                        z = true;
                    }
                }
                if (string != null && (zzaE = zzaE("events_snapshot", str, string)) != null) {
                    zzaF("events", zzaE);
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
                z2 = z3;
                try {
                    this.zzu.zzaV().zzb().zzc("Error querying snapshot. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                    z3 = z2;
                    if (cursor != null) {
                    }
                    if (!z3) {
                    }
                    if (!z) {
                    }
                    zzaG("events_snapshot", str);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z2 && zzaE2 != null) {
                        zzaF("events", zzaE2);
                    } else if (!z && zzaE3 != null) {
                        zzaF("events", zzaE3);
                    }
                    zzaG("events_snapshot", str);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                z2 = z3;
                if (cursor != null) {
                }
                if (z2) {
                }
                if (!z) {
                    zzaF("events", zzaE3);
                }
                zzaG("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z3 || zzaE2 == null) {
            if (!z) {
            }
            zzaG("events_snapshot", str);
        }
        zzaF("events", zzaE2);
        zzaG("events_snapshot", str);
    }

    public final void zzk(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzd("Error deleting user property. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar.zzl().zzc(str2), e);
        }
    }

    public final boolean zzl(com.google.android.gms.measurement.internal.zzpm zzpmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzpmVar);
        zzg();
        zzay();
        java.lang.String str = zzpmVar.zza;
        java.lang.String str2 = zzpmVar.zzc;
        if (zzm(str, str2) == null) {
            if (com.google.android.gms.measurement.internal.zzpo.zzh(str2)) {
                if (zzaA("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}) >= this.zzu.zzc().zzn(str, com.google.android.gms.measurement.internal.zzfx.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long zzaA = zzaA("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{str, zzpmVar.zzb});
                this.zzu.zzc();
                if (zzaA >= 25) {
                    return false;
                }
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpmVar.zzb);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(zzpmVar.zzd));
        zzaw(contentValues, "value", zzpmVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzu.zzaV().zzb().zzb("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing user property. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzpmVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:26:0x009b */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzpm zzm(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        android.database.Cursor cursor3 = null;
        try {
            try {
                cursor = zze().query("user_attributes", new java.lang.String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        java.lang.Object zzL = zzL(cursor, 1);
                        if (zzL != null) {
                            com.google.android.gms.measurement.internal.zzpm zzpmVar = new com.google.android.gms.measurement.internal.zzpm(str, cursor.getString(2), str2, j, zzL);
                            if (cursor.moveToNext()) {
                                this.zzu.zzaV().zzb().zzb("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return zzpmVar;
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    zzibVar.zzaV().zzb().zzd("Error querying user property. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar.zzl().zzc(str2), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final java.util.List zzn(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        java.util.List arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            try {
                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                zzibVar.zzc();
                cursor = zze().query("user_attributes", new java.lang.String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        java.lang.String string = cursor.getString(0);
                        java.lang.String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        java.lang.String str2 = string2;
                        long j = cursor.getLong(2);
                        java.lang.Object zzL = zzL(cursor, 3);
                        if (zzL == null) {
                            zzibVar.zzaV().zzb().zzb("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                        } else {
                            arrayList.add(new com.google.android.gms.measurement.internal.zzpm(str, str2, string, j, zzL));
                        }
                    } while (cursor.moveToNext());
                }
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Error querying user properties. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                arrayList = java.util.Collections.emptyList();
            }
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r0 = r5.zzaV().zzb();
        r5.zzc();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.database.Cursor cursor;
        java.lang.String str4;
        android.database.Cursor cursor2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        java.util.List arrayList = new java.util.ArrayList();
        try {
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
                arrayList2.add(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
                if (android.text.TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        cursor = null;
                        try {
                            this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzgt.zzl(str), str4, e);
                            arrayList = java.util.Collections.emptyList();
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            return arrayList;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!android.text.TextUtils.isEmpty(str3)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1);
                    sb2.append(str3);
                    sb2.append("*");
                    arrayList2.add(sb2.toString());
                    sb.append(" and name glob ?");
                }
                java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
                java.lang.String sb3 = sb.toString();
                com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                zzibVar.zzc();
                cursor2 = zze().query("user_attributes", new java.lang.String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursor2.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                zzibVar.zzc();
                                if (size >= 1000) {
                                    break;
                                }
                                java.lang.String string = cursor2.getString(0);
                                long j = cursor2.getLong(1);
                                java.lang.Object zzL = zzL(cursor2, 2);
                                java.lang.String string2 = cursor2.getString(3);
                                if (zzL == null) {
                                    try {
                                        zzibVar.zzaV().zzb().zzd("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.zzgt.zzl(str), string2, str3);
                                    } catch (android.database.sqlite.SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = string2;
                                        this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzgt.zzl(str), str4, e);
                                        arrayList = java.util.Collections.emptyList();
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    arrayList.add(new com.google.android.gms.measurement.internal.zzpm(str, string2, string, j, zzL));
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str4 = string2;
                            }
                        }
                    } catch (android.database.sqlite.SQLiteException e3) {
                        e = e3;
                        cursor = cursor2;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return arrayList;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean zzp(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        zzg();
        zzay();
        java.lang.String str = zzahVar.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long zzaA = zzaA("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{str});
            this.zzu.zzc();
            if (zzaA >= 1000) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put("name", zzahVar.zzc.zzb);
        zzaw(contentValues, "value", com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar.zzc.zza()));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, java.lang.Boolean.valueOf(zzahVar.zze));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzahVar.zzf);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.valueOf(zzahVar.zzh));
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        contentValues.put("timed_out_event", zzibVar.zzk().zzae(zzahVar.zzg));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzahVar.zzd));
        contentValues.put("triggered_event", zzibVar.zzk().zzae(zzahVar.zzi));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, java.lang.Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzibVar.zzk().zzae(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzibVar.zzaV().zzb().zzb("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing conditional user property", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzah zzq(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            cursor2 = zze().query("conditional_properties", new java.lang.String[]{"origin", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
            try {
                try {
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    zzibVar.zzaV().zzb().zzd("Error querying conditional property", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar.zzl().zzc(str2), e);
                    if (cursor2 != null) {
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (!cursor2.moveToFirst()) {
            if (cursor2 != null) {
                return null;
            }
            cursor2.close();
            return null;
        }
        java.lang.String string = cursor2.getString(0);
        if (string == null) {
            string = "";
        }
        java.lang.String str3 = string;
        java.lang.Object zzL = zzL(cursor2, 1);
        boolean z = cursor2.getInt(2) != 0;
        java.lang.String string2 = cursor2.getString(3);
        long j = cursor2.getLong(4);
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
        com.google.android.gms.measurement.internal.zzah zzahVar = new com.google.android.gms.measurement.internal.zzah(str, str3, new com.google.android.gms.measurement.internal.zzpk(str2, cursor2.getLong(8), zzL, str3), cursor2.getLong(6), z, string2, (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(5), com.google.android.gms.measurement.internal.zzbg.CREATOR), j, (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(7), com.google.android.gms.measurement.internal.zzbg.CREATOR), cursor2.getLong(9), (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(10), com.google.android.gms.measurement.internal.zzbg.CREATOR));
        if (cursor2.moveToNext()) {
            com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
            zzibVar2.zzaV().zzb().zzc("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar2.zzl().zzc(str2));
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return zzahVar;
    }

    public final int zzr(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            return zze().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzd("Error deleting conditional property", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzibVar.zzl().zzc(str2), e);
            return 0;
        }
    }

    public final java.util.List zzs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            java.lang.String.valueOf(str3);
            arrayList.add(java.lang.String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r3 = r5.zzaV().zzb();
        r5.zzc();
        r3.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zzt(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        int i;
        boolean z;
        zzg();
        zzay();
        java.util.List arrayList = new java.util.ArrayList();
        try {
            android.database.sqlite.SQLiteDatabase zze2 = zze();
            java.lang.String[] strArr2 = {"app_id", "origin", "name", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            zzibVar = this.zzu;
            zzibVar.zzc();
            cursor2 = zze2.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
        } catch (android.database.sqlite.SQLiteException e) {
            e = e;
            cursor = null;
        } catch (java.lang.Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            if (cursor2.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    zzibVar.zzc();
                    if (size >= 1000) {
                        break;
                    }
                    java.lang.String string = cursor2.getString(0);
                    java.lang.String string2 = cursor2.getString(1);
                    java.lang.String string3 = cursor2.getString(2);
                    java.lang.Object zzL = zzL(cursor2, 3);
                    if (cursor2.getInt(4) != 0) {
                        i = 5;
                        z = true;
                    } else {
                        i = 5;
                        z = false;
                    }
                    java.lang.String string4 = cursor2.getString(i);
                    long j = cursor2.getLong(6);
                    com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
                    com.google.android.gms.measurement.internal.zzbg zzbgVar = (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(7), com.google.android.gms.measurement.internal.zzbg.CREATOR);
                    arrayList.add(new com.google.android.gms.measurement.internal.zzah(string, string2, new com.google.android.gms.measurement.internal.zzpk(string3, cursor2.getLong(10), zzL, string2), cursor2.getLong(8), z, string4, zzbgVar, j, (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(9), com.google.android.gms.measurement.internal.zzbg.CREATOR), cursor2.getLong(11), (com.google.android.gms.measurement.internal.zzbg) zzpfVar.zzp().zzl(cursor2.getBlob(12), com.google.android.gms.measurement.internal.zzbg.CREATOR)));
                    if (!cursor2.moveToNext()) {
                        break;
                    }
                }
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = cursor2;
            try {
                this.zzu.zzaV().zzb().zzb("Error querying conditional user property value", e);
                arrayList = java.util.Collections.emptyList();
                cursor2 = cursor;
                if (cursor2 != null) {
                }
                return arrayList;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = cursor2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0265 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0281 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0292 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d3 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ed A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0343 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0356 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0372 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0382 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032e A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0303 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0256 A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020a A[Catch: SQLiteException -> 0x0399, all -> 0x03ba, TryCatch #0 {SQLiteException -> 0x0399, blocks: (B:5:0x013c, B:13:0x0144, B:15:0x015b, B:16:0x0162, B:18:0x0175, B:19:0x017c, B:21:0x01bb, B:25:0x01c5, B:28:0x020f, B:30:0x023e, B:34:0x0248, B:37:0x025a, B:39:0x0265, B:40:0x0277, B:42:0x0281, B:43:0x028a, B:45:0x0292, B:48:0x029b, B:50:0x02d3, B:51:0x02e5, B:53:0x02ed, B:56:0x02f6, B:59:0x030e, B:62:0x0338, B:64:0x0343, B:65:0x034e, B:67:0x0356, B:68:0x0361, B:70:0x0372, B:71:0x0379, B:73:0x0382, B:78:0x032e, B:79:0x0303, B:82:0x030a, B:85:0x0256, B:87:0x020a), top: B:4:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzh zzu(java.lang.String str) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        boolean z;
        boolean z2;
        com.google.android.gms.measurement.internal.zzib zzibVar;
        java.lang.Boolean valueOf;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        try {
            cursor2 = zze().query("apps", new java.lang.String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    this.zzu.zzaV().zzb().zzc("Error querying app. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                    if (cursor2 != null) {
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (!cursor2.moveToFirst()) {
            if (cursor2 != null) {
                return null;
            }
            cursor2.close();
            return null;
        }
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
        com.google.android.gms.measurement.internal.zzh zzhVar = new com.google.android.gms.measurement.internal.zzh(zzpfVar.zzaf(), str);
        com.google.android.gms.measurement.internal.zzjk zzB = zzpfVar.zzB(str);
        com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE;
        if (zzB.zzo(zzjjVar)) {
            zzhVar.zze(cursor2.getString(0));
        }
        zzhVar.zzg(cursor2.getString(1));
        if (zzpfVar.zzB(str).zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE)) {
            zzhVar.zzk(cursor2.getString(2));
        }
        zzhVar.zzF(cursor2.getLong(3));
        zzhVar.zzo(cursor2.getLong(4));
        zzhVar.zzq(cursor2.getLong(5));
        zzhVar.zzs(cursor2.getString(6));
        zzhVar.zzw(cursor2.getString(7));
        zzhVar.zzy(cursor2.getLong(8));
        zzhVar.zzA(cursor2.getLong(9));
        if (!cursor2.isNull(10) && cursor2.getInt(10) == 0) {
            z = false;
            zzhVar.zzE(z);
            zzhVar.zzO(cursor2.getLong(11));
            zzhVar.zzQ(cursor2.getLong(12));
            zzhVar.zzS(cursor2.getLong(13));
            zzhVar.zzU(cursor2.getLong(14));
            zzhVar.zzI(cursor2.getLong(15));
            zzhVar.zzK(cursor2.getLong(16));
            zzhVar.zzu(!cursor2.isNull(17) ? -2147483648L : cursor2.getInt(17));
            zzhVar.zzm(cursor2.getString(18));
            zzhVar.zzY(cursor2.getLong(19));
            zzhVar.zzW(cursor2.getLong(20));
            zzhVar.zzab(cursor2.getString(21));
            if (!cursor2.isNull(23) && cursor2.getInt(23) == 0) {
                z2 = false;
                zzhVar.zzad(z2);
                zzhVar.zzC(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
                if (!cursor2.isNull(26)) {
                    zzhVar.zzah(java.util.Arrays.asList(cursor2.getString(26).split(",", -1)));
                }
                if (zzpfVar.zzB(str).zzo(zzjjVar)) {
                    zzhVar.zzi(cursor2.getString(28));
                }
                zzhVar.zzaj(cursor2.isNull(29) && cursor2.getInt(29) != 0);
                zzhVar.zzaE(cursor2.getLong(39));
                zzhVar.zzaz(cursor2.getString(36));
                zzhVar.zzal(cursor2.getLong(30));
                zzhVar.zzan(cursor2.getLong(31));
                com.google.android.gms.internal.measurement.zzql.zza();
                zzibVar = this.zzu;
                if (zzibVar.zzc().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
                    zzhVar.zzap(cursor2.getInt(32));
                    zzhVar.zzax(cursor2.getLong(35));
                }
                zzhVar.zzar(cursor2.isNull(33) && cursor2.getInt(33) != 0);
                if (cursor2.isNull(34)) {
                    valueOf = java.lang.Boolean.valueOf(cursor2.getInt(34) != 0);
                } else {
                    valueOf = null;
                }
                zzhVar.zzaf(valueOf);
                zzhVar.zzaB(cursor2.getInt(37));
                zzhVar.zzaD(cursor2.getInt(38));
                zzhVar.zzaG(!cursor2.isNull(40) ? "" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursor2.getString(40)));
                if (!cursor2.isNull(41)) {
                    zzhVar.zzat(java.lang.Long.valueOf(cursor2.getLong(41)));
                }
                if (!cursor2.isNull(42)) {
                    zzhVar.zzav(java.lang.Long.valueOf(cursor2.getLong(42)));
                }
                zzhVar.zzaI(cursor2.getBlob(43));
                if (!cursor2.isNull(44)) {
                    zzhVar.zzaK(cursor2.getInt(44));
                }
                zzhVar.zzb();
                if (cursor2.moveToNext()) {
                    zzibVar.zzaV().zzb().zzb("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return zzhVar;
            }
            z2 = true;
            zzhVar.zzad(z2);
            zzhVar.zzC(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
            if (!cursor2.isNull(26)) {
            }
            if (zzpfVar.zzB(str).zzo(zzjjVar)) {
            }
            zzhVar.zzaj(cursor2.isNull(29) && cursor2.getInt(29) != 0);
            zzhVar.zzaE(cursor2.getLong(39));
            zzhVar.zzaz(cursor2.getString(36));
            zzhVar.zzal(cursor2.getLong(30));
            zzhVar.zzan(cursor2.getLong(31));
            com.google.android.gms.internal.measurement.zzql.zza();
            zzibVar = this.zzu;
            if (zzibVar.zzc().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
            }
            zzhVar.zzar(cursor2.isNull(33) && cursor2.getInt(33) != 0);
            if (cursor2.isNull(34)) {
            }
            zzhVar.zzaf(valueOf);
            zzhVar.zzaB(cursor2.getInt(37));
            zzhVar.zzaD(cursor2.getInt(38));
            zzhVar.zzaG(!cursor2.isNull(40) ? "" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursor2.getString(40)));
            if (!cursor2.isNull(41)) {
            }
            if (!cursor2.isNull(42)) {
            }
            zzhVar.zzaI(cursor2.getBlob(43));
            if (!cursor2.isNull(44)) {
            }
            zzhVar.zzb();
            if (cursor2.moveToNext()) {
            }
            if (cursor2 != null) {
            }
            return zzhVar;
        }
        z = true;
        zzhVar.zzE(z);
        zzhVar.zzO(cursor2.getLong(11));
        zzhVar.zzQ(cursor2.getLong(12));
        zzhVar.zzS(cursor2.getLong(13));
        zzhVar.zzU(cursor2.getLong(14));
        zzhVar.zzI(cursor2.getLong(15));
        zzhVar.zzK(cursor2.getLong(16));
        zzhVar.zzu(!cursor2.isNull(17) ? -2147483648L : cursor2.getInt(17));
        zzhVar.zzm(cursor2.getString(18));
        zzhVar.zzY(cursor2.getLong(19));
        zzhVar.zzW(cursor2.getLong(20));
        zzhVar.zzab(cursor2.getString(21));
        if (!cursor2.isNull(23)) {
            z2 = false;
            zzhVar.zzad(z2);
            zzhVar.zzC(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
            if (!cursor2.isNull(26)) {
            }
            if (zzpfVar.zzB(str).zzo(zzjjVar)) {
            }
            zzhVar.zzaj(cursor2.isNull(29) && cursor2.getInt(29) != 0);
            zzhVar.zzaE(cursor2.getLong(39));
            zzhVar.zzaz(cursor2.getString(36));
            zzhVar.zzal(cursor2.getLong(30));
            zzhVar.zzan(cursor2.getLong(31));
            com.google.android.gms.internal.measurement.zzql.zza();
            zzibVar = this.zzu;
            if (zzibVar.zzc().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
            }
            zzhVar.zzar(cursor2.isNull(33) && cursor2.getInt(33) != 0);
            if (cursor2.isNull(34)) {
            }
            zzhVar.zzaf(valueOf);
            zzhVar.zzaB(cursor2.getInt(37));
            zzhVar.zzaD(cursor2.getInt(38));
            zzhVar.zzaG(!cursor2.isNull(40) ? "" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursor2.getString(40)));
            if (!cursor2.isNull(41)) {
            }
            if (!cursor2.isNull(42)) {
            }
            zzhVar.zzaI(cursor2.getBlob(43));
            if (!cursor2.isNull(44)) {
            }
            zzhVar.zzb();
            if (cursor2.moveToNext()) {
            }
            if (cursor2 != null) {
            }
            return zzhVar;
        }
        z2 = true;
        zzhVar.zzad(z2);
        zzhVar.zzC(!cursor2.isNull(25) ? 0L : cursor2.getLong(25));
        if (!cursor2.isNull(26)) {
        }
        if (zzpfVar.zzB(str).zzo(zzjjVar)) {
        }
        zzhVar.zzaj(cursor2.isNull(29) && cursor2.getInt(29) != 0);
        zzhVar.zzaE(cursor2.getLong(39));
        zzhVar.zzaz(cursor2.getString(36));
        zzhVar.zzal(cursor2.getLong(30));
        zzhVar.zzan(cursor2.getLong(31));
        com.google.android.gms.internal.measurement.zzql.zza();
        zzibVar = this.zzu;
        if (zzibVar.zzc().zzp(str, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
        }
        zzhVar.zzar(cursor2.isNull(33) && cursor2.getInt(33) != 0);
        if (cursor2.isNull(34)) {
        }
        zzhVar.zzaf(valueOf);
        zzhVar.zzaB(cursor2.getInt(37));
        zzhVar.zzaD(cursor2.getInt(38));
        zzhVar.zzaG(!cursor2.isNull(40) ? "" : (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursor2.getString(40)));
        if (!cursor2.isNull(41)) {
        }
        if (!cursor2.isNull(42)) {
        }
        zzhVar.zzaI(cursor2.getBlob(43));
        if (!cursor2.isNull(44)) {
        }
        zzhVar.zzb();
        if (cursor2.moveToNext()) {
        }
        if (cursor2 != null) {
        }
        return zzhVar;
    }

    public final void zzv(com.google.android.gms.measurement.internal.zzh zzhVar, boolean z, boolean z2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar);
        zzg();
        zzay();
        java.lang.String zzc2 = zzhVar.zzc();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzc2);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzc2);
        if (z) {
            contentValues.put("app_instance_id", (java.lang.String) null);
        } else if (this.zzg.zzB(zzc2).zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zzg;
        if (zzpfVar.zzB(zzc2).zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", java.lang.Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", java.lang.Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (java.lang.Long) 0L);
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", java.lang.Long.valueOf(zzhVar.zzB()));
        if (zzpfVar.zzB(zzc2).zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", java.lang.Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", java.lang.Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", java.lang.Long.valueOf(zzhVar.zzam()));
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzc().zzp(zzc2, com.google.android.gms.measurement.internal.zzfx.zzaP)) {
            contentValues.put("ad_services_version", java.lang.Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", java.lang.Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", java.lang.Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", java.lang.Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", java.lang.Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", java.lang.Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", java.lang.Integer.valueOf(zzhVar.zzaL()));
        java.util.List zzag = zzhVar.zzag();
        if (zzag != null) {
            if (zzag.isEmpty()) {
                zzibVar.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", zzc2);
            } else {
                contentValues.put("safelisted_events", android.text.TextUtils.join(",", zzag));
            }
        }
        com.google.android.gms.internal.measurement.zzpn.zza();
        if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (java.lang.String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        try {
            android.database.sqlite.SQLiteDatabase zze2 = zze();
            if (zze2.update("apps", contentValues, "app_id = ?", new java.lang.String[]{zzc2}) == 0 && zze2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzc2));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            this.zzu.zzaV().zzb().zzc("Error storing app. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzc2), e);
        }
    }

    public final com.google.android.gms.measurement.internal.zzar zzw(long j, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zzx(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzar zzx(long j, java.lang.String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        java.lang.String[] strArr = {str};
        com.google.android.gms.measurement.internal.zzar zzarVar = new com.google.android.gms.measurement.internal.zzar();
        try {
            android.database.sqlite.SQLiteDatabase zze2 = zze();
            cursor2 = zze2.query("apps", new java.lang.String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                if (cursor2.moveToFirst()) {
                    if (cursor2.getLong(0) == j) {
                        zzarVar.zzb = cursor2.getLong(1);
                        zzarVar.zza = cursor2.getLong(2);
                        zzarVar.zzc = cursor2.getLong(3);
                        zzarVar.zzd = cursor2.getLong(4);
                        zzarVar.zze = cursor2.getLong(5);
                        zzarVar.zzf = cursor2.getLong(6);
                        zzarVar.zzg = cursor2.getLong(7);
                    }
                    if (z) {
                        zzarVar.zzb += j2;
                    }
                    if (z2) {
                        zzarVar.zza += j2;
                    }
                    if (z3) {
                        zzarVar.zzc += j2;
                    }
                    if (z4) {
                        zzarVar.zzd += j2;
                    }
                    if (z5) {
                        zzarVar.zze += j2;
                    }
                    if (z6) {
                        zzarVar.zzf += j2;
                    }
                    if (z7) {
                        zzarVar.zzg += j2;
                    }
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("day", java.lang.Long.valueOf(j));
                    contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", java.lang.Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", java.lang.Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", java.lang.Long.valueOf(zzarVar.zzg));
                    zze2.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaV().zze().zzb("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                }
            } catch (android.database.sqlite.SQLiteException e) {
                e = e;
                cursor = cursor2;
                try {
                    this.zzu.zzaV().zzb().zzc("Error updating daily counts. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    return zzarVar;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return zzarVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzaq zzy(java.lang.String str) {
        android.database.sqlite.SQLiteException e;
        android.database.Cursor cursor;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        android.database.Cursor cursor2 = null;
        try {
            cursor = zze().query("apps", new java.lang.String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        java.lang.String string = cursor.getString(1);
                        java.lang.String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            this.zzu.zzaV().zzb().zzb("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
                        }
                        if (blob != null) {
                            com.google.android.gms.measurement.internal.zzaq zzaqVar = new com.google.android.gms.measurement.internal.zzaq(blob, string, string2);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return zzaqVar;
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzc("Error querying remote config. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (r3 > (com.google.android.gms.measurement.internal.zzal.zzI() + r1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzidVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzidVar.zzA());
        com.google.android.gms.common.internal.Preconditions.checkState(zzidVar.zzn());
        zzI();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        long zzo = zzidVar.zzo();
        zzibVar.zzc();
        if (zzo >= currentTimeMillis - com.google.android.gms.measurement.internal.zzal.zzI()) {
            long zzo2 = zzidVar.zzo();
            zzibVar.zzc();
        }
        zzibVar.zzaV().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzgt.zzl(zzidVar.zzA()), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(zzidVar.zzo()));
        try {
            byte[] zzv = this.zzg.zzp().zzv(zzidVar.zzcc());
            com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
            zzibVar2.zzaV().zzk().zzb("Saving bundle, size", java.lang.Integer.valueOf(zzv.length));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", java.lang.Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", zzv);
            contentValues.put("has_realtime", java.lang.Integer.valueOf(z ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", java.lang.Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (zze().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzibVar2.zzaV().zzb().zzb("Failed to insert bundle (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzidVar.zzA()));
                return false;
            } catch (android.database.sqlite.SQLiteException e) {
                this.zzu.zzaV().zzb().zzc("Error storing bundle. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzidVar.zzA()), e);
                return false;
            }
        } catch (java.io.IOException e2) {
            this.zzu.zzaV().zzb().zzc("Data loss. Failed to serialize bundle. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzidVar.zzA()), e2);
            return false;
        }
    }
}
