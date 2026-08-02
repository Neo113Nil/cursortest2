package com.paypal.oslo.core.pushnotification.analytics;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/analytics/AnalyticsPushNotificationHandler;", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "", "Lcom/paypal/oslo/core/telemetry/push/PushTokenListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "pushTokenListeners", "<init>", "(Ljava/util/Set;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "handle", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "name", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsPushNotificationHandler implements com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler {
    private final java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AnalyticsPushNotificationHandler(java.util.Set<com.paypal.oslo.core.telemetry.push.PushTokenListener> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.Camera2StreamConfigurationMap = set;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final void onNewToken(java.lang.String token) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        for (com.paypal.oslo.core.telemetry.push.PushTokenListener pushTokenListener : this.Camera2StreamConfigurationMap) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler analyticsPushNotificationHandler = this;
                pushTokenListener.onPushTokenReceived(token);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                com.paypal.oslo.core.pushnotification.LoggerKt.log.e("Failed to deliver push token to listener", m23439exceptionOrNullimpl);
            }
        }
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final java.lang.String name() {
        return "AnalyticsPushNotificationHandler";
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler
    public final boolean handle(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return false;
    }
}
