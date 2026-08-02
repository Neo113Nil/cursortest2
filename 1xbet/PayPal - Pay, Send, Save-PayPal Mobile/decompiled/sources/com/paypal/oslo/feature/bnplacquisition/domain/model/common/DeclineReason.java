package com.paypal.oslo.feature.bnplacquisition.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ADDRESS_NORMALIZATION_FAILURE", "DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED", "FRAUD_DETECTION", "INELIGIBLE_ADDRESS", "KYC_THRESHOLD_REACHED", "KYC_VERIFICATION_FAILURE", "RISK_ASSESSMENT_FAILURE", "STRONG_CUSTOMER_AUTHENTICATION_FAILURE", "ACCOUNT_TAKEOVER_ASSESSMENT_DENIED", "GENERAL_ELIGIBILITY_DECLINE", "NO_ELIGIBLE_PRODUCT_OFFERS", "TOKENIZATION_DECLINE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeclineReason {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason ACCOUNT_TAKEOVER_ASSESSMENT_DENIED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason ADDRESS_NORMALIZATION_FAILURE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason FRAUD_DETECTION;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason GENERAL_ELIGIBILITY_DECLINE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason INELIGIBLE_ADDRESS;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason KYC_THRESHOLD_REACHED;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason KYC_VERIFICATION_FAILURE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason NO_ELIGIBLE_PRODUCT_OFFERS;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason RISK_ASSESSMENT_FAILURE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason STRONG_CUSTOMER_AUTHENTICATION_FAILURE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason TOKENIZATION_DECLINE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason[] getHighSpeedVideoFpsRanges;

    private DeclineReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("ADDRESS_NORMALIZATION_FAILURE", 0);
        ADDRESS_NORMALIZATION_FAILURE = declineReason;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED", 1);
        DOWN_PAYMENT_AUTHORIZATION_RETRIES_EXHAUSTED = declineReason2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("FRAUD_DETECTION", 2);
        FRAUD_DETECTION = declineReason3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("INELIGIBLE_ADDRESS", 3);
        INELIGIBLE_ADDRESS = declineReason4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason5 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("KYC_THRESHOLD_REACHED", 4);
        KYC_THRESHOLD_REACHED = declineReason5;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason6 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("KYC_VERIFICATION_FAILURE", 5);
        KYC_VERIFICATION_FAILURE = declineReason6;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason7 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("RISK_ASSESSMENT_FAILURE", 6);
        RISK_ASSESSMENT_FAILURE = declineReason7;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason8 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("STRONG_CUSTOMER_AUTHENTICATION_FAILURE", 7);
        STRONG_CUSTOMER_AUTHENTICATION_FAILURE = declineReason8;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason9 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("ACCOUNT_TAKEOVER_ASSESSMENT_DENIED", 8);
        ACCOUNT_TAKEOVER_ASSESSMENT_DENIED = declineReason9;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason10 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("GENERAL_ELIGIBILITY_DECLINE", 9);
        GENERAL_ELIGIBILITY_DECLINE = declineReason10;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason11 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("NO_ELIGIBLE_PRODUCT_OFFERS", 10);
        NO_ELIGIBLE_PRODUCT_OFFERS = declineReason11;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason12 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("TOKENIZATION_DECLINE", 11);
        TOKENIZATION_DECLINE = declineReason12;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason13 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason("UNKNOWN", 12);
        UNKNOWN = declineReason13;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason[] declineReasonArr = {declineReason, declineReason2, declineReason3, declineReason4, declineReason5, declineReason6, declineReason7, declineReason8, declineReason9, declineReason10, declineReason11, declineReason12, declineReason13};
        getHighSpeedVideoFpsRanges = declineReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(declineReasonArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason fromString(java.lang.String value) {
            java.lang.Object obj;
            if (value == null) {
                return com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason) obj).name(), value, true)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason) obj;
            return declineReason == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.UNKNOWN : declineReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
