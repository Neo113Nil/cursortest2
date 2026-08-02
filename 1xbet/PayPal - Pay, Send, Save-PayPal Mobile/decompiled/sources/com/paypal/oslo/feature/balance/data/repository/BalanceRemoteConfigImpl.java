package com.paypal.oslo.feature.balance.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/BalanceRemoteConfigImpl;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "Lcom/paypal/oslo/feature/balance/domain/remoteconfig/BalanceRemoteConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "getBalanceDashboardConfig", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getFeatureGate", "()Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceFeatureGate$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBalanceFeatureGate", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "balanceFeatureGate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceRemoteConfigImpl extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec implements com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig {

    /* renamed from: balanceFeatureGate$delegate, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty balanceFeatureGate;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.balance.data.repository.BalanceRemoteConfigImpl.class, "balanceFeatureGate", "getBalanceFeatureGate()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final int $stable = 8;

    @Override // com.paypal.oslo.feature.balance.domain.remoteconfig.BalanceRemoteConfig
    public final void getBalanceDashboardConfig() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceRemoteConfigImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        super("money_management");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.featureGate = featureGate;
        this.balanceFeatureGate = create("balance");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getFeatureGate() {
        return this.featureGate;
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBalanceFeatureGate() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) this.balanceFeatureGate.getValue(this, Camera2StreamConfigurationMap[0]);
    }
}
