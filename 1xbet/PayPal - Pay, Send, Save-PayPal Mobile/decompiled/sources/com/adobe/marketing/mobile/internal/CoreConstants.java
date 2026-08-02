package com.adobe.marketing.mobile.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "VERSION", "EventDataKeys", "EventNames", "Wrapper"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class CoreConstants {
    public static final com.adobe.marketing.mobile.internal.CoreConstants INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants();
    public static final java.lang.String LOG_TAG = "MobileCore";
    public static final java.lang.String VERSION = "3.6.0";

    private CoreConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys;", "", "<init>", "()V", "Analytics", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Identity", "Lifecycle", "Signal"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class EventDataKeys {
        public static final int $stable = 0;
        public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys();

        private EventDataKeys() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys$Analytics;", "", "<init>", "()V", "", "CONTEXT_DATA", "Ljava/lang/String;", "TRACK_ACTION", "TRACK_STATE"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Analytics {
            public static final int $stable = 0;
            public static final java.lang.String CONTEXT_DATA = "contextdata";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Analytics INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Analytics();
            public static final java.lang.String TRACK_ACTION = "action";
            public static final java.lang.String TRACK_STATE = "state";

            private Analytics() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys$Configuration;", "", "<init>", "()V", "", "CONFIGURATION_REQUEST_CONTENT_CLEAR_UPDATED_CONFIG", "Ljava/lang/String;", "CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID", "CONFIGURATION_REQUEST_CONTENT_JSON_ASSET_FILE", "CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH", "CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG", "CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG", "CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS", "GLOBAL_CONFIG_PRIVACY"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
            public static final int $stable = 0;
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_CLEAR_UPDATED_CONFIG = "config.clearUpdates";
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID = "config.appId";
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_JSON_ASSET_FILE = "config.assetFile";
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH = "config.filePath";
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG = "config.getData";
            public static final java.lang.String CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG = "config.update";
            public static final java.lang.String CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS = "config.allIdentifiers";
            public static final java.lang.String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Configuration INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Configuration();

            private Configuration() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys$Identity;", "", "<init>", "()V", "", "ADVERTISING_IDENTIFIER", "Ljava/lang/String;", "PUSH_IDENTIFIER"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Identity {
            public static final int $stable = 0;
            public static final java.lang.String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Identity INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Identity();
            public static final java.lang.String PUSH_IDENTIFIER = "pushidentifier";

            private Identity() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys$Lifecycle;", "", "<init>", "()V", "", "ADDITIONAL_CONTEXT_DATA", "Ljava/lang/String;", "LIFECYCLE_ACTION_KEY", "LIFECYCLE_PAUSE", "LIFECYCLE_START"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Lifecycle {
            public static final int $stable = 0;
            public static final java.lang.String ADDITIONAL_CONTEXT_DATA = "additionalcontextdata";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle();
            public static final java.lang.String LIFECYCLE_ACTION_KEY = "action";
            public static final java.lang.String LIFECYCLE_PAUSE = "pause";
            public static final java.lang.String LIFECYCLE_START = "start";

            private Lifecycle() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventDataKeys$Signal;", "", "<init>", "()V", "", "SIGNAL_CONTEXT_DATA", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Signal {
            public static final int $stable = 0;
            public static final com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Signal INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Signal();
            public static final java.lang.String SIGNAL_CONTEXT_DATA = "contextdata";

            private Signal() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$Wrapper;", "", "<init>", "()V", "Name", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Wrapper {
        public static final int $stable = 0;
        public static final com.adobe.marketing.mobile.internal.CoreConstants.Wrapper INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.Wrapper();

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$Wrapper$Name;", "", "<init>", "()V", "", "CORDOVA", "Ljava/lang/String;", "FLUTTER", "NONE", "REACT_NATIVE", "UNITY", "XAMARIN"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Name {
            public static final int $stable = 0;
            public static final java.lang.String CORDOVA = "Cordova";
            public static final java.lang.String FLUTTER = "Flutter";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name();
            public static final java.lang.String NONE = "None";
            public static final java.lang.String REACT_NATIVE = "React Native";
            public static final java.lang.String UNITY = "Unity";
            public static final java.lang.String XAMARIN = "Xamarin";

            private Name() {
            }
        }

        private Wrapper() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$Wrapper$Type;", "", "<init>", "()V", "", "CORDOVA", "Ljava/lang/String;", "FLUTTER", "NONE", "REACT_NATIVE", "UNITY", "XAMARIN"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Type {
            public static final int $stable = 0;
            public static final java.lang.String CORDOVA = "C";
            public static final java.lang.String FLUTTER = "F";
            public static final com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type();
            public static final java.lang.String NONE = "N";
            public static final java.lang.String REACT_NATIVE = "R";
            public static final java.lang.String UNITY = "U";
            public static final java.lang.String XAMARIN = "X";

            private Type() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/CoreConstants$EventNames;", "", "<init>", "()V", "", "ANALYTICS_TRACK", "Ljava/lang/String;", "CLEAR_UPDATED_CONFIGURATION", "COLLECT_DATA", "COLLECT_PII", "CONFIGURATION_REQUEST", "CONFIGURATION_RESPONSE", "CONFIGURATION_UPDATE", "CONFIGURE_WITH_APP_ID", "CONFIGURE_WITH_FILE_PATH", "GET_SDK_IDENTITIES", "LIFECYCLE_PAUSE", "LIFECYCLE_RESUME", "PRIVACY_STATUS_REQUEST", "RESET_IDENTITIES_REQUEST", "SET_ADVERTISING_IDENTIFIER", "SET_PUSH_IDENTIFIER"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class EventNames {
        public static final int $stable = 0;
        public static final java.lang.String ANALYTICS_TRACK = "Analytics Track";
        public static final java.lang.String CLEAR_UPDATED_CONFIGURATION = "Clear Updated Configuration";
        public static final java.lang.String COLLECT_DATA = "Collect Data";
        public static final java.lang.String COLLECT_PII = "Collect PII";
        public static final java.lang.String CONFIGURATION_REQUEST = "Configuration Request";
        public static final java.lang.String CONFIGURATION_RESPONSE = "Configuration Response";
        public static final java.lang.String CONFIGURATION_UPDATE = "Configuration Update";
        public static final java.lang.String CONFIGURE_WITH_APP_ID = "Configure with App ID";
        public static final java.lang.String CONFIGURE_WITH_FILE_PATH = "Configure with File Path";
        public static final java.lang.String GET_SDK_IDENTITIES = "Get SDK Identities";
        public static final com.adobe.marketing.mobile.internal.CoreConstants.EventNames INSTANCE = new com.adobe.marketing.mobile.internal.CoreConstants.EventNames();
        public static final java.lang.String LIFECYCLE_PAUSE = "Lifecycle Pause";
        public static final java.lang.String LIFECYCLE_RESUME = "Lifecycle Resume";
        public static final java.lang.String PRIVACY_STATUS_REQUEST = "Privacy Status Request";
        public static final java.lang.String RESET_IDENTITIES_REQUEST = "Reset Identities Request";
        public static final java.lang.String SET_ADVERTISING_IDENTIFIER = "Set Advertising Identifier";
        public static final java.lang.String SET_PUSH_IDENTIFIER = "Set Push Identifier";

        private EventNames() {
        }
    }
}
