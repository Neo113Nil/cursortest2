package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\"\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAuthorizeBillingAgreementCreationErrorReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "TOKEN_CONSUMED", "ACH_FRAUD_RISK", "ACCOUNT_TAKE_OVER", "BUYER_RESTRICTION", "HIGH_VELOCITY_RISK", "RISK_DECLINED", "SELLER_RESTRICTION", "UNAUTH_CC_RISK", "SENDER_FI_OUT_OF_COUNTRY", "SENDER_ACCOUNT_INELIGIBLE", "SENDER_LOGIN_OUT_OF_COUNTRY", "SENDER_RESIDENCE_OUT_OF_COUNTRY", "GAMING_INTERNAL_ERROR", "INVALID_PAYMENT_FLOW", "SENDER_INVALID_ACCOUNT_TYPE", "SENDER_ACCOUNT_UNVERIFIED", "COMPLIANCE_KYC_VIOLATION", "COMPLIANCE_VIOLATION", "RECEIVER_CIP_INCOMPLETE", "DECLINED_CURRENCY_RESTRICTION", "DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE", "DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE", "DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE", "SUBSCRIPTION_ACTIVATION_FAILED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalAuthorizeBillingAgreementCreationErrorReason {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason ACCOUNT_TAKE_OVER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason ACH_FRAUD_RISK;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason BUYER_RESTRICTION;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason COMPLIANCE_KYC_VIOLATION;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason COMPLIANCE_VIOLATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason DECLINED_CURRENCY_RESTRICTION;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason GAMING_INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason HIGH_VELOCITY_RISK;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason INVALID_PAYMENT_FLOW;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason RECEIVER_CIP_INCOMPLETE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason RISK_DECLINED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SELLER_RESTRICTION;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_ACCOUNT_INELIGIBLE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_ACCOUNT_UNVERIFIED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_FI_OUT_OF_COUNTRY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_INVALID_ACCOUNT_TYPE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_LOGIN_OUT_OF_COUNTRY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SENDER_RESIDENCE_OUT_OF_COUNTRY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason SUBSCRIPTION_ACTIVATION_FAILED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason TOKEN_CONSUMED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason UNAUTH_CC_RISK;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalAuthorizeBillingAgreementCreationErrorReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("TOKEN_CONSUMED", 0, "TOKEN_CONSUMED");
        TOKEN_CONSUMED = externalAuthorizeBillingAgreementCreationErrorReason;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("ACH_FRAUD_RISK", 1, "ACH_FRAUD_RISK");
        ACH_FRAUD_RISK = externalAuthorizeBillingAgreementCreationErrorReason2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("ACCOUNT_TAKE_OVER", 2, "ACCOUNT_TAKE_OVER");
        ACCOUNT_TAKE_OVER = externalAuthorizeBillingAgreementCreationErrorReason3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("BUYER_RESTRICTION", 3, "BUYER_RESTRICTION");
        BUYER_RESTRICTION = externalAuthorizeBillingAgreementCreationErrorReason4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("HIGH_VELOCITY_RISK", 4, "HIGH_VELOCITY_RISK");
        HIGH_VELOCITY_RISK = externalAuthorizeBillingAgreementCreationErrorReason5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("RISK_DECLINED", 5, "RISK_DECLINED");
        RISK_DECLINED = externalAuthorizeBillingAgreementCreationErrorReason6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SELLER_RESTRICTION", 6, "SELLER_RESTRICTION");
        SELLER_RESTRICTION = externalAuthorizeBillingAgreementCreationErrorReason7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("UNAUTH_CC_RISK", 7, "UNAUTH_CC_RISK");
        UNAUTH_CC_RISK = externalAuthorizeBillingAgreementCreationErrorReason8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_FI_OUT_OF_COUNTRY", 8, "SENDER_FI_OUT_OF_COUNTRY");
        SENDER_FI_OUT_OF_COUNTRY = externalAuthorizeBillingAgreementCreationErrorReason9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason10 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_ACCOUNT_INELIGIBLE", 9, "SENDER_ACCOUNT_INELIGIBLE");
        SENDER_ACCOUNT_INELIGIBLE = externalAuthorizeBillingAgreementCreationErrorReason10;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason11 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_LOGIN_OUT_OF_COUNTRY", 10, "SENDER_LOGIN_OUT_OF_COUNTRY");
        SENDER_LOGIN_OUT_OF_COUNTRY = externalAuthorizeBillingAgreementCreationErrorReason11;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason12 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_RESIDENCE_OUT_OF_COUNTRY", 11, "SENDER_RESIDENCE_OUT_OF_COUNTRY");
        SENDER_RESIDENCE_OUT_OF_COUNTRY = externalAuthorizeBillingAgreementCreationErrorReason12;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason13 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("GAMING_INTERNAL_ERROR", 12, "GAMING_INTERNAL_ERROR");
        GAMING_INTERNAL_ERROR = externalAuthorizeBillingAgreementCreationErrorReason13;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason14 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("INVALID_PAYMENT_FLOW", 13, "INVALID_PAYMENT_FLOW");
        INVALID_PAYMENT_FLOW = externalAuthorizeBillingAgreementCreationErrorReason14;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason15 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_INVALID_ACCOUNT_TYPE", 14, "SENDER_INVALID_ACCOUNT_TYPE");
        SENDER_INVALID_ACCOUNT_TYPE = externalAuthorizeBillingAgreementCreationErrorReason15;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason16 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SENDER_ACCOUNT_UNVERIFIED", 15, "SENDER_ACCOUNT_UNVERIFIED");
        SENDER_ACCOUNT_UNVERIFIED = externalAuthorizeBillingAgreementCreationErrorReason16;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason17 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("COMPLIANCE_KYC_VIOLATION", 16, "COMPLIANCE_KYC_VIOLATION");
        COMPLIANCE_KYC_VIOLATION = externalAuthorizeBillingAgreementCreationErrorReason17;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason18 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("COMPLIANCE_VIOLATION", 17, "COMPLIANCE_VIOLATION");
        COMPLIANCE_VIOLATION = externalAuthorizeBillingAgreementCreationErrorReason18;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason19 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("RECEIVER_CIP_INCOMPLETE", 18, "RECEIVER_CIP_INCOMPLETE");
        RECEIVER_CIP_INCOMPLETE = externalAuthorizeBillingAgreementCreationErrorReason19;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason20 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("DECLINED_CURRENCY_RESTRICTION", 19, "DECLINED_CURRENCY_RESTRICTION");
        DECLINED_CURRENCY_RESTRICTION = externalAuthorizeBillingAgreementCreationErrorReason20;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason21 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE", 20, "DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE");
        DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE = externalAuthorizeBillingAgreementCreationErrorReason21;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason22 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE", 21, "DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE");
        DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE = externalAuthorizeBillingAgreementCreationErrorReason22;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason23 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE", 22, "DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE");
        DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE = externalAuthorizeBillingAgreementCreationErrorReason23;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason24 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("SUBSCRIPTION_ACTIVATION_FAILED", 23, "SUBSCRIPTION_ACTIVATION_FAILED");
        SUBSCRIPTION_ACTIVATION_FAILED = externalAuthorizeBillingAgreementCreationErrorReason24;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason25 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("UNKNOWN", 24, "UNKNOWN");
        UNKNOWN = externalAuthorizeBillingAgreementCreationErrorReason25;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason26 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason("UNKNOWN__", 25, "UNKNOWN__");
        UNKNOWN__ = externalAuthorizeBillingAgreementCreationErrorReason26;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[] externalAuthorizeBillingAgreementCreationErrorReasonArr = {externalAuthorizeBillingAgreementCreationErrorReason, externalAuthorizeBillingAgreementCreationErrorReason2, externalAuthorizeBillingAgreementCreationErrorReason3, externalAuthorizeBillingAgreementCreationErrorReason4, externalAuthorizeBillingAgreementCreationErrorReason5, externalAuthorizeBillingAgreementCreationErrorReason6, externalAuthorizeBillingAgreementCreationErrorReason7, externalAuthorizeBillingAgreementCreationErrorReason8, externalAuthorizeBillingAgreementCreationErrorReason9, externalAuthorizeBillingAgreementCreationErrorReason10, externalAuthorizeBillingAgreementCreationErrorReason11, externalAuthorizeBillingAgreementCreationErrorReason12, externalAuthorizeBillingAgreementCreationErrorReason13, externalAuthorizeBillingAgreementCreationErrorReason14, externalAuthorizeBillingAgreementCreationErrorReason15, externalAuthorizeBillingAgreementCreationErrorReason16, externalAuthorizeBillingAgreementCreationErrorReason17, externalAuthorizeBillingAgreementCreationErrorReason18, externalAuthorizeBillingAgreementCreationErrorReason19, externalAuthorizeBillingAgreementCreationErrorReason20, externalAuthorizeBillingAgreementCreationErrorReason21, externalAuthorizeBillingAgreementCreationErrorReason22, externalAuthorizeBillingAgreementCreationErrorReason23, externalAuthorizeBillingAgreementCreationErrorReason24, externalAuthorizeBillingAgreementCreationErrorReason25, externalAuthorizeBillingAgreementCreationErrorReason26};
        getHighSpeedVideoFpsRanges = externalAuthorizeBillingAgreementCreationErrorReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(externalAuthorizeBillingAgreementCreationErrorReasonArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalAuthorizeBillingAgreementCreationErrorReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"TOKEN_CONSUMED", "ACH_FRAUD_RISK", "ACCOUNT_TAKE_OVER", "BUYER_RESTRICTION", "HIGH_VELOCITY_RISK", "RISK_DECLINED", "SELLER_RESTRICTION", "UNAUTH_CC_RISK", "SENDER_FI_OUT_OF_COUNTRY", "SENDER_ACCOUNT_INELIGIBLE", "SENDER_LOGIN_OUT_OF_COUNTRY", "SENDER_RESIDENCE_OUT_OF_COUNTRY", "GAMING_INTERNAL_ERROR", "INVALID_PAYMENT_FLOW", "SENDER_INVALID_ACCOUNT_TYPE", "SENDER_ACCOUNT_UNVERIFIED", "COMPLIANCE_KYC_VIOLATION", "COMPLIANCE_VIOLATION", "RECEIVER_CIP_INCOMPLETE", "DECLINED_CURRENCY_RESTRICTION", "DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE", "DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE", "DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE", "SUBSCRIPTION_ACTIVATION_FAILED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAuthorizeBillingAgreementCreationErrorReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAuthorizeBillingAgreementCreationErrorReason;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAuthorizeBillingAgreementCreationErrorReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalAuthorizeBillingAgreementCreationErrorReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.TOKEN_CONSUMED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.ACH_FRAUD_RISK, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.ACCOUNT_TAKE_OVER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.BUYER_RESTRICTION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.HIGH_VELOCITY_RISK, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.RISK_DECLINED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SELLER_RESTRICTION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.UNAUTH_CC_RISK, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_FI_OUT_OF_COUNTRY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_ACCOUNT_INELIGIBLE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_LOGIN_OUT_OF_COUNTRY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_RESIDENCE_OUT_OF_COUNTRY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.GAMING_INTERNAL_ERROR, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.INVALID_PAYMENT_FLOW, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_INVALID_ACCOUNT_TYPE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SENDER_ACCOUNT_UNVERIFIED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.COMPLIANCE_KYC_VIOLATION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.COMPLIANCE_VIOLATION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.RECEIVER_CIP_INCOMPLETE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.DECLINED_CURRENCY_RESTRICTION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.DECLINED_INCORRECT_CURRENCY_CONVERSION_PREFERENCE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.DECLINED_RECEIVER_ACCOUNT_LOCKED_OR_INACTIVE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.DECLINED_SENDER_ACCOUNT_LOCKED_OR_INACTIVE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.SUBSCRIPTION_ACTIVATION_FAILED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason) obj;
            return externalAuthorizeBillingAgreementCreationErrorReason == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.UNKNOWN__ : externalAuthorizeBillingAgreementCreationErrorReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
