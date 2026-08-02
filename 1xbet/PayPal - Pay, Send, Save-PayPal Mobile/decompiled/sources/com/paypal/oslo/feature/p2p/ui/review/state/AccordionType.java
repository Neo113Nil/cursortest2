package com.paypal.oslo.feature.p2p.ui.review.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_METHOD", "PAYMENT_TYPE", "SHIPPING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccordionType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.AccordionType PAYMENT_METHOD;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.AccordionType PAYMENT_TYPE;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.AccordionType SHIPPING;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.AccordionType[] getHighSpeedVideoFpsRangesFor;

    private AccordionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType = new com.paypal.oslo.feature.p2p.ui.review.state.AccordionType("PAYMENT_METHOD", 0);
        PAYMENT_METHOD = accordionType;
        com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType2 = new com.paypal.oslo.feature.p2p.ui.review.state.AccordionType("PAYMENT_TYPE", 1);
        PAYMENT_TYPE = accordionType2;
        com.paypal.oslo.feature.p2p.ui.review.state.AccordionType accordionType3 = new com.paypal.oslo.feature.p2p.ui.review.state.AccordionType("SHIPPING", 2);
        SHIPPING = accordionType3;
        com.paypal.oslo.feature.p2p.ui.review.state.AccordionType[] accordionTypeArr = {accordionType, accordionType2, accordionType3};
        getHighSpeedVideoFpsRangesFor = accordionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(accordionTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.AccordionType[] values() {
        return (com.paypal.oslo.feature.p2p.ui.review.state.AccordionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.AccordionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.review.state.AccordionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.review.state.AccordionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
