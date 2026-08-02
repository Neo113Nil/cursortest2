package com.paypal.oslo.feature.pushnotification.delivery.domain.validator;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidatedPayload;", "T", "", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "validate", "(Lcom/google/firebase/messaging/RemoteMessage;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushNotificationPayloadValidator<T extends com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidatedPayload> {
    arrow.core.Either<com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError, T> validate(com.google.firebase.messaging.RemoteMessage message);
}
