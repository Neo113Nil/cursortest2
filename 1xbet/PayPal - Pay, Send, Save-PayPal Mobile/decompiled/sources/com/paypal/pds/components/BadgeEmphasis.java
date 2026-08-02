package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/BadgeEmphasis;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "High"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BadgeEmphasis {
    public static final com.paypal.pds.components.BadgeEmphasis Default;
    public static final com.paypal.pds.components.BadgeEmphasis High;
    private static final /* synthetic */ com.paypal.pds.components.BadgeEmphasis[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BadgeEmphasis(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.BadgeEmphasis badgeEmphasis = new com.paypal.pds.components.BadgeEmphasis("Default", 0);
        Default = badgeEmphasis;
        com.paypal.pds.components.BadgeEmphasis badgeEmphasis2 = new com.paypal.pds.components.BadgeEmphasis("High", 1);
        High = badgeEmphasis2;
        com.paypal.pds.components.BadgeEmphasis[] badgeEmphasisArr = {badgeEmphasis, badgeEmphasis2};
        getHighResolutionOutputSizeshNQ4ISI = badgeEmphasisArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(badgeEmphasisArr);
    }

    public static com.paypal.pds.components.BadgeEmphasis[] values() {
        return (com.paypal.pds.components.BadgeEmphasis[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.pds.components.BadgeEmphasis valueOf(java.lang.String str) {
        return (com.paypal.pds.components.BadgeEmphasis) java.lang.Enum.valueOf(com.paypal.pds.components.BadgeEmphasis.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.BadgeEmphasis> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
