package com.paypal.oslo.feature.qrc.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/OptionsType;", "", "<init>", "(Ljava/lang/String;I)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "SingleFi", "BalanceOnly", "SingleFiWithBalance", "Accordion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OptionsType {
    public static final com.paypal.oslo.feature.qrc.ui.review.OptionsType Accordion;
    public static final com.paypal.oslo.feature.qrc.ui.review.OptionsType BalanceOnly;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.OptionsType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.ui.review.OptionsType None;
    public static final com.paypal.oslo.feature.qrc.ui.review.OptionsType SingleFi;
    public static final com.paypal.oslo.feature.qrc.ui.review.OptionsType SingleFiWithBalance;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private OptionsType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.review.OptionsType optionsType = new com.paypal.oslo.feature.qrc.ui.review.OptionsType(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, 0);
        None = optionsType;
        com.paypal.oslo.feature.qrc.ui.review.OptionsType optionsType2 = new com.paypal.oslo.feature.qrc.ui.review.OptionsType("SingleFi", 1);
        SingleFi = optionsType2;
        com.paypal.oslo.feature.qrc.ui.review.OptionsType optionsType3 = new com.paypal.oslo.feature.qrc.ui.review.OptionsType("BalanceOnly", 2);
        BalanceOnly = optionsType3;
        com.paypal.oslo.feature.qrc.ui.review.OptionsType optionsType4 = new com.paypal.oslo.feature.qrc.ui.review.OptionsType("SingleFiWithBalance", 3);
        SingleFiWithBalance = optionsType4;
        com.paypal.oslo.feature.qrc.ui.review.OptionsType optionsType5 = new com.paypal.oslo.feature.qrc.ui.review.OptionsType("Accordion", 4);
        Accordion = optionsType5;
        com.paypal.oslo.feature.qrc.ui.review.OptionsType[] optionsTypeArr = {optionsType, optionsType2, optionsType3, optionsType4, optionsType5};
        Camera2StreamConfigurationMap = optionsTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(optionsTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.OptionsType[] values() {
        return (com.paypal.oslo.feature.qrc.ui.review.OptionsType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.OptionsType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.review.OptionsType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.review.OptionsType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.review.OptionsType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
