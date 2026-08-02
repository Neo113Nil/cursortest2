package com.paypal.oslo.app.identity;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/identity/LogoutModule;", "", "Lcom/paypal/oslo/app/identity/LogoutCoordinatorImpl;", "impl", "Lcom/paypal/oslo/core/session/LogoutCoordinator;", "bindLogoutCoordinator", "(Lcom/paypal/oslo/app/identity/LogoutCoordinatorImpl;)Lcom/paypal/oslo/core/session/LogoutCoordinator;", "Lcom/paypal/oslo/app/identity/AuthNavigationCacheClearer;", "Lcom/paypal/oslo/core/session/LogoutObserver;", "bindAuthNavigationCacheClearer", "(Lcom/paypal/oslo/app/identity/AuthNavigationCacheClearer;)Lcom/paypal/oslo/core/session/LogoutObserver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface LogoutModule {
    @javax.inject.Singleton
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.session.LogoutObserver bindAuthNavigationCacheClearer(com.paypal.oslo.app.identity.AuthNavigationCacheClearer impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.session.LogoutCoordinator bindLogoutCoordinator(com.paypal.oslo.app.identity.LogoutCoordinatorImpl impl);
}
