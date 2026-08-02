package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/OnBoardingStatusType;", "", "<init>", "(Ljava/lang/String;I)V", "APPROVED", "NEED_MORE_DATA", "IN_REVIEW", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "DENIED_BEFORE_PROVISIONING", "SUBSCRIBED_WITH_PRINCIPAL_FEATURES_DENIED", "SUBSCRIBED_WITH_PRINCIPAL_FEATURES_IN_REVIEW", "SUBSCRIBED_WITH_PRINCIPAL_FEATURES_NEED_DATA", "SUBSCRIBED_WITH_PRINCIPAL_FEATURES_LIMITED", "SUBSCRIBED_WITH_UNVERIFIED_EMAIL", "SUBSCRIBED_WITH_ALL_FEATURES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnBoardingStatusType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType APPROVED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType CANCELLED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType DENIED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType DENIED_BEFORE_PROVISIONING;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType IN_REVIEW;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType NEED_MORE_DATA;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType PAUSED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_ALL_FEATURES;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_PRINCIPAL_FEATURES_DENIED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_PRINCIPAL_FEATURES_IN_REVIEW;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_PRINCIPAL_FEATURES_LIMITED;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_PRINCIPAL_FEATURES_NEED_DATA;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType SUBSCRIBED_WITH_UNVERIFIED_EMAIL;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OnBoardingStatusType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("APPROVED", 0);
        APPROVED = onBoardingStatusType;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("NEED_MORE_DATA", 1);
        NEED_MORE_DATA = onBoardingStatusType2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType3 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("IN_REVIEW", 2);
        IN_REVIEW = onBoardingStatusType3;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType4 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 3);
        DENIED = onBoardingStatusType4;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType5 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType(com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, 4);
        PAUSED = onBoardingStatusType5;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType6 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 5);
        CANCELLED = onBoardingStatusType6;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType7 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("DENIED_BEFORE_PROVISIONING", 6);
        DENIED_BEFORE_PROVISIONING = onBoardingStatusType7;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType8 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_PRINCIPAL_FEATURES_DENIED", 7);
        SUBSCRIBED_WITH_PRINCIPAL_FEATURES_DENIED = onBoardingStatusType8;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType9 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_PRINCIPAL_FEATURES_IN_REVIEW", 8);
        SUBSCRIBED_WITH_PRINCIPAL_FEATURES_IN_REVIEW = onBoardingStatusType9;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType10 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_PRINCIPAL_FEATURES_NEED_DATA", 9);
        SUBSCRIBED_WITH_PRINCIPAL_FEATURES_NEED_DATA = onBoardingStatusType10;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType11 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_PRINCIPAL_FEATURES_LIMITED", 10);
        SUBSCRIBED_WITH_PRINCIPAL_FEATURES_LIMITED = onBoardingStatusType11;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType12 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_UNVERIFIED_EMAIL", 11);
        SUBSCRIBED_WITH_UNVERIFIED_EMAIL = onBoardingStatusType12;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType onBoardingStatusType13 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType("SUBSCRIBED_WITH_ALL_FEATURES", 12);
        SUBSCRIBED_WITH_ALL_FEATURES = onBoardingStatusType13;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType[] onBoardingStatusTypeArr = {onBoardingStatusType, onBoardingStatusType2, onBoardingStatusType3, onBoardingStatusType4, onBoardingStatusType5, onBoardingStatusType6, onBoardingStatusType7, onBoardingStatusType8, onBoardingStatusType9, onBoardingStatusType10, onBoardingStatusType11, onBoardingStatusType12, onBoardingStatusType13};
        getHighSpeedVideoFpsRanges = onBoardingStatusTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(onBoardingStatusTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.OnBoardingStatusType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
