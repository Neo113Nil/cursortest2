package com.paypal.oslo.core.remoteconfig.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/di/RemoteConfigInitializerEntryPoint;", "Lcom/paypal/oslo/core/di/CoreEntryPoint;", "Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecAutoRegistrar;", "autoRegistrar", "()Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecAutoRegistrar;", "Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;", "overrideManager", "()Lcom/paypal/oslo/core/remoteconfig/companion/StatsigOverrideManager;", "Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "getStatsigWrapper", "()Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getRemoteConfigConfig", "()Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "Lcom/paypal/oslo/core/userstore/UserStore;", "getUserStore", "()Lcom/paypal/oslo/core/userstore/UserStore;", "Lcom/paypal/oslo/core/remoteconfig/RemoteConfigUserObserver;", "getRemoteConfigUserObserver", "()Lcom/paypal/oslo/core/remoteconfig/RemoteConfigUserObserver;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getAppIdentity", "()Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RemoteConfigInitializerEntryPoint extends com.paypal.oslo.core.di.CoreEntryPoint {
    com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecAutoRegistrar autoRegistrar();

    com.paypal.oslo.core.appidentity.domain.AppIdentity getAppIdentity();

    com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getRemoteConfigConfig();

    com.paypal.oslo.core.remoteconfig.RemoteConfigUserObserver getRemoteConfigUserObserver();

    com.paypal.oslo.core.remoteconfig.StatsigWrapper getStatsigWrapper();

    com.paypal.oslo.core.userstore.UserStore getUserStore();

    com.paypal.oslo.core.remoteconfig.companion.StatsigOverrideManager overrideManager();
}
