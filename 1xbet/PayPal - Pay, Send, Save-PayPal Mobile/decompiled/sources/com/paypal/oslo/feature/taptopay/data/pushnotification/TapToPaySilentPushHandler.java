package com.paypal.oslo.feature.taptopay.data.pushnotification;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPaySilentPushHandler;", "Lcom/paypal/oslo/feature/pushnotification/api/silentpush/SilentPushHandler;", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "cardDataSource", "Lcom/paypal/oslo/feature/taptopay/data/pushnotification/PayairSdkPushForwarder;", "payairSdkPushForwarder", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;Lcom/paypal/oslo/feature/taptopay/data/pushnotification/PayairSdkPushForwarder;)V", "", "", "payload", "", "onSilentPushReceived", "(Ljava/util/Map;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/data/payair/card/CardDataSource;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/pushnotification/PayairSdkPushForwarder;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPaySilentPushHandler implements com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler {

    @java.lang.Deprecated
    public static final java.lang.String SENDER_KEY = "sender";

    @java.lang.Deprecated
    public static final java.lang.String STATUS_KEY = "status";

    @java.lang.Deprecated
    public static final java.lang.String TOKEN_UNIQUE_REFERENCE_KEY = "tokenUniqueReference";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.Companion Companion = new com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "SUSPENDED", com.payair.model.TokenStatusKt.TOKEN_DELETED, "DEFAULT", "NOT_DEFAULT", "RESUMED"});

    @javax.inject.Inject
    public TapToPaySilentPushHandler(com.paypal.oslo.feature.taptopay.data.payair.card.CardDataSource cardDataSource, com.paypal.oslo.feature.taptopay.data.pushnotification.PayairSdkPushForwarder payairSdkPushForwarder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairSdkPushForwarder, "");
        this.getHighSpeedVideoFpsRangesFor = cardDataSource;
        this.Camera2StreamConfigurationMap = payairSdkPushForwarder;
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.silentpush.SilentPushHandler
    public final void onSilentPushReceived(java.util.Map<java.lang.String, java.lang.String> payload) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
        java.lang.String str2 = payload.get("sender");
        com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender from = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.INSTANCE.from(str2);
        if (from == com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPayPushSender.UNKNOWN) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Ignoring silent push with unknown sender", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sender", str2 != null ? str2 : "")), null, 4, null);
            return;
        }
        java.lang.String str3 = payload.get("status");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("sender", from.name());
        pairArr[1] = kotlin.TuplesKt.to("status", str3 == null ? "" : str3);
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
        java.lang.String str4 = payload.get(TOKEN_UNIQUE_REFERENCE_KEY);
        if (str4 == null) {
            str4 = "";
        }
        logger.i("TapToPay silent push received", mapOf, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenId", str4)));
        java.util.Set<java.lang.String> set = Camera2StreamConfigurationMap;
        if (str3 != null) {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            str = str3.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        if (!kotlin.collections.CollectionsKt.contains(set, str)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Unknown card status in silent push", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", str3 != null ? str3 : "")), null, 4, null);
        }
        this.getHighSpeedVideoFpsRangesFor.rehydrate$taptopay_prodRelease();
        this.Camera2StreamConfigurationMap.forward(payload);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/pushnotification/TapToPaySilentPushHandler$Companion;", "", "<init>", "()V", "", "SENDER_KEY", "Ljava/lang/String;", "STATUS_KEY", "TOKEN_UNIQUE_REFERENCE_KEY", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
