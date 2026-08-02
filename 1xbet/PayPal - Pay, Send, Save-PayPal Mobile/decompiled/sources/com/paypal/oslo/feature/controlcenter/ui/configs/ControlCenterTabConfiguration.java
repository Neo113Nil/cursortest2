package com.paypal.oslo.feature.controlcenter.ui.configs;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR$\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/configs/ControlCenterTabConfiguration;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;", "accountType", "", "Lcom/paypal/oslo/core/navigation/ui/l1/TabDestination;", "getTabsForAccountType", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/AccountType;)Ljava/util/List;", "tabsPersonal", "Ljava/util/List;", "getTabsPersonal", "()Ljava/util/List;", "tabsBusiness", "getTabsBusiness", "tabsPremier", "getTabsPremier", "", "Lkotlin/reflect/KClass;", "allTabDestinationTypes", "Ljava/util/Set;", "getAllTabDestinationTypes", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterTabConfiguration {
    public static final int $stable;
    public static final com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration INSTANCE = new com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration();
    private static final java.util.Set<kotlin.reflect.KClass<?>> allTabDestinationTypes;
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabsBusiness;
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabsPersonal;
    private static final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabsPremier;

    private ControlCenterTabConfiguration() {
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabsPersonal() {
        return tabsPersonal;
    }

    static {
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.navigation.ui.l1.TabDestination[]{new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE, "feature_control_center_tab_wallet", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_activity", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_subscriptions", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE, "feature_control_center_tab_settings", null, 4, null)});
        tabsPersonal = listOf;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.navigation.ui.l1.TabDestination[]{new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE, "feature_control_center_tab_wallet", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_activity", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.businessprofile.api.navigation.BusinessProfileSalesToolsDestination.INSTANCE, "feature_control_center_tab_sales_tools", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_subscriptions", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE, "feature_control_center_tab_settings", null, 4, null)});
        tabsBusiness = listOf2;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> listOf3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.navigation.ui.l1.TabDestination[]{new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE, "feature_control_center_tab_wallet", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_activity", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), "feature_control_center_tab_subscriptions", null, 4, null), new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE, "feature_control_center_tab_settings", null, 4, null)});
        tabsPremier = listOf3;
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) listOf2), (java.lang.Iterable) listOf3);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.core.navigation.ui.l1.TabDestination) it.next()).getDestination().getClass()));
        }
        allTabDestinationTypes = kotlin.collections.CollectionsKt.toSet(arrayList);
        $stable = 8;
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabsBusiness() {
        return tabsBusiness;
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabsPremier() {
        return tabsPremier;
    }

    public final java.util.Set<kotlin.reflect.KClass<?>> getAllTabDestinationTypes() {
        return allTabDestinationTypes;
    }

    public final java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> getTabsForAccountType(com.paypal.oslo.feature.controlcenter.domain.model.AccountType accountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        int i = com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration.WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()];
        if (i == 1) {
            return tabsBusiness;
        }
        if (i == 2) {
            return tabsPremier;
        }
        if (i == 3) {
            return tabsPersonal;
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.navigation.ui.l1.TabDestination(com.paypal.oslo.feature.wallet.api.navigation.AccountsDestination.INSTANCE, "feature_control_center_tab_wallet", null, 4, null));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.controlcenter.domain.model.AccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.controlcenter.domain.model.AccountType.BUSINESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.controlcenter.domain.model.AccountType.PREMIER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.controlcenter.domain.model.AccountType.PERSONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
