package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/view/preview/BadgeType;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class BadgeType {
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BadgeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType badgeType = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType("ISSUED", 0);
        getHighSpeedVideoFpsRanges = badgeType;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType badgeType2 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType("UPDATED", 1);
        getHighResolutionOutputSizeshNQ4ISI = badgeType2;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType[] badgeTypeArr = {badgeType, badgeType2};
        Camera2StreamConfigurationMap = badgeTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(badgeTypeArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.class, str);
    }
}
