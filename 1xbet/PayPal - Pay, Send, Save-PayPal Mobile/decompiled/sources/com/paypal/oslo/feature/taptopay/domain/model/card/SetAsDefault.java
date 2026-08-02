package com.paypal.oslo.feature.taptopay.domain.model.card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;", "", "<init>", "(Ljava/lang/String;I)V", "IF_FIRST_CARD", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES, org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetAsDefault {
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault IF_FIRST_CARD;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault NO;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault YES;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private SetAsDefault(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = new com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault("IF_FIRST_CARD", 0);
        IF_FIRST_CARD = setAsDefault;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault2 = new com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault(org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES, 1);
        YES = setAsDefault2;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault3 = new com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault(org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, 2);
        NO = setAsDefault3;
        com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault[] setAsDefaultArr = {setAsDefault, setAsDefault2, setAsDefault3};
        Camera2StreamConfigurationMap = setAsDefaultArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(setAsDefaultArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
