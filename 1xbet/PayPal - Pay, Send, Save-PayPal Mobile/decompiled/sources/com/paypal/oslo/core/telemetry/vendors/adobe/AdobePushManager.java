package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushManager;", "", "", "isPushEnabled", "", "updateConsent", "(Z)V", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushPayload;", "buildPushPayload", "(Ljava/util/Map;)Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobePushPayload;", "Landroid/content/Intent;", "intent", "messageId", "addPushTrackingDetails", "(Landroid/content/Intent;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;", "eventType", "handleNotification", "(Landroid/content/Intent;Lcom/paypal/oslo/core/telemetry/analytics/event/EventType;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AdobePushManager {
    void addPushTrackingDetails(android.content.Intent intent, java.lang.String messageId, java.util.Map<java.lang.String, java.lang.String> data);

    com.paypal.oslo.core.telemetry.vendors.adobe.AdobePushPayload buildPushPayload(java.util.Map<java.lang.String, java.lang.String> data);

    void handleNotification(android.content.Intent intent, com.paypal.oslo.core.telemetry.analytics.event.EventType eventType);

    void updateConsent(boolean isPushEnabled);
}
