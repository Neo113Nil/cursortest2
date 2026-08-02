package com.paypal.oslo.feature.businessinventory.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/common/BusinessInventoryFeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isFeatureAvailable", "()Z", "isFeatureEnabled", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighResolutionOutputSizeshNQ4ISI", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryFeatureGateManagerImpl implements com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BusinessInventoryFeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    @Override // com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager
    public final boolean isFeatureAvailable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates.INSTANCE.getFeatureAvailable());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/common/BusinessInventoryFeatureGateManagerImpl$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureAvailable$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFeatureAvailable", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureAvailable", "featureEnabled$delegate", "getFeatureEnabled", "featureEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates INSTANCE;

        /* renamed from: featureAvailable$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty featureAvailable;

        /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty featureEnabled;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates.class, "featureAvailable", "getFeatureAvailable()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        private FeatureGates() {
            super("seller_profile");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureAvailable() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureAvailable.getValue(this, getHighSpeedVideoSizes[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, getHighSpeedVideoSizes[1]);
        }

        static {
            com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates featureGates = new com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates();
            INSTANCE = featureGates;
            featureAvailable = featureGates.create("business_inventory_available");
            featureEnabled = featureGates.create("business_inventory_enabled");
            $stable = 8;
        }
    }

    @Override // com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager
    public final boolean isFeatureEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.businessinventory.common.BusinessInventoryFeatureGateManagerImpl.FeatureGates.INSTANCE.getFeatureEnabled());
    }
}
