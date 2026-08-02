package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/app/navigation/MeTabConfiguration;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "tabs", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Landroidx/navigation3/runtime/NavKey;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Landroidx/navigation3/runtime/NavKey;", "getDefault", "()Landroidx/navigation3/runtime/NavKey;", "", "PARENT_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MeTabConfiguration {
    public static final int $stable;
    public static final com.paypal.oslo.app.navigation.MeTabConfiguration INSTANCE = new com.paypal.oslo.app.navigation.MeTabConfiguration();
    public static final java.lang.String PARENT_NAME = "Me";
    private static final androidx.navigation3.runtime.NavKey default;
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabs;

    private MeTabConfiguration() {
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabs() {
        return tabs;
    }

    static {
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.navigation.ui.l1.TabDestination[]{new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.core.navigation.MeWalletDestination.INSTANCE, "Wallet", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.core.navigation.MeActivityDestination.INSTANCE, lib.android.paypal.com.magnessdk.c.b.i, null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.core.navigation.MeSubsDestination.INSTANCE, "Subs", null, 4, null)});
        tabs = listOf;
        default = ((com.paypal.oslo.core.navigation.ui.l1.TabDestination) kotlin.collections.CollectionsKt.first((java.util.List) listOf)).getDestination();
        $stable = 8;
    }

    public final androidx.navigation3.runtime.NavKey getDefault() {
        return default;
    }
}
