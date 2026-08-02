package com.paypal.oslo.app.pds.di;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/pds/di/PDSBindingsModule;", "", "Lcom/paypal/oslo/app/pds/PdsHighlightProviderImpl;", "impl", "Lcom/paypal/oslo/app/pds/PdsHighlightProvider;", "bindPdsHighlightProvider", "(Lcom/paypal/oslo/app/pds/PdsHighlightProviderImpl;)Lcom/paypal/oslo/app/pds/PdsHighlightProvider;", "Lcom/paypal/oslo/app/pds/PdsHighlightSetter;", "bindPdsHighlightSetter", "(Lcom/paypal/oslo/app/pds/PdsHighlightProviderImpl;)Lcom/paypal/oslo/app/pds/PdsHighlightSetter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface PDSBindingsModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.app.pds.PdsHighlightProvider bindPdsHighlightProvider(com.paypal.oslo.app.pds.PdsHighlightProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.app.pds.PdsHighlightSetter bindPdsHighlightSetter(com.paypal.oslo.app.pds.PdsHighlightProviderImpl impl);
}
