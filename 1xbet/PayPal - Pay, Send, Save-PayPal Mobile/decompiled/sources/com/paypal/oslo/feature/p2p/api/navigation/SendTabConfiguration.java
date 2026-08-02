package com.paypal.oslo.feature.p2p.api.navigation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/api/navigation/SendTabConfiguration;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "tabs", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Landroidx/navigation3/runtime/NavKey;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Landroidx/navigation3/runtime/NavKey;", "getDefault", "()Landroidx/navigation3/runtime/NavKey;", "", "PARENT_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SendTabConfiguration {
    public static final int $stable;
    public static final com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration INSTANCE = new com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration();
    public static final java.lang.String PARENT_NAME = "Send";
    private static final androidx.navigation3.runtime.NavKey default;
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs;

    private SendTabConfiguration() {
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabs() {
        return tabs;
    }

    static {
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, "", null, 4, null));
        tabs = listOf;
        default = ((com.paypal.oslo.core.navigation.ui.l1.TabDestination) kotlin.collections.CollectionsKt.first((java.util.List) listOf)).getDestination();
        $stable = 8;
    }

    public final androidx.navigation3.runtime.NavKey getDefault() {
        return default;
    }
}
