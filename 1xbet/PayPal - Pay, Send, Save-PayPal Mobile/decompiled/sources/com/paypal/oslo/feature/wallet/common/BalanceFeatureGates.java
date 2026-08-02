package com.paypal.oslo.feature.wallet.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/BalanceFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceAddMoneyEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBalanceAddMoneyEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceAddMoneyEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BalanceFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.common.BalanceFeatureGates INSTANCE;

    /* renamed from: balanceAddMoneyEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty balanceAddMoneyEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.wallet.common.BalanceFeatureGates.class, "balanceAddMoneyEnabled", "getBalanceAddMoneyEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    private BalanceFeatureGates() {
        super("money_management");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBalanceAddMoneyEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) balanceAddMoneyEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    static {
        com.paypal.oslo.feature.wallet.common.BalanceFeatureGates balanceFeatureGates = new com.paypal.oslo.feature.wallet.common.BalanceFeatureGates();
        INSTANCE = balanceFeatureGates;
        balanceAddMoneyEnabled = balanceFeatureGates.create(com.paypal.oslo.feature.balance.common.BalanceConstants.RemoteConfig.ADD_MONEY_KEY_NAME);
        $stable = 8;
    }
}
