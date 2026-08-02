package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RL\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00142\u001a\u0010\u0015\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00148C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0010\u0010\u0017"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationHandler;", "", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "dataSource", "<init>", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;)V", "", "", "messageData", "", "handleMessage", "(Ljava/util/Map;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationDataSource;", "Camera2StreamConfigurationMap", "", "p0", "()Ljava/util/List;", "(Ljava/util/List;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushNotificationHandler {
    private static final com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler.Companion Companion = new com.paypal.android.taptopay.data.thales.fcm.PushNotificationHandler.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String KEY_ACTION = "action";

    @java.lang.Deprecated
    public static final java.lang.String KEY_DIGITALIZED_CARD_ID = "digitalCardID";

    @java.lang.Deprecated
    public static final java.lang.String KEY_SENDER = "sender";

    @java.lang.Deprecated
    public static final java.lang.String SHARED_PREFS_NAME = "com.paypal.android.taptopay.data.thales.fcm.storage";

    @java.lang.Deprecated
    public static final java.lang.String UNPROCESSED_NOTIFICATIONS_KEY = "unprocessed_notifications";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource Camera2StreamConfigurationMap;

    public PushNotificationHandler(android.content.Context context, com.paypal.android.taptopay.data.thales.fcm.PushNotificationDataSource pushNotificationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDataSource, "");
        this.Camera2StreamConfigurationMap = pushNotificationDataSource;
        this.getHighSpeedVideoSizes = context.getApplicationContext();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Cleaning up unprocessed notifications", null, null, 6, null);
            java.util.Iterator<java.util.Map<java.lang.String, java.lang.String>> it = highSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                handleMessage(it.next());
            }
            getHighSpeedVideoSizes(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/PushNotificationHandler$Companion;", "", "<init>", "()V", "", "KEY_ACTION", "Ljava/lang/String;", "KEY_DIGITALIZED_CARD_ID", "KEY_SENDER", "SHARED_PREFS_NAME", "UNPROCESSED_NOTIFICATIONS_KEY"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final java.util.List<java.util.Map<java.lang.String, java.lang.String>> getHighSpeedVideoFpsRangesFor() {
        try {
            java.lang.String string = this.getHighSpeedVideoSizes.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).getString(UNPROCESSED_NOTIFICATIONS_KEY, null);
            if (string == null) {
                return null;
            }
            com.squareup.moshi.Moshi build = new com.squareup.moshi.Moshi.Builder().build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return (java.util.List) com.squareup.moshi._MoshiKotlinExtensionsKt.adapter(build, kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)))))).fromJson(string);
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Error while fetching unprocessed notifications", th);
            this.getHighSpeedVideoSizes.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).edit().remove(UNPROCESSED_NOTIFICATIONS_KEY).apply();
            return null;
        }
    }

    private final void getHighSpeedVideoSizes(java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> list) {
        if (list == null) {
            this.getHighSpeedVideoSizes.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).edit().remove(UNPROCESSED_NOTIFICATIONS_KEY).apply();
            return;
        }
        android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoSizes.getSharedPreferences("com.paypal.android.taptopay.data.thales.fcm.storage", 0).edit();
        com.squareup.moshi.Moshi build = new com.squareup.moshi.Moshi.Builder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        edit.putString(UNPROCESSED_NOTIFICATIONS_KEY, com.squareup.moshi._MoshiKotlinExtensionsKt.adapter(build, kotlin.jvm.internal.Reflection.typeOf(java.util.List.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.util.Map.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.String.class)))))).toJson(list)).apply();
    }

    public final boolean handleMessage(java.util.Map<java.lang.String, java.lang.String> messageData) {
        java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> listOf;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageData, "");
        android.os.Bundle bundle = new android.os.Bundle();
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender = com.paypal.android.taptopay.data.thales.fcm.model.PushSender.UNKNOWN;
        com.paypal.android.taptopay.data.thales.fcm.model.PushSender pushSender2 = pushSender;
        java.lang.String str2 = "";
        for (java.lang.String str3 : messageData.keySet()) {
            java.lang.String str4 = messageData.get(str3);
            if (str4 != null) {
                bundle.putString(str3, str4);
                if (kotlin.text.StringsKt.equals(str3, "sender", true)) {
                    try {
                        pushSender2 = com.paypal.android.taptopay.data.thales.fcm.model.PushSender.valueOf(str4);
                    } catch (java.lang.Throwable unused) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to parse push sender", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, str4)), null, 4, null);
                    }
                } else if (kotlin.text.StringsKt.equals(str3, "action", true)) {
                    str = str4;
                } else if (kotlin.text.StringsKt.equals(str3, KEY_DIGITALIZED_CARD_ID, true)) {
                    str2 = str4;
                }
            }
        }
        if (pushSender2 == com.paypal.android.taptopay.data.thales.fcm.model.PushSender.UNKNOWN) {
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Unknown push sender, will not handle push notification", null, null, 6, null);
            return false;
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Thales Push notification processed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sender", pushSender2.name()), kotlin.TuplesKt.to("action", str), kotlin.TuplesKt.to("digitalCardId", str2)), null, 4, null);
        if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() == com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED) {
            this.Camera2StreamConfigurationMap.notify(new com.paypal.android.taptopay.data.thales.fcm.model.PushNotification(bundle, pushSender2, str, str2));
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "MGSDK is not configured, storing push notification for later processing", null, null, 6, null);
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor == null || (listOf = kotlin.collections.CollectionsKt.plus((java.util.Collection) highSpeedVideoFpsRangesFor, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(messageData))) == null) {
                listOf = kotlin.collections.CollectionsKt.listOf(messageData);
            }
            getHighSpeedVideoSizes(listOf);
        }
        return true;
    }
}
