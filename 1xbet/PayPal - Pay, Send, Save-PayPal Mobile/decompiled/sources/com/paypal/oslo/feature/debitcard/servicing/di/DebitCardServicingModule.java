package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/DebitCardServicingModule;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/data/repository/DebitCardServicingRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "bindDebitCardRepository", "(Lcom/paypal/oslo/feature/debitcard/servicing/data/repository/DebitCardServicingRepositoryImpl;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/DebitCardServicingRepository;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/DebitCardWidgetProviderImpl;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;", "bindDebitCardWidgetProvider", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/DebitCardWidgetProviderImpl;)Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;", "Lcom/paypal/oslo/feature/debitcard/servicing/data/provider/DebitInstrumentProductDefinitionProviderImpl;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;", "bindDebitInstrumentProductDefinitionProvider", "(Lcom/paypal/oslo/feature/debitcard/servicing/data/provider/DebitInstrumentProductDefinitionProviderImpl;)Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface DebitCardServicingModule {
    @dagger.Binds
    com.paypal.oslo.feature.debitcard.servicing.domain.repository.DebitCardServicingRepository bindDebitCardRepository(com.paypal.oslo.feature.debitcard.servicing.data.repository.DebitCardServicingRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider bindDebitCardWidgetProvider(com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionProvider bindDebitInstrumentProductDefinitionProvider(com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl impl);
}
