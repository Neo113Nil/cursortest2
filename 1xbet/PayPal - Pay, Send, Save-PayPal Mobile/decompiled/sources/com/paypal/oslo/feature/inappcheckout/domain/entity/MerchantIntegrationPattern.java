package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/MerchantIntegrationPattern;", "", "<init>", "(Ljava/lang/String;I)V", "PARTNER", "DIRECT", "BILL_PAY", "DONATION", "PAY_FAST", "TYPE_5_DISBURSEMENT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MerchantIntegrationPattern {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern BILL_PAY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern DIRECT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern DONATION;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern PARTNER;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern PAY_FAST;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern TYPE_5_DISBURSEMENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern[] getHighSpeedVideoSizes;

    private MerchantIntegrationPattern(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("PARTNER", 0);
        PARTNER = merchantIntegrationPattern;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("DIRECT", 1);
        DIRECT = merchantIntegrationPattern2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("BILL_PAY", 2);
        BILL_PAY = merchantIntegrationPattern3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("DONATION", 3);
        DONATION = merchantIntegrationPattern4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern5 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("PAY_FAST", 4);
        PAY_FAST = merchantIntegrationPattern5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern6 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("TYPE_5_DISBURSEMENT", 5);
        TYPE_5_DISBURSEMENT = merchantIntegrationPattern6;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern merchantIntegrationPattern7 = new com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern("UNKNOWN__", 6);
        UNKNOWN__ = merchantIntegrationPattern7;
        com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern[] merchantIntegrationPatternArr = {merchantIntegrationPattern, merchantIntegrationPattern2, merchantIntegrationPattern3, merchantIntegrationPattern4, merchantIntegrationPattern5, merchantIntegrationPattern6, merchantIntegrationPattern7};
        getHighSpeedVideoSizes = merchantIntegrationPatternArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(merchantIntegrationPatternArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.MerchantIntegrationPattern> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
