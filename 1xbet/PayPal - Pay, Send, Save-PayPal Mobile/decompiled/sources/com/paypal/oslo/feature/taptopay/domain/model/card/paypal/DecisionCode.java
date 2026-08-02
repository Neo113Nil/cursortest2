package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/DecisionCode;", "", "<init>", "(Ljava/lang/String;I)V", "APPROVED", "DECLINED", "STEPUP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DecisionCode {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode APPROVED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode DECLINED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode STEPUP;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DecisionCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode("APPROVED", 0);
        APPROVED = decisionCode;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode("DECLINED", 1);
        DECLINED = decisionCode2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode decisionCode3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode("STEPUP", 2);
        STEPUP = decisionCode3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode[] decisionCodeArr = {decisionCode, decisionCode2, decisionCode3};
        getHighSpeedVideoFpsRangesFor = decisionCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(decisionCodeArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.DecisionCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
