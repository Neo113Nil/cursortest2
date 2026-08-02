package com.paypal.oslo.app.navigation.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/navigation/di/NavigationBindingsModule;", "", "Lcom/paypal/oslo/app/navigation/NavigationFlowProviderImpl;", "impl", "Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;", "bindNavigationFlowProvider", "(Lcom/paypal/oslo/app/navigation/NavigationFlowProviderImpl;)Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;", "Lcom/paypal/oslo/app/navigation/NavigationFlowSetter;", "bindNavigationFlowSetter", "(Lcom/paypal/oslo/app/navigation/NavigationFlowProviderImpl;)Lcom/paypal/oslo/app/navigation/NavigationFlowSetter;", "Lcom/paypal/oslo/app/navigation/NavigationConfigProviderImpl;", "Lcom/paypal/oslo/app/navigation/NavigationConfigProvider;", "bindNavigationConfigProvider", "(Lcom/paypal/oslo/app/navigation/NavigationConfigProviderImpl;)Lcom/paypal/oslo/app/navigation/NavigationConfigProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface NavigationBindingsModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.app.navigation.NavigationConfigProvider bindNavigationConfigProvider(com.paypal.oslo.app.navigation.NavigationConfigProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.app.navigation.NavigationFlowProvider bindNavigationFlowProvider(com.paypal.oslo.app.navigation.NavigationFlowProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.app.navigation.NavigationFlowSetter bindNavigationFlowSetter(com.paypal.oslo.app.navigation.NavigationFlowProviderImpl impl);
}
