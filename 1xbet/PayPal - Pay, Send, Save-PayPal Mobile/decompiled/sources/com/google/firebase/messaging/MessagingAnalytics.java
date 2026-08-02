package com.google.firebase.messaging;

/* loaded from: classes4.dex */
public class MessagingAnalytics {
    private static final int DEFAULT_PRODUCT_ID = 111881503;
    private static final java.lang.String DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF = "export_to_big_query";
    private static final java.lang.String FCM_PREFERENCES = "com.google.firebase.messaging";
    private static final java.lang.String MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED = "delivery_metrics_exported_to_big_query_enabled";
    private static final java.lang.String REENGAGEMENT_MEDIUM = "notification";
    private static final java.lang.String REENGAGEMENT_SOURCE = "Firebase";

    public static void logNotificationReceived(android.content.Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            logToFirelog(com.google.firebase.messaging.reporting.MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, com.google.firebase.messaging.FirebaseMessaging.getTransportFactory());
        }
    }

    public static void logNotificationOpen(android.os.Bundle bundle) {
        setUserPropertyIfRequired(bundle);
        logToScion(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationDismiss(android.content.Intent intent) {
        logToScion(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(android.content.Intent intent) {
        logToScion(com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(android.content.Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(android.os.Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.ENABLED));
    }

    public static boolean shouldUploadFirelogAnalytics(android.content.Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    private static boolean isDirectBootMessage(android.content.Intent intent) {
        return com.google.firebase.messaging.FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    static boolean deliveryMetricsExportToBigQueryEnabled() {
        android.content.Context applicationContext;
        android.content.SharedPreferences sharedPreferences;
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            com.google.firebase.FirebaseApp.getInstance();
            applicationContext = com.google.firebase.FirebaseApp.getInstance().getApplicationContext();
            sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.IllegalStateException unused) {
        }
        if (sharedPreferences.contains(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF)) {
            return sharedPreferences.getBoolean(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF, false);
        }
        android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED)) {
            return applicationInfo.metaData.getBoolean(MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED, false);
        }
        return false;
    }

    private static void setUserPropertyIfRequired(android.os.Bundle bundle) {
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector;
        if (bundle == null || !"1".equals(bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.TRACK_CONVERSIONS)) || (analyticsConnector = (com.google.firebase.analytics.connector.AnalyticsConnector) com.google.firebase.FirebaseApp.getInstance().get(com.google.firebase.analytics.connector.AnalyticsConnector.class)) == null) {
            return;
        }
        java.lang.String string = bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.COMPOSER_ID);
        analyticsConnector.setUserProperty(com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM, com.google.firebase.messaging.Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("source", REENGAGEMENT_SOURCE);
        bundle2.putString("medium", REENGAGEMENT_MEDIUM);
        bundle2.putString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_CAMPAIGN, string);
        analyticsConnector.logEvent(com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM, com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
    }

    static void logToScion(java.lang.String str, android.os.Bundle bundle) {
        try {
            com.google.firebase.FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String composerId = getComposerId(bundle);
            if (composerId != null) {
                bundle2.putString("_nmid", composerId);
            }
            java.lang.String composerLabel = getComposerLabel(bundle);
            if (composerLabel != null) {
                bundle2.putString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_MESSAGE_NAME, composerLabel);
            }
            java.lang.String messageLabel = getMessageLabel(bundle);
            if (!android.text.TextUtils.isEmpty(messageLabel)) {
                bundle2.putString("label", messageLabel);
            }
            java.lang.String messageChannel = getMessageChannel(bundle);
            if (!android.text.TextUtils.isEmpty(messageChannel)) {
                bundle2.putString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, messageChannel);
            }
            java.lang.String topic = getTopic(bundle);
            if (topic != null) {
                bundle2.putString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_TOPIC, topic);
            }
            java.lang.String messageTime = getMessageTime(bundle);
            if (messageTime != null) {
                try {
                    bundle2.putInt(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_MESSAGE_TIME, java.lang.Integer.parseInt(messageTime));
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            java.lang.String useDeviceTime = getUseDeviceTime(bundle);
            if (useDeviceTime != null) {
                try {
                    bundle2.putInt(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, java.lang.Integer.parseInt(useDeviceTime));
                } catch (java.lang.NumberFormatException unused2) {
                }
            }
            java.lang.String messageTypeForScion = getMessageTypeForScion(bundle);
            if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(com.google.firebase.messaging.Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, messageTypeForScion);
            }
            com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = (com.google.firebase.analytics.connector.AnalyticsConnector) com.google.firebase.FirebaseApp.getInstance().get(com.google.firebase.analytics.connector.AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent(com.google.firebase.messaging.Constants.ScionAnalytics.ORIGIN_FCM, str, bundle2);
            }
        } catch (java.lang.IllegalStateException unused3) {
        }
    }

    private static void logToFirelog(com.google.firebase.messaging.reporting.MessagingClientEvent.Event event, android.content.Intent intent, com.google.android.datatransport.TransportFactory transportFactory) {
        com.google.firebase.messaging.reporting.MessagingClientEvent eventToProto;
        if (transportFactory == null || (eventToProto = eventToProto(event, intent)) == null) {
            return;
        }
        try {
            transportFactory.getTransport(com.google.firebase.messaging.Constants.FirelogAnalytics.FCM_LOG_SOURCE, com.google.firebase.messaging.reporting.MessagingClientEventExtension.class, com.google.android.datatransport.Encoding.of("proto"), new com.google.android.datatransport.Transformer() { // from class: com.google.firebase.messaging.MessagingAnalytics$$ExternalSyntheticLambda0
                @Override // com.google.android.datatransport.Transformer
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((com.google.firebase.messaging.reporting.MessagingClientEventExtension) obj).toByteArray();
                }
            }).send(com.google.android.datatransport.Event.ofData(com.google.firebase.messaging.reporting.MessagingClientEventExtension.newBuilder().setMessagingClientEvent(eventToProto).build(), com.google.android.datatransport.ProductData.withProductId(java.lang.Integer.valueOf(intent.getIntExtra(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID, DEFAULT_PRODUCT_ID)))));
        } catch (java.lang.RuntimeException unused) {
        }
    }

    static void setDeliveryMetricsExportToBigQuery(boolean z) {
        com.google.firebase.FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF, z).apply();
    }

    static int getTtl(android.os.Bundle bundle) {
        java.lang.Object obj = bundle.get(com.google.firebase.messaging.Constants.MessagePayloadKeys.TTL);
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    static java.lang.String getCollapseKey(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    static java.lang.String getComposerId(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.COMPOSER_ID);
    }

    static java.lang.String getComposerLabel(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    static java.lang.String getMessageLabel(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    static java.lang.String getMessageChannel(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    static java.lang.String getMessageTime(android.os.Bundle bundle) {
        return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    static java.lang.String getMessageId(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID);
        return string == null ? bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    static java.lang.String getPackageName() {
        return com.google.firebase.FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    static java.lang.String getInstanceId(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.TO);
        if (!android.text.TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (java.lang.String) com.google.android.gms.tasks.Tasks.await(com.google.firebase.installations.FirebaseInstallations.getInstance(com.google.firebase.FirebaseApp.getInstance()).getId());
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    static java.lang.String getMessageTypeForScion(android.os.Bundle bundle) {
        if (bundle != null && com.google.firebase.messaging.NotificationParams.isNotification(bundle)) {
            return com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
        }
        return com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
    }

    static com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType getMessageTypeForFirelog(android.os.Bundle bundle) {
        if (bundle != null && com.google.firebase.messaging.NotificationParams.isNotification(bundle)) {
            return com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
        }
        return com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DATA_MESSAGE;
    }

    static java.lang.String getTopic(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static java.lang.String getUseDeviceTime(android.os.Bundle bundle) {
        if (bundle.containsKey(com.google.firebase.messaging.Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(com.google.firebase.messaging.Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    static int getPriority(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    private static int getMessagePriority(java.lang.String str) {
        if (com.adjust.sdk.Constants.HIGH.equals(str)) {
            return 1;
        }
        return com.adjust.sdk.Constants.NORMAL.equals(str) ? 2 : 0;
    }

    static int getMessagePriorityForFirelog(android.os.Bundle bundle) {
        int priority = getPriority(bundle);
        if (priority == 2) {
            return 5;
        }
        return priority == 1 ? 10 : 0;
    }

    static long getProjectNumber(android.os.Bundle bundle) {
        if (bundle.containsKey(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return java.lang.Long.parseLong(bundle.getString(com.google.firebase.messaging.Constants.MessagePayloadKeys.SENDER_ID));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        com.google.firebase.FirebaseApp firebaseApp = com.google.firebase.FirebaseApp.getInstance();
        java.lang.String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return java.lang.Long.parseLong(gcmSenderId);
            } catch (java.lang.NumberFormatException unused2) {
            }
        }
        java.lang.String applicationId = firebaseApp.getOptions().getApplicationId();
        try {
            if (!applicationId.startsWith("1:")) {
                return java.lang.Long.parseLong(applicationId);
            }
            java.lang.String[] split = applicationId.split(io.ktor.sse.ServerSentEventKt.COLON);
            if (split.length < 2) {
                return 0L;
            }
            java.lang.String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused3) {
            return 0L;
        }
    }

    static com.google.firebase.messaging.reporting.MessagingClientEvent eventToProto(com.google.firebase.messaging.reporting.MessagingClientEvent.Event event, android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = android.os.Bundle.EMPTY;
        }
        com.google.firebase.messaging.reporting.MessagingClientEvent.Builder priority = com.google.firebase.messaging.reporting.MessagingClientEvent.newBuilder().setTtl(getTtl(extras)).setEvent(event).setInstanceId(getInstanceId(extras)).setPackageName(getPackageName()).setSdkPlatform(com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(getMessageTypeForFirelog(extras)).setPriority(getMessagePriorityForFirelog(extras));
        java.lang.String messageId = getMessageId(extras);
        if (messageId != null) {
            priority.setMessageId(messageId);
        }
        java.lang.String topic = getTopic(extras);
        if (topic != null) {
            priority.setTopic(topic);
        }
        java.lang.String collapseKey = getCollapseKey(extras);
        if (collapseKey != null) {
            priority.setCollapseKey(collapseKey);
        }
        java.lang.String messageLabel = getMessageLabel(extras);
        if (messageLabel != null) {
            priority.setAnalyticsLabel(messageLabel);
        }
        java.lang.String composerLabel = getComposerLabel(extras);
        if (composerLabel != null) {
            priority.setComposerLabel(composerLabel);
        }
        long projectNumber = getProjectNumber(extras);
        if (projectNumber > 0) {
            priority.setProjectNumber(projectNumber);
        }
        return priority.build();
    }
}
