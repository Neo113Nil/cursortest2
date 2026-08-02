package com.paypal.oslo.feature.taptopay.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/TapToPaySdkInitializerEntryPoint;", "Lcom/paypal/oslo/core/di/CoreEntryPoint;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "sdkInitializer", "()Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfigConfig", "()Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "deviceCapability", "()Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "Lcom/paypal/oslo/feature/taptopay/init/CompanionSyncPolicy;", "companionSyncPolicy", "()Lcom/paypal/oslo/feature/taptopay/init/CompanionSyncPolicy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TapToPaySdkInitializerEntryPoint extends com.paypal.oslo.core.di.CoreEntryPoint {
    com.paypal.oslo.feature.taptopay.init.CompanionSyncPolicy companionSyncPolicy();

    com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability deviceCapability();

    com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig();

    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer();
}
