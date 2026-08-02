package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/RevolvingCreditDynamicConfigSpec;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "secondaryActionsOrder$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getSecondaryActionsOrder", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "secondaryActionsOrder", "", "preApprovalRequired$delegate", "getPreApprovalRequired", "preApprovalRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditDynamicConfigSpec extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec.class, "secondaryActionsOrder", "getSecondaryActionsOrder()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec.class, "preApprovalRequired", "getPreApprovalRequired()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: preApprovalRequired$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty preApprovalRequired;

    /* renamed from: secondaryActionsOrder$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty secondaryActionsOrder;

    private RevolvingCreditDynamicConfigSpec() {
        super("revolvingcreditservicing", "testconfig");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.util.List<java.lang.String>> getSecondaryActionsOrder() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) secondaryActionsOrder.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Boolean> getPreApprovalRequired() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) preApprovalRequired.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec revolvingCreditDynamicConfigSpec = new com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec();
        INSTANCE = revolvingCreditDynamicConfigSpec;
        secondaryActionsOrder = revolvingCreditDynamicConfigSpec.create(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"statements", "payments", com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.MANAGE_ACCOUNT_PREFIX}), "secondary_actions_order");
        preApprovalRequired = revolvingCreditDynamicConfigSpec.create(java.lang.Boolean.TRUE, "pre_approval_required");
        $stable = 8;
    }
}
