package com.paypal.oslo.feature.pushnotification.delivery.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/mapper/PushNotificationDataMapper;", "", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;", "payload", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", "tryMap", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushNotificationDataMapper {
    java.lang.Object tryMap(com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload validatedPayload, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.pushnotification.domain.notification.NotificationData> continuation);
}
