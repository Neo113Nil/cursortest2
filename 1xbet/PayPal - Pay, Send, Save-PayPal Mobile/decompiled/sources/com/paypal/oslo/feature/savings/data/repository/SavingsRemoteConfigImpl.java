package com.paypal.oslo.feature.savings.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0015\u0010\n\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/data/repository/SavingsRemoteConfigImpl;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRemoteConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "remoteConfig", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isSavingsFeatureAvailable", "()Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/properties/ReadOnlyProperty;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsRemoteConfigImpl extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec implements com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.properties.ReadOnlyProperty Camera2StreamConfigurationMap;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.savings.data.repository.SavingsRemoteConfigImpl.class, "savingsFeatureGate", "getSavingsFeatureGate()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public SavingsRemoteConfigImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        super("money_management");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = featureGate;
        this.Camera2StreamConfigurationMap = create("savings");
    }

    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig
    public final boolean isSavingsFeatureAvailable() {
        return this.getHighSpeedVideoSizes.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) this.Camera2StreamConfigurationMap.getValue(this, getHighSpeedVideoSizes[0]));
    }
}
