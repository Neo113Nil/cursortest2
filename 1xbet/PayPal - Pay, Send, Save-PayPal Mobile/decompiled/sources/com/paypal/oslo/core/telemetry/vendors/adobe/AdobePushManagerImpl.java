package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManagerImpl;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "telemetryFeatureGateProvider", "<init>", "(Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;)V", "", "isPushEnabled", "", "updateConsent", "(Z)V", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushPayload;", "buildPushPayload", "(Ljava/util/Map;)Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushPayload;", "Landroid/content/Intent;", "intent", "messageId", "addPushTrackingDetails", "(Landroid/content/Intent;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "handleNotification", "(Landroid/content/Intent;Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdobePushManagerImpl implements com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public AdobePushManagerImpl(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryFeatureGateProvider, "");
        this.Camera2StreamConfigurationMap = telemetryFeatureGateProvider;
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager
    public final void updateConsent(boolean isPushEnabled) {
        if (this.Camera2StreamConfigurationMap.isAdobeEnabled()) {
            com.adobe.marketing.mobile.edge.consent.Consent.update(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("consents", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("collect", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("val", "y"))), kotlin.TuplesKt.to("marketing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("preferred", com.adjust.sdk.Constants.PUSH), kotlin.TuplesKt.to(com.adjust.sdk.Constants.PUSH, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("val", isPushEnabled ? "y" : "n")))))))));
        }
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager
    public final com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload buildPushPayload(java.util.Map<java.lang.String, java.lang.String> data) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionType actionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.adobe.marketing.mobile.MessagingPushPayload messagingPushPayload = new com.adobe.marketing.mobile.MessagingPushPayload(data);
        java.lang.String title = messagingPushPayload.getTitle();
        java.lang.String str = title == null ? "" : title;
        java.lang.String body = messagingPushPayload.getBody();
        java.lang.String str2 = body == null ? "" : body;
        int notificationPriority = messagingPushPayload.getNotificationPriority();
        int notificationImportance = messagingPushPayload.getNotificationImportance();
        java.lang.String icon = messagingPushPayload.getIcon();
        java.lang.String imageUrl = messagingPushPayload.getImageUrl();
        java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> actionButtons = messagingPushPayload.getActionButtons();
        if (actionButtons != null) {
            java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> list = actionButtons;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.adobe.marketing.mobile.MessagingPushPayload.ActionButton actionButton : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(actionButton);
                com.adobe.marketing.mobile.MessagingPushPayload.ActionType type = actionButton.getType();
                int i = type == null ? -1 : com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl.WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
                if (i == 1) {
                    actionType = com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionType.DEEPLINK;
                } else if (i == 2) {
                    actionType = com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionType.WEB_URL;
                } else if (i == 3) {
                    actionType = com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionType.OPEN_APP;
                } else {
                    if (i != 4 && i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    actionType = com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionType.NONE;
                }
                java.lang.String label = actionButton.getLabel();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(label, "");
                arrayList2.add(new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload.ActionButton(label, actionButton.getLink(), actionType));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload(str, str2, notificationPriority, notificationImportance, icon, imageUrl, arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList);
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager
    public final void addPushTrackingDetails(android.content.Intent intent, java.lang.String messageId, java.util.Map<java.lang.String, java.lang.String> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        if (this.Camera2StreamConfigurationMap.isAdobeEnabled()) {
            com.adobe.marketing.mobile.Messaging.addPushTrackingDetails(intent, messageId, data);
        }
    }

    @Override // com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManager
    public final void handleNotification(android.content.Intent intent, final com.paypal.oslo.core.telemetry.analytics.event.EventType eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        if (this.Camera2StreamConfigurationMap.isAdobeEnabled()) {
            com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.messaging.PushTrackingStatus> adobeCallbackWithError = new com.adobe.marketing.mobile.AdobeCallbackWithError<com.adobe.marketing.mobile.messaging.PushTrackingStatus>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl$handleNotificationCallback$1
                @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
                public final void fail(com.adobe.marketing.mobile.AdobeError adobeError) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeError, "");
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adobe_error_name", adobeError.getErrorName()), kotlin.TuplesKt.to("adobe_error_code", java.lang.Integer.valueOf(adobeError.getErrorCode())));
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
                    com.paypal.oslo.core.telemetry.analytics.event.EventType eventType2 = com.paypal.oslo.core.telemetry.analytics.event.EventType.this;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("[Adobe] Could not handle push messaging ");
                    sb.append(eventType2);
                    sb.append(" event");
                    com.paypal.android.logger.Logger.e$default(logger, sb.toString(), mapOf, null, null, 12, null);
                }

                @Override // com.adobe.marketing.mobile.AdobeCallback
                public final void call(com.adobe.marketing.mobile.messaging.PushTrackingStatus status) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Adobe] Push messaging status: ".concat(java.lang.String.valueOf(status.getDescription())), null, null, 6, null);
                }
            };
            int i = com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushManagerImpl.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
            if (i == 1) {
                com.adobe.marketing.mobile.Messaging.handleNotificationResponse(intent, false, "Impression", adobeCallbackWithError);
            } else {
                if (i != 2) {
                    return;
                }
                com.adobe.marketing.mobile.Messaging.handleNotificationResponse(intent, true, "Click", adobeCallbackWithError);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.analytics.event.EventType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Appeared.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.analytics.event.EventType.Clicked.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.values().length];
            try {
                iArr2[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.DEEPLINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.WEBURL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.OPENAPP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.NONE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.adobe.marketing.mobile.MessagingPushPayload.ActionType.DISMISS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
