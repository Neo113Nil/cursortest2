package com.paypal.oslo.core.persistence.appstorage;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\b\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/core/persistence/appstorage/SharedPreferenceMigrationHelper;", "", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "encryptionManager", "<init>", "(Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;)V", "Landroidx/datastore/migrations/SharedPreferencesView;", "legacyPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentPrefs", "", "Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;", "keySetToMigrate", "migratePrefs", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;Ljava/util/Set;)Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "context", "", "prefsFileName", "Landroidx/datastore/core/DataMigration;", "migrateEncryptedPrefs", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)Landroidx/datastore/core/DataMigration;", "T", "Landroidx/datastore/preferences/core/Preferences$Key;", "p0", "p1", "p2", "Landroidx/datastore/preferences/core/MutablePreferences;", "p3", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lcom/paypal/oslo/core/persistence/appstorage/SharedPrefKeyMigration;Landroidx/datastore/preferences/core/MutablePreferences;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/persistence/encryption/EncryptionManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPreferenceMigrationHelper {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.encryption.EncryptionManager getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SharedPreferenceMigrationHelper(com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptionManager, "");
        this.getHighSpeedVideoFpsRanges = encryptionManager;
    }

    public final androidx.content.preferences.core.Preferences migratePrefs(androidx.content.migrations.SharedPreferencesView legacyPrefs, androidx.content.preferences.core.Preferences currentPrefs, java.util.Set<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration> keySetToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyPrefs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPrefs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySetToMigrate, "");
        androidx.content.preferences.core.MutablePreferences mutablePreferences = currentPrefs.toMutablePreferences();
        for (com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration sharedPrefKeyMigration : keySetToMigrate) {
            switch (com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper.WhenMappings.$EnumSwitchMapping$0[sharedPrefKeyMigration.getType().ordinal()]) {
                case 1:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.getString(sharedPrefKeyMigration.getLegacyKey(), null), sharedPrefKeyMigration, mutablePreferences);
                    break;
                case 2:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.intKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.contains(sharedPrefKeyMigration.getLegacyKey()) ? java.lang.Integer.valueOf(legacyPrefs.getInt(sharedPrefKeyMigration.getLegacyKey(), 0)) : null, sharedPrefKeyMigration, mutablePreferences);
                    break;
                case 3:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.booleanKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.contains(sharedPrefKeyMigration.getLegacyKey()) ? java.lang.Boolean.valueOf(legacyPrefs.getBoolean(sharedPrefKeyMigration.getLegacyKey(), false)) : null, sharedPrefKeyMigration, mutablePreferences);
                    break;
                case 4:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.longKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.contains(sharedPrefKeyMigration.getLegacyKey()) ? java.lang.Long.valueOf(legacyPrefs.getLong(sharedPrefKeyMigration.getLegacyKey(), 0L)) : null, sharedPrefKeyMigration, mutablePreferences);
                    break;
                case 5:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.floatKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.contains(sharedPrefKeyMigration.getLegacyKey()) ? java.lang.Float.valueOf(legacyPrefs.getFloat(sharedPrefKeyMigration.getLegacyKey(), 0.0f)) : null, sharedPrefKeyMigration, mutablePreferences);
                    break;
                case 6:
                    getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringSetKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName()), legacyPrefs.getStringSet(sharedPrefKeyMigration.getLegacyKey(), null), sharedPrefKeyMigration, mutablePreferences);
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return mutablePreferences;
    }

    public final androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences> migrateEncryptedPrefs(final android.content.Context context, final java.lang.String prefsFileName, final java.util.Set<com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration> keySetToMigrate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefsFileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keySetToMigrate, "");
        final java.io.File file = new java.io.File(context.getApplicationInfo().dataDir, "shared_prefs");
        return new androidx.content.core.DataMigration<androidx.content.preferences.core.Preferences>() { // from class: com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper$migrateEncryptedPrefs$1
            @Override // androidx.content.core.DataMigration
            public final /* bridge */ /* synthetic */ java.lang.Object shouldMigrate(androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation continuation) {
                return shouldMigrate2(preferences, (kotlin.coroutines.Continuation<? super java.lang.Boolean>) continuation);
            }

            /* renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
            public final java.lang.Object shouldMigrate2(androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                java.io.File file2 = file;
                java.lang.String str = prefsFileName;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(".xml");
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(new java.io.File(file2, sb.toString()).exists());
            }

            @Override // androidx.content.core.DataMigration
            public final java.lang.Object migrate(androidx.content.preferences.core.Preferences preferences, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) {
                com.paypal.oslo.core.persistence.encryption.EncryptionManager encryptionManager;
                android.content.SharedPreferences highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, prefsFileName);
                if (highSpeedVideoFpsRanges == null) {
                    return preferences;
                }
                androidx.content.preferences.core.MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                for (com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration sharedPrefKeyMigration : keySetToMigrate) {
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, sharedPrefKeyMigration);
                    androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey = com.paypal.oslo.core.persistence.appstorage.KeyMapper.INSTANCE.stringKey(sharedPrefKeyMigration.getModuleName(), sharedPrefKeyMigration.getNewKey().getName());
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper sharedPreferenceMigrationHelper = this;
                        if (!mutablePreferences.contains(stringKey)) {
                            encryptionManager = sharedPreferenceMigrationHelper.getHighSpeedVideoFpsRanges;
                            mutablePreferences.set(stringKey, encryptionManager.encryptValue(highResolutionOutputSizeshNQ4ISI));
                        }
                    }
                }
                return mutablePreferences;
            }

            @Override // androidx.content.core.DataMigration
            public final java.lang.Object cleanUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.io.File file2 = file;
                java.lang.String str = prefsFileName;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(".xml");
                new java.io.File(file2, sb.toString()).delete();
                return kotlin.Unit.INSTANCE;
            }

            private static android.content.SharedPreferences getHighSpeedVideoFpsRanges(android.content.Context p0, java.lang.String p1) {
                try {
                    androidx.security.crypto.MasterKey build = new androidx.security.crypto.MasterKey.Builder(p0).setKeyScheme(androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                    return androidx.security.crypto.EncryptedSharedPreferences.create(p0, p1, build, androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                } catch (java.io.IOException e) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.persistence.appstorage.LoggerKt.log;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("EncryptedPref migration failed '");
                    sb.append(p1);
                    sb.append("'");
                    logger.e(sb.toString(), e);
                    return null;
                } catch (java.security.GeneralSecurityException e2) {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.persistence.appstorage.LoggerKt.log;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("EncryptedPref migration failed '");
                    sb2.append(p1);
                    sb2.append("'");
                    logger2.e(sb2.toString(), e2);
                    return null;
                }
            }

            private static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(android.content.SharedPreferences p0, com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration p1) {
                try {
                    if (p0.contains(p1.getLegacyKey())) {
                        switch (com.paypal.oslo.core.persistence.appstorage.SharedPreferenceMigrationHelper$migrateEncryptedPrefs$1.WhenMappings.$EnumSwitchMapping$0[p1.getType().ordinal()]) {
                            case 1:
                                return p0.getString(p1.getLegacyKey(), null);
                            case 2:
                                return java.lang.Integer.valueOf(p0.getInt(p1.getLegacyKey(), 0));
                            case 3:
                                return java.lang.Boolean.valueOf(p0.getBoolean(p1.getLegacyKey(), false));
                            case 4:
                                return java.lang.Long.valueOf(p0.getLong(p1.getLegacyKey(), 0L));
                            case 5:
                                return java.lang.Float.valueOf(p0.getFloat(p1.getLegacyKey(), 0.0f));
                            case 6:
                                return p0.getStringSet(p1.getLegacyKey(), null);
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                } catch (java.lang.ClassCastException e) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.persistence.appstorage.LoggerKt.log;
                    java.lang.String legacyKey = p1.getLegacyKey();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("EncryptedPref migration failed '");
                    sb.append(legacyKey);
                    sb.append("'");
                    logger.e(sb.toString(), e);
                } catch (java.security.GeneralSecurityException e2) {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.persistence.appstorage.LoggerKt.log;
                    java.lang.String legacyKey2 = p1.getLegacyKey();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("EncryptedPref migration failed '");
                    sb2.append(legacyKey2);
                    sb2.append("'");
                    logger2.e(sb2.toString(), e2);
                }
                return null;
            }

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.values().length];
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.INT.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.BOOLEAN.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.LONG.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.FLOAT.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING_SET.ordinal()] = 6;
                    } catch (java.lang.NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        };
    }

    private static <T> void getHighResolutionOutputSizeshNQ4ISI(androidx.datastore.preferences.core.Preferences.Key<T> p0, T p1, com.paypal.oslo.core.persistence.appstorage.SharedPrefKeyMigration p2, androidx.content.preferences.core.MutablePreferences p3) {
        if (p1 != null && !p3.contains(p0)) {
            p3.set(p0, p1);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "DataStoreMigration: migrated legacy key", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("legacyKey", p2.getLegacyKey()), kotlin.TuplesKt.to("newKey", p2.getNewKey().getName()), kotlin.TuplesKt.to("type", p2.getType().name())), null, 4, null);
        } else if (p1 == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "DataStoreMigration: no value found for legacy key", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("legacyKey", p2.getLegacyKey())), null, 4, null);
        } else if (p3.contains(p0)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.persistence.appstorage.LoggerKt.log, "DataStoreMigration: target key already has value, skipping", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("newKey", p2.getNewKey().getName())), null, 4, null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.values().length];
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.BOOLEAN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.LONG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.FLOAT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.core.persistence.appstorage.SharedPrefDataType.STRING_SET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
