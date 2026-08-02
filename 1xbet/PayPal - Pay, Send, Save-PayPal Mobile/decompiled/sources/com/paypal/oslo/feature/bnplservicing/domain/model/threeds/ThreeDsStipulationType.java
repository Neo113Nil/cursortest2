package com.paypal.oslo.feature.bnplservicing.domain.model.threeds;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/threeds/ThreeDsStipulationType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "CARD_THREE_DS_AUTHENTICATION_REQUIRED", "CARD_THREE_DS_AUTHENTICATION_STEP_UP_REQUIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ThreeDsStipulationType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType CARD_THREE_DS_AUTHENTICATION_REQUIRED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType CARD_THREE_DS_AUTHENTICATION_STEP_UP_REQUIRED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType[] getHighSpeedVideoFpsRanges;

    private ThreeDsStipulationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType threeDsStipulationType = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType("UNKNOWN", 0);
        UNKNOWN = threeDsStipulationType;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType threeDsStipulationType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType("CARD_THREE_DS_AUTHENTICATION_REQUIRED", 1);
        CARD_THREE_DS_AUTHENTICATION_REQUIRED = threeDsStipulationType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType threeDsStipulationType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType("CARD_THREE_DS_AUTHENTICATION_STEP_UP_REQUIRED", 2);
        CARD_THREE_DS_AUTHENTICATION_STEP_UP_REQUIRED = threeDsStipulationType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType[] threeDsStipulationTypeArr = {threeDsStipulationType, threeDsStipulationType2, threeDsStipulationType3};
        getHighSpeedVideoFpsRanges = threeDsStipulationTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(threeDsStipulationTypeArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.threeds.ThreeDsStipulationType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
