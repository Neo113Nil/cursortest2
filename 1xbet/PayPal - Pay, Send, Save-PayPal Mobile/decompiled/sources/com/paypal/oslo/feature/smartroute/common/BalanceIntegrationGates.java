package com.paypal.oslo.feature.smartroute.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/common/BalanceIntegrationGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceL2SmartRoute$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBalanceL2SmartRoute", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceL2SmartRoute"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BalanceIntegrationGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.smartroute.common.BalanceIntegrationGates INSTANCE;

    /* renamed from: balanceL2SmartRoute$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty balanceL2SmartRoute;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.smartroute.common.BalanceIntegrationGates.class, "balanceL2SmartRoute", "getBalanceL2SmartRoute()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    private BalanceIntegrationGates() {
        super("money_management");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBalanceL2SmartRoute() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) balanceL2SmartRoute.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    static {
        com.paypal.oslo.feature.smartroute.common.BalanceIntegrationGates balanceIntegrationGates = new com.paypal.oslo.feature.smartroute.common.BalanceIntegrationGates();
        INSTANCE = balanceIntegrationGates;
        balanceL2SmartRoute = balanceIntegrationGates.create("balance_l2_smart_route");
        $stable = 8;
    }
}
