package com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/debitpin/model/SetDebitPinFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "ONBOARDING", "REBOARDING", "STANDALONE", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SetDebitPinFlowType {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType ONBOARDING;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType OTHER;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType REBOARDING;
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType STANDALONE;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private SetDebitPinFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType = new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType("ONBOARDING", 0);
        ONBOARDING = setDebitPinFlowType;
        com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType2 = new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType("REBOARDING", 1);
        REBOARDING = setDebitPinFlowType2;
        com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType3 = new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType("STANDALONE", 2);
        STANDALONE = setDebitPinFlowType3;
        com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType setDebitPinFlowType4 = new com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType("OTHER", 3);
        OTHER = setDebitPinFlowType4;
        com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType[] setDebitPinFlowTypeArr = {setDebitPinFlowType, setDebitPinFlowType2, setDebitPinFlowType3, setDebitPinFlowType4};
        getHighResolutionOutputSizeshNQ4ISI = setDebitPinFlowTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(setDebitPinFlowTypeArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
