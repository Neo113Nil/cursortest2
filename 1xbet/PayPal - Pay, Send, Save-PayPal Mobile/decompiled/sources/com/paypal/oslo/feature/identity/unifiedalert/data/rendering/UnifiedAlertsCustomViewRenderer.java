package com.paypal.oslo.feature.identity.unifiedalert.data.rendering;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00078\u0017X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/rendering/UnifiedAlertsCustomViewRenderer;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/CustomViewRenderer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "title", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "notificationId", "metadata", "Landroid/widget/RemoteViews;", "render", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Landroid/widget/RemoteViews;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "templateId", "Ljava/lang/String;", "getTemplateId", "()Ljava/lang/String;", "Companion", "DetailRow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnifiedAlertsCustomViewRenderer implements com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer {
    public static final java.lang.String CRYPTO = "crypto";
    public static final java.lang.String MERCHANT = "merchant";
    public static final java.lang.String MESSAGE = "message";
    public static final java.lang.String TEMPLATE_ID = "IDENTITY_UNIFIED_ALERTS";
    public static final java.lang.String USER_PROFILE = "user_profile";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final java.lang.String templateId;
    public static final int $stable = 8;
    public static final java.lang.String PURCHASE_AMOUNT = "purchase_amount";
    public static final java.lang.String DEVICE_LOCATION = "device_location";
    public static final java.lang.String ALERT_TIMESTAMP = "alert_timestamp";
    public static final java.lang.String DEVICE_NAME = "device_name";
    public static final java.lang.String WALLET = "wallet";
    public static final java.lang.String CASH = "cash";
    private static final java.util.List<com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow[]{new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(PURCHASE_AMOUNT, com.paypal.oslo.feature.identity.R.id.unified_alerts_purchase_amount_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_purchase_amount_icon, com.paypal.pds.oslo.assets.R.drawable.ui_currency_dollar, com.paypal.oslo.feature.identity.R.id.unified_alerts_purchase_amount_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow("merchant", com.paypal.oslo.feature.identity.R.id.unified_alerts_merchant_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_merchant_icon, com.paypal.pds.oslo.assets.R.drawable.ui_store, com.paypal.oslo.feature.identity.R.id.unified_alerts_merchant_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(DEVICE_LOCATION, com.paypal.oslo.feature.identity.R.id.unified_alerts_location_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_location_icon, com.paypal.pds.oslo.assets.R.drawable.ui_map_pin, com.paypal.oslo.feature.identity.R.id.unified_alerts_location_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(ALERT_TIMESTAMP, com.paypal.oslo.feature.identity.R.id.unified_alerts_timestamp_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_timestamp_icon, com.paypal.pds.oslo.assets.R.drawable.ui_clock, com.paypal.oslo.feature.identity.R.id.unified_alerts_timestamp_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(DEVICE_NAME, com.paypal.oslo.feature.identity.R.id.unified_alerts_device_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_device_icon, com.paypal.pds.oslo.assets.R.drawable.ui_desktop, com.paypal.oslo.feature.identity.R.id.unified_alerts_device_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow("user_profile", com.paypal.oslo.feature.identity.R.id.unified_alerts_user_profile_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_user_profile_icon, com.paypal.pds.oslo.assets.R.drawable.ui_person_two, com.paypal.oslo.feature.identity.R.id.unified_alerts_user_profile_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(WALLET, com.paypal.oslo.feature.identity.R.id.unified_alerts_wallet_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_wallet_icon, com.paypal.pds.oslo.assets.R.drawable.ui_card, com.paypal.oslo.feature.identity.R.id.unified_alerts_wallet_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow(CASH, com.paypal.oslo.feature.identity.R.id.unified_alerts_cash_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_cash_icon, com.paypal.pds.oslo.assets.R.drawable.ui_money_bill, com.paypal.oslo.feature.identity.R.id.unified_alerts_cash_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow("crypto", com.paypal.oslo.feature.identity.R.id.unified_alerts_crypto_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_crypto_icon, com.paypal.pds.oslo.assets.R.drawable.ui_currency_crypto, com.paypal.oslo.feature.identity.R.id.unified_alerts_crypto_text), new com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow("message", com.paypal.oslo.feature.identity.R.id.unified_alerts_message_row, com.paypal.oslo.feature.identity.R.id.unified_alerts_message_icon, com.paypal.pds.oslo.assets.R.drawable.ui_message, com.paypal.oslo.feature.identity.R.id.unified_alerts_message_text)});

    @javax.inject.Inject
    public UnifiedAlertsCustomViewRenderer(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.templateId = TEMPLATE_ID;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer
    public final java.lang.String getTemplateId() {
        return this.templateId;
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.CustomViewRenderer
    public final android.widget.RemoteViews render(java.util.Map<java.lang.String, ? extends java.lang.Object> data, java.lang.String title, java.lang.String body, java.lang.String notificationId, java.util.Map<java.lang.String, java.lang.String> metadata) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        try {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Building IDENTITY_UNIFIED_ALERTS custom view", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("data_keys", kotlin.collections.CollectionsKt.joinToString$default(data.keySet(), ",", null, null, 0, null, null, 62, null)), kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationId)), null, 4, null);
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.getHighSpeedVideoFpsRanges.getPackageName(), com.paypal.oslo.feature.identity.R.layout.feature_identity_unified_alerts_custom_view);
            remoteViews.setTextViewText(com.paypal.oslo.feature.identity.R.id.unified_alerts_title_text, title);
            remoteViews.setTextViewText(com.paypal.oslo.feature.identity.R.id.unified_alerts_body_text, body);
            for (com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow detailRow : getHighSpeedVideoFpsRanges) {
                java.lang.Object obj2 = data.get(detailRow.getHighSpeedVideoSizes);
                if (obj2 != null && (obj = obj2.toString()) != null) {
                    java.lang.String obj3 = kotlin.text.StringsKt.trim(obj).toString();
                    if (obj3.length() <= 0 || kotlin.text.StringsKt.equals(obj3, "na", true)) {
                        obj = null;
                    }
                    if (obj != null) {
                        remoteViews.setViewVisibility(detailRow.getHighSpeedVideoFpsRangesFor, 0);
                        remoteViews.setImageViewResource(detailRow.getHighResolutionOutputSizeshNQ4ISI, detailRow.getHighSpeedVideoFpsRanges);
                        remoteViews.setTextViewText(detailRow.Camera2StreamConfigurationMap, obj);
                    }
                }
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "IDENTITY_UNIFIED_ALERTS RemoteViews created successfully", null, null, 6, null);
            return remoteViews;
        } catch (java.lang.Exception e2) {
            e = e2;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.pushnotification.data.click.NotificationClickReceiver.EXTRA_NOTIFICATION_ID, notificationId);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to build IDENTITY_UNIFIED_ALERTS custom view", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/rendering/UnifiedAlertsCustomViewRenderer$DetailRow;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;IIII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class DetailRow {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final int Camera2StreamConfigurationMap;

        public DetailRow(java.lang.String str, int i, int i2, int i3, int i4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRanges = i3;
            this.Camera2StreamConfigurationMap = i4;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.getHighSpeedVideoFpsRanges;
            int i4 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DetailRow(getHighSpeedVideoSizes=");
            sb.append(str);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(i);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(i2);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(i3);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(i4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.getHighSpeedVideoSizes.hashCode() * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges)) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow)) {
                return false;
            }
            com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow detailRow = (com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.DetailRow) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, detailRow.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRangesFor == detailRow.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == detailRow.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == detailRow.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == detailRow.Camera2StreamConfigurationMap;
        }
    }
}
