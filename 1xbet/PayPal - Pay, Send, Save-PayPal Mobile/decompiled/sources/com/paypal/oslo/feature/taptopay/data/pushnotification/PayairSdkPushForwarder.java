package com.paypal.oslo.feature.taptopay.data.pushnotification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/PayairSdkPushForwarder;", "", "Lcom/payair/logic/notifications/FirebaseNotificationHandler;", "firebaseNotificationHandler", "<init>", "(Lcom/payair/logic/notifications/FirebaseNotificationHandler;)V", "", "", "payload", "", com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType.FORWARD, "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/payair/logic/notifications/FirebaseNotificationHandler;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairSdkPushForwarder {

    @java.lang.Deprecated
    public static final java.lang.String REMOTE_MESSAGE_DESTINATION = "taptopay";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.payair.logic.notifications.FirebaseNotificationHandler getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder.Companion Companion = new com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PayairSdkPushForwarder(com.payair.logic.notifications.FirebaseNotificationHandler firebaseNotificationHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseNotificationHandler, "");
        this.getHighSpeedVideoFpsRanges = firebaseNotificationHandler;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/PayairSdkPushForwarder$Companion;", "", "<init>", "()V", "", "REMOTE_MESSAGE_DESTINATION", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void forward(java.util.Map<java.lang.String, java.lang.String> payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        try {
            com.google.firebase.messaging.RemoteMessage.Builder builder = new com.google.firebase.messaging.RemoteMessage.Builder("taptopay");
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : payload.entrySet()) {
                builder.addData(entry.getKey(), entry.getValue());
            }
            com.google.firebase.messaging.RemoteMessage build = builder.build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            this.getHighSpeedVideoFpsRanges.onMessageReceived(build);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Failed to forward silent push to PayAir SDK", e);
        }
    }
}
