package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/FcmHandler;", "", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "pushNotificationTokenHandler", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationHandler;", "pushNotificationHandler", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationHandler;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "", "messageData", "", "onMessageReceived", "(Ljava/util/Map;)Z", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationHandler;", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationTokenHandler;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FcmHandler {
    private final com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FcmHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler pushNotificationHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = pushNotificationTokenHandler;
        this.Camera2StreamConfigurationMap = pushNotificationHandler;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    public /* synthetic */ FcmHandler(com.paypal.android.taptopay.data.thales.fcm.PushNotificationTokenHandler pushNotificationTokenHandler, com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler pushNotificationHandler, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pushNotificationTokenHandler, pushNotificationHandler, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher);
    }

    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "New token received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, token)), null, 4, null);
        try {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.getHighSpeedVideoSizes), null, null, new com.paypal.android.taptopay.data.thales.fcm.FcmHandler$onNewToken$1(this, token, null), 3, null);
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Failed to handle new FCM token", th);
        }
    }

    public final boolean onMessageReceived(java.util.Map<java.lang.String, java.lang.String> messageData) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageData, "");
        try {
            z = this.Camera2StreamConfigurationMap.handleMessage(messageData);
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Failed to handle FCM message ", th);
            z = false;
        }
        if (z) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Thales FcmHandler handled an FCM message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("messageData", messageData)), null, 4, null);
        }
        return z;
    }
}
