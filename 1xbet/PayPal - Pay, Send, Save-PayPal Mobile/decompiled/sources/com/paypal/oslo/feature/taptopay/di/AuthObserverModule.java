package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/AuthObserverModule;", "", "Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLoginObserver;", "impl", "Lcom/paypal/oslo/core/session/LogoutObserver;", "bindLoginObserver", "(Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLoginObserver;)Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLogoutObserver;", "bindLogoutObserver", "(Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPayLogoutObserver;)Lcom/paypal/oslo/core/session/LogoutObserver;", "Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPaySwitchUserObserver;", "bindSwitchUserObserver", "(Lcom/paypal/oslo/feature/taptopay/data/observer/auth/TapToPaySwitchUserObserver;)Lcom/paypal/oslo/core/session/LogoutObserver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface AuthObserverModule {
    @javax.inject.Singleton
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.session.LogoutObserver bindLoginObserver(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLoginObserver impl);

    @javax.inject.Singleton
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.session.LogoutObserver bindLogoutObserver(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPayLogoutObserver impl);

    @javax.inject.Singleton
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.session.LogoutObserver bindSwitchUserObserver(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver impl);
}
