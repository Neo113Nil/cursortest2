package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/RequestPhysicalCardForFeeAnalytics;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getUserIntent", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "", "SCREEN_ID", "Ljava/lang/String;", "SCREEN_LOADING", "SCREEN_ERROR", "ACTION", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "FEE_INFO_CARD", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "getFEE_INFO_CARD", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "AGREEMENT_SECTION", "getAGREEMENT_SECTION", "CONSENT_WARNING_BANNER", "getCONSENT_WARNING_BANNER", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "ACCEPT_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getACCEPT_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "AGREEMENT_CHECKBOX", "getAGREEMENT_CHECKBOX", "AGREEMENT_LINK", "getAGREEMENT_LINK", "BACK_BUTTON", "getBACK_BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardForFeeAnalytics {
    public static final int $stable;
    public static final java.lang.String ACTION = "request";
    public static final java.lang.String SCREEN_ERROR = "debit_card_request_physical_card_fee_info_error";
    public static final java.lang.String SCREEN_ID = "debit_card_request_physical_card_fee_info";
    public static final java.lang.String SCREEN_LOADING = "debit_card_request_physical_card_fee_info_loading";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics();
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component FEE_INFO_CARD = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("fee_info_card", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component AGREEMENT_SECTION = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("agreement_section", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component CONSENT_WARNING_BANNER = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component("consent_warning_banner", 0, null, null, 14, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item ACCEPT_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("accept_button", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AGREEMENT_CHECKBOX = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("agreement_checkbox", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AGREEMENT_LINK = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("agreement_link", 0, 2, null);
    private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);

    private RequestPhysicalCardForFeeAnalytics() {
    }

    static {
        int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
        $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.$stable;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getFEE_INFO_CARD() {
        return FEE_INFO_CARD;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getAGREEMENT_SECTION() {
        return AGREEMENT_SECTION;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component getCONSENT_WARNING_BANNER() {
        return CONSENT_WARNING_BANNER;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getACCEPT_BUTTON() {
        return ACCEPT_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAGREEMENT_CHECKBOX() {
        return AGREEMENT_CHECKBOX;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAGREEMENT_LINK() {
        return AGREEMENT_LINK;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
        return BACK_BUTTON;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(productName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.REQUEST_PHYSICAL_CARD_FEATURE, "request");
    }
}
