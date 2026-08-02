package com.paypal.oslo.feature.bankingbundle.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/domain/model/EligibilityReason;", "", "<init>", "(Ljava/lang/String;I)V", "IDENTITY_VERIFICATION_FAILED", "IDENTITY_VERIFICATION_REQUIRED", "IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL", "USER_DOCUMENT_VALIDATION_FAILED", "BALANCE_DENIED", "BANK_ACCOUNT_OR_DEBIT_INELIGIBLE", "INVALID_USER_ACCOUNT_TYPE", "USER_ACCOUNT_CLOSED", "USER_ACCOUNT_LOCKED", "USER_ACCOUNT_RESTRICTED", "UNSUPPORTED_COUNTRY", com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, "MANUAL_REVIEW", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EligibilityReason {
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason BALANCE_DENIED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason BANK_ACCOUNT_OR_DEBIT_INELIGIBLE;
    private static final /* synthetic */ com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason IDENTITY_VERIFICATION_FAILED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason IDENTITY_VERIFICATION_REQUIRED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason INVALID_ADDRESS;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason INVALID_USER_ACCOUNT_TYPE;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason MANUAL_REVIEW;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason OTHER;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason UNSUPPORTED_COUNTRY;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason USER_ACCOUNT_CLOSED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason USER_ACCOUNT_LOCKED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason USER_ACCOUNT_RESTRICTED;
    public static final com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason USER_DOCUMENT_VALIDATION_FAILED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private EligibilityReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("IDENTITY_VERIFICATION_FAILED", 0);
        IDENTITY_VERIFICATION_FAILED = eligibilityReason;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason2 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("IDENTITY_VERIFICATION_REQUIRED", 1);
        IDENTITY_VERIFICATION_REQUIRED = eligibilityReason2;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason3 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL", 2);
        IN_ELMO_BUNDLE_ELIGIBILITY_CONTROL = eligibilityReason3;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason4 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("USER_DOCUMENT_VALIDATION_FAILED", 3);
        USER_DOCUMENT_VALIDATION_FAILED = eligibilityReason4;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason5 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("BALANCE_DENIED", 4);
        BALANCE_DENIED = eligibilityReason5;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason6 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("BANK_ACCOUNT_OR_DEBIT_INELIGIBLE", 5);
        BANK_ACCOUNT_OR_DEBIT_INELIGIBLE = eligibilityReason6;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason7 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("INVALID_USER_ACCOUNT_TYPE", 6);
        INVALID_USER_ACCOUNT_TYPE = eligibilityReason7;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason8 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("USER_ACCOUNT_CLOSED", 7);
        USER_ACCOUNT_CLOSED = eligibilityReason8;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason9 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("USER_ACCOUNT_LOCKED", 8);
        USER_ACCOUNT_LOCKED = eligibilityReason9;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason10 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("USER_ACCOUNT_RESTRICTED", 9);
        USER_ACCOUNT_RESTRICTED = eligibilityReason10;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason11 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("UNSUPPORTED_COUNTRY", 10);
        UNSUPPORTED_COUNTRY = eligibilityReason11;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason12 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress, 11);
        INVALID_ADDRESS = eligibilityReason12;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason13 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("MANUAL_REVIEW", 12);
        MANUAL_REVIEW = eligibilityReason13;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason eligibilityReason14 = new com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason("OTHER", 13);
        OTHER = eligibilityReason14;
        com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason[] eligibilityReasonArr = {eligibilityReason, eligibilityReason2, eligibilityReason3, eligibilityReason4, eligibilityReason5, eligibilityReason6, eligibilityReason7, eligibilityReason8, eligibilityReason9, eligibilityReason10, eligibilityReason11, eligibilityReason12, eligibilityReason13, eligibilityReason14};
        Camera2StreamConfigurationMap = eligibilityReasonArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(eligibilityReasonArr);
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason[] values() {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bankingbundle.domain.model.EligibilityReason> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
