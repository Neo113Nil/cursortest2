package com.paypal.oslo.feature.businessprofile.common.featuregate;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/common/featuregate/BusinessProfileFeatureGatesManagerImpl;", "Lcom/paypal/oslo/feature/businessprofile/api/common/featuregate/BusinessProfileFeatureGatesManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isBusinessProfileAvailable", "()Z", "isInquiriesAvailable", "isBusinessProfileEnabled", "isInquiriesEnabled", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessProfileFeatureGatesManagerImpl implements com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BusinessProfileFeatureGatesManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager
    public final boolean isBusinessProfileAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.INSTANCE.getBusinessProfileAvailable());
    }

    @Override // com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager
    public final boolean isInquiriesAvailable() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.INSTANCE.getInquiriesAvailable());
    }

    @Override // com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager
    public final boolean isBusinessProfileEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.INSTANCE.getBusinessProfileEnabled());
    }

    @Override // com.paypal.oslo.feature.businessprofile.api.common.featuregate.BusinessProfileFeatureGatesManager
    public final boolean isInquiriesEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.INSTANCE.getInquiriesEnabled());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessprofile/common/featuregate/BusinessProfileFeatureGatesManagerImpl$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "businessProfileAvailable$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBusinessProfileAvailable", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "businessProfileAvailable", "inquiriesAvailable$delegate", "getInquiriesAvailable", "inquiriesAvailable", "businessProfileEnabled$delegate", "getBusinessProfileEnabled", "businessProfileEnabled", "inquiriesEnabled$delegate", "getInquiriesEnabled", "inquiriesEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates INSTANCE;

        /* renamed from: businessProfileAvailable$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty businessProfileAvailable;

        /* renamed from: businessProfileEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty businessProfileEnabled;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.class, "businessProfileAvailable", "getBusinessProfileAvailable()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.class, "inquiriesAvailable", "getInquiriesAvailable()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.class, "businessProfileEnabled", "getBusinessProfileEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates.class, "inquiriesEnabled", "getInquiriesEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        /* renamed from: inquiriesAvailable$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty inquiriesAvailable;

        /* renamed from: inquiriesEnabled$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty inquiriesEnabled;

        private FeatureGates() {
            super("seller_profile");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBusinessProfileAvailable() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) businessProfileAvailable.getValue(this, getHighSpeedVideoFpsRanges[0]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getInquiriesAvailable() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) inquiriesAvailable.getValue(this, getHighSpeedVideoFpsRanges[1]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBusinessProfileEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) businessProfileEnabled.getValue(this, getHighSpeedVideoFpsRanges[2]);
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getInquiriesEnabled() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) inquiriesEnabled.getValue(this, getHighSpeedVideoFpsRanges[3]);
        }

        static {
            com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates featureGates = new com.paypal.oslo.feature.businessprofile.common.featuregate.BusinessProfileFeatureGatesManagerImpl.FeatureGates();
            INSTANCE = featureGates;
            businessProfileAvailable = featureGates.create(com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Statsig.BUSINESS_PROFILE_AVAILABLE);
            inquiriesAvailable = featureGates.create(com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Statsig.INQUIRIES_AVAILABLE);
            businessProfileEnabled = featureGates.create(com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Statsig.BUSINESS_PROFILE_ENABLED);
            inquiriesEnabled = featureGates.create(com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Statsig.INQUIRIES_ENABLED);
            $stable = 8;
        }
    }
}
