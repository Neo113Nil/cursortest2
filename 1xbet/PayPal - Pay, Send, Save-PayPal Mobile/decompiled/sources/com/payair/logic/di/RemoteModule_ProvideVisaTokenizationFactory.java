package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideVisaTokenizationFactory implements dagger.internal.Factory<com.payair.hce.visa.tokenization.VisaTokenization> {
    public static com.payair.logic.di.RemoteModule_ProvideVisaTokenizationFactory create() {
        return com.payair.logic.di.d.f4436a;
    }

    public static com.payair.hce.visa.tokenization.VisaTokenization provideVisaTokenization() {
        return (com.payair.hce.visa.tokenization.VisaTokenization) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideVisaTokenization());
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.hce.visa.tokenization.VisaTokenization get() {
        return provideVisaTokenization();
    }
}
