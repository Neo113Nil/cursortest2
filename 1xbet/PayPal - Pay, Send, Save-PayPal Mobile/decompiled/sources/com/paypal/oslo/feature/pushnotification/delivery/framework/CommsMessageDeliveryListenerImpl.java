package com.paypal.oslo.feature.pushnotification.delivery.framework;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/framework/CommsMessageDeliveryListenerImpl;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/listener/CommsMessageDeliveryListener;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/HandleCommsPushNotificationUseCase;", "handleCommsPushNotificationUseCase", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/usecase/HandleSilentPushUseCase;", "handleSilentPushUseCase", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/HandleCommsPushNotificationUseCase;Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/usecase/HandleSilentPushUseCase;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/HandleCommsPushNotificationUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/pushnotification/silentpush/domain/usecase/HandleSilentPushUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsMessageDeliveryListenerImpl implements com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CommsMessageDeliveryListenerImpl(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.HandleCommsPushNotificationUseCase handleCommsPushNotificationUseCase, com.paypal.oslo.feature.pushnotification.silentpush.domain.usecase.HandleSilentPushUseCase handleSilentPushUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleCommsPushNotificationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleSilentPushUseCase, "");
        this.getHighSpeedVideoSizes = handleCommsPushNotificationUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = handleSilentPushUseCase;
    }

    @Override // com.paypal.oslo.feature.pushnotification.shared.domain.listener.CommsMessageDeliveryListener
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(message.getData().get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE), com.paypal.oslo.feature.pushnotification.shared.domain.CommsEventTypes.SILENT);
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
        pairArr[2] = kotlin.TuplesKt.to("route", areEqual ? androidx.core.app.NotificationCompat.GROUP_KEY_SILENT : "visible");
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.features.javascript.MutationObserverConstants.EVENT_TYPE_KEY, data.get(com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE));
        pairArr[4] = kotlin.TuplesKt.to("source", data.get("source"));
        com.paypal.android.logger.Logger.i$default(logger, "Push notification routed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        if (areEqual) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(data);
        } else {
            this.getHighSpeedVideoSizes.invoke(message);
        }
    }
}
