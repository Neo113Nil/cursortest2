package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/RemoveWalletAction;", "", "<init>", "(Ljava/lang/String;I)V", com.knotapi.knot.utilities.Constants.META_CLOSE, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "Confirm"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveWalletAction {
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction Cancel;
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction Close;
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction Confirm;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction[] getHighSpeedVideoSizes;

    static {
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction removeWalletAction = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction(com.knotapi.knot.utilities.Constants.META_CLOSE, 0);
        Close = removeWalletAction;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction removeWalletAction2 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, 1);
        Cancel = removeWalletAction2;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction removeWalletAction3 = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction("Confirm", 2);
        Confirm = removeWalletAction3;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction[] removeWalletActionArr = {removeWalletAction, removeWalletAction2, removeWalletAction3};
        getHighSpeedVideoSizes = removeWalletActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(removeWalletActionArr);
    }

    private RemoveWalletAction(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
