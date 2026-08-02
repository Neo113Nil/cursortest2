package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AllowedFeature;", "", "<init>", "(Ljava/lang/String;I)V", "AUTHORIZATION", "REQUEST_CREDIT_LINE_INCREASE", "SERVICING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AllowedFeature {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature AUTHORIZATION;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature REQUEST_CREDIT_LINE_INCREASE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature SERVICING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature[] getHighSpeedVideoFpsRangesFor;

    private AllowedFeature(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature allowedFeature = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature("AUTHORIZATION", 0);
        AUTHORIZATION = allowedFeature;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature allowedFeature2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature("REQUEST_CREDIT_LINE_INCREASE", 1);
        REQUEST_CREDIT_LINE_INCREASE = allowedFeature2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature allowedFeature3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature("SERVICING", 2);
        SERVICING = allowedFeature3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature allowedFeature4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature("UNKNOWN", 3);
        UNKNOWN = allowedFeature4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature[] allowedFeatureArr = {allowedFeature, allowedFeature2, allowedFeature3, allowedFeature4};
        getHighSpeedVideoFpsRangesFor = allowedFeatureArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(allowedFeatureArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AllowedFeature> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
