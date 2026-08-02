package com.paypal.oslo.feature.controlcenter.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/remoteconfig/ControlCenterFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "accountSwitchEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getAccountSwitchEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "accountSwitchEnabled", "updatePhotoEnabled$delegate", "getUpdatePhotoEnabled", "updatePhotoEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates INSTANCE;

    /* renamed from: accountSwitchEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty accountSwitchEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates.class, "accountSwitchEnabled", "getAccountSwitchEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates.class, "updatePhotoEnabled", "getUpdatePhotoEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: updatePhotoEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty updatePhotoEnabled;

    private ControlCenterFeatureGates() {
        super(com.paypal.oslo.feature.controlcenter.domain.constants.ControlCenterConstants.RemoteConfig.DOMAIN);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAccountSwitchEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) accountSwitchEnabled.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getUpdatePhotoEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) updatePhotoEnabled.getValue(this, getHighSpeedVideoFpsRanges[1]);
    }

    static {
        com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates controlCenterFeatureGates = new com.paypal.oslo.feature.controlcenter.remoteconfig.ControlCenterFeatureGates();
        INSTANCE = controlCenterFeatureGates;
        accountSwitchEnabled = controlCenterFeatureGates.create(com.paypal.oslo.feature.controlcenter.domain.constants.ControlCenterConstants.RemoteConfig.ACCOUNT_SWITCH_ENABLED_KEY);
        updatePhotoEnabled = controlCenterFeatureGates.create(com.paypal.oslo.feature.controlcenter.domain.constants.ControlCenterConstants.RemoteConfig.UPDATE_PHOTO_ENABLED_KEY);
        $stable = 8;
    }
}
