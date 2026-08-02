package com.paypal.oslo.feature.verificationcapture.common;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/common/VerificationCaptureDynamicConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "twoSidedCapture$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getTwoSidedCapture", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "twoSidedCapture"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureDynamicConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureDynamicConfigs INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureDynamicConfigs.class, "twoSidedCapture", "getTwoSidedCapture()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    /* renamed from: twoSidedCapture$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty twoSidedCapture;

    private VerificationCaptureDynamicConfigs() {
        super("verification-capture", "config");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getTwoSidedCapture() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) twoSidedCapture.getValue(this, getHighSpeedVideoSizes[0]);
    }

    static {
        com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureDynamicConfigs verificationCaptureDynamicConfigs = new com.paypal.oslo.feature.verificationcapture.common.VerificationCaptureDynamicConfigs();
        INSTANCE = verificationCaptureDynamicConfigs;
        twoSidedCapture = verificationCaptureDynamicConfigs.create("", "two_sided_capture");
        $stable = 8;
    }
}
