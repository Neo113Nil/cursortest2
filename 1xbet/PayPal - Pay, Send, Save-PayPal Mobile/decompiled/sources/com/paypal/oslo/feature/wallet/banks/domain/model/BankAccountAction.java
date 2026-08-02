package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAction;", "", "<init>", "(Ljava/lang/String;I)V", "ADDED", "CONFIRMED", "ADD_BANK_FAILED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountAction {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction ADDED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction ADD_BANK_FAILED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction CONFIRMED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private BankAccountAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction("ADDED", 0);
        ADDED = bankAccountAction;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction2 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction("CONFIRMED", 1);
        CONFIRMED = bankAccountAction2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction3 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction("ADD_BANK_FAILED", 2);
        ADD_BANK_FAILED = bankAccountAction3;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction4 = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction("UNKNOWN", 3);
        UNKNOWN = bankAccountAction4;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction[] bankAccountActionArr = {bankAccountAction, bankAccountAction2, bankAccountAction3, bankAccountAction4};
        getHighResolutionOutputSizeshNQ4ISI = bankAccountActionArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountActionArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
