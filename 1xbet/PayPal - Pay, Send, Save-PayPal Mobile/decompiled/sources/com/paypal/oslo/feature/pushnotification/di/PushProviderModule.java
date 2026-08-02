package com.paypal.oslo.feature.pushnotification.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/di/PushProviderModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProviderImpl;", "deviceIdProviderImpl", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;", "provideDeviceIdProvider$push_notification_prodRelease", "(Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProviderImpl;)Lcom/paypal/oslo/feature/pushnotification/shared/domain/provider/DeviceIdProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class PushProviderModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.pushnotification.di.PushProviderModule INSTANCE = new com.paypal.oslo.feature.pushnotification.di.PushProviderModule();

    private PushProviderModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProvider provideDeviceIdProvider$push_notification_prodRelease(com.paypal.oslo.feature.pushnotification.shared.domain.provider.DeviceIdProviderImpl deviceIdProviderImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceIdProviderImpl, "");
        return deviceIdProviderImpl;
    }
}
