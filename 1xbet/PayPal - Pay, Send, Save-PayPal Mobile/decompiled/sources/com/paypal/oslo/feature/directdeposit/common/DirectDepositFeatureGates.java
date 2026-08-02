package com.paypal.oslo.feature.directdeposit.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/common/DirectDepositFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mainFeature$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getMainFeature", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "mainFeature", "smartRouteEntryPointEnabled$delegate", "getSmartRouteEntryPointEnabled", "smartRouteEntryPointEnabled", "bundleEnrollmentEnabled$delegate", "getBundleEnrollmentEnabled", "bundleEnrollmentEnabled", "earlyAccessEnrolled$delegate", "getEarlyAccessEnrolled", "earlyAccessEnrolled", "fillOutFormEnabled$delegate", "getFillOutFormEnabled", "fillOutFormEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates INSTANCE;

    /* renamed from: bundleEnrollmentEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty bundleEnrollmentEnabled;

    /* renamed from: earlyAccessEnrolled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty earlyAccessEnrolled;

    /* renamed from: fillOutFormEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty fillOutFormEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates.class, "mainFeature", "getMainFeature()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates.class, "smartRouteEntryPointEnabled", "getSmartRouteEntryPointEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates.class, "bundleEnrollmentEnabled", "getBundleEnrollmentEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates.class, "earlyAccessEnrolled", "getEarlyAccessEnrolled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates.class, "fillOutFormEnabled", "getFillOutFormEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: mainFeature$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty mainFeature;

    /* renamed from: smartRouteEntryPointEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty smartRouteEntryPointEnabled;

    private DirectDepositFeatureGates() {
        super(com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig.DOMAIN);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getMainFeature() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) mainFeature.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getSmartRouteEntryPointEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) smartRouteEntryPointEnabled.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getBundleEnrollmentEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) bundleEnrollmentEnabled.getValue(this, getHighSpeedVideoFpsRanges[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getEarlyAccessEnrolled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) earlyAccessEnrolled.getValue(this, getHighSpeedVideoFpsRanges[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFillOutFormEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) fillOutFormEnabled.getValue(this, getHighSpeedVideoFpsRanges[4]);
    }

    static {
        com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates directDepositFeatureGates = new com.paypal.oslo.feature.directdeposit.common.DirectDepositFeatureGates();
        INSTANCE = directDepositFeatureGates;
        mainFeature = directDepositFeatureGates.create("mainfeature");
        smartRouteEntryPointEnabled = directDepositFeatureGates.create(com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig.SMART_ROUTE_FEATURE_KEY);
        bundleEnrollmentEnabled = directDepositFeatureGates.create(com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig.BUNDLE_ENROLLMENT_FEATURE_KEY);
        earlyAccessEnrolled = directDepositFeatureGates.create(com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig.EARLY_ACCESS_ENROLLED_KEY);
        fillOutFormEnabled = directDepositFeatureGates.create(com.paypal.oslo.feature.directdeposit.constants.DirectDepositConstants.RemoteConfig.FILL_OUT_FORM_FEATURE_KEY);
        $stable = 8;
    }
}
