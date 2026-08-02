package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/CardConnectAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "SCREEN_KNOT_SDK", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CREATE_SESSION_LOADER", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCREATE_SESSION_LOADER", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CardConnectAnalytics {
    public static final java.lang.String ACTION = "add_card_to_favorite_stores";
    public static final java.lang.String SCREEN_ERROR = "debit_card_card_connect_error";
    public static final java.lang.String SCREEN_ID = "debit_card_card_connect";
    public static final java.lang.String SCREEN_KNOT_SDK = "debit_card_card_connect_knot_sdk_webview";
    public static final java.lang.String SCREEN_LOADING = "debit_card_card_connect_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.CardConnectAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.CardConnectAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CREATE_SESSION_LOADER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("create_session_loader", 0, null, null, 14, null);
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;

    private CardConnectAnalytics() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCREATE_SESSION_LOADER() {
        return CREATE_SESSION_LOADER;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.CARD_CONNECT_FEATURE, ACTION);
    }
}
