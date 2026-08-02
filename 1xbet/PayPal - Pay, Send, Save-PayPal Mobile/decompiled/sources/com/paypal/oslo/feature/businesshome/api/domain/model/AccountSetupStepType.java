package com.paypal.oslo.feature.businesshome.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIRM_EMAIL", "ADD_BANK_ACCOUNT", "VERIFY_ACCOUNT", "REQUEST_DEBIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountSetupStepType {
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType ADD_BANK_ACCOUNT;
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType CONFIRM_EMAIL;
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType REQUEST_DEBIT_CARD;
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType UNKNOWN;
    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType VERIFY_ACCOUNT;
    private static final /* synthetic */ com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private AccountSetupStepType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType("CONFIRM_EMAIL", 0);
        CONFIRM_EMAIL = accountSetupStepType;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType2 = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType("ADD_BANK_ACCOUNT", 1);
        ADD_BANK_ACCOUNT = accountSetupStepType2;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType3 = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType("VERIFY_ACCOUNT", 2);
        VERIFY_ACCOUNT = accountSetupStepType3;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType4 = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType("REQUEST_DEBIT_CARD", 3);
        REQUEST_DEBIT_CARD = accountSetupStepType4;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType accountSetupStepType5 = new com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType("UNKNOWN", 4);
        UNKNOWN = accountSetupStepType5;
        com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType[] accountSetupStepTypeArr = {accountSetupStepType, accountSetupStepType2, accountSetupStepType3, accountSetupStepType4, accountSetupStepType5};
        getHighResolutionOutputSizeshNQ4ISI = accountSetupStepTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(accountSetupStepTypeArr);
    }

    public static com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType[] values() {
        return (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
