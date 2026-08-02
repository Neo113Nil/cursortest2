package com.paypal.oslo.feature.xoom.domain.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/config/XoomConfigs;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "baseWebsiteUrl$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBaseWebsiteUrl", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "baseWebsiteUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class XoomConfigs extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.xoom.domain.config.XoomConfigs INSTANCE;

    /* renamed from: baseWebsiteUrl$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty baseWebsiteUrl;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.xoom.domain.config.XoomConfigs.class, "baseWebsiteUrl", "getBaseWebsiteUrl()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

    private XoomConfigs() {
        super("xoom", "configs");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getBaseWebsiteUrl() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) baseWebsiteUrl.getValue(this, getHighSpeedVideoFpsRanges[0]);
    }

    static {
        com.paypal.oslo.feature.xoom.domain.config.XoomConfigs xoomConfigs = new com.paypal.oslo.feature.xoom.domain.config.XoomConfigs();
        INSTANCE = xoomConfigs;
        baseWebsiteUrl = com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.create$default(xoomConfigs, "https://embed.xoom.com/", null, 2, null);
        $stable = 8;
    }
}
