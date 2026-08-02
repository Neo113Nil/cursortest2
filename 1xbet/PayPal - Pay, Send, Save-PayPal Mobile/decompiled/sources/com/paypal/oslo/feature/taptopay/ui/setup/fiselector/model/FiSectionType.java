package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSectionType;", "", "<init>", "(Ljava/lang/String;I)V", "USE_YOUR_BANK", "ELIGIBLE_CARDS", "COMING_SOON", "INELIGIBLE_CARDS_FOOTER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiSectionType {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType COMING_SOON;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType ELIGIBLE_CARDS;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType INELIGIBLE_CARDS_FOOTER;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType USE_YOUR_BANK;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType[] getHighSpeedVideoFpsRangesFor;

    private FiSectionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType fiSectionType = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType("USE_YOUR_BANK", 0);
        USE_YOUR_BANK = fiSectionType;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType fiSectionType2 = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType("ELIGIBLE_CARDS", 1);
        ELIGIBLE_CARDS = fiSectionType2;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType fiSectionType3 = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType("COMING_SOON", 2);
        COMING_SOON = fiSectionType3;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType fiSectionType4 = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType("INELIGIBLE_CARDS_FOOTER", 3);
        INELIGIBLE_CARDS_FOOTER = fiSectionType4;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType[] fiSectionTypeArr = {fiSectionType, fiSectionType2, fiSectionType3, fiSectionType4};
        getHighSpeedVideoFpsRangesFor = fiSectionTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fiSectionTypeArr);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
