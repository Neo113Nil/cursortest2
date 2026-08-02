package com.paypal.oslo.feature.pushnotification.shared.domain.handler;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B,\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001a\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/shared/domain/handler/CommsPushNotificationHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "Lkotlin/jvm/JvmSuppressWildcards;", "eligibilityCheckers", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;", "messageDeliveryListener", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;", "tokenRefreshListener", "<init>", "(Ljava/util/Set;Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "handle", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "name", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsTokenRefreshListener;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsPushNotificationHandler implements com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CommsPushNotificationHandler(java.util.Set<com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker> set, com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener commsMessageDeliveryListener, com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsTokenRefreshListener commsTokenRefreshListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commsMessageDeliveryListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commsTokenRefreshListener, "");
        this.getHighSpeedVideoFpsRangesFor = set;
        this.Camera2StreamConfigurationMap = commsMessageDeliveryListener;
        this.getHighSpeedVideoSizes = commsTokenRefreshListener;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final boolean handle(com.google.firebase.messaging.RemoteMessage message) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker) obj).isEligible(message)) {
                break;
            }
        }
        com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker commsNotificationEligibilityChecker = (com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker) obj;
        if (commsNotificationEligibilityChecker == null) {
            return false;
        }
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.pushnotification.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        java.lang.String str = data.get("MID");
        if (str == null && (str = data.get("content_id")) == null) {
            str = message.getMessageId();
        }
        pairArr[0] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID_SERVER, str);
        java.lang.String str2 = data.get("CID");
        if (str2 == null) {
            str2 = data.get("campaign_id");
        }
        pairArr[1] = kotlin.TuplesKt.to("campaign_id", str2);
        pairArr[2] = kotlin.TuplesKt.to("checker", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(commsNotificationEligibilityChecker.getClass()).getSimpleName());
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE));
        pairArr[4] = kotlin.TuplesKt.to("source", data.get("source"));
        com.paypal.android.logger.Logger.i$default(logger, "Push notification eligibility matched", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        this.Camera2StreamConfigurationMap.onMessageReceived(message);
        return true;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        this.getHighSpeedVideoSizes.onTokenRefresh(token);
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final java.lang.String name() {
        return "CommsPushNotificationHandler";
    }
}
