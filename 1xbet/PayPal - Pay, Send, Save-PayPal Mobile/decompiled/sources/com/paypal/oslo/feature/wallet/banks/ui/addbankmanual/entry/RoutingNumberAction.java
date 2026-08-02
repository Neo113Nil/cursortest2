package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/entry/RoutingNumberAction;", "", "<init>", "(Ljava/lang/String;I)V", "FETCH_DETAILS", "CLEAR_DETAILS", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RoutingNumberAction {
    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction CLEAR_DETAILS;
    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction FETCH_DETAILS;
    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction NONE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction[] getHighSpeedVideoSizes;

    private RoutingNumberAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction routingNumberAction = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction("FETCH_DETAILS", 0);
        FETCH_DETAILS = routingNumberAction;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction routingNumberAction2 = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction("CLEAR_DETAILS", 1);
        CLEAR_DETAILS = routingNumberAction2;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction routingNumberAction3 = new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction("NONE", 2);
        NONE = routingNumberAction3;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction[] routingNumberActionArr = {routingNumberAction, routingNumberAction2, routingNumberAction3};
        getHighSpeedVideoSizes = routingNumberActionArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(routingNumberActionArr);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction[] values() {
        return (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.RoutingNumberAction> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
