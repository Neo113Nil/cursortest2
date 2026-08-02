package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class PostLoginSuccessDestinationModule_ProvidePostLoginDestinationFactory implements dagger.internal.Factory<androidx.navigation3.runtime.NavKey> {
    private final dagger.internal.Provider<com.paypal.oslo.app.di.PostLoginDestinationResolver> getHighResolutionOutputSizeshNQ4ISI;

    private PostLoginSuccessDestinationModule_ProvidePostLoginDestinationFactory(dagger.internal.Provider<com.paypal.oslo.app.di.PostLoginDestinationResolver> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.navigation3.runtime.NavKey get() {
        return providePostLoginDestination(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.di.PostLoginSuccessDestinationModule_ProvidePostLoginDestinationFactory create(dagger.internal.Provider<com.paypal.oslo.app.di.PostLoginDestinationResolver> provider) {
        return new com.paypal.oslo.app.di.PostLoginSuccessDestinationModule_ProvidePostLoginDestinationFactory(provider);
    }

    public static androidx.navigation3.runtime.NavKey providePostLoginDestination(com.paypal.oslo.app.di.PostLoginDestinationResolver postLoginDestinationResolver) {
        return (androidx.navigation3.runtime.NavKey) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.PostLoginSuccessDestinationModule.INSTANCE.providePostLoginDestination(postLoginDestinationResolver));
    }
}
