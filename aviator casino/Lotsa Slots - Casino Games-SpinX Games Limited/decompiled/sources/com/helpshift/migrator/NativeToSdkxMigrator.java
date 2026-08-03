package com.helpshift.migrator;

/* loaded from: classes2.dex */
public class NativeToSdkxMigrator {
    private static final java.lang.String TAG = "Helpshift_Migrator";
    private static final java.lang.String USER_ID = "userId";
    private final java.lang.String DID_KEY;
    private final java.lang.String FAILED_KEY;
    private final java.lang.String LEGACY_ID_KEY;
    private final java.lang.String PUSH_TOKEN_KEY;
    private final java.lang.String SDK_LANG_KEY;
    private final java.lang.String SUCCESS_KEY;
    private final java.lang.String USER_DATA_KEY;
    private int attempts;
    private final android.content.Context context;
    private final java.lang.StringBuilder failureLogBuilder;
    private final java.util.Map<java.lang.String, java.lang.String> failureMap;
    private final com.helpshift.migrator.MigrationLogger migrationLogger;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final android.content.SharedPreferences preferences;

    public NativeToSdkxMigrator(android.content.Context context, com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.failureMap = hashMap;
        this.SUCCESS_KEY = com.inmobi.unification.sdk.InitializationStatus.SUCCESS;
        this.FAILED_KEY = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED;
        this.DID_KEY = "DeviceId : ";
        this.SDK_LANG_KEY = "SDK Language : ";
        this.PUSH_TOKEN_KEY = "Push Token : ";
        this.USER_DATA_KEY = "User Data : ";
        this.LEGACY_ID_KEY = "Legacy Analytics Id : ";
        this.attempts = 0;
        this.context = context;
        this.preferences = context.getSharedPreferences(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_SHARED_PREF, 0);
        this.persistentStorage = hSPersistentStorage;
        this.migrationLogger = new com.helpshift.migrator.MigrationLogger(new com.helpshift.storage.SharedPreferencesStore(context, com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_SHARED_PREF, 0));
        this.failureLogBuilder = new java.lang.StringBuilder("Migration Result: ");
        hashMap.put("DeviceId : ", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("SDK Language : ", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("Push Token : ", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("Legacy Analytics Id : ", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
        hashMap.put("User Data : ", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED);
    }

    public synchronized void migrate() {
        com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore;
        int i;
        try {
            if (!shouldMigrate()) {
                this.migrationLogger.d(TAG, "Migration not required, skipping");
                return;
            }
            try {
                hSLegacySupportKeyValueStore = new com.helpshift.migrator.database.HSLegacySupportKeyValueStore(this.context);
            } catch (java.lang.Exception e) {
                this.migrationLogger.e(TAG, "Migration failed with exception", e);
            }
            try {
                com.helpshift.migrator.database.HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper = new com.helpshift.migrator.database.HSNativeSDKUserDBHelper(this.context);
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    i = 1;
                    if (i2 >= 3) {
                        break;
                    }
                    try {
                        this.attempts++;
                        z = migrateKVStoreData(hSLegacySupportKeyValueStore);
                        z2 = migrateUserData(hSNativeSDKUserDBHelper);
                        logMessageOnStep("User data migration", z2);
                        updateFailuresMap("User Data : ", z2);
                        z3 = migrateLegacyAnalyticsEventIds(hSNativeSDKUserDBHelper);
                        logMessageOnStep("Legacy analytics event ID data migration", z3);
                        updateFailuresMap("Legacy Analytics Id : ", z3);
                        if (z && z2 && z3) {
                            break;
                        }
                        com.helpshift.migrator.MigrationLogger migrationLogger = this.migrationLogger;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("Native SDK to SDK X migration failed! Attempt : ");
                        i2++;
                        sb.append(i2);
                        migrationLogger.e(TAG, sb.toString());
                    } finally {
                    }
                }
                if (!z || !z2 || !z3) {
                    i = -1;
                }
                addNativeSDKVersionLog(i);
                storeFailureLog(i);
                this.preferences.edit().putInt(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_STATE_KEY, i).commit();
                hSNativeSDKUserDBHelper.close();
                hSLegacySupportKeyValueStore.close();
                return;
            } catch (java.lang.Throwable th) {
                try {
                    hSLegacySupportKeyValueStore.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Exception unused) {
            this.migrationLogger.d(TAG, "Error checking shouldMigrate. Skipping");
        }
    }

    private void storeFailureLog(int i) {
        if (i != -1) {
            return;
        }
        java.lang.StringBuilder sb = this.failureLogBuilder;
        sb.append(" Attempts: ");
        sb.append(this.attempts);
        sb.append(" , ");
        java.lang.StringBuilder sb2 = this.failureLogBuilder;
        sb2.append("DeviceId : ");
        sb2.append(this.failureMap.get("DeviceId : "));
        sb2.append(" , ");
        java.lang.StringBuilder sb3 = this.failureLogBuilder;
        sb3.append("User Data : ");
        sb3.append(this.failureMap.get("User Data : "));
        sb3.append(" , ");
        java.lang.StringBuilder sb4 = this.failureLogBuilder;
        sb4.append("Push Token : ");
        sb4.append(this.failureMap.get("Push Token : "));
        sb4.append(" , ");
        java.lang.StringBuilder sb5 = this.failureLogBuilder;
        sb5.append("SDK Language : ");
        sb5.append(this.failureMap.get("SDK Language : "));
        sb5.append(" , ");
        java.lang.StringBuilder sb6 = this.failureLogBuilder;
        sb6.append("Legacy Analytics Id : ");
        sb6.append(this.failureMap.get("Legacy Analytics Id : "));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss", java.util.Locale.ENGLISH);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            jSONObject.put(com.ironsource.M6.w0, simpleDateFormat.format(new java.util.Date()));
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "ERROR");
            jSONObject.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, this.failureLogBuilder.toString());
            jSONObject.put("src", "sdkx.android.10.5.0");
            this.preferences.edit().putString(com.helpshift.migrator.MigratorSharedPrefConstants.FAILURE_LOG_KEY, jSONObject.toString()).commit();
        } catch (java.lang.Exception unused) {
            android.util.Log.e(TAG, "Error storing failure log.");
        }
    }

    private void addNativeSDKVersionLog(int i) {
        try {
            java.lang.String str = "Native SDK version: " + this.context.getSharedPreferences("HSJsonData", 0).getString("libraryVersion", "unknown") + " to SDK X version: 10.5.0";
            if (i == -1) {
                this.migrationLogger.e(TAG, str);
                this.migrationLogger.e(TAG, " Migration failed!");
            } else {
                this.migrationLogger.d(TAG, str);
                this.migrationLogger.d(TAG, "Migration success!");
            }
        } catch (java.lang.Exception e) {
            this.migrationLogger.e(TAG, "Error fetching SDK info for logging", e);
        }
    }

    private boolean shouldMigrate() {
        return databaseExists(com.helpshift.migrator.database.HSLegacySupportKeyValueStore.KV_STORE_DB_NAME) && this.preferences.getInt(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_STATE_KEY, 0) == 0;
    }

    private void logMessageOnStep(java.lang.String str, boolean z) {
        java.lang.String str2 = z ? " : Success" : " : Failed";
        if (!z) {
            this.migrationLogger.e(TAG, str + str2);
            return;
        }
        this.migrationLogger.d(TAG, str + str2);
    }

    private void updateFailuresMap(java.lang.String str, boolean z) {
        if (z) {
            this.failureMap.put(str, com.inmobi.unification.sdk.InitializationStatus.SUCCESS);
        }
    }

    private boolean migrateKVStoreData(com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore) {
        boolean migrateDeviceId = migrateDeviceId(hSLegacySupportKeyValueStore);
        logMessageOnStep("DeviceId migration", migrateDeviceId);
        updateFailuresMap("DeviceId : ", migrateDeviceId);
        migratePushToken(hSLegacySupportKeyValueStore);
        logMessageOnStep("Push token migration", true);
        updateFailuresMap("Push Token : ", true);
        migrateSDKLanguage(hSLegacySupportKeyValueStore);
        logMessageOnStep("SDK language migration", true);
        updateFailuresMap("SDK Language : ", true);
        return migrateDeviceId;
    }

    private void migrateSDKLanguage(com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore) {
        if (com.helpshift.util.Utils.isNotEmpty(this.persistentStorage.getLanguage())) {
            return;
        }
        java.lang.Object readStringFromKVDB = readStringFromKVDB(hSLegacySupportKeyValueStore, "sdkLanguage");
        this.persistentStorage.setLanguage(readStringFromKVDB instanceof java.lang.String ? (java.lang.String) readStringFromKVDB : "");
    }

    private void migratePushToken(com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore) {
        if (com.helpshift.util.Utils.isNotEmpty(this.persistentStorage.getCurrentPushToken())) {
            return;
        }
        java.lang.Object readStringFromKVDB = readStringFromKVDB(hSLegacySupportKeyValueStore, "key_push_token");
        this.persistentStorage.setCurrentPushToken(readStringFromKVDB instanceof java.lang.String ? (java.lang.String) readStringFromKVDB : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.length() <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r5.persistentStorage.putString(com.helpshift.storage.HSPersistentStorage.LEGACY_ANALYTICS_EVENTS_IDS, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean migrateLegacyAnalyticsEventIds(com.helpshift.migrator.database.HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper) {
        if (!databaseExists(com.helpshift.migrator.database.HSNativeSDKUserDBHelper.USER_DB_NAME)) {
            return false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = hSNativeSDKUserDBHelper.getReadableDatabase().rawQuery("SELECT * FROM legacy_analytics_event_id_table", null);
                while (cursor.moveToNext()) {
                    jSONObject.put(cursor.getString(cursor.getColumnIndexOrThrow("identifier")), cursor.getString(cursor.getColumnIndexOrThrow("analytics_event_id")));
                }
            } catch (java.lang.Exception e) {
                this.migrationLogger.e(TAG, "Error reading legacy analytics event id.", e);
            }
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private boolean migrateDeviceId(com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore) {
        if (com.helpshift.util.Utils.isNotEmpty(this.persistentStorage.getHsDeviceId())) {
            return true;
        }
        java.lang.Object readStringFromKVDB = readStringFromKVDB(hSLegacySupportKeyValueStore, "key_support_device_id");
        if (readStringFromKVDB == null) {
            return false;
        }
        this.persistentStorage.setHsDeviceId((java.lang.String) readStringFromKVDB);
        return true;
    }

    private boolean databaseExists(java.lang.String str) {
        return new java.io.File(this.context.getDatabasePath(str).getAbsolutePath()).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r11 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.Object readStringFromKVDB(com.helpshift.migrator.database.HSLegacySupportKeyValueStore hSLegacySupportKeyValueStore, java.lang.String str) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2 = null;
        r1 = null;
        java.lang.Object obj = null;
        try {
            cursor = hSLegacySupportKeyValueStore.getReadableDatabase().query("key_value_store", null, "key=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    obj = cursor.moveToFirst() ? toObject(cursor.getBlob(1)) : null;
                } catch (java.lang.Exception e) {
                    e = e;
                    this.migrationLogger.e(TAG, "Failed to read the native db or DB does not exist. Key : " + str, e);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            cursor = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    private boolean migrateUserData(com.helpshift.migrator.database.HSNativeSDKUserDBHelper hSNativeSDKUserDBHelper) {
        if (!databaseExists(com.helpshift.migrator.database.HSNativeSDKUserDBHelper.USER_DB_NAME)) {
            return false;
        }
        java.util.ArrayList<java.util.Map> arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = hSNativeSDKUserDBHelper.getReadableDatabase().rawQuery("SELECT * FROM user_table", null);
                while (cursor.moveToNext()) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("anon", java.lang.String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("anonymous"))));
                    hashMap.put("userId", cursor.getString(cursor.getColumnIndexOrThrow("identifier")));
                    hashMap.put("userName", cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    hashMap.put("userEmail", cursor.getString(cursor.getColumnIndexOrThrow("email")));
                    hashMap.put("userAuthToken", cursor.getString(cursor.getColumnIndexOrThrow("auth_token")));
                    hashMap.put("isActive", java.lang.String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE))));
                    arrayList.add(hashMap);
                }
                if (cursor != null) {
                    cursor.close();
                }
                for (java.util.Map map : arrayList) {
                    try {
                        boolean equals = "1".equals(map.remove("anon"));
                        boolean equals2 = "1".equals(map.remove("isActive"));
                        if (equals) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("userId", map.get("userId"));
                            this.persistentStorage.storeAnonymousUserIdMap(jSONObject.toString());
                        } else if (equals2) {
                            this.persistentStorage.setActiveUser(new org.json.JSONObject(map).toString());
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put(com.helpshift.user.UserConstants.USER_TYPE, 0);
                            this.persistentStorage.putString(com.helpshift.user.UserConstants.ACTIVE_USER_DATA, jSONObject2.toString());
                        }
                    } catch (java.lang.Exception e) {
                        this.migrationLogger.e(TAG, "Error setting user data in SDK X migration", e);
                        return false;
                    }
                }
                return true;
            } catch (java.lang.Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (java.lang.Exception e2) {
            this.migrationLogger.e(TAG, "Error getting user data from native SDK", e2);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        }
    }

    private java.lang.Object toObject(byte[] bArr) throws java.io.IOException, java.lang.ClassNotFoundException {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
            try {
                java.lang.Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                byteArrayInputStream.close();
                return readObject;
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public java.lang.String getMigrationErrorLogs() {
        int i;
        if (!this.preferences.getBoolean(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_LOG_SYNCED_WEBCHAT, false) && (i = this.preferences.getInt(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_STATE_KEY, 0)) != 1 && i != 0) {
            try {
                java.lang.String string = this.preferences.getString(com.helpshift.migrator.MigrationLogger.ERROR_LOG_ARRAY_KEY, "");
                if (com.helpshift.util.Utils.isEmpty(string)) {
                    string = okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_STATE_KEY, "FAILED");
                jSONObject.put("did", this.persistentStorage.getHsDeviceId());
                jSONObject.put("logs", jSONArray);
                return jSONObject.toString();
            } catch (java.lang.Exception unused) {
                android.util.Log.e(TAG, "Error getting error logs for migration");
            }
        }
        return "";
    }

    public void setErrorLogsSyncedWithWebchat(boolean z) {
        this.preferences.edit().putBoolean(com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_LOG_SYNCED_WEBCHAT, z).commit();
    }
}
