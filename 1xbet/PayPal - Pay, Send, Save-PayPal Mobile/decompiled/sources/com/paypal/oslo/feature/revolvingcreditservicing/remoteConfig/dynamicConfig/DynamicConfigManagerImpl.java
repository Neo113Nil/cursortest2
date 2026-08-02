package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManagerImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "", "secondaryActionsOrder", "()Ljava/util/List;", "", "preApprovalRequired", "()Z", "shouldRequestAppUpdate", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicConfigManagerImpl implements com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager
    public final boolean shouldRequestAppUpdate() {
        return false;
    }

    @javax.inject.Inject
    public DynamicConfigManagerImpl(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoSizes = dynamicConfiguration;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager
    public final java.util.List<java.lang.String> secondaryActionsOrder() {
        return (java.util.List) this.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec.INSTANCE.getSecondaryActionsOrder());
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager
    public final boolean preApprovalRequired() {
        return ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.RevolvingCreditDynamicConfigSpec.INSTANCE.getPreApprovalRequired())).booleanValue();
    }
}
