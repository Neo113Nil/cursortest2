package com.paypal.oslo.feature.dataprivacy.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyNativeDownloadSpec;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "enabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "enabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyNativeDownloadSpec extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyNativeDownloadSpec.class, "enabled", "getEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
    public static final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyNativeDownloadSpec INSTANCE;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty enabled;

    private DataPrivacyNativeDownloadSpec() {
        super("data_privacy", "dar_native_download_enabled");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.String> getEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) enabled.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    static {
        com.paypal.oslo.feature.dataprivacy.config.DataPrivacyNativeDownloadSpec dataPrivacyNativeDownloadSpec = new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyNativeDownloadSpec();
        INSTANCE = dataPrivacyNativeDownloadSpec;
        enabled = dataPrivacyNativeDownloadSpec.create("true", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        $stable = 8;
    }
}
