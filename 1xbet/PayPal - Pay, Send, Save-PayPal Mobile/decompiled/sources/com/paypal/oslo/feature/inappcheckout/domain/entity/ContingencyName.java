package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_INSTRUMENT", "AUTH_CHALLENGE", "CIT_AUTH", "RESELECT_FUNDING_INSTRUMENT", "PRE_AUTH_REQUIRED", "PRE_AUTHORIZATION_REQUIRED", "UPDATE_CARD_INSTRUMENT", "ECONSENT", "THREE_DS_AUTHENTICATION_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED", "USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", "BANK_ACCOUNT_BALANCE_REQUIRED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContingencyName {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName ADD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName AUTH_CHALLENGE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName BANK_ACCOUNT_BALANCE_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName CIT_AUTH;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName ECONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName PRE_AUTHORIZATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName PRE_AUTH_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName RESELECT_FUNDING_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName THREE_DS_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName UPDATE_CARD_INSTRUMENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName[] getHighSpeedVideoSizes;

    private ContingencyName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("ADD_INSTRUMENT", 0);
        ADD_INSTRUMENT = contingencyName;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("AUTH_CHALLENGE", 1);
        AUTH_CHALLENGE = contingencyName2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("CIT_AUTH", 2);
        CIT_AUTH = contingencyName3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("RESELECT_FUNDING_INSTRUMENT", 3);
        RESELECT_FUNDING_INSTRUMENT = contingencyName4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName5 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("PRE_AUTH_REQUIRED", 4);
        PRE_AUTH_REQUIRED = contingencyName5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName6 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("PRE_AUTHORIZATION_REQUIRED", 5);
        PRE_AUTHORIZATION_REQUIRED = contingencyName6;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName7 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("UPDATE_CARD_INSTRUMENT", 6);
        UPDATE_CARD_INSTRUMENT = contingencyName7;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName8 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("ECONSENT", 7);
        ECONSENT = contingencyName8;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName9 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("THREE_DS_AUTHENTICATION_REQUIRED", 8);
        THREE_DS_AUTHENTICATION_REQUIRED = contingencyName9;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName10 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED", 9);
        USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED = contingencyName10;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName11 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED", 10);
        USER_CONSENT_FOR_BANK_ACCOUNT_INFO_RETRIEVAL_REQUIRED = contingencyName11;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName12 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("BANK_ACCOUNT_BALANCE_REQUIRED", 11);
        BANK_ACCOUNT_BALANCE_REQUIRED = contingencyName12;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName contingencyName13 = new com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName("UNKNOWN__", 12);
        UNKNOWN__ = contingencyName13;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName[] contingencyNameArr = {contingencyName, contingencyName2, contingencyName3, contingencyName4, contingencyName5, contingencyName6, contingencyName7, contingencyName8, contingencyName9, contingencyName10, contingencyName11, contingencyName12, contingencyName13};
        getHighSpeedVideoSizes = contingencyNameArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contingencyNameArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
