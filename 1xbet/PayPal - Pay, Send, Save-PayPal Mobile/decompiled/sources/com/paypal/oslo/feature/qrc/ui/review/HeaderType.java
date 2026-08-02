package com.paypal.oslo.feature.qrc.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/HeaderType;", "", "<init>", "(Ljava/lang/String;I)V", "NormalCollapsed", "Expanded", "PayPalBalance", "TwoFI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HeaderType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.ui.review.HeaderType Expanded;
    public static final com.paypal.oslo.feature.qrc.ui.review.HeaderType NormalCollapsed;
    public static final com.paypal.oslo.feature.qrc.ui.review.HeaderType PayPalBalance;
    public static final com.paypal.oslo.feature.qrc.ui.review.HeaderType TwoFI;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.HeaderType[] getHighResolutionOutputSizeshNQ4ISI;

    private HeaderType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.review.HeaderType headerType = new com.paypal.oslo.feature.qrc.ui.review.HeaderType("NormalCollapsed", 0);
        NormalCollapsed = headerType;
        com.paypal.oslo.feature.qrc.ui.review.HeaderType headerType2 = new com.paypal.oslo.feature.qrc.ui.review.HeaderType("Expanded", 1);
        Expanded = headerType2;
        com.paypal.oslo.feature.qrc.ui.review.HeaderType headerType3 = new com.paypal.oslo.feature.qrc.ui.review.HeaderType("PayPalBalance", 2);
        PayPalBalance = headerType3;
        com.paypal.oslo.feature.qrc.ui.review.HeaderType headerType4 = new com.paypal.oslo.feature.qrc.ui.review.HeaderType("TwoFI", 3);
        TwoFI = headerType4;
        com.paypal.oslo.feature.qrc.ui.review.HeaderType[] headerTypeArr = {headerType, headerType2, headerType3, headerType4};
        getHighResolutionOutputSizeshNQ4ISI = headerTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(headerTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.HeaderType[] values() {
        return (com.paypal.oslo.feature.qrc.ui.review.HeaderType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.HeaderType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.review.HeaderType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.review.HeaderType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.review.HeaderType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
