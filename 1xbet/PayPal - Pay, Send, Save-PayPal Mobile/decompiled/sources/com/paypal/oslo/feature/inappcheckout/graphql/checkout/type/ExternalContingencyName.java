package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ADD_INSTRUMENT", "AUTH_CHALLENGE", "CARD_EXPIRING_SOON", "CIT_AUTH", "CONSENT_LEVEL_CIT_REQUIRED", "ECONSENT", "EXPIRED_CARD", "EXPIRED_CREDIT_CARD", "INSTRUMENT_CONFIRMATION_REQUIRED", "NEED_CREDIT_CARD", "PHONE_NUMBER_REQUIRED", "THIRD_PARTY_AUTHENTICATION_REQUIRED", "THREE_DS_AUTHENTICATION_REQUIRED", "UPDATE_CARD_INSTRUMENT", "UPDATE_INSTRUMENT_REQUIRED", "CARD_VERIFICATION_VALUE_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", "BANK_ACCOUNT_BALANCE_REQUIRED", "PRE_AUTHORIZATION_REQUIRED", "PRE_AUTHORIZATION_REQUIRED_DECLINED", "PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE", "DOMESTIC_SHIPPING_ADDRESS_REQUIRED", "VALID_SHIPPING_ADDRESS_REQUIRED", "SHIPPING_ADDRESS_REQUIRED", "RESELECT_FUNDING_INSTRUMENT", "NEGATIVE_BALANCE_RECOVERY", "STRONG_CUSTOMER_AUTH", "STRONG_CUSTOMER_AUTH_RBL", "MORE_DATA_REQUIRED_FOR_ASSESSMENT", "INVENTORY_SOLD_OUT", "RISK_DECLINE_REDIRECT_AUTH_FLOW", "SEPA_MANDATE_ACCEPTANCE_REQUIRED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalContingencyName {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName ADD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName AUTH_CHALLENGE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName BANK_ACCOUNT_BALANCE_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName CARD_EXPIRING_SOON;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName CARD_VERIFICATION_VALUE_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName CIT_AUTH;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName CONSENT_LEVEL_CIT_REQUIRED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName DOMESTIC_SHIPPING_ADDRESS_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName ECONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName EXPIRED_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName EXPIRED_CREDIT_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName INSTRUMENT_CONFIRMATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName INVENTORY_SOLD_OUT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName MORE_DATA_REQUIRED_FOR_ASSESSMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName NEED_CREDIT_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName NEGATIVE_BALANCE_RECOVERY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName PHONE_NUMBER_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName PRE_AUTHORIZATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName PRE_AUTHORIZATION_REQUIRED_DECLINED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName RESELECT_FUNDING_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName RISK_DECLINE_REDIRECT_AUTH_FLOW;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName SEPA_MANDATE_ACCEPTANCE_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName SHIPPING_ADDRESS_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName STRONG_CUSTOMER_AUTH;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName STRONG_CUSTOMER_AUTH_RBL;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName THIRD_PARTY_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName THREE_DS_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName UPDATE_CARD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName UPDATE_INSTRUMENT_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName VALID_SHIPPING_ADDRESS_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalContingencyName(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("ADD_INSTRUMENT", 0, "ADD_INSTRUMENT");
        ADD_INSTRUMENT = externalContingencyName;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("AUTH_CHALLENGE", 1, "AUTH_CHALLENGE");
        AUTH_CHALLENGE = externalContingencyName2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("CARD_EXPIRING_SOON", 2, "CARD_EXPIRING_SOON");
        CARD_EXPIRING_SOON = externalContingencyName3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("CIT_AUTH", 3, "CIT_AUTH");
        CIT_AUTH = externalContingencyName4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("CONSENT_LEVEL_CIT_REQUIRED", 4, "CONSENT_LEVEL_CIT_REQUIRED");
        CONSENT_LEVEL_CIT_REQUIRED = externalContingencyName5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("ECONSENT", 5, "ECONSENT");
        ECONSENT = externalContingencyName6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("EXPIRED_CARD", 6, "EXPIRED_CARD");
        EXPIRED_CARD = externalContingencyName7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("EXPIRED_CREDIT_CARD", 7, "EXPIRED_CREDIT_CARD");
        EXPIRED_CREDIT_CARD = externalContingencyName8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("INSTRUMENT_CONFIRMATION_REQUIRED", 8, "INSTRUMENT_CONFIRMATION_REQUIRED");
        INSTRUMENT_CONFIRMATION_REQUIRED = externalContingencyName9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName10 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("NEED_CREDIT_CARD", 9, "NEED_CREDIT_CARD");
        NEED_CREDIT_CARD = externalContingencyName10;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName11 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("PHONE_NUMBER_REQUIRED", 10, "PHONE_NUMBER_REQUIRED");
        PHONE_NUMBER_REQUIRED = externalContingencyName11;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName12 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("THIRD_PARTY_AUTHENTICATION_REQUIRED", 11, "THIRD_PARTY_AUTHENTICATION_REQUIRED");
        THIRD_PARTY_AUTHENTICATION_REQUIRED = externalContingencyName12;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName13 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("THREE_DS_AUTHENTICATION_REQUIRED", 12, "THREE_DS_AUTHENTICATION_REQUIRED");
        THREE_DS_AUTHENTICATION_REQUIRED = externalContingencyName13;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName14 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("UPDATE_CARD_INSTRUMENT", 13, "UPDATE_CARD_INSTRUMENT");
        UPDATE_CARD_INSTRUMENT = externalContingencyName14;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName15 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("UPDATE_INSTRUMENT_REQUIRED", 14, "UPDATE_INSTRUMENT_REQUIRED");
        UPDATE_INSTRUMENT_REQUIRED = externalContingencyName15;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName16 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("CARD_VERIFICATION_VALUE_REQUIRED", 15, "CARD_VERIFICATION_VALUE_REQUIRED");
        CARD_VERIFICATION_VALUE_REQUIRED = externalContingencyName16;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName17 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", 16, "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED");
        USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED = externalContingencyName17;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName18 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("BANK_ACCOUNT_BALANCE_REQUIRED", 17, "BANK_ACCOUNT_BALANCE_REQUIRED");
        BANK_ACCOUNT_BALANCE_REQUIRED = externalContingencyName18;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName19 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("PRE_AUTHORIZATION_REQUIRED", 18, "PRE_AUTHORIZATION_REQUIRED");
        PRE_AUTHORIZATION_REQUIRED = externalContingencyName19;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName20 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("PRE_AUTHORIZATION_REQUIRED_DECLINED", 19, "PRE_AUTHORIZATION_REQUIRED_DECLINED");
        PRE_AUTHORIZATION_REQUIRED_DECLINED = externalContingencyName20;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName21 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE", 20, "PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE");
        PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE = externalContingencyName21;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName22 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("DOMESTIC_SHIPPING_ADDRESS_REQUIRED", 21, "DOMESTIC_SHIPPING_ADDRESS_REQUIRED");
        DOMESTIC_SHIPPING_ADDRESS_REQUIRED = externalContingencyName22;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName23 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("VALID_SHIPPING_ADDRESS_REQUIRED", 22, "VALID_SHIPPING_ADDRESS_REQUIRED");
        VALID_SHIPPING_ADDRESS_REQUIRED = externalContingencyName23;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName24 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("SHIPPING_ADDRESS_REQUIRED", 23, "SHIPPING_ADDRESS_REQUIRED");
        SHIPPING_ADDRESS_REQUIRED = externalContingencyName24;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName25 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("RESELECT_FUNDING_INSTRUMENT", 24, "RESELECT_FUNDING_INSTRUMENT");
        RESELECT_FUNDING_INSTRUMENT = externalContingencyName25;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName26 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("NEGATIVE_BALANCE_RECOVERY", 25, "NEGATIVE_BALANCE_RECOVERY");
        NEGATIVE_BALANCE_RECOVERY = externalContingencyName26;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName27 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("STRONG_CUSTOMER_AUTH", 26, "STRONG_CUSTOMER_AUTH");
        STRONG_CUSTOMER_AUTH = externalContingencyName27;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName28 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("STRONG_CUSTOMER_AUTH_RBL", 27, "STRONG_CUSTOMER_AUTH_RBL");
        STRONG_CUSTOMER_AUTH_RBL = externalContingencyName28;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName29 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("MORE_DATA_REQUIRED_FOR_ASSESSMENT", 28, "MORE_DATA_REQUIRED_FOR_ASSESSMENT");
        MORE_DATA_REQUIRED_FOR_ASSESSMENT = externalContingencyName29;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName30 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("INVENTORY_SOLD_OUT", 29, "INVENTORY_SOLD_OUT");
        INVENTORY_SOLD_OUT = externalContingencyName30;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName31 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("RISK_DECLINE_REDIRECT_AUTH_FLOW", 30, "RISK_DECLINE_REDIRECT_AUTH_FLOW");
        RISK_DECLINE_REDIRECT_AUTH_FLOW = externalContingencyName31;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName32 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("SEPA_MANDATE_ACCEPTANCE_REQUIRED", 31, "SEPA_MANDATE_ACCEPTANCE_REQUIRED");
        SEPA_MANDATE_ACCEPTANCE_REQUIRED = externalContingencyName32;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName33 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("UNKNOWN", 32, "UNKNOWN");
        UNKNOWN = externalContingencyName33;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName34 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName("UNKNOWN__", 33, "UNKNOWN__");
        UNKNOWN__ = externalContingencyName34;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[] externalContingencyNameArr = {externalContingencyName, externalContingencyName2, externalContingencyName3, externalContingencyName4, externalContingencyName5, externalContingencyName6, externalContingencyName7, externalContingencyName8, externalContingencyName9, externalContingencyName10, externalContingencyName11, externalContingencyName12, externalContingencyName13, externalContingencyName14, externalContingencyName15, externalContingencyName16, externalContingencyName17, externalContingencyName18, externalContingencyName19, externalContingencyName20, externalContingencyName21, externalContingencyName22, externalContingencyName23, externalContingencyName24, externalContingencyName25, externalContingencyName26, externalContingencyName27, externalContingencyName28, externalContingencyName29, externalContingencyName30, externalContingencyName31, externalContingencyName32, externalContingencyName33, externalContingencyName34};
        getHighResolutionOutputSizeshNQ4ISI = externalContingencyNameArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(externalContingencyNameArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalContingencyName", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ADD_INSTRUMENT", "AUTH_CHALLENGE", "CARD_EXPIRING_SOON", "CIT_AUTH", "CONSENT_LEVEL_CIT_REQUIRED", "ECONSENT", "EXPIRED_CARD", "EXPIRED_CREDIT_CARD", "INSTRUMENT_CONFIRMATION_REQUIRED", "NEED_CREDIT_CARD", "PHONE_NUMBER_REQUIRED", "THIRD_PARTY_AUTHENTICATION_REQUIRED", "THREE_DS_AUTHENTICATION_REQUIRED", "UPDATE_CARD_INSTRUMENT", "UPDATE_INSTRUMENT_REQUIRED", "CARD_VERIFICATION_VALUE_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", "BANK_ACCOUNT_BALANCE_REQUIRED", "PRE_AUTHORIZATION_REQUIRED", "PRE_AUTHORIZATION_REQUIRED_DECLINED", "PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE", "DOMESTIC_SHIPPING_ADDRESS_REQUIRED", "VALID_SHIPPING_ADDRESS_REQUIRED", "SHIPPING_ADDRESS_REQUIRED", "RESELECT_FUNDING_INSTRUMENT", "NEGATIVE_BALANCE_RECOVERY", "STRONG_CUSTOMER_AUTH", "STRONG_CUSTOMER_AUTH_RBL", "MORE_DATA_REQUIRED_FOR_ASSESSMENT", "INVENTORY_SOLD_OUT", "RISK_DECLINE_REDIRECT_AUTH_FLOW", "SEPA_MANDATE_ACCEPTANCE_REQUIRED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalContingencyName;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.ADD_INSTRUMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.AUTH_CHALLENGE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.CARD_EXPIRING_SOON, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.CIT_AUTH, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.CONSENT_LEVEL_CIT_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.ECONSENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.EXPIRED_CARD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.EXPIRED_CREDIT_CARD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.INSTRUMENT_CONFIRMATION_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.NEED_CREDIT_CARD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.PHONE_NUMBER_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.THIRD_PARTY_AUTHENTICATION_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.THREE_DS_AUTHENTICATION_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.UPDATE_CARD_INSTRUMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.UPDATE_INSTRUMENT_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.CARD_VERIFICATION_VALUE_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.BANK_ACCOUNT_BALANCE_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.PRE_AUTHORIZATION_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.PRE_AUTHORIZATION_REQUIRED_DECLINED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.PRE_AUTHORIZATION_REQUIRED_DECLINED_RETRYABLE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.DOMESTIC_SHIPPING_ADDRESS_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.VALID_SHIPPING_ADDRESS_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.SHIPPING_ADDRESS_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.RESELECT_FUNDING_INSTRUMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.NEGATIVE_BALANCE_RECOVERY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.STRONG_CUSTOMER_AUTH, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.STRONG_CUSTOMER_AUTH_RBL, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.MORE_DATA_REQUIRED_FOR_ASSESSMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.INVENTORY_SOLD_OUT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.RISK_DECLINE_REDIRECT_AUTH_FLOW, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.SEPA_MANDATE_ACCEPTANCE_REQUIRED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName) obj;
            return externalContingencyName == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.UNKNOWN__ : externalContingencyName;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
