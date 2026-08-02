package com.paypal.oslo.feature.savings.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/common/SavingsDynamicConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "hysBetaOptOutUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getHysBetaOptOutUrl", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "hysBetaOptOutUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsDynamicConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.savings.common.SavingsDynamicConfigs INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.common.SavingsDynamicConfigs.class, "hysBetaOptOutUrl", "getHysBetaOptOutUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: hysBetaOptOutUrl$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty hysBetaOptOutUrl;

    private SavingsDynamicConfigs() {
        super("money_management", "hys_beta_opt_out_url");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getHysBetaOptOutUrl() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) hysBetaOptOutUrl.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    static {
        com.paypal.oslo.feature.savings.common.SavingsDynamicConfigs savingsDynamicConfigs = new com.paypal.oslo.feature.savings.common.SavingsDynamicConfigs();
        INSTANCE = savingsDynamicConfigs;
        hysBetaOptOutUrl = savingsDynamicConfigs.create("", "beta_opt_out_url");
        $stable = 8;
    }
}
