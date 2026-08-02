package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "CONFIRM", "RECONSENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalBankAccessAction {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction ADD;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction CONFIRM;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction RECONSENT;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction[] getHighSpeedVideoSizes;

    private ExternalBankAccessAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction("ADD", 0);
        ADD = externalBankAccessAction;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction2 = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction("CONFIRM", 1);
        CONFIRM = externalBankAccessAction2;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction3 = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction("RECONSENT", 2);
        RECONSENT = externalBankAccessAction3;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction[] externalBankAccessActionArr = {externalBankAccessAction, externalBankAccessAction2, externalBankAccessAction3};
        getHighSpeedVideoSizes = externalBankAccessActionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(externalBankAccessActionArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
