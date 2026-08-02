package com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/remoteconfig/values/MultichainAssetsConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MultichainAssetsConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig.class, "multichainAssets", "getMultichainAssets()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
    public static final com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig INSTANCE;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;

    private MultichainAssetsConfig() {
        super("cryptocurrency", "multichain_assets");
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig multichainAssetsConfig = new com.paypal.oslo.feature.cryptocurrency.data.remoteconfig.values.MultichainAssetsConfig();
        INSTANCE = multichainAssetsConfig;
        getHighSpeedVideoFpsRangesFor = multichainAssetsConfig.create(new java.lang.String[0], "multichainAssets");
    }
}
