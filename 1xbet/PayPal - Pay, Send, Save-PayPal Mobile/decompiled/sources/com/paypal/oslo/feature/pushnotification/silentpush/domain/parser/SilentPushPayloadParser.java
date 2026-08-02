package com.paypal.oslo.feature.pushnotification.silentpush.domain.parser;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/parser/SilentPushPayloadParser;", "", "<init>", "()V", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushError;", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/model/SilentPushPayload;", "parse", "(Ljava/util/Map;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SilentPushPayloadParser {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SilentPushPayloadParser() {
    }

    public final arrow.core.Either<com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError, com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload> parse(java.util.Map<java.lang.String, java.lang.String> data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.pushnotification.shared.domain.CommsEventTypes.SILENT)) {
                defaultRaise2.raise(new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.InvalidEventType(str));
                throw new kotlin.KotlinNothingValueException();
            }
            java.lang.String str2 = data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.TARGET_MODULE);
            java.lang.String str3 = str2;
            if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
                defaultRaise2.raise(com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushError.MissingTargetModule.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : data.entrySet()) {
                if (kotlin.text.StringsKt.startsWith$default(entry.getKey(), com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.PREFIX, false, 2, (java.lang.Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
            for (java.lang.Object obj : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(kotlin.text.StringsKt.removePrefix((java.lang.String) ((java.util.Map.Entry) obj).getKey(), (java.lang.CharSequence) com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.PREFIX), ((java.util.Map.Entry) obj).getValue());
            }
            com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload silentPushPayload = new com.paypal.oslo.feature.pushnotification.silentpush.domain.model.SilentPushPayload(str2, str, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.CAMPAIGN_ID), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MESSAGE_ID), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MESSAGE_NAME), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.ENCRYPTED_CUSTOMER_ID), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.MIN_APP_VERSION), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.UNP_TID), data.get(com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys.SENT_TIMESTAMP), linkedHashMap3);
            defaultRaise.complete();
            return new arrow.core.Either.Right(silentPushPayload);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
