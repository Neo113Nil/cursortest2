package com.adobe.marketing.mobile.internal.migration;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003R\u0017\u0010\b\u001a\u0004\u0018\u00010\u00078CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/V4Migrator;", "", "<init>", "()V", "", "migrate", "getHighSpeedVideoSizes", "Landroid/content/SharedPreferences;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class V4Migrator {
    private final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.content.SharedPreferences>() { // from class: com.adobe.marketing.mobile.internal.migration.V4Migrator$v4SharedPreferences$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final android.content.SharedPreferences invoke() {
            android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
            if (applicationContext != null) {
                return applicationContext.getSharedPreferences(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.DATASTORE_NAME, 0);
            }
            return null;
        }
    });

    private final void getHighSpeedVideoSizes() {
        com.adobe.marketing.mobile.MobilePrivacyStatus mobilePrivacyStatus;
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.getHighSpeedVideoFpsRanges.getValue();
        if (sharedPreferences == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection("AdobeMobile_ConfigState");
        int i = sharedPreferences.getInt(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Configuration.GLOBAL_PRIVACY_KEY, -1);
        if (i >= 0 && i < 3) {
            if (i == 0) {
                mobilePrivacyStatus = com.adobe.marketing.mobile.MobilePrivacyStatus.OPT_IN;
            } else if (i == 1) {
                mobilePrivacyStatus = com.adobe.marketing.mobile.MobilePrivacyStatus.OPT_OUT;
            } else if (i == 2) {
                mobilePrivacyStatus = com.adobe.marketing.mobile.MobilePrivacyStatus.UNKNOWN;
            } else {
                mobilePrivacyStatus = com.adobe.marketing.mobile.MobilePrivacyStatus.UNKNOWN;
            }
            java.lang.String string = namedCollection.getString("config.overridden.map", null);
            if (string != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    if (jSONObject.has("global.privacy")) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "V5 configuration data already contains setting for global privacy. V4 global privacy not migrated.", new java.lang.Object[0]);
                    } else {
                        jSONObject.put("global.privacy", mobilePrivacyStatus.getValue());
                        namedCollection.setString("config.overridden.map", jSONObject.toString());
                    }
                } catch (org.json.JSONException e) {
                    com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Failed to serialize v5 configuration data. Unable to migrate v4 configuration data to v5. %s", e.getLocalizedMessage());
                }
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("global.privacy", mobilePrivacyStatus.getValue());
                namedCollection.setString("config.overridden.map", new org.json.JSONObject(hashMap).toString());
            }
        }
        edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Configuration.GLOBAL_PRIVACY_KEY);
        edit.apply();
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Configuration data.", new java.lang.Object[0]);
    }

    public final void migrate() {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (((android.content.SharedPreferences) this.getHighSpeedVideoFpsRanges.getValue()) == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "%s (v4 shared preferences), failed to migrate v4 storage", com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE);
        }
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.getHighSpeedVideoFpsRanges.getValue();
        if (sharedPreferences == null || !sharedPreferences.contains(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.INSTALL_DATE)) {
            obj = com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE;
            str = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.DATASTORE_NAME;
            str2 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.DATASTORE_NAME;
            str3 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.VID;
            android.content.SharedPreferences sharedPreferences2 = (android.content.SharedPreferences) this.getHighSpeedVideoFpsRanges.getValue();
            if (sharedPreferences2 != null && sharedPreferences2.contains(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Configuration.GLOBAL_PRIVACY_KEY)) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migrating Adobe SDK v4 Configuration SharedPreferences for use with AEP SDK.", new java.lang.Object[0]);
                getHighSpeedVideoSizes();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Full migration of v4 Configuration SharedPreferences successful.", new java.lang.Object[0]);
            }
        } else {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migrating Adobe SDK v4 SharedPreferences for use with AEP SDK.", new java.lang.Object[0]);
            android.content.SharedPreferences sharedPreferences3 = (android.content.SharedPreferences) this.getHighSpeedVideoFpsRanges.getValue();
            if (sharedPreferences3 == null) {
                obj = com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE;
                str = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.DATASTORE_NAME;
                str2 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.DATASTORE_NAME;
                str3 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.VID;
            } else {
                android.content.SharedPreferences.Editor edit = sharedPreferences3.edit();
                long j = sharedPreferences3.getLong(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.INSTALL_DATE, 0L);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_SOURCE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_MEDIUM);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_TERM);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_CONTENT);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_TRACKINGCODE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Messages.SHARED_PREFERENCES_BLACK_LIST);
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Mobile Services data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Acquisition.DATASTORE_NAME).setString("ADMS_Referrer_ContextData_Json_String", sharedPreferences3.getString("ADMS_Referrer_ContextData_Json_String", null));
                edit.remove("ADMS_Referrer_ContextData_Json_String");
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Acquisition data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.NamedCollection namedCollection = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.DATASTORE_NAME);
                namedCollection.setString("ADOBEMOBILE_STOREDDEFAULTS_AID", sharedPreferences3.getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null));
                str = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.DATASTORE_NAME;
                namedCollection.setBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", sharedPreferences3.getBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false));
                namedCollection.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.VID, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_ID, null));
                edit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
                edit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Analytics.LAST_KNOWN_TIMESTAMP);
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Analytics data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.AudienceManager.DATASTORE_NAME).setString("AAMUserId", sharedPreferences3.getString("AAMUserId", null));
                edit.remove("AAMUserId");
                edit.remove("AAMUserProfile");
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Audience Manager data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.NamedCollection namedCollection2 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.DATASTORE_NAME);
                namedCollection2.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.MID, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.MID, null));
                namedCollection2.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.BLOB, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.BLOB, null));
                str3 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics.VID;
                namedCollection2.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.HINT, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.HINT, null));
                str2 = com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.DATASTORE_NAME;
                namedCollection2.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.VISITOR_IDS, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_IDS, null));
                obj = com.adobe.marketing.mobile.services.Log.UNEXPECTED_NULL_VALUE;
                namedCollection2.setBoolean(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.PUSH_ENABLED, sharedPreferences3.getBoolean(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.PUSH_ENABLED, false));
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.MID);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.BLOB);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.HINT);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_ID);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_IDS);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_ID_SYNC);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.VISITOR_ID_TTL);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.ADVERTISING_IDENTIFIER);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.PUSH_IDENTIFIER);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.PUSH_ENABLED);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity.AID_SYNCED);
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Identity (Visitor ID Service) data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.NamedCollection namedCollection3 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.DATASTORE_NAME);
                if (j > 0) {
                    namedCollection3.setLong(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.INSTALL_DATE, j / 1000);
                }
                namedCollection3.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.LAST_VERSION, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAST_VERSION, null));
                long j2 = sharedPreferences3.getLong(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAST_USED_DATE, 0L);
                if (j2 > 0) {
                    namedCollection3.setLong(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.LAST_USED_DATE, j2 / 1000);
                }
                namedCollection3.setInt(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.LAUNCHES, sharedPreferences3.getInt(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAUNCHES, 0));
                namedCollection3.setBoolean(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle.SUCCESFUL_CLOSE, sharedPreferences3.getBoolean(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.SUCCESFUL_CLOSE, false));
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.INSTALL_DATE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAST_VERSION);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAST_USED_DATE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAUNCHES);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.SUCCESFUL_CLOSE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.CONTEXT_DATA);
                edit.remove("ADMS_SessionStart");
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.PAUSE_DATE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.LAUNCHES_AFTER_UPGRADE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.UPGRADE_DATE);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.OS);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle.APPLICATION_ID);
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migration complete for Lifecycle data.", new java.lang.Object[0]);
                com.adobe.marketing.mobile.services.NamedCollection namedCollection4 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.DATASTORE_NAME);
                namedCollection4.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.TNT_ID, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.TNT_ID, null));
                namedCollection4.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.THIRD_PARTY_ID, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.THIRD_PARTY_ID, null));
                namedCollection4.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.SESSION_ID, null));
                namedCollection4.setString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.EDGE_HOST, sharedPreferences3.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.EDGE_HOST, null));
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.TNT_ID);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.THIRD_PARTY_ID);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.SESSION_ID);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.EDGE_HOST);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.LAST_TIMESTAMP);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.COOKIE_EXPIRES);
                edit.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target.COOKIE_VALUE);
                edit.apply();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migrating complete for Target data.", new java.lang.Object[0]);
            }
            getHighSpeedVideoSizes();
            java.io.File applicationCacheDir = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
            if (applicationCacheDir == null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "%s (cache directory), failed to delete V4 databases", obj);
            } else {
                for (java.lang.String str4 : com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.INSTANCE.getDATABASE_NAMES()) {
                    try {
                        java.io.File file = new java.io.File(applicationCacheDir, str4);
                        if (file.exists() && file.delete()) {
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Removed V4 database %s successfully", str4);
                        }
                    } catch (java.lang.SecurityException e) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Failed to delete V4 database with name %s (%s)", str4, e);
                    }
                }
            }
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Full migration of v4 SharedPreferences successful.", new java.lang.Object[0]);
        }
        java.lang.String str5 = str2;
        com.adobe.marketing.mobile.services.NamedCollection namedCollection5 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(str5);
        if (namedCollection5 == null || !namedCollection5.contains(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.VISITOR_ID)) {
            return;
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Migrating visitor identifier from Identity to Analytics.", new java.lang.Object[0]);
        com.adobe.marketing.mobile.services.NamedCollection namedCollection6 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(str5);
        com.adobe.marketing.mobile.services.NamedCollection namedCollection7 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDataStoreService().getNamedCollection(str);
        if (namedCollection6 == null || namedCollection7 == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "%s (Identity or Analytics data store), failed to migrate visitor id.", obj);
        } else {
            java.lang.String str6 = str3;
            if (!namedCollection7.contains(str6)) {
                namedCollection7.setString(str6, namedCollection6.getString(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.VISITOR_ID, null));
            }
            namedCollection6.remove(com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity.VISITOR_ID);
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "MobileCore/V4Migrator", "Full migration of visitor identifier from Identity to Analytics successful.", new java.lang.Object[0]);
    }
}
