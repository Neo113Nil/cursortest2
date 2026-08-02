package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class NavigationModule_ProvideDefaultStartDestinationFactory implements dagger.internal.Factory<androidx.navigation3.runtime.NavKey> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.navigation3.runtime.NavKey get() {
        return provideDefaultStartDestination();
    }

    public static com.paypal.oslo.app.di.NavigationModule_ProvideDefaultStartDestinationFactory create() {
        return com.paypal.oslo.app.di.NavigationModule_ProvideDefaultStartDestinationFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.navigation3.runtime.NavKey provideDefaultStartDestination() {
        return (androidx.navigation3.runtime.NavKey) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.NavigationModule.INSTANCE.provideDefaultStartDestination());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.app.di.NavigationModule_ProvideDefaultStartDestinationFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.app.di.NavigationModule_ProvideDefaultStartDestinationFactory();

        private InstanceHolder() {
        }
    }
}
