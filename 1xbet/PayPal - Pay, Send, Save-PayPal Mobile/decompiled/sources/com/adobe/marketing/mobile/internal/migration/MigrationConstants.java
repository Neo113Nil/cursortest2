package com.adobe.marketing.mobile.internal.migration;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants;", "", "<init>", "()V", "V4", "V5"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MigrationConstants {
    public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "DATABASE_NAMES", "Ljava/util/ArrayList;", "getDATABASE_NAMES", "()Ljava/util/ArrayList;", "DATASTORE_NAME", "Ljava/lang/String;", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Acquisition.DATASTORE_NAME, "Analytics", "AudienceManager", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Identity", "Lifecycle", "Messages", "Target"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class V4 {
        public static final java.lang.String DATASTORE_NAME = "APP_MEASUREMENT_CACHE";
        public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4 INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4();
        private static final java.util.ArrayList<java.lang.String> DATABASE_NAMES = kotlin.collections.CollectionsKt.arrayListOf("ADBMobile3rdPartyDataCache.sqlite", "ADBMobilePIICache.sqlite", "ADBMobileDataCache.sqlite", "ADBMobileTimedActionsCache.sqlite");
        public static final int $stable = 8;

        private V4() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Lifecycle;", "", "<init>", "()V", "", "APPLICATION_ID", "Ljava/lang/String;", "CONTEXT_DATA", "INSTALL_DATE", "LAST_USED_DATE", "LAST_VERSION", "LAUNCHES", "LAUNCHES_AFTER_UPGRADE", "OS", "PAUSE_DATE", "START_DATE", "SUCCESFUL_CLOSE", "UPGRADE_DATE"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Lifecycle {
            public static final int $stable = 0;
            public static final java.lang.String APPLICATION_ID = "ADOBEMOBILE_STOREDDEFAULTS_APPID";
            public static final java.lang.String CONTEXT_DATA = "ADMS_LifecycleData";
            public static final java.lang.String INSTALL_DATE = "ADMS_InstallDate";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Lifecycle();
            public static final java.lang.String LAST_USED_DATE = "ADMS_LastDateUsed";
            public static final java.lang.String LAST_VERSION = "ADMS_LastVersion";
            public static final java.lang.String LAUNCHES = "ADMS_Launches";
            public static final java.lang.String LAUNCHES_AFTER_UPGRADE = "ADMS_LaunchesAfterUpgrade";
            public static final java.lang.String OS = "ADOBEMOBILE_STOREDDEFAULTS_OS";
            public static final java.lang.String PAUSE_DATE = "ADMS_PauseDate";
            public static final java.lang.String START_DATE = "ADMS_SessionStart";
            public static final java.lang.String SUCCESFUL_CLOSE = "ADMS_SuccessfulClose";
            public static final java.lang.String UPGRADE_DATE = "ADMS_UpgradeDate";

            private Lifecycle() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Acquisition;", "", "<init>", "()V", "", "DEFAULTS_KEY_REFERRER_TRACKINGCODE", "Ljava/lang/String;", "DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN", "DEFAULTS_KEY_REFERRER_UTM_CONTENT", "DEFAULTS_KEY_REFERRER_UTM_MEDIUM", "DEFAULTS_KEY_REFERRER_UTM_SOURCE", "DEFAULTS_KEY_REFERRER_UTM_TERM", "REFERRER_DATA"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Acquisition {
            public static final int $stable = 0;
            public static final java.lang.String DEFAULTS_KEY_REFERRER_TRACKINGCODE = "trackingcode";
            public static final java.lang.String DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN = "utm_campaign";
            public static final java.lang.String DEFAULTS_KEY_REFERRER_UTM_CONTENT = "utm_content";
            public static final java.lang.String DEFAULTS_KEY_REFERRER_UTM_MEDIUM = "utm_medium";
            public static final java.lang.String DEFAULTS_KEY_REFERRER_UTM_SOURCE = "utm_source";
            public static final java.lang.String DEFAULTS_KEY_REFERRER_UTM_TERM = "utm_term";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition();
            public static final java.lang.String REFERRER_DATA = "ADMS_Referrer_ContextData_Json_String";

            private Acquisition() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$AudienceManager;", "", "<init>", "()V", "", "USER_ID", "Ljava/lang/String;", "USER_PROFILE"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class AudienceManager {
            public static final int $stable = 0;
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.AudienceManager INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.AudienceManager();
            public static final java.lang.String USER_ID = "AAMUserId";
            public static final java.lang.String USER_PROFILE = "AAMUserProfile";

            private AudienceManager() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Target;", "", "<init>", "()V", "", "COOKIE_EXPIRES", "Ljava/lang/String;", "COOKIE_VALUE", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.EDGE_HOST, "LAST_TIMESTAMP", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.THIRD_PARTY_ID, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.TNT_ID}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Target {
            public static final int $stable = 0;
            public static final java.lang.String COOKIE_EXPIRES = "mboxPC_Expires";
            public static final java.lang.String COOKIE_VALUE = "mboxPC_Value";
            public static final java.lang.String EDGE_HOST = "ADBMOBILE_TARGET_EDGE_HOST";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Target();
            public static final java.lang.String LAST_TIMESTAMP = "ADBMOBILE_TARGET_LAST_TIMESTAMP";
            public static final java.lang.String SESSION_ID = "ADBMOBILE_TARGET_SESSION_ID";
            public static final java.lang.String THIRD_PARTY_ID = "ADBMOBILE_TARGET_3RD_PARTY_ID";
            public static final java.lang.String TNT_ID = "ADBMOBILE_TARGET_TNT_ID";

            private Target() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Analytics;", "", "<init>", "()V", "", "AID", "Ljava/lang/String;", "IGNORE_AID", "LAST_KNOWN_TIMESTAMP"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Analytics {
            public static final int $stable = 0;
            public static final java.lang.String AID = "ADOBEMOBILE_STOREDDEFAULTS_AID";
            public static final java.lang.String IGNORE_AID = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Analytics INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Analytics();
            public static final java.lang.String LAST_KNOWN_TIMESTAMP = "ADBLastKnownTimestampKey";

            private Analytics() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Identity;", "", "<init>", "()V", "", "ADVERTISING_IDENTIFIER", "Ljava/lang/String;", "AID_SYNCED", "BLOB", "HINT", "MID", "PUSH_ENABLED", "PUSH_IDENTIFIER", "VISITOR_ID", "VISITOR_IDS", "VISITOR_ID_SYNC", "VISITOR_ID_TTL"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Identity {
            public static final int $stable = 0;
            public static final java.lang.String ADVERTISING_IDENTIFIER = "ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER";
            public static final java.lang.String AID_SYNCED = "ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED";
            public static final java.lang.String BLOB = "ADBMOBILE_PERSISTED_MID_BLOB";
            public static final java.lang.String HINT = "ADBMOBILE_PERSISTED_MID_HINT";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Identity();
            public static final java.lang.String MID = "ADBMOBILE_PERSISTED_MID";
            public static final java.lang.String PUSH_ENABLED = "ADBMOBILE_KEY_PUSH_ENABLED";
            public static final java.lang.String PUSH_IDENTIFIER = "ADBMOBILE_KEY_PUSH_TOKEN";
            public static final java.lang.String VISITOR_ID = "APP_MEASUREMENT_VISITOR_ID";
            public static final java.lang.String VISITOR_IDS = "ADBMOBILE_VISITORID_IDS";
            public static final java.lang.String VISITOR_ID_SYNC = "ADBMOBILE_VISITORID_SYNC";
            public static final java.lang.String VISITOR_ID_TTL = "ADBMOBILE_VISITORID_TTL";

            private Identity() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Messages;", "", "<init>", "()V", "", "SHARED_PREFERENCES_BLACK_LIST", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Messages {
            public static final int $stable = 0;
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Messages INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Messages();
            public static final java.lang.String SHARED_PREFERENCES_BLACK_LIST = "messagesBlackList";

            private Messages() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V4$Configuration;", "", "<init>", "()V", "", "GLOBAL_PRIVACY_KEY", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
            public static final int $stable = 0;
            public static final java.lang.String GLOBAL_PRIVACY_KEY = "PrivacyStatus";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Configuration INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Configuration();

            private Configuration() {
            }
        }

        public final java.util.ArrayList<java.lang.String> getDATABASE_NAMES() {
            return DATABASE_NAMES;
        }
    }

    private MigrationConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Acquisition.DATASTORE_NAME, "Analytics", "AudienceManager", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Identity", "Lifecycle", "MobileServices", "Target"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class V5 {
        public static final int $stable = 0;
        public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5 INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5();

        private V5() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Lifecycle;", "", "<init>", "()V", "", "APPLICATION_ID", "Ljava/lang/String;", "DATASTORE_NAME", "INSTALL_DATE", "LAST_USED_DATE", "LAST_VERSION", "LAUNCHES", "LAUNCHES_AFTER_UPGRADE", "OS", "PAUSE_DATE", "START_DATE", "SUCCESFUL_CLOSE", "UPGRADE_DATE"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Lifecycle {
            public static final int $stable = 0;
            public static final java.lang.String APPLICATION_ID = "ApplicationId";
            public static final java.lang.String DATASTORE_NAME = "AdobeMobile_Lifecycle";
            public static final java.lang.String INSTALL_DATE = "InstallDate";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Lifecycle();
            public static final java.lang.String LAST_USED_DATE = "LastDateUsed";
            public static final java.lang.String LAST_VERSION = "LastVersion";
            public static final java.lang.String LAUNCHES = "Launches";
            public static final java.lang.String LAUNCHES_AFTER_UPGRADE = "LaunchesAfterUpgrade";
            public static final java.lang.String OS = "OperatingSystem";
            public static final java.lang.String PAUSE_DATE = "PauseDate";
            public static final java.lang.String START_DATE = "ADMS_SessionStart";
            public static final java.lang.String SUCCESFUL_CLOSE = "SuccessfulClose";
            public static final java.lang.String UPGRADE_DATE = "UpgradeDate";

            private Lifecycle() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Acquisition;", "", "<init>", "()V", "", "DATASTORE_NAME", "Ljava/lang/String;", "REFERRER_DATA"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Acquisition {
            public static final int $stable = 0;
            public static final java.lang.String DATASTORE_NAME = "Acquisition";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Acquisition INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Acquisition();
            public static final java.lang.String REFERRER_DATA = "ADMS_Referrer_ContextData_Json_String";

            private Acquisition() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$AudienceManager;", "", "<init>", "()V", "", "DATASTORE_NAME", "Ljava/lang/String;", "USER_ID", "USER_PROFILE"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class AudienceManager {
            public static final int $stable = 0;
            public static final java.lang.String DATASTORE_NAME = "AAMDataStore";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.AudienceManager INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.AudienceManager();
            public static final java.lang.String USER_ID = "AAMUserId";
            public static final java.lang.String USER_PROFILE = "AAMUserProfile";

            private AudienceManager() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Target;", "", "<init>", "()V", "", "DATASTORE_NAME", "Ljava/lang/String;", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.EDGE_HOST, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.THIRD_PARTY_ID, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.TNT_ID}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Target {
            public static final int $stable = 0;
            public static final java.lang.String DATASTORE_NAME = "ADOBEMOBILE_TARGET";
            public static final java.lang.String EDGE_HOST = "EDGE_HOST";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target();
            public static final java.lang.String SESSION_ID = "SESSION_ID";
            public static final java.lang.String THIRD_PARTY_ID = "THIRD_PARTY_ID";
            public static final java.lang.String TNT_ID = "TNT_ID";

            private Target() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Analytics;", "", "<init>", "()V", "", "AID", "Ljava/lang/String;", "DATASTORE_NAME", "IGNORE_AID", "VID"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Analytics {
            public static final int $stable = 0;
            public static final java.lang.String AID = "ADOBEMOBILE_STOREDDEFAULTS_AID";
            public static final java.lang.String DATASTORE_NAME = "AnalyticsDataStorage";
            public static final java.lang.String IGNORE_AID = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Analytics();
            public static final java.lang.String VID = "ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER";

            private Analytics() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$MobileServices;", "", "<init>", "()V", "", "DATASTORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class MobileServices {
            public static final int $stable = 0;
            public static final java.lang.String DATASTORE_NAME = "ADBMobileServices";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.MobileServices INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.MobileServices();

            private MobileServices() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Identity;", "", "<init>", "()V", "", "BLOB", "Ljava/lang/String;", "DATASTORE_NAME", "HINT", "MID", "PUSH_ENABLED", "VISITOR_ID", "VISITOR_IDS"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Identity {
            public static final int $stable = 0;
            public static final java.lang.String BLOB = "ADOBEMOBILE_PERSISTED_MID_BLOB";
            public static final java.lang.String DATASTORE_NAME = "visitorIDServiceDataStore";
            public static final java.lang.String HINT = "ADOBEMOBILE_PERSISTED_MID_HINT";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Identity();
            public static final java.lang.String MID = "ADOBEMOBILE_PERSISTED_MID";
            public static final java.lang.String PUSH_ENABLED = "ADOBEMOBILE_PUSH_ENABLED";
            public static final java.lang.String VISITOR_ID = "ADOBEMOBILE_VISITOR_ID";
            public static final java.lang.String VISITOR_IDS = "ADOBEMOBILE_VISITORID_IDS";

            private Identity() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/MigrationConstants$V5$Configuration;", "", "<init>", "()V", "", "DATASTORE_NAME", "Ljava/lang/String;", "GLOBAL_PRIVACY_KEY", "PERSISTED_OVERRIDDEN_CONFIG"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
            public static final int $stable = 0;
            public static final java.lang.String DATASTORE_NAME = "AdobeMobile_ConfigState";
            public static final java.lang.String GLOBAL_PRIVACY_KEY = "global.privacy";
            public static final com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Configuration INSTANCE = new com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Configuration();
            public static final java.lang.String PERSISTED_OVERRIDDEN_CONFIG = "config.overridden.map";

            private Configuration() {
            }
        }
    }
}
