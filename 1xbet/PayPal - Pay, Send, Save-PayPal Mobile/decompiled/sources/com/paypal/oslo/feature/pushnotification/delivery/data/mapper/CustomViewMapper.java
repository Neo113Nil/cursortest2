package com.paypal.oslo.feature.pushnotification.delivery.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/data/mapper/CustomViewMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;", "customView", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;", "map", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CustomViewPayload;)Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomNotificationViews$Template;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomViewMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CustomViewMapper() {
    }

    public final com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template map(com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customView, "");
        java.lang.String upperCase = customView.getType().toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return new com.paypal.oslo.core.pushnotification.domain.notification.CustomNotificationViews.Template(upperCase, customView.getData());
    }
}
