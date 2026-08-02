package com.paypal.oslo.feature.taptopay.ui.setup.flow.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/model/TokenizationErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "INIT_CHECK_FAILED", "PREPARE_ADD_CARD_ERROR", "ELIGIBILITY_CHECK_FAILED", "USER_DECLINED_TERMS", "DIGITIZATION_FAILED", "ACTIVATION_FAILED", "CARD_NOT_FOUND", "RISK_DECLINED", "THREE_DS_ERROR", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenizationErrorType {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType ACTIVATION_FAILED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType CARD_NOT_FOUND;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType DIGITIZATION_FAILED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType ELIGIBILITY_CHECK_FAILED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType GENERIC_ERROR;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType INIT_CHECK_FAILED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType PREPARE_ADD_CARD_ERROR;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType RISK_DECLINED;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType THREE_DS_ERROR;
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType USER_DECLINED_TERMS;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private TokenizationErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("INIT_CHECK_FAILED", 0);
        INIT_CHECK_FAILED = tokenizationErrorType;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType2 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("PREPARE_ADD_CARD_ERROR", 1);
        PREPARE_ADD_CARD_ERROR = tokenizationErrorType2;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType3 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("ELIGIBILITY_CHECK_FAILED", 2);
        ELIGIBILITY_CHECK_FAILED = tokenizationErrorType3;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType4 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("USER_DECLINED_TERMS", 3);
        USER_DECLINED_TERMS = tokenizationErrorType4;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType5 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("DIGITIZATION_FAILED", 4);
        DIGITIZATION_FAILED = tokenizationErrorType5;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType6 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("ACTIVATION_FAILED", 5);
        ACTIVATION_FAILED = tokenizationErrorType6;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType7 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("CARD_NOT_FOUND", 6);
        CARD_NOT_FOUND = tokenizationErrorType7;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType8 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("RISK_DECLINED", 7);
        RISK_DECLINED = tokenizationErrorType8;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType9 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType("THREE_DS_ERROR", 8);
        THREE_DS_ERROR = tokenizationErrorType9;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType tokenizationErrorType10 = new com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 9);
        GENERIC_ERROR = tokenizationErrorType10;
        com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType[] tokenizationErrorTypeArr = {tokenizationErrorType, tokenizationErrorType2, tokenizationErrorType3, tokenizationErrorType4, tokenizationErrorType5, tokenizationErrorType6, tokenizationErrorType7, tokenizationErrorType8, tokenizationErrorType9, tokenizationErrorType10};
        getHighResolutionOutputSizeshNQ4ISI = tokenizationErrorTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(tokenizationErrorTypeArr);
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.setup.flow.model.TokenizationErrorType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
