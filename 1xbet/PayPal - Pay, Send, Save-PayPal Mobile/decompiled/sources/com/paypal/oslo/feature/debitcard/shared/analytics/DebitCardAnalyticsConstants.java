package com.paypal.oslo.feature.debitcard.shared.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/analytics/DebitCardAnalyticsConstants;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getProductName", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "", "FEATURE", "Ljava/lang/String;", "MANAGE_CARD_FEATURE", "MANAGE_SECONDARY_CARD_FEATURE", "SHOW_CARD_FEATURE", "EDIT_BILLING_ADDRESS_FEATURE", "CANCEL_CARD_FEATURE", "DEBIT_PIN_FEATURE", "VIEW_PIN_FEATURE", "REQUEST_PHYSICAL_CARD_FEATURE", "ACQUISITION_FEATURE", "ACTIVATE_CARD_FEATURE", "REPLACE_DIGITAL_CARD_FEATURE", "CARD_REPLACEMENT_FEATURE", "REPORT_CARD_REASON_SELECTION_FEATURE", "PUSH_PROVISIONING_FEATURE", "WEB_VIEW_FEATURE", "ERROR_SOURCE_API", "MANAGE_WALLET_FEATURE", "CARD_CONNECT_FEATURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String ACQUISITION_FEATURE = "acquisition";
    public static final java.lang.String ACTIVATE_CARD_FEATURE = "activate_card";
    public static final java.lang.String CANCEL_CARD_FEATURE = "cancel_card";
    public static final java.lang.String CARD_CONNECT_FEATURE = "card_connect";
    public static final java.lang.String CARD_REPLACEMENT_FEATURE = "card_replacement";
    public static final java.lang.String DEBIT_PIN_FEATURE = "debit_pin";
    public static final java.lang.String EDIT_BILLING_ADDRESS_FEATURE = "edit_billing_address";
    public static final java.lang.String ERROR_SOURCE_API = "api_call";
    public static final java.lang.String FEATURE = "debit_card";
    public static final com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants();
    public static final java.lang.String MANAGE_CARD_FEATURE = "manage_card";
    public static final java.lang.String MANAGE_SECONDARY_CARD_FEATURE = "manage_secondary_card";
    public static final java.lang.String MANAGE_WALLET_FEATURE = "manage_wallet";
    public static final java.lang.String PUSH_PROVISIONING_FEATURE = "push_provisioning";
    public static final java.lang.String REPLACE_DIGITAL_CARD_FEATURE = "replace_digital_card";
    public static final java.lang.String REPORT_CARD_REASON_SELECTION_FEATURE = "report_card_reason_selection";
    public static final java.lang.String REQUEST_PHYSICAL_CARD_FEATURE = "request_physical_card";
    public static final java.lang.String SHOW_CARD_FEATURE = "card_info";
    public static final java.lang.String VIEW_PIN_FEATURE = "view_pin";
    public static final java.lang.String WEB_VIEW_FEATURE = "web_view";

    private DebitCardAnalyticsConstants() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getProductName(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        int i = com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.WhenMappings.$EnumSwitchMapping$0[productName.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_CONSUMER_DEBIT_CARD;
        }
        if (i == 2) {
            return com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_BUSINESS_DEBIT_CARD;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.telemetry.analytics.schema.Product.APPLICATION;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
