package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class UtilsModule_ProvideCardPrioritySorterFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;

    private UtilsModule_ProvideCardPrioritySorterFactory(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter get() {
        return provideCardPrioritySorter(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.UtilsModule_ProvideCardPrioritySorterFactory create(dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider) {
        return new com.paypal.oslo.feature.taptopay.di.UtilsModule_ProvideCardPrioritySorterFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter provideCardPrioritySorter(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.UtilsModule.INSTANCE.provideCardPrioritySorter(coroutineDispatcher));
    }
}
