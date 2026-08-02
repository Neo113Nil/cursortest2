package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JQ\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "notificationId", "metadata", "Landroid/widget/RemoteViews;", "render", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/widget/RemoteViews;", "getTemplateId", "()Ljava/lang/String;", "templateId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CustomViewRenderer {
    java.lang.String getTemplateId();

    android.widget.RemoteViews render(java.util.Map<java.lang.String, ? extends java.lang.Object> data, java.lang.String title, java.lang.String body, java.lang.String notificationId, java.util.Map<java.lang.String, java.lang.String> metadata);
}
