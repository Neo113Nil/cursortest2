package com.paypal.oslo.feature.businesscustomers.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/common/BusinessCustomerFeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isFeatureEnabled", "()Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighResolutionOutputSizeshNQ4ISI", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessCustomerFeatureGateManagerImpl implements com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BusinessCustomerFeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager
    public final boolean isFeatureEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl.FeatureGates.INSTANCE.getCustomersEnabled());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/common/BusinessCustomerFeatureGateManagerImpl$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "customersEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCustomersEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "customersEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl.FeatureGates INSTANCE;

        /* renamed from: customersEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty customersEnabled;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl.FeatureGates.class, "customersEnabled", "getCustomersEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        private FeatureGates() {
            super("seller_profile");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCustomersEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) customersEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        static {
            com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl.FeatureGates featureGates = new com.paypal.oslo.feature.businesscustomers.common.BusinessCustomerFeatureGateManagerImpl.FeatureGates();
            INSTANCE = featureGates;
            customersEnabled = featureGates.create(com.paypal.oslo.feature.businesscustomers.constants.BusinessCustomersConstants.Statsig.CUSTOMERS_ENABLED);
            $stable = 8;
        }
    }
}
