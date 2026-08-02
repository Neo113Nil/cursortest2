package com.paypal.oslo.feature.pushnotification.delivery.domain.validator;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/DefaultCommsPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/CommsV1PushPayload;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "validate", "(Lcom/google/firebase/messaging/RemoteMessage;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCommsPayloadValidator implements com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DefaultCommsPayloadValidator() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator
    public final arrow.core.Either<com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError, com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload> validate(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        java.lang.String str = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE);
        java.lang.String str2 = data.get("title");
        java.lang.String str3 = (str2 == null || kotlin.text.StringsKt.isBlank(str2)) ? null : str2;
        java.lang.String str4 = data.get(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY);
        if (str4 == null || kotlin.text.StringsKt.isBlank(str4)) {
            str4 = null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.pushnotification.shared.domain.CommsEventTypes.V1)) {
            if (str == null) {
                str = "null";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE, str, "Comms V1 notifications must have ET='303'"));
        }
        if (str3 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField("title"));
        }
        if (str4 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY));
        }
        java.lang.String str5 = data.get("ID");
        if (str5 == null) {
            str5 = "unknown";
        }
        java.lang.String str6 = data.get("MID");
        java.lang.String str7 = (str6 == null && (str6 = message.getMessageId()) == null) ? "unknown" : str6;
        java.lang.String str8 = data.get("CID");
        java.lang.String str9 = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID);
        java.lang.String str10 = data.get("template_version");
        java.lang.String str11 = data.get(com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.KEY_CONTACT_ID);
        java.lang.String str12 = data.get("use_case");
        java.lang.String str13 = data.get("cust_id");
        java.lang.String str14 = data.get("paypal_request_id");
        java.lang.String str15 = data.get("NN_ANDROID");
        java.lang.String str16 = data.get("NN_PAYLOAD_ANDROID");
        java.lang.String str17 = data.get("MU");
        java.lang.String str18 = data.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY);
        java.lang.String str19 = data.get("custom_view");
        java.lang.String str20 = data.get("MIN_APP_VER");
        java.lang.String str21 = data.get("oslo_deeplink");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.putAll(data);
        java.lang.String messageId = message.getMessageId();
        if (messageId != null) {
            createMapBuilder.put("fcm_message_id", messageId);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CommsV1PushPayload(str3, str4, str, str5, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, kotlin.collections.MapsKt.build(createMapBuilder)));
    }
}
