package com.paypal.oslo.feature.taptopay.data.thales;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesPushNotificationHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "fcmHandler", "<init>", "(Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "handle", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "name", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThalesPushNotificationHandler implements com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler {

    @java.lang.Deprecated
    public static final java.lang.String KEY_SENDER = "sender";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.fcm.FcmHandler getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler.Companion Companion = new com.paypal.oslo.feature.taptopay.data.thales.ThalesPushNotificationHandler.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"CPS", "MG", "TNS"});

    @javax.inject.Inject
    public ThalesPushNotificationHandler(com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fcmHandler, "");
        this.getHighSpeedVideoFpsRanges = fcmHandler;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final boolean handle(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String str = message.getData().get("sender");
        if (str == null || !Camera2StreamConfigurationMap.contains(str)) {
            return false;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Forwarding push notification to Thales FcmHandler", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sender", str)), null, 4, null);
        com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler = this.getHighSpeedVideoFpsRanges;
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        return fcmHandler.onMessageReceived(data);
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        this.getHighSpeedVideoFpsRanges.onNewToken(token);
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final java.lang.String name() {
        return "ThalesPushNotificationHandler";
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/thales/ThalesPushNotificationHandler$Companion;", "", "<init>", "()V", "", "KEY_SENDER", "Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
