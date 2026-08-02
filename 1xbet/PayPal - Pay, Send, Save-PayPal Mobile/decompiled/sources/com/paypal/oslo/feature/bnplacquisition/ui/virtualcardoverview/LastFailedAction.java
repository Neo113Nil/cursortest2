package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/LastFailedAction;", "", "<init>", "(Ljava/lang/String;I)V", "FETCH_IN_STORE_VCC_DETAILS", "PREPARE_DIGITIZATION", "FETCH_PROVISIONED_CARD_OVERVIEW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LastFailedAction {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction FETCH_IN_STORE_VCC_DETAILS;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction FETCH_PROVISIONED_CARD_OVERVIEW;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction PREPARE_DIGITIZATION;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private LastFailedAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction("FETCH_IN_STORE_VCC_DETAILS", 0);
        FETCH_IN_STORE_VCC_DETAILS = lastFailedAction;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction2 = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction("PREPARE_DIGITIZATION", 1);
        PREPARE_DIGITIZATION = lastFailedAction2;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction lastFailedAction3 = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction("FETCH_PROVISIONED_CARD_OVERVIEW", 2);
        FETCH_PROVISIONED_CARD_OVERVIEW = lastFailedAction3;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction[] lastFailedActionArr = {lastFailedAction, lastFailedAction2, lastFailedAction3};
        getHighSpeedVideoFpsRanges = lastFailedActionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(lastFailedActionArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
