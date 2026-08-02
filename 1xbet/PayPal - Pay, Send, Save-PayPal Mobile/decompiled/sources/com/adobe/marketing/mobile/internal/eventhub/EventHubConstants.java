package com.adobe.marketing.mobile.internal.eventhub;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubConstants;", "", "<init>", "()V", "", "FRIENDLY_NAME", "Ljava/lang/String;", "NAME", "STATE_CHANGE", "VERSION_NUMBER", "XDM_STATE_CHANGE", "EventDataKeys"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class EventHubConstants {
    public static final java.lang.String FRIENDLY_NAME = "EventHub";
    public static final com.adobe.marketing.mobile.internal.eventhub.EventHubConstants INSTANCE = new com.adobe.marketing.mobile.internal.eventhub.EventHubConstants();
    public static final java.lang.String NAME = "com.adobe.module.eventhub";
    public static final java.lang.String STATE_CHANGE = "Shared state change";
    public static final java.lang.String VERSION_NUMBER = "3.6.0";
    public static final java.lang.String XDM_STATE_CHANGE = "Shared state change (XDM)";

    private EventHubConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubConstants$EventDataKeys;", "", "<init>", "()V", "", "EXTENSIONS", "Ljava/lang/String;", "FRIENDLY_NAME", "METADATA", "TYPE", "VERSION", "WRAPPER", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class EventDataKeys {
        public static final int $stable = 0;
        public static final java.lang.String EXTENSIONS = "extensions";
        public static final java.lang.String FRIENDLY_NAME = "friendlyName";
        public static final com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys INSTANCE = new com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys();
        public static final java.lang.String METADATA = "metadata";
        public static final java.lang.String TYPE = "type";
        public static final java.lang.String VERSION = "version";
        public static final java.lang.String WRAPPER = "wrapper";

        private EventDataKeys() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/EventHubConstants$EventDataKeys$Configuration;", "", "<init>", "()V", "", "EVENT_STATE_OWNER", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Configuration {
            public static final int $stable = 0;
            public static final java.lang.String EVENT_STATE_OWNER = "stateowner";
            public static final com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.Configuration INSTANCE = new com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.Configuration();

            private Configuration() {
            }
        }
    }
}
