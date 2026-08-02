package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R3\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u00148\u0001@\u0001X\u0080.¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/ThalesFcmService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "onNewToken", "(Ljava/lang/String;)V", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "fcmHandler", "Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "getFcmHandler$tap_to_pay_data_thales_release", "()Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "setFcmHandler$tap_to_pay_data_thales_release", "(Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;)V", "", "Lcom/paypal/android/taptopay/domain/di/OrphanedCardLifecycleDependency;", "Lkotlin/jvm/JvmSuppressWildcards;", "orphanedCardLifecycleDependencies", "Ljava/util/Set;", "getOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release", "()Ljava/util/Set;", "setOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release", "(Ljava/util/Set;)V", "getOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release$annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.hilt.android.AndroidEntryPoint
/* loaded from: classes10.dex */
public final class ThalesFcmService extends com.paypal.android.taptopay.data.thales.fcm.Hilt_ThalesFcmService {

    @javax.inject.Inject
    public com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler;

    @javax.inject.Inject
    public java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> orphanedCardLifecycleDependencies;

    public static /* synthetic */ void getOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release$annotations() {
    }

    public final com.paypal.android.taptopay.data.thales.fcm.FcmHandler getFcmHandler$tap_to_pay_data_thales_release() {
        com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler = this.fcmHandler;
        if (fcmHandler != null) {
            return fcmHandler;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setFcmHandler$tap_to_pay_data_thales_release(com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fcmHandler, "");
        this.fcmHandler = fcmHandler;
    }

    public final java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> getOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release() {
        java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> set = this.orphanedCardLifecycleDependencies;
        if (set != null) {
            return set;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOrphanedCardLifecycleDependencies$tap_to_pay_data_thales_release(java.util.Set<com.paypal.android.taptopay.domain.di.OrphanedCardLifecycleDependency> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.orphanedCardLifecycleDependencies = set;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        super.onNewToken(token);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Refreshed FCM token", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, token)), null, 4, null);
        getFcmHandler$tap_to_pay_data_thales_release().onNewToken(token);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        super.onMessageReceived(message);
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("from", message.getFrom());
        pairArr[1] = kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, message.getData().toString());
        com.google.firebase.messaging.RemoteMessage.Notification notification = message.getNotification();
        pairArr[2] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, notification != null ? notification.getBody() : null);
        com.paypal.android.logger.Logger.d$default(log, "FCM message received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        com.paypal.android.taptopay.data.thales.fcm.FcmHandler fcmHandler$tap_to_pay_data_thales_release = getFcmHandler$tap_to_pay_data_thales_release();
        java.util.Map<java.lang.String, java.lang.String> data = message.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        fcmHandler$tap_to_pay_data_thales_release.onMessageReceived(data);
    }

    @Override // com.paypal.android.taptopay.data.thales.fcm.Hilt_ThalesFcmService, com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.paypal.android.taptopay.data.thales.fcm.Hilt_ThalesFcmService, com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
