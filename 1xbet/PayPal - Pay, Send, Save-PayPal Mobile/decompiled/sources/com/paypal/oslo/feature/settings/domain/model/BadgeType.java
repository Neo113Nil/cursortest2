package com.paypal.oslo.feature.settings.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/model/BadgeType;", "", "<init>", "(Ljava/lang/String;I)V", "Positive", "Negative", com.google.common.net.HttpHeaders.WARNING, "Loading"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgeType {
    public static final com.paypal.oslo.feature.settings.domain.model.BadgeType Loading;
    public static final com.paypal.oslo.feature.settings.domain.model.BadgeType Negative;
    public static final com.paypal.oslo.feature.settings.domain.model.BadgeType Positive;
    public static final com.paypal.oslo.feature.settings.domain.model.BadgeType Warning;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.BadgeType[] getHighSpeedVideoFpsRangesFor;

    private BadgeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType = new com.paypal.oslo.feature.settings.domain.model.BadgeType("Positive", 0);
        Positive = badgeType;
        com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType2 = new com.paypal.oslo.feature.settings.domain.model.BadgeType("Negative", 1);
        Negative = badgeType2;
        com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType3 = new com.paypal.oslo.feature.settings.domain.model.BadgeType(com.google.common.net.HttpHeaders.WARNING, 2);
        Warning = badgeType3;
        com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType4 = new com.paypal.oslo.feature.settings.domain.model.BadgeType("Loading", 3);
        Loading = badgeType4;
        com.paypal.oslo.feature.settings.domain.model.BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3, badgeType4};
        getHighSpeedVideoFpsRangesFor = badgeTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(badgeTypeArr);
    }

    public static com.paypal.oslo.feature.settings.domain.model.BadgeType[] values() {
        return (com.paypal.oslo.feature.settings.domain.model.BadgeType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.settings.domain.model.BadgeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.settings.domain.model.BadgeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.settings.domain.model.BadgeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.settings.domain.model.BadgeType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
