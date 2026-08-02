package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/InstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "PHYSICAL", "VIRTUAL", "WALLET", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstrumentType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType PHYSICAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType UNKNOWN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType VIRTUAL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType WALLET;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType[] getHighSpeedVideoSizes;

    private InstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType("PHYSICAL", 0);
        PHYSICAL = instrumentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType("VIRTUAL", 1);
        VIRTUAL = instrumentType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType("WALLET", 2);
        WALLET = instrumentType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType instrumentType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType("UNKNOWN", 3);
        UNKNOWN = instrumentType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType[] instrumentTypeArr = {instrumentType, instrumentType2, instrumentType3, instrumentType4};
        getHighSpeedVideoSizes = instrumentTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(instrumentTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.InstrumentType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
