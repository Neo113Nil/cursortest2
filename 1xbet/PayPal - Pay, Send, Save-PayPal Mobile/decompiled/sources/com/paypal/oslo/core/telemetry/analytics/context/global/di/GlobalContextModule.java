package com.paypal.oslo.core.telemetry.analytics.context.global.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/di/GlobalContextModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/ApplicationContextProvider;", "provider", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "provideApplicationContextProvider", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/ApplicationContextProvider;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/UserContextProvider;", "provideUserContextProvider", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/UserContextProvider;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/DeviceInfoContextProvider;", "provideDeviceInfoContextProvider", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/DeviceInfoContextProvider;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/SessionLaunchTrafficSourceContextProvider;", "provideSessionLaunchSourceContextProvider", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/SessionLaunchTrafficSourceContextProvider;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/VeniceContextProvider;", "provideVeniceContextProvider", "(Lcom/paypal/oslo/core/telemetry/analytics/context/global/VeniceContextProvider;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class GlobalContextModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule INSTANCE = new com.paypal.oslo.core.telemetry.analytics.context.global.di.GlobalContextModule();

    private GlobalContextModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideApplicationContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.ApplicationContextProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideUserContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideDeviceInfoContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.DeviceInfoContextProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideSessionLaunchSourceContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.SessionLaunchTrafficSourceContextProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider;
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.context.ContextProvider provideVeniceContextProvider(com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return provider;
    }
}
