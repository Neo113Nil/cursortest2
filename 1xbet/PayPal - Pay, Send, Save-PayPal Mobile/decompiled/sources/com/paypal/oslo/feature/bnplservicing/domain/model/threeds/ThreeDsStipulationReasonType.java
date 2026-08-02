package com.paypal.oslo.feature.bnplservicing.domain.model.threeds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationReasonType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "MANDATED", "MERCHANT_REQUESTED", "NONMANDATED", "SOFT_DECLINE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ThreeDsStipulationReasonType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType MANDATED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType MERCHANT_REQUESTED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType NONMANDATED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType SOFT_DECLINE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ThreeDsStipulationReasonType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType("UNKNOWN", 0);
        UNKNOWN = threeDsStipulationReasonType;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType("MANDATED", 1);
        MANDATED = threeDsStipulationReasonType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType("MERCHANT_REQUESTED", 2);
        MERCHANT_REQUESTED = threeDsStipulationReasonType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType("NONMANDATED", 3);
        NONMANDATED = threeDsStipulationReasonType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType threeDsStipulationReasonType5 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType("SOFT_DECLINE", 4);
        SOFT_DECLINE = threeDsStipulationReasonType5;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType[] threeDsStipulationReasonTypeArr = {threeDsStipulationReasonType, threeDsStipulationReasonType2, threeDsStipulationReasonType3, threeDsStipulationReasonType4, threeDsStipulationReasonType5};
        getHighResolutionOutputSizeshNQ4ISI = threeDsStipulationReasonTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(threeDsStipulationReasonTypeArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationReasonType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
