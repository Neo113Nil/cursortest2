package com.paypal.oslo.feature.qrc.domain.model.session;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfigThresholdType;", "", "<init>", "(Ljava/lang/String;I)V", "PERCENTAGE", com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TipConfigThresholdType {
    public static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType AMOUNT;
    public static final com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType PERCENTAGE;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TipConfigThresholdType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType = new com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType("PERCENTAGE", 0);
        PERCENTAGE = tipConfigThresholdType;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType tipConfigThresholdType2 = new com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType(com.zettle.sdk.commons.network.JsonKt.KEY_PAYMENT_AMOUNT, 1);
        AMOUNT = tipConfigThresholdType2;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType[] tipConfigThresholdTypeArr = {tipConfigThresholdType, tipConfigThresholdType2};
        getHighSpeedVideoFpsRangesFor = tipConfigThresholdTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(tipConfigThresholdTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.session.TipConfigThresholdType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
