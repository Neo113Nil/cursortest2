package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "TERMINAL_ERROR", "NO_ELIGIBLE_CARDS", "RISK_STEP_UP_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiSelectorErrorType {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType NO_ELIGIBLE_CARDS;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType RISK_STEP_UP_FAILED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType TERMINAL_ERROR;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType[] getHighSpeedVideoFpsRangesFor;

    private FiSelectorErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType("TERMINAL_ERROR", 0);
        TERMINAL_ERROR = fiSelectorErrorType;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType2 = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType("NO_ELIGIBLE_CARDS", 1);
        NO_ELIGIBLE_CARDS = fiSelectorErrorType2;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType fiSelectorErrorType3 = new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType("RISK_STEP_UP_FAILED", 2);
        RISK_STEP_UP_FAILED = fiSelectorErrorType3;
        com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType[] fiSelectorErrorTypeArr = {fiSelectorErrorType, fiSelectorErrorType2, fiSelectorErrorType3};
        getHighSpeedVideoFpsRangesFor = fiSelectorErrorTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fiSelectorErrorTypeArr);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSelectorErrorType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
