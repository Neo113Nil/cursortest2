package com.paypal.oslo.feature.businesshome.common.featuregate;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/common/featuregate/BusinessHomeFeatureGatesManager;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isBusinessExperienceAvailable", "()Z", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRangesFor", "Companion", "FeatureGates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessHomeFeatureGatesManager {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public BusinessHomeFeatureGatesManager(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
    }

    public final boolean isBusinessExperienceAvailable() {
        return this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager.FeatureGates.INSTANCE.getBusinessExperienceKey$business_home_prodRelease());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048AX\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/common/featuregate/BusinessHomeFeatureGatesManager$FeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "businessExperienceKey$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBusinessExperienceKey$business_home_prodRelease", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "businessExperienceKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
        public static final int $stable;
        public static final com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager.FeatureGates INSTANCE;

        /* renamed from: businessExperienceKey$delegate, reason: from kotlin metadata */
        private static final kotlin.properties.ReadOnlyProperty businessExperienceKey;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager.FeatureGates.class, "businessExperienceKey", "getBusinessExperienceKey$business_home_prodRelease()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

        private FeatureGates() {
            super("businesshome");
        }

        public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBusinessExperienceKey$business_home_prodRelease() {
            return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) businessExperienceKey.getValue(this, getHighSpeedVideoSizes[0]);
        }

        static {
            com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager.FeatureGates featureGates = new com.paypal.oslo.feature.businesshome.common.featuregate.BusinessHomeFeatureGatesManager.FeatureGates();
            INSTANCE = featureGates;
            businessExperienceKey = featureGates.create("business_experience");
            $stable = 8;
        }
    }
}
