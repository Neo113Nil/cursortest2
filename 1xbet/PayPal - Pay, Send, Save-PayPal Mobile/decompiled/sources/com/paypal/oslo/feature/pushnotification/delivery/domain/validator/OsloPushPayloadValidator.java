package com.paypal.oslo.feature.pushnotification.delivery.domain.validator;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/OsloPushPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/validator/PushNotificationPayloadValidator;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloPushPayload;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/ValidationError;", "validate", "(Lcom/google/firebase/messaging/RemoteMessage;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OsloPushPayloadValidator implements com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator<com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public OsloPushPayloadValidator() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.delivery.domain.validator.PushNotificationPayloadValidator
    public final arrow.core.Either<com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError, com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload> validate(com.google.firebase.messaging.RemoteMessage message) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        int i;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload customViewPayload;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        java.lang.String str8 = data.get("source");
        java.lang.String str9 = data.get("type");
        java.lang.String str10 = data.get("title");
        if (str10 == null || kotlin.text.StringsKt.isBlank(str10)) {
            str10 = null;
        }
        java.lang.String str11 = data.get(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY);
        if (str11 == null || kotlin.text.StringsKt.isBlank(str11)) {
            str11 = null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str8, "PAYPAL")) {
            if (str8 == null) {
                str8 = "null";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue("source", str8, "Oslo notifications must have source='PAYPAL'"));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str9, "REGULAR")) {
            if (str9 == null) {
                str9 = "null";
            }
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.InvalidFieldValue("type", str9, "Oslo notifications must have type='REGULAR'"));
        }
        if (str10 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField("title"));
        }
        if (str11 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.ValidationError.MissingRequiredField(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY));
        }
        java.lang.String str12 = data.get("user_id");
        java.lang.String str13 = data.get("content_id");
        if (str13 == null) {
            str13 = message.getMessageId();
        }
        java.lang.String str14 = data.get("campaign_id");
        java.lang.String str15 = data.get("instance_id");
        java.lang.String str16 = data.get("unp_id");
        java.lang.String str17 = data.get("traffic_pattern");
        java.lang.String str18 = data.get("target_id");
        java.lang.String str19 = data.get("origin_ts");
        java.lang.String str20 = data.get("deeplink");
        java.lang.String str21 = data.get("media_url");
        java.lang.String str22 = data.get("cv_type");
        if (str22 == null) {
            str4 = str13;
            str5 = str9;
            str6 = str12;
            str7 = str14;
            str3 = str15;
            str2 = str16;
            str = str17;
            customViewPayload = null;
            i = 0;
        } else {
            java.lang.String str23 = data.get("cv_version");
            str = str17;
            str2 = str16;
            java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"cv_type", "cv_version", "cv_fallback_title", "cv_fallback_body"});
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = data.entrySet().iterator();
            while (true) {
                str3 = str15;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                java.lang.String str24 = str14;
                java.lang.String key = next.getKey();
                java.lang.String str25 = str13;
                java.lang.String str26 = str9;
                java.lang.String str27 = str12;
                if (kotlin.text.StringsKt.startsWith$default(key, "cv_", false, 2, (java.lang.Object) null) && !of.contains(key)) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
                str9 = str26;
                str15 = str3;
                str13 = str25;
                str14 = str24;
                str12 = str27;
            }
            str4 = str13;
            str5 = str9;
            str6 = str12;
            str7 = str14;
            i = 0;
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
            for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(kotlin.text.StringsKt.removePrefix((java.lang.String) entry.getKey(), (java.lang.CharSequence) "cv_"), entry.getValue());
            }
            java.lang.String str28 = data.get("cv_fallback_title");
            java.lang.String str29 = data.get("cv_fallback_body");
            customViewPayload = new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewPayload(str22, str23, linkedHashMap3, (str28 == null && str29 == null) ? null : new com.paypal.oslo.feature.pushnotification.delivery.domain.model.CustomViewFallback(str28, str29));
        }
        java.lang.String str30 = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MIN_APP_VERSION);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = i; i2 < 10; i2++) {
            java.lang.String concat = "action_".concat(java.lang.String.valueOf(i2));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(concat);
            sb.append("_id");
            java.lang.String str31 = data.get(sb.toString());
            if (str31 != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(concat);
                sb2.append("_label");
                java.lang.String str32 = data.get(sb2.toString());
                if (str32 == null) {
                    str32 = "Action";
                }
                java.lang.String str33 = str32;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(concat);
                sb3.append("_type");
                java.lang.String str34 = data.get(sb3.toString());
                if (str34 == null) {
                    str34 = "UNKNOWN";
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(concat);
                sb4.append("_deeplink");
                java.lang.String str35 = data.get(sb4.toString());
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(concat);
                sb5.append("_actionId");
                java.lang.String str36 = data.get(sb5.toString());
                java.lang.String upperCase = str34.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                int hashCode = upperCase.hashCode();
                if (hashCode == -1905312150) {
                    if (upperCase.equals("DISMISS")) {
                        osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.DISMISS;
                        arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                    }
                    osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.UNKNOWN;
                    arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                } else if (hashCode == 1411860198) {
                    if (upperCase.equals("DEEPLINK")) {
                        osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.DEEPLINK;
                        arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                    }
                    osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.UNKNOWN;
                    arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                } else {
                    if (hashCode == 1925345846 && upperCase.equals("ACTION")) {
                        osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.ACTION;
                        arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                    }
                    osloActionType = com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.UNKNOWN;
                    arrayList.add(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloNotificationAction(str31, str33, osloActionType, str35, str36));
                }
            }
        }
        java.lang.String messageId = message.getMessageId();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.putAll(data);
        if (messageId != null) {
            createMapBuilder.put("fcm_message_id", messageId);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloPushPayload(str10, str11, str8, str5, str6, str4, str7, str3, str2, str, str18, str19, str20, str21, customViewPayload, str30, arrayList, kotlin.collections.MapsKt.build(createMapBuilder)));
    }
}
